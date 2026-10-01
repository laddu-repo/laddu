package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a(1);
    public final CharSequence A;
    public final Bitmap B;
    public final Uri C;
    public final Bundle D;
    public final Uri E;
    public MediaDescription F;

    /* renamed from: x, reason: collision with root package name */
    public final String f719x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f720y;

    /* renamed from: z, reason: collision with root package name */
    public final CharSequence f721z;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f719x = str;
        this.f720y = charSequence;
        this.f721z = charSequence2;
        this.A = charSequence3;
        this.B = bitmap;
        this.C = uri;
        this.D = bundle;
        this.E = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f720y) + ", " + ((Object) this.f721z) + ", " + ((Object) this.A);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        Bundle bundle;
        int i10 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescription = this.F;
        if (mediaDescription == null) {
            MediaDescription.Builder b10 = b.b();
            b.n(b10, this.f719x);
            b.p(b10, this.f720y);
            b.o(b10, this.f721z);
            b.j(b10, this.A);
            b.l(b10, this.B);
            b.m(b10, this.C);
            Bundle bundle2 = this.D;
            Uri uri = this.E;
            if (i10 < 23 && uri != null) {
                if (bundle2 == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(bundle2);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
                b.k(b10, bundle);
            } else {
                b.k(b10, bundle2);
            }
            if (i10 >= 23) {
                d.b(b10, uri);
            }
            mediaDescription = b.a(b10);
            this.F = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i6);
    }
}
