package jd;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7094a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f7097d;

    public k() {
        HandlerThread handlerThread = new HandlerThread("LibGlobalFetchLib");
        handlerThread.start();
        this.f7097d = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        synchronized (this.f7094a) {
            if (!this.f7095b) {
                this.f7095b = true;
                try {
                    this.f7097d.removeCallbacksAndMessages(null);
                    this.f7097d.getLooper().quit();
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f7094a) {
            if (!this.f7095b) {
                int i = this.f7096c;
                if (i == 0) {
                } else {
                    this.f7096c = i - 1;
                }
            }
        }
    }

    public final void c() {
        synchronized (this.f7094a) {
            if (!this.f7095b) {
                this.f7096c++;
            }
        }
    }

    public final void d(ce.a aVar) {
        synchronized (this.f7094a) {
            if (!this.f7095b) {
                this.f7097d.post(new j(0, aVar));
            }
        }
    }

    public final int e() {
        int i;
        synchronized (this.f7094a) {
            i = !this.f7095b ? this.f7096c : 0;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        de.i.c(obj, "null cannot be cast to non-null type com.tonyodev.fetch2core.HandlerWrapper");
        return true;
    }

    public final int hashCode() {
        return -1521653773;
    }
}
