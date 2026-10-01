package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends View.BaseSavedState {
    public static final Parcelable.Creator<l0> CREATOR = new m8.c(3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9217v;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f9217v ? (byte) 1 : (byte) 0);
    }
}
