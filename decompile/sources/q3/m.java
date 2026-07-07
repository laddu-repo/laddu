package q3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import w1.b0;
import w2.a0;
import w2.e0;
import w2.h0;
import y9.c0;
import y9.f0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m implements w2.o, a0 {
    public l[] A;
    public long[][] B;
    public int C;
    public long D;
    public int E;
    public l3.a F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3.k f10734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1.t f10736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1.t f10737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1.t f10738e;
    public final w1.t f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f10739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f10740h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z0 f10741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w1.t f10746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10751t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10752u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10753v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f10754w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10755x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f10756y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public w2.q f10757z;

    public m(t3.k kVar, int i) {
        this.f10734a = kVar;
        this.f10735b = i;
        c0 c0Var = f0.f14553w;
        this.f10741j = z0.f14637z;
        this.f10742k = (i & 4) != 0 ? 3 : 0;
        this.f10740h = new o();
        this.i = new ArrayList();
        this.f = new w1.t(16);
        this.f10739g = new ArrayDeque();
        this.f10736c = new w1.t(x1.o.f14146a);
        this.f10737d = new w1.t(6);
        this.f10738e = new w1.t();
        this.f10747p = -1;
        this.f10757z = w2.q.f13846u;
        this.A = new l[0];
    }

    @Override // w2.o
    public final void c(w2.q qVar) {
        if ((this.f10735b & 16) == 0) {
            qVar = new c2.b(qVar, this.f10734a);
        }
        this.f10757z = qVar;
    }

    @Override // w2.o
    public final boolean e(w2.p pVar) {
        z0 z0VarQ;
        e0 e0VarN = p.n(pVar, false, (this.f10735b & 2) != 0);
        if (e0VarN != null) {
            z0VarQ = f0.q(e0VarN);
        } else {
            c0 c0Var = f0.f14553w;
            z0VarQ = z0.f14637z;
        }
        this.f10741j = z0VarQ;
        return e0VarN == null;
    }

    @Override // w2.o
    public final void f(long j8, long j9) {
        this.f10739g.clear();
        this.f10745n = 0;
        this.f10747p = -1;
        this.f10748q = 0;
        this.f10749r = 0;
        this.f10750s = 0;
        this.f10751t = false;
        if (j8 == 0) {
            if (this.f10742k != 3) {
                this.f10742k = 0;
                this.f10745n = 0;
                return;
            } else {
                o oVar = this.f10740h;
                oVar.f10762a.clear();
                oVar.f10763b = 0;
                this.i.clear();
                return;
            }
        }
        for (l lVar : this.A) {
            t tVar = lVar.f10730b;
            int iE = b0.e(tVar.f, j9, false);
            while (true) {
                if (iE < 0) {
                    iE = -1;
                    break;
                } else if ((tVar.f10801g[iE] & 1) != 0) {
                    break;
                } else {
                    iE--;
                }
            }
            if (iE == -1) {
                iE = tVar.a(j9);
            }
            lVar.f10733e = iE;
            h0 h0Var = lVar.f10732d;
            if (h0Var != null) {
                h0Var.f13820b = false;
                h0Var.f13821c = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:263:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0518 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x06fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x06fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // w2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(w2.p r44, t1.r r45) throws t1.g0 {
        /*
            Method dump skipped, instruction units count: 1832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.m.g(w2.p, t1.r):int");
    }

    @Override // w2.o
    public final List h() {
        return this.f10741j;
    }

    @Override // w2.a0
    public final boolean i() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e4 A[EDGE_INSN: B:73:0x00e4->B:65:0x00e4 BREAK  A[LOOP:1: B:32:0x006b->B:64:0x00e0], SYNTHETIC] */
    @Override // w2.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final w2.z j(long r21) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.m.j(long):w2.z");
    }

    @Override // w2.a0
    public final long l() {
        return this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0002 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(long r34) {
        /*
            Method dump skipped, instruction units count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.m.m(long):void");
    }

    @Override // w2.o
    public final w2.o a() {
        return this;
    }

    @Override // w2.o
    public final void release() {
    }
}
