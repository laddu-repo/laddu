package h;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import o.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f5927b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f5928c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f5929d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f5930e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f5931g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v.i f5932h = new v.i(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f5933a = new Object[2];

    public o.n a(Context context, AttributeSet attributeSet) {
        return new o.n(context, attributeSet, g.a.autoCompleteTextViewStyle);
    }

    public o.o b(Context context, AttributeSet attributeSet) {
        return new o.o(context, attributeSet, g.a.buttonStyle);
    }

    public o.p c(Context context, AttributeSet attributeSet) {
        return new o.p(context, attributeSet, g.a.checkboxStyle);
    }

    public o.z d(Context context, AttributeSet attributeSet) {
        return new o.z(context, attributeSet, g.a.radioButtonStyle);
    }

    public z0 e(Context context, AttributeSet attributeSet) {
        return new z0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        v.i iVar = f5932h;
        Constructor constructor = (Constructor) iVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f5927b);
            iVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f5933a);
    }
}
