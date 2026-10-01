package c;

import android.view.View;
import android.view.Window;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1634v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1635w;

    public /* synthetic */ e(int i, Object obj) {
        this.f1634v = i;
        this.f1635w = obj;
    }

    @Override // androidx.lifecycle.q
    public final void a(androidx.lifecycle.s sVar, androidx.lifecycle.m mVar) {
        Window window;
        View viewPeekDecorView;
        switch (this.f1634v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                h.j jVar = (h.j) this.f1635w;
                if (mVar == androidx.lifecycle.m.ON_STOP && (window = jVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                h.j jVar2 = (h.j) this.f1635w;
                if (mVar == androidx.lifecycle.m.ON_DESTROY) {
                    jVar2.f1652w.f10917w = null;
                    if (!jVar2.isChangingConfigurations()) {
                        jVar2.e().a();
                    }
                    g gVar = jVar2.A;
                    h.j jVar3 = gVar.f1640y;
                    jVar3.getWindow().getDecorView().removeCallbacks(gVar);
                    jVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(gVar);
                }
                break;
            default:
                o.r rVar = (o.r) this.f1635w;
                de.i.e(rVar, "this$0");
                if (mVar == androidx.lifecycle.m.ON_START) {
                    rVar.f9284e = true;
                } else if (mVar == androidx.lifecycle.m.ON_STOP) {
                    rVar.f9284e = false;
                }
                break;
        }
    }
}
