package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p6 extends AbstractMap {
    public boolean A;
    public volatile s6 B;
    public Map C;

    /* renamed from: x, reason: collision with root package name */
    public Object[] f2390x;

    /* renamed from: y, reason: collision with root package name */
    public int f2391y;

    /* renamed from: z, reason: collision with root package name */
    public Map f2392z;

    public p6() {
        Map map = Collections.EMPTY_MAP;
        this.f2392z = map;
        this.C = map;
    }

    public final q6 a(int i6) {
        if (i6 < this.f2391y) {
            return (q6) this.f2390x[i6];
        }
        throw new ArrayIndexOutOfBoundsException(i6);
    }

    public final Set b() {
        if (this.f2392z.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return this.f2392z.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int e10 = e(comparable);
        if (e10 >= 0) {
            return ((q6) this.f2390x[e10]).setValue(obj);
        }
        f();
        if (this.f2390x == null) {
            this.f2390x = new Object[16];
        }
        int i6 = -(e10 + 1);
        if (i6 >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f2391y == 16) {
            q6 q6Var = (q6) this.f2390x[15];
            this.f2391y = 15;
            g().put(q6Var.f2398x, q6Var.f2399y);
        }
        Object[] objArr = this.f2390x;
        int length = objArr.length;
        System.arraycopy(objArr, i6, objArr, i6 + 1, 15 - i6);
        this.f2390x[i6] = new q6(this, comparable, obj);
        this.f2391y++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.f2391y != 0) {
            this.f2390x = null;
            this.f2391y = 0;
        }
        if (!this.f2392z.isEmpty()) {
            this.f2392z.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (e(comparable) < 0 && !this.f2392z.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Object d(int i6) {
        f();
        Object[] objArr = this.f2390x;
        Object obj = ((q6) objArr[i6]).f2399y;
        System.arraycopy(objArr, i6 + 1, objArr, i6, (this.f2391y - i6) - 1);
        this.f2391y--;
        if (!this.f2392z.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f2390x;
            int i10 = this.f2391y;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i10] = new q6(this, (Comparable) entry.getKey(), entry.getValue());
            this.f2391y++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i6 = this.f2391y;
        int i10 = i6 - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((q6) this.f2390x[i10]).f2398x);
            if (compareTo > 0) {
                return -(i6 + 1);
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((q6) this.f2390x[i12]).f2398x);
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else if (compareTo2 > 0) {
                i11 = i12 + 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.B == null) {
            this.B = new s6(this, 0);
        }
        return this.B;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof p6)) {
                return super.equals(obj);
            }
            p6 p6Var = (p6) obj;
            int size = size();
            if (size == p6Var.size()) {
                int i6 = this.f2391y;
                if (i6 == p6Var.f2391y) {
                    for (int i10 = 0; i10 < i6; i10++) {
                        if (a(i10).equals(p6Var.a(i10))) {
                        }
                    }
                    if (i6 != size) {
                        return this.f2392z.equals(p6Var.f2392z);
                    }
                    return true;
                }
                return entrySet().equals(p6Var.entrySet());
            }
            return false;
        }
        return true;
    }

    public final void f() {
        if (!this.A) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap g() {
        f();
        if (this.f2392z.isEmpty() && !(this.f2392z instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2392z = treeMap;
            this.C = treeMap.descendingMap();
        }
        return (SortedMap) this.f2392z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e10 = e(comparable);
        if (e10 >= 0) {
            return ((q6) this.f2390x[e10]).f2399y;
        }
        return this.f2392z.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i6 = this.f2391y;
        int i10 = 0;
        for (int i11 = 0; i11 < i6; i11++) {
            i10 += this.f2390x[i11].hashCode();
        }
        if (this.f2392z.size() > 0) {
            return this.f2392z.hashCode() + i10;
        }
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int e10 = e(comparable);
        if (e10 >= 0) {
            return d(e10);
        }
        if (this.f2392z.isEmpty()) {
            return null;
        }
        return this.f2392z.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2392z.size() + this.f2391y;
    }
}
