package ic;

import a2.e1;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class g extends Service {
    public int A;
    public int B;

    /* renamed from: x, reason: collision with root package name */
    public final ExecutorService f6751x;

    /* renamed from: y, reason: collision with root package name */
    public d0 f6752y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f6753z;

    public g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b9.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f6751x = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f6753z = new Object();
        this.B = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            c0.b(intent);
        }
        synchronized (this.f6753z) {
            try {
                int i6 = this.B - 1;
                this.B = i6;
                if (i6 == 0) {
                    stopSelfResult(this.A);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f6752y == null) {
                this.f6752y = new d0(new u5.r(this, 11));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6752y;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f6751x.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i6, int i10) {
        synchronized (this.f6753z) {
            this.A = i10;
            this.B++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) s.k().A).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        s9.h hVar = new s9.h();
        this.f6751x.execute(new e1(this, intent2, hVar, 10));
        s9.n nVar = hVar.f12263a;
        if (nVar.g()) {
            a(intent);
            return 2;
        }
        nVar.i(new q.a(1), new b2.b(8, this, intent));
        return 3;
    }
}
