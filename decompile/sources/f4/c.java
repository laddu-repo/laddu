package f4;

import db.c1;
import db.k0;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements y2.o {

    /* renamed from: a, reason: collision with root package name */
    public final b f4719a = new b(null, "audio/ac4", 0, 1);

    /* renamed from: b, reason: collision with root package name */
    public final u1.t f4720b = new u1.t(Http2.INITIAL_MAX_FRAME_SIZE);

    /* renamed from: c, reason: collision with root package name */
    public boolean f4721c;

    @Override // y2.o
    public final void c(long j, long j10) {
        this.f4721c = false;
        this.f4719a.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r5.C = 0;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if ((r1 - r3) < 8192) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        return false;
     */
    @Override // y2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(y2.p r15) {
        /*
            r14 = this;
            u1.t r0 = new u1.t
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f12811a
            r5 = r15
            y2.l r5 = (y2.l) r5
            r5.k(r4, r2, r1, r2)
            r0.K(r2)
            int r4 = r0.B()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L8f
            r5.C = r2
            r5.b(r3, r2)
            r1 = r3
        L24:
            r15 = 0
        L25:
            byte[] r4 = r0.f12811a
            r6 = 7
            r5.k(r4, r2, r6, r2)
            r0.K(r2)
            int r4 = r0.E()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r4 == r8) goto L4b
            if (r4 == r9) goto L4b
            r5.C = r2
            int r1 = r1 + 1
            int r15 = r1 - r3
            r4 = 8192(0x2000, float:1.148E-41)
            if (r15 < r4) goto L47
            goto L88
        L47:
            r5.b(r1, r2)
            goto L24
        L4b:
            r8 = 1
            int r15 = r15 + r8
            r10 = 4
            if (r15 < r10) goto L51
            return r8
        L51:
            byte[] r8 = r0.f12811a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r6) goto L59
            r11 = -1
            goto L86
        L59:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r13 = r8[r7]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L80
            r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L81
        L80:
            r6 = 4
        L81:
            if (r4 != r9) goto L85
            int r6 = r6 + 2
        L85:
            int r11 = r11 + r6
        L86:
            if (r11 != r12) goto L89
        L88:
            return r2
        L89:
            int r11 = r11 + (-7)
            r5.b(r11, r2)
            goto L25
        L8f:
            r0.L(r7)
            int r4 = r0.x()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.b(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.c.f(y2.p):boolean");
    }

    @Override // y2.o
    public final List h() {
        db.i0 i0Var = k0.f4008y;
        return c1.B;
    }

    @Override // y2.o
    public final int i(y2.p pVar, mc.i iVar) {
        u1.t tVar = this.f4720b;
        int read = pVar.read(tVar.f12811a, 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (read == -1) {
            return -1;
        }
        tVar.K(0);
        tVar.J(read);
        boolean z10 = this.f4721c;
        b bVar = this.f4719a;
        if (!z10) {
            bVar.f4718o = 0L;
            this.f4721c = true;
        }
        bVar.a(tVar);
        return 0;
    }

    @Override // y2.o
    public final void l(y2.q qVar) {
        this.f4719a.f(qVar, new h0(0, 1));
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
