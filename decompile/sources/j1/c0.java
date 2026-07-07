package j1;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 implements View.OnAttachStateChangeListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v0 f6894x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d0 f6895y;

    public c0(d0 d0Var, v0 v0Var) {
        this.f6895y = d0Var;
        this.f6894x = v0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        v0 v0Var = this.f6894x;
        y yVar = v0Var.f6992c;
        v0Var.k();
        m.i((ViewGroup) yVar.f7024g0.getParent(), this.f6895y.f6899x).h();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
