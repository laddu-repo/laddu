package cc;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements bc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2023b;

    public /* synthetic */ b(Object obj, int i6) {
        this.f2022a = i6;
        this.f2023b = obj;
    }

    @Override // bc.a
    public final Object get() {
        switch (this.f2022a) {
            case 0:
                return new dc.c((jb.g) this.f2023b);
            case 1:
                String str = (String) this.f2023b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(h8.c.m("Could not instantiate ", str, "."), e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException(h8.c.m("Could not instantiate ", str, "."), e11);
                } catch (NoSuchMethodException e12) {
                    throw new RuntimeException(r4.a.k("Could not instantiate ", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException(r4.a.k("Could not instantiate ", str), e13);
                }
            default:
                return (ComponentRegistrar) this.f2023b;
        }
    }
}
