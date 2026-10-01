package w8;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends x8.a {
    public static final Parcelable.Creator<h> CREATOR = new f0(0);
    public static final Scope[] L = new Scope[0];
    public static final t8.d[] M = new t8.d[0];
    public String A;
    public IBinder B;
    public Scope[] C;
    public Bundle D;
    public Account E;
    public t8.d[] F;
    public t8.d[] G;
    public final boolean H;
    public final int I;
    public final boolean J;
    public final String K;

    /* renamed from: x, reason: collision with root package name */
    public final int f14189x;

    /* renamed from: y, reason: collision with root package name */
    public final int f14190y;

    /* renamed from: z, reason: collision with root package name */
    public final int f14191z;

    public h(int i6, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, t8.d[] dVarArr, t8.d[] dVarArr2, boolean z10, int i12, boolean z11, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        t8.d[] dVarArr3;
        IInterface xVar;
        if (scopeArr == null) {
            scopeArr2 = L;
        } else {
            scopeArr2 = scopeArr;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        t8.d[] dVarArr4 = M;
        if (dVarArr == null) {
            dVarArr3 = dVarArr4;
        } else {
            dVarArr3 = dVarArr;
        }
        dVarArr4 = dVarArr2 != null ? dVarArr2 : dVarArr4;
        this.f14189x = i6;
        this.f14190y = i10;
        this.f14191z = i11;
        if ("com.google.android.gms".equals(str)) {
            this.A = "com.google.android.gms";
        } else {
            this.A = str;
        }
        if (i6 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = a.f14147f;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof i) {
                    xVar = (i) queryLocalInterface;
                } else {
                    xVar = new com.google.android.gms.internal.measurement.x(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        k0 k0Var = (k0) xVar;
                        Parcel a10 = k0Var.a(k0Var.J(), 2);
                        Account account3 = (Account) i9.a.a(a10, Account.CREATOR);
                        a10.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            }
            this.E = account2;
        } else {
            this.B = iBinder;
            this.E = account;
        }
        this.C = scopeArr2;
        this.D = bundle2;
        this.F = dVarArr3;
        this.G = dVarArr4;
        this.H = z10;
        this.I = i12;
        this.J = z11;
        this.K = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        f0.a(this, parcel, i6);
    }
}
