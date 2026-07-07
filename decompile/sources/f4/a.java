package f4;

import db.c1;
import db.k0;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements y2.o {

    /* renamed from: a, reason: collision with root package name */
    public final b f4692a = new b("audio/ac3");

    /* renamed from: b, reason: collision with root package name */
    public final u1.t f4693b = new u1.t(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f4694c;

    @Override // y2.o
    public final void c(long j, long j10) {
        this.f4694c = false;
        this.f4692a.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        r5.C = 0;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    @Override // y2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(y2.p r14) {
        /*
            r13 = this;
            u1.t r0 = new u1.t
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f12811a
            r5 = r14
            y2.l r5 = (y2.l) r5
            r5.k(r4, r2, r1, r2)
            r0.K(r2)
            int r4 = r0.B()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L80
            r5.C = r2
            r5.b(r3, r2)
            r4 = r3
        L24:
            r14 = 0
        L25:
            byte[] r6 = r0.f12811a
            r8 = 6
            r5.k(r6, r2, r8, r2)
            r0.K(r2)
            int r6 = r0.E()
            r9 = 2935(0xb77, float:4.113E-42)
            if (r6 == r9) goto L45
            r5.C = r2
            int r4 = r4 + 1
            int r14 = r4 - r3
            r6 = 8192(0x2000, float:1.148E-41)
            if (r14 < r6) goto L41
            goto L79
        L41:
            r5.b(r4, r2)
            goto L24
        L45:
            r6 = 1
            int r14 = r14 + r6
            r9 = 4
            if (r14 < r9) goto L4b
            return r6
        L4b:
            byte[] r10 = r0.f12811a
            int r11 = r10.length
            r12 = -1
            if (r11 >= r8) goto L53
            r9 = -1
            goto L77
        L53:
            r11 = 5
            r11 = r10[r11]
            r11 = r11 & 248(0xf8, float:3.48E-43)
            int r11 = r11 >> r7
            if (r11 <= r1) goto L6b
            r8 = 2
            r9 = r10[r8]
            r9 = r9 & 7
            int r9 = r9 << 8
            r10 = r10[r7]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r9 = r9 | r10
            int r9 = r9 + r6
            int r9 = r9 * 2
            goto L77
        L6b:
            r6 = r10[r9]
            r9 = r6 & 192(0xc0, float:2.69E-43)
            int r8 = r9 >> 6
            r6 = r6 & 63
            int r9 = y2.a.h(r8, r6)
        L77:
            if (r9 != r12) goto L7a
        L79:
            return r2
        L7a:
            int r9 = r9 + (-6)
            r5.b(r9, r2)
            goto L25
        L80:
            r0.L(r7)
            int r4 = r0.x()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.b(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.a.f(y2.p):boolean");
    }

    @Override // y2.o
    public final List h() {
        db.i0 i0Var = k0.f4008y;
        return c1.B;
    }

    @Override // y2.o
    public final int i(y2.p pVar, mc.i iVar) {
        u1.t tVar = this.f4693b;
        int read = pVar.read(tVar.f12811a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        tVar.K(0);
        tVar.J(read);
        boolean z10 = this.f4694c;
        b bVar = this.f4692a;
        if (!z10) {
            bVar.f4718o = 0L;
            this.f4694c = true;
        }
        bVar.a(tVar);
        return 0;
    }

    @Override // y2.o
    public final void l(y2.q qVar) {
        this.f4692a.f(qVar, new h0(0, 1));
        qVar.t();
        qVar.n(new a3.b(-9223372036854775807L));
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final y2.o d() {
        return this;
    }
}
