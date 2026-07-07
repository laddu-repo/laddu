package a7;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.t6;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import k8.n1;
import k8.p1;
import k8.u2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Executor {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f220v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f221w;

    public /* synthetic */ s(int i, Object obj) {
        this.f220v = i;
        this.f221w = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f220v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((Executor) this.f221w).execute(new r(runnable, 0));
                return;
            case 1:
                n1 n1Var = ((p1) ((u2) this.f221w).f2053w).B;
                p1.l(n1Var);
                n1Var.M(runnable);
                return;
            case 2:
                ((t6) this.f221w).post(runnable);
                return;
            case 3:
                Handler handler = (Handler) this.f221w;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                ((t6) this.f221w).post(runnable);
                return;
        }
    }

    public s() {
        this.f220v = 2;
        t6 t6Var = new t6(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f221w = t6Var;
    }

    public s(Looper looper) {
        this.f220v = 4;
        this.f221w = new t6(looper, 3);
    }
}
