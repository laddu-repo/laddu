package gd;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import w4.e1;
import w4.i1;
import w4.p0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends p0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5615a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5616b;

    public g(int i6, int i10) {
        this.f5615a = i6;
        this.f5616b = i10;
    }

    @Override // w4.p0
    public final void a(Rect outRect, View view, RecyclerView recyclerView, e1 state) {
        int i6;
        RecyclerView recyclerView2;
        kotlin.jvm.internal.k.e(outRect, "outRect");
        kotlin.jvm.internal.k.e(view, "view");
        kotlin.jvm.internal.k.e(state, "state");
        i1 J = RecyclerView.J(view);
        if (J != null && (recyclerView2 = J.f13913r) != null) {
            i6 = recyclerView2.G(J);
        } else {
            i6 = -1;
        }
        if (i6 == -1) {
            return;
        }
        int i10 = this.f5615a;
        int i11 = i6 % i10;
        int i12 = this.f5616b;
        outRect.left = i12 - ((i11 * i12) / i10);
        outRect.right = ((i11 + 1) * i12) / i10;
        if (i6 < i10) {
            outRect.top = i12;
        }
        outRect.bottom = i12;
    }
}
