package jd;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kd.p0;
import okhttp3.HttpUrl;
import org.json.JSONArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 {
    public static final void a(AtomicBoolean atomicBoolean, gf.k kVar, p0 p0Var, String str, Map map) {
        if (atomicBoolean.compareAndSet(false, true) && kVar.isActive()) {
            if (map == null) {
                map = p0Var.f7895f;
            }
            kVar.resumeWith(p0.a(p0Var, str, 0, map, 25));
        }
    }

    public static final String b(String str) {
        if (str != null && !df.m.S(str) && !str.equals("null")) {
            try {
                String string = new JSONArray("[" + str + "]").getString(0);
                kotlin.jvm.internal.k.b(string);
                if (df.u.H(string, "http", false)) {
                    return string;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean c(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl == null) {
            fileExtensionFromUrl = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if ((fileExtensionFromUrl.equals("php") && (df.m.I(str, ".m3u8", false) || df.m.I(str, ".mpd", false))) || fileExtensionFromUrl.equals("m3u8") || fileExtensionFromUrl.equals("mpd") || fileExtensionFromUrl.equals("ts") || fileExtensionFromUrl.equals("mp4") || fileExtensionFromUrl.equals("webm") || fileExtensionFromUrl.equals("mkv")) {
            if (TextUtils.isEmpty(null)) {
                return true;
            }
            try {
                String host = new URI(str).getHost();
                if (host != null && df.u.H(host, "www.", false)) {
                    kotlin.jvm.internal.k.d(host.substring(4), "substring(...)");
                }
            } catch (URISyntaxException unused) {
            }
        }
        return false;
    }
}
