package k8;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e3 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7472v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f3 f7473w;

    public e3(f3 f3Var, int i) {
        this.f7472v = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(f3Var);
                this.f7473w = f3Var;
                break;
            default:
                Objects.requireNonNull(f3Var);
                this.f7473w = f3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7472v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                f3 f3Var = this.f7473w;
                f3Var.A = f3Var.F;
                break;
            default:
                this.f7473w.F = null;
                break;
        }
    }
}
