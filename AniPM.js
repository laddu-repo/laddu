// @plugin-info {"id":"anipm","name":"AniPM","version":"1.0.0","description":"Anime with Sub & Dub from ani.pm","author":"raghav","icon_url":"https://www.google.com/s2/favicons?domain=ani.pm&sz=64","supported_types":["anime","movie"],"is_builtin":false}

// Ported from the AniPM CloudStream extension. Three sources feed the player:
// settlar (primary, with an optional burned-in subtitle channel), a multi audio
// beta server and a megaplay backup. The plugin runtime has no crypto built in,
// so the megaplay token handling ships its own aes and sha256 below.

const DEFAULT_URL = "https://ani.pm"
const SETTLAR_EMBED = "https://embed.settlar.io"
const SETTLAR_REFERER = "https://embed.settlar.io/"
const MEGAPLAY_REFERER = "https://megaplay.buzz/"
const FIREBASE_URL = "https://cloudstreampluginhelper-default-rtdb.firebaseio.com/.json"
const USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36"

let SITE = DEFAULT_URL

async function resolveSite() {
    try {
        const res = await fetch(FIREBASE_URL)
        if (res.ok) {
            const map = await res.json()
            const raw = map["anipm"] || map["anipm_url"] || map["anipm_domain"]
            const value = typeof raw === "number" ? String(raw) : raw
            if (value) SITE = value.replace(/\/+$/, "")
        }
    } catch (e) {}
    return SITE
}

async function fetchText(url, headers) {
    try {
        const res = await fetch(url, headers ? { headers: headers } : undefined)
        return { status: res.status, text: await res.text() }
    } catch (e) {
        return null
    }
}

async function getJson(url, referer) {
    const res = await fetchText(url, {
        "User-Agent": USER_AGENT,
        "Accept": "application/json",
        "Referer": referer || SITE + "/"
    })
    if (!res || res.status !== 200) return null
    try {
        return JSON.parse(res.text)
    } catch (e) {
        return null
    }
}

function absolute(url) {
    if (!url) return null
    return url.indexOf("http") === 0 ? url : SITE + url
}

function toInt(value) {
    const n = parseInt(value, 10)
    return isNaN(n) ? null : n
}

// unclaimed releases ride a 1_000_000 id offset, the series endpoint only answers to the anilist id
function usableId(id, anilistId) {
    if (id == null) return null
    if (id >= 1000000) {
        const anilist = toInt(anilistId)
        return anilist == null ? id : anilist
    }
    return id
}

async function loadSeries(id) {
    let series = await getJson(SITE + "/api/anime/series/" + id + "?routes=e3")
    if (!series && id >= 1000000) {
        series = await getJson(SITE + "/api/anime/series/" + (id - 1000000) + "?routes=e3")
    }
    return series
}

// anilist sourced titles only answer to the anilist provider, claimed ones to settlar
async function loadBootstrap(id, episode, channel) {
    const query = "?ep=" + episode + "&lang=" + channel + "&backup=1"
    return (await getJson(SITE + "/api/anime/playback-bootstrap/settlar/" + id + query)) ||
        (await getJson(SITE + "/api/anime/playback-bootstrap/anilist/" + id + query))
}

// the beta edge sometimes answers the first hit with a 5xx, so the master
// is asked for twice before the link goes to the player
async function betaMasterVerified(masterUrl, referer) {
    for (let attempt = 0; attempt < 2; attempt++) {
        const res = await fetchText(masterUrl, {
            "User-Agent": USER_AGENT,
            "Accept": "*/*",
            "Referer": referer
        })
        if (res && res.status === 200 && res.text.indexOf("#EXTM3U") === 0) return true
    }
    return false
}

async function search(query) {
    await resolveSite()
    query = (query || "").trim()
    if (query.length < 2) return "[]"

    const res = await getJson(SITE + "/api/anime/search?q=" + encodeURIComponent(query))
    const items = (res && res.items) || []
    const results = []
    for (const item of items) {
        const id = usableId(item.id, item.anilistId)
        if (id == null || !item.title) continue
        results.push({
            id: String(id),
            title: item.title,
            poster_url: absolute(item.poster),
            media_type: (item.type || "").toLowerCase() === "movie" ? "movie" : "anime",
            year: item.year || null,
            rating: item.score > 0 ? item.score : null,
            description: null
        })
    }
    return JSON.stringify(results)
}

function expandRanges(ranges) {
    const out = {}
    for (const range of ranges || []) {
        if (!range || range.length === 0) continue
        const start = range[0]
        const end = range.length > 1 ? range[1] : start
        if (start > 0 && end >= start) {
            for (let n = start; n <= end; n++) out[n] = true
        }
    }
    return out
}

const GENERIC_EPISODE_TITLE = /^Episode \d+(\.\d+)?$/

