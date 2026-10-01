package mf;

import gf.v0;
import gf.w0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8848b = AtomicIntegerFieldUpdater.newUpdater(a0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public v0[] f8849a;

    public final void a(v0 v0Var) {
        v0Var.e((w0) this);
        v0[] v0VarArr = this.f8849a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8848b;
        if (v0VarArr == null) {
            v0VarArr = new v0[4];
            this.f8849a = v0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= v0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(v0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
            v0VarArr = (v0[]) copyOf;
            this.f8849a = v0VarArr;
        }
        int i6 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i6 + 1);
        v0VarArr[i6] = v0Var;
        v0Var.f5719y = i6;
        e(i6);
    }

    public final v0 b() {
        v0 v0Var;
        synchronized (this) {
            v0[] v0VarArr = this.f8849a;
            if (v0VarArr != null) {
                v0Var = v0VarArr[0];
            } else {
                v0Var = null;
            }
        }
        return v0Var;
    }

    public final void c(v0 v0Var) {
        synchronized (this) {
            if (v0Var.a() != null) {
                d(v0Var.f5719y);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final gf.v0 d(int r9) {
        /*
            r8 = this;
            gf.v0[] r0 = r8.f8849a
            kotlin.jvm.internal.k.b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = mf.a0.f8848b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.f(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.k.b(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.k.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.f(r9, r2)
            r8.e(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            gf.v0[] r5 = r8.f8849a
            kotlin.jvm.internal.k.b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.k.b(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.k.b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.k.b(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.k.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.f(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.k.b(r9)
            r2 = 0
            r9.e(r2)
            r9.f5719y = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.a0.d(int):gf.v0");
    }

    public final void e(int i6) {
        while (i6 > 0) {
            v0[] v0VarArr = this.f8849a;
            kotlin.jvm.internal.k.b(v0VarArr);
            int i10 = (i6 - 1) / 2;
            v0 v0Var = v0VarArr[i10];
            kotlin.jvm.internal.k.b(v0Var);
            v0 v0Var2 = v0VarArr[i6];
            kotlin.jvm.internal.k.b(v0Var2);
            if (v0Var.compareTo(v0Var2) <= 0) {
                return;
            }
            f(i6, i10);
            i6 = i10;
        }
    }

    public final void f(int i6, int i10) {
        v0[] v0VarArr = this.f8849a;
        kotlin.jvm.internal.k.b(v0VarArr);
        v0 v0Var = v0VarArr[i10];
        kotlin.jvm.internal.k.b(v0Var);
        v0 v0Var2 = v0VarArr[i6];
        kotlin.jvm.internal.k.b(v0Var2);
        v0VarArr[i6] = v0Var;
        v0VarArr[i10] = v0Var2;
        v0Var.f5719y = i6;
        v0Var2.f5719y = i10;
    }
}
