package wb;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t9.x;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f13990s = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f13991t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f13992a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13994c;
    public HttpURLConnection f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e2.e f13997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScheduledExecutorService f13998h;
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fa.g f13999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nb.d f14000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f14001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f14002m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f14006q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13993b = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Random f14004o = new Random();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x7.a f14005p = x7.a.f14252a;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f14003n = "firebase";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13995d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13996e = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f14007r = new Object();

    public j(fa.g gVar, nb.d dVar, g gVar2, c cVar, Context context, LinkedHashSet linkedHashSet, l lVar, ScheduledExecutorService scheduledExecutorService) {
        this.f13992a = linkedHashSet;
        this.f13998h = scheduledExecutorService;
        this.f13994c = Math.max(8 - lVar.c().f14008a, 1);
        this.f13999j = gVar;
        this.i = gVar2;
        this.f14000k = dVar;
        this.f14001l = cVar;
        this.f14002m = context;
        this.f14006q = lVar;
    }

    public static boolean d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashSet r0 = r1.f13992a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f13993b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f13995d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f13996e     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wb.j.a():boolean");
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null && !this.f13996e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e7) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e7);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e10) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e10);
            }
        }
    }

    public final String c(String str) {
        fa.g gVar = this.f13999j;
        gVar.a();
        Matcher matcher = f13991t.matcher(gVar.f5338c.f5350b);
        return "https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/" + (matcher.matches() ? matcher.group(1) : null) + "/namespaces/" + str + ":streamFetchInvalidations";
    }

    public final synchronized void e(long j8) {
        try {
            if (a()) {
                int i = this.f13994c;
                if (i > 0) {
                    this.f13994c = i - 1;
                    this.f13998h.schedule(new x(2, this), j8, TimeUnit.MILLISECONDS);
                } else if (!this.f13996e) {
                    new vb.c("Unable to connect to the server. Check your connection and try again.");
                    g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g() {
        Iterator it = this.f13992a.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
    }

    public final synchronized void h() {
        this.f13994c = 8;
    }

    public final synchronized void i() {
        this.f14005p.getClass();
        e(Math.max(0L, this.f14006q.c().f14009b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final synchronized void j(boolean z2) {
        this.f13993b = z2;
    }

    public final void k(boolean z2) {
        HttpURLConnection httpURLConnection;
        synchronized (this.f14007r) {
            try {
                this.f13996e = z2;
                e2.e eVar = this.f13997g;
                if (eVar != null) {
                    eVar.f4600a = z2;
                }
                if (Build.VERSION.SDK_INT >= 26 && z2 && (httpURLConnection = this.f) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wb.j.l(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    public final synchronized e2.e m(HttpURLConnection httpURLConnection) {
        return new e2.e(httpURLConnection, this.i, this.f14001l, this.f13992a, new i(this), this.f13998h, this.f14006q);
    }

    public final void n(Date date) {
        l lVar = this.f14006q;
        int i = lVar.c().f14008a + 1;
        long millis = TimeUnit.MINUTES.toMillis(f13990s[(i < 8 ? i : 8) - 1]);
        lVar.g(i, new Date(date.getTime() + (millis / 2) + ((long) this.f14004o.nextInt((int) millis))));
    }
}
