package re;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import me.l0;
import me.m0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11409b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0[] f11410a;

    public final void a(l0 l0Var) {
        l0Var.e((m0) this);
        l0[] l0VarArr = this.f11410a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11409b;
        if (l0VarArr == null) {
            l0VarArr = new l0[4];
            this.f11410a = l0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= l0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(l0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            de.i.d(objArrCopyOf, "copyOf(...)");
            l0VarArr = (l0[]) objArrCopyOf;
            this.f11410a = l0VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        l0VarArr[i] = l0Var;
        l0Var.f8708w = i;
        d(i);
    }

    public final void b(l0 l0Var) {
        synchronized (this) {
            if (l0Var.a() != null) {
                c(l0Var.f8708w);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final me.l0 c(int r9) {
        /*
            r8 = this;
            me.l0[] r0 = r8.f11410a
            de.i.b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = re.x.f11409b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.e(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            de.i.b(r4)
            r5 = r0[r2]
            de.i.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.e(r9, r2)
            r8.d(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            me.l0[] r5 = r8.f11410a
            de.i.b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            de.i.b(r6)
            r7 = r5[r4]
            de.i.b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            de.i.b(r4)
            r5 = r5[r2]
            de.i.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.e(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            de.i.b(r9)
            r2 = 0
            r9.e(r2)
            r9.f8708w = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: re.x.c(int):me.l0");
    }

    public final void d(int i) {
        while (i > 0) {
            l0[] l0VarArr = this.f11410a;
            de.i.b(l0VarArr);
            int i10 = (i - 1) / 2;
            l0 l0Var = l0VarArr[i10];
            de.i.b(l0Var);
            l0 l0Var2 = l0VarArr[i];
            de.i.b(l0Var2);
            if (l0Var.compareTo(l0Var2) <= 0) {
                return;
            }
            e(i, i10);
            i = i10;
        }
    }

    public final void e(int i, int i10) {
        l0[] l0VarArr = this.f11410a;
        de.i.b(l0VarArr);
        l0 l0Var = l0VarArr[i10];
        de.i.b(l0Var);
        l0 l0Var2 = l0VarArr[i];
        de.i.b(l0Var2);
        l0VarArr[i] = l0Var;
        l0VarArr[i10] = l0Var2;
        l0Var.f8708w = i;
        l0Var2.f8708w = i10;
    }
}
