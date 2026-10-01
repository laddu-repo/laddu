package b8;

import android.os.Process;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.locks.ReentrantLock;
import k8.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Thread {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1590v = 1;

    public /* synthetic */ g(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        vf.b bVarH;
        switch (this.f1590v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                c6.i iVar = vf.b.f13595h;
                reentrantLock = vf.b.f13596j;
                reentrantLock.lock();
                try {
                    bVarH = b0.h();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
            }
            if (bVarH == vf.b.i) {
                vf.b.i = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (bVarH != null) {
                    bVarH.k();
                }
            }
        }
    }

    public /* synthetic */ g(String str) {
        super(str);
    }

    public /* synthetic */ g(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
