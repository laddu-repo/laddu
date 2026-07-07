package u1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12803a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f12804b;

    /* renamed from: c, reason: collision with root package name */
    public int f12805c;

    /* renamed from: d, reason: collision with root package name */
    public int f12806d;

    /* renamed from: e, reason: collision with root package name */
    public int f12807e;

    public s() {
        this.f12803a = 0;
        this.f12804b = a0.f12751b;
    }

    public void a() {
        boolean z10;
        int i6;
        boolean z11;
        int i10;
        switch (this.f12803a) {
            case 0:
                int i11 = this.f12805c;
                if (i11 >= 0 && (i11 < (i6 = this.f12807e) || (i11 == i6 && this.f12806d == 0))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c.g(z10);
                return;
            default:
                int i12 = this.f12806d;
                if (i12 >= 0 && (i12 < (i10 = this.f12805c) || (i12 == i10 && this.f12807e == 0))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c.g(z11);
                return;
        }
    }

    public int b() {
        return ((this.f12807e - this.f12805c) * 8) - this.f12806d;
    }

    public void c() {
        if (this.f12806d == 0) {
            return;
        }
        this.f12806d = 0;
        this.f12805c++;
        a();
    }

    public boolean d(int i6) {
        int i10 = this.f12806d;
        int i11 = i6 / 8;
        int i12 = i10 + i11;
        int i13 = (this.f12807e + i6) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 >= this.f12805c) {
                break;
            }
            if (r(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.f12805c;
        if (i12 < i14) {
            return true;
        }
        if (i12 == i14 && i13 == 0) {
            return true;
        }
        return false;
    }

    public boolean e() {
        boolean z10;
        int i6 = this.f12806d;
        int i10 = this.f12807e;
        int i11 = 0;
        while (this.f12806d < this.f12805c && !h()) {
            i11++;
        }
        if (this.f12806d == this.f12805c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12806d = i6;
        this.f12807e = i10;
        if (z10 || !d((i11 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public int f() {
        boolean z10;
        if (this.f12806d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        c.g(z10);
        return this.f12805c;
    }

    public int g() {
        return (this.f12805c * 8) + this.f12806d;
    }

    public boolean h() {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f12803a) {
            case 0:
                if ((this.f12804b[this.f12805c] & (128 >> this.f12806d)) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s();
                return z10;
            case 1:
                if ((this.f12804b[this.f12806d] & (128 >> this.f12807e)) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                s();
                return z11;
            default:
                if ((((this.f12804b[this.f12806d] & 255) >> this.f12807e) & 1) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                t(1);
                return z12;
        }
    }

    public int i(int i6) {
        switch (this.f12803a) {
            case 0:
                if (i6 == 0) {
                    return 0;
                }
                this.f12806d += i6;
                int i10 = 0;
                while (true) {
                    int i11 = this.f12806d;
                    if (i11 > 8) {
                        int i12 = i11 - 8;
                        this.f12806d = i12;
                        byte[] bArr = this.f12804b;
                        int i13 = this.f12805c;
                        this.f12805c = i13 + 1;
                        i10 |= (bArr[i13] & 255) << i12;
                    } else {
                        byte[] bArr2 = this.f12804b;
                        int i14 = this.f12805c;
                        int i15 = ((-1) >>> (32 - i6)) & (i10 | ((bArr2[i14] & 255) >> (8 - i11)));
                        if (i11 == 8) {
                            this.f12806d = 0;
                            this.f12805c = i14 + 1;
                        }
                        a();
                        return i15;
                    }
                }
            case 1:
                this.f12807e += i6;
                int i16 = 0;
                while (true) {
                    int i17 = this.f12807e;
                    int i18 = 2;
                    if (i17 > 8) {
                        int i19 = i17 - 8;
                        this.f12807e = i19;
                        byte[] bArr3 = this.f12804b;
                        int i20 = this.f12806d;
                        i16 |= (bArr3[i20] & 255) << i19;
                        if (!r(i20 + 1)) {
                            i18 = 1;
                        }
                        this.f12806d = i20 + i18;
                    } else {
                        byte[] bArr4 = this.f12804b;
                        int i21 = this.f12806d;
                        int i22 = ((-1) >>> (32 - i6)) & (i16 | ((bArr4[i21] & 255) >> (8 - i17)));
                        if (i17 == 8) {
                            this.f12807e = 0;
                            if (!r(i21 + 1)) {
                                i18 = 1;
                            }
                            this.f12806d = i21 + i18;
                        }
                        a();
                        return i22;
                    }
                }
            default:
                int i23 = this.f12806d;
                int min = Math.min(i6, 8 - this.f12807e);
                byte[] bArr5 = this.f12804b;
                int i24 = i23 + 1;
                int i25 = ((bArr5[i23] & 255) >> this.f12807e) & (255 >> (8 - min));
                while (min < i6) {
                    i25 |= (bArr5[i24] & 255) << min;
                    min += 8;
                    i24++;
                }
                int i26 = i25 & ((-1) >>> (32 - i6));
                t(i6);
                return i26;
        }
    }

    public void j(int i6, byte[] bArr) {
        int i10 = i6 >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = this.f12804b;
            int i12 = this.f12805c;
            int i13 = i12 + 1;
            this.f12805c = i13;
            byte b10 = bArr2[i12];
            int i14 = this.f12806d;
            byte b11 = (byte) (b10 << i14);
            bArr[i11] = b11;
            bArr[i11] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b11);
        }
        int i15 = i6 & 7;
        if (i15 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b12;
        int i16 = this.f12806d;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f12804b;
            int i17 = this.f12805c;
            this.f12805c = i17 + 1;
            bArr[i10] = (byte) (b12 | ((bArr3[i17] & 255) << i16));
            this.f12806d = i16 - 8;
        }
        int i18 = this.f12806d + i15;
        this.f12806d = i18;
        byte[] bArr4 = this.f12804b;
        int i19 = this.f12805c;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i10]);
        if (i18 == 8) {
            this.f12806d = 0;
            this.f12805c = i19 + 1;
        }
        a();
    }

    public long k(int i6) {
        if (i6 <= 32) {
            int i10 = i(i6);
            String str = a0.f12750a;
            return 4294967295L & i10;
        }
        int i11 = i(i6 - 32);
        int i12 = i(32);
        String str2 = a0.f12750a;
        return (4294967295L & i12) | ((i11 & 4294967295L) << 32);
    }

    public void l(int i6, byte[] bArr) {
        boolean z10;
        if (this.f12806d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        c.g(z10);
        System.arraycopy(this.f12804b, this.f12805c, bArr, 0, i6);
        this.f12805c += i6;
        a();
    }

    public int m() {
        int i6 = 0;
        int i10 = 0;
        while (!h()) {
            i10++;
        }
        int i11 = (1 << i10) - 1;
        if (i10 > 0) {
            i6 = i(i10);
        }
        return i11 + i6;
    }

    public int n() {
        int i6;
        int m9 = m();
        if (m9 % 2 == 0) {
            i6 = -1;
        } else {
            i6 = 1;
        }
        return ((m9 + 1) / 2) * i6;
    }

    public void o(int i6, byte[] bArr) {
        this.f12804b = bArr;
        this.f12805c = 0;
        this.f12806d = 0;
        this.f12807e = i6;
    }

    public void p(t tVar) {
        o(tVar.f12813c, tVar.f12811a);
        q(tVar.f12812b * 8);
    }

    public void q(int i6) {
        int i10 = i6 / 8;
        this.f12805c = i10;
        this.f12806d = i6 - (i10 * 8);
        a();
    }

    public boolean r(int i6) {
        if (2 <= i6 && i6 < this.f12805c) {
            byte[] bArr = this.f12804b;
            if (bArr[i6] == 3 && bArr[i6 - 2] == 0 && bArr[i6 - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void s() {
        switch (this.f12803a) {
            case 0:
                int i6 = this.f12806d + 1;
                this.f12806d = i6;
                if (i6 == 8) {
                    this.f12806d = 0;
                    this.f12805c++;
                }
                a();
                return;
            default:
                int i10 = 1;
                int i11 = this.f12807e + 1;
                this.f12807e = i11;
                if (i11 == 8) {
                    this.f12807e = 0;
                    int i12 = this.f12806d;
                    if (r(i12 + 1)) {
                        i10 = 2;
                    }
                    this.f12806d = i12 + i10;
                }
                a();
                return;
        }
    }

    public void t(int i6) {
        int i10;
        switch (this.f12803a) {
            case 0:
                int i11 = i6 / 8;
                int i12 = this.f12805c + i11;
                this.f12805c = i12;
                int i13 = (i6 - (i11 * 8)) + this.f12806d;
                this.f12806d = i13;
                if (i13 > 7) {
                    this.f12805c = i12 + 1;
                    this.f12806d = i13 - 8;
                }
                a();
                return;
            case 1:
                int i14 = this.f12806d;
                int i15 = i6 / 8;
                int i16 = i14 + i15;
                this.f12806d = i16;
                int i17 = (i6 - (i15 * 8)) + this.f12807e;
                this.f12807e = i17;
                if (i17 > 7) {
                    this.f12806d = i16 + 1;
                    this.f12807e = i17 - 8;
                }
                while (true) {
                    i14++;
                    if (i14 <= this.f12806d) {
                        if (r(i14)) {
                            this.f12806d++;
                            i14 += 2;
                        }
                    } else {
                        a();
                        return;
                    }
                }
            default:
                int i18 = i6 / 8;
                int i19 = this.f12806d + i18;
                this.f12806d = i19;
                int i20 = (i6 - (i18 * 8)) + this.f12807e;
                this.f12807e = i20;
                boolean z10 = true;
                if (i20 > 7) {
                    this.f12806d = i19 + 1;
                    this.f12807e = i20 - 8;
                }
                int i21 = this.f12806d;
                if (i21 < 0 || (i21 >= (i10 = this.f12805c) && (i21 != i10 || this.f12807e != 0))) {
                    z10 = false;
                }
                c.g(z10);
                return;
        }
    }

    public void u(int i6) {
        boolean z10;
        if (this.f12806d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        c.g(z10);
        this.f12805c += i6;
        a();
    }

    public s(byte[] bArr) {
        this.f12803a = 3;
        this.f12804b = bArr;
        this.f12805c = bArr.length;
    }

    public s(byte[] bArr, int i6, int i10) {
        this.f12803a = 1;
        this.f12804b = bArr;
        this.f12806d = i6;
        this.f12805c = i10;
        this.f12807e = 0;
        a();
    }

    public s(int i6, byte[] bArr) {
        this.f12803a = 0;
        this.f12804b = bArr;
        this.f12807e = i6;
    }

    public s(int i6, int i10) {
        this.f12803a = 2;
        this.f12805c = i6;
        this.f12806d = i10;
        this.f12804b = new byte[(i10 * 2) - 1];
        this.f12807e = 0;
    }
}
