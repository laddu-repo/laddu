package l4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends g0 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8111r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i6, boolean z10) {
        super(z10);
        this.f8111r = i6;
    }

    public static float[] g(String value) {
        kotlin.jvm.internal.k.e(value, "value");
        return new float[]{((Number) g0.f8131i.d(value)).floatValue()};
    }

    public static int[] h(String value) {
        kotlin.jvm.internal.k.e(value, "value");
        return new int[]{((Number) g0.f8124b.d(value)).intValue()};
    }

    public static long[] i(String value) {
        kotlin.jvm.internal.k.e(value, "value");
        return new long[]{((Number) g0.f8128f.d(value)).longValue()};
    }

    public static boolean[] j(String value) {
        kotlin.jvm.internal.k.e(value, "value");
        return new boolean[]{((Boolean) g0.f8133l.d(value)).booleanValue()};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [ie.r] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v23, types: [ie.r] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [ie.r] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    @Override // l4.g0
    public final Object a(String key, Bundle bundle) {
        Object obj;
        Object obj2;
        Object obj3;
        switch (this.f8111r) {
            case 0:
                kotlin.jvm.internal.k.e(bundle, "bundle");
                kotlin.jvm.internal.k.e(key, "key");
                if (!bundle.containsKey(key) || a8.i.p(key, bundle)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(key);
                if (booleanArray != null) {
                    return booleanArray;
                }
                android.support.v4.media.session.b.m(key);
                throw null;
            case 1:
                kotlin.jvm.internal.k.e(bundle, "bundle");
                kotlin.jvm.internal.k.e(key, "key");
                if (!bundle.containsKey(key) || a8.i.p(key, bundle)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(key);
                if (booleanArray2 != null) {
                    kotlin.jvm.internal.k.e(booleanArray2, "<this>");
                    int length = booleanArray2.length;
                    if (length != 0) {
                        if (length != 1) {
                            obj = new ArrayList(booleanArray2.length);
                            for (boolean z10 : booleanArray2) {
                                obj.add(Boolean.valueOf(z10));
                            }
                        } else {
                            obj = a8.g.m(Boolean.valueOf(booleanArray2[0]));
                        }
                    } else {
                        obj = ie.r.f6846x;
                    }
                    return obj;
                }
                android.support.v4.media.session.b.m(key);
                throw null;
            case 2:
                kotlin.jvm.internal.k.e(bundle, "bundle");
                kotlin.jvm.internal.k.e(key, "key");
                if (!bundle.containsKey(key) || a8.i.p(key, bundle)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(key);
                if (floatArray != null) {
                    return floatArray;
                }
                android.support.v4.media.session.b.m(key);
                throw null;
            case 3:
                kotlin.jvm.internal.k.e(bundle, "bundle");
                kotlin.jvm.internal.k.e(key, "key");
                if (!bundle.containsKey(key) || a8.i.p(key, bundle)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(key);
                if (floatArray2 != null) {
                    kotlin.jvm.internal.k.e(floatArray2, "<this>");
                    int length2 = floatArray2.length;
                    if (length2 != 0) {
                        if (length2 != 1) {
                            obj2 = new ArrayList(floatArray2.length);
                            for (float f3 : floatArray2) {
                                obj2.add(Float.valueOf(f3));
                            }
                        } else {
                            obj2 = a8.g.m(Float.valueOf(floatArray2[0]));
                        }
                    } else {
                        obj2 = ie.r.f6846x;
                    }
                    return obj2;
                }
                android.support.v4.media.session.b.m(key);
                throw null;
            case 4:
                kotlin.jvm.internal.k.e(bundle, "bundle");
                kotlin.jvm.internal.k.e(key, "key");
                if (!bundle.containsKey(key) || a8.i.p(key, bundle)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(key);
                if (intArray != null) {
                    return intArray;
                }
                android.support.v4.media.session.b.m(key);
                throw null;
            case 5:
                kotlin.jvm.internal.k.e(bundle, "bundle");
                kotlin.jvm.internal.k.e(key, "key");
                if (!bundle.containsKey(key) || a8.i.p(key, bundle)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(key);
                if (intArray2 != null) {
                    int length3 = intArray2.length;
                    if (length3 != 0) {
                        if (length3 != 1) {
                            return ie.i.r0(intArray2);
                        }
                        return a8.g.m(Integer.valueOf(intArray2[0]));
                    }
                    return ie.r.f6846x;
                }
                android.support.v4.media.session.b.m(key);
                throw null;
            case 6:
                kotlin.jvm.internal.k.e(bundle, "bundle");
                kotlin.jvm.internal.k.e(key, "key");
                if (!bundle.containsKey(key) || a8.i.p(key, bundle)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(key);
                if (longArray != null) {
                    return longArray;
                }
                android.support.v4.media.session.b.m(key);
                throw null;
            case 7:
                kotlin.jvm.internal.k.e(bundle, "bundle");
                kotlin.jvm.internal.k.e(key, "key");
                if (!bundle.containsKey(key) || a8.i.p(key, bundle)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(key);
                if (longArray2 != null) {
                    kotlin.jvm.internal.k.e(longArray2, "<this>");
                    int length4 = longArray2.length;
                    if (length4 != 0) {
                        if (length4 != 1) {
                            obj3 = new ArrayList(longArray2.length);
                            for (long j : longArray2) {
                                obj3.add(Long.valueOf(j));
                            }
                        } else {
                            obj3 = a8.g.m(Long.valueOf(longArray2[0]));
                        }
                    } else {
                        obj3 = ie.r.f6846x;
                    }
                    return obj3;
                }
                android.support.v4.media.session.b.m(key);
                throw null;
            case 8:
                kotlin.jvm.internal.k.e(bundle, "bundle");
                kotlin.jvm.internal.k.e(key, "key");
                if (!bundle.containsKey(key) || a8.i.p(key, bundle)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(key);
                if (stringArray != null) {
                    return stringArray;
                }
                android.support.v4.media.session.b.m(key);
                throw null;
            default:
                kotlin.jvm.internal.k.e(bundle, "bundle");
                kotlin.jvm.internal.k.e(key, "key");
                if (!bundle.containsKey(key) || a8.i.p(key, bundle)) {
                    return null;
                }
                String[] stringArray2 = bundle.getStringArray(key);
                if (stringArray2 != null) {
                    return ie.i.q0(stringArray2);
                }
                android.support.v4.media.session.b.m(key);
                throw null;
        }
    }

    @Override // l4.g0
    public final String b() {
        switch (this.f8111r) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // l4.g0
    public final Object c(Object obj, String str) {
        switch (this.f8111r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null) {
                    boolean[] j = j(str);
                    int length = zArr.length;
                    boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                    System.arraycopy(j, 0, copyOf, length, 1);
                    kotlin.jvm.internal.k.b(copyOf);
                    return copyOf;
                }
                return j(str);
            case 1:
                List list = (List) obj;
                d dVar = g0.f8133l;
                if (list != null) {
                    return ie.j.P(a8.g.m(dVar.d(str)), list);
                }
                return a8.g.m(dVar.d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null) {
                    float[] g10 = g(str);
                    int length2 = fArr.length;
                    float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                    System.arraycopy(g10, 0, copyOf2, length2, 1);
                    kotlin.jvm.internal.k.b(copyOf2);
                    return copyOf2;
                }
                return g(str);
            case 3:
                List list2 = (List) obj;
                d dVar2 = g0.f8131i;
                if (list2 != null) {
                    return ie.j.P(a8.g.m(dVar2.d(str)), list2);
                }
                return a8.g.m(dVar2.d(str));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    int[] h4 = h(str);
                    int length3 = iArr.length;
                    int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                    System.arraycopy(h4, 0, copyOf3, length3, 1);
                    kotlin.jvm.internal.k.b(copyOf3);
                    return copyOf3;
                }
                return h(str);
            case 5:
                List list3 = (List) obj;
                d dVar3 = g0.f8124b;
                if (list3 != null) {
                    return ie.j.P(a8.g.m(dVar3.d(str)), list3);
                }
                return a8.g.m(dVar3.d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr != null) {
                    long[] i6 = i(str);
                    int length4 = jArr.length;
                    long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                    System.arraycopy(i6, 0, copyOf4, length4, 1);
                    kotlin.jvm.internal.k.b(copyOf4);
                    return copyOf4;
                }
                return i(str);
            case 7:
                List list4 = (List) obj;
                d dVar4 = g0.f8128f;
                if (list4 != null) {
                    return ie.j.P(a8.g.m(dVar4.d(str)), list4);
                }
                return a8.g.m(dVar4.d(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    int length5 = strArr.length;
                    Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                    System.arraycopy(new String[]{str}, 0, copyOf5, length5, 1);
                    kotlin.jvm.internal.k.b(copyOf5);
                    return (String[]) copyOf5;
                }
                return new String[]{str};
            default:
                List list5 = (List) obj;
                if (list5 != null) {
                    return ie.j.P(a8.g.m(str), list5);
                }
                return a8.g.m(str);
        }
    }

    @Override // l4.g0
    public final Object d(String value) {
        switch (this.f8111r) {
            case 0:
                return j(value);
            case 1:
                kotlin.jvm.internal.k.e(value, "value");
                return a8.g.m(g0.f8133l.d(value));
            case 2:
                return g(value);
            case 3:
                kotlin.jvm.internal.k.e(value, "value");
                return a8.g.m(g0.f8131i.d(value));
            case 4:
                return h(value);
            case 5:
                kotlin.jvm.internal.k.e(value, "value");
                return a8.g.m(g0.f8124b.d(value));
            case 6:
                return i(value);
            case 7:
                kotlin.jvm.internal.k.e(value, "value");
                return a8.g.m(g0.f8128f.d(value));
            case 8:
                kotlin.jvm.internal.k.e(value, "value");
                return new String[]{value};
            default:
                kotlin.jvm.internal.k.e(value, "value");
                return a8.g.m(value);
        }
    }

    @Override // l4.g0
    public final void e(Bundle bundle, String key, Object obj) {
        switch (this.f8111r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                kotlin.jvm.internal.k.e(key, "key");
                if (zArr != null) {
                    bundle.putBooleanArray(key, zArr);
                    return;
                } else {
                    c9.a.l(key, bundle);
                    return;
                }
            case 1:
                List list = (List) obj;
                kotlin.jvm.internal.k.e(key, "key");
                if (list != null) {
                    bundle.putBooleanArray(key, ie.j.V(list));
                    return;
                } else {
                    c9.a.l(key, bundle);
                    return;
                }
            case 2:
                float[] fArr = (float[]) obj;
                kotlin.jvm.internal.k.e(key, "key");
                if (fArr != null) {
                    bundle.putFloatArray(key, fArr);
                    return;
                } else {
                    c9.a.l(key, bundle);
                    return;
                }
            case 3:
                List list2 = (List) obj;
                kotlin.jvm.internal.k.e(key, "key");
                if (list2 != null) {
                    float[] fArr2 = new float[list2.size()];
                    Iterator it = list2.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        fArr2[i6] = ((Number) it.next()).floatValue();
                        i6++;
                    }
                    bundle.putFloatArray(key, fArr2);
                    return;
                }
                c9.a.l(key, bundle);
                return;
            case 4:
                int[] iArr = (int[]) obj;
                kotlin.jvm.internal.k.e(key, "key");
                if (iArr != null) {
                    bundle.putIntArray(key, iArr);
                    return;
                } else {
                    c9.a.l(key, bundle);
                    return;
                }
            case 5:
                List list3 = (List) obj;
                kotlin.jvm.internal.k.e(key, "key");
                if (list3 != null) {
                    bundle.putIntArray(key, ie.j.Y(list3));
                    return;
                }
                return;
            case 6:
                long[] jArr = (long[]) obj;
                kotlin.jvm.internal.k.e(key, "key");
                if (jArr != null) {
                    bundle.putLongArray(key, jArr);
                    return;
                } else {
                    c9.a.l(key, bundle);
                    return;
                }
            case 7:
                List list4 = (List) obj;
                kotlin.jvm.internal.k.e(key, "key");
                if (list4 != null) {
                    long[] jArr2 = new long[list4.size()];
                    Iterator it2 = list4.iterator();
                    int i10 = 0;
                    while (it2.hasNext()) {
                        jArr2[i10] = ((Number) it2.next()).longValue();
                        i10++;
                    }
                    bundle.putLongArray(key, jArr2);
                    return;
                }
                c9.a.l(key, bundle);
                return;
            case 8:
                String[] strArr = (String[]) obj;
                kotlin.jvm.internal.k.e(key, "key");
                if (strArr != null) {
                    bundle.putStringArray(key, strArr);
                    return;
                } else {
                    c9.a.l(key, bundle);
                    return;
                }
            default:
                List list5 = (List) obj;
                kotlin.jvm.internal.k.e(key, "key");
                if (list5 != null) {
                    String[] value = (String[]) list5.toArray(new String[0]);
                    kotlin.jvm.internal.k.e(value, "value");
                    bundle.putStringArray(key, value);
                    return;
                }
                c9.a.l(key, bundle);
                return;
        }
    }
}
