package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a(4);
    public final float A;
    public final long B;
    public final int C;
    public final CharSequence D;
    public final long E;
    public final ArrayList F;
    public final long G;
    public final Bundle H;

    /* renamed from: x, reason: collision with root package name */
    public final int f734x;

    /* renamed from: y, reason: collision with root package name */
    public final long f735y;

    /* renamed from: z, reason: collision with root package name */
    public final long f736z;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();
        public final Bundle A;

        /* renamed from: x, reason: collision with root package name */
        public final String f737x;

        /* renamed from: y, reason: collision with root package name */
        public final CharSequence f738y;

        /* renamed from: z, reason: collision with root package name */
        public final int f739z;

        public CustomAction(Parcel parcel) {
            this.f737x = parcel.readString();
            this.f738y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f739z = parcel.readInt();
            this.A = parcel.readBundle(b.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f738y) + ", mIcon=" + this.f739z + ", mExtras=" + this.A;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeString(this.f737x);
            TextUtils.writeToParcel(this.f738y, parcel, i6);
            parcel.writeInt(this.f739z);
            parcel.writeBundle(this.A);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f734x = parcel.readInt();
        this.f735y = parcel.readLong();
        this.A = parcel.readFloat();
        this.E = parcel.readLong();
        this.f736z = parcel.readLong();
        this.B = parcel.readLong();
        this.D = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.F = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.G = parcel.readLong();
        this.H = parcel.readBundle(b.class.getClassLoader());
        this.C = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f734x);
        sb2.append(", position=");
        sb2.append(this.f735y);
        sb2.append(", buffered position=");
        sb2.append(this.f736z);
        sb2.append(", speed=");
        sb2.append(this.A);
        sb2.append(", updated=");
        sb2.append(this.E);
        sb2.append(", actions=");
        sb2.append(this.B);
        sb2.append(", error code=");
        sb2.append(this.C);
        sb2.append(", error message=");
        sb2.append(this.D);
        sb2.append(", custom actions=");
        sb2.append(this.F);
        sb2.append(", active item id=");
        return r4.a.m(sb2, this.G, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f734x);
        parcel.writeLong(this.f735y);
        parcel.writeFloat(this.A);
        parcel.writeLong(this.E);
        parcel.writeLong(this.f736z);
        parcel.writeLong(this.B);
        TextUtils.writeToParcel(this.D, parcel, i6);
        parcel.writeTypedList(this.F);
        parcel.writeLong(this.G);
        parcel.writeBundle(this.H);
        parcel.writeInt(this.C);
    }
}
