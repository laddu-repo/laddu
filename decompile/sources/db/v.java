package db;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v extends AbstractMap implements Serializable {
    public static final Object G = new Object();
    public transient Object[] A;
    public transient int B;
    public transient int C;
    public transient t D;
    public transient t E;
    public transient n F;

    /* renamed from: x, reason: collision with root package name */
    public transient Object f4052x;

    /* renamed from: y, reason: collision with root package name */
    public transient int[] f4053y;

    /* renamed from: z, reason: collision with root package name */
    public transient Object[] f4054z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, db.v] */
    public static v a() {
        ?? abstractMap = new AbstractMap();
        abstractMap.B = Math.min(Math.max(3, 1), 1073741823);
        return abstractMap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, db.v] */
    public static v b(int i6) {
        boolean z10;
        ?? abstractMap = new AbstractMap();
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        jb.b.d("Expected size must be >= 0", z10);
        abstractMap.B = Math.min(Math.max(i6, 1), 1073741823);
        return abstractMap;
    }

    public final Map c() {
        Object obj = this.f4052x;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.B += 32;
        Map c10 = c();
        if (c10 != null) {
            this.B = Math.min(Math.max(size(), 3), 1073741823);
            c10.clear();
            this.f4052x = null;
            this.C = 0;
            return;
        }
        Arrays.fill(j(), 0, this.C, (Object) null);
        Arrays.fill(k(), 0, this.C, (Object) null);
        Object obj = this.f4052x;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.C, 0);
        this.C = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.containsKey(obj);
        }
        if (e(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.containsValue(obj);
        }
        for (int i6 = 0; i6 < this.C; i6++) {
            if (e9.f.c(obj, k()[i6])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.B & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int t10 = r.t(obj);
        int d10 = d();
        Object obj2 = this.f4052x;
        Objects.requireNonNull(obj2);
        int u3 = r.u(t10 & d10, obj2);
        if (u3 == 0) {
            return -1;
        }
        int i6 = ~d10;
        int i10 = t10 & i6;
        do {
            int i11 = u3 - 1;
            int i12 = i()[i11];
            if ((i12 & i6) == i10 && e9.f.c(obj, j()[i11])) {
                return i11;
            }
            u3 = i12 & d10;
        } while (u3 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        t tVar = this.E;
        if (tVar == null) {
            t tVar2 = new t(this, 0);
            this.E = tVar2;
            return tVar2;
        }
        return tVar;
    }

    public final void f(int i6, int i10) {
        Object obj = this.f4052x;
        Objects.requireNonNull(obj);
        int[] i11 = i();
        Object[] j = j();
        Object[] k8 = k();
        int size = size();
        int i12 = size - 1;
        if (i6 < i12) {
            Object obj2 = j[i12];
            j[i6] = obj2;
            k8[i6] = k8[i12];
            j[i12] = null;
            k8[i12] = null;
            i11[i6] = i11[i12];
            i11[i12] = 0;
            int t10 = r.t(obj2) & i10;
            int u3 = r.u(t10, obj);
            if (u3 == size) {
                r.v(t10, i6 + 1, obj);
                return;
            }
            while (true) {
                int i13 = u3 - 1;
                int i14 = i11[i13];
                int i15 = i14 & i10;
                if (i15 == size) {
                    i11[i13] = r.o(i14, i6 + 1, i10);
                    return;
                }
                u3 = i15;
            }
        } else {
            j[i6] = null;
            k8[i6] = null;
            i11[i6] = 0;
        }
    }

    public final boolean g() {
        if (this.f4052x == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.get(obj);
        }
        int e10 = e(obj);
        if (e10 == -1) {
            return null;
        }
        return k()[e10];
    }

    public final Object h(Object obj) {
        if (!g()) {
            int d10 = d();
            Object obj2 = this.f4052x;
            Objects.requireNonNull(obj2);
            int q9 = r.q(obj, null, d10, obj2, i(), j(), null);
            if (q9 != -1) {
                Object obj3 = k()[q9];
                f(q9, d10);
                this.C--;
                this.B += 32;
                return obj3;
            }
        }
        return G;
    }

    public final int[] i() {
        int[] iArr = this.f4053y;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] j() {
        Object[] objArr = this.f4054z;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.A;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        t tVar = this.D;
        if (tVar == null) {
            t tVar2 = new t(this, 1);
            this.D = tVar2;
            return tVar2;
        }
        return tVar;
    }

    public final int l(int i6, int i10, int i11, int i12) {
        Object f3 = r.f(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            r.v(i11 & i13, i12 + 1, f3);
        }
        Object obj = this.f4052x;
        Objects.requireNonNull(obj);
        int[] i14 = i();
        for (int i15 = 0; i15 <= i6; i15++) {
            int u3 = r.u(i15, obj);
            while (u3 != 0) {
                int i16 = u3 - 1;
                int i17 = i14[i16];
                int i18 = ((~i6) & i17) | i15;
                int i19 = i18 & i13;
                int u10 = r.u(i19, f3);
                r.v(i19, u3, f3);
                i14[i16] = r.o(i18, u10, i13);
                u3 = i17 & i6;
            }
        }
        this.f4052x = f3;
        this.B = r.o(this.B, 32 - Integer.numberOfLeadingZeros(i13), 31);
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ff -> B:43:0x00e5). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: db.v.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.remove(obj);
        }
        Object h4 = h(obj);
        if (h4 == G) {
            return null;
        }
        return h4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map c10 = c();
        if (c10 != null) {
            return c10.size();
        }
        return this.C;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        n nVar = this.F;
        if (nVar == null) {
            n nVar2 = new n(1, this);
            this.F = nVar2;
            return nVar2;
        }
        return nVar;
    }
}
