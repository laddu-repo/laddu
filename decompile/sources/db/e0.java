package db;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f3995a;

    /* renamed from: b, reason: collision with root package name */
    public int f3996b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3997c;

    public e0(int i6) {
        r.e(i6, "initialCapacity");
        this.f3995a = new Object[i6];
        this.f3996b = 0;
    }

    public static int f(int i6, int i10) {
        if (i10 >= 0) {
            if (i10 <= i6) {
                return i6;
            }
            int i11 = i6 + (i6 >> 1) + 1;
            if (i11 < i10) {
                i11 = Integer.highestOneBit(i10 - 1) << 1;
            }
            if (i11 < 0) {
                return Integer.MAX_VALUE;
            }
            return i11;
        }
        throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f3995a;
        int i6 = this.f3996b;
        this.f3996b = i6 + 1;
        objArr[i6] = obj;
    }

    public final void b(Object... objArr) {
        int length = objArr.length;
        r.c(length, objArr);
        e(length);
        System.arraycopy(objArr, 0, this.f3995a, this.f3996b, length);
        this.f3996b += length;
    }

    public abstract e0 c(Object obj);

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof f0) {
                this.f3996b = ((f0) collection).b(this.f3996b, this.f3995a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void e(int i6) {
        Object[] objArr = this.f3995a;
        int f3 = f(objArr.length, this.f3996b + i6);
        if (f3 <= objArr.length && !this.f3997c) {
            return;
        }
        this.f3995a = Arrays.copyOf(this.f3995a, f3);
        this.f3997c = false;
    }
}
