package s3;

import db.c1;
import db.i0;
import db.k0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import u1.a0;
import y2.d0;
import y2.g0;
import y2.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements y2.o, z {
    public l[] A;
    public long[][] B;
    public int C;
    public long D;
    public int E;
    public n3.a F;

    /* renamed from: a, reason: collision with root package name */
    public final v3.k f12113a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12114b;

    /* renamed from: c, reason: collision with root package name */
    public final u1.t f12115c;

    /* renamed from: d, reason: collision with root package name */
    public final u1.t f12116d;

    /* renamed from: e, reason: collision with root package name */
    public final u1.t f12117e;

    /* renamed from: f, reason: collision with root package name */
    public final u1.t f12118f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f12119g;

    /* renamed from: h, reason: collision with root package name */
    public final o f12120h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f12121i;
    public c1 j;

    /* renamed from: k, reason: collision with root package name */
    public int f12122k;

    /* renamed from: l, reason: collision with root package name */
    public int f12123l;

    /* renamed from: m, reason: collision with root package name */
    public long f12124m;

    /* renamed from: n, reason: collision with root package name */
    public int f12125n;

    /* renamed from: o, reason: collision with root package name */
    public u1.t f12126o;

    /* renamed from: p, reason: collision with root package name */
    public int f12127p;

    /* renamed from: q, reason: collision with root package name */
    public int f12128q;

    /* renamed from: r, reason: collision with root package name */
    public int f12129r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12130t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12131u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f12132v;

    /* renamed from: w, reason: collision with root package name */
    public long f12133w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f12134x;

    /* renamed from: y, reason: collision with root package name */
    public long f12135y;

    /* renamed from: z, reason: collision with root package name */
    public y2.q f12136z;

    public m(v3.k kVar, int i6) {
        int i10;
        this.f12113a = kVar;
        this.f12114b = i6;
        i0 i0Var = k0.f4008y;
        this.j = c1.B;
        if ((i6 & 4) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        this.f12122k = i10;
        this.f12120h = new o();
        this.f12121i = new ArrayList();
        this.f12118f = new u1.t(16);
        this.f12119g = new ArrayDeque();
        this.f12115c = new u1.t(v1.o.f13247a);
        this.f12116d = new u1.t(6);
        this.f12117e = new u1.t();
        this.f12127p = -1;
        this.f12136z = y2.q.f14930w;
        this.A = new l[0];
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        this.f12119g.clear();
        this.f12125n = 0;
        this.f12127p = -1;
        this.f12128q = 0;
        this.f12129r = 0;
        this.s = 0;
        this.f12130t = false;
        if (j == 0) {
            if (this.f12122k != 3) {
                this.f12122k = 0;
                this.f12125n = 0;
                return;
            } else {
                o oVar = this.f12120h;
                oVar.f12141a.clear();
                oVar.f12142b = 0;
                this.f12121i.clear();
                return;
            }
        }
        for (l lVar : this.A) {
            t tVar = lVar.f12109b;
            int e10 = a0.e(tVar.f12182f, j10, false);
            while (true) {
                if (e10 >= 0) {
                    if ((tVar.f12183g[e10] & 1) != 0) {
                        break;
                    } else {
                        e10--;
                    }
                } else {
                    e10 = -1;
                    break;
                }
            }
            if (e10 == -1) {
                e10 = tVar.a(j10);
            }
            lVar.f12112e = e10;
            g0 g0Var = lVar.f12111d;
            if (g0Var != null) {
                g0Var.f14902b = false;
                g0Var.f14903c = 0;
            }
        }
    }

    @Override // y2.o
    public final boolean f(y2.p pVar) {
        boolean z10;
        c1 c1Var;
        if ((this.f12114b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d0 n10 = p.n(pVar, false, z10);
        if (n10 != null) {
            c1Var = k0.o(n10);
        } else {
            i0 i0Var = k0.f4008y;
            c1Var = c1.B;
        }
        this.j = c1Var;
        if (n10 == null) {
            return true;
        }
        return false;
    }

    @Override // y2.z
    public final boolean g() {
        return true;
    }

    @Override // y2.o
    public final List h() {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0006 A[SYNTHETIC] */
    @Override // y2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(y2.p r44, mc.i r45) {
        /*
            Method dump skipped, instructions count: 1832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.m.i(y2.p, mc.i):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4 A[EDGE_INSN: B:70:0x00e4->B:71:0x00e4 BREAK  A[LOOP:1: B:29:0x006b->B:58:0x00e0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    @Override // y2.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y2.y j(long r21) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.m.j(long):y2.y");
    }

    @Override // y2.o
    public final void l(y2.q qVar) {
        if ((this.f12114b & 16) == 0) {
            qVar = new a2.c(qVar, this.f12113a);
        }
        this.f12136z = qVar;
    }

    @Override // y2.z
    public final long m() {
        return this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0002 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(long r34) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.m.n(long):void");
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final y2.o d() {
        return this;
    }
}
