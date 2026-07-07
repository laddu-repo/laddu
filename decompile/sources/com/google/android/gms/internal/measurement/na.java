package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class na extends u7.a implements Comparable {
    public static final Parcelable.Creator<na> CREATOR = new i7(2);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f2915v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ra[] f2916w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String[] f2917x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TreeMap f2918y = new TreeMap();

    public na(int i, ra[] raVarArr, String[] strArr) {
        this.f2915v = i;
        this.f2916w = raVarArr;
        for (ra raVar : raVarArr) {
            this.f2918y.put(raVar.f3044v, raVar);
        }
        this.f2917x = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f2915v - ((na) obj).f2915v;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof na)) {
            return false;
        }
        na naVar = (na) obj;
        return this.f2915v == naVar.f2915v && h.d(this.f2918y, naVar.f2918y) && Arrays.equals(this.f2917x, naVar.f2917x);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Configuration(");
        sb2.append(this.f2915v);
        sb2.append(", (");
        Iterator it = this.f2918y.values().iterator();
        while (it.hasNext()) {
            sb2.append((ra) it.next());
            sb2.append(", ");
        }
        sb2.append("), (");
        String[] strArr = this.f2917x;
        if (strArr != null) {
            for (String str : strArr) {
                sb2.append(str);
                sb2.append(", ");
            }
        } else {
            sb2.append("null");
        }
        sb2.append("))");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.b0(parcel, 2, 4);
        parcel.writeInt(this.f2915v);
        com.bumptech.glide.d.Z(parcel, 3, this.f2916w, i);
        String[] strArr = this.f2917x;
        if (strArr != null) {
            int iC02 = com.bumptech.glide.d.c0(parcel, 4);
            parcel.writeStringArray(strArr);
            com.bumptech.glide.d.d0(parcel, iC02);
        }
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
