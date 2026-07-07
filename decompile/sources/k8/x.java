package k8;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7831v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f7832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d0 f7833x;

    public x(y yVar, long j8) {
        this.f7832w = j8;
        Objects.requireNonNull(yVar);
        this.f7833x = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7831v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((y) this.f7833x).J(this.f7832w);
                break;
            default:
                f3 f3Var = (f3) this.f7833x;
                y yVar = ((p1) f3Var.f2053w).I;
                p1.i(yVar);
                yVar.G(this.f7832w);
                f3Var.A = null;
                break;
        }
    }

    public x(f3 f3Var, long j8) {
        this.f7832w = j8;
        Objects.requireNonNull(f3Var);
        this.f7833x = f3Var;
    }
}
