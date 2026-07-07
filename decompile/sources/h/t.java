package h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t extends p4.v {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f5992k;

    public /* synthetic */ t(int i, Object obj) {
        this.f5991j = i;
        this.f5992k = obj;
    }

    @Override // t0.r0
    public final void a() {
        int i = this.f5991j;
        Object obj = this.f5992k;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                d0 d0Var = ((r) obj).f5989w;
                d0Var.Q.setAlpha(1.0f);
                d0Var.T.d(null);
                d0Var.T = null;
                break;
            case 1:
                d0 d0Var2 = (d0) obj;
                d0Var2.Q.setAlpha(1.0f);
                d0Var2.T.d(null);
                d0Var2.T = null;
                break;
            default:
                d0 d0Var3 = (d0) ((sc.b) obj).f11787x;
                d0Var3.Q.setVisibility(8);
                PopupWindow popupWindow = d0Var3.R;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (d0Var3.Q.getParent() instanceof View) {
                    View view = (View) d0Var3.Q.getParent();
                    WeakHashMap weakHashMap = t0.m0.f11853a;
                    t0.b0.c(view);
                }
                d0Var3.Q.e();
                d0Var3.T.d(null);
                d0Var3.T = null;
                ViewGroup viewGroup = d0Var3.W;
                WeakHashMap weakHashMap2 = t0.m0.f11853a;
                t0.b0.c(viewGroup);
                break;
        }
    }

    @Override // p4.v, t0.r0
    public void c() {
        int i = this.f5991j;
        Object obj = this.f5992k;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((r) obj).f5989w.Q.setVisibility(0);
                break;
            case 1:
                d0 d0Var = (d0) obj;
                d0Var.Q.setVisibility(0);
                if (d0Var.Q.getParent() instanceof View) {
                    View view = (View) d0Var.Q.getParent();
                    WeakHashMap weakHashMap = t0.m0.f11853a;
                    t0.b0.c(view);
                }
                break;
        }
    }
}
