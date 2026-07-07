package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b5 extends c5 {
    public final int A;

    public b5(int i6, byte[] bArr) {
        super(bArr);
        c5.e(0, i6, bArr.length);
        this.A = i6;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final byte a(int i6) {
        int i10 = this.A;
        if (((i10 - (i6 + 1)) | i6) < 0) {
            if (i6 < 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 11);
                sb2.append("Index < 0: ");
                sb2.append(i6);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(i6).length() + 18 + String.valueOf(i10).length());
            sb3.append("Index > length: ");
            sb3.append(i6);
            sb3.append(", ");
            sb3.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb3.toString());
        }
        return this.f2168y[i6];
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final byte b(int i6) {
        return this.f2168y[i6];
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final int c() {
        return this.A;
    }
}
