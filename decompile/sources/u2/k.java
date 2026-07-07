package u2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends Handler implements Runnable {
    public j A;
    public IOException B;
    public int C;
    public Thread D;
    public boolean E;
    public volatile boolean F;
    public final /* synthetic */ o G;

    /* renamed from: x, reason: collision with root package name */
    public final int f12865x;

    /* renamed from: y, reason: collision with root package name */
    public final l f12866y;

    /* renamed from: z, reason: collision with root package name */
    public final long f12867z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, Looper looper, l lVar, j jVar, int i6, long j) {
        super(looper);
        this.G = oVar;
        this.f12866y = lVar;
        this.A = jVar;
        this.f12865x = i6;
        this.f12867z = j;
    }

    public final void a(boolean z10) {
        this.F = z10;
        this.B = null;
        if (hasMessages(1)) {
            this.E = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.E = true;
                    this.f12866y.p();
                    Thread thread = this.D;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z10) {
            this.G.f12869y = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j jVar = this.A;
            jVar.getClass();
            jVar.o(this.f12866y, elapsedRealtime, elapsedRealtime - this.f12867z, true);
            this.A = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.f12867z;
        j jVar = this.A;
        jVar.getClass();
        jVar.z(this.f12866y, elapsedRealtime, j, this.C);
        this.B = null;
        o oVar = this.G;
        v2.a aVar = oVar.f12868x;
        k kVar = oVar.f12869y;
        kVar.getClass();
        aVar.execute(kVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.F) {
            int i6 = message.what;
            if (i6 == 1) {
                b();
                return;
            }
            if (i6 != 4) {
                this.G.f12869y = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f12867z;
                j jVar = this.A;
                jVar.getClass();
                if (this.E) {
                    jVar.o(this.f12866y, elapsedRealtime, j, false);
                    return;
                }
                int i10 = message.what;
                if (i10 != 2) {
                    if (i10 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.B = iOException;
                        int i11 = this.C + 1;
                        this.C = i11;
                        ef.g C = jVar.C(this.f12866y, elapsedRealtime, j, iOException, i11);
                        int i12 = C.f4580a;
                        if (i12 == 3) {
                            this.G.f12870z = this.B;
                            return;
                        }
                        if (i12 != 2) {
                            if (i12 == 1) {
                                this.C = 1;
                            }
                            long j10 = C.f4581b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.C - 1) * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION);
                            }
                            o oVar = this.G;
                            if (oVar.f12869y == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            u1.c.g(z10);
                            oVar.f12869y = this;
                            if (j10 > 0) {
                                sendEmptyMessageDelayed(1, j10);
                                return;
                            } else {
                                b();
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                try {
                    jVar.k(this.f12866y, elapsedRealtime, j);
                    return;
                } catch (RuntimeException e10) {
                    u1.a.h("LoadTask", "Unexpected exception handling load completed", e10);
                    this.G.f12870z = new n(e10);
                    return;
                }
            }
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.E;
                this.D = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f12866y.getClass().getSimpleName()));
                try {
                    this.f12866y.h();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.D = null;
                Thread.interrupted();
            }
            if (!this.F) {
                sendEmptyMessage(2);
            }
        } catch (IOException e10) {
            if (!this.F) {
                obtainMessage(3, e10).sendToTarget();
            }
        } catch (Exception e11) {
            if (!this.F) {
                u1.a.h("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(3, new n(e11)).sendToTarget();
            }
        } catch (OutOfMemoryError e12) {
            if (!this.F) {
                u1.a.h("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(3, new n(e12)).sendToTarget();
            }
        } catch (Error e13) {
            if (!this.F) {
                u1.a.h("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
