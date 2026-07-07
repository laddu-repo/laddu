package j4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new android.support.v4.media.a(18);
    public final CharSequence A;
    public final Bitmap B;
    public final Uri C;
    public final Bundle D;
    public final Uri E;
    public MediaDescription F;

    /* renamed from: x, reason: collision with root package name */
    public final String f7194x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f7195y;

    /* renamed from: z, reason: collision with root package name */
    public final CharSequence f7196z;

    public o(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f7194x = str;
        this.f7195y = charSequence;
        this.f7196z = charSequence2;
        this.A = charSequence3;
        this.B = bitmap;
        this.C = uri;
        this.D = bundle;
        this.E = uri2;
    }

    public final MediaDescription a() {
        Bundle bundle;
        MediaDescription mediaDescription = this.F;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f7194x);
        builder.setTitle(this.f7195y);
        builder.setSubtitle(this.f7196z);
        builder.setDescription(this.A);
        builder.setIconBitmap(this.B);
        builder.setIconUri(this.C);
        int i6 = Build.VERSION.SDK_INT;
        Bundle bundle2 = this.D;
        Uri uri = this.E;
        if (i6 < 23 && uri != null) {
            if (bundle2 == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            } else {
                bundle = new Bundle(bundle2);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
            builder.setExtras(bundle);
        } else {
            builder.setExtras(bundle2);
        }
        if (i6 >= 23) {
            n.m(builder, uri);
        }
        MediaDescription build = builder.build();
        this.F = build;
        return build;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f7195y) + ", " + ((Object) this.f7196z) + ", " + ((Object) this.A);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        a().writeToParcel(parcel, i6);
    }
}
