package o;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9359v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c2 f9360w;

    public /* synthetic */ z1(c2 c2Var, int i) {
        this.f9359v = i;
        this.f9360w = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9359v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                r1 r1Var = this.f9360w.f9129x;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                }
                break;
            default:
                c2 c2Var = this.f9360w;
                r1 r1Var2 = c2Var.f9129x;
                if (r1Var2 != null && r1Var2.isAttachedToWindow() && c2Var.f9129x.getCount() > c2Var.f9129x.getChildCount() && c2Var.f9129x.getChildCount() <= c2Var.H) {
                    c2Var.U.setInputMethodMode(2);
                    c2Var.c();
                    break;
                }
                break;
        }
    }
}
