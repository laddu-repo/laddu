package v;

import com.google.android.gms.internal.measurement.s6;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends l implements Map {
    public s6 A;
    public b B;
    public d C;

    public e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        s6 s6Var = this.A;
        if (s6Var == null) {
            s6 s6Var2 = new s6(this, 2);
            this.A = s6Var2;
            return s6Var2;
        }
        return s6Var;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i6 = this.f13174z;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        if (i6 != this.f13174z) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.B;
        if (bVar == null) {
            b bVar2 = new b(this);
            this.B = bVar2;
            return bVar2;
        }
        return bVar;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f13174z);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.C;
        if (dVar == null) {
            d dVar2 = new d(this);
            this.C = dVar2;
            return dVar2;
        }
        return dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar) {
        super(0);
        int i6 = lVar.f13174z;
        b(this.f13174z + i6);
        if (this.f13174z != 0) {
            for (int i10 = 0; i10 < i6; i10++) {
                put(lVar.f(i10), lVar.i(i10));
            }
        } else if (i6 > 0) {
            ie.i.c0(0, 0, i6, lVar.f13172x, this.f13172x);
            ie.i.d0(0, 0, i6 << 1, lVar.f13173y, this.f13173y);
            this.f13174z = i6;
        }
    }
}
