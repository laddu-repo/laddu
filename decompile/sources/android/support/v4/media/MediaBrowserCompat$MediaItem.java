package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a(0);

    /* renamed from: x, reason: collision with root package name */
    public final int f717x;

    /* renamed from: y, reason: collision with root package name */
    public final MediaDescriptionCompat f718y;

    public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i6) {
        if (!TextUtils.isEmpty(mediaDescriptionCompat.f719x)) {
            this.f717x = i6;
            this.f718y = mediaDescriptionCompat;
            return;
        }
        throw new IllegalArgumentException("description must have a non-empty media id");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f717x + ", mDescription=" + this.f718y + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f717x);
        this.f718y.writeToParcel(parcel, i6);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f717x = parcel.readInt();
        this.f718y = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
