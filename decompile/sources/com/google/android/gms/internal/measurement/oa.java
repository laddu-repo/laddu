package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class oa extends u7.a {
    public static final Parcelable.Creator<oa> CREATOR = new i7(3);
    public final boolean A;
    public final long B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f2951v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f2952w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f2953x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final na[] f2954y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TreeMap f2955z = new TreeMap();

    public oa(String str, String str2, na[] naVarArr, boolean z2, byte[] bArr, long j8) {
        this.f2951v = str;
        this.f2953x = str2;
        this.f2954y = naVarArr;
        this.A = z2;
        this.f2952w = bArr;
        this.B = j8;
        for (na naVar : naVarArr) {
            this.f2955z.put(Integer.valueOf(naVar.f2915v), naVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oa)) {
            return false;
        }
        oa oaVar = (oa) obj;
        return h.d(this.f2951v, oaVar.f2951v) && h.d(this.f2953x, oaVar.f2953x) && this.f2955z.equals(oaVar.f2955z) && this.A == oaVar.A && Arrays.equals(this.f2952w, oaVar.f2952w) && this.B == oaVar.B;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2951v, this.f2953x, this.f2955z, Boolean.valueOf(this.A), this.f2952w, Long.valueOf(this.B)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Configurations('");
        sb2.append(this.f2951v);
        sb2.append("', '");
        sb2.append(this.f2953x);
        sb2.append("', (");
        Iterator it = this.f2955z.values().iterator();
        while (it.hasNext()) {
            sb2.append((na) it.next());
            sb2.append(", ");
        }
        sb2.append("), ");
        sb2.append(this.A);
        sb2.append(", ");
        byte[] bArr = this.f2952w;
        sb2.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb2.append(", ");
        sb2.append(this.B);
        sb2.append(')');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.Y(parcel, 2, this.f2951v);
        com.bumptech.glide.d.Y(parcel, 3, this.f2953x);
        com.bumptech.glide.d.Z(parcel, 4, this.f2954y, i);
        com.bumptech.glide.d.b0(parcel, 5, 4);
        parcel.writeInt(this.A ? 1 : 0);
        com.bumptech.glide.d.T(parcel, 6, this.f2952w);
        com.bumptech.glide.d.b0(parcel, 7, 8);
        parcel.writeLong(this.B);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
