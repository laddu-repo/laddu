package dg;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import u5.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final r f4143a;

    public a(r rVar) {
        this.f4143a = rVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, r.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f4143a, objArr);
        } catch (InvocationTargetException e10) {
            throw e10.getTargetException();
        } catch (ReflectiveOperationException e11) {
            throw new RuntimeException("Reflection failed for method " + method, e11);
        }
    }
}
