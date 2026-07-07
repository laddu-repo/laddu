package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.playfy.tv.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements o.x {
    public final LayoutInflater A;
    public o.w B;
    public o.z E;
    public i F;
    public Drawable G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public f P;
    public f Q;
    public h R;
    public g S;

    /* renamed from: x, reason: collision with root package name */
    public final Context f10271x;

    /* renamed from: y, reason: collision with root package name */
    public Context f10272y;

    /* renamed from: z, reason: collision with root package name */
    public o.l f10273z;
    public final int C = R.layout.abc_action_menu_layout;
    public final int D = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray O = new SparseBooleanArray();
    public final u5.r T = new u5.r(this, 20);

    public j(Context context) {
        this.f10271x = context;
        this.A = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [o.y] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(o.n nVar, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = nVar.getActionView();
        int i6 = 0;
        if (actionView == null || nVar.e()) {
            if (view instanceof o.y) {
                actionMenuItemView = (o.y) view;
            } else {
                actionMenuItemView = (o.y) this.A.inflate(this.D, viewGroup, false);
            }
            actionMenuItemView.a(nVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.E);
            if (this.S == null) {
                this.S = new g(this);
            }
            actionMenuItemView2.setPopupCallback(this.S);
            actionView = actionMenuItemView;
        }
        if (nVar.C) {
            i6 = 8;
        }
        actionView.setVisibility(i6);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        Object obj;
        h hVar = this.R;
        if (hVar != null && (obj = this.E) != null) {
            ((View) obj).removeCallbacks(hVar);
            this.R = null;
            return true;
        }
        f fVar = this.P;
        if (fVar != null) {
            if (fVar.b()) {
                fVar.f9845i.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // o.x
    public final void c(Context context, o.l lVar) {
        this.f10272y = context;
        LayoutInflater.from(context);
        this.f10273z = lVar;
        Resources resources = context.getResources();
        if (!this.J) {
            this.I = true;
        }
        int i6 = 2;
        this.K = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i10 <= 600 && ((i10 <= 960 || i11 <= 720) && (i10 <= 720 || i11 <= 960))) {
            if (i10 < 500 && ((i10 <= 640 || i11 <= 480) && (i10 <= 480 || i11 <= 640))) {
                if (i10 >= 360) {
                    i6 = 3;
                }
            } else {
                i6 = 4;
            }
        } else {
            i6 = 5;
        }
        this.M = i6;
        int i12 = this.K;
        if (this.I) {
            if (this.F == null) {
                i iVar = new i(this, this.f10271x);
                this.F = iVar;
                if (this.H) {
                    iVar.setImageDrawable(this.G);
                    this.G = null;
                    this.H = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.F.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.F.getMeasuredWidth();
        } else {
            this.F = null;
        }
        this.L = i12;
        float f3 = resources.getDisplayMetrics().density;
    }

    @Override // o.x
    public final boolean d() {
        ArrayList arrayList;
        int i6;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        j jVar = this;
        o.l lVar = jVar.f10273z;
        if (lVar != null) {
            arrayList = lVar.l();
            i6 = arrayList.size();
        } else {
            arrayList = null;
            i6 = 0;
        }
        int i11 = jVar.M;
        int i12 = jVar.L;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) jVar.E;
        int i13 = 0;
        boolean z14 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= i6) {
                break;
            }
            o.n nVar = (o.n) arrayList.get(i13);
            int i16 = nVar.f9823y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z14 = true;
            }
            if (jVar.N && nVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (jVar.I && (z14 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = jVar.O;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i6) {
            o.n nVar2 = (o.n) arrayList.get(i18);
            int i20 = nVar2.f9823y;
            if ((i20 & 2) == i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i21 = nVar2.f9802b;
            if (z11) {
                View a10 = jVar.a(nVar2, null, viewGroup);
                a10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a10.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                nVar2.f(z10);
            } else if ((i20 & 1) == z10) {
                boolean z15 = sparseBooleanArray.get(i21);
                if ((i17 > 0 || z15) && i12 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    View a11 = jVar.a(nVar2, null, viewGroup);
                    a11.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a11.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    if (i12 + i19 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z12 &= z13;
                }
                if (z12 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z15) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        o.n nVar3 = (o.n) arrayList.get(i22);
                        if (nVar3.f9802b == i21) {
                            if ((nVar3.f9822x & 32) == 32) {
                                i17++;
                            }
                            nVar3.f(false);
                        }
                    }
                }
                if (z12) {
                    i17--;
                }
                nVar2.f(z12);
            } else {
                nVar2.f(false);
                i18++;
                i10 = 2;
                jVar = this;
                z10 = true;
            }
            i18++;
            i10 = 2;
            jVar = this;
            z10 = true;
        }
        return true;
    }

    @Override // o.x
    public final void e(o.l lVar, boolean z10) {
        b();
        f fVar = this.Q;
        if (fVar != null && fVar.b()) {
            fVar.f9845i.dismiss();
        }
        o.w wVar = this.B;
        if (wVar != null) {
            wVar.e(lVar, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.x
    public final boolean f(o.d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            o.d0 d0Var2 = d0Var;
            while (true) {
                o.l lVar = d0Var2.f9761z;
                if (lVar == this.f10273z) {
                    break;
                }
                d0Var2 = (o.d0) lVar;
            }
            o.n nVar = d0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.E;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i6);
                    if ((childAt instanceof o.y) && ((o.y) childAt).getItemData() == nVar) {
                        view = childAt;
                        break;
                    }
                    i6++;
                }
            }
            if (view != null) {
                d0Var.A.getClass();
                int size = d0Var.f9781f.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        MenuItem item = d0Var.getItem(i10);
                        if (item.isVisible() && item.getIcon() != null) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                f fVar = new f(this, this.f10272y, d0Var, view);
                this.Q = fVar;
                fVar.f9843g = z10;
                o.t tVar = fVar.f9845i;
                if (tVar != null) {
                    tVar.o(z10);
                }
                f fVar2 = this.Q;
                if (!fVar2.b()) {
                    if (fVar2.f9841e != null) {
                        fVar2.d(0, 0, false, false);
                    } else {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
                o.w wVar = this.B;
                if (wVar != null) {
                    wVar.v(d0Var);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.x
    public final void g() {
        int i6;
        o.n nVar;
        ViewGroup viewGroup = (ViewGroup) this.E;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            o.l lVar = this.f10273z;
            if (lVar != null) {
                lVar.i();
                ArrayList l10 = this.f10273z.l();
                int size = l10.size();
                i6 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    o.n nVar2 = (o.n) l10.get(i10);
                    if ((nVar2.f9822x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i6);
                        if (childAt instanceof o.y) {
                            nVar = ((o.y) childAt).getItemData();
                        } else {
                            nVar = null;
                        }
                        View a10 = a(nVar2, childAt, viewGroup);
                        if (nVar2 != nVar) {
                            a10.setPressed(false);
                            a10.jumpDrawablesToCurrentState();
                        }
                        if (a10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a10);
                            }
                            ((ViewGroup) this.E).addView(a10, i6);
                        }
                        i6++;
                    }
                }
            } else {
                i6 = 0;
            }
            while (i6 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i6) == this.F) {
                    i6++;
                } else {
                    viewGroup.removeViewAt(i6);
                }
            }
        }
        ((View) this.E).requestLayout();
        o.l lVar2 = this.f10273z;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f9784i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                o.o oVar = ((o.n) arrayList2.get(i11)).A;
            }
        }
        o.l lVar3 = this.f10273z;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.j;
        }
        if (this.I && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((o.n) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.F == null) {
                this.F = new i(this, this.f10271x);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.F.getParent();
            if (viewGroup3 != this.E) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.F);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.E;
                i iVar = this.F;
                actionMenuView.getClass();
                m j = ActionMenuView.j();
                j.f10292a = true;
                actionMenuView.addView(iVar, j);
            }
        } else {
            i iVar2 = this.F;
            if (iVar2 != null) {
                Object parent = iVar2.getParent();
                Object obj = this.E;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.F);
                }
            }
        }
        ((ActionMenuView) this.E).setOverflowReserved(this.I);
    }

    public final boolean h() {
        f fVar = this.P;
        if (fVar != null && fVar.b()) {
            return true;
        }
        return false;
    }

    @Override // o.x
    public final boolean i(o.n nVar) {
        return false;
    }

    @Override // o.x
    public final void j(o.w wVar) {
        throw null;
    }

    @Override // o.x
    public final boolean k(o.n nVar) {
        return false;
    }

    public final boolean l() {
        o.l lVar;
        if (this.I && !h() && (lVar = this.f10273z) != null && this.E != null && this.R == null) {
            lVar.i();
            if (!lVar.j.isEmpty()) {
                h hVar = new h(this, new f(this, this.f10272y, this.f10273z, this.F));
                this.R = hVar;
                ((View) this.E).post(hVar);
                return true;
            }
            return false;
        }
        return false;
    }
}
