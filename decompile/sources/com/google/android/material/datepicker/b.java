package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(6);
    public final r A;
    public final int B;
    public final int C;
    public final int D;

    /* renamed from: x, reason: collision with root package name */
    public final r f2651x;

    /* renamed from: y, reason: collision with root package name */
    public final r f2652y;

    /* renamed from: z, reason: collision with root package name */
    public final d f2653z;

    public b(r rVar, r rVar2, d dVar, r rVar3, int i6) {
        Objects.requireNonNull(rVar, "start cannot be null");
        Objects.requireNonNull(rVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f2651x = rVar;
        this.f2652y = rVar2;
        this.A = rVar3;
        this.B = i6;
        this.f2653z = dVar;
        if (rVar3 != null && rVar.f2688x.compareTo(rVar3.f2688x) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (rVar3 != null && rVar3.f2688x.compareTo(rVar2.f2688x) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i6 >= 0 && i6 <= y.c(null).getMaximum(7)) {
            this.D = rVar.d(rVar2) + 1;
            this.C = (rVar2.f2690z - rVar.f2690z) + 1;
            return;
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2651x.equals(bVar.f2651x) && this.f2652y.equals(bVar.f2652y) && Objects.equals(this.A, bVar.A) && this.B == bVar.B && this.f2653z.equals(bVar.f2653z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2651x, this.f2652y, this.A, Integer.valueOf(this.B), this.f2653z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeParcelable(this.f2651x, 0);
        parcel.writeParcelable(this.f2652y, 0);
        parcel.writeParcelable(this.A, 0);
        parcel.writeParcelable(this.f2653z, 0);
        parcel.writeInt(this.B);
    }
}
