package y9;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractMap implements Serializable {
    public static final Object E = new Object();
    public transient int A;
    public transient r B;
    public transient r C;
    public transient m D;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public transient Object f14615v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public transient int[] f14616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public transient Object[] f14617x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public transient Object[] f14618y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public transient int f14619z;

    public static t a(int i) {
        t tVar = new t();
        p4.v.i("Expected size must be >= 0", i >= 0);
        tVar.f14619z = Math.min(Math.max(i, 1), 1073741823);
        return tVar;
    }

    public final Map b() {
        Object obj = this.f14615v;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.f14619z & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.f14619z += 32;
        Map mapB = b();
        if (mapB != null) {
            this.f14619z = Math.min(Math.max(size(), 3), 1073741823);
            mapB.clear();
            this.f14615v = null;
            this.A = 0;
            return;
        }
        Arrays.fill(i(), 0, this.A, (Object) null);
        Arrays.fill(j(), 0, this.A, (Object) null);
        Object obj = this.f14615v;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.A, 0);
        this.A = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapB = b();
        return mapB != null ? mapB.containsKey(obj) : d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i = 0; i < this.A; i++) {
            if (Objects.equals(obj, j()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int iV = p.v(obj);
        int iC = c();
        Object obj2 = this.f14615v;
        Objects.requireNonNull(obj2);
        int iW = p.w(iV & iC, obj2);
        if (iW == 0) {
            return -1;
        }
        int i = ~iC;
        int i10 = iV & i;
        do {
            int i11 = iW - 1;
            int i12 = h()[i11];
            if ((i12 & i) == i10 && Objects.equals(obj, i()[i11])) {
                return i11;
            }
            iW = i12 & iC;
        } while (iW != 0);
        return -1;
    }

    public final void e(int i, int i10) {
        Object obj = this.f14615v;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        Object[] objArrI = i();
        Object[] objArrJ = j();
        int size = size();
        int i11 = size - 1;
        if (i >= i11) {
            objArrI[i] = null;
            objArrJ[i] = null;
            iArrH[i] = 0;
            return;
        }
        Object obj2 = objArrI[i11];
        objArrI[i] = obj2;
        objArrJ[i] = objArrJ[i11];
        objArrI[i11] = null;
        objArrJ[i11] = null;
        iArrH[i] = iArrH[i11];
        iArrH[i11] = 0;
        int iV = p.v(obj2) & i10;
        int iW = p.w(iV, obj);
        if (iW == size) {
            p.x(iV, i + 1, obj);
            return;
        }
        while (true) {
            int i12 = iW - 1;
            int i13 = iArrH[i12];
            int i14 = i13 & i10;
            if (i14 == size) {
                iArrH[i12] = p.p(i13, i + 1, i10);
                return;
            }
            iW = i14;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        r rVar = this.C;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this, 0);
        this.C = rVar2;
        return rVar2;
    }

    public final boolean f() {
        return this.f14615v == null;
    }

    public final Object g(Object obj) {
        if (!f()) {
            int iC = c();
            Object obj2 = this.f14615v;
            Objects.requireNonNull(obj2);
            int iR = p.r(obj, null, iC, obj2, h(), i(), null);
            if (iR != -1) {
                Object obj3 = j()[iR];
                e(iR, iC);
                this.A--;
                this.f14619z += 32;
                return obj3;
            }
        }
        return E;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return j()[iD];
    }

    public final int[] h() {
        int[] iArr = this.f14616w;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.f14617x;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.f14618y;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i, int i10, int i11, int i12) {
        Object objE = p.e(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            p.x(i11 & i13, i12 + 1, objE);
        }
        Object obj = this.f14615v;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        for (int i14 = 0; i14 <= i; i14++) {
            int iW = p.w(i14, obj);
            while (iW != 0) {
                int i15 = iW - 1;
                int i16 = iArrH[i15];
                int i17 = ((~i) & i16) | i14;
                int i18 = i17 & i13;
                int iW2 = p.w(i18, objE);
                p.x(i18, iW, objE);
                iArrH[i15] = p.p(i17, iW2, i13);
                iW = i16 & i;
            }
        }
        this.f14615v = objE;
        this.f14619z = p.p(this.f14619z, 32 - Integer.numberOfLeadingZeros(i13), 31);
        return i13;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        r rVar = this.B;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this, 1);
        this.B = rVar2;
        return rVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:37:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.t.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        Object objG = g(obj);
        if (objG == E) {
            return null;
        }
        return objG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapB = b();
        return mapB != null ? mapB.size() : this.A;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        m mVar = this.D;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(1, this);
        this.D = mVar2;
        return mVar2;
    }
}