async function getEpisodes(showId) {
    await resolveSite()
    const id = toInt(String(showId).split("|").pop())
    if (id == null) return "[]"

    const series = await loadSeries(id)
    if (!series || !series.title) return "[]"

    const anilistId = series.anilistId || ""
    const malId = series.malId || ""

    let fillerRanges = null
    if (anilistId) {
        fillerRanges = await getJson(SITE + "/api/anime/filler?anilistId=" + encodeURIComponent(anilistId) +
            "&title=" + encodeURIComponent(series.title))
    }
    const fillerNumbers = expandRanges(fillerRanges && fillerRanges.ranges && fillerRanges.ranges.filler)
    const mixedNumbers = expandRanges(fillerRanges && fillerRanges.ranges && fillerRanges.ranges.mixed)

    let packages = null
    if (anilistId) {
        packages = await getJson(SITE + "/api/anime/anipm-server/_packages?anilistId=" + encodeURIComponent(anilistId))
    }
    const packageEpisodes = (packages && packages.episodes) || {}

    // the bootstrap call wants the id the series response names, which is
    // not the url id when an offset id had to be retried
    const seriesId = series.id != null ? series.id : id

    const bothChannels = (series.subCount || 0) > 0 && (series.dubCount || 0) > 0
    const out = []
    for (const ep of series.episodes || []) {
        const number = ep.number
        if (number == null || number < 1) continue
        const mark = fillerNumbers[number] ? " (Filler)" : mixedNumbers[number] ? " (Mixed)" : ""
        const realName = ep.title && !GENERIC_EPISODE_TITLE.test(ep.title) ? ep.title : null
        const baseName = (realName ? realName : "Episode " + number) + mark
        const pkg = packageEpisodes[String(number)]

        if (ep.sub === true) {
            out.push({
                id: [seriesId, number, "sub", pkg && pkg.subhard === true ? "hs" : "", anilistId, malId].join("|"),
                title: bothChannels ? baseName + " (Sub)" : baseName,
                season: null,
                episode_number: number,
                thumbnail_url: absolute(ep.thumbnail),
                description: ep.description || null
            })
        }
        if (ep.dub === true) {
            out.push({
                id: [seriesId, number, "dub", pkg && pkg.dubhard === true ? "hs" : "", anilistId, malId].join("|"),
                title: bothChannels ? baseName + " (Dub)" : baseName,
                season: null,
                episode_number: number,
                thumbnail_url: absolute(ep.thumbnail),
                description: ep.description || null
            })
        }
    }
    return JSON.stringify(out)
}

async function getStreams(mediaId) {
    await resolveSite()
    mediaId = String(mediaId)
    if (mediaId.indexOf("|") >= 0) return await episodeStreams(mediaId)
    return await movieStreams(mediaId)
}

async function episodeStreams(mediaId) {
    const parts = mediaId.split("|")
    if (parts.length < 4) return "[]"
    const seriesId = toInt(parts[0])
    const episode = toInt(parts[1])
    if (seriesId == null || episode == null) return "[]"
    const channel = parts[2] === "dub" ? "dub" : "sub"
    const hardAvailable = parts[3] === "hs"
    const anilistId = parts[4] || ""
    const malId = parts[5] || ""

    const bootstrap = await loadBootstrap(seriesId, episode, channel)
    const selection = bootstrap && bootstrap.settlarSelection

    const streams = []
    const seenLinks = {}
    const seenSubUrls = {}
    const seenSubLabels = {}

    await emitSettlar(selection, episode, channel, "", streams, seenLinks, seenSubUrls, seenSubLabels)
    // burned in subtitle channel, only a handful of titles carry it
    if (hardAvailable) {
        await emitSettlar(selection, episode, channel + "hard", " Hardsub", streams, seenLinks, seenSubUrls, seenSubLabels)
    }
    if (anilistId) {
        await emitBeta(anilistId, episode, channel, streams, seenLinks)
    }
    await emitBackup(bootstrap && bootstrap.backupEmbed, anilistId, malId, episode, channel, streams, seenLinks, seenSubUrls, seenSubLabels)
    return JSON.stringify(streams)
}

async function movieStreams(mediaId) {
    const id = toInt(mediaId)
    if (id == null) return "[]"

    const series = await loadSeries(id)
    if (!series || !series.title) return "[]"

    const anilistId = series.anilistId || ""
    const malId = series.malId || ""
    const seriesId = series.id != null ? series.id : id
    const episodes = series.episodes || []
    const first = episodes.length > 0 ? episodes[0] : null
    const episode = first && first.number != null ? first.number : 1
    const subAvailable = first ? first.sub === true : true
    const dubAvailable = first ? first.dub === true : series.hasDub === true

    const streams = []
    const seenLinks = {}
    const seenSubUrls = {}
    const seenSubLabels = {}

    for (const channel of ["sub", "dub"]) {
        if (channel === "sub" && !subAvailable) continue
        if (channel === "dub" && !dubAvailable) continue

        const bootstrap = await loadBootstrap(seriesId, episode, channel)
        const selection = bootstrap && bootstrap.settlarSelection

        await emitSettlar(selection, episode, channel, "", streams, seenLinks, seenSubUrls, seenSubLabels)
        if (anilistId) {
            await emitBeta(anilistId, episode, channel, streams, seenLinks)
        }
        await emitBackup(bootstrap && bootstrap.backupEmbed, anilistId, malId, episode, channel, streams, seenLinks, seenSubUrls, seenSubLabels)
    }
    return JSON.stringify(streams)
}

