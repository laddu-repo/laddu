package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements Iterable, n, j {

    /* renamed from: x, reason: collision with root package name */
    public final TreeMap f2176x;

    /* renamed from: y, reason: collision with root package name */
    public final TreeMap f2177y;

    public d() {
        this.f2176x = new TreeMap();
        this.f2177y = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n a(String str) {
        n nVar;
        if ("length".equals(str)) {
            return new g(Double.valueOf(m()));
        }
        if (d(str) && (nVar = (n) this.f2177y.get(str)) != null) {
            return nVar;
        }
        return n.f2352a;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double b() {
        TreeMap treeMap = this.f2176x;
        if (treeMap.size() == 1) {
            return n(0).b();
        }
        if (treeMap.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void c(String str, n nVar) {
        TreeMap treeMap = this.f2177y;
        if (nVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean d(String str) {
        if (!"length".equals(str) && !this.f2177y.containsKey(str)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (m() == dVar.m()) {
                    TreeMap treeMap = this.f2176x;
                    if (treeMap.isEmpty()) {
                        return dVar.f2176x.isEmpty();
                    }
                    for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
                        if (!n(intValue).equals(dVar.n(intValue))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        return r(",");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator g() {
        return new c(this, this.f2176x.keySet().iterator(), this.f2177y.keySet().iterator());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e5, code lost:
    
        if (s1.c.E(r7, r2, (com.google.android.gms.internal.measurement.m) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).m() == r7.m()) goto L168;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0126. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f7  */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.n h(java.lang.String r38, ic.s r39, java.util.ArrayList r40) {
        /*
            Method dump skipped, instructions count: 2202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d.h(java.lang.String, ic.s, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final int hashCode() {
        return this.f2176x.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(this, 2);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n j() {
        d dVar = new d();
        for (Map.Entry entry : this.f2176x.entrySet()) {
            boolean z10 = entry.getValue() instanceof j;
            TreeMap treeMap = dVar.f2176x;
            if (z10) {
                treeMap.put((Integer) entry.getKey(), (n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((n) entry.getValue()).j());
            }
        }
        return dVar;
    }

    public final List k() {
        ArrayList arrayList = new ArrayList(m());
        for (int i6 = 0; i6 < m(); i6++) {
            arrayList.add(n(i6));
        }
        return arrayList;
    }

    public final Iterator l() {
        return this.f2176x.keySet().iterator();
    }

    public final int m() {
        TreeMap treeMap = this.f2176x;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final n n(int i6) {
        n nVar;
        if (i6 < m()) {
            if (p(i6) && (nVar = (n) this.f2176x.get(Integer.valueOf(i6))) != null) {
                return nVar;
            }
            return n.f2352a;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void o(int i6, n nVar) {
        if (i6 <= 32468) {
            if (i6 >= 0) {
                TreeMap treeMap = this.f2176x;
                if (nVar == null) {
                    treeMap.remove(Integer.valueOf(i6));
                    return;
                } else {
                    treeMap.put(Integer.valueOf(i6), nVar);
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 21);
            sb2.append("Out of bounds index: ");
            sb2.append(i6);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        throw new IllegalStateException("Array too large");
    }

    public final boolean p(int i6) {
        if (i6 >= 0) {
            TreeMap treeMap = this.f2176x;
            if (i6 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i6));
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i6);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final void q(int i6) {
        TreeMap treeMap = this.f2176x;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i6 <= intValue && i6 >= 0) {
            treeMap.remove(Integer.valueOf(i6));
            if (i6 == intValue) {
                int i10 = i6 - 1;
                Integer valueOf = Integer.valueOf(i10);
                if (!treeMap.containsKey(valueOf) && i10 >= 0) {
                    treeMap.put(valueOf, n.f2352a);
                    return;
                }
                return;
            }
            while (true) {
                i6++;
                if (i6 <= ((Integer) treeMap.lastKey()).intValue()) {
                    Integer valueOf2 = Integer.valueOf(i6);
                    n nVar = (n) treeMap.get(valueOf2);
                    if (nVar != null) {
                        treeMap.put(Integer.valueOf(i6 - 1), nVar);
                        treeMap.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final String r(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f2176x.isEmpty()) {
            int i6 = 0;
            while (true) {
                if (str == null) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    str2 = str;
                }
                if (i6 >= m()) {
                    break;
                }
                n n10 = n(i6);
                sb2.append(str2);
                if (!(n10 instanceof r) && !(n10 instanceof l)) {
                    sb2.append(n10.f());
                }
                i6++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    public final String toString() {
        return r(",");
    }

    public d(List list) {
        this();
        if (list != null) {
            for (int i6 = 0; i6 < list.size(); i6++) {
                o(i6, (n) list.get(i6));
            }
        }
    }
}
