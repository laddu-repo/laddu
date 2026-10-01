package dd;

import a2.e1;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import kotlin.jvm.internal.k;
import okhttp3.internal.http.StatusLine;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f4094a;

    /* renamed from: b, reason: collision with root package name */
    public int f4095b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f4096c;

    /* renamed from: d, reason: collision with root package name */
    public String f4097d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4098e;

    /* renamed from: f, reason: collision with root package name */
    public volatile String f4099f;

    /* renamed from: g, reason: collision with root package name */
    public String f4100g;

    /* renamed from: h, reason: collision with root package name */
    public String f4101h;

    /* renamed from: i, reason: collision with root package name */
    public String f4102i;
    public final ReentrantLock j;

    /* renamed from: k, reason: collision with root package name */
    public final Condition f4103k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4104l;

    /* renamed from: m, reason: collision with root package name */
    public final Pattern f4105m;

    /* renamed from: n, reason: collision with root package name */
    public final Pattern f4106n;

    /* renamed from: o, reason: collision with root package name */
    public final Pattern f4107o;

    /* renamed from: p, reason: collision with root package name */
    public final Pattern f4108p;

    /* renamed from: q, reason: collision with root package name */
    public final Pattern f4109q;

    /* renamed from: r, reason: collision with root package name */
    public final Pattern f4110r;
    public final Pattern s;

    /* renamed from: t, reason: collision with root package name */
    public final Pattern f4111t;

    /* renamed from: u, reason: collision with root package name */
    public final SparseArray f4112u;

    public d(Context con) {
        k.e(con, "con");
        this.f4095b = 4;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.j = reentrantLock;
        this.f4103k = reentrantLock.newCondition();
        this.f4104l = "Mozilla/5.0 (Windows NT 10.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/113.0.0.0 Safari/537.36";
        this.f4105m = Pattern.compile("var ytInitialPlayerResponse\\s*=\\s*(\\{.+?\\})\\s*;");
        this.f4106n = Pattern.compile("url=(.+?)(\\u0026|$)");
        this.f4107o = Pattern.compile("s=(.+?)(\\u0026|$)");
        this.f4108p = Pattern.compile("([{; =])([a-zA-Z$][a-zA-Z0-9$]{0,2})\\.([a-zA-Z$][a-zA-Z0-9$]{0,2})\\(");
        this.f4109q = Pattern.compile("([{; =])([a-zA-Z$_][a-zA-Z0-9$]{0,2})\\(");
        this.f4110r = Pattern.compile("\\\\/s\\\\/player\\\\/([^\"]+?)\\.js");
        this.s = Pattern.compile("/s/player/([^\"]+?).js");
        this.f4111t = Pattern.compile("(?:\\b|[^a-zA-Z0-9$])([a-zA-Z0-9$]{1,4})\\s*=\\s*function\\(\\s*a\\s*\\)\\s*\\{\\s*a\\s*=\\s*a\\.split\\(\\s*\"\"\\s*\\)");
        SparseArray sparseArray = new SparseArray();
        this.f4112u = sparseArray;
        this.f4096c = new WeakReference(con);
        this.f4098e = con.getCacheDir().getAbsolutePath();
        sparseArray.put(17, new a("3gp", 17, 144, 24, 0));
        sparseArray.put(36, new a("3gp", 36, 240, 32, 0));
        sparseArray.put(5, new a("flv", 5, 240, 64, 0));
        sparseArray.put(43, new a("webm", 43, 360, 128, 0));
        sparseArray.put(18, new a("mp4", 18, 360, 96, 0));
        sparseArray.put(22, new a("mp4", 22, 720, 192, 0));
        sparseArray.put(160, new a("mp4", 160, 144));
        sparseArray.put(133, new a("mp4", 133, 240));
        sparseArray.put(134, new a("mp4", 134, 360));
        sparseArray.put(135, new a("mp4", 135, 480));
        sparseArray.put(136, new a("mp4", 136, 720));
        sparseArray.put(137, new a("mp4", 137, 1080));
        sparseArray.put(264, new a("mp4", 264, 1440));
        sparseArray.put(266, new a("mp4", 266, 2160));
        sparseArray.put(298, new a("mp4", 298, 720, (Object) null));
        sparseArray.put(299, new a("mp4", 299, 1080, (Object) null));
        sparseArray.put(140, new a(140, 128, 0, "m4a"));
        sparseArray.put(141, new a(141, 256, 0, "m4a"));
        sparseArray.put(256, new a(256, 192, 0, "m4a"));
        sparseArray.put(258, new a(258, 384, 0, "m4a"));
        sparseArray.put(278, new a("webm", 278, 144));
        sparseArray.put(242, new a("webm", 242, 240));
        sparseArray.put(243, new a("webm", 243, 360));
        sparseArray.put(244, new a("webm", 244, 480));
        sparseArray.put(247, new a("webm", 247, 720));
        sparseArray.put(248, new a("webm", 248, 1080));
        sparseArray.put(271, new a("webm", 271, 1440));
        sparseArray.put(313, new a("webm", 313, 2160));
        sparseArray.put(302, new a("webm", 302, 720, (Object) null));
        sparseArray.put(StatusLine.HTTP_PERM_REDIRECT, new a("webm", StatusLine.HTTP_PERM_REDIRECT, 1440, (Object) null));
        sparseArray.put(303, new a("webm", 303, 1080, (Object) null));
        sparseArray.put(315, new a("webm", 315, 2160, (Object) null));
        sparseArray.put(171, new a(171, 128, 0, "webm"));
        sparseArray.put(249, new a(249, 48, 0, "webm"));
        sparseArray.put(250, new a(250, 64, 0, "webm"));
        sparseArray.put(251, new a(251, 160, 0, "webm"));
        sparseArray.put(91, new a(91, 144, 48));
        sparseArray.put(92, new a(92, 240, 48));
        sparseArray.put(93, new a(93, 360, 128));
        sparseArray.put(94, new a(94, 480, 128));
        sparseArray.put(95, new a(95, 720, 256));
        sparseArray.put(96, new a(96, 1080, 256));
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x05e6, code lost:
    
        if (r3 == null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x02f6, code lost:
    
        if (r6 == null) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0606 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x02fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.util.SparseArray a(dd.d r26) {
        /*
            Method dump skipped, instructions count: 1798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.d.a(dd.d):android.util.SparseArray");
    }

    public static final boolean b(d dVar, String str) {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                URLConnection openConnection = new URL(str).openConnection();
                k.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
                try {
                    httpURLConnection2.setRequestProperty("User-Agent", dVar.f4104l);
                    httpURLConnection2.connect();
                    if (httpURLConnection2.getResponseCode() == 403) {
                        httpURLConnection2.disconnect();
                        return true;
                    }
                    httpURLConnection2.disconnect();
                    return false;
                } catch (Exception e10) {
                    e = e10;
                    httpURLConnection = httpURLConnection2;
                    e.printStackTrace();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                        return false;
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void c(SparseArray sparseArray) {
        WeakReference weakReference = this.f4096c;
        k.b(weakReference);
        Context context = (Context) weakReference.get();
        if (context == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(w8.k.c(this.f4101h, " function decipher("));
        sb2.append("){return ");
        int size = sparseArray.size();
        for (int i6 = 0; i6 < size; i6++) {
            int keyAt = sparseArray.keyAt(i6);
            if (i6 < sparseArray.size() - 1) {
                sb2.append(this.f4102i);
                sb2.append("('");
                sb2.append((String) sparseArray.get(keyAt));
                sb2.append("')+\"\\n\"+");
            } else {
                sb2.append(this.f4102i);
                sb2.append("('");
                sb2.append((String) sparseArray.get(keyAt));
                sb2.append("')");
            }
        }
        sb2.append("};decipher();");
        new Handler(Looper.getMainLooper()).post(new e1(context, sb2, this, 5));
    }
}
