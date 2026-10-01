package y9;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class j extends e implements SortedSet {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w0 f14566x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(w0 w0Var, SortedMap sortedMap) {
        super(w0Var, sortedMap);
        this.f14566x = w0Var;
    }

    public SortedMap a() {
        return (SortedMap) this.f14543v;
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
        return new j(this.f14566x, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new j(this.f14566x, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new j(this.f14566x, a().tailMap(obj));
    }
}
