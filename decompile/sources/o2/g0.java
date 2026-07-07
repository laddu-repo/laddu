package o2;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements w1.f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9423v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b3.a f9424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f9425x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z f9426y;

    public /* synthetic */ g0(b3.a aVar, u uVar, z zVar, int i) {
        this.f9423v = i;
        this.f9424w = aVar;
        this.f9425x = uVar;
        this.f9426y = zVar;
    }

    @Override // w1.f
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f9423v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                b3.a aVar = this.f9424w;
                k0Var.F(aVar.f1528w, (d0) aVar.f1529x, this.f9425x, this.f9426y);
                break;
            default:
                b3.a aVar2 = this.f9424w;
                k0Var.d(aVar2.f1528w, (d0) aVar2.f1529x, this.f9425x, this.f9426y);
                break;
        }
    }
}
