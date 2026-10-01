package j4;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new android.support.v4.media.a(26);

    /* renamed from: x, reason: collision with root package name */
    public final int f7191x;

    /* renamed from: y, reason: collision with root package name */
    public final float f7192y;

    /* renamed from: z, reason: collision with root package name */
    public Rating f7193z;

    public l0(int i6, float f3) {
        this.f7191x = i6;
        this.f7192y = f3;
    }

    public static l0 c(float f3) {
        if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 <= 100.0f) {
            return new l0(6, f3);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static l0 d(int i6, float f3) {
        float f10;
        if (i6 != 3) {
            if (i6 != 4) {
                if (i6 != 5) {
                    Log.e("Rating", "Invalid rating style (" + i6 + ") for a star rating");
                    return null;
                }
                f10 = 5.0f;
            } else {
                f10 = 4.0f;
            }
        } else {
            f10 = 3.0f;
        }
        if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 <= f10) {
            return new l0(i6, f3);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final float a() {
        int i6 = this.f7191x;
        if ((i6 == 3 || i6 == 4 || i6 == 5) && b()) {
            return this.f7192y;
        }
        return -1.0f;
    }

    public final boolean b() {
        if (this.f7192y >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f7191x;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f7191x);
        sb2.append(" rating=");
        float f3 = this.f7192y;
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
        parcel.writeInt(this.f7191x);
        parcel.writeFloat(this.f7192y);
    }
}
