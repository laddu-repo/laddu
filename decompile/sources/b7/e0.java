package b7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 extends FutureTask {

    /* renamed from: x, reason: collision with root package name */
    public f0 f1519x;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.f1519x.f((d0) get());
            } catch (InterruptedException | ExecutionException e10) {
                this.f1519x.f(new d0(e10));
            }
        } finally {
            this.f1519x = null;
        }
    }
}
