package o;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import p.k2;
import p.n0;
import p.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9759x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9760y;

    public /* synthetic */ d(Object obj, int i6) {
        this.f9759x = i6;
        this.f9760y = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f9759x) {
            case 0:
                f fVar = (f) this.f9760y;
                ArrayList arrayList = fVar.E;
                if (fVar.a() && arrayList.size() > 0) {
                    int i6 = 0;
                    if (!((e) arrayList.get(0)).f9762a.V) {
                        View view = fVar.L;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i6 < size) {
                                Object obj = arrayList.get(i6);
                                i6++;
                                ((e) obj).f9762a.b();
                            }
                            return;
                        }
                        fVar.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                c0 c0Var = (c0) this.f9760y;
                k2 k2Var = c0Var.E;
                if (c0Var.a() && !k2Var.V) {
                    View view2 = c0Var.J;
                    if (view2 != null && view2.isShown()) {
                        k2Var.b();
                        return;
                    } else {
                        c0Var.dismiss();
                        return;
                    }
                }
                return;
            case 2:
                q0 q0Var = (q0) this.f9760y;
                if (!q0Var.getInternalPopup().a()) {
                    q0Var.C.m(q0Var.getTextDirection(), q0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = q0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            default:
                n0 n0Var = (n0) this.f9760y;
                q0 q0Var2 = n0Var.f10319e0;
                n0Var.getClass();
                if (q0Var2.isAttachedToWindow() && q0Var2.getGlobalVisibleRect(n0Var.f10317c0)) {
                    n0Var.s();
                    n0Var.b();
                    return;
                } else {
                    n0Var.dismiss();
                    return;
                }
        }
    }
}
