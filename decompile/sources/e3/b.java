package e3;

import db.c1;
import db.i0;
import db.k0;
import java.util.List;
import u1.t;
import y2.l;
import y2.n;
import y2.o;
import y2.p;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final t f4284a = new t(4);

    /* renamed from: b, reason: collision with root package name */
    public final t f4285b = new t(9);

    /* renamed from: c, reason: collision with root package name */
    public final t f4286c = new t(11);

    /* renamed from: d, reason: collision with root package name */
    public final t f4287d = new t();

    /* renamed from: e, reason: collision with root package name */
    public final c f4288e;

    /* renamed from: f, reason: collision with root package name */
    public q f4289f;

    /* renamed from: g, reason: collision with root package name */
    public int f4290g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4291h;

    /* renamed from: i, reason: collision with root package name */
    public long f4292i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f4293k;

    /* renamed from: l, reason: collision with root package name */
    public int f4294l;

    /* renamed from: m, reason: collision with root package name */
    public long f4295m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4296n;

    /* renamed from: o, reason: collision with root package name */
    public a f4297o;

    /* renamed from: p, reason: collision with root package name */
    public f f4298p;

    /* JADX WARN: Type inference failed for: r0v4, types: [e3.e, e3.c] */
    public b() {
        ?? eVar = new e(new n(), 0);
        eVar.f4299z = -9223372036854775807L;
        eVar.A = new long[0];
        eVar.B = new long[0];
        this.f4288e = eVar;
        this.f4290g = 1;
    }

    public final t b(p pVar) {
        int i6 = this.f4294l;
        t tVar = this.f4287d;
        byte[] bArr = tVar.f12811a;
        if (i6 > bArr.length) {
            tVar.I(0, new byte[Math.max(bArr.length * 2, i6)]);
        } else {
            tVar.K(0);
        }
        tVar.J(this.f4294l);
        pVar.readFully(tVar.f12811a, 0, this.f4294l);
        return tVar;
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        if (j == 0) {
            this.f4290g = 1;
            this.f4291h = false;
        } else {
            this.f4290g = 3;
        }
        this.j = 0;
    }

    @Override // y2.o
    public final boolean f(p pVar) {
        t tVar = this.f4284a;
        l lVar = (l) pVar;
        lVar.k(tVar.f12811a, 0, 3, false);
        tVar.K(0);
        if (tVar.B() == 4607062) {
            lVar.k(tVar.f12811a, 0, 2, false);
            tVar.K(0);
            if ((tVar.E() & 250) == 0) {
                lVar.k(tVar.f12811a, 0, 4, false);
                tVar.K(0);
                int k8 = tVar.k();
                lVar.C = 0;
                lVar.b(k8, false);
                lVar.k(tVar.f12811a, 0, 4, false);
                tVar.K(0);
                if (tVar.k() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // y2.o
    public final List h() {
        i0 i0Var = k0.f4008y;
        return c1.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x039a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v5, types: [e3.e, e3.a] */
    @Override // y2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(y2.p r29, mc.i r30) {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.b.i(y2.p, mc.i):int");
    }

    @Override // y2.o
    public final void l(q qVar) {
        this.f4289f = qVar;
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final o d() {
        return this;
    }
}
