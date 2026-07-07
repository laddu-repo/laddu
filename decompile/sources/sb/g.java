package sb;

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

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends Service {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ExecutorService f11717v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y f11718w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f11719x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11720y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f11721z;

    public g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new y7.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11717v = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f11719x = new Object();
        this.f11721z = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            x.b(intent);
        }
        synchronized (this.f11719x) {
            try {
                int i = this.f11721z - 1;
                this.f11721z = i;
                if (i == 0) {
                    stopSelfResult(this.f11720y);
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
            if (this.f11718w == null) {
                this.f11718w = new y(new ka.c(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11718w;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f11717v.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        synchronized (this.f11719x) {
            this.f11720y = i10;
            this.f11721z++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) p.s().f11745z).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        o8.h hVar = new o8.h();
        this.f11717v.execute(new androidx.emoji2.text.n(this, intent2, hVar, 8));
        o8.o oVar = hVar.f9963a;
        if (oVar.i()) {
            a(intent);
            return 2;
        }
        oVar.b(new l4.d(0), new androidx.fragment.app.e(14, this, intent));
        return 3;
    }
}
