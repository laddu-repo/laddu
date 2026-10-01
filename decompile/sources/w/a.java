package w;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f13508a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f13509b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f13510c = new Object[0];

    public static final int a(int i6, int i10, int[] array) {
        k.e(array, "array");
        int i11 = i6 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = array[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else if (i14 > i10) {
                i11 = i13 - 1;
            } else {
                return i13;
            }
        }
        return ~i12;
    }

    public static final int b(long[] array, int i6, long j) {
        k.e(array, "array");
        int i10 = i6 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j10 = array[i12];
            if (j10 < j) {
                i11 = i12 + 1;
            } else if (j10 > j) {
                i10 = i12 - 1;
            } else {
                return i12;
            }
        }
        return ~i11;
    }
}
