package s8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements ServiceConnection {
    public final ArrayDeque A;
    public final SparseArray B;
    public final /* synthetic */ n C;

    /* renamed from: x, reason: collision with root package name */
    public int f12247x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final Messenger f12248y;

    /* renamed from: z, reason: collision with root package name */
    public l f12249z;

    public k(n nVar) {
        this.C = nVar;
        Handler handler = new Handler(Looper.getMainLooper(), new j(this, 0));
        Looper.getMainLooper();
        this.f12248y = new Messenger(handler);
        this.A = new ArrayDeque();
        this.B = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Exception, c2.r] */
    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i6 = this.f12247x;
            if (i6 != 0) {
                if (i6 != 1 && i6 != 2) {
                    if (i6 != 3) {
                        return;
                    }
                    this.f12247x = 4;
                    return;
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f12247x = 4;
                z8.a.b().c((Context) this.C.f12260b, this);
                ?? exc = new Exception(str, securityException);
                Iterator it = this.A.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).b(exc);
                }
                this.A.clear();
                for (int i10 = 0; i10 < this.B.size(); i10++) {
                    ((m) this.B.valueAt(i10)).b(exc);
                }
                this.B.clear();
                return;
            }
            throw new IllegalStateException();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f12247x == 2 && this.A.isEmpty() && this.B.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f12247x = 3;
                z8.a.b().c((Context) this.C.f12260b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(m mVar) {
        int i6 = this.f12247x;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    return false;
                }
                this.A.add(mVar);
                ((ScheduledExecutorService) this.C.f12261c).execute(new i(this, 0));
                return true;
            }
            this.A.add(mVar);
            return true;
        }
        this.A.add(mVar);
        if (this.f12247x == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f12247x = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!z8.a.b().a((Context) this.C.f12260b, intent, this, 1)) {
                    a("Unable to bind to service");
                } else {
                    ((ScheduledExecutorService) this.C.f12261c).schedule(new i(this, 1), 30L, TimeUnit.SECONDS);
                }
            } catch (SecurityException e10) {
                b("Unable to bind to service", e10);
            }
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.C.f12261c).execute(new rb.i(1, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.C.f12261c).execute(new i(this, 2));
    }
}