async function emitSettlar(selection, episode, channel, labelSuffix, streams, seenLinks, seenSubUrls, seenSubLabels) {
    if (!selection) return

    const session = await getJson(SITE + "/api/anime/settlar/session?selection=" + encodeURIComponent(selection) +
        "&provider=anipm&ep=" + episode + "&channel=" + channel + "&telemetry=0")
    const embedUrl = session && session.embedUrl
    const tokenMatch = embedUrl ? /t=([^&]+)/.exec(embedUrl) : null
    if (!tokenMatch) return

    const stream = await getJson(SETTLAR_EMBED + "/api/embed/session?t=" + tokenMatch[1], SETTLAR_EMBED + "/embed/v1")
    if (!stream || !stream.source || stream.source.indexOf("http") !== 0) return

    const playHeaders = { "User-Agent": USER_AGENT, "Referer": SETTLAR_REFERER }
    const subtitles = []
    for (const sub of stream.subtitles || []) {
        if (!sub.url || sub.url.indexOf("http") !== 0) continue
        if (seenSubUrls[sub.url]) continue
        const label = (sub.label || "").trim()
        if (label && seenSubLabels[label.toLowerCase()]) continue
        seenSubUrls[sub.url] = true
        if (label) seenSubLabels[label.toLowerCase()] = true
        subtitles.push({
            url: sub.url,
            language: sub.srclang || label || "en",
            label: label || sub.srclang || "Subtitle"
        })
    }

    if (seenLinks[stream.source]) return
    seenLinks[stream.source] = true
    const channelTag = channel.indexOf("dub") === 0 ? "DUB" : "SUB"
    streams.push({
        url: stream.source,
        quality: channelTag + labelSuffix,
        format: "hls",
        subtitles: subtitles,
        headers: playHeaders
    })
}

// the beta server's single master carries an audio rendition per language,
// so one link serves every track and the player picks the audio
async function emitBeta(anilistId, episode, channel, streams, seenLinks) {
    const info = await getJson(SITE + "/api/anime/beta-server/" + anilistId)
    if (!info || info.available !== true) return
    if ((info.episodes || []).indexOf(episode) === -1) return
    if (channel === "dub" && info.dub !== true) return
    if (channel === "sub" && info.sub !== true) return

    // /watch/{slug}-{id} flips into /hls/{id}-{slug}/E####/master.m3u8
    const path = info.path || ""
    if (path.indexOf("/watch/") !== 0 || !info.origin) return
    const tail = path.slice("/watch/".length)
    const split = tail.lastIndexOf("-")
    if (split <= 0) return
    const origin = info.origin.replace(/\/+$/, "")
    const masterUrl = origin + "/hls/" + tail.slice(split + 1) + "-" + tail.slice(0, split) +
        "/E" + pad4(episode) + "/master.m3u8"

    if (!(await betaMasterVerified(masterUrl, origin + "/"))) return
    if (seenLinks[masterUrl]) return
    seenLinks[masterUrl] = true

    streams.push({
        url: masterUrl,
        quality: "Multi-audio",
        format: "hls",
        subtitles: [],
        headers: { "User-Agent": USER_AGENT, "Referer": origin + "/" }
    })
}

function pad4(n) {
    let s = String(n)
    while (s.length < 4) s = "0" + s
    return s
}

// megaplay also serves ani and mal style addresses when the site lists no backup
async function emitBackup(backupEmbed, anilistId, malId, episode, channel, streams, seenLinks, seenSubUrls, seenSubLabels) {
    const candidates = []
    if (backupEmbed && backupEmbed.available === true && (backupEmbed.url || "").indexOf("http") === 0) {
        candidates.push(backupEmbed.url)
    }
    if (anilistId) candidates.push("https://megaplay.buzz/stream/ani/" + anilistId + "/" + episode + "/" + channel)
    if (malId) candidates.push("https://megaplay.buzz/stream/mal/" + malId + "/" + episode + "/" + channel)

    const playHeaders = { "User-Agent": USER_AGENT, "Referer": MEGAPLAY_REFERER }
    const channelTag = channel === "dub" ? "DUB" : "SUB"

    for (const embedUrl of candidates) {
        const stream = await resolveMegaStream(embedUrl, SITE + "/")
        if (!stream) continue
        await emitMegaVariants(stream.m3u8, channelTag, playHeaders, streams, seenLinks, stream.subtitles, seenSubUrls, seenSubLabels)
        return
    }
}

