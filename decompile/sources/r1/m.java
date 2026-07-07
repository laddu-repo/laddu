package r1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements Comparator, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new k(0);
    public final int A;

    /* renamed from: x, reason: collision with root package name */
    public final l[] f11583x;

    /* renamed from: y, reason: collision with root package name */
    public int f11584y;

    /* renamed from: z, reason: collision with root package name */
    public final String f11585z;

    public m(String str, ArrayList arrayList) {
        this(str, false, (l[]) arrayList.toArray(new l[0]));
    }

    public final m a(String str) {
        if (Objects.equals(this.f11585z, str)) {
            return this;
        }
        return new m(str, false, this.f11583x);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        l lVar = (l) obj;
        l lVar2 = (l) obj2;
        UUID uuid = g.f11399a;
        if (uuid.equals(lVar.f11576y)) {
            if (uuid.equals(lVar2.f11576y)) {
                return 0;
            }
            return 1;
        }
        return lVar.f11576y.compareTo(lVar2.f11576y);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f11585z, mVar.f11585z) && Arrays.equals(this.f11583x, mVar.f11583x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f11584y == 0) {
            String str = this.f11585z;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f11584y = (hashCode * 31) + Arrays.hashCode(this.f11583x);
        }
        return this.f11584y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f11585z);
        parcel.writeTypedArray(this.f11583x, 0);
    }

    public m(l... lVarArr) {
        this(null, true, lVarArr);
    }

    public m(String str, boolean z10, l... lVarArr) {
        this.f11585z = str;
        lVarArr = z10 ? (l[]) lVarArr.clone() : lVarArr;
        this.f11583x = lVarArr;
        this.A = lVarArr.length;
        Arrays.sort(lVarArr, this);
    }

    public m(Parcel parcel) {
        this.f11585z = parcel.readString();
        l[] lVarArr = (l[]) parcel.createTypedArray(l.CREATOR);
        String str = u1.a0.f12750a;
        this.f11583x = lVarArr;
        this.A = lVarArr.length;
    }
}
