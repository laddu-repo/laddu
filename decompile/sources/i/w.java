package i;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
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
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import t0.q0;
import t0.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w implements Window.Callback {
    public boolean A;
    public final /* synthetic */ b0 B;

    /* renamed from: x, reason: collision with root package name */
    public final Window.Callback f6262x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6263y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6264z;

    public w(b0 b0Var, Window.Callback callback) {
        this.B = b0Var;
        if (callback != null) {
            this.f6262x = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f6263y = true;
            callback.onContentChanged();
        } finally {
            this.f6263y = false;
        }
    }

    public final boolean b(int i6, Menu menu) {
        return this.f6262x.onMenuOpened(i6, menu);
    }

    public final void c(int i6, Menu menu) {
        this.f6262x.onPanelClosed(i6, menu);
    }

    public final void d(List list, Menu menu, int i6) {
        n.l.a(this.f6262x, list, menu, i6);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f6262x.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f6264z;
        Window.Callback callback = this.f6262x;
        if (z10) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.B.s(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f6262x
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            i.b0 r2 = r6.B
            r2.z()
            i.m0 r3 = r2.L
            r4 = 0
            if (r3 == 0) goto L3d
            i.l0 r3 = r3.j
            if (r3 != 0) goto L1d
        L1b:
            r0 = 0
            goto L39
        L1d:
            o.l r3 = r3.A
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = 1
            goto L32
        L31:
            r5 = 0
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = 1
            goto L6b
        L3d:
            i.a0 r0 = r2.f6140k0
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.E(r0, r3, r7)
            if (r0 == 0) goto L52
            i.a0 r7 = r2.f6140k0
            if (r7 == 0) goto L3b
            r7.f6123l = r1
            goto L3b
        L52:
            i.a0 r0 = r2.f6140k0
            if (r0 != 0) goto L6a
            i.a0 r0 = r2.y(r4)
            r2.F(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.E(r0, r3, r7)
            r0.f6122k = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = 0
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            return r4
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.w.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f6262x.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f6262x.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f6262x.dispatchTrackballEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ic.s] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, j4.b0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [n.a, n.d, java.lang.Object, o.j] */
    public final n.e e(ActionMode.Callback callback) {
        ViewGroup viewGroup;
        Context context;
        b0 b0Var = this.B;
        Context context2 = b0Var.H;
        ?? obj = new Object();
        obj.f6782y = context2;
        obj.f6781x = callback;
        obj.f6783z = new ArrayList();
        obj.A = new v.l(0);
        n.a aVar = b0Var.R;
        if (aVar != null) {
            aVar.a();
        }
        ?? obj2 = new Object();
        obj2.f7159y = b0Var;
        obj2.f7158x = obj;
        b0Var.z();
        m0 m0Var = b0Var.L;
        if (m0Var != null) {
            l0 l0Var = m0Var.j;
            if (l0Var != null) {
                l0Var.a();
            }
            m0Var.f6230d.setHideOnContentScrollEnabled(false);
            m0Var.f6233g.e();
            l0 l0Var2 = new l0(m0Var, m0Var.f6233g.getContext(), obj2);
            o.l lVar = l0Var2.A;
            lVar.w();
            try {
                if (((ic.s) l0Var2.B.f7158x).x(l0Var2, lVar)) {
                    m0Var.j = l0Var2;
                    l0Var2.g();
                    m0Var.f6233g.c(l0Var2);
                    m0Var.t(true);
                } else {
                    l0Var2 = null;
                }
                b0Var.R = l0Var2;
            } finally {
                lVar.v();
            }
        }
        if (b0Var.R == null) {
            u0 u0Var = b0Var.V;
            if (u0Var != null) {
                u0Var.b();
            }
            n.a aVar2 = b0Var.R;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (b0Var.S == null) {
                if (b0Var.f6136g0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        n.c cVar = new n.c(context2, 0);
                        cVar.getTheme().setTo(newTheme);
                        context2 = cVar;
                    }
                    b0Var.S = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    b0Var.T = popupWindow;
                    bf.y.v(popupWindow, 2);
                    b0Var.T.setContentView(b0Var.S);
                    b0Var.T.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    b0Var.S.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    b0Var.T.setHeight(-2);
                    b0Var.U = new r(b0Var, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) b0Var.Y.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        b0Var.z();
                        m0 m0Var2 = b0Var.L;
                        if (m0Var2 != null) {
                            context = m0Var2.u();
                        } else {
                            context = null;
                        }
                        if (context != null) {
                            context2 = context;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        b0Var.S = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (b0Var.S != null) {
                u0 u0Var2 = b0Var.V;
                if (u0Var2 != null) {
                    u0Var2.b();
                }
                b0Var.S.e();
                Context context3 = b0Var.S.getContext();
                ActionBarContextView actionBarContextView = b0Var.S;
                ?? obj3 = new Object();
                obj3.f8898z = context3;
                obj3.A = actionBarContextView;
                obj3.B = obj2;
                o.l lVar2 = new o.l(actionBarContextView.getContext());
                lVar2.f9786l = 1;
                obj3.E = lVar2;
                lVar2.f9780e = obj3;
                if (((ic.s) obj2.f7158x).x(obj3, lVar2)) {
                    obj3.g();
                    b0Var.S.c(obj3);
                    b0Var.R = obj3;
                    if (b0Var.X && (viewGroup = b0Var.Y) != null && viewGroup.isLaidOut()) {
                        b0Var.S.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        u0 a10 = q0.a(b0Var.S);
                        a10.a(1.0f);
                        b0Var.V = a10;
                        a10.d(new s(b0Var, 1));
                    } else {
                        b0Var.S.setAlpha(1.0f);
                        b0Var.S.setVisibility(0);
                        if (b0Var.S.getParent() instanceof View) {
                            View view = (View) b0Var.S.getParent();
                            WeakHashMap weakHashMap = q0.f12397a;
                            t0.f0.c(view);
                        }
                    }
                    if (b0Var.T != null) {
                        b0Var.I.getDecorView().post(b0Var.U);
                    }
                } else {
                    b0Var.R = null;
                }
            }
            b0Var.I();
            b0Var.R = b0Var.R;
        }
        b0Var.I();
        n.a aVar3 = b0Var.R;
        if (aVar3 == null) {
            return null;
        }
        return obj.f(aVar3);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f6262x.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f6262x.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f6262x.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f6263y) {
            this.f6262x.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i6, Menu menu) {
        if (i6 == 0 && !(menu instanceof o.l)) {
            return false;
        }
        return this.f6262x.onCreatePanelMenu(i6, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i6) {
        return this.f6262x.onCreatePanelView(i6);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f6262x.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        return this.f6262x.onMenuItemSelected(i6, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i6, Menu menu) {
        b(i6, menu);
        if (i6 == 108) {
            b0 b0Var = this.B;
            b0Var.z();
            m0 m0Var = b0Var.L;
            if (m0Var != null) {
                ArrayList arrayList = m0Var.f6239n;
                if (true != m0Var.f6238m) {
                    m0Var.f6238m = true;
                    if (arrayList.size() > 0) {
                        throw h8.c.h(0, arrayList);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i6, Menu menu) {
        if (this.A) {
            this.f6262x.onPanelClosed(i6, menu);
            return;
        }
        c(i6, menu);
        b0 b0Var = this.B;
        if (i6 == 108) {
            b0Var.z();
            m0 m0Var = b0Var.L;
            if (m0Var != null) {
                ArrayList arrayList = m0Var.f6239n;
                if (m0Var.f6238m) {
                    m0Var.f6238m = false;
                    if (arrayList.size() > 0) {
                        throw h8.c.h(0, arrayList);
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i6 == 0) {
            a0 y9 = b0Var.y(i6);
            if (y9.f6124m) {
                b0Var.q(y9, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z10) {
        n.m.a(this.f6262x, z10);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i6, View view, Menu menu) {
        o.l lVar;
        if (menu instanceof o.l) {
            lVar = (o.l) menu;
        } else {
            lVar = null;
        }
        if (i6 == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.f9797x = true;
        }
        boolean onPreparePanel = this.f6262x.onPreparePanel(i6, view, menu);
        if (lVar != null) {
            lVar.f9797x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i6) {
        o.l lVar = this.B.y(0).f6120h;
        if (lVar != null) {
            d(list, lVar, i6);
        } else {
            d(list, menu, i6);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return n.k.a(this.f6262x, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f6262x.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        this.f6262x.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.B.W) {
            return e(callback);
        }
        return this.f6262x.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f6262x.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i6) {
        if (this.B.W && i6 == 0) {
            return e(callback);
        }
        return n.k.b(this.f6262x, callback, i6);
    }
}
