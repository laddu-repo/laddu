package b6;

import e6.i;
import java.util.ArrayList;
import java.util.Iterator;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1475a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Object f1476b;

    /* renamed from: c, reason: collision with root package name */
    public final c6.d f1477c;

    /* renamed from: d, reason: collision with root package name */
    public b f1478d;

    public c(c6.d dVar) {
        this.f1477c = dVar;
    }

    public abstract boolean a(i iVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        this.f1475a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (a(iVar)) {
                this.f1475a.add(iVar.f4371a);
            }
        }
        if (this.f1475a.isEmpty()) {
            this.f1477c.b(this);
        } else {
            c6.d dVar = this.f1477c;
            synchronized (dVar.f1972c) {
                try {
                    if (dVar.f1973d.add(this)) {
                        if (dVar.f1973d.size() == 1) {
                            dVar.f1974e = dVar.a();
                            o.f().b(c6.d.f1969f, String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f1974e), new Throwable[0]);
                            dVar.d();
                        }
                        Object obj = dVar.f1974e;
                        this.f1476b = obj;
                        d(this.f1478d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f1478d, this.f1476b);
    }

    public final void d(b bVar, Object obj) {
        if (!this.f1475a.isEmpty() && bVar != null) {
            if (obj != null && !b(obj)) {
                ArrayList arrayList = this.f1475a;
                a6.c cVar = (a6.c) bVar;
                synchronized (cVar.f586c) {
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj2 = arrayList.get(i6);
                            i6++;
                            String str = (String) obj2;
                            if (cVar.a(str)) {
                                o.f().b(a6.c.f583d, "Constraints met for " + str, new Throwable[0]);
                                arrayList2.add(str);
                            }
                        }
                        a6.b bVar2 = cVar.f584a;
                        if (bVar2 != null) {
                            bVar2.e(arrayList2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            ((a6.c) bVar).b(this.f1475a);
        }
    }
}
