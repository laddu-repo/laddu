package n9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f0 extends com.google.android.gms.internal.measurement.x implements h0 {
    public f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 0);
    }

    @Override // n9.h0
    public final List C(String str, String str2, boolean z10, l4 l4Var) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.z.f2542a;
        J.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        Parcel d10 = d(J, 14);
        ArrayList createTypedArrayList = d10.createTypedArrayList(g4.CREATOR);
        d10.recycle();
        return createTypedArrayList;
    }

    @Override // n9.h0
    public final void D(l4 l4Var) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        K(J, 27);
    }

    @Override // n9.h0
    public final void F(l4 l4Var) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        K(J, 20);
    }

    @Override // n9.h0
    public final void G(l4 l4Var, Bundle bundle, j0 j0Var) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        com.google.android.gms.internal.measurement.z.b(J, bundle);
        com.google.android.gms.internal.measurement.z.c(J, j0Var);
        K(J, 31);
    }

    @Override // n9.h0
    public final List H(String str, String str2, l4 l4Var) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        Parcel d10 = d(J, 16);
        ArrayList createTypedArrayList = d10.createTypedArrayList(e.CREATOR);
        d10.recycle();
        return createTypedArrayList;
    }

    @Override // n9.h0
    public final String I(l4 l4Var) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        Parcel d10 = d(J, 11);
        String readString = d10.readString();
        d10.recycle();
        return readString;
    }

    @Override // n9.h0
    public final i g(l4 l4Var) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        Parcel d10 = d(J, 21);
        i iVar = (i) com.google.android.gms.internal.measurement.z.a(d10, i.CREATOR);
        d10.recycle();
        return iVar;
    }

    @Override // n9.h0
    public final List h(String str, String str2, String str3, boolean z10) {
        Parcel J = J();
        J.writeString(null);
        J.writeString(str2);
        J.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.z.f2542a;
        J.writeInt(z10 ? 1 : 0);
        Parcel d10 = d(J, 15);
        ArrayList createTypedArrayList = d10.createTypedArrayList(g4.CREATOR);
        d10.recycle();
        return createTypedArrayList;
    }

    @Override // n9.h0
    public final void i(e eVar, l4 l4Var) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, eVar);
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        K(J, 12);
    }

    @Override // n9.h0
    public final void j(g4 g4Var, l4 l4Var) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, g4Var);
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        K(J, 2);
    }

    @Override // n9.h0
    public final void k(Bundle bundle, l4 l4Var) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, bundle);
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        K(J, 19);
    }

    @Override // n9.h0
    public final void l(l4 l4Var) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        K(J, 4);
    }

    @Override // n9.h0
    public final void n(long j, String str, String str2, String str3) {
        Parcel J = J();
        J.writeLong(j);
        J.writeString(str);
        J.writeString(str2);
        J.writeString(str3);
        K(J, 10);
    }

    @Override // n9.h0
    public final void o(l4 l4Var) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        K(J, 25);
    }

    @Override // n9.h0
    public final List p(String str, String str2, String str3) {
        Parcel J = J();
        J.writeString(null);
        J.writeString(str2);
        J.writeString(str3);
        Parcel d10 = d(J, 17);
        ArrayList createTypedArrayList = d10.createTypedArrayList(e.CREATOR);
        d10.recycle();
        return createTypedArrayList;
    }

    @Override // n9.h0
    public final byte[] q(String str, v vVar) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, vVar);
        J.writeString(str);
        Parcel d10 = d(J, 9);
        byte[] createByteArray = d10.createByteArray();
        d10.recycle();
        return createByteArray;
    }

    @Override // n9.h0
    public final void r(l4 l4Var) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        K(J, 6);
    }

    @Override // n9.h0
    public final void s(l4 l4Var, d dVar) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        com.google.android.gms.internal.measurement.z.b(J, dVar);
        K(J, 30);
    }

    @Override // n9.h0
    public final void t(v vVar, l4 l4Var) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, vVar);
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        K(J, 1);
    }

    @Override // n9.h0
    public final void v(l4 l4Var) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        K(J, 26);
    }

    @Override // n9.h0
    public final void x(l4 l4Var) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        K(J, 18);
    }

    @Override // n9.h0
    public final void y(l4 l4Var, x3 x3Var, l0 l0Var) {
        Parcel J = J();
        com.google.android.gms.internal.measurement.z.b(J, l4Var);
        com.google.android.gms.internal.measurement.z.b(J, x3Var);
        com.google.android.gms.internal.measurement.z.c(J, l0Var);
        K(J, 29);
    }
}
