package k8;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7711c;

    public /* synthetic */ q1(x1 x1Var, Object obj, int i) {
        this.f7709a = i;
        this.f7711c = obj;
        this.f7710b = x1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f7709a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                x1 x1Var = (x1) this.f7710b;
                x1Var.f7834d.V();
                n nVar = x1Var.f7834d.f7658x;
                n4.T(nVar);
                return nVar.A0((String) this.f7711c);
            case 1:
                x1 x1Var2 = (x1) this.f7710b;
                x1Var2.f7834d.V();
                return new i(x1Var2.f7834d.p0(((v4) this.f7711c).f7805v));
            default:
                v4 v4Var = (v4) this.f7711c;
                String str = v4Var.f7805v;
                t7.y.g(str);
                n4 n4Var = (n4) this.f7710b;
                d2 d2VarB = n4Var.b(str);
                c2 c2Var = c2.f7423x;
                if (d2VarB.i(c2Var) && d2.c(100, v4Var.N).i(c2Var)) {
                    return n4Var.c0(v4Var).F();
                }
                n4Var.c().J.a("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public q1(n4 n4Var, v4 v4Var) {
        this.f7709a = 2;
        this.f7711c = v4Var;
        Objects.requireNonNull(n4Var);
        this.f7710b = n4Var;
    }
}
