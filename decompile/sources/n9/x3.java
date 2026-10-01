package n9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x3 extends x8.a {
    public static final Parcelable.Creator<x3> CREATOR = new kd.g0(9);

    /* renamed from: x, reason: collision with root package name */
    public final List f9529x;

    public x3(ArrayList arrayList) {
        this.f9529x = arrayList;
    }

    public static x3 a(t2... t2VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(t2VarArr[0].f9488x));
        return new x3(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        List list = this.f9529x;
        if (list != null) {
            int A2 = a.a.A(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                parcel.writeInt(((Integer) list.get(i10)).intValue());
            }
            a.a.C(parcel, A2);
        }
        a.a.C(parcel, A);
    }
}
