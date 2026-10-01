package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v0 extends x8.a {
    public static final Parcelable.Creator<v0> CREATOR = new w0(0);
    public final Bundle A;
    public final String B;

    /* renamed from: x, reason: collision with root package name */
    public final long f2465x;

    /* renamed from: y, reason: collision with root package name */
    public final long f2466y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2467z;

    public v0(long j, long j10, boolean z10, Bundle bundle, String str) {
        this.f2465x = j;
        this.f2466y = j10;
        this.f2467z = z10;
        this.A = bundle;
        this.B = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.D(parcel, 1, 8);
        parcel.writeLong(this.f2465x);
        a.a.D(parcel, 2, 8);
        parcel.writeLong(this.f2466y);
        a.a.D(parcel, 3, 4);
        parcel.writeInt(this.f2467z ? 1 : 0);
        a.a.t(parcel, 7, this.A);
        a.a.w(parcel, 8, this.B);
        a.a.C(parcel, A);
    }
}
