package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ta extends u7.a {
    public static final Parcelable.Creator<ta> CREATOR = new i7(8);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f3106v;

    public ta(ArrayList arrayList) {
        this.f3106v = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ta) {
            return this.f3106v.equals(((ta) obj).f3106v);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlagOverrides(");
        boolean z2 = true;
        for (sa saVar : this.f3106v) {
            if (!z2) {
                sb2.append(", ");
            }
            saVar.a(sb2);
            z2 = false;
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.a0(parcel, 2, this.f3106v);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
