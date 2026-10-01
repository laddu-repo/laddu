package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class qa extends u7.a {
    public static final Parcelable.Creator<qa> CREATOR = new i7(5);
    public final byte[][] A;
    public final int[] B;
    public final byte[][] C;
    public final int[] D;
    public final byte[][] E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f3014v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f3015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final byte[][] f3016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final byte[][] f3017y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final byte[][] f3018z;

    public qa(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.f3014v = str;
        this.f3015w = bArr;
        this.f3016x = bArr2;
        this.f3017y = bArr3;
        this.f3018z = bArr4;
        this.A = bArr5;
        this.B = iArr;
        this.C = bArr6;
        this.D = iArr2;
        this.E = bArr7;
    }

    public static void a(StringBuilder sb2, String str, byte[][] bArr) {
        sb2.append(str);
        sb2.append("=");
        if (bArr == null) {
            sb2.append("null");
            return;
        }
        sb2.append("(");
        boolean z2 = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z2) {
                sb2.append(", ");
            }
            sb2.append("'");
            t7.y.g(bArr2);
            sb2.append(Base64.encodeToString(bArr2, 3));
            sb2.append("'");
            i++;
            z2 = false;
        }
        sb2.append(")");
    }

    public static Set c(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(y9.p.a(length));
        for (byte[] bArr2 : bArr) {
            t7.y.g(bArr2);
            hashSet.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSet;
    }

    public static List d(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new ua(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final Set b() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.C;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.f3015w;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return c((byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object hashSet;
        Object hashSet2;
        int length;
        int length2;
        if (obj instanceof qa) {
            qa qaVar = (qa) obj;
            if (h.d(this.f3014v, qaVar.f3014v) && h.d(b(), qaVar.b()) && h.d(c(this.f3016x), c(qaVar.f3016x)) && h.d(c(this.f3017y), c(qaVar.f3017y)) && h.d(c(this.f3018z), c(qaVar.f3018z)) && h.d(c(this.A), c(qaVar.A))) {
                int[] iArr = this.B;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    hashSet = Collections.EMPTY_SET;
                } else {
                    hashSet = new HashSet(y9.p.a(length2));
                    for (int i : iArr) {
                        hashSet.add(Integer.valueOf(i));
                    }
                }
                int[] iArr2 = qaVar.B;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    hashSet2 = Collections.EMPTY_SET;
                } else {
                    hashSet2 = new HashSet(y9.p.a(length));
                    for (int i10 : iArr2) {
                        hashSet2.add(Integer.valueOf(i10));
                    }
                }
                if (h.d(hashSet, hashSet2) && h.d(d(this.D), d(qaVar.D)) && h.d(c(this.E), c(qaVar.E))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        String str = this.f3014v;
        sb2.append(str == null ? "null" : d0.d.n(new StringBuilder(str.length() + 2), "'", str, "'"));
        sb2.append(", direct==");
        byte[] bArr = this.f3015w;
        if (bArr == null) {
            sb2.append("null");
        } else {
            sb2.append("'");
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        a(sb2, "GAIA=", this.f3016x);
        sb2.append(", ");
        a(sb2, "PSEUDO=", this.f3017y);
        sb2.append(", ");
        a(sb2, "ALWAYS=", this.f3018z);
        sb2.append(", ");
        a(sb2, "OTHER=", this.A);
        sb2.append(", weak=");
        sb2.append(Arrays.toString(this.B));
        sb2.append(", ");
        a(sb2, "directs=", this.C);
        sb2.append(", genDims=");
        sb2.append(Arrays.toString(d(this.D).toArray()));
        sb2.append(", ");
        a(sb2, "external=", this.E);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.Y(parcel, 2, this.f3014v);
        com.bumptech.glide.d.T(parcel, 3, this.f3015w);
        com.bumptech.glide.d.U(parcel, 4, this.f3016x);
        com.bumptech.glide.d.U(parcel, 5, this.f3017y);
        com.bumptech.glide.d.U(parcel, 6, this.f3018z);
        com.bumptech.glide.d.U(parcel, 7, this.A);
        com.bumptech.glide.d.W(parcel, 8, this.B);
        com.bumptech.glide.d.U(parcel, 9, this.C);
        com.bumptech.glide.d.W(parcel, 10, this.D);
        com.bumptech.glide.d.U(parcel, 11, this.E);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
