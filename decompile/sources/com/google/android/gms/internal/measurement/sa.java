package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class sa extends u7.a {
    public static final Parcelable.Creator<sa> CREATOR = new i7(7);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f3081v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f3082w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ra f3083x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f3084y;

    public sa(String str, String str2, ra raVar, boolean z2) {
        this.f3081v = str;
        this.f3082w = str2;
        this.f3083x = raVar;
        this.f3084y = z2;
    }

    public final void a(StringBuilder sb2) {
        sb2.append("FlagOverride(");
        sb2.append(this.f3081v);
        sb2.append(", ");
        sb2.append(this.f3082w);
        sb2.append(", ");
        this.f3083x.a(sb2);
        sb2.append(", ");
        sb2.append(this.f3084y);
        sb2.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        return h.d(this.f3081v, saVar.f3081v) && h.d(this.f3082w, saVar.f3082w) && h.d(this.f3083x, saVar.f3083x) && this.f3084y == saVar.f3084y;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        a(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.Y(parcel, 2, this.f3081v);
        com.bumptech.glide.d.Y(parcel, 3, this.f3082w);
        com.bumptech.glide.d.X(parcel, 4, this.f3083x, i);
        com.bumptech.glide.d.b0(parcel, 5, 4);
        parcel.writeInt(this.f3084y ? 1 : 0);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
