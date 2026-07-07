package a3;

import db.c1;
import db.i0;
import db.k0;
import java.util.List;
import p.l;
import u1.a0;
import u1.t;
import y2.o;
import y2.p;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: a, reason: collision with root package name */
    public final t f524a;

    /* renamed from: b, reason: collision with root package name */
    public final c f525b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f526c;

    /* renamed from: d, reason: collision with root package name */
    public final l f527d;

    /* renamed from: e, reason: collision with root package name */
    public int f528e;

    /* renamed from: f, reason: collision with root package name */
    public q f529f;

    /* renamed from: g, reason: collision with root package name */
    public e f530g;

    /* renamed from: h, reason: collision with root package name */
    public long f531h;

    /* renamed from: i, reason: collision with root package name */
    public g[] f532i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public g f533k;

    /* renamed from: l, reason: collision with root package name */
    public int f534l;

    /* renamed from: m, reason: collision with root package name */
    public long f535m;

    /* renamed from: n, reason: collision with root package name */
    public long f536n;

    /* renamed from: o, reason: collision with root package name */
    public int f537o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f538p;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, a3.c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, y2.q] */
    public d(int i6, l lVar) {
        this.f527d = lVar;
        this.f526c = (i6 & 1) == 0;
        this.f524a = new t(12);
        this.f525b = new Object();
        this.f529f = new Object();
        this.f532i = new g[0];
        this.f535m = -1L;
        this.f536n = -1L;
        this.f534l = -1;
        this.f531h = -9223372036854775807L;
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        this.j = -1L;
        this.f533k = null;
        for (g gVar : this.f532i) {
            if (gVar.f557k == 0) {
                gVar.f556i = 0;
            } else {
                gVar.f556i = gVar.f560n[a0.e(gVar.f559m, j, true)];
            }
        }
        if (j == 0) {
            if (this.f532i.length == 0) {
                this.f528e = 0;
                return;
            } else {
                this.f528e = 3;
                return;
            }
        }
        this.f528e = 6;
    }

    @Override // y2.o
    public final boolean f(p pVar) {
        t tVar = this.f524a;
        pVar.C(tVar.f12811a, 0, 12);
        tVar.K(0);
        if (tVar.m() == 1179011410) {
            tVar.L(4);
            if (tVar.m() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // y2.o
    public final List h() {
        i0 i0Var = k0.f4008y;
        return c1.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    @Override // y2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(y2.p r23, mc.i r24) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.d.i(y2.p, mc.i):int");
    }

    @Override // y2.o
    public final void l(q qVar) {
        this.f528e = 0;
        if (this.f526c) {
            qVar = new a2.c(qVar, this.f527d);
        }
        this.f529f = qVar;
        this.j = -1L;
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final o d() {
        return this;
    }
}
