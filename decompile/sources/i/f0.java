package i;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import p.b1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f6201b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f6202c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f6203d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f6204e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f6205f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f6206g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final v.l f6207h = new v.l(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f6208a = new Object[2];

    public p.o a(Context context, AttributeSet attributeSet) {
        return new p.o(context, attributeSet);
    }

    public p.p b(Context context, AttributeSet attributeSet) {
        return new p.p(context, attributeSet, com.playfy.tv.R.attr.buttonStyle);
    }

    public p.q c(Context context, AttributeSet attributeSet) {
        return new p.q(context, attributeSet, com.playfy.tv.R.attr.checkboxStyle);
    }

    public p.c0 d(Context context, AttributeSet attributeSet) {
        return new p.c0(context, attributeSet);
    }

    public b1 e(Context context, AttributeSet attributeSet) {
        return new b1(context, attributeSet);
    }

    public final View f(String str, String str2, Context context) {
        String concat;
        v.l lVar = f6207h;
        Constructor constructor = (Constructor) lVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f6201b);
            lVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f6208a);
    }
}
