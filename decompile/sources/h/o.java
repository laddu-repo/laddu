package h;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Executor {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5953v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayDeque f5954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Runnable f5955x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f5956y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Executor f5957z;

    public o(Executor executor) {
        this.f5953v = 1;
        de.i.e(executor, "executor");
        this.f5957z = executor;
        this.f5954w = new ArrayDeque();
        this.f5956y = new Object();
    }

    private final void a(Runnable runnable) {
        synchronized (this.f5956y) {
            try {
                this.f5954w.add(new androidx.fragment.app.d(17, this, runnable));
                if (this.f5955x == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        synchronized (this.f5956y) {
            try {
                Runnable runnable = (Runnable) this.f5954w.poll();
                this.f5955x = runnable;
                if (runnable != null) {
                    ((p) this.f5957z).execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        switch (this.f5953v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                c();
                return;
            default:
                synchronized (this.f5956y) {
                    Object objPoll = this.f5954w.poll();
                    Runnable runnable = (Runnable) objPoll;
                    this.f5955x = runnable;
                    if (objPoll != null) {
                        this.f5957z.execute(runnable);
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f5953v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                a(runnable);
                return;
            default:
                de.i.e(runnable, "command");
                synchronized (this.f5956y) {
                    this.f5954w.offer(new o2.i0(2, runnable, this));
                    if (this.f5955x == null) {
                        b();
                    }
                    break;
                }
                return;
        }
    }

    public o(p pVar) {
        this.f5953v = 0;
        this.f5956y = new Object();
        this.f5954w = new ArrayDeque();
        this.f5957z = pVar;
    }
}
