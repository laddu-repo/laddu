package z2;

import db.c1;
import db.i0;
import db.k0;
import j2.y;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import r1.l0;
import u1.a0;
import y2.f0;
import y2.n;
import y2.o;
import y2.p;
import y2.q;
import y2.w;
import y2.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f15119q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f15120r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f15121t;

    /* renamed from: b, reason: collision with root package name */
    public final n f15123b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15124c;

    /* renamed from: d, reason: collision with root package name */
    public long f15125d;

    /* renamed from: e, reason: collision with root package name */
    public int f15126e;

    /* renamed from: f, reason: collision with root package name */
    public int f15127f;

    /* renamed from: h, reason: collision with root package name */
    public int f15129h;

    /* renamed from: i, reason: collision with root package name */
    public long f15130i;
    public q j;

    /* renamed from: k, reason: collision with root package name */
    public f0 f15131k;

    /* renamed from: l, reason: collision with root package name */
    public f0 f15132l;

    /* renamed from: m, reason: collision with root package name */
    public z f15133m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15134n;

    /* renamed from: o, reason: collision with root package name */
    public long f15135o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15136p;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f15122a = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    public int f15128g = -1;

    static {
        String str = a0.f12750a;
        Charset charset = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(charset);
        f15121t = "#!AMR-WB\n".getBytes(charset);
    }

    public a() {
        n nVar = new n();
        this.f15123b = nVar;
        this.f15132l = nVar;
    }

    public final int b(p pVar) {
        String str;
        boolean z10;
        pVar.v();
        byte[] bArr = this.f15122a;
        pVar.C(bArr, 0, 1);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i6 = (b10 >> 3) & 15;
            if (i6 >= 0 && i6 <= 15 && (((z10 = this.f15124c) && (i6 < 10 || i6 > 13)) || (!z10 && (i6 < 12 || i6 > 14)))) {
                if (z10) {
                    return f15120r[i6];
                }
                return f15119q[i6];
            }
            StringBuilder sb2 = new StringBuilder("Illegal AMR ");
            if (this.f15124c) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i6);
            throw l0.a(null, sb2.toString());
        }
        throw l0.a(null, "Invalid padding bits for frame header " + ((int) b10));
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        long k8;
        this.f15125d = 0L;
        this.f15126e = 0;
        this.f15127f = 0;
        this.f15135o = j10;
        z zVar = this.f15133m;
        if (zVar instanceof w) {
            w wVar = (w) zVar;
            y yVar = wVar.f14961b;
            if (yVar.f7144y == 0) {
                k8 = -9223372036854775807L;
            } else {
                k8 = yVar.k(a0.b(wVar.f14960a, j));
            }
            this.f15130i = k8;
            if (Math.abs(this.f15135o - k8) < 20000) {
                return;
            }
            this.f15134n = true;
            this.f15132l = this.f15123b;
            return;
        }
        if (j != 0 && (zVar instanceof r3.a)) {
            this.f15130i = (Math.max(0L, j - ((r3.a) zVar).f11796b) * 8000000) / r7.f11799e;
            return;
        }
        this.f15130i = 0L;
    }

    public final boolean e(p pVar) {
        pVar.v();
        byte[] bArr = s;
        byte[] bArr2 = new byte[bArr.length];
        pVar.C(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f15124c = false;
            pVar.w(bArr.length);
            return true;
        }
        pVar.v();
        byte[] bArr3 = f15121t;
        byte[] bArr4 = new byte[bArr3.length];
        pVar.C(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f15124c = true;
        pVar.w(bArr3.length);
        return true;
    }

    @Override // y2.o
    public final boolean f(p pVar) {
        return e(pVar);
    }

    @Override // y2.o
    public final List h() {
        i0 i0Var = k0.f4008y;
        return c1.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0132  */
    @Override // y2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(y2.p r19, mc.i r20) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.a.i(y2.p, mc.i):int");
    }

    @Override // y2.o
    public final void l(q qVar) {
        this.j = qVar;
        f0 A = qVar.A(0, 1);
        this.f15131k = A;
        this.f15132l = A;
        qVar.t();
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final o d() {
        return this;
    }
}
