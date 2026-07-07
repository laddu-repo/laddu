package qb;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f11153a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f11154b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f11155c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11156d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11157e;

    /* renamed from: f, reason: collision with root package name */
    public final d f11158f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f11159g;

    public b(String str, Set set, Set set2, int i6, int i10, d dVar, Set set3) {
        this.f11153a = str;
        this.f11154b = Collections.unmodifiableSet(set);
        this.f11155c = Collections.unmodifiableSet(set2);
        this.f11156d = i6;
        this.f11157e = i10;
        this.f11158f = dVar;
        this.f11159g = Collections.unmodifiableSet(set3);
    }

    public static a a(Class cls) {
        return new a(cls, new Class[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [qb.a, java.lang.Object] */
    public static a b(p pVar) {
        p[] pVarArr = new p[0];
        ?? obj = new Object();
        obj.f11146a = null;
        HashSet hashSet = new HashSet();
        obj.f11149d = hashSet;
        obj.f11150e = new HashSet();
        obj.f11147b = 0;
        obj.f11148c = 0;
        obj.f11151f = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            a8.c.d(pVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f11149d, pVarArr);
        return obj;
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            a8.c.d(cls2, "Null interface");
            hashSet.add(p.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new b2.d(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f11154b.toArray()) + ">{" + this.f11156d + ", type=" + this.f11157e + ", deps=" + Arrays.toString(this.f11155c.toArray()) + "}";
    }
}
