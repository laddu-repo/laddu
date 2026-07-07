package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends z0.b {
    public static final Parcelable.Creator<d> CREATOR = new Object();
    public boolean A;
    public int B;
    public float C;
    public boolean D;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2579z;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z10;
        boolean z11;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2579z = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.A = z11;
        this.B = parcel.readInt();
        this.C = parcel.readFloat();
        this.D = parcel.readByte() != 0;
    }

    @Override // z0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeByte(this.f2579z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.B);
        parcel.writeFloat(this.C);
        parcel.writeByte(this.D ? (byte) 1 : (byte) 0);
    }
}
