package v;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f13163a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f13164b = new Object();

    public static final void a(m mVar) {
        int i6 = mVar.A;
        int[] iArr = mVar.f13176y;
        Object[] objArr = mVar.f13177z;
        int i10 = 0;
        for (int i11 = 0; i11 < i6; i11++) {
            Object obj = objArr[i11];
            if (obj != f13164b) {
                if (i11 != i10) {
                    iArr[i10] = iArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        mVar.f13175x = false;
        mVar.A = i10;
    }

    public static final void b(f fVar, int i6) {
        fVar.f13149x = new int[i6];
        fVar.f13150y = new Object[i6];
    }

    public static final int c(f fVar, Object obj, int i6) {
        int i10 = fVar.f13151z;
        if (i10 == 0) {
            return -1;
        }
        try {
            int a10 = w.a.a(i10, i6, fVar.f13149x);
            if (a10 < 0 || kotlin.jvm.internal.k.a(obj, fVar.f13150y[a10])) {
                return a10;
            }
            int i11 = a10 + 1;
            while (i11 < i10 && fVar.f13149x[i11] == i6) {
                if (kotlin.jvm.internal.k.a(obj, fVar.f13150y[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a10 - 1; i12 >= 0 && fVar.f13149x[i12] == i6; i12--) {
                if (kotlin.jvm.internal.k.a(obj, fVar.f13150y[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
