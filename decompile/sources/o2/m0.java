package o2;

import c2.u1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements b0, a0 {
    public a0 B;
    public j1 C;
    public b0[] D;
    public n E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b0[] f9481v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean[] f9482w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final IdentityHashMap f9483x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k8.a0 f9484y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f9485z = new ArrayList();
    public final HashMap A = new HashMap();

    public m0(k8.a0 a0Var, long[] jArr, b0... b0VarArr) {
        this.f9484y = a0Var;
        this.f9481v = b0VarArr;
        a0Var.getClass();
        y9.c0 c0Var = y9.f0.f14553w;
        y9.z0 z0Var = y9.z0.f14637z;
        this.E = new n(z0Var, z0Var);
        this.f9483x = new IdentityHashMap();
        this.D = new b0[0];
        this.f9482w = new boolean[b0VarArr.length];
        for (int i = 0; i < b0VarArr.length; i++) {
            long j8 = jArr[i];
            if (j8 != 0) {
                this.f9482w[i] = true;
                this.f9481v[i] = new i1(b0VarArr[i], j8);
            }
        }
    }

    @Override // o2.d1
    public final void a(e1 e1Var) {
        a0 a0Var = this.B;
        a0Var.getClass();
        a0Var.a(this);
    }

    @Override // o2.e1
    public final boolean c() {
        return this.E.c();
    }

    @Override // o2.e1
    public final boolean d(c2.v0 v0Var) {
        ArrayList arrayList = this.f9485z;
        if (arrayList.isEmpty()) {
            return this.E.d(v0Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b0) arrayList.get(i)).d(v0Var);
        }
        return false;
    }

    @Override // o2.e1
    public final long h() {
        return this.E.h();
    }

    @Override // o2.b0
    public final void i(boolean z2, long j8) {
        for (b0 b0Var : this.D) {
            b0Var.i(z2, j8);
        }
    }

    @Override // o2.b0
    public final long j() {
        long j8 = -9223372036854775807L;
        for (b0 b0Var : this.D) {
            long j9 = b0Var.j();
            if (j9 == -9223372036854775807L) {
                if (j8 != -9223372036854775807L && b0Var.w(j8) != j8) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j8 == -9223372036854775807L) {
                for (b0 b0Var2 : this.D) {
                    if (b0Var2 == b0Var) {
                        break;
                    }
                    if (b0Var2.w(j9) != j9) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j8 = j9;
            } else if (j9 != j8) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j8;
    }

    @Override // o2.b0
    public final long l(long j8, u1 u1Var) {
        b0[] b0VarArr = this.D;
        return (b0VarArr.length > 0 ? b0VarArr[0] : this.f9481v[0]).l(j8, u1Var);
    }

    @Override // o2.b0
    public final long m(r2.s[] sVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j8) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[sVarArr.length];
        int[] iArr3 = new int[sVarArr.length];
        int i = 0;
        int i10 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = this.f9483x;
            if (i10 >= length) {
                break;
            }
            c1 c1Var = c1VarArr[i10];
            Integer num = c1Var == null ? null : (Integer) identityHashMap.get(c1Var);
            iArr2[i10] = num == null ? -1 : num.intValue();
            r2.s sVar = sVarArr[i10];
            if (sVar != null) {
                String str = sVar.j().f12112b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        c1[] c1VarArr2 = new c1[length2];
        c1[] c1VarArr3 = new c1[sVarArr.length];
        r2.s[] sVarArr2 = new r2.s[sVarArr.length];
        b0[] b0VarArr = this.f9481v;
        ArrayList arrayList = new ArrayList(b0VarArr.length);
        long j9 = j8;
        int i11 = 0;
        while (i11 < b0VarArr.length) {
            int i12 = i;
            while (i12 < sVarArr.length) {
                c1VarArr3[i12] = iArr2[i12] == i11 ? c1VarArr[i12] : null;
                if (iArr3[i12] == i11) {
                    r2.s sVar2 = sVarArr[i12];
                    sVar2.getClass();
                    iArr = iArr2;
                    t1.t0 t0Var = (t1.t0) this.A.get(sVar2.j());
                    t0Var.getClass();
                    sVarArr2[i12] = new l0(sVar2, t0Var);
                } else {
                    iArr = iArr2;
                    sVarArr2[i12] = null;
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            b0[] b0VarArr2 = b0VarArr;
            int i13 = i11;
            long jM = b0VarArr2[i11].m(sVarArr2, zArr, c1VarArr3, zArr2, j9);
            if (i13 == 0) {
                j9 = jM;
            } else if (jM != j9) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z2 = false;
            for (int i14 = 0; i14 < sVarArr.length; i14++) {
                if (iArr3[i14] == i13) {
                    c1 c1Var2 = c1VarArr3[i14];
                    c1Var2.getClass();
                    c1VarArr2[i14] = c1VarArr3[i14];
                    identityHashMap.put(c1Var2, Integer.valueOf(i13));
                    z2 = true;
                } else if (iArr4[i14] == i13) {
                    w1.a.j(c1VarArr3[i14] == null);
                }
            }
            if (z2) {
                arrayList.add(b0VarArr2[i13]);
            }
            i11 = i13 + 1;
            b0VarArr = b0VarArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i15 = i;
        System.arraycopy(c1VarArr2, i15, c1VarArr, i15, length2);
        this.D = (b0[]) arrayList.toArray(new b0[i15]);
        AbstractList abstractListY = y9.p.y(arrayList, new c2.q(4));
        this.f9484y.getClass();
        this.E = new n(arrayList, abstractListY);
        return j9;
    }

    @Override // o2.b0
    public final void n(a0 a0Var, long j8) {
        this.B = a0Var;
        ArrayList arrayList = this.f9485z;
        b0[] b0VarArr = this.f9481v;
        Collections.addAll(arrayList, b0VarArr);
        for (b0 b0Var : b0VarArr) {
            b0Var.n(this, j8);
        }
    }

    @Override // o2.b0
    public final j1 q() {
        j1 j1Var = this.C;
        j1Var.getClass();
        return j1Var;
    }

    @Override // o2.a0
    public final void s(b0 b0Var) {
        ArrayList arrayList = this.f9485z;
        arrayList.remove(b0Var);
        if (arrayList.isEmpty()) {
            b0[] b0VarArr = this.f9481v;
            int i = 0;
            for (b0 b0Var2 : b0VarArr) {
                i += b0Var2.q().f9468a;
            }
            t1.t0[] t0VarArr = new t1.t0[i];
            int i10 = 0;
            for (int i11 = 0; i11 < b0VarArr.length; i11++) {
                j1 j1VarQ = b0VarArr[i11].q();
                int i12 = j1VarQ.f9468a;
                int i13 = 0;
                while (i13 < i12) {
                    t1.t0 t0VarA = j1VarQ.a(i13);
                    int i14 = t0VarA.f12111a;
                    t1.o[] oVarArr = new t1.o[i14];
                    for (int i15 = 0; i15 < i14; i15++) {
                        t1.o oVar = t0VarA.f12114d[i15];
                        t1.n nVarA = oVar.a();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i11);
                        sb2.append(":");
                        String str = oVar.f12050a;
                        if (str == null) {
                            str = "";
                        }
                        sb2.append(str);
                        nVarA.f12026a = sb2.toString();
                        oVarArr[i15] = new t1.o(nVarA);
                    }
                    t1.t0 t0Var = new t1.t0(i11 + ":" + t0VarA.f12112b, oVarArr);
                    this.A.put(t0Var, t0VarA);
                    t0VarArr[i10] = t0Var;
                    i13++;
                    i10++;
                }
            }
            this.C = new j1(t0VarArr);
            a0 a0Var = this.B;
            a0Var.getClass();
            a0Var.s(this);
        }
    }

    @Override // o2.e1
    public final long u() {
        return this.E.u();
    }

    @Override // o2.b0
    public final void v() {
        for (b0 b0Var : this.f9481v) {
            b0Var.v();
        }
    }

    @Override // o2.b0
    public final long w(long j8) {
        long jW = this.D[0].w(j8);
        int i = 1;
        while (true) {
            b0[] b0VarArr = this.D;
            if (i >= b0VarArr.length) {
                return jW;
            }
            if (b0VarArr[i].w(jW) != jW) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // o2.e1
    public final void x(long j8) {
        this.E.x(j8);
    }
}
