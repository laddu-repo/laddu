package k8;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l3 extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7620e;
    public final /* synthetic */ p3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3(p3 p3Var, p1 p1Var, int i) {
        super(p1Var);
        this.f7620e = i;
        this.f = p3Var;
    }

    @Override // k8.o
    public final void a() {
        switch (this.f7620e) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                p3 p3Var = this.f;
                p3Var.D();
                if (p3Var.U()) {
                    v0 v0Var = ((p1) p3Var.f2053w).A;
                    p1.l(v0Var);
                    v0Var.J.a("Inactivity, disconnecting from the service");
                    p3Var.L();
                    break;
                }
                break;
            default:
                v0 v0Var2 = ((p1) this.f.f2053w).A;
                p1.l(v0Var2);
                v0Var2.E.a("Tasks have been queued for a long time");
                break;
        }
    }
}
