package k6;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f7737a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f7738b = new LinkedHashMap();

    public static c a(Class cls) {
        LinkedHashMap linkedHashMap = f7737a;
        Object obj = linkedHashMap.get(cls);
        if (obj == null) {
            try {
                Method method = cls.getMethod("inflate", LayoutInflater.class, ViewGroup.class, Boolean.TYPE);
                k.d(method, "method");
                obj = new b(method);
            } catch (NoSuchMethodException unused) {
                k.d(cls.getMethod("inflate", LayoutInflater.class, ViewGroup.class), "method");
                obj = new Object();
            }
            linkedHashMap.put(cls, obj);
        }
        return (c) obj;
    }
}
