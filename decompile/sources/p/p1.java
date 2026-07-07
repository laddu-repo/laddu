package p;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f10341a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f10342b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f10343c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f10344d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f10341a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f10342b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f10343c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f10344d = true;
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
        }
    }
}
