package k8;

import android.os.Bundle;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v4 f7781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f7782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x1 f7783d;

    public /* synthetic */ u1(x1 x1Var, v4 v4Var, Bundle bundle, int i) {
        this.f7780a = i;
        this.f7781b = v4Var;
        this.f7782c = bundle;
        this.f7783d = x1Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f7780a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                x1 x1Var = this.f7783d;
                x1Var.f7834d.V();
                return x1Var.f7834d.d0(this.f7782c, this.f7781b);
            default:
                x1 x1Var2 = this.f7783d;
                x1Var2.f7834d.V();
                return x1Var2.f7834d.d0(this.f7782c, this.f7781b);
        }
    }
}
