package f;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import cf.n;
import d.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4600a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4601b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f4602c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4603d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f4604e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f4605f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f4606g = new Bundle();

    public final boolean a(int i6, int i10, Intent intent) {
        b bVar;
        String str = (String) this.f4600a.get(Integer.valueOf(i6));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.f4604e.get(str);
        if (eVar != null) {
            bVar = eVar.f4592a;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            ArrayList arrayList = this.f4603d;
            if (arrayList.contains(str)) {
                eVar.f4592a.g(eVar.f4593b.c(i10, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f4605f.remove(str);
        this.f4606g.putParcelable(str, new a(i10, intent));
        return true;
    }

    public abstract void b(int i6, g.a aVar, Object obj);

    public final g c(final String key, f0 f0Var, final g.a aVar, final b bVar) {
        k.e(key, "key");
        y lifecycle = f0Var.getLifecycle();
        if (lifecycle.b().compareTo(x.A) < 0) {
            e(key);
            LinkedHashMap linkedHashMap = this.f4602c;
            f fVar = (f) linkedHashMap.get(key);
            if (fVar == null) {
                fVar = new f(lifecycle);
            }
            d0 d0Var = new d0() { // from class: f.d
                @Override // androidx.lifecycle.d0
                public final void onStateChanged(f0 f0Var2, w wVar) {
                    h hVar = h.this;
                    LinkedHashMap linkedHashMap2 = hVar.f4604e;
                    w wVar2 = w.ON_START;
                    String str = key;
                    if (wVar2 == wVar) {
                        Bundle bundle = hVar.f4606g;
                        LinkedHashMap linkedHashMap3 = hVar.f4605f;
                        g.a aVar2 = aVar;
                        b bVar2 = bVar;
                        linkedHashMap2.put(str, new e(aVar2, bVar2));
                        if (linkedHashMap3.containsKey(str)) {
                            Object obj = linkedHashMap3.get(str);
                            linkedHashMap3.remove(str);
                            bVar2.g(obj);
                        }
                        a aVar3 = (a) jb.b.r(str, bundle);
                        if (aVar3 != null) {
                            bundle.remove(str);
                            bVar2.g(aVar2.c(aVar3.f4587x, aVar3.f4588y));
                            return;
                        }
                        return;
                    }
                    if (w.ON_STOP == wVar) {
                        linkedHashMap2.remove(str);
                    } else if (w.ON_DESTROY == wVar) {
                        hVar.f(str);
                    }
                }
            };
            fVar.f4594a.a(d0Var);
            fVar.f4595b.add(d0Var);
            linkedHashMap.put(key, fVar);
            return new g(this, key, aVar, 0);
        }
        throw new IllegalStateException(("LifecycleOwner " + f0Var + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    public final g d(String key, g.a aVar, b bVar) {
        k.e(key, "key");
        e(key);
        this.f4604e.put(key, new e(aVar, bVar));
        LinkedHashMap linkedHashMap = this.f4605f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            bVar.g(obj);
        }
        Bundle bundle = this.f4606g;
        a aVar2 = (a) jb.b.r(key, bundle);
        if (aVar2 != null) {
            bundle.remove(key);
            bVar.g(aVar.c(aVar2.f4587x, aVar2.f4588y));
        }
        return new g(this, key, aVar, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f4601b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        a0 a0Var = new a0(1);
        Iterator it = new cf.a(new cf.i(0, a0Var, new n(a0Var, 0))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f4600a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String key) {
        Integer num;
        k.e(key, "key");
        if (!this.f4603d.contains(key) && (num = (Integer) this.f4601b.remove(key)) != null) {
            this.f4600a.remove(num);
        }
        this.f4604e.remove(key);
        LinkedHashMap linkedHashMap = this.f4605f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder q9 = r4.a.q("Dropping pending result for request ", key, ": ");
            q9.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", q9.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f4606g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((a) jb.b.r(key, bundle)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f4602c;
        f fVar = (f) linkedHashMap2.get(key);
        if (fVar != null) {
            ArrayList arrayList = fVar.f4595b;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                fVar.f4594a.c((d0) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
