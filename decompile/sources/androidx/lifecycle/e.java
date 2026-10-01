package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f906a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f907b;

    public e(HashMap hashMap) {
        this.f907b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            w wVar = (w) entry.getValue();
            List list = (List) this.f906a.get(wVar);
            if (list == null) {
                list = new ArrayList();
                this.f906a.put(wVar, list);
            }
            list.add((f) entry.getKey());
        }
    }

    public static void a(List list, f0 f0Var, w wVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                f fVar = (f) list.get(size);
                Method method = fVar.f913b;
                try {
                    int i6 = fVar.f912a;
                    if (i6 != 0) {
                        if (i6 != 1) {
                            if (i6 == 2) {
                                method.invoke(obj, f0Var, wVar);
                            }
                        } else {
                            method.invoke(obj, f0Var);
                        }
                    } else {
                        method.invoke(obj, null);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}
