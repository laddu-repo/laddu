package db;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class j extends e implements SortedSet {

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ y0 f4005z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(y0 y0Var, SortedMap sortedMap) {
        super(y0Var, sortedMap);
        this.f4005z = y0Var;
    }

    public SortedMap a() {
        return (SortedMap) this.f3993x;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new j(this.f4005z, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new j(this.f4005z, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new j(this.f4005z, a().tailMap(obj));
    }
}
