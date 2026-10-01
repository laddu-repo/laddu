package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.i0;
import androidx.lifecycle.m;
import androidx.lifecycle.o0;
import androidx.lifecycle.q;
import androidx.lifecycle.s;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import de.i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import o.r;
import u4.b;
import u4.d;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f1417v;

    public Recreator(d dVar) {
        this.f1417v = dVar;
    }

    @Override // androidx.lifecycle.q
    public final void a(s sVar, m mVar) {
        if (mVar != m.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        sVar.f().f(this);
        d dVar = this.f1417v;
        Bundle bundleC = dVar.a().c("androidx.savedstate.Restarter");
        if (bundleC == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleC.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i = 0;
        while (i < size) {
            String str = stringArrayList.get(i);
            i++;
            String str2 = str;
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(b.class);
                i.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        i.d(objNewInstance, "{\n                constr…wInstance()\n            }");
                        if (!(dVar instanceof u0)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        t0 t0VarE = ((u0) dVar).e();
                        r rVarA = dVar.a();
                        t0VarE.getClass();
                        LinkedHashMap linkedHashMap = t0VarE.f1235a;
                        for (String str3 : new HashSet(linkedHashMap.keySet())) {
                            i.e(str3, "key");
                            o0 o0Var = (o0) linkedHashMap.get(str3);
                            i.b(o0Var);
                            i0.a(o0Var, rVarA, dVar.f());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            rVarA.g();
                        }
                    } catch (Exception e7) {
                        throw new RuntimeException(d0.d.k("Failed to instantiate ", str2), e7);
                    }
                } catch (NoSuchMethodException e10) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                }
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException(d0.d.l("Class ", str2, " wasn't found"), e11);
            }
        }
    }
}
