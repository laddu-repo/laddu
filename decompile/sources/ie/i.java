package ie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class i extends a8.f {
    public static List X(Object[] objArr) {
        kotlin.jvm.internal.k.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.k.d(asList, "asList(...)");
        return asList;
    }

    public static boolean Y(char[] cArr, char c10) {
        int length = cArr.length;
        int i6 = 0;
        while (true) {
            if (i6 < length) {
                if (c10 == cArr[i6]) {
                    break;
                }
                i6++;
            } else {
                i6 = -1;
                break;
            }
        }
        if (i6 < 0) {
            return false;
        }
        return true;
    }

    public static boolean Z(Object[] objArr, Object obj) {
        kotlin.jvm.internal.k.e(objArr, "<this>");
        if (n0(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [long[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [short[]] */
    public static boolean a0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            Object obj = objArr[i6];
            Object obj2 = objArr2[i6];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!a0((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else {
                    byte[] bArr = null;
                    if ((obj instanceof he.q) && (obj2 instanceof he.q)) {
                        byte[] bArr2 = ((he.q) obj).f6093x;
                        byte[] bArr3 = ((he.q) obj2).f6093x;
                        if (bArr2 == null) {
                            bArr2 = null;
                        }
                        if (bArr3 != null) {
                            bArr = bArr3;
                        }
                        if (!Arrays.equals(bArr2, bArr)) {
                            return false;
                        }
                    } else if ((obj instanceof he.x) && (obj2 instanceof he.x)) {
                        short[] sArr = ((he.x) obj).f6100x;
                        ?? r52 = ((he.x) obj2).f6100x;
                        if (sArr == null) {
                            sArr = null;
                        }
                        if (r52 != 0) {
                            bArr = r52;
                        }
                        if (!Arrays.equals(sArr, (short[]) bArr)) {
                            return false;
                        }
                    } else if ((obj instanceof he.s) && (obj2 instanceof he.s)) {
                        int[] iArr = ((he.s) obj).f6095x;
                        ?? r53 = ((he.s) obj2).f6095x;
                        if (iArr == null) {
                            iArr = null;
                        }
                        if (r53 != 0) {
                            bArr = r53;
                        }
                        if (!Arrays.equals(iArr, (int[]) bArr)) {
                            return false;
                        }
                    } else if ((obj instanceof he.u) && (obj2 instanceof he.u)) {
                        long[] jArr = ((he.u) obj).f6097x;
                        ?? r54 = ((he.u) obj2).f6097x;
                        if (jArr == null) {
                            jArr = null;
                        }
                        if (r54 != 0) {
                            bArr = r54;
                        }
                        if (!Arrays.equals(jArr, (long[]) bArr)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void b0(int i6, int i10, int i11, byte[] bArr, byte[] destination) {
        kotlin.jvm.internal.k.e(bArr, "<this>");
        kotlin.jvm.internal.k.e(destination, "destination");
        System.arraycopy(bArr, i10, destination, i6, i11 - i10);
    }

    public static void c0(int i6, int i10, int i11, int[] iArr, int[] destination) {
        kotlin.jvm.internal.k.e(iArr, "<this>");
        kotlin.jvm.internal.k.e(destination, "destination");
        System.arraycopy(iArr, i10, destination, i6, i11 - i10);
    }

    public static void d0(int i6, int i10, int i11, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.k.e(objArr, "<this>");
        kotlin.jvm.internal.k.e(destination, "destination");
        System.arraycopy(objArr, i10, destination, i6, i11 - i10);
    }

    public static /* synthetic */ void e0(int i6, int i10, int i11, Object[] objArr, Object[] objArr2) {
        if ((i11 & 4) != 0) {
            i6 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        d0(0, i6, i10, objArr, objArr2);
    }

    public static /* synthetic */ void f0(int i6, int i10, int[] iArr, int[] iArr2) {
        if ((i10 & 8) != 0) {
            i6 = iArr.length;
        }
        c0(0, 0, i6, iArr, iArr2);
    }

    public static byte[] g0(byte[] bArr, int i6, int i10) {
        kotlin.jvm.internal.k.e(bArr, "<this>");
        a8.f.H(i10, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i6, i10);
        kotlin.jvm.internal.k.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] h0(Object[] objArr, int i6, int i10) {
        kotlin.jvm.internal.k.e(objArr, "<this>");
        a8.f.H(i10, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i6, i10);
        kotlin.jvm.internal.k.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void i0(Object[] objArr, Object obj, int i6, int i10) {
        kotlin.jvm.internal.k.e(objArr, "<this>");
        Arrays.fill(objArr, i6, i10, obj);
    }

    public static ArrayList k0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object l0(Object[] objArr) {
        kotlin.jvm.internal.k.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object m0(int i6, Object[] objArr) {
        kotlin.jvm.internal.k.e(objArr, "<this>");
        if (i6 >= 0 && i6 < objArr.length) {
            return objArr[i6];
        }
        return null;
    }

    public static int n0(Object[] objArr, Object obj) {
        kotlin.jvm.internal.k.e(objArr, "<this>");
        int i6 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i6 < length) {
                if (objArr[i6] == null) {
                    return i6;
                }
                i6++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i6 < length2) {
            if (obj.equals(objArr[i6])) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public static final void o0(Object[] objArr, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, bf.u uVar) {
        kotlin.jvm.internal.k.e(objArr, "<this>");
        sb2.append(charSequence2);
        int i6 = 0;
        for (Object obj : objArr) {
            i6++;
            if (i6 > 1) {
                sb2.append(charSequence);
            }
            a8.b.a(sb2, obj, uVar);
        }
        sb2.append(charSequence3);
    }

    public static char p0(char[] cArr) {
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static List q0(Object[] objArr) {
        kotlin.jvm.internal.k.e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new g(objArr, false));
            }
            return a8.g.m(objArr[0]);
        }
        return r.f6846x;
    }

    public static ArrayList r0(int[] iArr) {
        kotlin.jvm.internal.k.e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i6 : iArr) {
            arrayList.add(Integer.valueOf(i6));
        }
        return arrayList;
    }

    public static Set s0(Object[] objArr) {
        kotlin.jvm.internal.k.e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(w.w(objArr.length));
                for (Object obj : objArr) {
                    linkedHashSet.add(obj);
                }
                return linkedHashSet;
            }
            return android.support.v4.media.session.b.r(objArr[0]);
        }
        return t.f6848x;
    }
}
