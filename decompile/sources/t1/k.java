package t1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparator, Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new i(0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j[] f12013v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12014w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f12015x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f12016y;

    public k(String str, ArrayList arrayList) {
        this(str, false, (j[]) arrayList.toArray(new j[0]));
    }

    public final k a(String str) {
        return Objects.equals(this.f12015x, str) ? this : new k(str, false, this.f12013v);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        j jVar = (j) obj;
        j jVar2 = (j) obj2;
        UUID uuid = e.f11979a;
        return uuid.equals(jVar.f12008w) ? uuid.equals(jVar2.f12008w) ? 0 : 1 : jVar.f12008w.compareTo(jVar2.f12008w);
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
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f12015x, kVar.f12015x) && Arrays.equals(this.f12013v, kVar.f12013v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f12014w == 0) {
            String str = this.f12015x;
            this.f12014w = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f12013v);
        }
        return this.f12014w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12015x);
        parcel.writeTypedArray(this.f12013v, 0);
    }

    public k(String str, boolean z2, j... jVarArr) {
        this.f12015x = str;
        jVarArr = z2 ? (j[]) jVarArr.clone() : jVarArr;
        this.f12013v = jVarArr;
        this.f12016y = jVarArr.length;
        Arrays.sort(jVarArr, this);
    }

    public k(Parcel parcel) {
        this.f12015x = parcel.readString();
        j[] jVarArr = (j[]) parcel.createTypedArray(j.CREATOR);
        int i = w1.b0.f13686a;
        this.f12013v = jVarArr;
        this.f12016y = jVarArr.length;
    }
}
