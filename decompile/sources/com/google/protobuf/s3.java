package com.google.protobuf;

import com.google.android.gms.internal.measurement.s6;
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

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s3 extends AbstractMap {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public volatile s6 B;
    public Map C;
    public volatile u3 D;

    /* renamed from: x, reason: collision with root package name */
    public final int f3043x;

    /* renamed from: y, reason: collision with root package name */
    public List f3044y = Collections.EMPTY_LIST;

    /* renamed from: z, reason: collision with root package name */
    public Map f3045z;

    public s3(int i6) {
        this.f3043x = i6;
        Map map = Collections.EMPTY_MAP;
        this.f3045z = map;
        this.C = map;
    }

    public final int a(Comparable comparable) {
        int i6;
        int size = this.f3044y.size();
        int i10 = size - 1;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((x3) this.f3044y.get(i10)).f3108x);
            if (compareTo > 0) {
                i6 = size + 1;
                return -i6;
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((x3) this.f3044y.get(i12)).f3108x);
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else if (compareTo2 > 0) {
                i11 = i12 + 1;
            } else {
                return i12;
            }
        }
        i6 = i11 + 1;
        return -i6;
    }

    public final void b() {
        if (!this.A) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i6) {
        return (Map.Entry) this.f3044y.get(i6);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f3044y.isEmpty()) {
            this.f3044y.clear();
        }
        if (!this.f3045z.isEmpty()) {
            this.f3045z.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f3045z.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Iterable d() {
        if (this.f3045z.isEmpty()) {
            return s4.f3047c;
        }
        return this.f3045z.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f3045z.isEmpty() && !(this.f3045z instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3045z = treeMap;
            this.C = treeMap.descendingMap();
        }
        return (SortedMap) this.f3045z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.B == null) {
            this.B = new s6(this, 1);
        }
        return this.B;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof s3)) {
                return super.equals(obj);
            }
            s3 s3Var = (s3) obj;
            int size = size();
            if (size == s3Var.size()) {
                int size2 = this.f3044y.size();
                if (size2 != s3Var.f3044y.size()) {
                    return ((AbstractSet) entrySet()).equals(s3Var.entrySet());
                }
                for (int i6 = 0; i6 < size2; i6++) {
                    if (c(i6).equals(s3Var.c(i6))) {
                    }
                }
                if (size2 != size) {
                    return this.f3045z.equals(s3Var.f3045z);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a10 = a(comparable);
        if (a10 >= 0) {
            return ((x3) this.f3044y.get(a10)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f3044y.isEmpty();
        int i6 = this.f3043x;
        if (isEmpty && !(this.f3044y instanceof ArrayList)) {
            this.f3044y = new ArrayList(i6);
        }
        int i10 = -(a10 + 1);
        if (i10 >= i6) {
            return e().put(comparable, obj);
        }
        if (this.f3044y.size() == i6) {
            x3 x3Var = (x3) this.f3044y.remove(i6 - 1);
            e().put(x3Var.f3108x, x3Var.f3109y);
        }
        this.f3044y.add(i10, new x3(this, comparable, obj));
        return null;
    }

    public final Object g(int i6) {
        b();
        Object obj = ((x3) this.f3044y.remove(i6)).f3109y;
        if (!this.f3045z.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f3044y;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new x3(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return ((x3) this.f3044y.get(a10)).f3109y;
        }
        return this.f3045z.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f3044y.size();
        int i6 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i6 += ((x3) this.f3044y.get(i10)).hashCode();
        }
        if (this.f3045z.size() > 0) {
            return this.f3045z.hashCode() + i6;
        }
        return i6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return g(a10);
        }
        if (this.f3045z.isEmpty()) {
            return null;
        }
        return this.f3045z.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3045z.size() + this.f3044y.size();
    }
}
