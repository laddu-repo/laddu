package db;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class i extends d implements SortedMap {
    public SortedSet B;
    public final /* synthetic */ y0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(y0 y0Var, SortedMap sortedMap) {
        super(y0Var, sortedMap);
        this.C = y0Var;
    }

    public SortedSet b() {
        return new j(this.C, d());
    }

    @Override // db.d, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.B;
        if (sortedSet == null) {
            SortedSet b10 = b();
            this.B = b10;
            return b10;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f3991z;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new i(this.C, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new i(this.C, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new i(this.C, d().tailMap(obj));
    }
}
