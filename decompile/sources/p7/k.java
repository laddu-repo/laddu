package p7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.t6;
import com.google.android.gms.internal.measurement.tb;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ServiceConnection {
    public final /* synthetic */ m A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10418v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Messenger f10419w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ob.d f10420x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayDeque f10421y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final SparseArray f10422z;

    public k(m mVar) {
        this.A = mVar;
        t6 t6Var = new t6(Looper.getMainLooper(), new n6.f(1, this));
        Looper.getMainLooper();
        this.f10419w = new Messenger(t6Var);
        this.f10421y = new ArrayDeque();
        this.f10422z = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.f10418v;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.f10418v = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f10418v = 4;
            w7.a.b().c((Context) this.A.f10430w, this);
            tb tbVar = new tb(str, securityException);
            Iterator it = this.f10421y.iterator();
            while (it.hasNext()) {
                ((l) it.next()).b(tbVar);
            }
            this.f10421y.clear();
            for (int i10 = 0; i10 < this.f10422z.size(); i10++) {
                ((l) this.f10422z.valueAt(i10)).b(tbVar);
            }
            this.f10422z.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f10418v == 2 && this.f10421y.isEmpty() && this.f10422z.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f10418v = 3;
                w7.a.b().c((Context) this.A.f10430w, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(l lVar) {
        int i = this.f10418v;
        if (i != 0) {
            if (i == 1) {
                this.f10421y.add(lVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.f10421y.add(lVar);
            ((ScheduledExecutorService) this.A.f10431x).execute(new j(this, 0));
            return true;
        }
        this.f10421y.add(lVar);
        if (this.f10418v != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f10418v = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (w7.a.b().a((Context) this.A.f10430w, intent, this, 1)) {
                ((ScheduledExecutorService) this.A.f10431x).schedule(new j(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e7) {
            b("Unable to bind to service", e7);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.A.f10431x).execute(new o8.m(this, iBinder, false, 2));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.A.f10431x).execute(new j(this, 2));
    }
}
