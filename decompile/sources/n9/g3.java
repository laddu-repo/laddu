package n9;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g3 implements ServiceConnection, w8.b, w8.c {

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f9328x;

    /* renamed from: y, reason: collision with root package name */
    public volatile q0 f9329y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ h3 f9330z;

    public g3(h3 h3Var) {
        this.f9330z = h3Var;
    }

    @Override // w8.c
    public final void a(t8.b bVar) {
        h3 h3Var = this.f9330z;
        l1 l1Var = ((n1) h3Var.f4301y).D;
        n1.g(l1Var);
        l1Var.i1();
        u0 u0Var = ((n1) h3Var.f4301y).C;
        if (u0Var == null || !u0Var.f9493z) {
            u0Var = null;
        }
        if (u0Var != null) {
            u0Var.L.b(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f9328x = false;
            this.f9329y = null;
        }
        l1 l1Var2 = ((n1) this.f9330z.f4301y).D;
        n1.g(l1Var2);
        l1Var2.m1(new hb.s(this, bVar, 23, false));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [n9.q0, w8.f] */
    public final void b() {
        h3 h3Var = this.f9330z;
        h3Var.d1();
        Context context = ((n1) h3Var.f4301y).f9413x;
        synchronized (this) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (this.f9328x) {
                    u0 u0Var = ((n1) this.f9330z.f4301y).C;
                    n1.g(u0Var);
                    u0Var.L.a("Connection attempt already in progress");
                } else {
                    if (this.f9329y != null && (this.f9329y.f() || this.f9329y.i())) {
                        u0 u0Var2 = ((n1) this.f9330z.f4301y).C;
                        n1.g(u0Var2);
                        u0Var2.L.a("Already awaiting connection attempt");
                        return;
                    }
                    this.f9329y = new w8.f(context, Looper.getMainLooper(), w8.i0.a(context), t8.f.f12640b, 93, this, this, null);
                    u0 u0Var3 = ((n1) this.f9330z.f4301y).C;
                    n1.g(u0Var3);
                    u0Var3.L.a("Connecting to remote service");
                    this.f9328x = true;
                    w8.x.g(this.f9329y);
                    this.f9329y.o();
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // w8.b
    public final void d(int i6) {
        n1 n1Var = (n1) this.f9330z.f4301y;
        l1 l1Var = n1Var.D;
        n1.g(l1Var);
        l1Var.i1();
        u0 u0Var = n1Var.C;
        n1.g(u0Var);
        u0Var.K.a("Service connection suspended");
        l1 l1Var2 = n1Var.D;
        n1.g(l1Var2);
        l1Var2.m1(new a1.e(this, 10));
    }

    @Override // w8.b
    public final void onConnected() {
        l1 l1Var = ((n1) this.f9330z.f4301y).D;
        n1.g(l1Var);
        l1Var.i1();
        synchronized (this) {
            try {
                w8.x.g(this.f9329y);
                h0 h0Var = (h0) this.f9329y.u();
                l1 l1Var2 = ((n1) this.f9330z.f4301y).D;
                n1.g(l1Var2);
                l1Var2.m1(new e3(this, h0Var, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f9329y = null;
                this.f9328x = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        h0 f0Var;
        l1 l1Var = ((n1) this.f9330z.f4301y).D;
        n1.g(l1Var);
        l1Var.i1();
        synchronized (this) {
            if (iBinder == null) {
                this.f9328x = false;
                u0 u0Var = ((n1) this.f9330z.f4301y).C;
                n1.g(u0Var);
                u0Var.D.a("Service connected with null binder");
                return;
            }
            h0 h0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof h0) {
                        f0Var = (h0) queryLocalInterface;
                    } else {
                        f0Var = new f0(iBinder);
                    }
                    h0Var = f0Var;
                    u0 u0Var2 = ((n1) this.f9330z.f4301y).C;
                    n1.g(u0Var2);
                    u0Var2.L.a("Bound to IMeasurementService interface");
                } else {
                    u0 u0Var3 = ((n1) this.f9330z.f4301y).C;
                    n1.g(u0Var3);
                    u0Var3.D.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                u0 u0Var4 = ((n1) this.f9330z.f4301y).C;
                n1.g(u0Var4);
                u0Var4.D.a("Service connect failed to get IMeasurementService");
            }
            if (h0Var == null) {
                this.f9328x = false;
                try {
                    z8.a b10 = z8.a.b();
                    h3 h3Var = this.f9330z;
                    b10.c(((n1) h3Var.f4301y).f9413x, h3Var.A);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                l1 l1Var2 = ((n1) this.f9330z.f4301y).D;
                n1.g(l1Var2);
                l1Var2.m1(new e3(this, h0Var, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        n1 n1Var = (n1) this.f9330z.f4301y;
        l1 l1Var = n1Var.D;
        n1.g(l1Var);
        l1Var.i1();
        u0 u0Var = n1Var.C;
        n1.g(u0Var);
        u0Var.K.a("Service disconnected");
        l1 l1Var2 = n1Var.D;
        n1.g(l1Var2);
        l1Var2.m1(new hb.s(this, componentName, 22, false));
    }
}
