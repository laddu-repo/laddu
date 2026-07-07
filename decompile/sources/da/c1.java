package da;

import androidx.media3.decoder.DecoderInputBuffer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends t0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4395x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d1 f4396y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f4397z;

    public c1(d1 d1Var, Callable callable) {
        this.f4396y = d1Var;
        callable.getClass();
        this.f4397z = callable;
    }

    @Override // da.t0
    public final void a(Throwable th) {
        switch (this.f4395x) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f4396y.n(th);
                break;
            default:
                this.f4396y.n(th);
                break;
        }
    }

    @Override // da.t0
    public final void b(Object obj) {
        switch (this.f4395x) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f4396y.o((ListenableFuture) obj);
                break;
            default:
                this.f4396y.m(obj);
                break;
        }
    }

    @Override // da.t0
    public final boolean d() {
        switch (this.f4395x) {
        }
        return this.f4396y.isDone();
    }

    @Override // da.t0
    public final Object e() {
        switch (this.f4395x) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                a0 a0Var = (a0) this.f4397z;
                ListenableFuture listenableFutureCall = a0Var.call();
                p4.v.m(listenableFutureCall, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", a0Var);
                return listenableFutureCall;
            default:
                return ((Callable) this.f4397z).call();
        }
    }

    @Override // da.t0
    public final String f() {
        switch (this.f4395x) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((a0) this.f4397z).toString();
            default:
                return ((Callable) this.f4397z).toString();
        }
    }

    public c1(d1 d1Var, a0 a0Var) {
        this.f4396y = d1Var;
        this.f4397z = a0Var;
    }
}
