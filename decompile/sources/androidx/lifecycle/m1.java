package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m1 extends c1 {

    /* renamed from: d, reason: collision with root package name */
    public static m1 f959d;

    /* renamed from: e, reason: collision with root package name */
    public static final ua.f f960e = new ua.f(4);

    /* renamed from: c, reason: collision with root package name */
    public final Application f961c;

    public m1(Application application) {
        super(1);
        this.f961c = application;
    }

    @Override // androidx.lifecycle.c1, androidx.lifecycle.n1
    public final k1 a(Class cls) {
        Application application = this.f961c;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.c1, androidx.lifecycle.n1
    public final k1 c(Class cls, o1.e eVar) {
        if (this.f961c != null) {
            return a(cls);
        }
        Application application = (Application) eVar.f9848a.get(f960e);
        if (application != null) {
            return d(cls, application);
        }
        if (!a.class.isAssignableFrom(cls)) {
            return lg.c.g(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    public final k1 d(Class cls, Application application) {
        if (a.class.isAssignableFrom(cls)) {
            try {
                k1 k1Var = (k1) cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.k.b(k1Var);
                return k1Var;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }
        return lg.c.g(cls);
    }
}
