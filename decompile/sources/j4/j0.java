package j4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new android.support.v4.media.a(25);
    public final Bundle A;

    /* renamed from: x, reason: collision with root package name */
    public final String f7178x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f7179y;

    /* renamed from: z, reason: collision with root package name */
    public final int f7180z;

    public j0(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f7178x = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f7179y = charSequence;
        this.f7180z = parcel.readInt();
        this.A = parcel.readBundle(b0.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f7179y) + ", mIcon=" + this.f7180z + ", mExtras=" + this.A;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f7178x);
        TextUtils.writeToParcel(this.f7179y, parcel, i6);
        parcel.writeInt(this.f7180z);
        parcel.writeBundle(this.A);
    }
}
