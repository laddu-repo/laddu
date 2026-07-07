package k8;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends Thread {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f7625v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final BlockingQueue f7626w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7627x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n1 f7628y;

    public m1(n1 n1Var, String str, BlockingQueue blockingQueue) {
        this.f7628y = n1Var;
        t7.y.g(blockingQueue);
        this.f7625v = new Object();
        this.f7626w = blockingQueue;
        setName(str);
    }

    public final void a() {
        Object obj = this.f7625v;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void b() {
        n1 n1Var = this.f7628y;
        synchronized (n1Var.E) {
            try {
                if (!this.f7627x) {
                    n1Var.F.release();
                    n1Var.E.notifyAll();
                    if (this == n1Var.f7641y) {
                        n1Var.f7641y = null;
                    } else if (this == n1Var.f7642z) {
                        n1Var.f7642z = null;
                    } else {
                        v0 v0Var = ((p1) n1Var.f2053w).A;
                        p1.l(v0Var);
                        v0Var.B.a("Current scheduler thread is neither worker nor network");
                    }
                    this.f7627x = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z2 = false;
        while (!z2) {
            try {
                this.f7628y.F.acquire();
                z2 = true;
            } catch (InterruptedException e7) {
                v0 v0Var = ((p1) this.f7628y.f2053w).A;
                p1.l(v0Var);
                v0Var.E.b(e7, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f7626w;
                l1 l1Var = (l1) blockingQueue.poll();
                if (l1Var != null) {
                    Process.setThreadPriority(true != l1Var.f7612w ? 10 : threadPriority);
                    l1Var.run();
                } else {
                    Object obj = this.f7625v;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f7628y.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e10) {
                                v0 v0Var2 = ((p1) this.f7628y.f2053w).A;
                                p1.l(v0Var2);
                                v0Var2.E.b(e10, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f7628y.E) {
                        if (this.f7626w.peek() == null) {
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
