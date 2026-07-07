package t7;

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

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends u7.a {
    public static final Parcelable.Creator<g> CREATOR = new m8.c(23);
    public static final Scope[] J = new Scope[0];
    public static final q7.d[] K = new q7.d[0];
    public Scope[] A;
    public Bundle B;
    public Account C;
    public q7.d[] D;
    public q7.d[] E;
    public final boolean F;
    public final int G;
    public final boolean H;
    public final String I;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12344v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f12345w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f12346x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f12347y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public IBinder f12348z;

    public g(int i, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, q7.d[] dVarArr, q7.d[] dVarArr2, boolean z2, int i12, boolean z10, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? J : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        q7.d[] dVarArr3 = K;
        q7.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f12344v = i;
        this.f12345w = i10;
        this.f12346x = i11;
        if ("com.google.android.gms".equals(str)) {
            this.f12347y = "com.google.android.gms";
        } else {
            this.f12347y = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = a.f12307e;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface k0Var = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new k0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        k0 k0Var2 = (k0) k0Var;
                        Parcel parcelC = k0Var2.c(k0Var2.f(), 2);
                        Account account3 = (Account) f8.h.a(parcelC, Account.CREATOR);
                        parcelC.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
            this.C = account2;
        } else {
            this.f12348z = iBinder;
            this.C = account;
        }
        this.A = scopeArr2;
        this.B = bundle2;
        this.D = dVarArr4;
        this.E = dVarArr3;
        this.F = z2;
        this.G = i12;
        this.H = z10;
        this.I = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        m8.c.a(this, parcel, i);
    }
}
