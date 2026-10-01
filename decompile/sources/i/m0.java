package i;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p.k1;
import p.m3;
import t0.q0;
import t0.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m0 extends dg.b implements p.c {

    /* renamed from: b, reason: collision with root package name */
    public Context f6228b;

    /* renamed from: c, reason: collision with root package name */
    public Context f6229c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f6230d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContainer f6231e;

    /* renamed from: f, reason: collision with root package name */
    public k1 f6232f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContextView f6233g;

    /* renamed from: h, reason: collision with root package name */
    public final View f6234h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6235i;
    public l0 j;

    /* renamed from: k, reason: collision with root package name */
    public l0 f6236k;

    /* renamed from: l, reason: collision with root package name */
    public j4.b0 f6237l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6238m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f6239n;

    /* renamed from: o, reason: collision with root package name */
    public int f6240o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6241p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6242q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6243r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public n.j f6244t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6245u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6246v;

    /* renamed from: w, reason: collision with root package name */
    public final k0 f6247w;

    /* renamed from: x, reason: collision with root package name */
    public final k0 f6248x;

    /* renamed from: y, reason: collision with root package name */
    public final u5.r f6249y;

    /* renamed from: z, reason: collision with root package name */
    public static final AccelerateInterpolator f6227z = new AccelerateInterpolator();
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    public m0(Activity activity, boolean z10) {
        new ArrayList();
        this.f6239n = new ArrayList();
        this.f6240o = 0;
        this.f6241p = true;
        this.s = true;
        this.f6247w = new k0(this, 0);
        this.f6248x = new k0(this, 1);
        this.f6249y = new u5.r(this, 10);
        View decorView = activity.getWindow().getDecorView();
        v(decorView);
        if (z10) {
            return;
        }
        this.f6234h = decorView.findViewById(R.id.content);
    }

    public final void t(boolean z10) {
        u0 i6;
        u0 u0Var;
        long j;
        if (z10) {
            if (!this.f6243r) {
                this.f6243r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6230d;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                y(false);
            }
        } else if (this.f6243r) {
            this.f6243r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6230d;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            y(false);
        }
        if (this.f6231e.isLaidOut()) {
            if (z10) {
                m3 m3Var = (m3) this.f6232f;
                i6 = q0.a(m3Var.f10301a);
                i6.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i6.c(100L);
                i6.d(new n.i(m3Var, 4));
                u0Var = this.f6233g.i(0, 200L);
            } else {
                m3 m3Var2 = (m3) this.f6232f;
                u0 a10 = q0.a(m3Var2.f10301a);
                a10.a(1.0f);
                a10.c(200L);
                a10.d(new n.i(m3Var2, 0));
                i6 = this.f6233g.i(8, 100L);
                u0Var = a10;
            }
            n.j jVar = new n.j();
            ArrayList arrayList = jVar.f8938a;
            arrayList.add(i6);
            View view = (View) i6.f12414a.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) u0Var.f12414a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(u0Var);
            jVar.b();
            return;
        }
        if (z10) {
            ((m3) this.f6232f).f10301a.setVisibility(4);
            this.f6233g.setVisibility(0);
        } else {
            ((m3) this.f6232f).f10301a.setVisibility(0);
            this.f6233g.setVisibility(8);
        }
    }

    public final Context u() {
        if (this.f6229c == null) {
            TypedValue typedValue = new TypedValue();
            this.f6228b.getTheme().resolveAttribute(com.playfy.tv.R.attr.actionBarWidgetTheme, typedValue, true);
            int i6 = typedValue.resourceId;
            if (i6 != 0) {
                this.f6229c = new ContextThemeWrapper(this.f6228b, i6);
            } else {
                this.f6229c = this.f6228b;
            }
        }
        return this.f6229c;
    }

    public final void v(View view) {
        String str;
        k1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.playfy.tv.R.id.decor_content_parent);
        this.f6230d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.playfy.tv.R.id.action_bar);
        if (findViewById instanceof k1) {
            wrapper = (k1) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f6232f = wrapper;
        this.f6233g = (ActionBarContextView) view.findViewById(com.playfy.tv.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.playfy.tv.R.id.action_bar_container);
        this.f6231e = actionBarContainer;
        k1 k1Var = this.f6232f;
        if (k1Var != null && this.f6233g != null && actionBarContainer != null) {
            Context context = ((m3) k1Var).f10301a.getContext();
            this.f6228b = context;
            if ((((m3) this.f6232f).f10302b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f6235i = true;
            }
            int i6 = context.getApplicationInfo().targetSdkVersion;
            this.f6232f.getClass();
            x(context.getResources().getBoolean(com.playfy.tv.R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f6228b.obtainStyledAttributes(null, h.a.f5732a, com.playfy.tv.R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6230d;
                if (actionBarOverlayLayout2.D) {
                    this.f6246v = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.f6231e;
                WeakHashMap weakHashMap = q0.f12397a;
                t0.h0.k(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(m0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void w(boolean z10) {
        int i6;
        if (!this.f6235i) {
            if (z10) {
                i6 = 4;
            } else {
                i6 = 0;
            }
            m3 m3Var = (m3) this.f6232f;
            int i10 = m3Var.f10302b;
            this.f6235i = true;
            m3Var.a((i6 & 4) | (i10 & (-5)));
        }
    }

    public final void x(boolean z10) {
        if (!z10) {
            ((m3) this.f6232f).getClass();
            this.f6231e.setTabContainer(null);
        } else {
            this.f6231e.setTabContainer(null);
            ((m3) this.f6232f).getClass();
        }
        this.f6232f.getClass();
        ((m3) this.f6232f).f10301a.setCollapsible(false);
        this.f6230d.setHasNonEmbeddedTabs(false);
    }

    public final void y(boolean z10) {
        boolean z11 = this.f6242q;
        boolean z12 = this.f6243r;
        pa.l lVar = null;
        u5.r rVar = this.f6249y;
        View view = this.f6234h;
        int i6 = 1;
        if (!z12 && z11) {
            if (this.s) {
                this.s = false;
                n.j jVar = this.f6244t;
                if (jVar != null) {
                    jVar.a();
                }
                int i10 = this.f6240o;
                k0 k0Var = this.f6247w;
                if (i10 == 0 && (this.f6245u || z10)) {
                    this.f6231e.setAlpha(1.0f);
                    this.f6231e.setTransitioning(true);
                    n.j jVar2 = new n.j();
                    float f3 = -this.f6231e.getHeight();
                    if (z10) {
                        this.f6231e.getLocationInWindow(new int[]{0, 0});
                        f3 -= r12[1];
                    }
                    u0 a10 = q0.a(this.f6231e);
                    a10.e(f3);
                    View view2 = (View) a10.f12414a.get();
                    if (view2 != null) {
                        if (rVar != null) {
                            lVar = new pa.l(i6, rVar, view2);
                        }
                        view2.animate().setUpdateListener(lVar);
                    }
                    boolean z13 = jVar2.f8942e;
                    ArrayList arrayList = jVar2.f8938a;
                    if (!z13) {
                        arrayList.add(a10);
                    }
                    if (this.f6241p && view != null) {
                        u0 a11 = q0.a(view);
                        a11.e(f3);
                        if (!jVar2.f8942e) {
                            arrayList.add(a11);
                        }
                    }
                    boolean z14 = jVar2.f8942e;
                    if (!z14) {
                        jVar2.f8940c = f6227z;
                    }
                    if (!z14) {
                        jVar2.f8939b = 250L;
                    }
                    if (!z14) {
                        jVar2.f8941d = k0Var;
                    }
                    this.f6244t = jVar2;
                    jVar2.b();
                    return;
                }
                k0Var.c();
                return;
            }
            return;
        }
        if (!this.s) {
            this.s = true;
            n.j jVar3 = this.f6244t;
            if (jVar3 != null) {
                jVar3.a();
            }
            this.f6231e.setVisibility(0);
            int i11 = this.f6240o;
            k0 k0Var2 = this.f6248x;
            if (i11 == 0 && (this.f6245u || z10)) {
                this.f6231e.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                float f10 = -this.f6231e.getHeight();
                if (z10) {
                    this.f6231e.getLocationInWindow(new int[]{0, 0});
                    f10 -= r12[1];
                }
                this.f6231e.setTranslationY(f10);
                n.j jVar4 = new n.j();
                u0 a12 = q0.a(this.f6231e);
                a12.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                View view3 = (View) a12.f12414a.get();
                if (view3 != null) {
                    if (rVar != null) {
                        lVar = new pa.l(i6, rVar, view3);
                    }
                    view3.animate().setUpdateListener(lVar);
                }
                boolean z15 = jVar4.f8942e;
                ArrayList arrayList2 = jVar4.f8938a;
                if (!z15) {
                    arrayList2.add(a12);
                }
                if (this.f6241p && view != null) {
                    view.setTranslationY(f10);
                    u0 a13 = q0.a(view);
                    a13.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    if (!jVar4.f8942e) {
                        arrayList2.add(a13);
                    }
                }
                boolean z16 = jVar4.f8942e;
                if (!z16) {
                    jVar4.f8940c = A;
                }
                if (!z16) {
                    jVar4.f8939b = 250L;
                }
                if (!z16) {
                    jVar4.f8941d = k0Var2;
                }
                this.f6244t = jVar4;
                jVar4.b();
            } else {
                this.f6231e.setAlpha(1.0f);
                this.f6231e.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (this.f6241p && view != null) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                k0Var2.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f6230d;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = q0.f12397a;
                t0.f0.c(actionBarOverlayLayout);
            }
        }
    }

    public m0(Dialog dialog) {
        new ArrayList();
        this.f6239n = new ArrayList();
        this.f6240o = 0;
        this.f6241p = true;
        this.s = true;
        this.f6247w = new k0(this, 0);
        this.f6248x = new k0(this, 1);
        this.f6249y = new u5.r(this, 10);
        v(dialog.getWindow().getDecorView());
    }
}
