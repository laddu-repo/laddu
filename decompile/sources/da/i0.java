package da;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends AtomicReference implements Executor, Runnable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f4424z = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public sc.b f4425v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Executor f4426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Runnable f4427x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Thread f4428y;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == h0.f4421w) {
            this.f4426w = null;
            this.f4425v = null;
            return;
        }
        this.f4428y = Thread.currentThread();
        try {
            sc.b bVar = this.f4425v;
            Objects.requireNonNull(bVar);
            a7.j jVar = (a7.j) bVar.f11787x;
            if (((Thread) jVar.f202w) == this.f4428y) {
                this.f4425v = null;
                p4.v.r(((Runnable) jVar.f203x) == null);
                jVar.f203x = runnable;
                Executor executor = this.f4426w;
                Objects.requireNonNull(executor);
                jVar.f204y = executor;
                this.f4426w = null;
            } else {
                Executor executor2 = this.f4426w;
                Objects.requireNonNull(executor2);
                this.f4426w = null;
                this.f4427x = runnable;
                executor2.execute(this);
            }
            this.f4428y = null;
        } catch (Throwable th) {
            this.f4428y = null;
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.f4428y) {
            Runnable runnable = this.f4427x;
            Objects.requireNonNull(runnable);
            this.f4427x = null;
            runnable.run();
            return;
        }
        a7.j jVar = new a7.j(19, false);
        jVar.f202w = threadCurrentThread;
        sc.b bVar = this.f4425v;
        Objects.requireNonNull(bVar);
        bVar.f11787x = jVar;
        this.f4425v = null;
        try {
            Runnable runnable2 = this.f4427x;
            Objects.requireNonNull(runnable2);
            this.f4427x = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = (Runnable) jVar.f203x;
                if (runnable3 == null || (executor = (Executor) jVar.f204y) == null) {
                    break;
                }
                jVar.f203x = null;
                jVar.f204y = null;
                executor.execute(runnable3);
            }
        } finally {
            jVar.f202w = null;
        }
    }
}
