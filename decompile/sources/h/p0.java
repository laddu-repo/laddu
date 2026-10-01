package h;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.f3;
import o.i1;
import o.k3;
import t0.q0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends com.bumptech.glide.f implements o.c {
    public static final AccelerateInterpolator C = new AccelerateInterpolator();
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public final n0 A;
    public final s5.c B;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f5963e;
    public Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActionBarOverlayLayout f5964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ActionBarContainer f5965h;
    public i1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ActionBarContextView f5966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f5967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o0 f5969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o0 f5970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public sc.b f5971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f5973q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5974r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5976t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5977u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5978v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m.j f5979w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5980x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5981y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final n0 f5982z;

    public p0(Activity activity, boolean z2) {
        new ArrayList();
        this.f5973q = new ArrayList();
        this.f5974r = 0;
        this.f5975s = true;
        this.f5978v = true;
        this.f5982z = new n0(this, 0);
        this.A = new n0(this, 1);
        this.B = new s5.c(20, this);
        View decorView = activity.getWindow().getDecorView();
        X(decorView);
        if (z2) {
            return;
        }
        this.f5967k = decorView.findViewById(R.id.content);
    }

    @Override // com.bumptech.glide.f
    public final void C() {
        Y(this.f5963e.getResources().getBoolean(g.b.abc_action_bar_embed_tabs));
    }

    @Override // com.bumptech.glide.f
    public final boolean E(int i, KeyEvent keyEvent) {
        n.l lVar;
        o0 o0Var = this.f5969m;
        if (o0Var == null || (lVar = o0Var.f5959y) == null) {
            return false;
        }
        lVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return lVar.performShortcut(i, keyEvent, 0);
    }

    @Override // com.bumptech.glide.f
    public final void N(boolean z2) {
        if (this.f5968l) {
            return;
        }
        O(z2);
    }

    @Override // com.bumptech.glide.f
    public final void O(boolean z2) {
        int i = z2 ? 4 : 0;
        k3 k3Var = (k3) this.i;
        int i10 = k3Var.f9200b;
        this.f5968l = true;
        k3Var.a((i & 4) | (i10 & (-5)));
    }

    @Override // com.bumptech.glide.f
    public final void P(boolean z2) {
        m.j jVar;
        this.f5980x = z2;
        if (z2 || (jVar = this.f5979w) == null) {
            return;
        }
        jVar.a();
    }

    @Override // com.bumptech.glide.f
    public final void Q(CharSequence charSequence) {
        k3 k3Var = (k3) this.i;
        if (k3Var.f9204g) {
            return;
        }
        Toolbar toolbar = k3Var.f9199a;
        k3Var.f9205h = charSequence;
        if ((k3Var.f9200b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (k3Var.f9204g) {
                t0.m0.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // com.bumptech.glide.f
    public final m.a R(sc.b bVar) {
        o0 o0Var = this.f5969m;
        if (o0Var != null) {
            o0Var.a();
        }
        this.f5964g.setHideOnContentScrollEnabled(false);
        this.f5966j.e();
        o0 o0Var2 = new o0(this, this.f5966j.getContext(), bVar);
        n.l lVar = o0Var2.f5959y;
        lVar.w();
        try {
            if (!((sb.p) o0Var2.f5960z.f11786w).A(o0Var2, lVar)) {
                return null;
            }
            this.f5969m = o0Var2;
            o0Var2.g();
            this.f5966j.c(o0Var2);
            W(true);
            return o0Var2;
        } finally {
            lVar.v();
        }
    }

    public final void W(boolean z2) {
        q0 q0VarI;
        q0 q0VarI2;
        if (z2) {
            if (!this.f5977u) {
                this.f5977u = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f5964g;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                Z(false);
            }
        } else if (this.f5977u) {
            this.f5977u = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f5964g;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            Z(false);
        }
        if (!this.f5965h.isLaidOut()) {
            if (z2) {
                ((k3) this.i).f9199a.setVisibility(4);
                this.f5966j.setVisibility(0);
                return;
            } else {
                ((k3) this.i).f9199a.setVisibility(0);
                this.f5966j.setVisibility(8);
                return;
            }
        }
        if (z2) {
            k3 k3Var = (k3) this.i;
            q0VarI = t0.m0.a(k3Var.f9199a);
            q0VarI.a(0.0f);
            q0VarI.c(100L);
            q0VarI.d(new m.i(k3Var, 4));
            q0VarI2 = this.f5966j.i(0, 200L);
        } else {
            k3 k3Var2 = (k3) this.i;
            q0 q0VarA = t0.m0.a(k3Var2.f9199a);
            q0VarA.a(1.0f);
            q0VarA.c(200L);
            q0VarA.d(new m.i(k3Var2, 0));
            q0VarI = this.f5966j.i(8, 100L);
            q0VarI2 = q0VarA;
        }
        m.j jVar = new m.j();
        ArrayList arrayList = jVar.f8412a;
        arrayList.add(q0VarI);
        View view = (View) q0VarI.f11872a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) q0VarI2.f11872a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(q0VarI2);
        jVar.b();
    }

    public final void X(View view) {
        i1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(g.f.decor_content_parent);
        this.f5964g = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(g.f.action_bar);
        if (callbackFindViewById instanceof i1) {
            wrapper = (i1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.i = wrapper;
        this.f5966j = (ActionBarContextView) view.findViewById(g.f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(g.f.action_bar_container);
        this.f5965h = actionBarContainer;
        i1 i1Var = this.i;
        if (i1Var == null || this.f5966j == null || actionBarContainer == null) {
            throw new IllegalStateException(p0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((k3) i1Var).f9199a.getContext();
        this.f5963e = context;
        if ((((k3) this.i).f9200b & 4) != 0) {
            this.f5968l = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.i.getClass();
        Y(context.getResources().getBoolean(g.b.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f5963e.obtainStyledAttributes(null, g.j.ActionBar, g.a.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(g.j.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f5964g;
            if (!actionBarOverlayLayout2.B) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f5981y = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(g.j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f5965h;
            WeakHashMap weakHashMap = t0.m0.f11853a;
            t0.d0.j(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void Y(boolean z2) {
        if (z2) {
            this.f5965h.setTabContainer(null);
            ((k3) this.i).getClass();
        } else {
            ((k3) this.i).getClass();
            this.f5965h.setTabContainer(null);
        }
        this.i.getClass();
        ((k3) this.i).f9199a.setCollapsible(false);
        this.f5964g.setHasNonEmbeddedTabs(false);
    }

    public final void Z(boolean z2) {
        boolean z10 = this.f5976t;
        boolean z11 = this.f5977u;
        s5.c cVar = this.B;
        View view = this.f5967k;
        int i = 1;
        if (!z11 && z10) {
            if (this.f5978v) {
                this.f5978v = false;
                m.j jVar = this.f5979w;
                if (jVar != null) {
                    jVar.a();
                }
                int i10 = this.f5974r;
                n0 n0Var = this.f5982z;
                if (i10 != 0 || (!this.f5980x && !z2)) {
                    n0Var.a();
                    return;
                }
                this.f5965h.setAlpha(1.0f);
                this.f5965h.setTransitioning(true);
                m.j jVar2 = new m.j();
                float f = -this.f5965h.getHeight();
                if (z2) {
                    this.f5965h.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                q0 q0VarA = t0.m0.a(this.f5965h);
                q0VarA.e(f);
                View view2 = (View) q0VarA.f11872a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new nc.b(cVar, view2, i) : null);
                }
                boolean z12 = jVar2.f8416e;
                ArrayList arrayList = jVar2.f8412a;
                if (!z12) {
                    arrayList.add(q0VarA);
                }
                if (this.f5975s && view != null) {
                    q0 q0VarA2 = t0.m0.a(view);
                    q0VarA2.e(f);
                    if (!jVar2.f8416e) {
                        arrayList.add(q0VarA2);
                    }
                }
                boolean z13 = jVar2.f8416e;
                if (!z13) {
                    jVar2.f8414c = C;
                }
                if (!z13) {
                    jVar2.f8413b = 250L;
                }
                if (!z13) {
                    jVar2.f8415d = n0Var;
                }
                this.f5979w = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f5978v) {
            return;
        }
        this.f5978v = true;
        m.j jVar3 = this.f5979w;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f5965h.setVisibility(0);
        int i11 = this.f5974r;
        n0 n0Var2 = this.A;
        if (i11 == 0 && (this.f5980x || z2)) {
            this.f5965h.setTranslationY(0.0f);
            float f4 = -this.f5965h.getHeight();
            if (z2) {
                this.f5965h.getLocationInWindow(new int[]{0, 0});
                f4 -= r12[1];
            }
            this.f5965h.setTranslationY(f4);
            m.j jVar4 = new m.j();
            q0 q0VarA3 = t0.m0.a(this.f5965h);
            q0VarA3.e(0.0f);
            View view3 = (View) q0VarA3.f11872a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new nc.b(cVar, view3, i) : null);
            }
            boolean z14 = jVar4.f8416e;
            ArrayList arrayList2 = jVar4.f8412a;
            if (!z14) {
                arrayList2.add(q0VarA3);
            }
            if (this.f5975s && view != null) {
                view.setTranslationY(f4);
                q0 q0VarA4 = t0.m0.a(view);
                q0VarA4.e(0.0f);
                if (!jVar4.f8416e) {
                    arrayList2.add(q0VarA4);
                }
            }
            boolean z15 = jVar4.f8416e;
            if (!z15) {
                jVar4.f8414c = D;
            }
            if (!z15) {
                jVar4.f8413b = 250L;
            }
            if (!z15) {
                jVar4.f8415d = n0Var2;
            }
            this.f5979w = jVar4;
            jVar4.b();
        } else {
            this.f5965h.setAlpha(1.0f);
            this.f5965h.setTranslationY(0.0f);
            if (this.f5975s && view != null) {
                view.setTranslationY(0.0f);
            }
            n0Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f5964g;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = t0.m0.f11853a;
            t0.b0.c(actionBarOverlayLayout);
        }
    }

    @Override // com.bumptech.glide.f
    public final boolean f() {
        f3 f3Var;
        i1 i1Var = this.i;
        if (i1Var == null || (f3Var = ((k3) i1Var).f9199a.f674k0) == null || f3Var.f9155w == null) {
            return false;
        }
        f3 f3Var2 = ((k3) i1Var).f9199a.f674k0;
        n.n nVar = f3Var2 == null ? null : f3Var2.f9155w;
        if (nVar == null) {
            return true;
        }
        nVar.collapseActionView();
        return true;
    }

    @Override // com.bumptech.glide.f
    public final void l(boolean z2) {
        if (z2 == this.f5972p) {
            return;
        }
        this.f5972p = z2;
        ArrayList arrayList = this.f5973q;
        if (arrayList.size() > 0) {
            throw d0.d.f(0, arrayList);
        }
    }

    @Override // com.bumptech.glide.f
    public final int t() {
        return ((k3) this.i).f9200b;
    }

    @Override // com.bumptech.glide.f
    public final Context z() {
        if (this.f == null) {
            TypedValue typedValue = new TypedValue();
            this.f5963e.getTheme().resolveAttribute(g.a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f = new ContextThemeWrapper(this.f5963e, i);
            } else {
                this.f = this.f5963e;
            }
        }
        return this.f;
    }

    public p0(Dialog dialog) {
        new ArrayList();
        this.f5973q = new ArrayList();
        this.f5974r = 0;
        this.f5975s = true;
        this.f5978v = true;
        this.f5982z = new n0(this, 0);
        this.A = new n0(this, 1);
        this.B = new s5.c(20, this);
        X(dialog.getWindow().getDecorView());
    }
}
