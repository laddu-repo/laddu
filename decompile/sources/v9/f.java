package v9;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f extends f0.b {

    /* renamed from: a, reason: collision with root package name */
    public v.g f13494a;

    /* renamed from: b, reason: collision with root package name */
    public int f13495b = 0;

    public f() {
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, v.g] */
    @Override // f0.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
        t(coordinatorLayout, view, i6);
        if (this.f13494a == null) {
            ?? obj = new Object();
            obj.f13155d = view;
            this.f13494a = obj;
        }
        v.g gVar = this.f13494a;
        View view2 = (View) gVar.f13155d;
        gVar.f13152a = view2.getTop();
        gVar.f13153b = view2.getLeft();
        this.f13494a.b();
        int i10 = this.f13495b;
        if (i10 != 0) {
            v.g gVar2 = this.f13494a;
            if (gVar2.f13154c != i10) {
                gVar2.f13154c = i10;
                gVar2.b();
            }
            this.f13495b = 0;
            return true;
        }
        return true;
    }

    public final int s() {
        v.g gVar = this.f13494a;
        if (gVar != null) {
            return gVar.f13154c;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, int i6) {
        coordinatorLayout.r(view, i6);
    }

    public f(int i6) {
    }
}
