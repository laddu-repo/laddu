package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import v.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: x, reason: collision with root package name */
    public final Bundle f722x;

    static {
        l lVar = new l(0);
        lVar.put("android.media.metadata.TITLE", 1);
        lVar.put("android.media.metadata.ARTIST", 1);
        lVar.put("android.media.metadata.DURATION", 0);
        lVar.put("android.media.metadata.ALBUM", 1);
        lVar.put("android.media.metadata.AUTHOR", 1);
        lVar.put("android.media.metadata.WRITER", 1);
        lVar.put("android.media.metadata.COMPOSER", 1);
        lVar.put("android.media.metadata.COMPILATION", 1);
        lVar.put("android.media.metadata.DATE", 1);
        lVar.put("android.media.metadata.YEAR", 0);
        lVar.put("android.media.metadata.GENRE", 1);
        lVar.put("android.media.metadata.TRACK_NUMBER", 0);
        lVar.put("android.media.metadata.NUM_TRACKS", 0);
        lVar.put("android.media.metadata.DISC_NUMBER", 0);
        lVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        lVar.put("android.media.metadata.ART", 2);
        lVar.put("android.media.metadata.ART_URI", 1);
        lVar.put("android.media.metadata.ALBUM_ART", 2);
        lVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        lVar.put("android.media.metadata.USER_RATING", 3);
        lVar.put("android.media.metadata.RATING", 3);
        lVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        lVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        lVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        lVar.put("android.media.metadata.DISPLAY_ICON", 2);
        lVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        lVar.put("android.media.metadata.MEDIA_ID", 1);
        lVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        lVar.put("android.media.metadata.MEDIA_URI", 1);
        lVar.put("android.media.metadata.ADVERTISEMENT", 0);
        lVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new a(2);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f722x = parcel.readBundle(android.support.v4.media.session.b.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeBundle(this.f722x);
    }
}
