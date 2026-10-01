package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ra extends u7.a implements Comparable {
    public static final Parcelable.Creator<ra> CREATOR = new i7(6);
    public final byte[] A;
    public final int B;
    public final int C;
    public final int D;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f3044v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f3045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f3046x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final double f3047y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f3048z;

    public ra(String str, long j8, boolean z2, double d10, String str2, byte[] bArr, int i, int i10, int i11) {
        this.f3044v = str;
        this.f3045w = j8;
        this.f3046x = z2;
        this.f3047y = d10;
        this.f3048z = str2;
        this.A = bArr;
        this.B = i;
        this.C = i10;
        this.D = i11;
    }

    public final void a(StringBuilder sb2) {
        sb2.append("Flag(");
        String str = this.f3044v;
        sb2.append(str);
        sb2.append(", ");
        int i = this.B;
        if (i == 1) {
            sb2.append(this.f3045w);
        } else if (i == 2) {
            sb2.append(this.f3046x);
        } else if (i == 3) {
            sb2.append(this.f3047y);
        } else if (i == 4) {
            sb2.append("'");
            String str2 = this.f3048z;
            t7.y.g(str2);
            sb2.append(str2);
            sb2.append("'");
        } else {
            if (i != 5) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
                sb3.append("Invalid type: ");
                sb3.append(str);
                sb3.append(", ");
                sb3.append(i);
                throw new AssertionError(sb3.toString());
            }
            sb2.append("'");
            byte[] bArr = this.A;
            t7.y.g(bArr);
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(this.C);
        sb2.append(", ");
        sb2.append(this.D);
        sb2.append(")");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00a5 A[RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.measurement.ra r9 = (com.google.android.gms.internal.measurement.ra) r9
            java.lang.String r0 = r9.f3044v
            java.lang.String r1 = r8.f3044v
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            int r0 = r9.B
            r1 = -1
            r2 = 0
            r3 = 1
            int r4 = r8.B
            if (r4 >= r0) goto L18
            r0 = r1
            goto L1d
        L18:
            if (r4 == r0) goto L1c
            r0 = r3
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 == 0) goto L20
            return r0
        L20:
            if (r4 == r3) goto L99
            r0 = 2
            if (r4 == r0) goto L8f
            r0 = 3
            if (r4 == r0) goto L86
            r0 = 4
            if (r4 == r0) goto L74
            r0 = 5
            if (r4 != r0) goto L59
            byte[] r9 = r9.A
            byte[] r0 = r8.A
            if (r0 != r9) goto L36
            goto La4
        L36:
            if (r0 != 0) goto L3a
            goto La1
        L3a:
            if (r9 != 0) goto L3e
            goto La5
        L3e:
            r4 = r2
        L3f:
            int r5 = r9.length
            int r6 = r0.length
            int r7 = java.lang.Math.min(r6, r5)
            if (r4 >= r7) goto L52
            r5 = r0[r4]
            r6 = r9[r4]
            int r5 = r5 - r6
            if (r5 == 0) goto L4f
            return r5
        L4f:
            int r4 = r4 + 1
            goto L3f
        L52:
            if (r6 >= r5) goto L55
            return r1
        L55:
            if (r6 == r5) goto L58
            return r3
        L58:
            return r2
        L59:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 20
            r1.<init>(r0)
            java.lang.String r0 = "Invalid enum value: "
            java.lang.String r0 = u5.a.b(r4, r0, r1)
            r9.<init>(r0)
            throw r9
        L74:
            java.lang.String r9 = r9.f3048z
            java.lang.String r0 = r8.f3048z
            if (r0 != r9) goto L7b
            goto La4
        L7b:
            if (r0 != 0) goto L7e
            goto La1
        L7e:
            if (r9 != 0) goto L81
            goto La5
        L81:
            int r9 = r0.compareTo(r9)
            return r9
        L86:
            double r0 = r8.f3047y
            double r2 = r9.f3047y
            int r9 = java.lang.Double.compare(r0, r2)
            return r9
        L8f:
            boolean r9 = r9.f3046x
            boolean r0 = r8.f3046x
            if (r0 != r9) goto L96
            goto La4
        L96:
            if (r0 == 0) goto La1
            goto La5
        L99:
            long r4 = r8.f3045w
            long r6 = r9.f3045w
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto La2
        La1:
            return r1
        La2:
            if (r9 != 0) goto La5
        La4:
            return r2
        La5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ra.compareTo(java.lang.Object):int");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ra) {
            ra raVar = (ra) obj;
            if (h.d(this.f3044v, raVar.f3044v)) {
                int i = raVar.B;
                int i10 = this.B;
                if (i10 == i && this.C == raVar.C && this.D == raVar.D) {
                    if (i10 == 1) {
                        return this.f3045w == raVar.f3045w;
                    }
                    if (i10 == 2) {
                        return this.f3046x == raVar.f3046x;
                    }
                    if (i10 == 3) {
                        return this.f3047y == raVar.f3047y;
                    }
                    if (i10 == 4) {
                        return h.d(this.f3048z, raVar.f3048z);
                    }
                    if (i10 == 5) {
                        return Arrays.equals(this.A, raVar.A);
                    }
                    throw new AssertionError(u5.a.b(i10, "Invalid enum value: ", new StringBuilder(String.valueOf(i10).length() + 20)));
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        a(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f3044v;
        boolean z2 = str == null;
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        if (!z2) {
            com.bumptech.glide.d.Y(parcel, 2, str);
        }
        long j8 = this.f3045w;
        if (j8 != 0) {
            com.bumptech.glide.d.b0(parcel, 3, 8);
            parcel.writeLong(j8);
        }
        if (this.f3046x) {
            com.bumptech.glide.d.b0(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d10 = this.f3047y;
        if (d10 != 0.0d) {
            com.bumptech.glide.d.b0(parcel, 5, 8);
            parcel.writeDouble(d10);
        }
        String str2 = this.f3048z;
        if (str2 != null) {
            com.bumptech.glide.d.Y(parcel, 6, str2);
        }
        byte[] bArr = this.A;
        if (bArr != null) {
            com.bumptech.glide.d.T(parcel, 7, bArr);
        }
        int i10 = this.B;
        if (i10 != 0) {
            com.bumptech.glide.d.b0(parcel, 8, 4);
            parcel.writeInt(i10);
        }
        int i11 = this.C;
        if (i11 != 0) {
            com.bumptech.glide.d.b0(parcel, 9, 4);
            parcel.writeInt(i11);
        }
        int i12 = this.D;
        if (i12 != 0) {
            com.bumptech.glide.d.b0(parcel, 10, 4);
            parcel.writeInt(i12);
        }
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
