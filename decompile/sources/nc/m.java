package nc;

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

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m {
    public static final int[] s = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f9644t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f9645a;

    /* renamed from: c, reason: collision with root package name */
    public int f9647c;

    /* renamed from: f, reason: collision with root package name */
    public HttpURLConnection f9650f;

    /* renamed from: g, reason: collision with root package name */
    public c f9651g;

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledExecutorService f9652h;

    /* renamed from: i, reason: collision with root package name */
    public final j f9653i;
    public final jb.g j;

    /* renamed from: k, reason: collision with root package name */
    public final cc.e f9654k;

    /* renamed from: l, reason: collision with root package name */
    public final e f9655l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f9656m;

    /* renamed from: q, reason: collision with root package name */
    public final o f9660q;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9646b = false;

    /* renamed from: o, reason: collision with root package name */
    public final Random f9658o = new Random();

    /* renamed from: p, reason: collision with root package name */
    public final a9.a f9659p = a9.a.f629a;

    /* renamed from: n, reason: collision with root package name */
    public final String f9657n = "firebase";

    /* renamed from: d, reason: collision with root package name */
    public boolean f9648d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9649e = false;

    /* renamed from: r, reason: collision with root package name */
    public final Object f9661r = new Object();

    public m(jb.g gVar, cc.e eVar, j jVar, e eVar2, Context context, LinkedHashSet linkedHashSet, o oVar, ScheduledExecutorService scheduledExecutorService) {
        this.f9645a = linkedHashSet;
        this.f9652h = scheduledExecutorService;
        this.f9647c = Math.max(8 - oVar.c().f9662a, 1);
        this.j = gVar;
        this.f9653i = jVar;
        this.f9654k = eVar;
        this.f9655l = eVar2;
        this.f9656m = context;
        this.f9660q = oVar;
    }

    public static boolean d(int i6) {
        if (i6 != 408 && i6 != 429 && i6 != 502 && i6 != 503 && i6 != 504) {
            return false;
        }
        return true;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    public final synchronized boolean a() {
        boolean z10;
        if (!this.f9645a.isEmpty() && !this.f9646b && !this.f9648d) {
            if (!this.f9649e) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f9650f;
        if (httpURLConnection != null && !this.f9649e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e10);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e11) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e11);
            }
        }
    }

    public final String c(String str) {
        String str2;
        jb.g gVar = this.j;
        gVar.a();
        Matcher matcher = f9644t.matcher(gVar.f7333c.f7344b);
        if (matcher.matches()) {
            str2 = matcher.group(1);
        } else {
            str2 = null;
        }
        return "https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/" + str2 + "/namespaces/" + str + ":streamFetchInvalidations";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [jb.i, mc.f] */
    public final synchronized void e(long j) {
        try {
            if (!a()) {
                return;
            }
            int i6 = this.f9647c;
            if (i6 > 0) {
                this.f9647c = i6 - 1;
                this.f9652h.schedule(new a1.e(this, 16), j, TimeUnit.MILLISECONDS);
            } else if (!this.f9649e) {
                g(new jb.i("Unable to connect to the server. Check your connection and try again."));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(mc.f fVar) {
        Iterator it = this.f9645a.iterator();
        while (it.hasNext()) {
            ((mc.b) it.next()).b(fVar);
        }
    }

    public final synchronized void h() {
        this.f9647c = 8;
    }

    public final synchronized void i() {
        this.f9659p.getClass();
        e(Math.max(0L, this.f9660q.c().f9663b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final synchronized void j(boolean z10) {
        this.f9646b = z10;
    }

    public final void k(boolean z10) {
        HttpURLConnection httpURLConnection;
        synchronized (this.f9661r) {
            try {
                this.f9649e = z10;
                c cVar = this.f9651g;
                if (cVar != null) {
                    cVar.f9595a = z10;
                }
                if (Build.VERSION.SDK_INT >= 26 && z10 && (httpURLConnection = this.f9650f) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            jb.g r9 = r6.j
            r9.a()
            jb.j r0 = r9.f7333c
            java.lang.String r1 = r0.f7343a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.f9656m
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            java.lang.String r2 = "FirebaseRemoteConfig"
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r4 = 0
            java.lang.String r5 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            byte[] r5 = a9.b.c(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            if (r5 != 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            android.util.Log.e(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
        L45:
            r1 = r4
            goto L62
        L47:
            java.lang.String r1 = a9.b.a(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            goto L62
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r3.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.i(r2, r1)
            goto L45
        L62:
            java.lang.String r2 = "X-Android-Cert"
            r7.setRequestProperty(r2, r1)
            java.lang.String r1 = "X-Google-GFE-Can-Retry"
            java.lang.String r2 = "yes"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "X-Accept-Response-Streaming"
            java.lang.String r2 = "true"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Accept"
            r7.setRequestProperty(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.a()
            java.lang.String r2 = r0.f7344b
            java.util.regex.Pattern r3 = nc.m.f9644t
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L9c
            r3 = 1
            java.lang.String r4 = r2.group(r3)
        L9c:
            java.lang.String r2 = "project"
            r1.put(r2, r4)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.f9657n
            r1.put(r2, r3)
            nc.j r2 = r6.f9653i
            nc.o r2 = r2.f9637g
            android.content.SharedPreferences r2 = r2.f9666a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.a()
            java.lang.String r9 = r0.f7344b
            java.lang.String r0 = "appId"
            r1.put(r0, r9)
            java.lang.String r9 = "sdkVersion"
            java.lang.String r0 = "22.1.2"
            r1.put(r9, r0)
            java.lang.String r9 = "appInstanceId"
            r1.put(r9, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream
            java.io.OutputStream r7 = r7.getOutputStream()
            r9.<init>(r7)
            r9.write(r8)
            r9.flush()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.m.l(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    public final synchronized c m(HttpURLConnection httpURLConnection) {
        return new c(httpURLConnection, this.f9653i, this.f9655l, this.f9645a, new l(this), this.f9652h);
    }

    public final void n(Date date) {
        o oVar = this.f9660q;
        int i6 = oVar.c().f9662a + 1;
        int i10 = 8;
        if (i6 < 8) {
            i10 = i6;
        }
        oVar.f(i6, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(s[i10 - 1]) / 2) + this.f9658o.nextInt((int) r2)));
    }
}
