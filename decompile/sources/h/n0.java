package h;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends p4.v {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p0 f5952k;

    public /* synthetic */ n0(p0 p0Var, int i) {
        this.f5951j = i;
        this.f5952k = p0Var;
    }

    @Override // t0.r0
    public final void a() {
        View view;
        int i = this.f5951j;
        p0 p0Var = this.f5952k;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if (p0Var.f5975s && (view = p0Var.f5967k) != null) {
                    view.setTranslationY(0.0f);
                    p0Var.f5965h.setTranslationY(0.0f);
                }
                p0Var.f5965h.setVisibility(8);
                p0Var.f5965h.setTransitioning(false);
                p0Var.f5979w = null;
                sc.b bVar = p0Var.f5971o;
                if (bVar != null) {
                    bVar.a0(p0Var.f5970n);
                    p0Var.f5970n = null;
                    p0Var.f5971o = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = p0Var.f5964g;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = t0.m0.f11853a;
                    t0.b0.c(actionBarOverlayLayout);
                }
                break;
            default:
                p0Var.f5979w = null;
                p0Var.f5965h.requestLayout();
                break;
        }
    }
}
