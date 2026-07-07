package cc;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import j4.b0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import qb.l;
import s9.n;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f2026m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final jb.g f2027a;

    /* renamed from: b, reason: collision with root package name */
    public final ec.c f2028b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f2029c;

    /* renamed from: d, reason: collision with root package name */
    public final k f2030d;

    /* renamed from: e, reason: collision with root package name */
    public final l f2031e;

    /* renamed from: f, reason: collision with root package name */
    public final i f2032f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2033g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f2034h;

    /* renamed from: i, reason: collision with root package name */
    public final rb.j f2035i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f2036k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2037l;

    static {
        new AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [cc.i, java.lang.Object] */
    public d(jb.g gVar, bc.a aVar, ExecutorService executorService, rb.j jVar) {
        gVar.a();
        ec.c cVar = new ec.c(gVar.f7331a, aVar);
        b0 b0Var = new b0(gVar);
        if (w8.l.f14209z == null) {
            w8.l.f14209z = new w8.l(12);
        }
        w8.l lVar = w8.l.f14209z;
        if (k.f2045d == null) {
            k.f2045d = new k(lVar);
        }
        k kVar = k.f2045d;
        l lVar2 = new l(new b(gVar, 0));
        ?? obj = new Object();
        this.f2033g = new Object();
        this.f2036k = new HashSet();
        this.f2037l = new ArrayList();
        this.f2027a = gVar;
        this.f2028b = cVar;
        this.f2029c = b0Var;
        this.f2030d = kVar;
        this.f2031e = lVar2;
        this.f2032f = obj;
        this.f2034h = executorService;
        this.f2035i = jVar;
    }

    public final void a(j jVar) {
        synchronized (this.f2033g) {
            this.f2037l.add(jVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = h(r2);
        r4 = r6.f2029c;
        r2 = r2.a();
        r2.f4067b = r3;
        r2.f4066a = 3;
        r2 = r2.a();
        r4.t(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r6 = this;
            java.lang.Object r0 = cc.d.f2026m
            monitor-enter(r0)
            jb.g r1 = r6.f2027a     // Catch: java.lang.Throwable -> L3f
            r1.a()     // Catch: java.lang.Throwable -> L3f
            android.content.Context r1 = r1.f7331a     // Catch: java.lang.Throwable -> L3f
            j4.b0 r1 = j4.b0.f(r1)     // Catch: java.lang.Throwable -> L3f
            j4.b0 r2 = r6.f2029c     // Catch: java.lang.Throwable -> L37
            dc.b r2 = r2.A()     // Catch: java.lang.Throwable -> L37
            int r3 = r2.f4074b     // Catch: java.lang.Throwable -> L37
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L1e
            if (r3 != r5) goto L1d
            goto L1e
        L1d:
            r5 = 0
        L1e:
            if (r5 == 0) goto L39
            java.lang.String r3 = r6.h(r2)     // Catch: java.lang.Throwable -> L37
            j4.b0 r4 = r6.f2029c     // Catch: java.lang.Throwable -> L37
            dc.a r2 = r2.a()     // Catch: java.lang.Throwable -> L37
            r2.f4067b = r3     // Catch: java.lang.Throwable -> L37
            r3 = 3
            r2.f4066a = r3     // Catch: java.lang.Throwable -> L37
            dc.b r2 = r2.a()     // Catch: java.lang.Throwable -> L37
            r4.t(r2)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r2 = move-exception
            goto L51
        L39:
            if (r1 == 0) goto L41
            r1.C()     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r1 = move-exception
            goto L57
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            r6.k(r2)
            rb.j r0 = r6.f2035i
            cc.c r1 = new cc.c
            r2 = 1
            r1.<init>(r6, r2)
            r0.execute(r1)
            return
        L51:
            if (r1 == 0) goto L56
            r1.C()     // Catch: java.lang.Throwable -> L3f
        L56:
            throw r2     // Catch: java.lang.Throwable -> L3f
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.d.b():void");
    }

    public final dc.b c(dc.b bVar) {
        int responseCode;
        boolean z10;
        ec.b f3;
        jb.g gVar = this.f2027a;
        gVar.a();
        String str = gVar.f7333c.f7343a;
        String str2 = bVar.f4073a;
        gVar.a();
        String str3 = gVar.f7333c.f7349g;
        String str4 = bVar.f4076d;
        ec.c cVar = this.f2028b;
        ec.d dVar = cVar.f4557c;
        if (dVar.b()) {
            URL a10 = ec.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            for (int i6 = 0; i6 <= 1; i6++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c10 = cVar.c(a10, str);
                try {
                    try {
                        c10.setRequestMethod("POST");
                        c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                        c10.setDoOutput(true);
                        ec.c.h(c10);
                        responseCode = c10.getResponseCode();
                        dVar.d(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } catch (IOException | AssertionError unused) {
                    }
                    if (z10) {
                        f3 = ec.c.f(c10);
                    } else {
                        ec.c.b(c10, null, str, str3);
                        if (responseCode != 401 && responseCode != 404) {
                            if (responseCode != 429) {
                                if (responseCode < 500 || responseCode >= 600) {
                                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                    b2.k a11 = ec.b.a();
                                    a11.f1383y = 2;
                                    f3 = a11.b();
                                }
                            } else {
                                throw new jb.i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                        } else {
                            b2.k a12 = ec.b.a();
                            a12.f1383y = 3;
                            f3 = a12.b();
                        }
                    }
                    int c11 = y.e.c(f3.f4552c);
                    if (c11 != 0) {
                        if (c11 != 1) {
                            if (c11 == 2) {
                                l(null);
                                dc.a a13 = bVar.a();
                                a13.f4066a = 2;
                                return a13.a();
                            }
                            throw new jb.i("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        dc.a a14 = bVar.a();
                        a14.f4070e = "BAD CONFIG";
                        a14.f4066a = 5;
                        return a14.a();
                    }
                    String str5 = f3.f4550a;
                    long j = f3.f4551b;
                    k kVar = this.f2030d;
                    kVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    kVar.f2046a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    dc.a a15 = bVar.a();
                    a15.f4068c = str5;
                    a15.f4071f = Long.valueOf(j);
                    a15.f4072g = Long.valueOf(seconds);
                    return a15.a();
                } finally {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new jb.i("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new jb.i("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final n d() {
        String str;
        g();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return dg.b.j(str);
        }
        s9.h hVar = new s9.h();
        a(new h(hVar));
        n nVar = hVar.f12263a;
        this.f2034h.execute(new c(this, 0));
        return nVar;
    }

    public final n e() {
        g();
        s9.h hVar = new s9.h();
        a(new g(this.f2030d, hVar));
        this.f2034h.execute(new c(this, 2));
        return hVar.f12263a;
    }

    /* JADX WARN: Finally extract failed */
    public final void f(dc.b bVar) {
        synchronized (f2026m) {
            try {
                jb.g gVar = this.f2027a;
                gVar.a();
                b0 f3 = b0.f(gVar.f7331a);
                try {
                    this.f2029c.t(bVar);
                    if (f3 != null) {
                        f3.C();
                    }
                } catch (Throwable th) {
                    if (f3 != null) {
                        f3.C();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        jb.g gVar = this.f2027a;
        gVar.a();
        x.e(gVar.f7333c.f7344b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        x.e(gVar.f7333c.f7349g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        x.e(gVar.f7333c.f7343a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f7333c.f7344b;
        Pattern pattern = k.f2044c;
        x.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        x.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", k.f2044c.matcher(gVar.f7333c.f7343a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f7332b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h(dc.b r3) {
        /*
            r2 = this;
            jb.g r0 = r2.f2027a
            r0.a()
            java.lang.String r0 = r0.f7332b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            jb.g r0 = r2.f2027a
            java.lang.String r1 = "[DEFAULT]"
            r0.a()
            java.lang.String r0 = r0.f7332b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L50
        L1e:
            int r3 = r3.f4074b
            r0 = 1
            if (r3 != r0) goto L50
            qb.l r3 = r2.f2031e
            java.lang.Object r3 = r3.get()
            dc.c r3 = (dc.c) r3
            android.content.SharedPreferences r0 = r3.f4081a
            monitor-enter(r0)
            java.lang.String r1 = r3.a()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r3 = move-exception
            goto L4e
        L38:
            java.lang.String r1 = r3.b()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L4d
            cc.i r3 = r2.f2032f
            r3.getClass()
            java.lang.String r3 = cc.i.a()
            return r3
        L4d:
            return r1
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
        L50:
            cc.i r3 = r2.f2032f
            r3.getClass()
            java.lang.String r3 = cc.i.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.d.h(dc.b):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [ec.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ec.a] */
    public final dc.b i(dc.b bVar) {
        int responseCode;
        boolean z10;
        String str = bVar.f4073a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            dc.c cVar = (dc.c) this.f2031e.get();
            synchronized (cVar.f4081a) {
                try {
                    String[] strArr = dc.c.f4080c;
                    int i6 = 0;
                    while (true) {
                        if (i6 < 4) {
                            String str3 = strArr[i6];
                            String string = cVar.f4081a.getString("|T|" + cVar.f4082b + "|" + str3, null);
                            if (string != null && !string.isEmpty()) {
                                if (string.startsWith("{")) {
                                    try {
                                        str2 = new JSONObject(string).getString("token");
                                    } catch (JSONException unused) {
                                    }
                                } else {
                                    str2 = string;
                                }
                            } else {
                                i6++;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        ec.c cVar2 = this.f2028b;
        jb.g gVar = this.f2027a;
        gVar.a();
        String str4 = gVar.f7333c.f7343a;
        String str5 = bVar.f4073a;
        jb.g gVar2 = this.f2027a;
        gVar2.a();
        String str6 = gVar2.f7333c.f7349g;
        jb.g gVar3 = this.f2027a;
        gVar3.a();
        String str7 = gVar3.f7333c.f7344b;
        ec.d dVar = cVar2.f4557c;
        if (dVar.b()) {
            URL a10 = ec.c.a("projects/" + str6 + "/installations");
            int i10 = 0;
            ec.a aVar = cVar2;
            while (i10 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c10 = aVar.c(a10, str4);
                try {
                    try {
                        c10.setRequestMethod("POST");
                        c10.setDoOutput(true);
                        if (str2 != null) {
                            c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        ec.c.g(c10, str5, str7);
                        responseCode = c10.getResponseCode();
                        dVar.d(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } finally {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused2) {
                }
                if (z10) {
                    ec.a e10 = ec.c.e(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar = e10;
                } else {
                    try {
                        ec.c.b(c10, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i10++;
                        aVar = aVar;
                    }
                    if (responseCode != 429) {
                        if (responseCode >= 500 && responseCode < 600) {
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i10++;
                            aVar = aVar;
                        } else {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            ec.a aVar2 = new ec.a(null, null, null, null, 2);
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            aVar = aVar2;
                        }
                    } else {
                        throw new jb.i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        break;
                    }
                }
                int c11 = y.e.c(aVar.f4549e);
                if (c11 != 0) {
                    if (c11 == 1) {
                        dc.a a11 = bVar.a();
                        a11.f4070e = "BAD CONFIG";
                        a11.f4066a = 5;
                        return a11.a();
                    }
                    throw new jb.i("Firebase Installations Service is unavailable. Please try again later.");
                }
                String str8 = aVar.f4546b;
                String str9 = aVar.f4547c;
                k kVar = this.f2030d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f2046a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                ec.b bVar2 = aVar.f4548d;
                String str10 = bVar2.f4550a;
                long j = bVar2.f4551b;
                dc.a a12 = bVar.a();
                a12.f4067b = str8;
                a12.f4066a = 4;
                a12.f4068c = str10;
                a12.f4069d = str9;
                a12.f4071f = Long.valueOf(j);
                a12.f4072g = Long.valueOf(seconds);
                return a12.a();
            }
            throw new jb.i("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new jb.i("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.f2033g) {
            try {
                Iterator it = this.f2037l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(dc.b bVar) {
        synchronized (this.f2033g) {
            try {
                Iterator it = this.f2037l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void l(String str) {
        this.j = str;
    }

    public final synchronized void m(dc.b bVar, dc.b bVar2) {
        try {
            if (this.f2036k.size() != 0 && !TextUtils.equals(bVar.f4073a, bVar2.f4073a)) {
                Iterator it = this.f2036k.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            }
        } finally {
        }
    }
}
