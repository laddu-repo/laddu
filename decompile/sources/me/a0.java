package me;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class a0 extends a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f8676y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(sd.h hVar, boolean z2, int i) {
        super(hVar, z2);
        this.f8676y = i;
    }

    @Override // me.d1
    public boolean F(Throwable th) {
        switch (this.f8676y) {
            case 1:
                x.i(th, this.f8675x);
                return true;
            default:
                return super.F(th);
        }
    }
}
