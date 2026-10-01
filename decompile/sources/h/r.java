package h;

import android.view.ViewGroup;
import androidx.media3.decoder.DecoderInputBuffer;
import t0.q0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5988v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d0 f5989w;

    public /* synthetic */ r(d0 d0Var, int i) {
        this.f5988v = i;
        this.f5989w = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f5988v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                d0 d0Var = this.f5989w;
                if ((d0Var.f5888v0 & 1) != 0) {
                    d0Var.w(0);
                }
                if ((d0Var.f5888v0 & 4096) != 0) {
                    d0Var.w(108);
                }
                d0Var.f5887u0 = false;
                d0Var.f5888v0 = 0;
                break;
            default:
                d0 d0Var2 = this.f5989w;
                d0Var2.R.showAtLocation(d0Var2.Q, 55, 0, 0);
                q0 q0Var = d0Var2.T;
                if (q0Var != null) {
                    q0Var.b();
                }
                if (d0Var2.V && (viewGroup = d0Var2.W) != null && viewGroup.isLaidOut()) {
                    d0Var2.Q.setAlpha(0.0f);
                    q0 q0VarA = t0.m0.a(d0Var2.Q);
                    q0VarA.a(1.0f);
                    d0Var2.T = q0VarA;
                    q0VarA.d(new t(0, this));
                } else {
                    d0Var2.Q.setAlpha(1.0f);
                    d0Var2.Q.setVisibility(0);
                }
                break;
        }
    }
}
