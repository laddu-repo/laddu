package ac;

import android.util.Log;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dc.k f367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1.h f371e;
    public final h0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sd.h f372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m0 f373h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f375k;

    public g1(dc.k kVar, x0 x0Var, t0 t0Var, k1 k1Var, d1.h hVar, h0 h0Var, sd.h hVar2) {
        de.i.e(kVar, "sessionsSettings");
        de.i.e(x0Var, "sessionGenerator");
        de.i.e(t0Var, "sessionFirelogPublisher");
        de.i.e(k1Var, "timeProvider");
        de.i.e(hVar, "sessionDataStore");
        de.i.e(h0Var, "processDataManager");
        de.i.e(hVar2, "backgroundDispatcher");
        this.f367a = kVar;
        this.f368b = x0Var;
        this.f369c = t0Var;
        this.f370d = k1Var;
        this.f371e = hVar;
        this.f = h0Var;
        this.f372g = hVar2;
        this.f375k = "";
        me.x.k(me.x.b(hVar2), null, new c1(this, null, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ac.g1 r4, java.lang.String r5, ac.d1 r6, sd.c r7) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.g1.a(ac.g1, java.lang.String, ac.d1, sd.c):java.lang.Object");
    }

    public final void b() {
        this.i = false;
        if (this.f373h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        me.x.k(me.x.b(this.f372g), null, new c1(this, null, 1), 3);
    }

    public final void c() {
        this.i = true;
        m0 m0Var = this.f373h;
        if (m0Var == null) {
            this.f374j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        sd.c cVar = null;
        if (m0Var == null) {
            de.i.i("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
        if (e(m0Var) || d(m0Var)) {
            me.x.k(me.x.b(this.f372g), null, new o(this, m0Var, cVar, 1), 3);
        }
    }

    public final boolean d(m0 m0Var) {
        Map map = m0Var.f428c;
        boolean z2 = true;
        h0 h0Var = this.f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + h0Var.a());
            return true;
        }
        h0Var.getClass();
        e0 e0Var = (e0) map.get(h0Var.a());
        if (e0Var != null && e0Var.f349a == h0Var.f385c && de.i.a(e0Var.f350b, (String) h0Var.f386d.getValue())) {
            z2 = false;
        }
        if (z2) {
            Log.d("FirebaseSessions", "Process " + h0Var.a() + " is stale");
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(ac.m0 r12) {
        /*
            r11 = this;
            ac.j1 r0 = r12.f427b
            ac.q0 r12 = r12.f426a
            java.lang.String r1 = "Session "
            java.lang.String r2 = "FirebaseSessions"
            r3 = 0
            if (r0 == 0) goto L74
            ac.k1 r4 = r11.f370d
            ac.j1 r4 = r4.a()
            int r5 = le.a.f8338y
            long r4 = r4.f413a
            long r6 = r0.f413a
            long r4 = r4 - r6
            le.c r0 = le.c.MILLISECONDS
            long r4 = com.bumptech.glide.f.T(r4, r0)
            dc.k r0 = r11.f367a
            dc.p r6 = r0.f4489a
            le.a r6 = r6.d()
            r7 = 0
            if (r6 == 0) goto L37
            long r9 = r6.f8339v
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 <= 0) goto L37
            boolean r6 = le.a.d(r9)
            if (r6 != 0) goto L37
            goto L54
        L37:
            dc.p r0 = r0.f4490b
            le.a r0 = r0.d()
            if (r0 == 0) goto L4c
            long r9 = r0.f8339v
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L4c
            boolean r0 = le.a.d(r9)
            if (r0 != 0) goto L4c
            goto L54
        L4c:
            r0 = 30
            le.c r6 = le.c.MINUTES
            long r9 = com.bumptech.glide.f.S(r0, r6)
        L54:
            int r0 = le.a.c(r4, r9)
            if (r0 <= 0) goto L5b
            r3 = 1
        L5b:
            if (r3 == 0) goto L73
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r12 = r12.f437a
            r0.append(r12)
            java.lang.String r12 = " is expired"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
        L73:
            return r3
        L74:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r12 = r12.f437a
            r0.append(r12)
            java.lang.String r12 = " has not backgrounded yet"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.g1.e(ac.m0):boolean");
    }
}
