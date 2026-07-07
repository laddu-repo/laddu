package k8;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1 f7771e;

    public /* synthetic */ t1(x1 x1Var, String str, String str2, String str3, int i) {
        this.f7767a = i;
        this.f7768b = str;
        this.f7769c = str2;
        this.f7770d = str3;
        this.f7771e = x1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f7767a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                x1 x1Var = this.f7771e;
                x1Var.f7834d.V();
                n nVar = x1Var.f7834d.f7658x;
                n4.T(nVar);
                return nVar.B0(this.f7768b, this.f7769c, this.f7770d);
            case 1:
                x1 x1Var2 = this.f7771e;
                x1Var2.f7834d.V();
                n nVar2 = x1Var2.f7834d.f7658x;
                n4.T(nVar2);
                return nVar2.B0(this.f7768b, this.f7769c, this.f7770d);
            case 2:
                x1 x1Var3 = this.f7771e;
                x1Var3.f7834d.V();
                n nVar3 = x1Var3.f7834d.f7658x;
                n4.T(nVar3);
                return nVar3.F0(this.f7768b, this.f7769c, this.f7770d);
            default:
                x1 x1Var4 = this.f7771e;
                x1Var4.f7834d.V();
                n nVar4 = x1Var4.f7834d.f7658x;
                n4.T(nVar4);
                return nVar4.F0(this.f7768b, this.f7769c, this.f7770d);
        }
    }
}
