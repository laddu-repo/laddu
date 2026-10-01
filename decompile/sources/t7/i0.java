package t7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements ServiceConnection {
    public ComponentName A;
    public final /* synthetic */ j0 B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashMap f12357v = new HashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12358w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12359x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public IBinder f12360y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final h0 f12361z;

    public i0(j0 j0Var, h0 h0Var) {
        this.B = j0Var;
        this.f12361z = h0Var;
    }

    public final q7.b a(String str, Executor executor) throws Throwable {
        j0 j0Var;
        w7.a aVar;
        Context context;
        h0 h0Var;
        try {
            Intent intentA = a0.a(this.B.f12370b, this.f12361z);
            this.f12358w = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(x7.e.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                j0Var = this.B;
                aVar = j0Var.f12372d;
                context = j0Var.f12370b;
                h0Var = this.f12361z;
            } catch (Throwable th) {
                th = th;
            }
            try {
                boolean zD = aVar.d(context, str, intentA, this, 4225, executor);
                this.f12359x = zD;
                if (zD) {
                    j0Var.f12371c.sendMessageDelayed(j0Var.f12371c.obtainMessage(1, h0Var), j0Var.f);
                    q7.b bVar = q7.b.A;
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar;
                }
                this.f12358w = 2;
                try {
                    j0Var.f12372d.c(j0Var.f12370b, this);
                } catch (IllegalArgumentException unused) {
                }
                q7.b bVar2 = new q7.b(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                return bVar2;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                StrictMode.setVmPolicy(vmPolicy);
                throw th3;
            }
        } catch (z e7) {
            return e7.f12417v;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        j0 j0Var = this.B;
        synchronized (j0Var.f12369a) {
            try {
                j0Var.f12371c.removeMessages(1, this.f12361z);
                this.f12360y = iBinder;
                this.A = componentName;
                Iterator it = this.f12357v.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f12358w = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        j0 j0Var = this.B;
        synchronized (j0Var.f12369a) {
            try {
                j0Var.f12371c.removeMessages(1, this.f12361z);
                this.f12360y = null;
                this.A = componentName;
                Iterator it = this.f12357v.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f12358w = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
