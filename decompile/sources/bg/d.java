package bg;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends Thread {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1694x = 0;

    public /* synthetic */ d(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        c cVar;
        ReentrantLock reentrantLock;
        c cVar2;
        g c10;
        g gVar;
        c unused;
        switch (this.f1694x) {
            case 0:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused2) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                cVar = g.Companion;
                cVar.getClass();
                reentrantLock = g.lock;
                reentrantLock.lock();
                try {
                    cVar2 = g.Companion;
                    cVar2.getClass();
                    c10 = c.c();
                    gVar = g.head;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused3) {
            }
            if (c10 == gVar) {
                unused = g.Companion;
                g.head = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (c10 != null) {
                    c10.timedOut();
                }
            }
        }
    }

    public /* synthetic */ d(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
