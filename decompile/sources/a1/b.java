package a1;

import a2.a2;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t0.q0;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b extends t0.b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f116n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final ua.f f117o;

    /* renamed from: p, reason: collision with root package name */
    public static final l f118p;

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f123h;

    /* renamed from: i, reason: collision with root package name */
    public final Chip f124i;
    public a j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f119d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f120e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f121f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f122g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f125k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f126l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f127m = Integer.MIN_VALUE;

    static {
        int i6 = 1;
        f117o = new ua.f(i6);
        f118p = new l(i6);
    }

    public b(Chip chip) {
        this.f124i = chip;
        this.f123h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = q0.f12397a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // t0.b
    public final a2 b(View view) {
        if (this.j == null) {
            this.j = new a(this);
        }
        return this.j;
    }

    @Override // t0.b
    public final void d(View view, u0.c cVar) {
        boolean z10;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f12745a;
        this.f12323a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((ea.d) this).f4508q;
        ea.f fVar = chip.B;
        if (fVar != null && fVar.f4540x0) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        cVar.i(chip.getAccessibilityClassName());
        CharSequence text = chip.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            cVar.l(text);
        } else {
            accessibilityNodeInfo.setContentDescription(text);
        }
    }

    public final boolean j(int i6) {
        if (this.f126l != i6) {
            return false;
        }
        this.f126l = Integer.MIN_VALUE;
        p(i6, false);
        r(i6, 8);
        return true;
    }

    public final u0.c k(int i6) {
        boolean z10;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        u0.c cVar = new u0.c(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        cVar.i("android.view.View");
        Rect rect = f116n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.f124i;
        obtain.setParent(chip);
        o(i6, cVar);
        if (cVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f120e;
        cVar.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(chip.getContext().getPackageName());
                    cVar.f12746b = i6;
                    obtain.setSource(chip, i6);
                    if (this.f125k == i6) {
                        obtain.setAccessibilityFocused(true);
                        cVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        cVar.a(64);
                    }
                    if (this.f126l == i6) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        cVar.a(2);
                    } else if (obtain.isFocusable()) {
                        cVar.a(1);
                    }
                    obtain.setFocused(z10);
                    int[] iArr = this.f122g;
                    chip.getLocationOnScreen(iArr);
                    Rect rect3 = this.f119d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        cVar.f(rect3);
                        rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                    }
                    Rect rect4 = this.f121f;
                    if (chip.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                        if (rect3.intersect(rect4)) {
                            obtain.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                                Object parent = chip.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view = (View) parent;
                                        if (view.getAlpha() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || view.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view.getParent();
                                    } else if (parent != null) {
                                        cVar.f12745a.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return cVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.b.m(int, android.graphics.Rect):boolean");
    }

    public final u0.c n(int i6) {
        if (i6 == -1) {
            Chip chip = this.f124i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
            u0.c cVar = new u0.c(obtain);
            WeakHashMap weakHashMap = q0.f12397a;
            chip.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                cVar.f12745a.addChild(chip, ((Integer) arrayList.get(i10)).intValue());
            }
            return cVar;
        }
        return k(i6);
    }

    public abstract void o(int i6, u0.c cVar);

    public abstract void p(int i6, boolean z10);

    public final boolean q(int i6) {
        int i10;
        Chip chip = this.f124i;
        if ((chip.isFocused() || chip.requestFocus()) && (i10 = this.f126l) != i6) {
            if (i10 != Integer.MIN_VALUE) {
                j(i10);
            }
            if (i6 == Integer.MIN_VALUE) {
                return false;
            }
            this.f126l = i6;
            p(i6, true);
            r(i6, 8);
            return true;
        }
        return false;
    }

    public final void r(int i6, int i10) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i6 != Integer.MIN_VALUE && this.f123h.isEnabled() && (parent = (view = this.f124i).getParent()) != null) {
            if (i6 != -1) {
                obtain = AccessibilityEvent.obtain(i10);
                u0.c n10 = n(i6);
                obtain.getText().add(n10.g());
                AccessibilityNodeInfo accessibilityNodeInfo = n10.f12745a;
                obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
                obtain.setScrollable(accessibilityNodeInfo.isScrollable());
                obtain.setPassword(accessibilityNodeInfo.isPassword());
                obtain.setEnabled(accessibilityNodeInfo.isEnabled());
                obtain.setChecked(accessibilityNodeInfo.isChecked());
                if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
                obtain.setClassName(accessibilityNodeInfo.getClassName());
                obtain.setSource(view, i6);
                obtain.setPackageName(view.getContext().getPackageName());
            } else {
                obtain = AccessibilityEvent.obtain(i10);
                view.onInitializeAccessibilityEvent(obtain);
            }
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }
}
