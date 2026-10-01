package jd;

import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7353x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f7354y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ WebView f7355z;

    public /* synthetic */ a0(AtomicBoolean atomicBoolean, WebView webView, int i6) {
        this.f7353x = i6;
        this.f7354y = atomicBoolean;
        this.f7355z = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7353x) {
            case 0:
                if (!this.f7354y.get()) {
                    this.f7355z.evaluateJavascript("(function() {\n    function fireClick(el) {\n        if (!el) return;\n        try { el.dispatchEvent(new PointerEvent('pointerdown', {bubbles:true, cancelable:true})); } catch(e) {}\n        try { el.dispatchEvent(new PointerEvent('pointerup',   {bubbles:true, cancelable:true})); } catch(e) {}\n        try { el.dispatchEvent(new MouseEvent('mousedown',     {bubbles:true, cancelable:true})); } catch(e) {}\n        try { el.dispatchEvent(new MouseEvent('mouseup',       {bubbles:true, cancelable:true})); } catch(e) {}\n        try { el.dispatchEvent(new MouseEvent('click',         {bubbles:true, cancelable:true})); } catch(e) {}\n        try { el.click(); } catch(e) {}\n    }\n\n    // 1. Direct video.play() — works when gesture requirement is on <video> itself\n    var videos = document.querySelectorAll('video');\n    for (var i = 0; i < videos.length; i++) {\n        try { videos[i].muted = true; videos[i].play(); } catch(e) {}\n        fireClick(videos[i]);\n    }\n\n    // 2. Play-button selectors (ordered: specific → generic)\n    //    Covers: JW Player, Video.js, Plyr, DPlayer, Flowplayer, Clappr,\n    //            Prism, custom overlays, Font Awesome / Ionicons play icons\n    var selectors = [\n        // JW Player\n        '.jw-icon-display', '.jw-display-icon-display', '.jwplayer .jw-icon-rewind',\n        // Video.js\n        '.vjs-big-play-button', '.vjs-play-control',\n        // Plyr\n        '.plyr__control--overlaid', '.plyr [data-plyr=\"play\"]',\n        // Flowplayer\n        '.fp-play', '.fp-toggle',\n        // DPlayer\n        '.dplayer-play-icon', '.dplayer-play',\n        // Prism (Naver)\n        '.prism-big-play-btn',\n        // Bitmovin\n        '.bmpui-ui-hugeplaybacktogglebutton',\n        // Generic custom overlays\n        '.play-btn', '.play-button', '.btn-play', '.playBtn', '.play_btn',\n        '.big-play-btn', '.bigPlayBtn', '.bigPlay', '.big-play',\n        '.play-overlay', '.video-overlay', '.player-overlay', '.stream-overlay',\n        '.overlay-play', '.poster-play', '.thumb-play',\n        // Attribute-based\n        '[data-action=\"play\"]', '[aria-label=\"Play\"]', '[title=\"Play\"]',\n        '[class*=\"play-btn\"]', '[class*=\"playBtn\"]', '[class*=\"play_btn\"]',\n        '[class*=\"PlayBtn\"]', '[class*=\"play-button\"]', '[class*=\"PlayButton\"]',\n        // Icon fonts\n        'i.fa-play', 'i.ion-play', 'i.material-icons',\n        // Broad fallback\n        'button[class*=\"play\"]', 'span[class*=\"play\"]',\n        'div[class*=\"play\"]',   'a[class*=\"play\"]'\n    ];\n\n    var clicked = false;\n    for (var j = 0; j < selectors.length; j++) {\n        try {\n            var found = document.querySelectorAll(selectors[j]);\n            for (var k = 0; k < found.length; k++) {\n                var el = found[k];\n                // Only interact with visible elements\n                if (el && (el.offsetWidth > 0 || el.offsetHeight > 0 || el.getClientRects().length > 0)) {\n                    fireClick(el);\n                    clicked = true;\n                }\n            }\n        } catch(e) {}\n        if (clicked) break;\n    }\n\n    // 3. Player library .play() calls\n    try { if (typeof jwplayer !== 'undefined') jwplayer().play(); } catch(e) {}\n    try {\n        if (typeof videojs !== 'undefined') {\n            var vps = videojs.getPlayers() || {};\n            for (var vk in vps) { try { if (vps[vk]) vps[vk].play(); } catch(e) {} }\n        }\n    } catch(e) {}\n    try { if (window.player   && typeof window.player.play   === 'function') window.player.play();   } catch(e) {}\n    try { if (window._player  && typeof window._player.play  === 'function') window._player.play();  } catch(e) {}\n    try { if (window.dp       && typeof window.dp.play       === 'function') window.dp.play();       } catch(e) {}\n    try { if (window.flowplayer && typeof window.flowplayer().play === 'function') window.flowplayer().play(); } catch(e) {}\n\n    return clicked;\n})()", null);
                    return;
                }
                return;
            default:
                if (!this.f7354y.get()) {
                    WebView webView = this.f7355z;
                    webView.stopLoading();
                    webView.destroy();
                    return;
                }
                return;
        }
    }
}
