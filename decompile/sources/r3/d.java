package r3;

import db.c1;
import db.i0;
import db.k0;
import java.util.List;
import r1.j0;
import u1.t;
import y2.f0;
import y2.n;
import y2.o;
import y2.p;
import y2.q;
import y2.u;
import y2.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: a, reason: collision with root package name */
    public final long f11809a;

    /* renamed from: b, reason: collision with root package name */
    public final t f11810b;

    /* renamed from: c, reason: collision with root package name */
    public final x f11811c;

    /* renamed from: d, reason: collision with root package name */
    public final u f11812d;

    /* renamed from: e, reason: collision with root package name */
    public final w5.a f11813e;

    /* renamed from: f, reason: collision with root package name */
    public final n f11814f;

    /* renamed from: g, reason: collision with root package name */
    public q f11815g;

    /* renamed from: h, reason: collision with root package name */
    public f0 f11816h;

    /* renamed from: i, reason: collision with root package name */
    public f0 f11817i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public j0 f11818k;

    /* renamed from: l, reason: collision with root package name */
    public long f11819l;

    /* renamed from: m, reason: collision with root package name */
    public long f11820m;

    /* renamed from: n, reason: collision with root package name */
    public long f11821n;

    /* renamed from: o, reason: collision with root package name */
    public long f11822o;

    /* renamed from: p, reason: collision with root package name */
    public int f11823p;

    /* renamed from: q, reason: collision with root package name */
    public f f11824q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11825r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public long f11826t;

    public d(int i6) {
        this(-9223372036854775807L);
    }

    public final void b() {
        f fVar = this.f11824q;
        if ((fVar instanceof a) && ((a) fVar).g()) {
            long j = this.f11822o;
            if (j != -1 && j != this.f11824q.e()) {
                a aVar = (a) this.f11824q;
                this.f11824q = new a(this.f11822o, aVar.f11802h, aVar.f11803i, aVar.j, aVar.f11804k);
                q qVar = this.f11815g;
                qVar.getClass();
                qVar.n(this.f11824q);
                this.f11816h.getClass();
                this.f11824q.m();
            }
        }
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        this.j = 0;
        this.f11819l = -9223372036854775807L;
        this.f11820m = 0L;
        this.f11823p = 0;
        this.f11826t = j10;
        if (!(this.f11824q instanceof b)) {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.l() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(y2.p r9) {
        /*
            r8 = this;
            r3.f r0 = r8.f11824q
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = r0.e()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.l()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L27
        L1b:
            u1.t r0 = r8.f11810b     // Catch: java.io.EOFException -> L27
            byte[] r0 = r0.f12811a     // Catch: java.io.EOFException -> L27
            r2 = 0
            r3 = 4
            boolean r9 = r9.k(r0, r2, r3, r1)     // Catch: java.io.EOFException -> L27
            r9 = r9 ^ r1
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.d.e(y2.p):boolean");
    }

    @Override // y2.o
    public final boolean f(p pVar) {
        return g(pVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
    
        if (r18 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e2, code lost:
    
        r17.w(r4 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ea, code lost:
    
        r16.j = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ec, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e7, code lost:
    
        r17.v();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(y2.p r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.d.g(y2.p, boolean):boolean");
    }

    @Override // y2.o
    public final List h() {
        i0 i0Var = k0.f4008y;
        return c1.B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        if (r3 != 1231971951) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0394  */
    /* JADX WARN: Type inference failed for: r27v18 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6, types: [y2.z] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r2v53, types: [a3.b] */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [long[]] */
    /* JADX WARN: Type inference failed for: r36v2 */
    @Override // y2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(y2.p r54, mc.i r55) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.d.i(y2.p, mc.i):int");
    }

    @Override // y2.o
    public final void l(q qVar) {
        this.f11815g = qVar;
        f0 A = qVar.A(0, 1);
        this.f11816h = A;
        this.f11817i = A;
        this.f11815g.t();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [y2.x, java.lang.Object] */
    public d(long j) {
        this.f11809a = j;
        this.f11810b = new t(10);
        this.f11811c = new Object();
        this.f11812d = new u();
        this.f11819l = -9223372036854775807L;
        this.f11813e = new w5.a(3);
        n nVar = new n();
        this.f11814f = nVar;
        this.f11817i = nVar;
        this.f11822o = -1L;
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final o d() {
        return this;
    }
}
