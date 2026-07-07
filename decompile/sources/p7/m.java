package p7;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.measurement.be;
import com.google.android.gms.internal.measurement.gc;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.zg;
import com.google.common.util.concurrent.ListenableFuture;
import da.a0;
import da.f0;
import da.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import o8.o;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m implements a0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static m f10428z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10429v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f10430w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f10431x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f10432y;

    public /* synthetic */ m(be beVar, m0 m0Var, int i, ArrayList arrayList) {
        this.f10430w = beVar;
        this.f10431x = m0Var;
        this.f10429v = i;
        this.f10432y = arrayList;
    }

    public static synchronized m d(Context context) {
        try {
            if (f10428z == null) {
                f10428z = new m(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new y7.a("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10428z;
    }

    public int a() {
        int i = this.f10429v;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public Looper b() {
        Looper looper;
        synchronized (this.f10430w) {
            try {
                if (((Looper) this.f10431x) == null) {
                    w1.a.j(this.f10429v == 0 && ((HandlerThread) this.f10432y) == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f10432y = handlerThread;
                    handlerThread.start();
                    this.f10431x = ((HandlerThread) this.f10432y).getLooper();
                }
                this.f10429v++;
                looper = (Looper) this.f10431x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public void c() {
        HandlerThread handlerThread;
        synchronized (this.f10430w) {
            try {
                w1.a.j(this.f10429v > 0);
                int i = this.f10429v - 1;
                this.f10429v = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.f10432y) != null) {
                    handlerThread.quit();
                    this.f10432y = null;
                    this.f10431x = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // da.a0
    public /* synthetic */ ListenableFuture call() {
        be beVar = (be) this.f10430w;
        m0 m0Var = (m0) this.f10431x;
        int i = this.f10429v;
        ArrayList arrayList = (ArrayList) this.f10432y;
        ListenableFuture listenableFutureD = o0.d(m0Var);
        for (int i10 = 0; i10 < i; i10++) {
            if (((Boolean) o0.b((Future) arrayList.get(i10))).booleanValue()) {
                if (((List) beVar.f2515b).get(i10) != null) {
                    throw new ClassCastException();
                }
                listenableFutureD = o0.f(listenableFutureD, zg.b(new gc(1)), f0.f4407v);
            }
        }
        return listenableFutureD;
    }

    public synchronized o e(l lVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(lVar.toString()));
            }
            if (!((k) this.f10432y).d(lVar)) {
                k kVar = new k(this);
                this.f10432y = kVar;
                kVar.d(lVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return lVar.f10424b.f9963a;
    }

    public m(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f10432y = new k(this);
        this.f10429v = 1;
        this.f10431x = scheduledExecutorService;
        this.f10430w = context.getApplicationContext();
    }

    public m(p5.a aVar, p5.a aVar2, p5.a aVar3, int i) {
        this.f10430w = aVar;
        this.f10431x = aVar2;
        this.f10432y = aVar3;
        this.f10429v = i;
    }

    public m() {
        this.f10430w = new Object();
        this.f10431x = null;
        this.f10432y = null;
        this.f10429v = 0;
    }

    public m(int i, String str, int i10, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f10430w = str;
        this.f10429v = i10;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f10431x = listUnmodifiableList;
        this.f10432y = bArr;
    }

    public m(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.f10430w = uuid;
        this.f10429v = i;
        this.f10431x = bArr;
        this.f10432y = uuidArr;
    }
}
