package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final g f915c = new g();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f916a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f917b = new HashMap();

    public static void b(HashMap hashMap, f fVar, w wVar, Class cls) {
        w wVar2 = (w) hashMap.get(fVar);
        if (wVar2 != null && wVar != wVar2) {
            throw new IllegalArgumentException("Method " + fVar.f913b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + wVar2 + ", new value " + wVar);
        }
        if (wVar2 == null) {
            hashMap.put(fVar, wVar);
        }
    }

    public final e a(Class cls, Method[] methodArr) {
        int i6;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f916a;
        if (superclass != null) {
            e eVar = (e) hashMap2.get(superclass);
            if (eVar == null) {
                eVar = a(superclass, null);
            }
            hashMap.putAll(eVar.f907b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            e eVar2 = (e) hashMap2.get(cls2);
            if (eVar2 == null) {
                eVar2 = a(cls2, null);
            }
            for (Map.Entry entry : eVar2.f907b.entrySet()) {
                b(hashMap, (f) entry.getKey(), (w) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            s0 s0Var = (s0) method.getAnnotation(s0.class);
            if (s0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (f0.class.isAssignableFrom(parameterTypes[0])) {
                        i6 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i6 = 0;
                }
                w value = s0Var.value();
                if (parameterTypes.length > 1) {
                    if (w.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == w.ON_ANY) {
                            i6 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new f(i6, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        e eVar3 = new e(hashMap);
        hashMap2.put(cls, eVar3);
        this.f917b.put(cls, Boolean.valueOf(z10));
        return eVar3;
    }
}
