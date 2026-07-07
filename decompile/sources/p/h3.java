package p;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h3 implements o.x {

    /* renamed from: x, reason: collision with root package name */
    public o.l f10266x;

    /* renamed from: y, reason: collision with root package name */
    public o.n f10267y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Toolbar f10268z;

    public h3(Toolbar toolbar) {
        this.f10268z = toolbar;
    }

    @Override // o.x
    public final void c(Context context, o.l lVar) {
        o.n nVar;
        o.l lVar2 = this.f10266x;
        if (lVar2 != null && (nVar = this.f10267y) != null) {
            lVar2.d(nVar);
        }
        this.f10266x = lVar;
    }

    @Override // o.x
    public final boolean d() {
        return false;
    }

    @Override // o.x
    public final boolean f(o.d0 d0Var) {
        return false;
    }

    @Override // o.x
    public final void g() {
        if (this.f10267y != null) {
            o.l lVar = this.f10266x;
            if (lVar != null) {
                int size = lVar.f9781f.size();
                for (int i6 = 0; i6 < size; i6++) {
                    if (this.f10266x.getItem(i6) == this.f10267y) {
                        return;
                    }
                }
            }
            k(this.f10267y);
        }
    }

    @Override // o.x
    public final boolean i(o.n nVar) {
        Toolbar toolbar = this.f10268z;
        toolbar.d();
        ViewParent parent = toolbar.E.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.E);
            }
            toolbar.addView(toolbar.E);
        }
        View actionView = nVar.getActionView();
        toolbar.F = actionView;
        this.f10267y = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.F);
            }
            i3 i6 = Toolbar.i();
            i6.f10269a = (toolbar.K & 112) | 8388611;
            i6.f10270b = 2;
            toolbar.F.setLayoutParams(i6);
            toolbar.addView(toolbar.F);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((i3) childAt.getLayoutParams()).f10270b != 2 && childAt != toolbar.f832x) {
                toolbar.removeViewAt(childCount);
                toolbar.f819e0.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.C = true;
        nVar.f9813n.p(false);
        KeyEvent.Callback callback = toolbar.F;
        if (callback instanceof n.b) {
            ((n.b) callback).onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // o.x
    public final boolean k(o.n nVar) {
        Toolbar toolbar = this.f10268z;
        KeyEvent.Callback callback = toolbar.F;
        if (callback instanceof n.b) {
            ((n.b) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.F);
        toolbar.removeView(toolbar.E);
        toolbar.F = null;
        ArrayList arrayList = toolbar.f819e0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f10267y = null;
        toolbar.requestLayout();
        nVar.C = false;
        nVar.f9813n.p(false);
        toolbar.u();
        return true;
    }

    @Override // o.x
    public final void e(o.l lVar, boolean z10) {
    }
}
