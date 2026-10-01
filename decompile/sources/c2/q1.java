package c2;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends t1.s0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f1893k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o2.f1 f1895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1897e;
    public final int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f1898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t1.s0[] f1899h;
    public final Object[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f1900j;

    /* JADX WARN: Illegal instructions before constructor call */
    public q1(ArrayList arrayList, o2.f1 f1Var) {
        t1.s0[] s0VarArr = new t1.s0[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            s0VarArr[i10] = ((a1) obj).b();
            i10++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            objArr[i] = ((a1) obj2).a();
            i++;
        }
        this(s0VarArr, objArr, f1Var);
    }

    @Override // t1.s0
    public final int a(boolean z2) {
        if (this.f1894b != 0) {
            int iQ = 0;
            if (z2) {
                int[] iArr = this.f1895c.f9421b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                t1.s0[] s0VarArr = this.f1899h;
                if (!s0VarArr[iQ].p()) {
                    return s0VarArr[iQ].a(z2) + this.f1898g[iQ];
                }
                iQ = q(iQ, z2);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // t1.s0
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f1900j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.f1899h[iIntValue].b(obj3)) != -1) {
                return this.f[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // t1.s0
    public final int c(boolean z2) {
        int iR;
        int i = this.f1894b;
        if (i != 0) {
            if (z2) {
                int[] iArr = this.f1895c.f9421b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i - 1;
            }
            do {
                t1.s0[] s0VarArr = this.f1899h;
                if (!s0VarArr[iR].p()) {
                    return s0VarArr[iR].c(z2) + this.f1898g[iR];
                }
                iR = r(iR, z2);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // t1.s0
    public final int e(int i, int i10, boolean z2) {
        int[] iArr = this.f1898g;
        int iD = w1.b0.d(iArr, i + 1, false, false);
        int i11 = iArr[iD];
        t1.s0[] s0VarArr = this.f1899h;
        int iE = s0VarArr[iD].e(i - i11, i10 != 2 ? i10 : 0, z2);
        if (iE != -1) {
            return i11 + iE;
        }
        int iQ = q(iD, z2);
        while (iQ != -1 && s0VarArr[iQ].p()) {
            iQ = q(iQ, z2);
        }
        if (iQ != -1) {
            return s0VarArr[iQ].a(z2) + iArr[iQ];
        }
        if (i10 == 2) {
            return a(z2);
        }
        return -1;
    }

    @Override // t1.s0
    public final t1.q0 f(int i, t1.q0 q0Var, boolean z2) {
        int[] iArr = this.f;
        int iD = w1.b0.d(iArr, i + 1, false, false);
        int i10 = this.f1898g[iD];
        this.f1899h[iD].f(i - iArr[iD], q0Var, z2);
        q0Var.f12088c += i10;
        if (z2) {
            Object obj = this.i[iD];
            Object obj2 = q0Var.f12087b;
            obj2.getClass();
            q0Var.f12087b = Pair.create(obj, obj2);
        }
        return q0Var;
    }

    @Override // t1.s0
    public final t1.q0 g(Object obj, t1.q0 q0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f1900j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.f1898g[iIntValue];
        this.f1899h[iIntValue].g(obj3, q0Var);
        q0Var.f12088c += i;
        q0Var.f12087b = obj;
        return q0Var;
    }

    @Override // t1.s0
    public final int h() {
        return this.f1897e;
    }

    @Override // t1.s0
    public final int k(int i, int i10, boolean z2) {
        int[] iArr = this.f1898g;
        int iD = w1.b0.d(iArr, i + 1, false, false);
        int i11 = iArr[iD];
        t1.s0[] s0VarArr = this.f1899h;
        int iK = s0VarArr[iD].k(i - i11, i10 != 2 ? i10 : 0, z2);
        if (iK != -1) {
            return i11 + iK;
        }
        int iR = r(iD, z2);
        while (iR != -1 && s0VarArr[iR].p()) {
            iR = r(iR, z2);
        }
        if (iR != -1) {
            return s0VarArr[iR].c(z2) + iArr[iR];
        }
        if (i10 == 2) {
            return c(z2);
        }
        return -1;
    }

    @Override // t1.s0
    public final Object l(int i) {
        int[] iArr = this.f;
        int iD = w1.b0.d(iArr, i + 1, false, false);
        return Pair.create(this.i[iD], this.f1899h[iD].l(i - iArr[iD]));
    }

    @Override // t1.s0
    public final t1.r0 m(int i, t1.r0 r0Var, long j8) {
        int[] iArr = this.f1898g;
        int iD = w1.b0.d(iArr, i + 1, false, false);
        int i10 = iArr[iD];
        int i11 = this.f[iD];
        this.f1899h[iD].m(i - i10, r0Var, j8);
        Object objCreate = this.i[iD];
        if (!t1.r0.f12093q.equals(r0Var.f12095a)) {
            objCreate = Pair.create(objCreate, r0Var.f12095a);
        }
        r0Var.f12095a = objCreate;
        r0Var.f12106n += i11;
        r0Var.f12107o += i11;
        return r0Var;
    }

    @Override // t1.s0
    public final int o() {
        return this.f1896d;
    }

    public final int q(int i, boolean z2) {
        if (!z2) {
            if (i < this.f1894b - 1) {
                return i + 1;
            }
            return -1;
        }
        o2.f1 f1Var = this.f1895c;
        int i10 = f1Var.f9422c[i] + 1;
        int[] iArr = f1Var.f9421b;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public final int r(int i, boolean z2) {
        if (!z2) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        o2.f1 f1Var = this.f1895c;
        int i10 = f1Var.f9422c[i] - 1;
        if (i10 >= 0) {
            return f1Var.f9421b[i10];
        }
        return -1;
    }

    public q1(t1.s0[] s0VarArr, Object[] objArr, o2.f1 f1Var) {
        this.f1895c = f1Var;
        this.f1894b = f1Var.f9421b.length;
        int length = s0VarArr.length;
        this.f1899h = s0VarArr;
        this.f = new int[length];
        this.f1898g = new int[length];
        this.i = objArr;
        this.f1900j = new HashMap();
        int length2 = s0VarArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i10 = 0;
        while (i < length2) {
            t1.s0 s0Var = s0VarArr[i];
            this.f1899h[i10] = s0Var;
            this.f1898g[i10] = iO;
            this.f[i10] = iH;
            iO += s0Var.o();
            iH += this.f1899h[i10].h();
            this.f1900j.put(objArr[i10], Integer.valueOf(i10));
            i++;
            i10++;
        }
        this.f1896d = iO;
        this.f1897e = iH;
    }
}
