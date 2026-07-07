package k8;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q2 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7712v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d2 f7713w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f7714x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f7715y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ u2 f7716z;

    public /* synthetic */ q2(u2 u2Var, d2 d2Var, long j8, boolean z2, int i) {
        this.f7712v = i;
        this.f7713w = d2Var;
        this.f7714x = j8;
        this.f7715y = z2;
        this.f7716z = u2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7712v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                u2 u2Var = this.f7716z;
                d2 d2Var = this.f7713w;
                u2Var.d0(d2Var);
                u2Var.T(d2Var, this.f7714x, this.f7715y);
                break;
            default:
                u2 u2Var2 = this.f7716z;
                d2 d2Var2 = this.f7713w;
                u2Var2.d0(d2Var2);
                u2Var2.T(d2Var2, this.f7714x, this.f7715y);
                break;
        }
    }
}
