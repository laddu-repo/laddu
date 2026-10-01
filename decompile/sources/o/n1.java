package o;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f9239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f9240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f9241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f9242d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f9239a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f9240b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f9241c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f9242d = true;
        } catch (NoSuchMethodException e7) {
            e7.printStackTrace();
        }
    }
}
