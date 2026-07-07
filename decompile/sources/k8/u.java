package k8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u extends u7.a implements Iterable {
    public static final Parcelable.Creator<u> CREATOR = new android.support.v4.media.a(21);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Bundle f7778v;

    public u(Bundle bundle) {
        this.f7778v = bundle;
    }

    public final Object a(String str) {
        return this.f7778v.get(str);
    }

    public final Double b() {
        return Double.valueOf(this.f7778v.getDouble("value"));
    }

    public final String c() {
        return this.f7778v.getString("currency");
    }

    public final Bundle d() {
        return new Bundle(this.f7778v);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t(this);
    }

    public final String toString() {
        return this.f7778v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.S(parcel, 2, d());
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
