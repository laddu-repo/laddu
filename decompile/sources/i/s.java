package i;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import t0.q0;
import t0.w0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6261b;

    public /* synthetic */ s(Object obj, int i6) {
        this.f6260a = i6;
        this.f6261b = obj;
    }

    @Override // t0.w0, t0.v0
    public void b() {
        int i6 = this.f6260a;
        Object obj = this.f6261b;
        switch (i6) {
            case 0:
                ((r) obj).f6259y.S.setVisibility(0);
                return;
            case 1:
                b0 b0Var = (b0) obj;
                b0Var.S.setVisibility(0);
                if (b0Var.S.getParent() instanceof View) {
                    View view = (View) b0Var.S.getParent();
                    WeakHashMap weakHashMap = q0.f12397a;
                    t0.f0.c(view);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // t0.v0
    public final void c() {
        int i6 = this.f6260a;
        Object obj = this.f6261b;
        switch (i6) {
            case 0:
                b0 b0Var = ((r) obj).f6259y;
                b0Var.S.setAlpha(1.0f);
                b0Var.V.d(null);
                b0Var.V = null;
                return;
            case 1:
                b0 b0Var2 = (b0) obj;
                b0Var2.S.setAlpha(1.0f);
                b0Var2.V.d(null);
                b0Var2.V = null;
                return;
            default:
                b0 b0Var3 = (b0) ((j4.b0) obj).f7159y;
                b0Var3.S.setVisibility(8);
                PopupWindow popupWindow = b0Var3.T;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (b0Var3.S.getParent() instanceof View) {
                    View view = (View) b0Var3.S.getParent();
                    WeakHashMap weakHashMap = q0.f12397a;
                    t0.f0.c(view);
                }
                b0Var3.S.e();
                b0Var3.V.d(null);
                b0Var3.V = null;
                ViewGroup viewGroup = b0Var3.Y;
                WeakHashMap weakHashMap2 = q0.f12397a;
                t0.f0.c(viewGroup);
                return;
        }
    }
}
