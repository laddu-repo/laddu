package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f773e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f775h;
    public int i = Integer.MAX_VALUE;

    public h(byte[] bArr, int i, int i10, boolean z2) {
        this.f771c = bArr;
        this.f772d = i10 + i;
        this.f = i;
        this.f774g = i;
    }

    public final int A() throws z {
        int i = this.f;
        if (this.f772d - i < 4) {
            throw z.e();
        }
        this.f = i + 4;
        byte[] bArr = this.f771c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long B() throws z {
        int i = this.f;
        if (this.f772d - i < 8) {
            throw z.e();
        }
        this.f = i + 8;
        byte[] bArr = this.f771c;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int C() {
        int i;
        int i10 = this.f;
        int i11 = this.f772d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f771c;
            byte b9 = bArr[i10];
            if (b9 >= 0) {
                this.f = i12;
                return b9;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b9;
                if (i14 < 0) {
                    i = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (i18 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i19;
                            }
                            i = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f = i13;
                return i;
            }
        }
        return (int) E();
    }

    public final long D() {
        long j8;
        long j9;
        long j10;
        long j11;
        int i = this.f;
        int i10 = this.f772d;
        if (i10 != i) {
            int i11 = i + 1;
            byte[] bArr = this.f771c;
            byte b9 = bArr[i];
            if (b9 >= 0) {
                this.f = i11;
                return b9;
            }
            if (i10 - i11 >= 9) {
                int i12 = i + 2;
                int i13 = (bArr[i11] << 7) ^ b9;
                if (i13 < 0) {
                    j8 = i13 ^ (-128);
                } else {
                    int i14 = i + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j8 = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j11 = (-2080896) ^ i17;
                        } else {
                            long j12 = i17;
                            i12 = i + 5;
                            long j13 = j12 ^ (((long) bArr[i16]) << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                i16 = i + 6;
                                long j14 = j13 ^ (((long) bArr[i12]) << 35);
                                if (j14 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    i12 = i + 7;
                                    j13 = j14 ^ (((long) bArr[i16]) << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i16 = i + 8;
                                        j14 = j13 ^ (((long) bArr[i12]) << 49);
                                        if (j14 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            i12 = i + 9;
                                            long j15 = (j14 ^ (((long) bArr[i16]) << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                int i18 = i + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j8 = j15;
                                        }
                                    }
                                }
                                j11 = j9 ^ j14;
                            }
                            j8 = j10 ^ j13;
                        }
                        i12 = i16;
                        j8 = j11;
                    }
                }
                this.f = i12;
                return j8;
            }
        }
        return E();
    }

    public final long E() throws z {
        long j8 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i10 = this.f;
            if (i10 == this.f772d) {
                throw z.e();
            }
            this.f = i10 + 1;
            byte b9 = this.f771c[i10];
            j8 |= ((long) (b9 & 127)) << i;
            if ((b9 & 128) == 0) {
                return j8;
            }
        }
        throw z.c();
    }

    public final void F() {
        int i = this.f772d + this.f773e;
        this.f772d = i;
        int i10 = i - this.f774g;
        int i11 = this.i;
        if (i10 <= i11) {
            this.f773e = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f773e = i12;
        this.f772d = i - i12;
    }

    public final void G(int i) throws z {
        if (i >= 0) {
            int i10 = this.f772d;
            int i11 = this.f;
            if (i <= i10 - i11) {
                this.f = i11 + i;
                return;
            }
        }
        if (i >= 0) {
            throw z.e();
        }
        throw z.d();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void a(int i) throws z {
        if (this.f775h != i) {
            throw new z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int b() {
        return this.f - this.f774g;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean c() {
        return this.f == this.f772d;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void d(int i) {
        this.i = i;
        F();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int e(int i) throws z {
        if (i < 0) {
            throw z.d();
        }
        int iB = b() + i;
        if (iB < 0) {
            throw new z("Failed to parse the message.");
        }
        int i10 = this.i;
        if (iB > i10) {
            throw z.e();
        }
        this.i = iB;
        F();
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean f() {
        return D() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // androidx.datastore.preferences.protobuf.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.datastore.preferences.protobuf.g g() throws androidx.datastore.preferences.protobuf.z {
        /*
            r4 = this;
            int r0 = r4.C()
            byte[] r1 = r4.f771c
            if (r0 <= 0) goto L19
            int r2 = r4.f772d
            int r3 = r4.f
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            androidx.datastore.preferences.protobuf.g r1 = androidx.datastore.preferences.protobuf.g.c(r1, r3, r0)
            int r2 = r4.f
            int r2 = r2 + r0
            r4.f = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            androidx.datastore.preferences.protobuf.g r0 = androidx.datastore.preferences.protobuf.g.f765x
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f772d
            int r3 = r4.f
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = androidx.datastore.preferences.protobuf.x.f871b
        L35:
            androidx.datastore.preferences.protobuf.g r1 = androidx.datastore.preferences.protobuf.g.f765x
            androidx.datastore.preferences.protobuf.g r1 = new androidx.datastore.preferences.protobuf.g
            r1.<init>(r0)
            return r1
        L3d:
            androidx.datastore.preferences.protobuf.z r0 = androidx.datastore.preferences.protobuf.z.d()
            throw r0
        L42:
            androidx.datastore.preferences.protobuf.z r0 = androidx.datastore.preferences.protobuf.z.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.g():androidx.datastore.preferences.protobuf.g");
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final double h() {
        return Double.longBitsToDouble(B());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int i() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int j() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long k() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final float l() {
        return Float.intBitsToFloat(A());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int m() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long n() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int o() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long p() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int q() {
        int iC = C();
        return (-(iC & 1)) ^ (iC >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long r() {
        long jD = D();
        return (-(jD & 1)) ^ (jD >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String s() throws z {
        int iC = C();
        if (iC > 0) {
            int i = this.f772d;
            int i10 = this.f;
            if (iC <= i - i10) {
                String str = new String(this.f771c, i10, iC, x.f870a);
                this.f += iC;
                return str;
            }
        }
        if (iC == 0) {
            return "";
        }
        if (iC < 0) {
            throw z.d();
        }
        throw z.e();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String t() throws z {
        int iC = C();
        if (iC > 0) {
            int i = this.f772d;
            int i10 = this.f;
            if (iC <= i - i10) {
                String strH = k1.f799a.h(this.f771c, i10, iC);
                this.f += iC;
                return strH;
            }
        }
        if (iC == 0) {
            return "";
        }
        if (iC <= 0) {
            throw z.d();
        }
        throw z.e();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int u() throws z {
        if (c()) {
            this.f775h = 0;
            return 0;
        }
        int iC = C();
        this.f775h = iC;
        if ((iC >>> 3) != 0) {
            return iC;
        }
        throw new z("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int v() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long w() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean x(int i) throws z {
        int i10 = i & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                G(8);
                return true;
            }
            if (i10 == 2) {
                G(C());
                return true;
            }
            if (i10 == 3) {
                y();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw z.b();
            }
            G(4);
            return true;
        }
        int i12 = this.f772d - this.f;
        byte[] bArr = this.f771c;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f;
                this.f = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw z.c();
        }
        while (i11 < 10) {
            int i14 = this.f;
            if (i14 == this.f772d) {
                throw z.e();
            }
            this.f = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw z.c();
        return true;
    }
}
