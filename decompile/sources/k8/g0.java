package k8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.j6;
import com.google.android.gms.internal.measurement.l6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends j6 implements i0 {
    public g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 0);
    }

    @Override // k8.i0
    public final void A(e eVar, v4 v4Var) {
        Parcel parcelF = f();
        l6.b(parcelF, eVar);
        l6.b(parcelF, v4Var);
        I(parcelF, 12);
    }

    @Override // k8.i0
    public final List D(String str, String str2, v4 v4Var) {
        Parcel parcelF = f();
        parcelF.writeString(str);
        parcelF.writeString(str2);
        l6.b(parcelF, v4Var);
        Parcel parcelE = e(parcelF, 16);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(e.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // k8.i0
    public final void E(v4 v4Var) {
        Parcel parcelF = f();
        l6.b(parcelF, v4Var);
        I(parcelF, 25);
    }

    @Override // k8.i0
    public final void F(Bundle bundle, v4 v4Var) {
        Parcel parcelF = f();
        l6.b(parcelF, bundle);
        l6.b(parcelF, v4Var);
        I(parcelF, 19);
    }

    @Override // k8.i0
    public final String G(v4 v4Var) {
        Parcel parcelF = f();
        l6.b(parcelF, v4Var);
        Parcel parcelE = e(parcelF, 11);
        String string = parcelE.readString();
        parcelE.recycle();
        return string;
    }

    @Override // k8.i0
    public final void H(q4 q4Var, v4 v4Var) {
        Parcel parcelF = f();
        l6.b(parcelF, q4Var);
        l6.b(parcelF, v4Var);
        I(parcelF, 2);
    }

    @Override // k8.i0
    public final void g(v4 v4Var) {
        Parcel parcelF = f();
        l6.b(parcelF, v4Var);
        I(parcelF, 18);
    }

    @Override // k8.i0
    public final void h(v vVar, v4 v4Var) {
        Parcel parcelF = f();
        l6.b(parcelF, vVar);
        l6.b(parcelF, v4Var);
        I(parcelF, 1);
    }

    @Override // k8.i0
    public final void j(v4 v4Var) {
        Parcel parcelF = f();
        l6.b(parcelF, v4Var);
        I(parcelF, 4);
    }

    @Override // k8.i0
    public final List k(String str, String str2, boolean z2, v4 v4Var) {
        Parcel parcelF = f();
        parcelF.writeString(str);
        parcelF.writeString(str2);
        ClassLoader classLoader = l6.f2853a;
        parcelF.writeInt(z2 ? 1 : 0);
        l6.b(parcelF, v4Var);
        Parcel parcelE = e(parcelF, 14);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(q4.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // k8.i0
    public final List l(String str, String str2, String str3, boolean z2) {
        Parcel parcelF = f();
        parcelF.writeString(null);
        parcelF.writeString(str2);
        parcelF.writeString(str3);
        ClassLoader classLoader = l6.f2853a;
        parcelF.writeInt(z2 ? 1 : 0);
        Parcel parcelE = e(parcelF, 15);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(q4.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // k8.i0
    public final void n(v4 v4Var, Bundle bundle, k0 k0Var) {
        Parcel parcelF = f();
        l6.b(parcelF, v4Var);
        l6.b(parcelF, bundle);
        l6.c(parcelF, k0Var);
        I(parcelF, 31);
    }

    @Override // k8.i0
    public final void o(v4 v4Var) {
        Parcel parcelF = f();
        l6.b(parcelF, v4Var);
        I(parcelF, 27);
    }

    @Override // k8.i0
    public final void p(v4 v4Var, f4 f4Var, m0 m0Var) {
        Parcel parcelF = f();
        l6.b(parcelF, v4Var);
        l6.b(parcelF, f4Var);
        l6.c(parcelF, m0Var);
        I(parcelF, 29);
    }

    @Override // k8.i0
    public final i r(v4 v4Var) {
        Parcel parcelF = f();
        l6.b(parcelF, v4Var);
        Parcel parcelE = e(parcelF, 21);
        i iVar = (i) l6.a(parcelE, i.CREATOR);
        parcelE.recycle();
        return iVar;
    }

    @Override // k8.i0
    public final byte[] s(String str, v vVar) {
        Parcel parcelF = f();
        l6.b(parcelF, vVar);
        parcelF.writeString(str);
        Parcel parcelE = e(parcelF, 9);
        byte[] bArrCreateByteArray = parcelE.createByteArray();
        parcelE.recycle();
        return bArrCreateByteArray;
    }

    @Override // k8.i0
    public final void u(long j8, String str, String str2, String str3) {
        Parcel parcelF = f();
        parcelF.writeLong(j8);
        parcelF.writeString(str);
        parcelF.writeString(str2);
        parcelF.writeString(str3);
        I(parcelF, 10);
    }

    @Override // k8.i0
    public final void v(v4 v4Var) {
        Parcel parcelF = f();
        l6.b(parcelF, v4Var);
        I(parcelF, 20);
    }

    @Override // k8.i0
    public final void w(v4 v4Var, d dVar) {
        Parcel parcelF = f();
        l6.b(parcelF, v4Var);
        l6.b(parcelF, dVar);
        I(parcelF, 30);
    }

    @Override // k8.i0
    public final List x(String str, String str2, String str3) {
        Parcel parcelF = f();
        parcelF.writeString(null);
        parcelF.writeString(str2);
        parcelF.writeString(str3);
        Parcel parcelE = e(parcelF, 17);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(e.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // k8.i0
    public final void y(v4 v4Var) {
        Parcel parcelF = f();
        l6.b(parcelF, v4Var);
        I(parcelF, 6);
    }

    @Override // k8.i0
    public final void z(v4 v4Var) {
        Parcel parcelF = f();
        l6.b(parcelF, v4Var);
        I(parcelF, 26);
    }
}
