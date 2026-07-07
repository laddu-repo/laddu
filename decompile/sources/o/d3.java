package o;

import androidx.appcompat.widget.Toolbar;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d3 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9136v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Toolbar f9137w;

    public /* synthetic */ d3(Toolbar toolbar, int i) {
        this.f9136v = i;
        this.f9137w = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9136v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                f3 f3Var = this.f9137w.f674k0;
                n.n nVar = f3Var == null ? null : f3Var.f9155w;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
            default:
                this.f9137w.m();
                break;
        }
    }
}
