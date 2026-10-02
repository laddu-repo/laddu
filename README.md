# laddu — CloudStream Extensions

Mostly anime extensions for [CloudStream](https://github.com/recloudstream/cloudstream) (Sub & Dub).

## 📥 How to install this repository in CloudStream

1. Open **CloudStream → Settings → Extensions → Add repository**
2. Paste **exactly** this URL and press OK:

```
https://raw.githubusercontent.com/laddu-repo/laddu/builds/repo.json
```

**Tip (auto-fill):** copy the line below, then open the *Add repository* dialog — name and URL fill in automatically:

```
laddu : https://raw.githubusercontent.com/laddu-repo/laddu/builds/repo.json
```

> ⚠️ Do **not** paste `https://github.com/laddu-repo/laddu` — CloudStream needs the **full direct URL** ending in `/builds/repo.json`, otherwise it will say *"No repository found"*.
>
> If the repo was added before but the plugin list looks empty/incomplete, remove the repository, add it again, and wait a few seconds for the list to load.

## ✅ Verify the repository file (sanity check)

Opening <https://raw.githubusercontent.com/laddu-repo/laddu/builds/repo.json> in a browser should show raw JSON text starting with `{"name": "laddu", ...}`. If you see that, the URL is correct.

## ⚖️ DMCA Disclaimer

We hereby issue this notice to clarify that these extensions function similarly to a standard web browser by fetching video files from the internet.

- No content is hosted by this repository or the CloudStream 3 application.
- Any content accessed is hosted by third-party websites.
- Users are solely responsible for their usage and must comply with their local laws.
- If you believe content is violating copyright laws, please contact the actual file hosts, not the developers of this repository or the CloudStream 3 app.

**Legal Notice & Disclaimer:** This project is created strictly for educational, research, and development purposes. The code does not host or store any media files.

## License

This project is licensed under the GNU General Public License v3.0.

## Attribution

This template as well as the gradle plugin and the whole plugin system is **heavily** based on [Aliucord](https://github.com/Aliucord).
*Go use it, it's a great mobile discord client mod!*
