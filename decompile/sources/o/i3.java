package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i3 extends a1.c {
    public static final Parcelable.Creator<i3> CREATOR = new a1.b(5);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9171x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9172y;

    public i3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9171x = parcel.readInt();
        this.f9172y = parcel.readInt() != 0;
    }

    @Override // a1.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f9171x);
        parcel.writeInt(this.f9172y ? 1 : 0);
    }
}
