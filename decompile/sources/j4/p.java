package j4;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p implements Parcelable {
    public static final String[] A;
    public static final Parcelable.Creator<p> CREATOR;

    /* renamed from: z, reason: collision with root package name */
    public static final v.e f7197z;

    /* renamed from: x, reason: collision with root package name */
    public final Bundle f7198x;

    /* renamed from: y, reason: collision with root package name */
    public MediaMetadata f7199y;

    /* JADX WARN: Type inference failed for: r0v0, types: [v.l, v.e] */
    static {
        ?? lVar = new v.l(0);
        f7197z = lVar;
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
        A = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION"};
        CREATOR = new android.support.v4.media.a(19);
    }

    public p(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f7198x = bundle2;
        b0.l(bundle2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeBundle(this.f7198x);
    }

    public p(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(b0.class.getClassLoader());
        readBundle.getClass();
        this.f7198x = readBundle;
    }
}
