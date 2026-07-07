package u3;

import w1.b0;
import w1.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f12868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12871e;

    public f() {
        this.f12867a = 1;
        this.f12868b = b0.f13688c;
    }

    public void a() {
        int i;
        int i10;
        switch (this.f12867a) {
            case 1:
                int i11 = this.f12869c;
                w1.a.j(i11 >= 0 && (i11 < (i = this.f12871e) || (i11 == i && this.f12870d == 0)));
                break;
            default:
                int i12 = this.f12870d;
                w1.a.j(i12 >= 0 && (i12 < (i10 = this.f12869c) || (i12 == i10 && this.f12871e == 0)));
                break;
        }
    }

    public int b() {
        return ((this.f12871e - this.f12869c) * 8) - this.f12870d;
    }

    public void c() {
        if (this.f12870d == 0) {
            return;
        }
        this.f12870d = 0;
        this.f12869c++;
        a();
    }

    public boolean d(int i) {
        int i10 = this.f12870d;
        int i11 = i / 8;
        int i12 = i10 + i11;
        int i13 = (this.f12871e + i) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 >= this.f12869c) {
                break;
            }
            if (r(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.f12869c;
        if (i12 >= i14) {
            return i12 == i14 && i13 == 0;
        }
        return true;
    }

    public boolean e() {
        int i = this.f12870d;
        int i10 = this.f12871e;
        int i11 = 0;
        while (this.f12870d < this.f12869c && !h()) {
            i11++;
        }
        boolean z2 = this.f12870d == this.f12869c;
        this.f12870d = i;
        this.f12871e = i10;
        return !z2 && d((i11 * 2) + 1);
    }

    public int f() {
        w1.a.j(this.f12870d == 0);
        return this.f12869c;
    }

    public int g() {
        return (this.f12869c * 8) + this.f12870d;
    }

    public boolean h() {
        switch (this.f12867a) {
            case 1:
                boolean z2 = (this.f12868b[this.f12869c] & (128 >> this.f12870d)) != 0;
                s();
                return z2;
            case 2:
                boolean z10 = (((this.f12868b[this.f12870d] & 255) >> this.f12871e) & 1) == 1;
                t(1);
                return z10;
            default:
                boolean z11 = (this.f12868b[this.f12870d] & (128 >> this.f12871e)) != 0;
                s();
                return z11;
        }
    }

    public int i(int i) {
        switch (this.f12867a) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.f12870d += i;
                int i10 = 0;
                while (true) {
                    int i11 = this.f12870d;
                    if (i11 <= 8) {
                        byte[] bArr = this.f12868b;
                        int i12 = this.f12869c;
                        int i13 = ((-1) >>> (32 - i)) & (i10 | ((bArr[i12] & 255) >> (8 - i11)));
                        if (i11 == 8) {
                            this.f12870d = 0;
                            this.f12869c = i12 + 1;
                        }
                        a();
                        return i13;
                    }
                    int i14 = i11 - 8;
                    this.f12870d = i14;
                    byte[] bArr2 = this.f12868b;
                    int i15 = this.f12869c;
                    this.f12869c = i15 + 1;
                    i10 |= (bArr2[i15] & 255) << i14;
                }
                break;
            case 2:
                int i16 = this.f12870d;
                int iMin = Math.min(i, 8 - this.f12871e);
                byte[] bArr3 = this.f12868b;
                int i17 = i16 + 1;
                int i18 = ((bArr3[i16] & 255) >> this.f12871e) & (255 >> (8 - iMin));
                while (iMin < i) {
                    i18 |= (bArr3[i17] & 255) << iMin;
                    iMin += 8;
                    i17++;
                }
                int i19 = i18 & ((-1) >>> (32 - i));
                t(i);
                return i19;
            default:
                this.f12871e += i;
                int i20 = 0;
                while (true) {
                    int i21 = this.f12871e;
                    if (i21 <= 8) {
                        byte[] bArr4 = this.f12868b;
                        int i22 = this.f12870d;
                        int i23 = ((-1) >>> (32 - i)) & (i20 | ((bArr4[i22] & 255) >> (8 - i21)));
                        if (i21 == 8) {
                            this.f12871e = 0;
                            this.f12870d = i22 + (r(i22 + 1) ? 2 : 1);
                        }
                        a();
                        return i23;
                    }
                    int i24 = i21 - 8;
                    this.f12871e = i24;
                    byte[] bArr5 = this.f12868b;
                    int i25 = this.f12870d;
                    i20 |= (bArr5[i25] & 255) << i24;
                    if (!r(i25 + 1)) {
                        i = 1;
                    }
                    this.f12870d = i25 + i;
                }
                break;
        }
    }

    public void j(int i, byte[] bArr) {
        int i10 = i >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = this.f12868b;
            int i12 = this.f12869c;
            int i13 = i12 + 1;
            this.f12869c = i13;
            byte b9 = bArr2[i12];
            int i14 = this.f12870d;
            byte b10 = (byte) (b9 << i14);
            bArr[i11] = b10;
            bArr[i11] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b10);
        }
        int i15 = i & 7;
        if (i15 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b11;
        int i16 = this.f12870d;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f12868b;
            int i17 = this.f12869c;
            this.f12869c = i17 + 1;
            bArr[i10] = (byte) (b11 | ((bArr3[i17] & 255) << i16));
            this.f12870d = i16 - 8;
        }
        int i18 = this.f12870d + i15;
        this.f12870d = i18;
        byte[] bArr4 = this.f12868b;
        int i19 = this.f12869c;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i10]);
        if (i18 == 8) {
            this.f12870d = 0;
            this.f12869c = i19 + 1;
        }
        a();
    }

    public long k(int i) {
        if (i <= 32) {
            int i10 = i(i);
            int i11 = b0.f13686a;
            return 4294967295L & ((long) i10);
        }
        int i12 = i(i - 32);
        int i13 = i(32);
        int i14 = b0.f13686a;
        return (4294967295L & ((long) i13)) | ((((long) i12) & 4294967295L) << 32);
    }

    public void l(int i, byte[] bArr) {
        w1.a.j(this.f12870d == 0);
        System.arraycopy(this.f12868b, this.f12869c, bArr, 0, i);
        this.f12869c += i;
        a();
    }

    public int m() {
        int i = 0;
        while (!h()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? i(i) : 0);
    }

    public int n() {
        int iM = m();
        return ((iM + 1) / 2) * (iM % 2 == 0 ? -1 : 1);
    }

    public void o(int i, byte[] bArr) {
        this.f12868b = bArr;
        this.f12869c = 0;
        this.f12870d = 0;
        this.f12871e = i;
    }

    public void p(t tVar) {
        o(tVar.f13740c, tVar.f13738a);
        q(tVar.f13739b * 8);
    }

    public void q(int i) {
        int i10 = i / 8;
        this.f12869c = i10;
        this.f12870d = i - (i10 * 8);
        a();
    }

    public boolean r(int i) {
        if (2 > i || i >= this.f12869c) {
            return false;
        }
        byte[] bArr = this.f12868b;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    public void s() {
        switch (this.f12867a) {
            case 1:
                int i = this.f12870d + 1;
                this.f12870d = i;
                if (i == 8) {
                    this.f12870d = 0;
                    this.f12869c++;
                }
                a();
                break;
            default:
                int i10 = this.f12871e + 1;
                this.f12871e = i10;
                if (i10 == 8) {
                    this.f12871e = 0;
                    int i11 = this.f12870d;
                    this.f12870d = i11 + (r(i11 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void t(int i) {
        int i10;
        switch (this.f12867a) {
            case 1:
                int i11 = i / 8;
                int i12 = this.f12869c + i11;
                this.f12869c = i12;
                int i13 = (i - (i11 * 8)) + this.f12870d;
                this.f12870d = i13;
                if (i13 > 7) {
                    this.f12869c = i12 + 1;
                    this.f12870d = i13 - 8;
                }
                a();
                break;
            case 2:
                int i14 = i / 8;
                int i15 = this.f12870d + i14;
                this.f12870d = i15;
                int i16 = (i - (i14 * 8)) + this.f12871e;
                this.f12871e = i16;
                boolean z2 = true;
                if (i16 > 7) {
                    this.f12870d = i15 + 1;
                    this.f12871e = i16 - 8;
                }
                int i17 = this.f12870d;
                if (i17 < 0 || (i17 >= (i10 = this.f12869c) && (i17 != i10 || this.f12871e != 0))) {
                    z2 = false;
                }
                w1.a.j(z2);
                break;
            default:
                int i18 = this.f12870d;
                int i19 = i / 8;
                int i20 = i18 + i19;
                this.f12870d = i20;
                int i21 = (i - (i19 * 8)) + this.f12871e;
                this.f12871e = i21;
                if (i21 > 7) {
                    this.f12870d = i20 + 1;
                    this.f12871e = i21 - 8;
                }
                while (true) {
                    i18++;
                    if (i18 > this.f12870d) {
                        a();
                        break;
                    } else if (r(i18)) {
                        this.f12870d++;
                        i18 += 2;
                    }
                }
                break;
        }
    }

    public void u(int i) {
        w1.a.j(this.f12870d == 0);
        this.f12869c += i;
        a();
    }

    public f(byte[] bArr) {
        this.f12867a = 2;
        this.f12868b = bArr;
        this.f12869c = bArr.length;
    }

    public f(byte[] bArr, int i, int i10) {
        this.f12867a = 3;
        this.f12868b = bArr;
        this.f12870d = i;
        this.f12869c = i10;
        this.f12871e = 0;
        a();
    }

    public f(int i, byte[] bArr) {
        this.f12867a = 1;
        this.f12868b = bArr;
        this.f12871e = i;
    }

    public f(int i, int i10) {
        this.f12867a = 0;
        this.f12869c = i;
        this.f12870d = i10;
        this.f12868b = new byte[(i10 * 2) - 1];
        this.f12871e = 0;
    }
}