async function resolveMegaStream(embedUrl, referer) {
    const hostMatch = /https?:\/\/([^/]+)/.exec(embedUrl)
    if (!hostMatch) return null
    const host = hostMatch[1]

    const page = await fetchText(embedUrl, { "User-Agent": USER_AGENT, "Referer": referer })
    if (!page) return null
    const html = page.text

    const idMatch = /data-id=["'](\d+)/.exec(html) ||
        /data-realid=["'](\d+)/.exec(html) ||
        /\/stream\/s-\d+\/(\d+)\//.exec(embedUrl)
    if (!idMatch) return null
    const streamId = idMatch[1]

    const audioMatch = /\/(dub|sub)(?:[/?#]|$)/.exec(embedUrl) ||
        /type\s*:\s*['"](dub|sub)['"]/.exec(html)
    const audioType = audioMatch ? audioMatch[1] : "sub"

    const altHost = /data-domain=["']([^"']+)["']/.exec(html)
    const hosts = [host]
    if (altHost && altHost[1] !== host) hosts.push(altHost[1])

    for (const apiHost of hosts) {
        const base = "https://" + apiHost
        const ajaxHeaders = {
            "User-Agent": USER_AGENT,
            "Accept": "*/*",
            "X-Requested-With": "XMLHttpRequest",
            "Origin": base,
            "Referer": embedUrl
        }
        for (const endpoint of ["getSourcesNew", "getSources"]) {
            const res = await fetchText(base + "/stream/" + endpoint + "?id=" + streamId + "&type=" + audioType, ajaxHeaders)
            if (!res || res.status !== 200) continue
            let root = null
            try {
                root = JSON.parse(res.text)
            } catch (e) {
                continue
            }
            const streamUrl = await megaStreamUrl(root, base)
            if (streamUrl) return { m3u8: streamUrl, subtitles: megaSubtitles(root) }
        }
    }
    return null
}

async function megaStreamUrl(root, base) {
    const sources = root.sources
    let plain = null
    if (Array.isArray(sources)) {
        plain = sources.length > 0 && sources[0] ? sources[0].file : null
    } else if (sources) {
        plain = sources.file
    }
    if (plain) return plain
    if (root.enc) return await megaDecrypt(root.enc, base)
    return null
}

function megaSubtitles(root) {
    const out = []
    for (const track of root.tracks || []) {
        if (track.kind !== "captions" && track.kind !== "subtitles") continue
        if (!track.file) continue
        const label = track.label || "English"
        out.push({ url: track.file, language: subtitleCode(label), label: label })
    }
    return out
}

const SUBTITLE_CODES = {
    english: "en", spanish: "es", french: "fr", german: "de", portuguese: "pt",
    arabic: "ar", hindi: "hi", japanese: "ja", russian: "ru", italian: "it",
    indonesian: "id", korean: "ko", chinese: "zh", thai: "th", turkish: "tr"
}

function subtitleCode(label) {
    const key = (label || "").toLowerCase()
    if (SUBTITLE_CODES[key]) return SUBTITLE_CODES[key]
    for (const name in SUBTITLE_CODES) {
        if (key.indexOf(name) === 0) return SUBTITLE_CODES[name]
    }
    return label
}

async function emitMegaVariants(m3u8, channelTag, playHeaders, streams, seenLinks, subtitles, seenSubUrls, seenSubLabels) {
    const subTracks = []
    for (const sub of subtitles || []) {
        if (seenSubUrls[sub.url]) continue
        if (seenSubLabels[sub.label.toLowerCase()]) continue
        seenSubUrls[sub.url] = true
        seenSubLabels[sub.label.toLowerCase()] = true
        subTracks.push(sub)
    }

    const res = await fetchText(signMegaUrl(m3u8), playHeaders)
    const variants = res ? parseVariants(m3u8, res.text) : []

    // codec-less variants crash some players at track selection, so each quality goes out as its own playlist
    if (variants.length === 0) {
        if (seenLinks[m3u8]) return
        seenLinks[m3u8] = true
        streams.push({
            url: signMegaUrl(m3u8),
            quality: channelTag + " auto",
            format: m3u8.indexOf(".mp4") !== -1 ? "mp4" : "hls",
            subtitles: subTracks,
            headers: playHeaders
        })
        return
    }
    for (const variant of variants) {
        if (seenLinks[variant.url]) continue
        seenLinks[variant.url] = true
        streams.push({
            url: signMegaUrl(variant.url),
            quality: channelTag + (variant.quality ? " " + variant.quality + "p" : " auto"),
            format: "hls",
            subtitles: subTracks,
            headers: playHeaders
        })
    }
}

function parseVariants(masterUrl, masterText) {
    let path = masterUrl
    const cut = path.indexOf("?")
    if (cut !== -1) path = path.slice(0, cut)
    const lastSlash = path.lastIndexOf("/")
    if (lastSlash !== -1) path = path.slice(0, lastSlash)
    const base = path + "/"

    const lines = masterText.split("\n")
    const out = []
    for (let i = 0; i < lines.length; i++) {
        const line = lines[i].trim()
        if (line.indexOf("#EXT-X-STREAM-INF:") !== 0) continue
        const res = /RESOLUTION=(\d+)x(\d+)/.exec(line)
        const quality = res ? toInt(res[2]) : null
        let j = i + 1
        while (j < lines.length) {
            const next = lines[j].trim()
            if (next !== "" && next.charAt(0) !== "#") break
            j++
        }
        if (j < lines.length) {
            const uri = lines[j].trim()
            if (uri !== "") {
                out.push({ url: uri.indexOf("http") === 0 ? uri : base + uri, quality: quality })
                i = j
            }
        }
    }
    return out
}

const MEGA_TOKEN_KEY = "MpCdnT0k3n!9f2K#xQ7vL5mR8wN1pY4s"

function signMegaUrl(url) {
    const m = /\/([a-f0-9]{32})\/([a-f0-9]{32})\//i.exec(url)
    if (!m) return url
    const expires = Math.floor(Date.now() / 1000) + 7 * 24 * 60 * 60
    const payload = expires + "|" + m[1].toLowerCase() + "/" + m[2].toLowerCase()
    const token = b64Url(utf8Encode(payload)) + "." + b64Url(hmacSha256(utf8Encode(MEGA_TOKEN_KEY), utf8Encode(payload)))
    return url + (url.indexOf("?") === -1 ? "?" : "&") + "token=" + token
}

async function megaDecrypt(enc, base) {
    for (const seeds of await megaSeeds(base)) {
        const plain = aesCbcDecryptUtf8(enc, seeds[0], seeds[1])
        if (plain == null) continue
        const fileMatch = /"file"\s*:\s*"([^"]+)"/.exec(plain)
        if (fileMatch) return fileMatch[1]
    }
    return null
}

async function megaSeeds(base) {
    const fallback = [["i?LMTAx0Q6,:}50U", "W0;27ToaUpl_P%'c"]]
    const res = await fetchText(base + "/lib/newclient.min.js", { "User-Agent": USER_AGENT })
    if (res) {
        const m = /[A-Za-z]\w*="([^"]{16})",[A-Za-z]\w*="([^"]{16})"/.exec(res.text)
        if (m) return [[m[1], m[2]]].concat(fallback)
    }
    return fallback
}

function aesCbcDecryptUtf8(enc, keySeed, ivSeed) {
    const data = b64ToBytes(enc)
    if (data.length === 0 || data.length % 16 !== 0) return null

    const key = new Array(32).fill(0)
    const iv = new Array(16).fill(0)
    const keyBytes = utf8Encode(keySeed)
    const ivBytes = utf8Encode(ivSeed)
    for (let i = 0; i < keyBytes.length && i < 32; i++) key[i] = keyBytes[i]
    for (let i = 0; i < ivBytes.length && i < 16; i++) iv[i] = ivBytes[i]

    const words = aesExpandKey(key)
    const out = []
    let prev = iv
    for (let offset = 0; offset + 16 <= data.length; offset += 16) {
        const block = data.slice(offset, offset + 16)
        const plain = aesDecryptBlock(words, block)
        for (let i = 0; i < 16; i++) out.push(plain[i] ^ prev[i])
        prev = block
    }

    const pad = out[out.length - 1]
    if (pad < 1 || pad > 16) return null
    for (let i = out.length - pad; i < out.length; i++) {
        if (out[i] !== pad) return null
    }
    return utf8Decode(out.slice(0, out.length - pad))
}

// ---------------------------------------------------------------------------
// small crypto stack for the megaplay backup: base64, sha256, hmac, aes-256
// ---------------------------------------------------------------------------

const B64_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

function b64ToBytes(text) {
    const clean = text.replace(/-/g, "+").replace(/_/g, "/").replace(/=+$/, "")
    const out = []
    let buffer = 0
    let bits = 0
    for (let i = 0; i < clean.length; i++) {
        const value = B64_ALPHABET.indexOf(clean.charAt(i))
        if (value === -1) continue
        buffer = (buffer << 6) | value
        bits += 6
        if (bits >= 8) {
            bits -= 8
            out.push((buffer >> bits) & 0xff)
        }
    }
    return out
}

function b64Url(bytes) {
    let out = ""
    for (let i = 0; i < bytes.length; i += 3) {
        const b0 = bytes[i]
        const b1 = i + 1 < bytes.length ? bytes[i + 1] : 0
        const b2 = i + 2 < bytes.length ? bytes[i + 2] : 0
        out += B64_ALPHABET.charAt(b0 >> 2)
        out += B64_ALPHABET.charAt(((b0 & 3) << 4) | (b1 >> 4))
        if (i + 1 < bytes.length) out += B64_ALPHABET.charAt(((b1 & 15) << 2) | (b2 >> 6))
        if (i + 2 < bytes.length) out += B64_ALPHABET.charAt(b2 & 63)
    }
    return out.replace(/\+/g, "-").replace(/\//g, "_")
}

function utf8Encode(str) {
    const out = []
    for (let i = 0; i < str.length; i++) {
        let code = str.charCodeAt(i)
        if (code >= 0xd800 && code <= 0xdbff && i + 1 < str.length) {
            const low = str.charCodeAt(i + 1)
            if (low >= 0xdc00 && low <= 0xdfff) {
                code = 0x10000 + ((code - 0xd800) << 10) + (low - 0xdc00)
                i++
            }
        }
        if (code < 0x80) {
            out.push(code)
        } else if (code < 0x800) {
            out.push(0xc0 | (code >> 6), 0x80 | (code & 63))
        } else if (code < 0x10000) {
            out.push(0xe0 | (code >> 12), 0x80 | ((code >> 6) & 63), 0x80 | (code & 63))
        } else {
            out.push(0xf0 | (code >> 18), 0x80 | ((code >> 12) & 63), 0x80 | ((code >> 6) & 63), 0x80 | (code & 63))
        }
    }
    return out
}

function utf8Decode(bytes) {
    let out = ""
    for (let i = 0; i < bytes.length;) {
        const b = bytes[i]
        let code
        if (b < 0x80) {
            code = b
            i += 1
        } else if (b < 0xe0) {
            code = ((b & 31) << 6) | (bytes[i + 1] & 63)
            i += 2
        } else if (b < 0xf0) {
            code = ((b & 15) << 12) | ((bytes[i + 1] & 63) << 6) | (bytes[i + 2] & 63)
            i += 3
        } else {
            code = ((b & 7) << 18) | ((bytes[i + 1] & 63) << 12) | ((bytes[i + 2] & 63) << 6) | (bytes[i + 3] & 63)
            i += 4
        }
        if (code > 0xffff) {
            code -= 0x10000
            out += String.fromCharCode(0xd800 + (code >> 10), 0xdc00 + (code & 0x3ff))
        } else {
            out += String.fromCharCode(code)
        }
    }
    return out
}

const SHA_K = [
    0x428a2f98, 0x71374491, 0xb5c0fbcf, 0xe9b5dba5, 0x3956c25b, 0x59f111f1, 0x923f82a4, 0xab1c5ed5,
    0xd807aa98, 0x12835b01, 0x243185be, 0x550c7dc3, 0x72be5d74, 0x80deb1fe, 0x9bdc06a7, 0xc19bf174,
    0xe49b69c1, 0xefbe4786, 0x0fc19dc6, 0x240ca1cc, 0x2de92c6f, 0x4a7484aa, 0x5cb0a9dc, 0x76f988da,
    0x983e5152, 0xa831c66d, 0xb00327c8, 0xbf597fc7, 0xc6e00bf3, 0xd5a79147, 0x06ca6351, 0x14292967,
    0x27b70a85, 0x2e1b2138, 0x4d2c6dfc, 0x53380d13, 0x650a7354, 0x766a0abb, 0x81c2c92e, 0x92722c85,
    0xa2bfe8a1, 0xa81a664b, 0xc24b8b70, 0xc76c51a3, 0xd192e819, 0xd6990624, 0xf40e3585, 0x106aa070,
    0x19a4c116, 0x1e376c08, 0x2748774c, 0x34b0bcb5, 0x391c0cb3, 0x4ed8aa4a, 0x5b9cca4f, 0x682e6ff3,
    0x748f82ee, 0x78a5636f, 0x84c87814, 0x8cc70208, 0x90befffa, 0xa4506ceb, 0xbef9a3f7, 0xc67178f2
]

function rotr(x, n) {
    return (x >>> n) | (x << (32 - n))
}

function sha256(bytes) {
    const h = [0x6a09e667, 0xbb67ae85, 0x3c6ef372, 0xa54ff53a, 0x510e527f, 0x9b05688c, 0x1f83d9ab, 0x5be0cd19]

    const bitLen = bytes.length * 8
    const data = bytes.slice()
    data.push(0x80)
    while (data.length % 64 !== 56) data.push(0)
    // 64 bit length, high word first, message sizes here stay far below 2^32 bits
    data.push(0, 0, 0, 0, (bitLen >>> 24) & 0xff, (bitLen >>> 16) & 0xff, (bitLen >>> 8) & 0xff, bitLen & 0xff)

    const w = new Array(64)
    for (let offset = 0; offset < data.length; offset += 64) {
        for (let i = 0; i < 16; i++) {
            const o = offset + i * 4
            w[i] = (data[o] << 24) | (data[o + 1] << 16) | (data[o + 2] << 8) | data[o + 3]
        }
        for (let i = 16; i < 64; i++) {
            const s0 = rotr(w[i - 15], 7) ^ rotr(w[i - 15], 18) ^ (w[i - 15] >>> 3)
            const s1 = rotr(w[i - 2], 17) ^ rotr(w[i - 2], 19) ^ (w[i - 2] >>> 10)
            w[i] = (w[i - 16] + s0 + w[i - 7] + s1) | 0
        }

        let a = h[0], b = h[1], c = h[2], d = h[3], e = h[4], f = h[5], g = h[6], hh = h[7]
        for (let i = 0; i < 64; i++) {
            const s1 = rotr(e, 6) ^ rotr(e, 11) ^ rotr(e, 25)
            const ch = (e & f) ^ (~e & g)
            const t1 = (hh + s1 + ch + SHA_K[i] + w[i]) | 0
            const s0 = rotr(a, 2) ^ rotr(a, 13) ^ rotr(a, 22)
            const maj = (a & b) ^ (a & c) ^ (b & c)
            const t2 = (s0 + maj) | 0
            hh = g
            g = f
            f = e
            e = (d + t1) | 0
            d = c
            c = b
            b = a
            a = (t1 + t2) | 0
        }
        h[0] = (h[0] + a) | 0
        h[1] = (h[1] + b) | 0
        h[2] = (h[2] + c) | 0
        h[3] = (h[3] + d) | 0
        h[4] = (h[4] + e) | 0
        h[5] = (h[5] + f) | 0
        h[6] = (h[6] + g) | 0
        h[7] = (h[7] + hh) | 0
    }

    const out = []
    for (let i = 0; i < 8; i++) {
        out.push((h[i] >>> 24) & 0xff, (h[i] >>> 16) & 0xff, (h[i] >>> 8) & 0xff, h[i] & 0xff)
    }
    return out
}

function hmacSha256(key, message) {
    if (key.length > 64) key = sha256(key)
    const block = key.slice()
    while (block.length < 64) block.push(0)
    const inner = []
    const outer = []
    for (let i = 0; i < 64; i++) {
        inner.push(block[i] ^ 0x36)
        outer.push(block[i] ^ 0x5c)
    }
    return sha256(outer.concat(sha256(inner.concat(message))))
}

const AES_SBOX = [
    0x63, 0x7c, 0x77, 0x7b, 0xf2, 0x6b, 0x6f, 0xc5, 0x30, 0x01, 0x67, 0x2b, 0xfe, 0xd7, 0xab, 0x76,
    0xca, 0x82, 0xc9, 0x7d, 0xfa, 0x59, 0x47, 0xf0, 0xad, 0xd4, 0xa2, 0xaf, 0x9c, 0xa4, 0x72, 0xc0,
    0xb7, 0xfd, 0x93, 0x26, 0x36, 0x3f, 0xf7, 0xcc, 0x34, 0xa5, 0xe5, 0xf1, 0x71, 0xd8, 0x31, 0x15,
    0x04, 0xc7, 0x23, 0xc3, 0x18, 0x96, 0x05, 0x9a, 0x07, 0x12, 0x80, 0xe2, 0xeb, 0x27, 0xb2, 0x75,
    0x09, 0x83, 0x2c, 0x1a, 0x1b, 0x6e, 0x5a, 0xa0, 0x52, 0x3b, 0xd6, 0xb3, 0x29, 0xe3, 0x2f, 0x84,
    0x53, 0xd1, 0x00, 0xed, 0x20, 0xfc, 0xb1, 0x5b, 0x6a, 0xcb, 0xbe, 0x39, 0x4a, 0x4c, 0x58, 0xcf,
    0xd0, 0xef, 0xaa, 0xfb, 0x43, 0x4d, 0x33, 0x85, 0x45, 0xf9, 0x02, 0x7f, 0x50, 0x3c, 0x9f, 0xa8,
    0x51, 0xa3, 0x40, 0x8f, 0x92, 0x9d, 0x38, 0xf5, 0xbc, 0xb6, 0xda, 0x21, 0x10, 0xff, 0xf3, 0xd2,
    0xcd, 0x0c, 0x13, 0xec, 0x5f, 0x97, 0x44, 0x17, 0xc4, 0xa7, 0x7e, 0x3d, 0x64, 0x5d, 0x19, 0x73,
    0x60, 0x81, 0x4f, 0xdc, 0x22, 0x2a, 0x90, 0x88, 0x46, 0xee, 0xb8, 0x14, 0xde, 0x5e, 0x0b, 0xdb,
    0xe0, 0x32, 0x3a, 0x0a, 0x49, 0x06, 0x24, 0x5c, 0xc2, 0xd3, 0xac, 0x62, 0x91, 0x95, 0xe4, 0x79,
    0xe7, 0xc8, 0x37, 0x6d, 0x8d, 0xd5, 0x4e, 0xa9, 0x6c, 0x56, 0xf4, 0xea, 0x65, 0x7a, 0xae, 0x08,
    0xba, 0x78, 0x25, 0x2e, 0x1c, 0xa6, 0xb4, 0xc6, 0xe8, 0xdd, 0x74, 0x1f, 0x4b, 0xbd, 0x8b, 0x8a,
    0x70, 0x3e, 0xb5, 0x66, 0x48, 0x03, 0xf6, 0x0e, 0x61, 0x35, 0x57, 0xb9, 0x86, 0xc1, 0x1d, 0x9e,
    0xe1, 0xf8, 0x98, 0x11, 0x69, 0xd9, 0x8e, 0x94, 0x9b, 0x1e, 0x87, 0xe9, 0xce, 0x55, 0x28, 0xdf,
    0x8c, 0xa1, 0x89, 0x0d, 0xbf, 0xe6, 0x42, 0x68, 0x41, 0x99, 0x2d, 0x0f, 0xb0, 0x54, 0xbb, 0x16
]

const AES_INV_SBOX = [
    0x52, 0x09, 0x6a, 0xd5, 0x30, 0x36, 0xa5, 0x38, 0xbf, 0x40, 0xa3, 0x9e, 0x81, 0xf3, 0xd7, 0xfb,
    0x7c, 0xe3, 0x39, 0x82, 0x9b, 0x2f, 0xff, 0x87, 0x34, 0x8e, 0x43, 0x44, 0xc4, 0xde, 0xe9, 0xcb,
    0x54, 0x7b, 0x94, 0x32, 0xa6, 0xc2, 0x23, 0x3d, 0xee, 0x4c, 0x95, 0x0b, 0x42, 0xfa, 0xc3, 0x4e,
    0x08, 0x2e, 0xa1, 0x66, 0x28, 0xd9, 0x24, 0xb2, 0x76, 0x5b, 0xa2, 0x49, 0x6d, 0x8b, 0xd1, 0x25,
    0x72, 0xf8, 0xf6, 0x64, 0x86, 0x68, 0x98, 0x16, 0xd4, 0xa4, 0x5c, 0xcc, 0x5d, 0x65, 0xb6, 0x92,
    0x6c, 0x70, 0x48, 0x50, 0xfd, 0xed, 0xb9, 0xda, 0x5e, 0x15, 0x46, 0x57, 0xa7, 0x8d, 0x9d, 0x84,
    0x90, 0xd8, 0xab, 0x00, 0x8c, 0xbc, 0xd3, 0x0a, 0xf7, 0xe4, 0x58, 0x05, 0xb8, 0xb3, 0x45, 0x06,
    0xd0, 0x2c, 0x1e, 0x8f, 0xca, 0x3f, 0x0f, 0x02, 0xc1, 0xaf, 0xbd, 0x03, 0x01, 0x13, 0x8a, 0x6b,
    0x3a, 0x91, 0x11, 0x41, 0x4f, 0x67, 0xdc, 0xea, 0x97, 0xf2, 0xcf, 0xce, 0xf0, 0xb4, 0xe6, 0x73,
    0x96, 0xac, 0x74, 0x22, 0xe7, 0xad, 0x35, 0x85, 0xe2, 0xf9, 0x37, 0xe8, 0x1c, 0x75, 0xdf, 0x6e,
    0x47, 0xf1, 0x1a, 0x71, 0x1d, 0x29, 0xc5, 0x89, 0x6f, 0xb7, 0x62, 0x0e, 0xaa, 0x18, 0xbe, 0x1b,
    0xfc, 0x56, 0x3e, 0x4b, 0xc6, 0xd2, 0x79, 0x20, 0x9a, 0xdb, 0xc0, 0xfe, 0x78, 0xcd, 0x5a, 0xf4,
    0x1f, 0xdd, 0xa8, 0x33, 0x88, 0x07, 0xc7, 0x31, 0xb1, 0x12, 0x10, 0x59, 0x27, 0x80, 0xec, 0x5f,
    0x60, 0x51, 0x7f, 0xa9, 0x19, 0xb5, 0x4a, 0x0d, 0x2d, 0xe5, 0x7a, 0x9f, 0x93, 0xc9, 0x9c, 0xef,
    0xa0, 0xe0, 0x3b, 0x4d, 0xae, 0x2a, 0xf5, 0xb0, 0xc8, 0xeb, 0xbb, 0x3c, 0x83, 0x53, 0x99, 0x61,
    0x17, 0x2b, 0x04, 0x7e, 0xba, 0x77, 0xd6, 0x26, 0xe1, 0x69, 0x14, 0x63, 0x55, 0x21, 0x0c, 0x7d
]

function aesSubWord(word) {
    return ((AES_SBOX[(word >>> 24) & 0xff] << 24) | (AES_SBOX[(word >>> 16) & 0xff] << 16) |
        (AES_SBOX[(word >>> 8) & 0xff] << 8) | AES_SBOX[word & 0xff]) | 0
}

function aesExpandKey(key) {
    const words = new Array(60)
    for (let i = 0; i < 8; i++) {
        words[i] = ((key[i * 4] << 24) | (key[i * 4 + 1] << 16) | (key[i * 4 + 2] << 8) | key[i * 4 + 3]) | 0
    }
    let rcon = 1
    for (let i = 8; i < 60; i++) {
        let temp = words[i - 1]
        if (i % 8 === 0) {
            temp = ((temp << 8) | (temp >>> 24)) & 0xffffffff
            temp = (aesSubWord(temp) ^ (rcon << 24)) | 0
            rcon = (rcon << 1) ^ (rcon >= 0x80 ? 0x1b : 0)
        } else if (i % 8 === 4) {
            temp = aesSubWord(temp)
        }
        words[i] = (words[i - 8] ^ temp) | 0
    }
    return words
}

function aesAddRoundKey(s, words, offset) {
    for (let c = 0; c < 4; c++) {
        const word = words[offset + c]
        for (let r = 0; r < 4; r++) {
            s[r + 4 * c] ^= (word >>> (24 - 8 * r)) & 0xff
        }
    }
}

function aesInvShiftRows(s) {
    const t = s.slice()
    for (let r = 0; r < 4; r++) {
        for (let c = 0; c < 4; c++) {
            s[r + 4 * c] = t[r + 4 * ((c + 4 - r) % 4)]
        }
    }
}

function gmul(a, b) {
    let p = 0
    for (let i = 0; i < 8; i++) {
        if (b & 1) p ^= a
        const hi = a & 0x80
        a = (a << 1) & 0xff
        if (hi) a ^= 0x1b
        b >>= 1
    }
    return p
}

function aesInvMixColumns(s) {
    for (let c = 0; c < 4; c++) {
        const o = 4 * c
        const a0 = s[o], a1 = s[o + 1], a2 = s[o + 2], a3 = s[o + 3]
        s[o] = gmul(a0, 14) ^ gmul(a1, 11) ^ gmul(a2, 13) ^ gmul(a3, 9)
        s[o + 1] = gmul(a0, 9) ^ gmul(a1, 14) ^ gmul(a2, 11) ^ gmul(a3, 13)
        s[o + 2] = gmul(a0, 13) ^ gmul(a1, 9) ^ gmul(a2, 14) ^ gmul(a3, 11)
        s[o + 3] = gmul(a0, 11) ^ gmul(a1, 13) ^ gmul(a2, 9) ^ gmul(a3, 14)
    }
}

function aesDecryptBlock(words, block) {
    const s = block.slice()
    aesAddRoundKey(s, words, 56)
    for (let round = 13; round >= 1; round--) {
        aesInvShiftRows(s)
        for (let i = 0; i < 16; i++) s[i] = AES_INV_SBOX[s[i]]
        aesAddRoundKey(s, words, round * 4)
        aesInvMixColumns(s)
    }
    aesInvShiftRows(s)
    for (let i = 0; i < 16; i++) s[i] = AES_INV_SBOX[s[i]]
    aesAddRoundKey(s, words, 0)
    return s
}

// lets the plugin run under plain node for testing, the app runtime has no module
if (typeof module !== "undefined" && module.exports) {
    module.exports = { search: search, getEpisodes: getEpisodes, getStreams: getStreams }
}
