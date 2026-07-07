package w8;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h0 implements ServiceConnection {
    public IBinder A;
    public final g0 B;
    public ComponentName C;
    public final /* synthetic */ i0 D;

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f14192x = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    public int f14193y = 2;

    /* renamed from: z, reason: collision with root package name */
    public boolean f14194z;

    public h0(i0 i0Var, g0 g0Var) {
        this.D = i0Var;
        this.B = g0Var;
    }

    public static t8.b a(h0 h0Var, String str, Executor executor) {
        try {
            Intent a10 = h0Var.B.a(h0Var.D.f14199b);
            h0Var.f14193y = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(a9.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                i0 i0Var = h0Var.D;
                boolean d10 = i0Var.f14201d.d(i0Var.f14199b, str, a10, h0Var, 4225, executor);
                h0Var.f14194z = d10;
                if (d10) {
                    h0Var.D.f14200c.sendMessageDelayed(h0Var.D.f14200c.obtainMessage(1, h0Var.B), h0Var.D.f14203f);
                    t8.b bVar = t8.b.B;
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar;
                }
                h0Var.f14193y = 2;
                try {
                    i0 i0Var2 = h0Var.D;
                    i0Var2.f14201d.c(i0Var2.f14199b, h0Var);
                } catch (IllegalArgumentException unused) {
                }
                t8.b bVar2 = new t8.b(16);
                StrictMode.setVmPolicy(vmPolicy);
                return bVar2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (y e10) {
            return e10.f14234x;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.D.f14198a) {
            try {
                this.D.f14200c.removeMessages(1, this.B);
                this.A = iBinder;
                this.C = componentName;
                Iterator it = this.f14192x.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f14193y = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.D.f14198a) {
            try {
                this.D.f14200c.removeMessages(1, this.B);
                this.A = null;
                this.C = componentName;
                Iterator it = this.f14192x.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f14193y = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
