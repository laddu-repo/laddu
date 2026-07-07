package db;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t extends AbstractSet {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4043x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ v f4044y;

    public /* synthetic */ t(v vVar, int i6) {
        this.f4043x = i6;
        this.f4044y = vVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f4043x) {
            case 0:
                this.f4044y.clear();
                return;
            default:
                this.f4044y.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f4043x) {
            case 0:
                v vVar = this.f4044y;
                Map c10 = vVar.c();
                if (c10 != null) {
                    return c10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e10 = vVar.e(entry.getKey());
                    if (e10 != -1 && e9.f.c(vVar.k()[e10], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f4044y.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f4043x) {
            case 0:
                v vVar = this.f4044y;
                Map c10 = vVar.c();
                if (c10 != null) {
                    return c10.entrySet().iterator();
                }
                return new s(vVar, 1);
            default:
                v vVar2 = this.f4044y;
                Map c11 = vVar2.c();
                if (c11 != null) {
                    return c11.keySet().iterator();
                }
                return new s(vVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f4043x) {
            case 0:
                v vVar = this.f4044y;
                Map c10 = vVar.c();
                if (c10 != null) {
                    return c10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!vVar.g()) {
                        int d10 = vVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = vVar.f4052x;
                        Objects.requireNonNull(obj2);
                        int q9 = r.q(key, value, d10, obj2, vVar.i(), vVar.j(), vVar.k());
                        if (q9 != -1) {
                            vVar.f(q9, d10);
                            vVar.C--;
                            vVar.B += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                v vVar2 = this.f4044y;
                Map c11 = vVar2.c();
                if (c11 != null) {
                    return c11.keySet().remove(obj);
                }
                if (vVar2.h(obj) != v.G) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4043x) {
            case 0:
                return this.f4044y.size();
            default:
                return this.f4044y.size();
        }
    }
}
