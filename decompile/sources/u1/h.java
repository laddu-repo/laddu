package u1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements Iterable {

    /* renamed from: x, reason: collision with root package name */
    public final Object f12773x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f12774y = new HashMap();

    /* renamed from: z, reason: collision with root package name */
    public Set f12775z = Collections.EMPTY_SET;
    public List A = Collections.EMPTY_LIST;

    public final int a(f2.l lVar) {
        int i6;
        synchronized (this.f12773x) {
            try {
                if (this.f12774y.containsKey(lVar)) {
                    i6 = ((Integer) this.f12774y.get(lVar)).intValue();
                } else {
                    i6 = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i6;
    }

    public final void b(f2.l lVar) {
        synchronized (this.f12773x) {
            try {
                Integer num = (Integer) this.f12774y.get(lVar);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.A);
                arrayList.remove(lVar);
                this.A = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f12774y.remove(lVar);
                    HashSet hashSet = new HashSet(this.f12775z);
                    hashSet.remove(lVar);
                    this.f12775z = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f12774y.put(lVar, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f12773x) {
            it = this.A.iterator();
        }
        return it;
    }
}
