package t7;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.measurement.j6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k8.g2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final q7.d[] f12313y = new q7.d[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l7.a f12315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f12316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0 f12317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q7.f f12318e;
    public final b0 f;
    public u i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f12321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IInterface f12322k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d0 f12324m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f12326o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f12327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f12328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f12329r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile String f12330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile z7.a f12331t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f12314a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f12319g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f12320h = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f12323l = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12325n = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q7.b f12332u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12333v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile g0 f12334w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicInteger f12335x = new AtomicInteger(0);

    public e(Context context, Looper looper, j0 j0Var, q7.f fVar, int i, b bVar, c cVar, String str) {
        y.h(context, "Context must not be null");
        this.f12316c = context;
        y.h(looper, "Looper must not be null");
        y.h(j0Var, "Supervisor must not be null");
        this.f12317d = j0Var;
        y.h(fVar, "API availability must not be null");
        this.f12318e = fVar;
        this.f = new b0(this, looper);
        this.f12328q = i;
        this.f12326o = bVar;
        this.f12327p = cVar;
        this.f12329r = str;
    }

    public abstract int a();

    public boolean b() {
        return false;
    }

    public final void c() {
        int iB = this.f12318e.b(this.f12316c, a());
        if (iB == 0) {
            this.f12321j = new g2(this);
            u(2, null);
            return;
        }
        u(1, null);
        this.f12321j = new g2(this);
        int i = this.f12335x.get();
        b0 b0Var = this.f;
        b0Var.sendMessage(b0Var.obtainMessage(3, i, iB, null));
    }

    public abstract IInterface d(IBinder iBinder);

    public final void e() {
        this.f12335x.incrementAndGet();
        ArrayList arrayList = this.f12323l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((t) arrayList.get(i)).d();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f12320h) {
            this.i = null;
        }
        u(1, null);
    }

    public final void f(String str) {
        this.f12314a = str;
        e();
    }

    public Account g() {
        return null;
    }

    public q7.d[] h() {
        return f12313y;
    }

    public Executor i() {
        return null;
    }

    public Bundle j() {
        return new Bundle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(i iVar, Set set) {
        AttributionSource attributionSource;
        Bundle bundleJ = j();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.f12331t == null || (attributionSource = (AttributionSource) this.f12331t.f14821v) == null || attributionSource.getAttributionTag() == null) ? this.f12330s : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i = this.f12328q;
        int i10 = q7.f.f10908a;
        Scope[] scopeArr = g.J;
        Bundle bundle = new Bundle();
        q7.d[] dVarArr = g.K;
        g gVar = new g(6, i, i10, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        gVar.f12347y = this.f12316c.getPackageName();
        gVar.B = bundleJ;
        if (set != null) {
            gVar.A = (Scope[]) set.toArray(new Scope[0]);
        }
        if (b()) {
            Account accountG = g();
            if (accountG == null) {
                accountG = new Account("<<default account>>", "com.google");
            }
            gVar.C = accountG;
            if (iVar != 0) {
                gVar.f12348z = ((j6) iVar).f2790e;
            }
        }
        gVar.D = f12313y;
        gVar.E = h();
        try {
            synchronized (this.f12320h) {
                try {
                    u uVar = this.i;
                    if (uVar != null) {
                        uVar.c(new c0(this, this.f12335x.get()), gVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e7) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e7);
            int i11 = this.f12335x.get();
            b0 b0Var = this.f;
            b0Var.sendMessage(b0Var.obtainMessage(6, i11, 3));
        } catch (RemoteException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i12 = this.f12335x.get();
            e0 e0Var = new e0(this, 8, null, null);
            b0 b0Var2 = this.f;
            b0Var2.sendMessage(b0Var2.obtainMessage(1, i12, -1, e0Var));
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i122 = this.f12335x.get();
            e0 e0Var2 = new e0(this, 8, null, null);
            b0 b0Var22 = this.f;
            b0Var22.sendMessage(b0Var22.obtainMessage(1, i122, -1, e0Var2));
        }
    }

    public Set l() {
        return Collections.EMPTY_SET;
    }

    public final IInterface m() {
        IInterface iInterface;
        synchronized (this.f12319g) {
            try {
                if (this.f12325n == 5) {
                    throw new DeadObjectException();
                }
                if (!q()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f12322k;
                y.h(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String n();

    public abstract String o();

    public boolean p() {
        return a() >= 211700000;
    }

    public final boolean q() {
        boolean z2;
        synchronized (this.f12319g) {
            z2 = this.f12325n == 4;
        }
        return z2;
    }

    public final boolean r() {
        boolean z2;
        synchronized (this.f12319g) {
            int i = this.f12325n;
            z2 = true;
            if (i != 2 && i != 3) {
                z2 = false;
            }
        }
        return z2;
    }

    public final /* synthetic */ boolean s(int i, int i10, IInterface iInterface) {
        synchronized (this.f12319g) {
            try {
                if (this.f12325n != i) {
                    return false;
                }
                u(i10, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void t() {
        int i;
        int i10;
        synchronized (this.f12319g) {
            i = this.f12325n;
        }
        if (i == 3) {
            this.f12333v = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        b0 b0Var = this.f;
        b0Var.sendMessage(b0Var.obtainMessage(i10, this.f12335x.get(), 16));
    }

    public final void u(int i, IInterface iInterface) {
        l7.a aVar;
        y.b((i == 4) == (iInterface != null));
        synchronized (this.f12319g) {
            try {
                this.f12325n = i;
                this.f12322k = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    d0 d0Var = this.f12324m;
                    if (d0Var != null) {
                        j0 j0Var = this.f12317d;
                        String str = this.f12315b.f8301c;
                        y.g(str);
                        this.f12315b.getClass();
                        if (this.f12329r == null) {
                            this.f12316c.getClass();
                        }
                        j0Var.d(str, d0Var, this.f12315b.f8300b);
                        this.f12324m = null;
                    }
                } else if (i == 2 || i == 3) {
                    d0 d0Var2 = this.f12324m;
                    if (d0Var2 != null && (aVar = this.f12315b) != null) {
                        String str2 = aVar.f8301c;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(str2);
                        sb2.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb2.toString());
                        j0 j0Var2 = this.f12317d;
                        String str3 = this.f12315b.f8301c;
                        y.g(str3);
                        this.f12315b.getClass();
                        if (this.f12329r == null) {
                            this.f12316c.getClass();
                        }
                        j0Var2.d(str3, d0Var2, this.f12315b.f8300b);
                        this.f12335x.incrementAndGet();
                    }
                    d0 d0Var3 = new d0(this, this.f12335x.get());
                    this.f12324m = d0Var3;
                    String strO = o();
                    boolean zP = p();
                    this.f12315b = new l7.a(strO, zP, 3);
                    if (zP && a() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f12315b.f8301c)));
                    }
                    j0 j0Var3 = this.f12317d;
                    String str4 = this.f12315b.f8301c;
                    y.g(str4);
                    this.f12315b.getClass();
                    String name = this.f12329r;
                    if (name == null) {
                        name = this.f12316c.getClass().getName();
                    }
                    q7.b bVarC = j0Var3.c(new h0(str4, this.f12315b.f8300b), d0Var3, name, i());
                    if (!(bVarC.f10894w == 0)) {
                        String str5 = this.f12315b.f8301c;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(str5);
                        sb3.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb3.toString());
                        int i10 = bVarC.f10894w;
                        if (i10 == -1) {
                            i10 = 16;
                        }
                        if (bVarC.f10895x != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", bVarC.f10895x);
                        }
                        int i11 = this.f12335x.get();
                        f0 f0Var = new f0(this, i10, bundle);
                        b0 b0Var = this.f;
                        b0Var.sendMessage(b0Var.obtainMessage(7, i11, -1, f0Var));
                    }
                } else if (i == 4) {
                    y.g(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
