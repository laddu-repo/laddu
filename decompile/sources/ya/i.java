package ya;

import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f15041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f15042b;

    public i(j jVar, View view) {
        this.f15042b = jVar;
        this.f15041a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        View view2 = this.f15041a;
        if (view2.getVisibility() == 0) {
            this.f15042b.c(view2);
        }
    }
}
