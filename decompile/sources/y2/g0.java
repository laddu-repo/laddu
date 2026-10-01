package y2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f14901a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f14902b;

    /* renamed from: c, reason: collision with root package name */
    public int f14903c;

    /* renamed from: d, reason: collision with root package name */
    public long f14904d;

    /* renamed from: e, reason: collision with root package name */
    public int f14905e;

    /* renamed from: f, reason: collision with root package name */
    public int f14906f;

    /* renamed from: g, reason: collision with root package name */
    public int f14907g;

    public final void a(f0 f0Var, e0 e0Var) {
        if (this.f14903c > 0) {
            f0Var.c(this.f14904d, this.f14905e, this.f14906f, this.f14907g, e0Var);
            this.f14903c = 0;
        }
    }

    public final void b(f0 f0Var, long j, int i6, int i10, int i11, e0 e0Var) {
        boolean z10;
        if (this.f14907g <= i10 + i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.f("TrueHD chunk samples must be contiguous in the sample queue.", z10);
        if (this.f14902b) {
            int i12 = this.f14903c;
            int i13 = i12 + 1;
            this.f14903c = i13;
            if (i12 == 0) {
                this.f14904d = j;
                this.f14905e = i6;
                this.f14906f = 0;
            }
            this.f14906f += i10;
            this.f14907g = i11;
            if (i13 >= 16) {
                a(f0Var, e0Var);
            }
        }
    }

    public final void c(p pVar) {
        char c10;
        if (!this.f14902b) {
            byte[] bArr = this.f14901a;
            int i6 = 0;
            pVar.C(bArr, 0, 10);
            pVar.v();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b10 = bArr[7];
                if ((b10 & 254) == 186) {
                    if ((b10 & 255) == 187) {
                        i6 = 1;
                    }
                    if (i6 != 0) {
                        c10 = '\t';
                    } else {
                        c10 = '\b';
                    }
                    i6 = 40 << ((bArr[c10] >> 4) & 7);
                }
            }
            if (i6 == 0) {
                return;
            }
            this.f14902b = true;
        }
    }
}
