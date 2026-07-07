package q2;

import a2.c2;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k0 implements a0, z {
    public final o5.e0 A;
    public final ArrayList B = new ArrayList();
    public final HashMap C = new HashMap();
    public z D;
    public k1 E;
    public a0[] F;
    public n G;

    /* renamed from: x, reason: collision with root package name */
    public final a0[] f10904x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean[] f10905y;

    /* renamed from: z, reason: collision with root package name */
    public final IdentityHashMap f10906z;

    public k0(o5.e0 e0Var, long[] jArr, a0... a0VarArr) {
        this.A = e0Var;
        this.f10904x = a0VarArr;
        e0Var.getClass();
        db.i0 i0Var = db.k0.f4008y;
        db.c1 c1Var = db.c1.B;
        this.G = new n(c1Var, c1Var);
        this.f10906z = new IdentityHashMap();
        this.F = new a0[0];
        this.f10905y = new boolean[a0VarArr.length];
        for (int i6 = 0; i6 < a0VarArr.length; i6++) {
            long j = jArr[i6];
            if (j != 0) {
                this.f10905y[i6] = true;
                this.f10904x[i6] = new j1(a0VarArr[i6], j);
            }
        }
    }

    @Override // q2.b1
    public final boolean a() {
        return this.G.a();
    }

    @Override // q2.a0
    public final long c(long j, c2 c2Var) {
        a0 a0Var;
        a0[] a0VarArr = this.F;
        if (a0VarArr.length > 0) {
            a0Var = a0VarArr[0];
        } else {
            a0Var = this.f10904x[0];
        }
        return a0Var.c(j, c2Var);
    }

    @Override // q2.b1
    public final long e() {
        return this.G.e();
    }

    @Override // q2.b1
    public final boolean f(a2.a1 a1Var) {
        ArrayList arrayList = this.B;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((a0) arrayList.get(i6)).f(a1Var);
            }
            return false;
        }
        return this.G.f(a1Var);
    }

    @Override // q2.a0
    public final void g() {
        for (a0 a0Var : this.f10904x) {
            a0Var.g();
        }
    }

    @Override // q2.a0
    public final long h(long j) {
        long h4 = this.F[0].h(j);
        int i6 = 1;
        while (true) {
            a0[] a0VarArr = this.F;
            if (i6 < a0VarArr.length) {
                if (a0VarArr[i6].h(h4) == h4) {
                    i6++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return h4;
            }
        }
    }

    @Override // q2.a0
    public final void i(long j) {
        for (a0 a0Var : this.F) {
            a0Var.i(j);
        }
    }

    @Override // q2.a1
    public final void j(b1 b1Var) {
        z zVar = this.D;
        zVar.getClass();
        zVar.j(this);
    }

    @Override // q2.z
    public final void k(a0 a0Var) {
        ArrayList arrayList = this.B;
        arrayList.remove(a0Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        a0[] a0VarArr = this.f10904x;
        int i6 = 0;
        for (a0 a0Var2 : a0VarArr) {
            i6 += a0Var2.q().f10909a;
        }
        r1.e1[] e1VarArr = new r1.e1[i6];
        int i10 = 0;
        for (int i11 = 0; i11 < a0VarArr.length; i11++) {
            k1 q9 = a0VarArr[i11].q();
            int i12 = q9.f10909a;
            int i13 = 0;
            while (i13 < i12) {
                r1.e1 a10 = q9.a(i13);
                int i14 = a10.f11386a;
                r1.q[] qVarArr = new r1.q[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    r1.q qVar = a10.f11389d[i15];
                    r1.p a11 = qVar.a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append(":");
                    String str = qVar.f11658a;
                    if (str == null) {
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    sb2.append(str);
                    a11.f11600a = sb2.toString();
                    qVarArr[i15] = new r1.q(a11);
                }
                r1.e1 e1Var = new r1.e1(i11 + ":" + a10.f11387b, qVarArr);
                this.C.put(e1Var, a10);
                e1VarArr[i10] = e1Var;
                i13++;
                i10++;
            }
        }
        this.E = new k1(e1VarArr);
        z zVar = this.D;
        zVar.getClass();
        zVar.k(this);
    }

    @Override // q2.a0
    public final void l(z zVar, long j) {
        this.D = zVar;
        ArrayList arrayList = this.B;
        a0[] a0VarArr = this.f10904x;
        Collections.addAll(arrayList, a0VarArr);
        for (a0 a0Var : a0VarArr) {
            a0Var.l(this, j);
        }
    }

    @Override // q2.a0
    public final long m() {
        long j = -9223372036854775807L;
        for (a0 a0Var : this.F) {
            long m9 = a0Var.m();
            if (m9 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (a0 a0Var2 : this.F) {
                        if (a0Var2 == a0Var) {
                            break;
                        }
                        if (a0Var2.h(m9) != m9) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = m9;
                } else if (m9 != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && a0Var.h(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // q2.a0
    public final long p(t2.s[] sVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        z0 z0Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[sVarArr.length];
        int[] iArr3 = new int[sVarArr.length];
        int i6 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = this.f10906z;
            if (i6 >= length) {
                break;
            }
            z0 z0Var2 = z0VarArr[i6];
            if (z0Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(z0Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr2[i6] = intValue;
            t2.s sVar = sVarArr[i6];
            if (sVar != null) {
                String str = sVar.c().f11387b;
                iArr3[i6] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i6] = -1;
            }
            i6++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        z0[] z0VarArr2 = new z0[length2];
        z0[] z0VarArr3 = new z0[sVarArr.length];
        t2.s[] sVarArr2 = new t2.s[sVarArr.length];
        a0[] a0VarArr = this.f10904x;
        ArrayList arrayList = new ArrayList(a0VarArr.length);
        long j10 = j;
        int i10 = 0;
        while (i10 < a0VarArr.length) {
            int i11 = 0;
            while (i11 < sVarArr.length) {
                if (iArr2[i11] == i10) {
                    z0Var = z0VarArr[i11];
                } else {
                    z0Var = null;
                }
                z0VarArr3[i11] = z0Var;
                if (iArr3[i11] == i10) {
                    t2.s sVar2 = sVarArr[i11];
                    sVar2.getClass();
                    iArr = iArr2;
                    r1.e1 e1Var = (r1.e1) this.C.get(sVar2.c());
                    e1Var.getClass();
                    sVarArr2[i11] = new j0(sVar2, e1Var);
                } else {
                    iArr = iArr2;
                    sVarArr2[i11] = null;
                }
                i11++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            a0[] a0VarArr2 = a0VarArr;
            int i12 = i10;
            long p10 = a0VarArr2[i10].p(sVarArr2, zArr, z0VarArr3, zArr2, j10);
            if (i12 == 0) {
                j10 = p10;
            } else if (p10 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i13 = 0; i13 < sVarArr.length; i13++) {
                boolean z11 = true;
                if (iArr3[i13] == i12) {
                    z0 z0Var3 = z0VarArr3[i13];
                    z0Var3.getClass();
                    z0VarArr2[i13] = z0VarArr3[i13];
                    identityHashMap.put(z0Var3, Integer.valueOf(i12));
                    z10 = true;
                } else if (iArr4[i13] == i12) {
                    if (z0VarArr3[i13] != null) {
                        z11 = false;
                    }
                    u1.c.g(z11);
                }
            }
            if (z10) {
                arrayList.add(a0VarArr2[i12]);
            }
            i10 = i12 + 1;
            a0VarArr = a0VarArr2;
            iArr2 = iArr4;
        }
        System.arraycopy(z0VarArr2, 0, z0VarArr, 0, length2);
        this.F = (a0[]) arrayList.toArray(new a0[0]);
        AbstractList w10 = db.r.w(arrayList, new o5.p(4));
        this.A.getClass();
        this.G = new n(arrayList, w10);
        return j10;
    }

    @Override // q2.a0
    public final k1 q() {
        k1 k1Var = this.E;
        k1Var.getClass();
        return k1Var;
    }

    @Override // q2.b1
    public final long r() {
        return this.G.r();
    }

    @Override // q2.b1
    public final void s(long j) {
        this.G.s(j);
    }
}
