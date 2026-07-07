package j5;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends FutureTask {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d0 f6814v;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.f6814v.f((b0) get());
            } catch (InterruptedException | ExecutionException e7) {
                this.f6814v.f(new b0(e7));
            }
        } finally {
            this.f6814v = null;
        }
    }
}
