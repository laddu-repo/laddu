package s2;

import android.content.Context;
import com.google.android.gms.internal.measurement.mb;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import k8.k4;
import o2.d0;
import w1.v;
import y1.z;
import y9.e1;
import y9.f0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements d, z {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final z0 f11436p = f0.p(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final z0 f11437q = f0.p(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final z0 f11438r = f0.p(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final z0 f11439s = f0.p(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final z0 f11440t = f0.p(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final z0 f11441u = f0.p(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static g f11442v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f11444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k4 f11445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f11446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11447e;
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f11449h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f11450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f11451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11453m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11454n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f11455o;

    public g(Context context, HashMap map, boolean z2) {
        boolean z10;
        v vVar = v.f13744a;
        this.f11443a = context == null ? null : context.getApplicationContext();
        this.f11444b = e1.b(map);
        this.f11445c = new k4(17, false);
        this.f = new s();
        this.f11446d = vVar;
        this.f11447e = z2;
        if (context == null) {
            this.f11454n = 0;
            this.f11452l = 1000000L;
            return;
        }
        w1.s sVarA = w1.s.a(context);
        int iB = sVarA.b();
        this.f11454n = iB;
        this.f11452l = a(iB);
        f fVar = new f(this);
        Executor executorQ = w1.a.q();
        CopyOnWriteArrayList<w1.r> copyOnWriteArrayList = sVarA.f13732b;
        for (w1.r rVar : copyOnWriteArrayList) {
            if (rVar.f13728a.get() == null) {
                copyOnWriteArrayList.remove(rVar);
            }
        }
        w1.r rVar2 = new w1.r(sVarA, fVar, executorQ);
        synchronized (sVarA.f13733c) {
            sVarA.f13732b.add(rVar2);
            z10 = sVarA.f13735e;
        }
        if (z10) {
            rVar2.f13729b.execute(new jd.j(14, rVar2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:1149:0x1225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(int r18) {
        /*
            Method dump skipped, instruction units count: 8770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.g.a(int):long");
    }

    public final void b(int i, long j8, long j9) {
        final int i10;
        final long j10;
        final long j11;
        if (i == 0 && j8 == 0 && j9 == this.f11453m) {
            return;
        }
        this.f11453m = j9;
        for (final c cVar : (CopyOnWriteArrayList) this.f11445c.f7607v) {
            if (cVar.f11429c) {
                i10 = i;
                j10 = j8;
                j11 = j9;
            } else {
                i10 = i;
                j10 = j8;
                j11 = j9;
                cVar.f11427a.post(new Runnable() { // from class: s2.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        d2.f fVar = cVar.f11428b;
                        mb mbVar = fVar.f3989y;
                        d2.a aVarO = fVar.O(((f0) mbVar.f2889c).isEmpty() ? null : (d0) y9.p.l((f0) mbVar.f2889c));
                        fVar.S(aVarO, 1006, new d2.c(aVarO, i10, j10, j11));
                    }
                });
            }
            i = i10;
            j8 = j10;
            j9 = j11;
        }
    }
}
