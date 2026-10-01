package k8;

import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.xa;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7573b;

    public /* synthetic */ i1(int i, Object obj) {
        this.f7572a = i;
        this.f7573b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f7572a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new xa(((j1) this.f7573b).H);
            case 1:
                x1 x1Var = (x1) this.f7573b;
                x1Var.f7834d.V();
                z0 z0Var = x1Var.f7834d.C;
                n4.T(z0Var);
                z0Var.D();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                synchronized (((x5.c) this.f7573b)) {
                    try {
                        x5.c cVar = (x5.c) this.f7573b;
                        if (cVar.D == null) {
                            return null;
                        }
                        cVar.o0();
                        if (((x5.c) this.f7573b).D()) {
                            ((x5.c) this.f7573b).m0();
                            ((x5.c) this.f7573b).F = 0;
                        }
                        return null;
                    } finally {
                    }
                }
        }
    }

    public i1(x1 x1Var, v vVar, String str) {
        this.f7572a = 1;
        this.f7573b = x1Var;
    }
}
