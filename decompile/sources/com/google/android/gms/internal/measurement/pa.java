package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class pa extends u7.a {
    public static final Parcelable.Creator<pa> CREATOR = new i7(4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f2985v;

    public pa(byte[] bArr) {
        this.f2985v = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.T(parcel, 2, this.f2985v);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
