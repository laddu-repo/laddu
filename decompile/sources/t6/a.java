package t6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kd.g0;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<a> CREATOR = new g0(15);

    /* renamed from: x, reason: collision with root package name */
    public final String f12612x;

    /* renamed from: y, reason: collision with root package name */
    public final Map f12613y;

    public a(String str, Map map) {
        this.f12612x = str;
        this.f12613y = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (k.a(this.f12612x, aVar.f12612x) && k.a(this.f12613y, aVar.f12613y)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12613y.hashCode() + (this.f12612x.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f12612x + ", extras=" + this.f12613y + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f12612x);
        Map map = this.f12613y;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
