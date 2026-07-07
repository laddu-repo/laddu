package pe;

import java.lang.reflect.Method;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f10755a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        k.b(methods);
        int length = methods.length;
        int i6 = 0;
        while (true) {
            method = null;
            Class<?> cls = null;
            if (i6 >= length) {
                break;
            }
            Method method2 = methods[i6];
            if (k.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                k.d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 1) {
                    cls = parameterTypes[0];
                }
                if (k.a(cls, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i6++;
        }
        f10755a = method;
        int length2 = methods.length;
        for (int i10 = 0; i10 < length2 && !k.a(methods[i10].getName(), "getSuppressed"); i10++) {
        }
    }
}
