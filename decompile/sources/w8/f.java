package w8;

import a2.a2;
import android.accounts.Account;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: x */
    public static final t8.d[] f14159x = new t8.d[0];

    /* renamed from: b */
    public r8.a f14161b;

    /* renamed from: c */
    public final Context f14162c;

    /* renamed from: d */
    public final i0 f14163d;

    /* renamed from: e */
    public final t8.f f14164e;

    /* renamed from: f */
    public final z f14165f;

    /* renamed from: i */
    public t f14168i;
    public d j;

    /* renamed from: k */
    public IInterface f14169k;

    /* renamed from: m */
    public b0 f14171m;

    /* renamed from: o */
    public final b f14173o;

    /* renamed from: p */
    public final c f14174p;

    /* renamed from: q */
    public final int f14175q;

    /* renamed from: r */
    public final String f14176r;
    public volatile String s;

    /* renamed from: a */
    public volatile String f14160a = null;

    /* renamed from: g */
    public final Object f14166g = new Object();

    /* renamed from: h */
    public final Object f14167h = new Object();

    /* renamed from: l */
    public final ArrayList f14170l = new ArrayList();

    /* renamed from: n */
    public int f14172n = 1;

    /* renamed from: t */
    public t8.b f14177t = null;

    /* renamed from: u */
    public boolean f14178u = false;

    /* renamed from: v */
    public volatile e0 f14179v = null;

    /* renamed from: w */
    public final AtomicInteger f14180w = new AtomicInteger(0);

    public f(Context context, Looper looper, i0 i0Var, t8.f fVar, int i6, b bVar, c cVar, String str) {
        x.h(context, "Context must not be null");
        this.f14162c = context;
        x.h(looper, "Looper must not be null");
        x.h(i0Var, "Supervisor must not be null");
        this.f14163d = i0Var;
        x.h(fVar, "API availability must not be null");
        this.f14164e = fVar;
        this.f14165f = new z(this, looper);
        this.f14175q = i6;
        this.f14173o = bVar;
        this.f14174p = cVar;
        this.f14176r = str;
    }

    public static /* bridge */ /* synthetic */ void y(f fVar) {
        int i6;
        int i10;
        synchronized (fVar.f14166g) {
            i6 = fVar.f14172n;
        }
        if (i6 == 3) {
            fVar.f14178u = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        z zVar = fVar.f14165f;
        zVar.sendMessage(zVar.obtainMessage(i10, fVar.f14180w.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean z(f fVar, int i6, int i10, IInterface iInterface) {
        synchronized (fVar.f14166g) {
            try {
                if (fVar.f14172n != i6) {
                    return false;
                }
                fVar.A(i10, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void A(int i6, IInterface iInterface) {
        boolean z10;
        boolean z11;
        boolean z12;
        r8.a aVar;
        boolean z13 = false;
        if (i6 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (iInterface == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 == z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        x.b(z12);
        synchronized (this.f14166g) {
            try {
                this.f14172n = i6;
                this.f14169k = iInterface;
                Bundle bundle = null;
                if (i6 != 1) {
                    if (i6 != 2 && i6 != 3) {
                        if (i6 == 4) {
                            x.g(iInterface);
                            System.currentTimeMillis();
                        }
                    } else {
                        b0 b0Var = this.f14171m;
                        if (b0Var != null && (aVar = this.f14161b) != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + aVar.f11870b + " on com.google.android.gms");
                            i0 i0Var = this.f14163d;
                            String str = this.f14161b.f11870b;
                            x.g(str);
                            this.f14161b.getClass();
                            if (this.f14176r == null) {
                                this.f14162c.getClass();
                            }
                            i0Var.d(str, b0Var, this.f14161b.f11871c);
                            this.f14180w.incrementAndGet();
                        }
                        b0 b0Var2 = new b0(this, this.f14180w.get());
                        this.f14171m = b0Var2;
                        String w10 = w();
                        boolean x10 = x();
                        this.f14161b = new r8.a(w10, x10, 1);
                        if (x10 && j() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f14161b.f11870b)));
                        }
                        i0 i0Var2 = this.f14163d;
                        String str2 = this.f14161b.f11870b;
                        x.g(str2);
                        this.f14161b.getClass();
                        String str3 = this.f14176r;
                        if (str3 == null) {
                            str3 = this.f14162c.getClass().getName();
                        }
                        t8.b c10 = i0Var2.c(new g0(str2, this.f14161b.f11871c), b0Var2, str3, null);
                        if (c10.f12629y == 0) {
                            z13 = true;
                        }
                        if (!z13) {
                            Log.w("GmsClient", "unable to connect to service: " + this.f14161b.f11870b + " on com.google.android.gms");
                            int i10 = c10.f12629y;
                            if (i10 == -1) {
                                i10 = 16;
                            }
                            if (c10.f12630z != null) {
                                bundle = new Bundle();
                                bundle.putParcelable("pendingIntent", c10.f12630z);
                            }
                            int i11 = this.f14180w.get();
                            d0 d0Var = new d0(this, i10, bundle);
                            z zVar = this.f14165f;
                            zVar.sendMessage(zVar.obtainMessage(7, i11, -1, d0Var));
                        }
                    }
                } else {
                    b0 b0Var3 = this.f14171m;
                    if (b0Var3 != null) {
                        i0 i0Var3 = this.f14163d;
                        String str4 = this.f14161b.f11870b;
                        x.g(str4);
                        this.f14161b.getClass();
                        if (this.f14176r == null) {
                            this.f14162c.getClass();
                        }
                        i0Var3.d(str4, b0Var3, this.f14161b.f11871c);
                        this.f14171m = null;
                    }
                }
            } finally {
            }
        }
    }

    public final void a(d dVar) {
        this.j = dVar;
        A(2, null);
    }

    public final void b(a2 a2Var) {
        ((v8.j) a2Var.f162y).f13462o.J.post(new v8.i(a2Var, 0));
    }

    public final void d(String str) {
        this.f14160a = str;
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(i iVar, Set set) {
        String str;
        Bundle s = s();
        if (Build.VERSION.SDK_INT < 31) {
            str = this.s;
        } else {
            str = this.s;
        }
        String str2 = str;
        int i6 = this.f14175q;
        int i10 = t8.f.f12639a;
        Scope[] scopeArr = h.L;
        Bundle bundle = new Bundle();
        t8.d[] dVarArr = h.M;
        h hVar = new h(6, i6, i10, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str2);
        hVar.A = this.f14162c.getPackageName();
        hVar.D = s;
        if (set != null) {
            hVar.C = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            Account q9 = q();
            if (q9 == null) {
                q9 = new Account("<<default account>>", "com.google");
            }
            hVar.E = q9;
            if (iVar != 0) {
                hVar.B = ((com.google.android.gms.internal.measurement.x) iVar).f2515f;
            }
        }
        hVar.F = f14159x;
        hVar.G = r();
        try {
            synchronized (this.f14167h) {
                try {
                    t tVar = this.f14168i;
                    if (tVar != null) {
                        tVar.a(new a0(this, this.f14180w.get()), hVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i11 = this.f14180w.get();
            z zVar = this.f14165f;
            zVar.sendMessage(zVar.obtainMessage(6, i11, 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i12 = this.f14180w.get();
            c0 c0Var = new c0(this, 8, null, null);
            z zVar2 = this.f14165f;
            zVar2.sendMessage(zVar2.obtainMessage(1, i12, -1, c0Var));
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i122 = this.f14180w.get();
            c0 c0Var2 = new c0(this, 8, null, null);
            z zVar22 = this.f14165f;
            zVar22.sendMessage(zVar22.obtainMessage(1, i122, -1, c0Var2));
        }
    }

    public final boolean f() {
        boolean z10;
        synchronized (this.f14166g) {
            int i6 = this.f14172n;
            z10 = true;
            if (i6 != 2 && i6 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public final void g() {
        if (i() && this.f14161b != null) {
        } else {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void h() {
        this.f14180w.incrementAndGet();
        synchronized (this.f14170l) {
            try {
                int size = this.f14170l.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((r) this.f14170l.get(i6)).c();
                }
                this.f14170l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f14167h) {
            this.f14168i = null;
        }
        A(1, null);
    }

    public final boolean i() {
        boolean z10;
        synchronized (this.f14166g) {
            if (this.f14172n == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public abstract int j();

    public final t8.d[] k() {
        e0 e0Var = this.f14179v;
        if (e0Var == null) {
            return null;
        }
        return e0Var.f14157y;
    }

    public final String l() {
        return this.f14160a;
    }

    public boolean m() {
        return false;
    }

    public final void o() {
        int b10 = this.f14164e.b(this.f14162c, j());
        if (b10 != 0) {
            A(1, null);
            this.j = new e(this);
            int i6 = this.f14180w.get();
            z zVar = this.f14165f;
            zVar.sendMessage(zVar.obtainMessage(3, i6, b10, null));
            return;
        }
        a(new e(this));
    }

    public abstract IInterface p(IBinder iBinder);

    public Account q() {
        return null;
    }

    public t8.d[] r() {
        return f14159x;
    }

    public Bundle s() {
        return new Bundle();
    }

    public Set t() {
        return Collections.EMPTY_SET;
    }

    public final IInterface u() {
        IInterface iInterface;
        synchronized (this.f14166g) {
            try {
                if (this.f14172n != 5) {
                    if (i()) {
                        iInterface = this.f14169k;
                        x.h(iInterface, "Client is connected but service is null");
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String v();

    public abstract String w();

    public boolean x() {
        if (j() >= 211700000) {
            return true;
        }
        return false;
    }
}
