package o2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements w1.f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b3.a f9446v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f9447w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f9448x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ IOException f9449y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f9450z;

    public /* synthetic */ h0(b3.a aVar, u uVar, z zVar, IOException iOException, boolean z2) {
        this.f9446v = aVar;
        this.f9447w = uVar;
        this.f9448x = zVar;
        this.f9449y = iOException;
        this.f9450z = z2;
    }

    @Override // w1.f
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        b3.a aVar = this.f9446v;
        k0Var.r(aVar.f1528w, (d0) aVar.f1529x, this.f9447w, this.f9448x, this.f9449y, this.f9450z);
    }
}
