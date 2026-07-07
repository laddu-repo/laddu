package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.playfy.tv.R;
import h8.c;
import i.j;
import i1.a;
import j1.i0;
import j1.p0;
import j1.v0;
import j1.y;
import java.util.ArrayList;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;
import t0.q0;
import t0.w1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public boolean A;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f877x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f878y;

    /* renamed from: z, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f879z;

    public FragmentContainerView(Context context) {
        super(context);
        this.f877x = new ArrayList();
        this.f878y = new ArrayList();
        this.A = true;
    }

    public final void a(View view) {
        if (this.f878y.contains(view)) {
            this.f877x.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i6, ViewGroup.LayoutParams layoutParams) {
        y yVar;
        k.e(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof y) {
            yVar = (y) tag;
        } else {
            yVar = null;
        }
        if (yVar != null) {
            super.addView(child, i6, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        w1 m9;
        k.e(insets, "insets");
        w1 h4 = w1.h(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f879z;
        if (onApplyWindowInsetsListener != null) {
            k.b(onApplyWindowInsetsListener);
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            k.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            m9 = w1.h(null, onApplyWindowInsets);
        } else {
            m9 = q0.m(this, h4);
        }
        k.d(m9, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!m9.f12417a.m()) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                q0.b(getChildAt(i6), m9);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        k.e(canvas, "canvas");
        if (this.A) {
            ArrayList arrayList = this.f877x;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j) {
        k.e(canvas, "canvas");
        k.e(child, "child");
        if (this.A) {
            ArrayList arrayList = this.f877x;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        k.e(view, "view");
        this.f878y.remove(view);
        if (this.f877x.remove(view)) {
            this.A = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends y> F getFragment() {
        j jVar;
        y yVar;
        p0 z10;
        View view = this;
        while (true) {
            jVar = null;
            if (view != null) {
                Object tag = view.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof y) {
                    yVar = (y) tag;
                } else {
                    yVar = null;
                }
                if (yVar != null) {
                    break;
                }
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            } else {
                yVar = null;
                break;
            }
        }
        if (yVar != null) {
            if (yVar.m()) {
                z10 = yVar.c();
            } else {
                throw new IllegalStateException("The Fragment " + yVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof j) {
                    jVar = (j) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (jVar != null) {
                z10 = jVar.z();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        }
        return (F) z10.D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        k.e(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View view = getChildAt(childCount);
                k.d(view, "view");
                a(view);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        k.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i6) {
        View view = getChildAt(i6);
        k.d(view, "view");
        a(view);
        super.removeViewAt(i6);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        k.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i6, int i10) {
        int i11 = i6 + i10;
        for (int i12 = i6; i12 < i11; i12++) {
            View view = getChildAt(i12);
            k.d(view, "view");
            a(view);
        }
        super.removeViews(i6, i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i6, int i10) {
        int i11 = i6 + i10;
        for (int i12 = i6; i12 < i11; i12++) {
            View view = getChildAt(i12);
            k.d(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i6, i10);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.A = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f879z = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        k.e(view, "view");
        if (view.getParent() == this) {
            this.f878y.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        k.e(context, "context");
        this.f877x = new ArrayList();
        this.f878y = new ArrayList();
        this.A = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f6275b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, p0 p0Var) {
        super(context, attrs);
        View view;
        k.e(context, "context");
        k.e(attrs, "attrs");
        this.f877x = new ArrayList();
        this.f878y = new ArrayList();
        this.A = true;
        String classAttribute = attrs.getClassAttribute();
        int i6 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, a.f6275b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        y D = p0Var.D(id2);
        if (classAttribute != null && D == null) {
            if (id2 == -1) {
                throw new IllegalStateException(c.m("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : HttpUrl.FRAGMENT_ENCODE_SET));
            }
            i0 I = p0Var.I();
            context.getClassLoader();
            y a10 = I.a(classAttribute);
            k.d(a10, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a10.W = id2;
            a10.X = id2;
            a10.Y = string;
            a10.S = p0Var;
            a10.T = p0Var.f6963w;
            a10.x(context, attrs, null);
            j1.a aVar = new j1.a(p0Var);
            aVar.f6869p = true;
            a10.f7023f0 = this;
            a10.O = true;
            aVar.g(getId(), a10, string, 1);
            if (!aVar.f6861g) {
                aVar.f6862h = false;
                aVar.f6871r.A(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        ArrayList k8 = p0Var.f6945c.k();
        int size = k8.size();
        while (i6 < size) {
            Object obj = k8.get(i6);
            i6++;
            v0 v0Var = (v0) obj;
            y yVar = v0Var.f6992c;
            if (yVar.X == getId() && (view = yVar.f7024g0) != null && view.getParent() == null) {
                yVar.f7023f0 = this;
                v0Var.b();
                v0Var.k();
            }
        }
    }
}
