package s0;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f11961a;

    /* renamed from: b, reason: collision with root package name */
    public int f11962b;

    public c(int i6) {
        if (i6 > 0) {
            this.f11961a = new Object[i6];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public Object a() {
        int i6 = this.f11962b;
        if (i6 <= 0) {
            return null;
        }
        int i10 = i6 - 1;
        Object[] objArr = this.f11961a;
        Object obj = objArr[i10];
        k.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f11962b--;
        return obj;
    }

    public void b(y.b bVar) {
        int i6 = this.f11962b;
        Object[] objArr = this.f11961a;
        if (i6 < objArr.length) {
            objArr[i6] = bVar;
            this.f11962b = i6 + 1;
        }
    }

    public boolean c(Object instance) {
        Object[] objArr;
        boolean z10;
        k.e(instance, "instance");
        int i6 = this.f11962b;
        int i10 = 0;
        while (true) {
            objArr = this.f11961a;
            if (i10 < i6) {
                if (objArr[i10] == instance) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            int i11 = this.f11962b;
            if (i11 >= objArr.length) {
                return false;
            }
            objArr[i11] = instance;
            this.f11962b = i11 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public c() {
        this.f11961a = new Object[256];
    }
}
