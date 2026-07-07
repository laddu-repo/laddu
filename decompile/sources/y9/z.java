package y9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f14634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14636c;

    public z(int i) {
        p.d(i, "initialCapacity");
        this.f14634a = new Object[i];
        this.f14635b = 0;
    }

    public static int f(int i, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i10 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i10) {
            iHighestOneBit = Integer.highestOneBit(i10 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f14634a;
        int i = this.f14635b;
        this.f14635b = i + 1;
        objArr[i] = obj;
    }

    public final void b(Object... objArr) {
        int length = objArr.length;
        p.b(length, objArr);
        e(length);
        System.arraycopy(objArr, 0, this.f14634a, this.f14635b, length);
        this.f14635b += length;
    }

    public abstract z c(Object obj);

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof a0) {
                this.f14635b = ((a0) collection).b(this.f14635b, this.f14634a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void e(int i) {
        Object[] objArr = this.f14634a;
        int iF = f(objArr.length, this.f14635b + i);
        if (iF > objArr.length || this.f14636c) {
            this.f14634a = Arrays.copyOf(this.f14634a, iF);
            this.f14636c = false;
        }
    }
}
