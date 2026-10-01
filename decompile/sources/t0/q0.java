package t0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.playfy.tv.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f12397a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f12398b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f12399c = false;

    /* renamed from: d, reason: collision with root package name */
    public static ThreadLocal f12400d;

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f12401e = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f12402f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static final e0 f12403g = new e0();

    public static u0 a(View view) {
        if (f12397a == null) {
            f12397a = new WeakHashMap();
        }
        u0 u0Var = (u0) f12397a.get(view);
        if (u0Var == null) {
            u0 u0Var2 = new u0(view);
            f12397a.put(view, u0Var2);
            return u0Var2;
        }
        return u0Var;
    }

    public static w1 b(View view, w1 w1Var) {
        WindowInsets a10;
        int i6 = Build.VERSION.SDK_INT;
        WindowInsets g10 = w1Var.g();
        if (g10 != null) {
            if (i6 >= 30) {
                a10 = n0.a(view, g10);
            } else {
                a10 = f0.a(view, g10);
            }
            if (!a10.equals(g10)) {
                return w1.h(view, a10);
            }
        }
        return w1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, t0.p0] */
    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = p0.f12390d;
            p0 p0Var = (p0) view.getTag(R.id.tag_unhandled_key_event_manager);
            p0 p0Var2 = p0Var;
            if (p0Var == null) {
                ?? obj = new Object();
                obj.f12391a = null;
                obj.f12392b = null;
                obj.f12393c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                p0Var2 = obj;
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = p0Var2.f12391a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = p0.f12390d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (p0Var2.f12391a == null) {
                                p0Var2.f12391a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = p0.f12390d;
                                View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view2 == null) {
                                    arrayList3.remove(size);
                                } else {
                                    p0Var2.f12391a.put(view2, Boolean.TRUE);
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        p0Var2.f12391a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a10 = p0Var2.a(view);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (p0Var2.f12392b == null) {
                        p0Var2.f12392b = new SparseArray();
                    }
                    p0Var2.f12392b.put(keyCode, new WeakReference(a10));
                }
            }
            if (a10 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m0.a(view);
        }
        if (!f12399c) {
            if (f12398b == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    f12398b = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    f12399c = true;
                    return null;
                }
            }
            try {
                Object obj = f12398b.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
                return null;
            } catch (Throwable unused2) {
                f12399c = true;
                return null;
            }
        }
        return null;
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = l0.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static Rect g() {
        if (f12400d == null) {
            f12400d = new ThreadLocal();
        }
        Rect rect = (Rect) f12400d.get();
        if (rect == null) {
            rect = new Rect();
            f12400d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] h(p.v vVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return o0.a(vVar);
        }
        return (String[]) vVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static w1 i(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return i0.a(view);
        }
        return h0.e(view);
    }

    public static void j(View view, int i6) {
        boolean z10;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (e(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z10) {
                if (i6 == 32) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    obtain.setContentChangeTypes(i6);
                    obtain.setSource(view);
                    view.onPopulateAccessibilityEvent(obtain);
                    obtain.getText().add(e(view));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                    return;
                }
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i6);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            if (!z10) {
                i10 = 2048;
            }
            obtain2.setEventType(i10);
            obtain2.setContentChangeTypes(i6);
            if (z10) {
                obtain2.getText().add(e(view));
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
            }
            view.sendAccessibilityEventUnchecked(obtain2);
        }
    }

    public static void k(View view, int i6) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i6);
            return;
        }
        Rect g10 = g();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            g10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !g10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z10 = false;
        }
        view.offsetLeftAndRight(i6);
        if (view.getVisibility() == 0) {
            u(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                u((View) parent2);
            }
        }
        if (z10 && g10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(g10);
        }
    }

    public static void l(View view, int i6) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i6);
            return;
        }
        Rect g10 = g();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            g10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !g10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z10 = false;
        }
        view.offsetTopAndBottom(i6);
        if (view.getVisibility() == 0) {
            u(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                u((View) parent2);
            }
        }
        if (z10 && g10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(g10);
        }
    }

    public static w1 m(View view, w1 w1Var) {
        WindowInsets g10 = w1Var.g();
        if (g10 != null) {
            WindowInsets b10 = f0.b(view, g10);
            if (!b10.equals(g10)) {
                return w1.h(view, b10);
            }
        }
        return w1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g n(View view, g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o0.b(view, gVar);
        }
        w0.i iVar = (w0.i) view.getTag(R.id.tag_on_receive_content_listener);
        t tVar = f12402f;
        if (iVar != null) {
            g a10 = w0.i.a(view, gVar);
            if (a10 == null) {
                return null;
            }
            if (view instanceof t) {
                tVar = (t) view;
            }
            return tVar.a(a10);
        }
        if (view instanceof t) {
            tVar = (t) view;
        }
        return tVar.a(gVar);
    }

    public static void o(View view, int i6) {
        ArrayList f3 = f(view);
        for (int i10 = 0; i10 < f3.size(); i10++) {
            if (((u0.b) f3.get(i10)).a() == i6) {
                f3.remove(i10);
                return;
            }
        }
    }

    public static void p(View view, u0.b bVar, u0.m mVar) {
        b bVar2;
        u0.b bVar3 = new u0.b(null, bVar.f12741b, null, mVar, bVar.f12742c);
        View.AccessibilityDelegate d10 = d(view);
        if (d10 == null) {
            bVar2 = null;
        } else if (d10 instanceof a) {
            bVar2 = ((a) d10).f12313a;
        } else {
            bVar2 = new b(d10);
        }
        if (bVar2 == null) {
            bVar2 = new b();
        }
        r(view, bVar2);
        o(view, bVar3.a());
        f(view).add(bVar3);
        j(view, 0);
    }

    public static void q(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i6) {
        if (Build.VERSION.SDK_INT >= 29) {
            m0.b(view, context, iArr, attributeSet, typedArray, i6, 0);
        }
    }

    public static void r(View view, b bVar) {
        a aVar;
        if (bVar == null && (d(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f12324b;
        }
        view.setAccessibilityDelegate(aVar);
    }

    public static void s(View view, CharSequence charSequence) {
        boolean z10;
        new d0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        e0 e0Var = f12403g;
        if (charSequence != null) {
            WeakHashMap weakHashMap = e0Var.f12339x;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z10));
            view.addOnAttachStateChangeListener(e0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(e0Var);
                return;
            }
            return;
        }
        e0Var.f12339x.remove(view);
        view.removeOnAttachStateChangeListener(e0Var);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(e0Var);
    }

    public static void t(View view, ColorStateList colorStateList) {
        boolean z10;
        int i6 = Build.VERSION.SDK_INT;
        h0.i(view, colorStateList);
        if (i6 == 21) {
            Drawable background = view.getBackground();
            if (h0.c(view) == null && h0.d(view) == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (background != null && z10) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static void u(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
