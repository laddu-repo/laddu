package o;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u implements PopupWindow.OnDismissListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9835x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9836y;

    public /* synthetic */ u(Object obj, int i6) {
        this.f9835x = i6;
        this.f9836y = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.f9835x) {
            case 0:
                ((v) this.f9836y).c();
                return;
            default:
                ((n9.j) this.f9836y).getClass();
                return;
        }
    }
}
