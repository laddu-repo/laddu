package f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(10);

    /* renamed from: x, reason: collision with root package name */
    public final int f4587x;

    /* renamed from: y, reason: collision with root package name */
    public final Intent f4588y;

    public a(int i6, Intent intent) {
        this.f4587x = i6;
        this.f4588y = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i6 = this.f4587x;
        if (i6 != -1) {
            if (i6 != 0) {
                str = String.valueOf(i6);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb2.append(str);
        sb2.append(", data=");
        sb2.append(this.f4588y);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i6) {
        int i10;
        k.e(dest, "dest");
        dest.writeInt(this.f4587x);
        Intent intent = this.f4588y;
        if (intent == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        dest.writeInt(i10);
        if (intent != null) {
            intent.writeToParcel(dest, i6);
        }
    }
}
