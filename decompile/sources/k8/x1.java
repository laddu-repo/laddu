package k8;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ag;
import com.google.android.gms.internal.measurement.k6;
import com.google.android.gms.internal.measurement.l6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends k6 implements i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n4 f7834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f7835e;
    public String f;

    public x1(n4 n4Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        t7.y.g(n4Var);
        this.f7834d = n4Var;
        this.f = null;
    }

    @Override // k8.i0
    public final void A(e eVar, v4 v4Var) {
        t7.y.g(eVar);
        t7.y.g(eVar.f7450x);
        f(v4Var);
        e eVar2 = new e(eVar);
        eVar2.f7448v = v4Var.f7805v;
        J(new ag(this, eVar2, v4Var, 2, false));
    }

    @Override // k8.i0
    public final List D(String str, String str2, v4 v4Var) {
        f(v4Var);
        String str3 = v4Var.f7805v;
        t7.y.g(str3);
        n4 n4Var = this.f7834d;
        try {
            return (List) n4Var.d().K(new t1(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e7) {
            n4Var.c().B.b(e7, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // k8.i0
    public final void E(v4 v4Var) {
        t7.y.d(v4Var.f7805v);
        t7.y.g(v4Var.N);
        e(new r1(this, v4Var, 6));
    }

    @Override // k8.i0
    public final void F(Bundle bundle, v4 v4Var) {
        f(v4Var);
        String str = v4Var.f7805v;
        t7.y.g(str);
        J(new w1(this, bundle, str, v4Var));
    }

    @Override // k8.i0
    public final String G(v4 v4Var) {
        f(v4Var);
        n4 n4Var = this.f7834d;
        try {
            return (String) n4Var.d().K(new q1(n4Var, v4Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            n4Var.c().B.c(v0.L(v4Var.f7805v), e7, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // k8.i0
    public final void H(q4 q4Var, v4 v4Var) {
        t7.y.g(q4Var);
        f(v4Var);
        J(new ag(this, q4Var, v4Var, 5, false));
    }

    public final void I(String str, boolean z2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        n4 n4Var = this.f7834d;
        if (zIsEmpty) {
            n4Var.c().B.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z2) {
            try {
                if (this.f7835e == null) {
                    boolean z10 = true;
                    if (!"com.google.android.gms".equals(this.f) && !x7.b.e(n4Var.G.f7692v, Binder.getCallingUid()) && !q7.h.b(n4Var.G.f7692v).c(Binder.getCallingUid())) {
                        z10 = false;
                    }
                    this.f7835e = Boolean.valueOf(z10);
                }
                if (this.f7835e.booleanValue()) {
                    return;
                }
            } catch (SecurityException e7) {
                n4Var.c().B.b(v0.L(str), "Measurement Service called with invalid calling package. appId");
                throw e7;
            }
        }
        if (this.f == null) {
            Context context = n4Var.G.f7692v;
            int callingUid = Binder.getCallingUid();
            int i = q7.g.f10914e;
            if (x7.b.h(callingUid, context, str)) {
                this.f = str;
            }
        }
        if (str.equals(this.f)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void J(Runnable runnable) {
        n4 n4Var = this.f7834d;
        if (n4Var.d().J()) {
            runnable.run();
        } else {
            n4Var.d().M(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.k6
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        boolean z2;
        List list;
        n4 n4Var = this.f7834d;
        ArrayList arrayList = null;
        k0 j0Var = null;
        m0 l0Var = null;
        switch (i) {
            case 1:
                v vVar = (v) l6.a(parcel, v.CREATOR);
                v4 v4Var = (v4) l6.a(parcel, v4.CREATOR);
                l6.d(parcel);
                h(vVar, v4Var);
                parcel2.writeNoException();
                return true;
            case 2:
                q4 q4Var = (q4) l6.a(parcel, q4.CREATOR);
                v4 v4Var2 = (v4) l6.a(parcel, v4.CREATOR);
                l6.d(parcel);
                H(q4Var, v4Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                v4 v4Var3 = (v4) l6.a(parcel, v4.CREATOR);
                l6.d(parcel);
                j(v4Var3);
                parcel2.writeNoException();
                return true;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                v vVar2 = (v) l6.a(parcel, v.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                l6.d(parcel);
                t7.y.g(vVar2);
                t7.y.d(string);
                I(string, true);
                J(new ag(this, vVar2, string, 4, false));
                parcel2.writeNoException();
                return true;
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                v4 v4Var4 = (v4) l6.a(parcel, v4.CREATOR);
                l6.d(parcel);
                y(v4Var4);
                parcel2.writeNoException();
                return true;
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                v4 v4Var5 = (v4) l6.a(parcel, v4.CREATOR);
                byte b9 = parcel.readInt() != 0;
                l6.d(parcel);
                f(v4Var5);
                String str = v4Var5.f7805v;
                t7.y.g(str);
                try {
                    List<r4> list2 = (List) n4Var.d().K(new q1(this, str, 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (r4 r4Var : list2) {
                        if (b9 != false || !t4.i0(r4Var.f7739c)) {
                            arrayList2.add(new q4(r4Var));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e7) {
                    e = e7;
                    n4Var.c().B.c(v0.L(str), e, "Failed to get user properties. appId");
                } catch (ExecutionException e10) {
                    e = e10;
                    n4Var.c().B.c(v0.L(str), e, "Failed to get user properties. appId");
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                v vVar3 = (v) l6.a(parcel, v.CREATOR);
                String string2 = parcel.readString();
                l6.d(parcel);
                byte[] bArrS = s(string2, vVar3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrS);
                return true;
            case 10:
                long j8 = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                l6.d(parcel);
                u(j8, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                v4 v4Var6 = (v4) l6.a(parcel, v4.CREATOR);
                l6.d(parcel);
                String strG = G(v4Var6);
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 12:
                e eVar = (e) l6.a(parcel, e.CREATOR);
                v4 v4Var7 = (v4) l6.a(parcel, v4.CREATOR);
                l6.d(parcel);
                A(eVar, v4Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                e eVar2 = (e) l6.a(parcel, e.CREATOR);
                l6.d(parcel);
                t7.y.g(eVar2);
                t7.y.g(eVar2.f7450x);
                t7.y.d(eVar2.f7448v);
                I(eVar2.f7448v, true);
                J(new da.m0(this, new e(eVar2), false, 10));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = l6.f2853a;
                z2 = parcel.readInt() != 0;
                v4 v4Var8 = (v4) l6.a(parcel, v4.CREATOR);
                l6.d(parcel);
                List listK = k(string6, string7, z2, v4Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listK);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = l6.f2853a;
                z2 = parcel.readInt() != 0;
                l6.d(parcel);
                List listL = l(string8, string9, string10, z2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listL);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                v4 v4Var9 = (v4) l6.a(parcel, v4.CREATOR);
                l6.d(parcel);
                List listD = D(string11, string12, v4Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listD);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                l6.d(parcel);
                List listX = x(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listX);
                return true;
            case 18:
                v4 v4Var10 = (v4) l6.a(parcel, v4.CREATOR);
                l6.d(parcel);
                g(v4Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) l6.a(parcel, Bundle.CREATOR);
                v4 v4Var11 = (v4) l6.a(parcel, v4.CREATOR);
                l6.d(parcel);
                F(bundle, v4Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                v4 v4Var12 = (v4) l6.a(parcel, v4.CREATOR);
                l6.d(parcel);
                v(v4Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                v4 v4Var13 = (v4) l6.a(parcel, v4.CREATOR);
                l6.d(parcel);
                i iVarR = r(v4Var13);
                parcel2.writeNoException();
                if (iVarR == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                iVarR.writeToParcel(parcel2, 1);
                return true;
            case 24:
                v4 v4Var14 = (v4) l6.a(parcel, v4.CREATOR);
                Bundle bundle2 = (Bundle) l6.a(parcel, Bundle.CREATOR);
                l6.d(parcel);
                f(v4Var14);
                String str2 = v4Var14.f7805v;
                t7.y.g(str2);
                if (!n4Var.e0().O(null, f0.U0)) {
                    try {
                        list = (List) n4Var.d().K(new u1(this, v4Var14, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e11) {
                        n4Var.c().B.c(v0.L(str2), e11, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) n4Var.d().L(new u1(this, v4Var14, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e12) {
                        n4Var.c().B.c(v0.L(str2), e12, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                v4 v4Var15 = (v4) l6.a(parcel, v4.CREATOR);
                l6.d(parcel);
                E(v4Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                v4 v4Var16 = (v4) l6.a(parcel, v4.CREATOR);
                l6.d(parcel);
                z(v4Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                v4 v4Var17 = (v4) l6.a(parcel, v4.CREATOR);
                l6.d(parcel);
                o(v4Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                v4 v4Var18 = (v4) l6.a(parcel, v4.CREATOR);
                f4 f4Var = (f4) l6.a(parcel, f4.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    l0Var = iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new l0(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 0);
                }
                l6.d(parcel);
                p(v4Var18, f4Var, l0Var);
                parcel2.writeNoException();
                return true;
            case 30:
                v4 v4Var19 = (v4) l6.a(parcel, v4.CREATOR);
                d dVar = (d) l6.a(parcel, d.CREATOR);
                l6.d(parcel);
                w(v4Var19, dVar);
                parcel2.writeNoException();
                return true;
            case 31:
                v4 v4Var20 = (v4) l6.a(parcel, v4.CREATOR);
                Bundle bundle3 = (Bundle) l6.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    j0Var = iInterfaceQueryLocalInterface2 instanceof k0 ? (k0) iInterfaceQueryLocalInterface2 : new j0(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 0);
                }
                l6.d(parcel);
                n(v4Var20, bundle3, j0Var);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void e(Runnable runnable) {
        n4 n4Var = this.f7834d;
        if (n4Var.d().J()) {
            runnable.run();
        } else {
            n4Var.d().O(runnable);
        }
    }

    public final void f(v4 v4Var) {
        t7.y.g(v4Var);
        String str = v4Var.f7805v;
        t7.y.d(str);
        I(str, false);
        this.f7834d.k0().J(v4Var.f7806w);
    }

    @Override // k8.i0
    public final void g(v4 v4Var) {
        String str = v4Var.f7805v;
        t7.y.d(str);
        I(str, false);
        J(new r1(this, v4Var, 3));
    }

    @Override // k8.i0
    public final void h(v vVar, v4 v4Var) {
        t7.y.g(vVar);
        f(v4Var);
        J(new ag(this, vVar, v4Var, 3, false));
    }

    @Override // k8.i0
    public final void j(v4 v4Var) {
        f(v4Var);
        J(new r1(this, v4Var, 0));
    }

    @Override // k8.i0
    public final List k(String str, String str2, boolean z2, v4 v4Var) {
        f(v4Var);
        String str3 = v4Var.f7805v;
        t7.y.g(str3);
        n4 n4Var = this.f7834d;
        try {
            List<r4> list = (List) n4Var.d().K(new t1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (r4 r4Var : list) {
                if (z2 || !t4.i0(r4Var.f7739c)) {
                    arrayList.add(new q4(r4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            n4Var.c().B.c(v0.L(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e10) {
            e = e10;
            n4Var.c().B.c(v0.L(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // k8.i0
    public final List l(String str, String str2, String str3, boolean z2) {
        I(str, true);
        n4 n4Var = this.f7834d;
        try {
            List<r4> list = (List) n4Var.d().K(new t1(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (r4 r4Var : list) {
                if (z2 || !t4.i0(r4Var.f7739c)) {
                    arrayList.add(new q4(r4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            n4Var.c().B.c(v0.L(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e10) {
            e = e10;
            n4Var.c().B.c(v0.L(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // k8.i0
    public final void n(v4 v4Var, Bundle bundle, k0 k0Var) {
        f(v4Var);
        String str = v4Var.f7805v;
        t7.y.g(str);
        this.f7834d.d().M(new v1(this, v4Var, bundle, k0Var, str));
    }

    @Override // k8.i0
    public final void o(v4 v4Var) {
        f(v4Var);
        J(new r1(this, v4Var, 1));
    }

    @Override // k8.i0
    public final void p(v4 v4Var, f4 f4Var, m0 m0Var) {
        f(v4Var);
        String str = v4Var.f7805v;
        t7.y.g(str);
        this.f7834d.d().M(new w1(this, str, f4Var, m0Var, 0));
    }

    @Override // k8.i0
    public final i r(v4 v4Var) {
        f(v4Var);
        String str = v4Var.f7805v;
        t7.y.d(str);
        n4 n4Var = this.f7834d;
        try {
            return (i) n4Var.d().L(new q1(this, v4Var, 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            n4Var.c().B.c(v0.L(str), e7, "Failed to get consent. appId");
            return new i(null);
        }
    }

    @Override // k8.i0
    public final byte[] s(String str, v vVar) {
        t7.y.d(str);
        t7.y.g(vVar);
        I(str, true);
        n4 n4Var = this.f7834d;
        t0 t0Var = n4Var.c().I;
        p1 p1Var = n4Var.G;
        q0 q0Var = p1Var.E;
        String str2 = vVar.f7791v;
        t0Var.b(q0Var.a(str2), "Log and bundle. event");
        n4Var.g().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) n4Var.d().L(new i1(this, vVar, str)).get();
            if (bArr == null) {
                n4Var.c().B.b(v0.L(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            n4Var.g().getClass();
            n4Var.c().I.d("Log and bundle processed. event, size, time_ms", p1Var.E.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e7) {
            e = e7;
            n4Var.c().B.d("Failed to log and bundle. appId, event, error", v0.L(str), p1Var.E.a(str2), e);
            return null;
        } catch (ExecutionException e10) {
            e = e10;
            n4Var.c().B.d("Failed to log and bundle. appId, event, error", v0.L(str), p1Var.E.a(str2), e);
            return null;
        }
    }

    @Override // k8.i0
    public final void u(long j8, String str, String str2, String str3) {
        J(new s1(this, str2, str3, str, j8, 0));
    }

    @Override // k8.i0
    public final void v(v4 v4Var) {
        t7.y.d(v4Var.f7805v);
        t7.y.g(v4Var.N);
        e(new r1(this, v4Var, 4));
    }

    @Override // k8.i0
    public final void w(v4 v4Var, d dVar) {
        f(v4Var);
        J(new ag(this, v4Var, dVar, 6));
    }

    @Override // k8.i0
    public final List x(String str, String str2, String str3) {
        I(str, true);
        n4 n4Var = this.f7834d;
        try {
            return (List) n4Var.d().K(new t1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e7) {
            n4Var.c().B.b(e7, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // k8.i0
    public final void y(v4 v4Var) {
        f(v4Var);
        J(new r1(this, v4Var, 2));
    }

    @Override // k8.i0
    public final void z(v4 v4Var) {
        t7.y.d(v4Var.f7805v);
        t7.y.g(v4Var.N);
        e(new r1(this, v4Var, 5));
    }
}
