package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import kd.g0;
import w8.x;
import x8.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new g0(19);

    /* renamed from: x, reason: collision with root package name */
    public final int f2132x;

    /* renamed from: y, reason: collision with root package name */
    public final String f2133y;

    public Scope(int i6, String str) {
        x.e(str, "scopeUri must not be null or empty");
        this.f2132x = i6;
        this.f2133y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2133y.equals(((Scope) obj).f2133y);
    }

    public final int hashCode() {
        return this.f2133y.hashCode();
    }

    public final String toString() {
        return this.f2133y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.D(parcel, 1, 4);
        parcel.writeInt(this.f2132x);
        a.a.w(parcel, 2, this.f2133y);
        a.a.C(parcel, A);
    }
}
