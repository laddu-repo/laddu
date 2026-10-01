package p7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10405a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10405a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int iP = com.bumptech.glide.c.P(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iP) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        com.bumptech.glide.c.L(parcel, i);
                    } else {
                        intent = (Intent) com.bumptech.glide.c.g(parcel, i, Intent.CREATOR);
                    }
                }
                com.bumptech.glide.c.l(parcel, iP);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f10405a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new a[i];
            default:
                return new g[i];
        }
    }
}
