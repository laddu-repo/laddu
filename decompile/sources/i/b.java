package i;

import android.view.View;
import android.widget.AbsListView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f6128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f6129b;

    public b(View view, View view2) {
        this.f6128a = view;
        this.f6129b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i6, int i10, int i11) {
        f.b(absListView, this.f6128a, this.f6129b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i6) {
    }
}
