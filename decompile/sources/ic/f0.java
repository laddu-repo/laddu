package ic;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f0 implements ServiceConnection {
    public final ArrayDeque A;
    public d0 B;
    public boolean C;

    /* renamed from: x, reason: collision with root package name */
    public final Context f6748x;

    /* renamed from: y, reason: collision with root package name */
    public final Intent f6749y;

    /* renamed from: z, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f6750z;

    public f0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new b9.a("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A = new ArrayDeque();
        this.C = false;
        Context applicationContext = context.getApplicationContext();
        this.f6748x = applicationContext;
        this.f6749y = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f6750z = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.A.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                d0 d0Var = this.B;
                if (d0Var != null && d0Var.isBinderAlive()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    this.B.a((e0) this.A.poll());
                } else {
                    c();
                    return;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized s9.n b(Intent intent) {
        e0 e0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            e0Var = new e0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f6750z;
            e0Var.f6746b.f12263a.i(scheduledThreadPoolExecutor, new a2.e0(scheduledThreadPoolExecutor.schedule(new a2.a(e0Var, 27), 20L, TimeUnit.SECONDS), 29));
            this.A.add(e0Var);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return e0Var.f6746b.f12263a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.C);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (!this.C) {
            this.C = true;
            try {
            } catch (SecurityException e10) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e10);
            }
            if (!z8.a.b().a(this.f6748x, this.f6749y, this, 65)) {
                Log.e("FirebaseMessaging", "binding to the service failed");
                this.C = false;
                while (true) {
                    ArrayDeque arrayDeque = this.A;
                    if (!arrayDeque.isEmpty()) {
                        ((e0) arrayDeque.poll()).f6746b.c(null);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.C = false;
            if (!(iBinder instanceof d0)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                ArrayDeque arrayDeque = this.A;
                while (!arrayDeque.isEmpty()) {
                    ((e0) arrayDeque.poll()).f6746b.c(null);
                }
                return;
            }
            this.B = (d0) iBinder;
            a();
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
