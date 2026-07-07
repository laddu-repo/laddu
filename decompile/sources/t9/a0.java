package t9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends a1.c {
    public static final Parcelable.Creator<a0> CREATOR = new a1.b(9);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f12426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12427y;

    public a0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f12426x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f12427y = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f12426x) + "}";
    }

    @Override // a1.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f12426x, parcel, i);
        parcel.writeInt(this.f12427y ? 1 : 0);
    }
}
