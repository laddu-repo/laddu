package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final q0 f1017v;

    public f0(q0 q0Var) {
        this.f1017v = q0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        x0 x0VarF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        q0 q0Var = this.f1017v;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, q0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m1.c.Fragment);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(m1.c.Fragment_android_name);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(m1.c.Fragment_android_id, -1);
            String string = typedArrayObtainStyledAttributes.getString(m1.c.Fragment_android_tag);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = y.class.isAssignableFrom(k0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    y yVarB = resourceId != -1 ? q0Var.B(resourceId) : null;
                    if (yVarB == null && string != null) {
                        yVarB = q0Var.C(string);
                    }
                    if (yVarB == null && id2 != -1) {
                        yVarB = q0Var.B(id2);
                    }
                    if (yVarB == null) {
                        k0 k0VarF = q0Var.F();
                        context.getClassLoader();
                        yVarB = k0VarF.a(attributeValue);
                        yVarB.I = true;
                        yVarB.R = resourceId != 0 ? resourceId : id2;
                        yVarB.S = id2;
                        yVarB.T = string;
                        yVarB.J = true;
                        yVarB.N = q0Var;
                        c0 c0Var = q0Var.f1085t;
                        yVarB.O = c0Var;
                        h.j jVar = c0Var.f988y;
                        yVarB.Z = true;
                        if ((c0Var != null ? c0Var.f987x : null) != null) {
                            yVarB.Z = true;
                        }
                        x0VarF = q0Var.a(yVarB);
                        if (q0.I(2)) {
                            Log.v("FragmentManager", "Fragment " + yVarB + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (yVarB.J) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        yVarB.J = true;
                        yVarB.N = q0Var;
                        c0 c0Var2 = q0Var.f1085t;
                        yVarB.O = c0Var2;
                        h.j jVar2 = c0Var2.f988y;
                        yVarB.Z = true;
                        if ((c0Var2 != null ? c0Var2.f987x : null) != null) {
                            yVarB.Z = true;
                        }
                        x0VarF = q0Var.f(yVarB);
                        if (q0.I(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + yVarB + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    n1.b bVar = n1.c.f8966a;
                    n1.c.b(new n1.a(yVarB, "Attempting to use <fragment> tag to add fragment " + yVarB + " to container " + viewGroup));
                    n1.c.a(yVarB).getClass();
                    yVarB.f1134a0 = viewGroup;
                    x0VarF.k();
                    x0VarF.j();
                    View view2 = yVarB.f1135b0;
                    if (view2 == null) {
                        throw new IllegalStateException(d0.d.l("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (yVarB.f1135b0.getTag() == null) {
                        yVarB.f1135b0.setTag(string);
                    }
                    yVarB.f1135b0.addOnAttachStateChangeListener(new e0(this, x0VarF));
                    return yVarB.f1135b0;
                }
            }
        }
        return null;
    }
}
