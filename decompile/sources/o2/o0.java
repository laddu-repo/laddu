package o2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final t1.z f9493s;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a[] f9494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f9495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t1.s0[] f9496m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f9497n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k8.a0 f9498o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9499p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long[][] f9500q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a6.c f9501r;

    static {
        t1.r rVar = new t1.r();
        y9.c0 c0Var = y9.f0.f14553w;
        y9.z0 z0Var = y9.z0.f14637z;
        List list = Collections.EMPTY_LIST;
        y9.z0 z0Var2 = y9.z0.f14637z;
        g2.t tVar = new g2.t();
        f9493s = new t1.z("MergingMediaSource", new t1.t(rVar), null, new t1.v(tVar), t1.c0.B, t1.x.f12153a);
    }

    public o0(a... aVarArr) {
        k8.a0 a0Var = new k8.a0(20);
        this.f9494k = aVarArr;
        this.f9498o = a0Var;
        this.f9497n = new ArrayList(Arrays.asList(aVarArr));
        this.f9499p = -1;
        this.f9495l = new ArrayList(aVarArr.length);
        for (int i = 0; i < aVarArr.length; i++) {
            this.f9495l.add(new ArrayList());
        }
        this.f9496m = new t1.s0[aVarArr.length];
        this.f9500q = new long[0][];
        new HashMap();
        y9.p.d(8, "expectedKeys");
        y9.p.d(2, "expectedValuesPerKey");
        new y9.w0(y9.t.a(8)).A = new y9.v0();
    }

    @Override // o2.a
    public final b0 b(d0 d0Var, s2.e eVar, long j8) {
        a[] aVarArr = this.f9494k;
        int length = aVarArr.length;
        b0[] b0VarArr = new b0[length];
        t1.s0[] s0VarArr = this.f9496m;
        int iB = s0VarArr[0].b(d0Var.f9404a);
        for (int i = 0; i < length; i++) {
            d0 d0VarA = d0Var.a(s0VarArr[i].l(iB));
            b0VarArr[i] = aVarArr[i].b(d0VarA, eVar, j8 - this.f9500q[iB][i]);
            ((List) this.f9495l.get(i)).add(new n0(d0VarA, b0VarArr[i]));
        }
        return new m0(this.f9498o, this.f9500q[iB], b0VarArr);
    }

    @Override // o2.a
    public final t1.z h() {
        a[] aVarArr = this.f9494k;
        return aVarArr.length > 0 ? aVarArr[0].h() : f9493s;
    }

    @Override // o2.l, o2.a
    public final void j() throws a6.c {
        a6.c cVar = this.f9501r;
        if (cVar != null) {
            throw cVar;
        }
        super.j();
    }

    @Override // o2.a
    public final void l(y1.z zVar) {
        this.f9476j = zVar;
        this.i = w1.b0.m(null);
        int i = 0;
        while (true) {
            a[] aVarArr = this.f9494k;
            if (i >= aVarArr.length) {
                return;
            }
            x(Integer.valueOf(i), aVarArr[i]);
            i++;
        }
    }

    @Override // o2.a
    public final void n(b0 b0Var) {
        m0 m0Var = (m0) b0Var;
        int i = 0;
        while (true) {
            a[] aVarArr = this.f9494k;
            if (i >= aVarArr.length) {
                return;
            }
            List list = (List) this.f9495l.get(i);
            b0[] b0VarArr = m0Var.f9481v;
            boolean[] zArr = m0Var.f9482w;
            b0 b0Var2 = zArr[i] ? ((i1) b0VarArr[i]).f9458v : b0VarArr[i];
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((n0) list.get(i10)).f9489b.equals(b0Var2)) {
                    list.remove(i10);
                    break;
                }
                i10++;
            }
            a aVar = aVarArr[i];
            b0[] b0VarArr2 = m0Var.f9481v;
            aVar.n(zArr[i] ? ((i1) b0VarArr2[i]).f9458v : b0VarArr2[i]);
            i++;
        }
    }

    @Override // o2.l, o2.a
    public final void p() {
        super.p();
        Arrays.fill(this.f9496m, (Object) null);
        this.f9499p = -1;
        this.f9501r = null;
        ArrayList arrayList = this.f9497n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f9494k);
    }

    @Override // o2.a
    public final void s(t1.z zVar) {
        this.f9494k[0].s(zVar);
    }

    @Override // o2.l
    public final d0 t(Object obj, d0 d0Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f9495l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((n0) list.get(i)).f9488a.equals(d0Var)) {
                return ((n0) ((List) arrayList.get(0)).get(i)).f9488a;
            }
        }
        return null;
    }

    @Override // o2.l
    public final void w(Object obj, a aVar, t1.s0 s0Var) {
        Integer num = (Integer) obj;
        if (this.f9501r != null) {
            return;
        }
        if (this.f9499p == -1) {
            this.f9499p = s0Var.h();
        } else if (s0Var.h() != this.f9499p) {
            this.f9501r = new a6.c();
            return;
        }
        int length = this.f9500q.length;
        t1.s0[] s0VarArr = this.f9496m;
        if (length == 0) {
            this.f9500q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f9499p, s0VarArr.length);
        }
        ArrayList arrayList = this.f9497n;
        arrayList.remove(aVar);
        s0VarArr[num.intValue()] = s0Var;
        if (arrayList.isEmpty()) {
            m(s0VarArr[0]);
        }
    }
}
