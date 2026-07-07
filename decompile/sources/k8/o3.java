package k8;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o3 implements ServiceConnection, t7.b, t7.c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile boolean f7674v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile r0 f7675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p3 f7676x;

    public o3(p3 p3Var) {
        this.f7676x = p3Var;
    }

    public final void a() {
        p3 p3Var = this.f7676x;
        p3Var.D();
        Context context = ((p1) p3Var.f2053w).f7692v;
        synchronized (this) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (this.f7674v) {
                    v0 v0Var = ((p1) this.f7676x.f2053w).A;
                    p1.l(v0Var);
                    v0Var.J.a("Connection attempt already in progress");
                } else {
                    if (this.f7675w != null && (this.f7675w.r() || this.f7675w.q())) {
                        v0 v0Var2 = ((p1) this.f7676x.f2053w).A;
                        p1.l(v0Var2);
                        v0Var2.J.a("Already awaiting connection attempt");
                        return;
                    }
                    this.f7675w = new r0(context, Looper.getMainLooper(), t7.j0.a(context), q7.f.f10909b, 93, this, this, null);
                    v0 v0Var3 = ((p1) this.f7676x.f2053w).A;
                    p1.l(v0Var3);
                    v0Var3.J.a("Connecting to remote service");
                    this.f7674v = true;
                    t7.y.g(this.f7675w);
                    this.f7675w.c();
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // t7.c
    public final void c(q7.b bVar) {
        p3 p3Var = this.f7676x;
        n1 n1Var = ((p1) p3Var.f2053w).B;
        p1.l(n1Var);
        n1Var.I();
        v0 v0Var = ((p1) p3Var.f2053w).A;
        if (v0Var == null || !v0Var.f7851x) {
            v0Var = null;
        }
        if (v0Var != null) {
            v0Var.J.b(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f7674v = false;
            this.f7675w = null;
        }
        n1 n1Var2 = ((p1) this.f7676x.f2053w).B;
        p1.l(n1Var2);
        n1Var2.M(new da.m0(this, bVar, false, 19));
    }

    @Override // t7.b
    public final void e(int i) {
        p1 p1Var = (p1) this.f7676x.f2053w;
        n1 n1Var = p1Var.B;
        p1.l(n1Var);
        n1Var.I();
        v0 v0Var = p1Var.A;
        p1.l(v0Var);
        v0Var.I.a("Service connection suspended");
        n1 n1Var2 = p1Var.B;
        p1.l(n1Var2);
        n1Var2.M(new androidx.fragment.app.m(12, this));
    }

    @Override // t7.b
    public final void f() {
        n1 n1Var = ((p1) this.f7676x.f2053w).B;
        p1.l(n1Var);
        n1Var.I();
        synchronized (this) {
            try {
                t7.y.g(this.f7675w);
                i0 i0Var = (i0) this.f7675w.m();
                n1 n1Var2 = ((p1) this.f7676x.f2053w).B;
                p1.l(n1Var2);
                n1Var2.M(new m3(this, i0Var, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f7675w = null;
                this.f7674v = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        n1 n1Var = ((p1) this.f7676x.f2053w).B;
        p1.l(n1Var);
        n1Var.I();
        synchronized (this) {
            if (iBinder == null) {
                this.f7674v = false;
                v0 v0Var = ((p1) this.f7676x.f2053w).A;
                p1.l(v0Var);
                v0Var.B.a("Service connected with null binder");
                return;
            }
            i0 g0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    g0Var = iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new g0(iBinder);
                    v0 v0Var2 = ((p1) this.f7676x.f2053w).A;
                    p1.l(v0Var2);
                    v0Var2.J.a("Bound to IMeasurementService interface");
                } else {
                    v0 v0Var3 = ((p1) this.f7676x.f2053w).A;
                    p1.l(v0Var3);
                    v0Var3.B.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                v0 v0Var4 = ((p1) this.f7676x.f2053w).A;
                p1.l(v0Var4);
                v0Var4.B.a("Service connect failed to get IMeasurementService");
            }
            if (g0Var == null) {
                this.f7674v = false;
                try {
                    w7.a aVarB = w7.a.b();
                    p3 p3Var = this.f7676x;
                    aVarB.c(((p1) p3Var.f2053w).f7692v, p3Var.f7700y);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                n1 n1Var2 = ((p1) this.f7676x.f2053w).B;
                p1.l(n1Var2);
                n1Var2.M(new m3(this, g0Var, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        p1 p1Var = (p1) this.f7676x.f2053w;
        n1 n1Var = p1Var.B;
        p1.l(n1Var);
        n1Var.I();
        v0 v0Var = p1Var.A;
        p1.l(v0Var);
        v0Var.I.a("Service disconnected");
        n1 n1Var2 = p1Var.B;
        p1.l(n1Var2);
        n1Var2.M(new da.m0(this, componentName, false, 18));
    }
}
