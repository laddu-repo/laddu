package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends AbstractMap {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f865v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Map f866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f867x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile z0 f868y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Map f869z;

    public static w0 f() {
        w0 w0Var = new w0();
        w0Var.f865v = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        w0Var.f866w = map;
        w0Var.f869z = map;
        return w0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f865v
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f865v
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.x0 r2 = (androidx.datastore.preferences.protobuf.x0) r2
            java.lang.Comparable r2 = r2.f872v
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f865v
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.x0 r3 = (androidx.datastore.preferences.protobuf.x0) r3
            java.lang.Comparable r3 = r3.f872v
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.w0.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f867x) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.f865v.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f865v.isEmpty()) {
            this.f865v.clear();
        }
        if (this.f866w.isEmpty()) {
            return;
        }
        this.f866w.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f866w.containsKey(comparable);
    }

    public final Set d() {
        return this.f866w.isEmpty() ? Collections.EMPTY_SET : this.f866w.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f866w.isEmpty() && !(this.f866w instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f866w = treeMap;
            this.f869z = treeMap.descendingMap();
        }
        return (SortedMap) this.f866w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f868y == null) {
            this.f868y = new z0(0, this);
        }
        return this.f868y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return super.equals(obj);
        }
        w0 w0Var = (w0) obj;
        int size = size();
        if (size == w0Var.size()) {
            int size2 = this.f865v.size();
            if (size2 != w0Var.f865v.size()) {
                return ((AbstractSet) entrySet()).equals(w0Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(w0Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.f866w.equals(w0Var.f866w);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((x0) this.f865v.get(iA)).setValue(obj);
        }
        b();
        if (this.f865v.isEmpty() && !(this.f865v instanceof ArrayList)) {
            this.f865v = new ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f865v.size() == 16) {
            x0 x0Var = (x0) this.f865v.remove(15);
            e().put(x0Var.f872v, x0Var.f873w);
        }
        this.f865v.add(i, new x0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((x0) this.f865v.get(iA)).f873w : this.f866w.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((x0) this.f865v.remove(i)).f873w;
        if (!this.f866w.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f865v;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new x0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f865v.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((x0) this.f865v.get(i)).hashCode();
        }
        return this.f866w.size() > 0 ? this.f866w.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f866w.isEmpty()) {
            return null;
        }
        return this.f866w.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f866w.size() + this.f865v.size();
    }
}
