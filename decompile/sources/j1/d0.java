package j1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 implements LayoutInflater.Factory2 {

    /* renamed from: x, reason: collision with root package name */
    public final p0 f6899x;

    public d0(p0 p0Var) {
        this.f6899x = p0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        v0 g10;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        p0 p0Var = this.f6899x;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, p0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i1.a.f6274a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z10 = y.class.isAssignableFrom(i0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    y D = resourceId != -1 ? p0Var.D(resourceId) : null;
                    if (D == null && string != null) {
                        D = p0Var.E(string);
                    }
                    if (D == null && id2 != -1) {
                        D = p0Var.D(id2);
                    }
                    if (D == null) {
                        i0 I = p0Var.I();
                        context.getClassLoader();
                        D = I.a(attributeValue);
                        D.M = true;
                        D.W = resourceId != 0 ? resourceId : id2;
                        D.X = id2;
                        D.Y = string;
                        D.N = true;
                        D.S = p0Var;
                        a0 a0Var = p0Var.f6963w;
                        D.T = a0Var;
                        D.x(a0Var.B, attributeSet, D.f7042y);
                        g10 = p0Var.a(D);
                        if (p0.L(2)) {
                            Log.v("FragmentManager", "Fragment " + D + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!D.N) {
                        D.N = true;
                        D.S = p0Var;
                        a0 a0Var2 = p0Var.f6963w;
                        D.T = a0Var2;
                        D.x(a0Var2.B, attributeSet, D.f7042y);
                        g10 = p0Var.g(D);
                        if (p0.L(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + D + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    k1.b bVar = k1.c.f7583a;
                    k1.c.b(new k1.a(D, "Attempting to use <fragment> tag to add fragment " + D + " to container " + viewGroup));
                    k1.c.a(D).getClass();
                    D.f7023f0 = viewGroup;
                    g10.k();
                    g10.j();
                    View view2 = D.f7024g0;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (D.f7024g0.getTag() == null) {
                            D.f7024g0.setTag(string);
                        }
                        D.f7024g0.addOnAttachStateChangeListener(new c0(this, g10));
                        return D.f7024g0;
                    }
                    throw new IllegalStateException(h8.c.m("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
