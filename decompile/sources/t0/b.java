package t0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.playfy.tv.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f12322c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f12323a;

    /* renamed from: b, reason: collision with root package name */
    public final a f12324b;

    public b() {
        this(f12322c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f12323a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public a2.a2 b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f12323a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new a2.a2(accessibilityNodeProvider, 24);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f12323a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, u0.c cVar) {
        this.f12323a.onInitializeAccessibilityNodeInfo(view, cVar.f12745a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f12323a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f12323a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i6, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z10;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i10 >= list.size()) {
                break;
            }
            u0.b bVar = (u0.b) list.get(i10);
            if (bVar.a() == i6) {
                Class cls = bVar.f12742c;
                u0.m mVar = bVar.f12743d;
                if (mVar != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e10) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e10);
                        }
                    }
                    z10 = mVar.a(view);
                }
            } else {
                i10++;
            }
        }
        z10 = false;
        if (!z10) {
            z10 = this.f12323a.performAccessibilityAction(view, i6, bundle);
        }
        if (!z10 && i6 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                int i12 = 0;
                while (true) {
                    if (clickableSpanArr == null || i12 >= clickableSpanArr.length) {
                        break;
                    }
                    if (clickableSpan.equals(clickableSpanArr[i12])) {
                        clickableSpan.onClick(view);
                        z11 = true;
                        break;
                    }
                    i12++;
                }
            }
            return z11;
        }
        return z10;
    }

    public void h(View view, int i6) {
        this.f12323a.sendAccessibilityEvent(view, i6);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f12323a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f12323a = accessibilityDelegate;
        this.f12324b = new a(this);
    }
}
