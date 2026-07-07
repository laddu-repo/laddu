package h;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.List;
import java.util.WeakHashMap;
import t0.q0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Window.Callback {
    public final /* synthetic */ d0 A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Window.Callback f5995v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a9.g f5996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5997x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5998y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f5999z;

    public z(d0 d0Var, Window.Callback callback) {
        this.A = d0Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f5995v = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f5997x = true;
            callback.onContentChanged();
        } finally {
            this.f5997x = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f5995v.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f5995v.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        m.l.a(this.f5995v, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f5995v.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f5998y;
        Window.Callback callback = this.f5995v;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.A.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f5995v.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            d0 d0Var = this.A;
            d0Var.C();
            com.bumptech.glide.f fVar = d0Var.J;
            if (fVar == null || !fVar.E(keyCode, keyEvent)) {
                c0 c0Var = d0Var.f5876i0;
                if (c0Var == null || !d0Var.H(c0Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (d0Var.f5876i0 == null) {
                        c0 c0VarB = d0Var.B(0);
                        d0Var.I(c0VarB, keyEvent);
                        boolean zH = d0Var.H(c0VarB, keyEvent.getKeyCode(), keyEvent);
                        c0VarB.f5862k = false;
                        if (zH) {
                        }
                    }
                    return false;
                }
                c0 c0Var2 = d0Var.f5876i0;
                if (c0Var2 != null) {
                    c0Var2.f5863l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f5995v.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f5995v.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f5995v.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f5995v.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f5995v.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f5995v.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f5997x) {
            this.f5995v.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof n.l)) {
            return this.f5995v.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        a9.g gVar = this.f5996w;
        if (gVar != null) {
            View view = i == 0 ? new View(((k0) gVar.f273w).f5936e.f9199a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f5995v.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f5995v.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f5995v.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        d0 d0Var = this.A;
        if (i == 108) {
            d0Var.C();
            com.bumptech.glide.f fVar = d0Var.J;
            if (fVar != null) {
                fVar.l(true);
            }
        } else {
            d0Var.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f5999z) {
            this.f5995v.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        d0 d0Var = this.A;
        if (i == 108) {
            d0Var.C();
            com.bumptech.glide.f fVar = d0Var.J;
            if (fVar != null) {
                fVar.l(false);
                return;
            }
            return;
        }
        if (i == 0) {
            c0 c0VarB = d0Var.B(i);
            if (c0VarB.f5864m) {
                d0Var.t(c0VarB, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        m.m.a(this.f5995v, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        n.l lVar = menu instanceof n.l ? (n.l) menu : null;
        if (i == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.f8915x = true;
        }
        a9.g gVar = this.f5996w;
        if (gVar != null && i == 0) {
            k0 k0Var = (k0) gVar.f273w;
            if (!k0Var.f5938h) {
                k0Var.f5936e.f9208l = true;
                k0Var.f5938h = true;
            }
        }
        boolean zOnPreparePanel = this.f5995v.onPreparePanel(i, view, menu);
        if (lVar != null) {
            lVar.f8915x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        n.l lVar = this.A.B(0).f5860h;
        if (lVar != null) {
            d(list, lVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return m.k.a(this.f5995v, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f5995v.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f5995v.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        d0 d0Var = this.A;
        if (!d0Var.U || i != 0) {
            return m.k.b(this.f5995v, callback, i);
        }
        Context context = d0Var.F;
        sb.p pVar = new sb.p(context, callback);
        m.a aVar = d0Var.P;
        if (aVar != null) {
            aVar.a();
        }
        sc.b bVar = new sc.b(15, d0Var, pVar);
        d0Var.C();
        com.bumptech.glide.f fVar = d0Var.J;
        if (fVar != null) {
            d0Var.P = fVar.R(bVar);
        }
        if (d0Var.P == null) {
            q0 q0Var = d0Var.T;
            if (q0Var != null) {
                q0Var.b();
            }
            m.a aVar2 = d0Var.P;
            if (aVar2 != null) {
                aVar2.a();
            }
            int i10 = 1;
            if (d0Var.Q == null) {
                if (d0Var.f5872e0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(g.a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        m.c cVar = new m.c(context, 0);
                        cVar.getTheme().setTo(themeNewTheme);
                        context = cVar;
                    }
                    d0Var.Q = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, g.a.actionModePopupWindowStyle);
                    d0Var.R = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    d0Var.R.setContentView(d0Var.Q);
                    d0Var.R.setWidth(-1);
                    context.getTheme().resolveAttribute(g.a.actionBarSize, typedValue, true);
                    d0Var.Q.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    d0Var.R.setHeight(-2);
                    d0Var.S = new r(d0Var, i10);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) d0Var.W.findViewById(g.f.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        d0Var.C();
                        com.bumptech.glide.f fVar2 = d0Var.J;
                        Context contextZ = fVar2 != null ? fVar2.z() : null;
                        if (contextZ != null) {
                            context = contextZ;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        d0Var.Q = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (d0Var.Q != null) {
                q0 q0Var2 = d0Var.T;
                if (q0Var2 != null) {
                    q0Var2.b();
                }
                d0Var.Q.e();
                Context context2 = d0Var.Q.getContext();
                ActionBarContextView actionBarContextView = d0Var.Q;
                m.d dVar = new m.d();
                dVar.f8371x = context2;
                dVar.f8372y = actionBarContextView;
                dVar.f8373z = bVar;
                n.l lVar = new n.l(actionBarContextView.getContext());
                lVar.f8903l = 1;
                dVar.C = lVar;
                lVar.f8898e = dVar;
                if (pVar.A(dVar, lVar)) {
                    dVar.g();
                    d0Var.Q.c(dVar);
                    d0Var.P = dVar;
                    if (d0Var.V && (viewGroup = d0Var.W) != null && viewGroup.isLaidOut()) {
                        d0Var.Q.setAlpha(0.0f);
                        q0 q0VarA = t0.m0.a(d0Var.Q);
                        q0VarA.a(1.0f);
                        d0Var.T = q0VarA;
                        q0VarA.d(new t(i10, d0Var));
                    } else {
                        d0Var.Q.setAlpha(1.0f);
                        d0Var.Q.setVisibility(0);
                        if (d0Var.Q.getParent() instanceof View) {
                            View view = (View) d0Var.Q.getParent();
                            WeakHashMap weakHashMap = t0.m0.f11853a;
                            t0.b0.c(view);
                        }
                    }
                    if (d0Var.R != null) {
                        d0Var.G.getDecorView().post(d0Var.S);
                    }
                } else {
                    d0Var.P = null;
                }
            }
            d0Var.K();
            d0Var.P = d0Var.P;
        }
        d0Var.K();
        m.a aVar3 = d0Var.P;
        if (aVar3 != null) {
            return pVar.n(aVar3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f5995v.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
