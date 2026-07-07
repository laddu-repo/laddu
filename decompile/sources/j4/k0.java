package j4;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import db.c1;
import java.util.AbstractCollection;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k0 implements Parcelable {
    public static final Parcelable.Creator<k0> CREATOR = new android.support.v4.media.a(24);
    public final float A;
    public final long B;
    public final int C;
    public final CharSequence D;
    public final long E;
    public final AbstractCollection F;
    public final long G;
    public final Bundle H;
    public PlaybackState I;

    /* renamed from: x, reason: collision with root package name */
    public final int f7183x;

    /* renamed from: y, reason: collision with root package name */
    public final long f7184y;

    /* renamed from: z, reason: collision with root package name */
    public final long f7185z;

    public k0(int i6, long j, long j10, float f3, long j11, int i10, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f7183x = i6;
        this.f7184y = j;
        this.f7185z = j10;
        this.A = f3;
        this.B = j11;
        this.C = i10;
        this.D = charSequence;
        this.E = j12;
        this.F = new ArrayList(arrayList);
        this.G = j13;
        this.H = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f7183x);
        sb2.append(", position=");
        sb2.append(this.f7184y);
        sb2.append(", buffered position=");
        sb2.append(this.f7185z);
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
        parcel.writeInt(this.f7183x);
        parcel.writeLong(this.f7184y);
        parcel.writeFloat(this.A);
        parcel.writeLong(this.E);
        parcel.writeLong(this.f7185z);
        parcel.writeLong(this.B);
        TextUtils.writeToParcel(this.D, parcel, i6);
        parcel.writeTypedList(this.F);
        parcel.writeLong(this.G);
        parcel.writeBundle(this.H);
        parcel.writeInt(this.C);
    }

    public k0(Parcel parcel) {
        this.f7183x = parcel.readInt();
        this.f7184y = parcel.readLong();
        this.A = parcel.readFloat();
        this.E = parcel.readLong();
        this.f7185z = parcel.readLong();
        this.B = parcel.readLong();
        this.D = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(j0.CREATOR);
        if (createTypedArrayList == null) {
            db.i0 i0Var = db.k0.f4008y;
            createTypedArrayList = c1.B;
        }
        this.F = createTypedArrayList;
        this.G = parcel.readLong();
        this.H = parcel.readBundle(b0.class.getClassLoader());
        this.C = parcel.readInt();
    }
}
