package androidx.lifecycle;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f882a;

    /* renamed from: b, reason: collision with root package name */
    public final b4.h f883b;

    public a1(je.f fVar) {
        this.f882a = new LinkedHashMap();
        this.f883b = new b4.h(fVar);
    }

    public final boolean a(String str) {
        b4.h hVar = this.f883b;
        hVar.getClass();
        return ((LinkedHashMap) hVar.f1471z).containsKey(str);
    }

    public final Object b(String str) {
        Object value;
        b4.h hVar = this.f883b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) hVar.f1471z;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) hVar.f1469x;
        try {
            kf.r0 r0Var = (kf.r0) linkedHashMap2.get(str);
            if (r0Var != null && (value = ((kf.f1) r0Var).getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) hVar.B).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final void c(String str, Boolean bool) {
        q0 q0Var;
        ArrayList arrayList = n1.a.f8944a;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                if (((Class) obj).isInstance(bool)) {
                    Object obj2 = this.f882a.get(str);
                    if (obj2 instanceof q0) {
                        q0Var = (q0) obj2;
                    } else {
                        q0Var = null;
                    }
                    if (q0Var != null) {
                        q0Var.h(bool);
                    }
                    this.f883b.m(bool, str);
                    return;
                }
            }
        }
        throw new IllegalArgumentException(("Can't put value with type " + bool.getClass() + " into saved state").toString());
    }

    public a1() {
        this.f882a = new LinkedHashMap();
        this.f883b = new b4.h(ie.s.f6847x);
    }
}
