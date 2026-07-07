package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import de.i;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new android.support.v4.media.a(15);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final IntentSender f4539v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Intent f4540w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f4541x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f4542y;

    public h(IntentSender intentSender, Intent intent, int i, int i10) {
        this.f4539v = intentSender;
        this.f4540w = intent;
        this.f4541x = i;
        this.f4542y = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "dest");
        parcel.writeParcelable(this.f4539v, i);
        parcel.writeParcelable(this.f4540w, i);
        parcel.writeInt(this.f4541x);
        parcel.writeInt(this.f4542y);
    }
}
