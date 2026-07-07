package db;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h1 extends n0 {
    public static final h1 D = new h1(null, new Object[0], 0);
    public final transient Object A;
    public final transient Object[] B;
    public final transient int C;

    public h1(Object obj, Object[] objArr, int i6) {
        this.A = obj;
        this.B = objArr;
        this.C = i6;
    }

    public static h1 g(int i6, Object[] objArr, b2.k kVar) {
        if (i6 == 0) {
            return D;
        }
        if (i6 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new h1(null, objArr, 1);
        }
        jb.b.g(i6, objArr.length >> 1);
        Object h4 = h(objArr, i6, p0.h(i6), 0);
        if (h4 instanceof Object[]) {
            Object[] objArr2 = (Object[]) h4;
            m0 m0Var = (m0) objArr2[2];
            if (kVar != null) {
                kVar.A = m0Var;
                Object obj = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue * 2);
                h4 = obj;
                i6 = intValue;
            } else {
                throw m0Var.a();
            }
        }
        return new h1(h4, objArr, i6);
    }

    public static Object h(Object[] objArr, int i6, int i10, int i11) {
        m0 m0Var = null;
        int i12 = 1;
        if (i6 == 1) {
            Objects.requireNonNull(objArr[i11]);
            Objects.requireNonNull(objArr[i11 ^ 1]);
            return null;
        }
        int i13 = i10 - 1;
        if (i10 <= 128) {
            byte[] bArr = new byte[i10];
            Arrays.fill(bArr, (byte) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < i6; i15++) {
                int i16 = (i15 * 2) + i11;
                int i17 = (i14 * 2) + i11;
                Object obj = objArr[i16];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i16 ^ 1];
                Objects.requireNonNull(obj2);
                int s = r.s(obj.hashCode());
                while (true) {
                    int i18 = s & i13;
                    int i19 = bArr[i18] & 255;
                    if (i19 == 255) {
                        bArr[i18] = (byte) i17;
                        if (i14 < i15) {
                            objArr[i17] = obj;
                            objArr[i17 ^ 1] = obj2;
                        }
                        i14++;
                    } else {
                        if (obj.equals(objArr[i19])) {
                            int i20 = i19 ^ 1;
                            Object obj3 = objArr[i20];
                            Objects.requireNonNull(obj3);
                            m0Var = new m0(obj, obj2, obj3);
                            objArr[i20] = obj2;
                            break;
                        }
                        s = i18 + 1;
                    }
                }
            }
            if (i14 == i6) {
                return bArr;
            }
            return new Object[]{bArr, Integer.valueOf(i14), m0Var};
        }
        if (i10 <= 32768) {
            short[] sArr = new short[i10];
            Arrays.fill(sArr, (short) -1);
            int i21 = 0;
            for (int i22 = 0; i22 < i6; i22++) {
                int i23 = (i22 * 2) + i11;
                int i24 = (i21 * 2) + i11;
                Object obj4 = objArr[i23];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i23 ^ 1];
                Objects.requireNonNull(obj5);
                int s7 = r.s(obj4.hashCode());
                while (true) {
                    int i25 = s7 & i13;
                    int i26 = sArr[i25] & 65535;
                    if (i26 == 65535) {
                        sArr[i25] = (short) i24;
                        if (i21 < i22) {
                            objArr[i24] = obj4;
                            objArr[i24 ^ 1] = obj5;
                        }
                        i21++;
                    } else {
                        if (obj4.equals(objArr[i26])) {
                            int i27 = i26 ^ 1;
                            Object obj6 = objArr[i27];
                            Objects.requireNonNull(obj6);
                            m0Var = new m0(obj4, obj5, obj6);
                            objArr[i27] = obj5;
                            break;
                        }
                        s7 = i25 + 1;
                    }
                }
            }
            if (i21 == i6) {
                return sArr;
            }
            return new Object[]{sArr, Integer.valueOf(i21), m0Var};
        }
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        int i28 = 0;
        int i29 = 0;
        while (i28 < i6) {
            int i30 = (i28 * 2) + i11;
            int i31 = (i29 * 2) + i11;
            Object obj7 = objArr[i30];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i30 ^ i12];
            Objects.requireNonNull(obj8);
            int s10 = r.s(obj7.hashCode());
            while (true) {
                int i32 = s10 & i13;
                int i33 = iArr[i32];
                if (i33 == -1) {
                    iArr[i32] = i31;
                    if (i29 < i28) {
                        objArr[i31] = obj7;
                        objArr[i31 ^ 1] = obj8;
                    }
                    i29++;
                } else {
                    if (obj7.equals(objArr[i33])) {
                        int i34 = i33 ^ 1;
                        Object obj9 = objArr[i34];
                        Objects.requireNonNull(obj9);
                        m0Var = new m0(obj7, obj8, obj9);
                        objArr[i34] = obj8;
                        break;
                    }
                    s10 = i32 + 1;
                }
            }
            i28++;
            i12 = 1;
        }
        if (i29 == i6) {
            return iArr;
        }
        return new Object[]{iArr, Integer.valueOf(i29), m0Var};
    }

    public static Object i(Object obj, Object[] objArr, int i6, int i10, Object obj2) {
        if (obj2 != null) {
            if (i6 == 1) {
                Object obj3 = objArr[i10];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj2)) {
                    Object obj4 = objArr[i10 ^ 1];
                    Objects.requireNonNull(obj4);
                    return obj4;
                }
                return null;
            }
            if (obj != null) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length - 1;
                    int s = r.s(obj2.hashCode());
                    while (true) {
                        int i11 = s & length;
                        int i12 = bArr[i11] & 255;
                        if (i12 != 255) {
                            if (obj2.equals(objArr[i12])) {
                                return objArr[i12 ^ 1];
                            }
                            s = i11 + 1;
                        } else {
                            return null;
                        }
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    int length2 = sArr.length - 1;
                    int s7 = r.s(obj2.hashCode());
                    while (true) {
                        int i13 = s7 & length2;
                        int i14 = sArr[i13] & 65535;
                        if (i14 != 65535) {
                            if (obj2.equals(objArr[i14])) {
                                return objArr[i14 ^ 1];
                            }
                            s7 = i13 + 1;
                        } else {
                            return null;
                        }
                    }
                } else {
                    int[] iArr = (int[]) obj;
                    int length3 = iArr.length - 1;
                    int s10 = r.s(obj2.hashCode());
                    while (true) {
                        int i15 = s10 & length3;
                        int i16 = iArr[i15];
                        if (i16 == -1) {
                            return null;
                        }
                        if (obj2.equals(objArr[i16])) {
                            return objArr[i16 ^ 1];
                        }
                        s10 = i15 + 1;
                    }
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override // db.n0
    public final e1 b() {
        return new e1(this, this.B, 0, this.C);
    }

    @Override // db.n0
    public final f1 c() {
        return new f1(this, new g1(this.B, 0, this.C));
    }

    @Override // db.n0
    public final f0 d() {
        return new g1(this.B, 1, this.C);
    }

    @Override // db.n0, java.util.Map
    public final Object get(Object obj) {
        Object i6 = i(this.A, this.B, this.C, 0, obj);
        if (i6 == null) {
            return null;
        }
        return i6;
    }

    @Override // java.util.Map
    public final int size() {
        return this.C;
    }
}
