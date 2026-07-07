package q2;

import com.google.android.gms.internal.measurement.e5;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m0 extends l {
    public static final r1.e0 P;
    public final a[] H;
    public final ArrayList I;
    public final r1.d1[] J;
    public final ArrayList K;
    public final o5.e0 L;
    public int M;
    public long[][] N;
    public e5 O;

    /* JADX WARN: Type inference failed for: r4v0, types: [r1.w, r1.x] */
    static {
        r1.v vVar = new r1.v();
        db.i0 i0Var = db.k0.f4008y;
        db.c1 c1Var = db.c1.B;
        List list = Collections.EMPTY_LIST;
        db.c1 c1Var2 = db.c1.B;
        e2.t tVar = new e2.t();
        P = new r1.e0("MergingMediaSource", new r1.w(vVar), null, new r1.z(tVar), r1.h0.K, r1.b0.f11307d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o5.e0, java.lang.Object] */
    public m0(a... aVarArr) {
        ?? obj = new Object();
        this.H = aVarArr;
        this.L = obj;
        this.K = new ArrayList(Arrays.asList(aVarArr));
        this.M = -1;
        this.I = new ArrayList(aVarArr.length);
        for (int i6 = 0; i6 < aVarArr.length; i6++) {
            this.I.add(new ArrayList());
        }
        this.J = new r1.d1[aVarArr.length];
        this.N = new long[0];
        new HashMap();
        db.r.e(8, "expectedKeys");
        db.r.e(2, "expectedValuesPerKey");
        new db.y0(db.v.b(8)).C = new db.x0();
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [com.google.android.gms.internal.measurement.e5, java.io.IOException] */
    @Override // q2.l
    public final void A(Object obj, a aVar, r1.d1 d1Var) {
        Integer num = (Integer) obj;
        if (this.O == null) {
            if (this.M == -1) {
                this.M = d1Var.h();
            } else if (d1Var.h() != this.M) {
                this.O = new IOException();
                return;
            }
            int length = this.N.length;
            r1.d1[] d1VarArr = this.J;
            if (length == 0) {
                this.N = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.M, d1VarArr.length);
            }
            ArrayList arrayList = this.K;
            arrayList.remove(aVar);
            d1VarArr[num.intValue()] = d1Var;
            if (arrayList.isEmpty()) {
                p(d1VarArr[0]);
            }
        }
    }

    @Override // q2.a
    public final boolean a(r1.e0 e0Var) {
        a[] aVarArr = this.H;
        if (aVarArr.length <= 0 || !aVarArr[0].a(e0Var)) {
            return false;
        }
        return true;
    }

    @Override // q2.a
    public final a0 c(c0 c0Var, u2.e eVar, long j) {
        a[] aVarArr = this.H;
        int length = aVarArr.length;
        a0[] a0VarArr = new a0[length];
        r1.d1[] d1VarArr = this.J;
        int b10 = d1VarArr[0].b(c0Var.f10834a);
        for (int i6 = 0; i6 < length; i6++) {
            c0 a10 = c0Var.a(d1VarArr[i6].l(b10));
            a0VarArr[i6] = aVarArr[i6].c(a10, eVar, j - this.N[b10][i6]);
            ((List) this.I.get(i6)).add(new l0(a10, a0VarArr[i6]));
        }
        return new k0(this.L, this.N[b10], a0VarArr);
    }

    @Override // q2.a
    public final r1.e0 i() {
        a[] aVarArr = this.H;
        if (aVarArr.length > 0) {
            return aVarArr[0].i();
        }
        return P;
    }

    @Override // q2.l, q2.a
    public final void l() {
        e5 e5Var = this.O;
        if (e5Var == null) {
            super.l();
            return;
        }
        throw e5Var;
    }

    @Override // q2.a
    public final void n(w1.a0 a0Var) {
        this.G = a0Var;
        this.F = u1.a0.n(null);
        int i6 = 0;
        while (true) {
            a[] aVarArr = this.H;
            if (i6 < aVarArr.length) {
                B(Integer.valueOf(i6), aVarArr[i6]);
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // q2.a
    public final void q(a0 a0Var) {
        a0 a0Var2;
        a0 a0Var3;
        k0 k0Var = (k0) a0Var;
        int i6 = 0;
        while (true) {
            a[] aVarArr = this.H;
            if (i6 < aVarArr.length) {
                List list = (List) this.I.get(i6);
                a0[] a0VarArr = k0Var.f10904x;
                boolean[] zArr = k0Var.f10905y;
                if (zArr[i6]) {
                    a0Var2 = ((j1) a0VarArr[i6]).f10898x;
                } else {
                    a0Var2 = a0VarArr[i6];
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    }
                    if (((l0) list.get(i10)).f10913b.equals(a0Var2)) {
                        list.remove(i10);
                        break;
                    }
                    i10++;
                }
                a aVar = aVarArr[i6];
                a0[] a0VarArr2 = k0Var.f10904x;
                if (zArr[i6]) {
                    a0Var3 = ((j1) a0VarArr2[i6]).f10898x;
                } else {
                    a0Var3 = a0VarArr2[i6];
                }
                aVar.q(a0Var3);
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // q2.l, q2.a
    public final void s() {
        super.s();
        Arrays.fill(this.J, (Object) null);
        this.M = -1;
        this.O = null;
        ArrayList arrayList = this.K;
        arrayList.clear();
        Collections.addAll(arrayList, this.H);
    }

    @Override // q2.a
    public final void v(r1.e0 e0Var) {
        this.H[0].v(e0Var);
    }

    @Override // q2.l
    public final c0 w(Object obj, c0 c0Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.I;
        List list = (List) arrayList.get(intValue);
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (((l0) list.get(i6)).f10912a.equals(c0Var)) {
                return ((l0) ((List) arrayList.get(0)).get(i6)).f10912a;
            }
        }
        return null;
    }
}
