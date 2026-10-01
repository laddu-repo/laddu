package n9;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k1 extends Thread {
    public final /* synthetic */ l1 A;

    /* renamed from: x, reason: collision with root package name */
    public final Object f9370x;

    /* renamed from: y, reason: collision with root package name */
    public final BlockingQueue f9371y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9372z = false;

    public k1(l1 l1Var, String str, BlockingQueue blockingQueue) {
        this.A = l1Var;
        w8.x.g(blockingQueue);
        this.f9370x = new Object();
        this.f9371y = blockingQueue;
        setName(str);
    }

    public final void a() {
        Object obj = this.f9370x;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void b() {
        l1 l1Var = this.A;
        synchronized (l1Var.G) {
            try {
                if (!this.f9372z) {
                    l1Var.H.release();
                    l1Var.G.notifyAll();
                    if (this == l1Var.A) {
                        l1Var.A = null;
                    } else if (this == l1Var.B) {
                        l1Var.B = null;
                    } else {
                        u0 u0Var = ((n1) l1Var.f4301y).C;
                        n1.g(u0Var);
                        u0Var.D.a("Current scheduler thread is neither worker nor network");
                    }
                    this.f9372z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i6;
        boolean z10 = false;
        while (!z10) {
            try {
                this.A.H.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                u0 u0Var = ((n1) this.A.f4301y).C;
                n1.g(u0Var);
                u0Var.G.b(e10, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f9371y;
                j1 j1Var = (j1) blockingQueue.poll();
                if (j1Var != null) {
                    if (true != j1Var.f9358y) {
                        i6 = 10;
                    } else {
                        i6 = threadPriority;
                    }
                    Process.setThreadPriority(i6);
                    j1Var.run();
                } else {
                    Object obj = this.f9370x;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.A.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e11) {
                                u0 u0Var2 = ((n1) this.A.f4301y).C;
                                n1.g(u0Var2);
                                u0Var2.G.b(e11, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.A.G) {
                        if (this.f9371y.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
