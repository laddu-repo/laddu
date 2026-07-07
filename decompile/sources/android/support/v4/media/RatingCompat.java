package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a(3);

    /* renamed from: x, reason: collision with root package name */
    public final int f723x;

    /* renamed from: y, reason: collision with root package name */
    public final float f724y;

    public RatingCompat(int i6, float f3) {
        this.f723x = i6;
        this.f724y = f3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f723x;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f723x);
        sb2.append(" rating=");
        float f3 = this.f724y;
        if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f3);
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f723x);
        parcel.writeFloat(this.f724y);
    }
}
