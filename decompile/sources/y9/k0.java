package y9;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 extends i0 implements NavigableSet, n1 {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient Comparator f14571y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public transient k0 f14572z;

    public k0(Comparator comparator) {
        this.f14571y = comparator;
    }

    public static g1 m(Comparator comparator) {
        return x0.f14630w.equals(comparator) ? g1.C : new g1(z0.f14637z, comparator);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f14571y;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        k0 k0VarM = this.f14572z;
        if (k0VarM == null) {
            g1 g1Var = (g1) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(g1Var.f14571y);
            k0VarM = g1Var.isEmpty() ? m(comparatorReverseOrder) : new g1(g1Var.B.t(), comparatorReverseOrder);
            this.f14572z = k0VarM;
            k0VarM.f14572z = this;
        }
        return k0VarM;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z2) {
        obj.getClass();
        g1 g1Var = (g1) this;
        return g1Var.o(0, g1Var.p(obj, z2));
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final g1 subSet(Object obj, boolean z2, Object obj2, boolean z10) {
        obj.getClass();
        obj2.getClass();
        p4.v.j(this.f14571y.compare(obj, obj2) <= 0);
        g1 g1Var = (g1) this;
        g1 g1VarO = g1Var.o(g1Var.q(obj, z2), g1Var.B.size());
        return g1VarO.o(0, g1VarO.p(obj2, z10));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z2) {
        obj.getClass();
        g1 g1Var = (g1) this;
        return g1Var.o(g1Var.q(obj, z2), g1Var.B.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        g1 g1Var = (g1) this;
        return g1Var.o(0, g1Var.p(obj, false));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        g1 g1Var = (g1) this;
        return g1Var.o(g1Var.q(obj, true), g1Var.B.size());
    }
}
