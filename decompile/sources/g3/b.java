package g3;

import d2.i;
import db.c1;
import db.i0;
import db.k0;
import java.util.List;
import s3.m;
import u1.t;
import y2.l;
import y2.o;
import y2.p;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: b, reason: collision with root package name */
    public q f5405b;

    /* renamed from: c, reason: collision with root package name */
    public int f5406c;

    /* renamed from: d, reason: collision with root package name */
    public int f5407d;

    /* renamed from: e, reason: collision with root package name */
    public int f5408e;

    /* renamed from: g, reason: collision with root package name */
    public n3.a f5410g;

    /* renamed from: h, reason: collision with root package name */
    public p f5411h;

    /* renamed from: i, reason: collision with root package name */
    public i f5412i;
    public m j;

    /* renamed from: a, reason: collision with root package name */
    public final t f5404a = new t(2);

    /* renamed from: f, reason: collision with root package name */
    public long f5409f = -1;

    @Override // y2.o
    public final void a() {
        m mVar = this.j;
        if (mVar != null) {
            mVar.getClass();
        }
    }

    public final void b() {
        q qVar = this.f5405b;
        qVar.getClass();
        qVar.t();
        this.f5405b.n(new a3.b(-9223372036854775807L));
        this.f5406c = 6;
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        if (j == 0) {
            this.f5406c = 0;
            this.j = null;
        } else if (this.f5406c == 5) {
            m mVar = this.j;
            mVar.getClass();
            mVar.c(j, j10);
        }
    }

    @Override // y2.o
    public final boolean f(p pVar) {
        l lVar = (l) pVar;
        t tVar = this.f5404a;
        tVar.H(2);
        lVar.k(tVar.f12811a, 0, 2, false);
        if (tVar.E() == 65496) {
            tVar.H(2);
            lVar.k(tVar.f12811a, 0, 2, false);
            int E = tVar.E();
            this.f5407d = E;
            if (E == 65504) {
                tVar.H(2);
                lVar.k(tVar.f12811a, 0, 2, false);
                lVar.b(tVar.E() - 2, false);
                tVar.H(2);
                lVar.k(tVar.f12811a, 0, 2, false);
                this.f5407d = tVar.E();
            }
            if (this.f5407d == 65505) {
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

    /* JADX WARN: Removed duplicated region for block: B:53:0x017a  */
    @Override // y2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(y2.p r26, mc.i r27) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.b.i(y2.p, mc.i):int");
    }

    @Override // y2.o
    public final void l(q qVar) {
        this.f5405b = qVar;
    }

    @Override // y2.o
    public final o d() {
        return this;
    }
}
