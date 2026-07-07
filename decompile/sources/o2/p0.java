package o2;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9507v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f9508w;

    public /* synthetic */ p0(u0 u0Var, int i) {
        this.f9507v = i;
        this.f9508w = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9507v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f9508w.f9539d0 = true;
                break;
            case 1:
                this.f9508w.A();
                break;
            default:
                u0 u0Var = this.f9508w;
                if (!u0Var.f9545j0) {
                    a0 a0Var = u0Var.M;
                    a0Var.getClass();
                    a0Var.a(u0Var);
                }
                break;
        }
    }
}
