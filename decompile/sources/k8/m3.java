package k8;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m3 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7632v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f7633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o3 f7634x;

    public /* synthetic */ m3(o3 o3Var, i0 i0Var, int i) {
        this.f7632v = i;
        this.f7633w = i0Var;
        this.f7634x = o3Var;
    }

    private final void a() {
        o3 o3Var = this.f7634x;
        synchronized (o3Var) {
            try {
                o3Var.f7674v = false;
                p3 p3Var = o3Var.f7676x;
                if (!p3Var.U()) {
                    v0 v0Var = ((p1) p3Var.f2053w).A;
                    p1.l(v0Var);
                    v0Var.J.a("Connected to service");
                    i0 i0Var = this.f7633w;
                    p3Var.D();
                    p3Var.f7701z = i0Var;
                    p3Var.Q();
                    p3Var.S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7632v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                a();
                return;
            default:
                o3 o3Var = this.f7634x;
                synchronized (o3Var) {
                    try {
                        o3Var.f7674v = false;
                        p3 p3Var = o3Var.f7676x;
                        if (!p3Var.U()) {
                            v0 v0Var = ((p1) p3Var.f2053w).A;
                            p1.l(v0Var);
                            v0Var.I.a("Connected to remote service");
                            i0 i0Var = this.f7633w;
                            p3Var.D();
                            p3Var.f7701z = i0Var;
                            p3Var.Q();
                            p3Var.S();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                p3 p3Var2 = this.f7634x.f7676x;
                ScheduledExecutorService scheduledExecutorService = p3Var2.C;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    p3Var2.C = null;
                    return;
                }
                return;
        }
    }
}
