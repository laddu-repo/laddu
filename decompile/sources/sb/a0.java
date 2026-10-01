package sb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements ServiceConnection {
    public boolean A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f11705v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Intent f11706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f11707x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayDeque f11708y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public y f11709z;

    public a0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new y7.a("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11708y = new ArrayDeque();
        this.A = false;
        Context applicationContext = context.getApplicationContext();
        this.f11705v = applicationContext;
        this.f11706w = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f11707x = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f11708y.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                y yVar = this.f11709z;
                if (yVar == null || !yVar.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f11709z.a((z) this.f11708y.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized o8.o b(Intent intent) {
        z zVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            zVar = new z(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f11707x;
            zVar.f11783b.f9963a.b(scheduledThreadPoolExecutor, new pa.a(7, scheduledThreadPoolExecutor.schedule(new jd.j(5, zVar), 20L, TimeUnit.SECONDS)));
            this.f11708y.add(zVar);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return zVar.f11783b.f9963a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.A);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.A) {
            return;
        }
        this.A = true;
        try {
            if (w7.a.b().a(this.f11705v, this.f11706w, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e7) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e7);
        }
        this.A = false;
        while (true) {
            ArrayDeque arrayDeque = this.f11708y;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((z) arrayDeque.poll()).f11783b.c(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.A = false;
            if (iBinder instanceof y) {
                this.f11709z = (y) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f11708y;
            while (!arrayDeque.isEmpty()) {
                ((z) arrayDeque.poll()).f11783b.c(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
