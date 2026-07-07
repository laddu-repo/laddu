package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ua extends u7.a implements Comparable {
    public static final Parcelable.Creator<ua> CREATOR = new i7(9);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f3135v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f3136w;

    public ua(int i, int i10) {
        this.f3135v = i;
        this.f3136w = i10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ua uaVar = (ua) obj;
        int i = uaVar.f3135v;
        int i10 = this.f3135v;
        if (i10 < i) {
            return -1;
        }
        if (i10 > i) {
            return 1;
        }
        int i11 = uaVar.f3136w;
        int i12 = this.f3136w;
        if (i12 < i11) {
            return -1;
        }
        return i12 > i11 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
    
        r0 = (r3 = (com.google.android.gms.internal.measurement.ua) r3).f3135v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        r3 = r3.f3136w;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.ua
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.measurement.ua r3 = (com.google.android.gms.internal.measurement.ua) r3
            int r0 = r3.f3135v
            int r1 = r2.f3135v
            if (r1 >= r0) goto Ld
            goto L1c
        Ld:
            if (r1 <= r0) goto L10
            goto L1c
        L10:
            int r3 = r3.f3136w
            int r0 = r2.f3136w
            if (r0 >= r3) goto L17
            goto L1c
        L17:
            if (r0 <= r3) goto L1a
            goto L1c
        L1a:
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ua.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.f3135v * 31) + this.f3136w;
    }

    public final String toString() {
        int i = this.f3135v;
        int length = String.valueOf(i).length();
        int i10 = this.f3136w;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(i10).length() + 1);
        sb2.append("GenericDimension(");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.b0(parcel, 1, 4);
        parcel.writeInt(this.f3135v);
        com.bumptech.glide.d.b0(parcel, 2, 4);
        parcel.writeInt(this.f3136w);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
