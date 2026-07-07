package qb;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements c {
    public static final ic.j E = new ic.j(2);
    public final HashSet A;
    public final j B;
    public final AtomicReference C;
    public final p.l D;

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f11160x;

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f11161y;

    /* renamed from: z, reason: collision with root package name */
    public final HashMap f11162z;

    public e(ArrayList arrayList, ArrayList arrayList2, p.l lVar) {
        rb.k kVar = rb.k.f11948x;
        this.f11160x = new HashMap();
        this.f11161y = new HashMap();
        this.f11162z = new HashMap();
        this.A = new HashSet();
        this.C = new AtomicReference();
        j jVar = new j();
        this.B = jVar;
        this.D = lVar;
        ArrayList arrayList3 = new ArrayList();
        int i6 = 0;
        arrayList3.add(b.c(jVar, j.class, yb.c.class, yb.b.class));
        arrayList3.add(b.c(this, e.class, new Class[0]));
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            b bVar = (b) obj;
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((bc.a) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.D.r(componentRegistrar));
                        it.remove();
                    }
                } catch (k e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((b) it2.next()).f11154b.toArray();
                int length = array.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length) {
                        Object obj3 = array[i12];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.A.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.A.add(obj3.toString());
                        }
                        i12++;
                    }
                }
            }
            if (this.f11160x.isEmpty()) {
                a8.b.d(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f11160x.keySet());
                arrayList6.addAll(arrayList3);
                a8.b.d(arrayList6);
            }
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                b bVar2 = (b) obj4;
                this.f11160x.put(bVar2, new l(new jb.c(1, this, bVar2)));
            }
            arrayList5.addAll(h(arrayList3));
            arrayList5.addAll(i());
            g();
        }
        int size4 = arrayList5.size();
        while (i6 < size4) {
            Object obj5 = arrayList5.get(i6);
            i6++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.C.get();
        if (bool != null) {
            f(this.f11160x, bool.booleanValue());
        }
    }

    @Override // qb.c
    public final Object a(Class cls) {
        return d(p.a(cls));
    }

    @Override // qb.c
    public final Set b(p pVar) {
        bc.a aVar;
        synchronized (this) {
            aVar = (m) this.f11162z.get(pVar);
            if (aVar == null) {
                aVar = E;
            }
        }
        return (Set) aVar.get();
    }

    @Override // qb.c
    public final bc.a c(Class cls) {
        return e(p.a(cls));
    }

    @Override // qb.c
    public final Object d(p pVar) {
        bc.a e10 = e(pVar);
        if (e10 == null) {
            return null;
        }
        return e10.get();
    }

    @Override // qb.c
    public final synchronized bc.a e(p pVar) {
        a8.c.d(pVar, "Null interface requested.");
        return (bc.a) this.f11161y.get(pVar);
    }

    public final void f(HashMap hashMap, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            b bVar = (b) entry.getKey();
            bc.a aVar = (bc.a) entry.getValue();
            int i6 = bVar.f11156d;
            if (i6 == 1 || (i6 == 2 && z10)) {
                aVar.get();
            }
        }
        j jVar = this.B;
        synchronized (jVar) {
            try {
                arrayDeque = jVar.f11172b;
                if (arrayDeque != null) {
                    jVar.f11172b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw r4.a.i(it);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [qb.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [qb.m, java.lang.Object] */
    public final void g() {
        for (b bVar : this.f11160x.keySet()) {
            for (h hVar : bVar.f11155c) {
                if (hVar.f11169b == 2 && !this.f11162z.containsKey(hVar.f11168a)) {
                    HashMap hashMap = this.f11162z;
                    p pVar = hVar.f11168a;
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f11178b = null;
                    obj.f11177a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f11177a.addAll(set);
                    hashMap.put(pVar, obj);
                } else if (this.f11161y.containsKey(hVar.f11168a)) {
                    continue;
                } else {
                    int i6 = hVar.f11169b;
                    if (i6 != 1) {
                        if (i6 != 2) {
                            HashMap hashMap2 = this.f11161y;
                            p pVar2 = hVar.f11168a;
                            o5.p pVar3 = n.f11179c;
                            ic.j jVar = n.f11180d;
                            ?? obj2 = new Object();
                            obj2.f11181a = pVar3;
                            obj2.f11182b = jVar;
                            hashMap2.put(pVar2, obj2);
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + bVar + ": " + hVar.f11168a);
                    }
                }
            }
        }
    }

    public final ArrayList h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            b bVar = (b) obj;
            if (bVar.f11157e == 0) {
                bc.a aVar = (bc.a) this.f11160x.get(bVar);
                for (p pVar : bVar.f11154b) {
                    HashMap hashMap = this.f11161y;
                    if (!hashMap.containsKey(pVar)) {
                        hashMap.put(pVar, aVar);
                    } else {
                        arrayList2.add(new m8.c(3, (n) ((bc.a) hashMap.get(pVar)), aVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [qb.m, java.lang.Object] */
    public final ArrayList i() {
        HashMap hashMap = this.f11162z;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f11160x.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f11157e != 0) {
                bc.a aVar = (bc.a) entry.getValue();
                for (p pVar : bVar.f11154b) {
                    if (!hashMap2.containsKey(pVar)) {
                        hashMap2.put(pVar, new HashSet());
                    }
                    ((Set) hashMap2.get(pVar)).add(aVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(entry2.getKey())) {
                p pVar2 = (p) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                ?? obj = new Object();
                obj.f11178b = null;
                obj.f11177a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f11177a.addAll(set);
                hashMap.put(pVar2, obj);
            } else {
                m mVar = (m) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new m8.c(4, mVar, (bc.a) it.next()));
                }
            }
        }
        return arrayList;
    }
}
