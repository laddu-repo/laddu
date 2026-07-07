package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f920a;

    /* renamed from: b, reason: collision with root package name */
    public final m1 f921b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f922c;

    /* renamed from: d, reason: collision with root package name */
    public final y f923d;

    /* renamed from: e, reason: collision with root package name */
    public final e5.e f924e;

    public g1() {
        this.f921b = new m1(null);
    }

    @Override // androidx.lifecycle.n1
    public final k1 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.n1
    public final k1 b(kotlin.jvm.internal.e eVar, o1.e eVar2) {
        return c(cf.m.r(eVar), eVar2);
    }

    @Override // androidx.lifecycle.n1
    public final k1 c(Class cls, o1.e eVar) {
        Constructor a10;
        LinkedHashMap linkedHashMap = eVar.f9848a;
        String str = (String) linkedHashMap.get(o1.f978b);
        if (str != null) {
            if (linkedHashMap.get(d1.f902a) != null && linkedHashMap.get(d1.f903b) != null) {
                Application application = (Application) linkedHashMap.get(m1.f960e);
                boolean isAssignableFrom = a.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a10 = h1.a(cls, h1.f935a);
                } else {
                    a10 = h1.a(cls, h1.f936b);
                }
                if (a10 == null) {
                    return this.f921b.c(cls, eVar);
                }
                if (isAssignableFrom && application != null) {
                    return h1.b(cls, a10, application, d1.c(eVar));
                }
                return h1.b(cls, a10, d1.c(eVar));
            }
            if (this.f923d != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public final k1 d(String str, Class cls) {
        Constructor a10;
        a1 a1Var;
        k1 b10;
        y yVar = this.f923d;
        if (yVar != null) {
            boolean isAssignableFrom = a.class.isAssignableFrom(cls);
            Application application = this.f920a;
            if (isAssignableFrom && application != null) {
                a10 = h1.a(cls, h1.f935a);
            } else {
                a10 = h1.a(cls, h1.f936b);
            }
            if (a10 == null) {
                if (application != null) {
                    return this.f921b.a(cls);
                }
                if (c1.f894b == null) {
                    c1.f894b = new c1(1);
                }
                kotlin.jvm.internal.k.b(c1.f894b);
                return lg.c.g(cls);
            }
            e5.e eVar = this.f924e;
            kotlin.jvm.internal.k.b(eVar);
            Bundle a11 = eVar.a(str);
            if (a11 == null) {
                a11 = this.f922c;
            }
            if (a11 == null) {
                a1Var = new a1();
            } else {
                ClassLoader classLoader = a1.class.getClassLoader();
                kotlin.jvm.internal.k.b(classLoader);
                a11.setClassLoader(classLoader);
                a1Var = new a1(a8.i.s(a11));
            }
            b1 b1Var = new b1(str, a1Var);
            b1Var.a0(yVar, eVar);
            x b11 = yVar.b();
            if (b11 != x.f992y && b11.compareTo(x.A) < 0) {
                yVar.a(new n(yVar, eVar));
            } else {
                eVar.d();
            }
            if (isAssignableFrom && application != null) {
                b10 = h1.b(cls, a10, application, a1Var);
            } else {
                b10 = h1.b(cls, a10, a1Var);
            }
            b10.b("androidx.lifecycle.savedstate.vm.tag", b1Var);
            return b10;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public g1(Application application, e5.g gVar, Bundle bundle) {
        m1 m1Var;
        this.f924e = gVar.getSavedStateRegistry();
        this.f923d = gVar.getLifecycle();
        this.f922c = bundle;
        this.f920a = application;
        if (application != null) {
            if (m1.f959d == null) {
                m1.f959d = new m1(application);
            }
            m1Var = m1.f959d;
            kotlin.jvm.internal.k.b(m1Var);
        } else {
            m1Var = new m1(null);
        }
        this.f921b = m1Var;
    }
}
