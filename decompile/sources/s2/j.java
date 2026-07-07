package s2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Handler implements Runnable {
    public int A;
    public Thread B;
    public boolean C;
    public volatile boolean D;
    public final /* synthetic */ n E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f11460v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f11461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f11462x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f11463y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public IOException f11464z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Looper looper, k kVar, i iVar, int i, long j8) {
        super(looper);
        this.E = nVar;
        this.f11461w = kVar;
        this.f11463y = iVar;
        this.f11460v = i;
        this.f11462x = j8;
    }

    public final void a(boolean z2) {
        this.D = z2;
        this.f11464z = null;
        if (hasMessages(1)) {
            this.C = true;
            removeMessages(1);
            if (!z2) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.C = true;
                    this.f11461w.j();
                    Thread thread = this.B;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z2) {
            this.E.f11468b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            i iVar = this.f11463y;
            iVar.getClass();
            iVar.t(this.f11461w, jElapsedRealtime, jElapsedRealtime - this.f11462x, true);
            this.f11463y = null;
        }
    }

    public final void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j8 = jElapsedRealtime - this.f11462x;
        i iVar = this.f11463y;
        iVar.getClass();
        iVar.o(this.f11461w, jElapsedRealtime, j8, this.A);
        this.f11464z = null;
        n nVar = this.E;
        t2.a aVar = nVar.f11467a;
        j jVar = nVar.f11468b;
        jVar.getClass();
        aVar.execute(jVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.D) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.E.f11468b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j8 = jElapsedRealtime - this.f11462x;
        i iVar = this.f11463y;
        iVar.getClass();
        if (this.C) {
            iVar.t(this.f11461w, jElapsedRealtime, j8, false);
            return;
        }
        int i10 = message.what;
        if (i10 == 2) {
            try {
                iVar.f(this.f11461w, jElapsedRealtime, j8);
                return;
            } catch (RuntimeException e7) {
                w1.a.p("LoadTask", "Unexpected exception handling load completed", e7);
                this.E.f11469c = new m(e7);
                return;
            }
        }
        if (i10 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f11464z = iOException;
        int i11 = this.A + 1;
        this.A = i11;
        e4.e eVarP = iVar.p(this.f11461w, jElapsedRealtime, j8, iOException, i11);
        int i12 = eVarP.f4776a;
        if (i12 == 3) {
            this.E.f11469c = this.f11464z;
            return;
        }
        if (i12 != 2) {
            if (i12 == 1) {
                this.A = 1;
            }
            long jMin = eVarP.f4777b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.A - 1) * 1000, 5000);
            }
            n nVar = this.E;
            w1.a.j(nVar.f11468b == null);
            nVar.f11468b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        try {
            synchronized (this) {
                z2 = this.C;
                this.B = Thread.currentThread();
            }
            if (!z2) {
                Trace.beginSection("load:".concat(this.f11461w.getClass().getSimpleName()));
                try {
                    this.f11461w.c();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.B = null;
                Thread.interrupted();
            }
            if (this.D) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e7) {
            if (this.D) {
                return;
            }
            obtainMessage(3, e7).sendToTarget();
        } catch (Exception e10) {
            if (this.D) {
                return;
            }
            w1.a.p("LoadTask", "Unexpected exception loading stream", e10);
            obtainMessage(3, new m(e10)).sendToTarget();
        } catch (OutOfMemoryError e11) {
            if (this.D) {
                return;
            }
            w1.a.p("LoadTask", "OutOfMemory error loading stream", e11);
            obtainMessage(3, new m(e11)).sendToTarget();
        } catch (Error e12) {
            if (!this.D) {
                w1.a.p("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        }
    }
}
