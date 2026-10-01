package f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new android.support.v4.media.a(11);
    public final int A;

    /* renamed from: x, reason: collision with root package name */
    public final IntentSender f4607x;

    /* renamed from: y, reason: collision with root package name */
    public final Intent f4608y;

    /* renamed from: z, reason: collision with root package name */
    public final int f4609z;

    public i(IntentSender intentSender, Intent intent, int i6, int i10) {
        this.f4607x = intentSender;
        this.f4608y = intent;
        this.f4609z = i6;
        this.A = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i6) {
        k.e(dest, "dest");
        dest.writeParcelable(this.f4607x, i6);
        dest.writeParcelable(this.f4608y, i6);
        dest.writeInt(this.f4609z);
        dest.writeInt(this.A);
    }
}
