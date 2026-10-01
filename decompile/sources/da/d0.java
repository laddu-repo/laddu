package da;

import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.f6;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends t0 {
    public final /* synthetic */ e0 A;
    public final Object B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Executor f4402x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e0 f4403y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f4404z;

    public d0(e0 e0Var, Executor executor) {
        this.f4403y = e0Var;
        executor.getClass();
        this.f4402x = executor;
    }

    @Override // da.t0
    public final void a(Throwable th) {
        e0 e0Var = this.f4403y;
        e0Var.I = null;
        if (th instanceof ExecutionException) {
            e0Var.n(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            e0Var.cancel(false);
        } else {
            e0Var.n(th);
        }
    }

    @Override // da.t0
    public final void b(Object obj) {
        this.f4403y.I = null;
        switch (this.f4404z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.A.o((ListenableFuture) obj);
                break;
            default:
                this.A.m(obj);
                break;
        }
    }

    @Override // da.t0
    public final boolean d() {
        return this.f4403y.isDone();
    }

    @Override // da.t0
    public final Object e() {
        switch (this.f4404z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((f6) this.B).call();
            default:
                return ((Callable) this.B).call();
        }
    }

    @Override // da.t0
    public final String f() {
        switch (this.f4404z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((f6) this.B).toString();
            default:
                return ((Callable) this.B).toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, f6 f6Var, Executor executor) {
        this(e0Var, executor);
        this.f4404z = 0;
        this.A = e0Var;
        this.B = f6Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, Callable callable) {
        this(e0Var, f0.f4407v);
        this.f4404z = 1;
        this.A = e0Var;
        this.B = callable;
    }
}
