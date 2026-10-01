package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w2 extends a1.c {
    public static final Parcelable.Creator<w2> CREATOR = new a1.b(4);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9333x;

    public w2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9333x = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f9333x + "}";
    }

    @Override // a1.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f9333x));
    }
}
