package v3;

import db.c1;
import db.i0;
import java.util.ArrayList;
import java.util.List;
import r1.k0;
import r1.p;
import r1.q;
import u1.a0;
import u1.t;
import y2.f0;
import y2.o;
import y2.w;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements o {

    /* renamed from: a, reason: collision with root package name */
    public final m f13271a;

    /* renamed from: b, reason: collision with root package name */
    public final q f13272b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f13273c;

    /* renamed from: f, reason: collision with root package name */
    public f0 f13276f;

    /* renamed from: g, reason: collision with root package name */
    public int f13277g;

    /* renamed from: h, reason: collision with root package name */
    public int f13278h;

    /* renamed from: i, reason: collision with root package name */
    public long[] f13279i;
    public long j;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f13275e = a0.f12751b;

    /* renamed from: d, reason: collision with root package name */
    public final t f13274d = new t();

    public h(m mVar, q qVar) {
        q qVar2;
        this.f13271a = mVar;
        if (qVar != null) {
            p a10 = qVar.a();
            a10.f11611m = k0.p("application/x-media3-cues");
            a10.j = qVar.f11670n;
            a10.K = mVar.B();
            qVar2 = new q(a10);
        } else {
            qVar2 = null;
        }
        this.f13272b = qVar2;
        this.f13273c = new ArrayList();
        this.f13278h = 0;
        this.f13279i = a0.f12752c;
        this.j = -9223372036854775807L;
    }

    @Override // y2.o
    public final void a() {
        if (this.f13278h == 5) {
            return;
        }
        this.f13271a.reset();
        this.f13278h = 5;
    }

    public final void b(g gVar) {
        u1.c.h(this.f13276f);
        byte[] bArr = gVar.f13270y;
        int length = bArr.length;
        t tVar = this.f13274d;
        tVar.getClass();
        tVar.I(bArr.length, bArr);
        this.f13276f.a(length, tVar);
        this.f13276f.c(gVar.f13269x, 1, length, 0, null);
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        boolean z10;
        int i6 = this.f13278h;
        if (i6 != 0 && i6 != 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        this.j = j10;
        if (this.f13278h == 2) {
            this.f13278h = 1;
        }
        if (this.f13278h == 4) {
            this.f13278h = 3;
        }
    }

    @Override // y2.o
    public final boolean f(y2.p pVar) {
        return true;
    }

    @Override // y2.o
    public final List h() {
        i0 i0Var = db.k0.f4008y;
        return c1.B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r20.f13277g != r14) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r2 == (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007f, code lost:
    
        r4 = r20.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0083, code lost:
    
        if (r4 == (-9223372036854775807L)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0085, code lost:
    
        r2 = new v3.l(true, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0090, code lost:
    
        r20.f13271a.o(r20.f13275e, 0, r20.f13277g, r2, new j2.u(r20, 14));
        java.util.Collections.sort(r11);
        r20.f13279i = new long[r11.size()];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
    
        if (r2 >= r11.size()) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        r20.f13279i[r2] = ((v3.g) r11.get(r2)).f13269x;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:
    
        r20.f13275e = u1.a0.f12751b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        r20.f13278h = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008d, code lost:
    
        r2 = v3.l.f13282c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        throw r1.l0.a(r0, "SubtitleParser failed.");
     */
    @Override // y2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(y2.p r21, mc.i r22) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.h.i(y2.p, mc.i):int");
    }

    @Override // y2.o
    public final void l(y2.q qVar) {
        boolean z10;
        if (this.f13278h == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        f0 A = qVar.A(0, 3);
        this.f13276f = A;
        q qVar2 = this.f13272b;
        if (qVar2 != null) {
            A.f(qVar2);
            qVar.t();
            qVar.n(new w(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.f13278h = 1;
    }

    @Override // y2.o
    public final o d() {
        return this;
    }
}
