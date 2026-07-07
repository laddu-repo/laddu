package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f946a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f947b = new HashMap();

    public static void a(Constructor constructor, e0 e0Var) {
        try {
            kotlin.jvm.internal.k.b(constructor.newInstance(e0Var));
            throw new ClassCastException();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor constructor;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        HashMap hashMap = f946a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i6 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r42 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r42 != null) {
                    str = r42.getName();
                } else {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                kotlin.jvm.internal.k.b(str);
                if (str.length() != 0) {
                    kotlin.jvm.internal.k.b(canonicalName);
                    canonicalName = canonicalName.substring(str.length() + 1);
                    kotlin.jvm.internal.k.d(canonicalName, "substring(...)");
                }
                kotlin.jvm.internal.k.b(canonicalName);
                String concat = df.u.F(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (str.length() != 0) {
                    concat = str + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap hashMap2 = f947b;
            if (constructor != null) {
                hashMap2.put(cls, a8.g.m(constructor));
            } else {
                g gVar = g.f915c;
                HashMap hashMap3 = gVar.f917b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                if (((s0) declaredMethods[i10].getAnnotation(s0.class)) != null) {
                                    gVar.a(cls, declaredMethods);
                                    z10 = true;
                                    break;
                                }
                                i10++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z10 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!z10) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && e0.class.isAssignableFrom(superclass)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        kotlin.jvm.internal.k.b(superclass);
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            kotlin.jvm.internal.k.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    he.p e12 = kotlin.jvm.internal.z.e(cls.getInterfaces());
                    while (true) {
                        if (e12.hasNext()) {
                            Class cls2 = (Class) e12.next();
                            if (cls2 != null && e0.class.isAssignableFrom(cls2)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                kotlin.jvm.internal.k.b(cls2);
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                kotlin.jvm.internal.k.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i6 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i6));
        return i6;
    }
}
