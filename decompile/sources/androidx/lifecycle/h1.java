package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f935a = ie.k.t(Application.class, a1.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f936b = a8.g.m(a1.class);

    public static final Constructor a(Class cls, List signature) {
        kotlin.jvm.internal.k.e(signature, "signature");
        he.p e10 = kotlin.jvm.internal.z.e(cls.getConstructors());
        while (e10.hasNext()) {
            Constructor constructor = (Constructor) e10.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.k.d(parameterTypes, "getParameterTypes(...)");
            List q02 = ie.i.q0(parameterTypes);
            if (signature.equals(q02)) {
                return constructor;
            }
            if (signature.size() == q02.size() && q02.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final k1 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (k1) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
