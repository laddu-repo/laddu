package bb;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ExpandableBehavior A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ View f1648x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f1649y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ja.a f1650z;

    public a(ExpandableBehavior expandableBehavior, View view, int i6, ja.a aVar) {
        this.A = expandableBehavior;
        this.f1648x = view;
        this.f1649y = i6;
        this.f1650z = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f1648x;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.A;
        if (expandableBehavior.f2819a == this.f1649y) {
            Object obj = this.f1650z;
            expandableBehavior.s((View) obj, view, ((FloatingActionButton) obj).L.f7317a, false);
        }
        return false;
    }
}
