package g4;

import android.view.View;
import androidx.fragment.app.d1;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5506v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f5507w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o4.b0 f5508x;

    public /* synthetic */ i(o4.b0 b0Var, int i, int i10) {
        this.f5506v = i10;
        this.f5508x = b0Var;
        this.f5507w = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5506v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                j jVar = (j) this.f5508x;
                r rVar = jVar.f5511g;
                int i = jVar.f;
                int i10 = this.f5507w;
                if (i10 != i) {
                    rVar.setPlaybackSpeed(jVar.f5510e[i10]);
                }
                rVar.F.dismiss();
                break;
            default:
                kc.k kVar = (kc.k) ((d1) ((hc.q) this.f5508x).f6253g).f1006w;
                kc.k.T(kVar.h(), kVar.L0, kVar.K0, this.f5507w, kVar.M0, kVar.N0);
                kVar.P(false, false);
                break;
        }
    }
}
