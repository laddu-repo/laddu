package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x0 extends x8.a {
    public static final Parcelable.Creator<x0> CREATOR = new w0(1);

    /* renamed from: x, reason: collision with root package name */
    public final int f2517x;

    /* renamed from: y, reason: collision with root package name */
    public final String f2518y;

    /* renamed from: z, reason: collision with root package name */
    public final Intent f2519z;

    public x0(int i6, String str, Intent intent) {
        this.f2517x = i6;
        this.f2518y = str;
        this.f2519z = intent;
    }

    public static x0 a(Activity activity) {
        return new x0(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (this.f2517x == x0Var.f2517x && Objects.equals(this.f2518y, x0Var.f2518y) && Objects.equals(this.f2519z, x0Var.f2519z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2517x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.D(parcel, 1, 4);
        parcel.writeInt(this.f2517x);
        a.a.w(parcel, 2, this.f2518y);
        a.a.v(parcel, 3, this.f2519z, i6);
        a.a.C(parcel, A);
    }
}
