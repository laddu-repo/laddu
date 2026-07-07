package c2;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements w1.m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1715v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t1.d1 f1716w;

    public /* synthetic */ e0(d2.a aVar, t1.d1 d1Var) {
        this.f1716w = d1Var;
    }

    @Override // w1.m
    public final void a(Object obj) {
        switch (this.f1715v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((t1.l0) obj).b(this.f1716w);
                break;
            default:
                d2.k kVar = (d2.k) obj;
                b3.a aVar = kVar.f4017p;
                t1.d1 d1Var = this.f1716w;
                if (aVar != null) {
                    t1.o oVar = (t1.o) aVar.f1529x;
                    if (oVar.f12069v == -1) {
                        t1.n nVarA = oVar.a();
                        nVarA.f12043t = d1Var.f11976a;
                        nVarA.f12044u = d1Var.f11977b;
                        kVar.f4017p = new b3.a(new t1.o(nVarA), aVar.f1528w, (String) aVar.f1530y, 3);
                    }
                }
                int i = d1Var.f11976a;
                break;
        }
    }

    public /* synthetic */ e0(t1.d1 d1Var) {
        this.f1716w = d1Var;
    }
}
