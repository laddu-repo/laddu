package o;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f3 implements n.x {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n.l f9154v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n.n f9155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Toolbar f9156x;

    public f3(Toolbar toolbar) {
        this.f9156x = toolbar;
    }

    @Override // n.x
    public final void b() {
        if (this.f9155w != null) {
            n.l lVar = this.f9154v;
            if (lVar != null) {
                int size = lVar.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f9154v.getItem(i) == this.f9155w) {
                        return;
                    }
                }
            }
            k(this.f9155w);
        }
    }

    @Override // n.x
    public final boolean f(n.n nVar) {
        Toolbar toolbar = this.f9156x;
        toolbar.c();
        ViewParent parent = toolbar.C.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.C);
            }
            toolbar.addView(toolbar.C);
        }
        View actionView = nVar.getActionView();
        toolbar.D = actionView;
        this.f9155w = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.D);
            }
            g3 g3VarH = Toolbar.h();
            g3VarH.f9162a = (toolbar.I & 112) | 8388611;
            g3VarH.f9163b = 2;
            toolbar.D.setLayoutParams(g3VarH);
            toolbar.addView(toolbar.D);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((g3) childAt.getLayoutParams()).f9163b != 2 && childAt != toolbar.f681v) {
                toolbar.removeViewAt(childCount);
                toolbar.f666c0.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.C = true;
        nVar.f8930n.p(false);
        KeyEvent.Callback callback = toolbar.D;
        if (callback instanceof m.b) {
            ((m.b) callback).onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // n.x
    public final void g(Context context, n.l lVar) {
        n.n nVar;
        n.l lVar2 = this.f9154v;
        if (lVar2 != null && (nVar = this.f9155w) != null) {
            lVar2.d(nVar);
        }
        this.f9154v = lVar;
    }

    @Override // n.x
    public final boolean h(n.d0 d0Var) {
        return false;
    }

    @Override // n.x
    public final boolean i() {
        return false;
    }

    @Override // n.x
    public final boolean k(n.n nVar) {
        Toolbar toolbar = this.f9156x;
        KeyEvent.Callback callback = toolbar.D;
        if (callback instanceof m.b) {
            ((m.b) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.D);
        toolbar.removeView(toolbar.C);
        toolbar.D = null;
        ArrayList arrayList = toolbar.f666c0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f9155w = null;
        toolbar.requestLayout();
        nVar.C = false;
        nVar.f8930n.p(false);
        toolbar.v();
        return true;
    }

    @Override // n.x
    public final void d(n.l lVar, boolean z2) {
    }
}
