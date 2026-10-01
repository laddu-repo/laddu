package a0;

import android.view.View;
import b0.k;
import b0.m;
import b0.o;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class d {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final c I;
    public final c J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c P;
    public final c[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public d T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f31a0;

    /* renamed from: b, reason: collision with root package name */
    public b0.c f32b;

    /* renamed from: b0, reason: collision with root package name */
    public int f33b0;

    /* renamed from: c, reason: collision with root package name */
    public b0.c f34c;

    /* renamed from: c0, reason: collision with root package name */
    public int f35c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f37d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f39e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f41f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f43g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f45h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f47i0;
    public String j;

    /* renamed from: j0, reason: collision with root package name */
    public int f48j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f49k;

    /* renamed from: k0, reason: collision with root package name */
    public final float[] f50k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f51l;

    /* renamed from: l0, reason: collision with root package name */
    public final d[] f52l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f53m;

    /* renamed from: m0, reason: collision with root package name */
    public final d[] f54m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f55n;

    /* renamed from: n0, reason: collision with root package name */
    public int f56n0;

    /* renamed from: o, reason: collision with root package name */
    public int f57o;
    public int o0;

    /* renamed from: p, reason: collision with root package name */
    public int f58p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f59p0;

    /* renamed from: q, reason: collision with root package name */
    public int f60q;

    /* renamed from: r, reason: collision with root package name */
    public int f61r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f62t;

    /* renamed from: u, reason: collision with root package name */
    public int f63u;

    /* renamed from: v, reason: collision with root package name */
    public int f64v;

    /* renamed from: w, reason: collision with root package name */
    public float f65w;

    /* renamed from: x, reason: collision with root package name */
    public int f66x;

    /* renamed from: y, reason: collision with root package name */
    public int f67y;

    /* renamed from: z, reason: collision with root package name */
    public float f68z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f30a = false;

    /* renamed from: d, reason: collision with root package name */
    public k f36d = null;

    /* renamed from: e, reason: collision with root package name */
    public m f38e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f40f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f42g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f44h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f46i = -1;

    public d() {
        new HashMap();
        this.f49k = false;
        this.f51l = false;
        this.f53m = false;
        this.f55n = false;
        this.f57o = -1;
        this.f58p = -1;
        this.f60q = 0;
        this.f61r = 0;
        this.s = 0;
        this.f62t = new int[2];
        this.f63u = 0;
        this.f64v = 0;
        this.f65w = 1.0f;
        this.f66x = 0;
        this.f67y = 0;
        this.f68z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        c cVar = new c(this, 2);
        this.I = cVar;
        c cVar2 = new c(this, 3);
        this.J = cVar2;
        c cVar3 = new c(this, 4);
        this.K = cVar3;
        c cVar4 = new c(this, 5);
        this.L = cVar4;
        c cVar5 = new c(this, 6);
        this.M = cVar5;
        c cVar6 = new c(this, 8);
        this.N = cVar6;
        c cVar7 = new c(this, 9);
        this.O = cVar7;
        c cVar8 = new c(this, 7);
        this.P = cVar8;
        this.Q = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.f59p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f31a0 = 0;
        this.f37d0 = 0.5f;
        this.f39e0 = 0.5f;
        this.f43g0 = 0;
        this.f45h0 = null;
        this.f47i0 = 0;
        this.f48j0 = 0;
        this.f50k0 = new float[]{-1.0f, -1.0f};
        this.f52l0 = new d[]{null, null};
        this.f54m0 = new d[]{null, null};
        this.f56n0 = -1;
        this.o0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void G(int i6, int i10, String str, StringBuilder sb2) {
        if (i6 == i10) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i6);
        sb2.append(",\n");
    }

    public static void H(StringBuilder sb2, String str, float f3, float f10) {
        if (f3 == f10) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f3);
        sb2.append(",\n");
    }

    public static void o(StringBuilder sb2, String str, int i6, int i10, int i11, int i12, int i13, float f3, int i14) {
        String str2;
        sb2.append(str);
        sb2.append(" :  {\n");
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    if (i14 == 4) {
                        str2 = "MATCH_PARENT";
                    } else {
                        throw null;
                    }
                } else {
                    str2 = "MATCH_CONSTRAINT";
                }
            } else {
                str2 = "WRAP_CONTENT";
            }
        } else {
            str2 = "FIXED";
        }
        if (!"FIXED".equals(str2)) {
            r4.a.u(sb2, "      behavior", " :   ", str2, ",\n");
        }
        G(i6, 0, "      size", sb2);
        G(i10, 0, "      min", sb2);
        G(i11, Integer.MAX_VALUE, "      max", sb2);
        G(i12, 0, "      matchMin", sb2);
        G(i13, 0, "      matchDef", sb2);
        H(sb2, "      matchPercent", f3, 1.0f);
        sb2.append("    },\n");
    }

    public static void p(StringBuilder sb2, String str, c cVar) {
        if (cVar.f26f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(cVar.f26f);
        sb2.append("'");
        if (cVar.f28h != Integer.MIN_VALUE || cVar.f27g != 0) {
            sb2.append(",");
            sb2.append(cVar.f27g);
            if (cVar.f28h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(cVar.f28h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public boolean A() {
        if (!this.f49k) {
            if (!this.I.f23c || !this.K.f23c) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean B() {
        if (!this.f51l) {
            if (!this.J.f23c || !this.L.f23c) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = Float.NaN;
        this.U = 0;
        this.V = 0;
        this.W = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f31a0 = 0;
        this.f33b0 = 0;
        this.f35c0 = 0;
        this.f37d0 = 0.5f;
        this.f39e0 = 0.5f;
        int[] iArr = this.f59p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f41f0 = null;
        this.f43g0 = 0;
        this.f47i0 = 0;
        this.f48j0 = 0;
        float[] fArr = this.f50k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f57o = -1;
        this.f58p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f61r = 0;
        this.s = 0;
        this.f65w = 1.0f;
        this.f68z = 1.0f;
        this.f64v = Integer.MAX_VALUE;
        this.f67y = Integer.MAX_VALUE;
        this.f63u = 0;
        this.f66x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f40f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f42g = true;
        int[] iArr3 = this.f62t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f44h = -1;
        this.f46i = -1;
    }

    public final void D() {
        d dVar = this.T;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((c) arrayList.get(i6)).j();
        }
    }

    public final void E() {
        this.f49k = false;
        this.f51l = false;
        this.f53m = false;
        this.f55n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            c cVar = (c) arrayList.get(i6);
            cVar.f23c = false;
            cVar.f22b = 0;
        }
    }

    public void F(n9.j jVar) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i6) {
        boolean z10;
        this.f31a0 = i6;
        if (i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z10;
    }

    public final void J(int i6, int i10) {
        if (this.f49k) {
            return;
        }
        this.I.l(i6);
        this.K.l(i10);
        this.Y = i6;
        this.U = i10 - i6;
        this.f49k = true;
    }

    public final void K(int i6, int i10) {
        if (this.f51l) {
            return;
        }
        this.J.l(i6);
        this.L.l(i10);
        this.Z = i6;
        this.V = i10 - i6;
        if (this.E) {
            this.M.l(i6 + this.f31a0);
        }
        this.f51l = true;
    }

    public final void L(int i6) {
        this.V = i6;
        int i10 = this.f35c0;
        if (i6 < i10) {
            this.V = i10;
        }
    }

    public final void M(int i6) {
        this.f59p0[0] = i6;
    }

    public final void N(int i6) {
        this.f59p0[1] = i6;
    }

    public final void O(int i6) {
        this.U = i6;
        int i10 = this.f33b0;
        if (i6 < i10) {
            this.U = i10;
        }
    }

    public void P(boolean z10, boolean z11) {
        int i6;
        int i10;
        k kVar = this.f36d;
        boolean z12 = z10 & kVar.f1266g;
        m mVar = this.f38e;
        boolean z13 = z11 & mVar.f1266g;
        int i11 = kVar.f1267h.f1242g;
        int i12 = mVar.f1267h.f1242g;
        int i13 = kVar.f1268i.f1242g;
        int i14 = mVar.f1268i.f1242g;
        int i15 = i14 - i12;
        if (i13 - i11 < 0 || i15 < 0 || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE) {
            i13 = 0;
            i14 = 0;
            i11 = 0;
            i12 = 0;
        }
        int i16 = i13 - i11;
        int i17 = i14 - i12;
        if (z12) {
            this.Y = i11;
        }
        if (z13) {
            this.Z = i12;
        }
        if (this.f43g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f59p0;
        if (z12) {
            if (iArr[0] == 1 && i16 < (i10 = this.U)) {
                i16 = i10;
            }
            this.U = i16;
            int i18 = this.f33b0;
            if (i16 < i18) {
                this.U = i18;
            }
        }
        if (z13) {
            if (iArr[1] == 1 && i17 < (i6 = this.V)) {
                i17 = i6;
            }
            this.V = i17;
            int i19 = this.f35c0;
            if (i17 < i19) {
                this.V = i19;
            }
        }
    }

    public void Q(y.c cVar, boolean z10) {
        int i6;
        int i10;
        m mVar;
        k kVar;
        cVar.getClass();
        int n10 = y.c.n(this.I);
        int n11 = y.c.n(this.J);
        int n12 = y.c.n(this.K);
        int n13 = y.c.n(this.L);
        if (z10 && (kVar = this.f36d) != null) {
            b0.f fVar = kVar.f1267h;
            if (fVar.j) {
                b0.f fVar2 = kVar.f1268i;
                if (fVar2.j) {
                    n10 = fVar.f1242g;
                    n12 = fVar2.f1242g;
                }
            }
        }
        if (z10 && (mVar = this.f38e) != null) {
            b0.f fVar3 = mVar.f1267h;
            if (fVar3.j) {
                b0.f fVar4 = mVar.f1268i;
                if (fVar4.j) {
                    n11 = fVar3.f1242g;
                    n13 = fVar4.f1242g;
                }
            }
        }
        int i11 = n13 - n11;
        if (n12 - n10 < 0 || i11 < 0 || n10 == Integer.MIN_VALUE || n10 == Integer.MAX_VALUE || n11 == Integer.MIN_VALUE || n11 == Integer.MAX_VALUE || n12 == Integer.MIN_VALUE || n12 == Integer.MAX_VALUE || n13 == Integer.MIN_VALUE || n13 == Integer.MAX_VALUE) {
            n10 = 0;
            n11 = 0;
            n12 = 0;
            n13 = 0;
        }
        int i12 = n12 - n10;
        int i13 = n13 - n11;
        this.Y = n10;
        this.Z = n11;
        if (this.f43g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f59p0;
        int i14 = iArr[0];
        if (i14 == 1 && i12 < (i10 = this.U)) {
            i12 = i10;
        }
        if (iArr[1] == 1 && i13 < (i6 = this.V)) {
            i13 = i6;
        }
        this.U = i12;
        this.V = i13;
        int i15 = this.f35c0;
        if (i13 < i15) {
            this.V = i15;
        }
        int i16 = this.f33b0;
        if (i12 < i16) {
            this.U = i16;
        }
        int i17 = this.f64v;
        if (i17 > 0 && i14 == 3) {
            this.U = Math.min(this.U, i17);
        }
        int i18 = this.f67y;
        if (i18 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i18);
        }
        int i19 = this.U;
        if (i12 != i19) {
            this.f44h = i19;
        }
        int i20 = this.V;
        if (i13 != i20) {
            this.f46i = i20;
        }
    }

    public final void a(e eVar, y.c cVar, HashSet hashSet, int i6, boolean z10) {
        if (z10) {
            if (hashSet.contains(this)) {
                j.b(eVar, cVar, this);
                hashSet.remove(this);
                b(cVar, eVar.W(64));
            } else {
                return;
            }
        }
        if (i6 == 0) {
            HashSet hashSet2 = this.I.f21a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f24d.a(eVar, cVar, hashSet, i6, true);
                }
            }
            HashSet hashSet3 = this.K.f21a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).f24d.a(eVar, cVar, hashSet, i6, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f21a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).f24d.a(eVar, cVar, hashSet, i6, true);
            }
        }
        HashSet hashSet5 = this.L.f21a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).f24d.a(eVar, cVar, hashSet, i6, true);
            }
        }
        HashSet hashSet6 = this.M.f21a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).f24d.a(eVar, cVar, hashSet, i6, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(y.c r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.d.b(y.c, boolean):void");
    }

    public boolean c() {
        if (this.f43g0 != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x03a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0426 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x049a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(y.c r30, boolean r31, boolean r32, boolean r33, boolean r34, y.f r35, y.f r36, int r37, boolean r38, a0.c r39, a0.c r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.d.d(y.c, boolean, boolean, boolean, boolean, y.f, y.f, int, boolean, a0.c, a0.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(int i6, d dVar, int i10, int i11) {
        boolean z10;
        if (i6 == 7) {
            if (i10 == 7) {
                c i12 = i(2);
                c i13 = i(4);
                c i14 = i(3);
                c i15 = i(5);
                boolean z11 = true;
                if ((i12 != null && i12.h()) || (i13 != null && i13.h())) {
                    z10 = false;
                } else {
                    e(2, dVar, 2, 0);
                    e(4, dVar, 4, 0);
                    z10 = true;
                }
                if ((i14 != null && i14.h()) || (i15 != null && i15.h())) {
                    z11 = false;
                } else {
                    e(3, dVar, 3, 0);
                    e(5, dVar, 5, 0);
                }
                if (z10 && z11) {
                    i(7).a(dVar.i(7), 0);
                    return;
                } else if (z10) {
                    i(8).a(dVar.i(8), 0);
                    return;
                } else {
                    if (z11) {
                        i(9).a(dVar.i(9), 0);
                        return;
                    }
                    return;
                }
            }
            if (i10 != 2 && i10 != 4) {
                if (i10 == 3 || i10 == 5) {
                    e(3, dVar, i10, 0);
                    e(5, dVar, i10, 0);
                    i(7).a(dVar.i(i10), 0);
                    return;
                }
                return;
            }
            e(2, dVar, i10, 0);
            e(4, dVar, i10, 0);
            i(7).a(dVar.i(i10), 0);
            return;
        }
        if (i6 == 8 && (i10 == 2 || i10 == 4)) {
            c i16 = i(2);
            c i17 = dVar.i(i10);
            c i18 = i(4);
            i16.a(i17, 0);
            i18.a(i17, 0);
            i(8).a(i17, 0);
            return;
        }
        if (i6 == 9 && (i10 == 3 || i10 == 5)) {
            c i19 = dVar.i(i10);
            i(3).a(i19, 0);
            i(5).a(i19, 0);
            i(9).a(i19, 0);
            return;
        }
        if (i6 == 8 && i10 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i10), 0);
            return;
        }
        if (i6 == 9 && i10 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i10), 0);
            return;
        }
        c i20 = i(i6);
        c i21 = dVar.i(i10);
        if (i20.i(i21)) {
            if (i6 == 6) {
                c i22 = i(3);
                c i23 = i(5);
                if (i22 != null) {
                    i22.j();
                }
                if (i23 != null) {
                    i23.j();
                }
            } else if (i6 != 3 && i6 != 5) {
                if (i6 == 2 || i6 == 4) {
                    c i24 = i(7);
                    if (i24.f26f != i21) {
                        i24.j();
                    }
                    c f3 = i(i6).f();
                    c i25 = i(8);
                    if (i25.h()) {
                        f3.j();
                        i25.j();
                    }
                }
            } else {
                c i26 = i(6);
                if (i26 != null) {
                    i26.j();
                }
                c i27 = i(7);
                if (i27.f26f != i21) {
                    i27.j();
                }
                c f10 = i(i6).f();
                c i28 = i(9);
                if (i28.h()) {
                    f10.j();
                    i28.j();
                }
            }
            i20.a(i21, i11);
        }
    }

    public final void f(c cVar, c cVar2, int i6) {
        if (cVar.f24d == this) {
            e(cVar.f25e, cVar2.f24d, cVar2.f25e, i6);
        }
    }

    public final void g(y.c cVar) {
        cVar.k(this.I);
        cVar.k(this.J);
        cVar.k(this.K);
        cVar.k(this.L);
        if (this.f31a0 > 0) {
            cVar.k(this.M);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [b0.m, b0.o] */
    /* JADX WARN: Type inference failed for: r0v3, types: [b0.o, b0.k] */
    public final void h() {
        if (this.f36d == null) {
            ?? oVar = new o(this);
            oVar.f1267h.f1240e = 4;
            oVar.f1268i.f1240e = 5;
            oVar.f1265f = 0;
            this.f36d = oVar;
        }
        if (this.f38e == null) {
            ?? oVar2 = new o(this);
            b0.f fVar = new b0.f(oVar2);
            oVar2.f1252k = fVar;
            oVar2.f1253l = null;
            oVar2.f1267h.f1240e = 6;
            oVar2.f1268i.f1240e = 7;
            fVar.f1240e = 8;
            oVar2.f1265f = 1;
            this.f38e = oVar2;
        }
    }

    public c i(int i6) {
        switch (y.e.c(i6)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(r4.a.x(i6));
        }
    }

    public final int j(int i6) {
        int[] iArr = this.f59p0;
        if (i6 == 0) {
            return iArr[0];
        }
        if (i6 != 1) {
            return 0;
        }
        return iArr[1];
    }

    public final int k() {
        if (this.f43g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final d l(int i6) {
        c cVar;
        c cVar2;
        if (i6 == 0) {
            c cVar3 = this.K;
            c cVar4 = cVar3.f26f;
            if (cVar4 != null && cVar4.f26f == cVar3) {
                return cVar4.f24d;
            }
            return null;
        }
        if (i6 == 1 && (cVar2 = (cVar = this.L).f26f) != null && cVar2.f26f == cVar) {
            return cVar2.f24d;
        }
        return null;
    }

    public final d m(int i6) {
        c cVar;
        c cVar2;
        if (i6 == 0) {
            c cVar3 = this.I;
            c cVar4 = cVar3.f26f;
            if (cVar4 != null && cVar4.f26f == cVar3) {
                return cVar4.f24d;
            }
            return null;
        }
        if (i6 == 1 && (cVar2 = (cVar = this.J).f26f) != null && cVar2.f26f == cVar) {
            return cVar2.f24d;
        }
        return null;
    }

    public void n(StringBuilder sb2) {
        sb2.append("  " + this.j + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.U);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.V);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.Y);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.Z);
        sb2.append("\n");
        p(sb2, "left", this.I);
        p(sb2, "top", this.J);
        p(sb2, "right", this.K);
        p(sb2, "bottom", this.L);
        p(sb2, "baseline", this.M);
        p(sb2, "centerX", this.N);
        p(sb2, "centerY", this.O);
        int i6 = this.U;
        int i10 = this.f33b0;
        int[] iArr = this.C;
        int i11 = iArr[0];
        int i12 = this.f63u;
        int i13 = this.f61r;
        float f3 = this.f65w;
        int[] iArr2 = this.f59p0;
        int i14 = iArr2[0];
        float[] fArr = this.f50k0;
        float f10 = fArr[0];
        o(sb2, "    width", i6, i10, i11, i12, i13, f3, i14);
        int i15 = this.V;
        int i16 = this.f35c0;
        int i17 = iArr[1];
        int i18 = this.f66x;
        int i19 = this.s;
        float f11 = this.f68z;
        int i20 = iArr2[1];
        float f12 = fArr[1];
        o(sb2, "    height", i15, i16, i17, i18, i19, f11, i20);
        float f13 = this.W;
        int i21 = this.X;
        if (f13 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f13);
            sb2.append(",");
            sb2.append(i21);
            sb2.append(HttpUrl.FRAGMENT_ENCODE_SET);
            sb2.append("],\n");
        }
        H(sb2, "    horizontalBias", this.f37d0, 0.5f);
        H(sb2, "    verticalBias", this.f39e0, 0.5f);
        G(this.f47i0, 0, "    horizontalChainStyle", sb2);
        G(this.f48j0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public final int q() {
        if (this.f43g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        d dVar = this.T;
        if (dVar != null && (dVar instanceof e)) {
            return ((e) dVar).f76x0 + this.Y;
        }
        return this.Y;
    }

    public final int s() {
        d dVar = this.T;
        if (dVar != null && (dVar instanceof e)) {
            return ((e) dVar).f77y0 + this.Z;
        }
        return this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1b
            a0.c r5 = r4.I
            a0.c r5 = r5.f26f
            if (r5 == 0) goto Ld
            r5 = 1
            goto Le
        Ld:
            r5 = 0
        Le:
            a0.c r3 = r4.K
            a0.c r3 = r3.f26f
            if (r3 == 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            a0.c r5 = r4.J
            a0.c r5 = r5.f26f
            if (r5 == 0) goto L23
            r5 = 1
            goto L24
        L23:
            r5 = 0
        L24:
            a0.c r3 = r4.L
            a0.c r3 = r3.f26f
            if (r3 == 0) goto L2c
            r3 = 1
            goto L2d
        L2c:
            r3 = 0
        L2d:
            int r5 = r5 + r3
            a0.c r3 = r4.M
            a0.c r3 = r3.f26f
            if (r3 == 0) goto L36
            r3 = 1
            goto L37
        L36:
            r3 = 0
        L37:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.d.t(int):boolean");
    }

    public String toString() {
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        StringBuilder b10 = y.e.b(HttpUrl.FRAGMENT_ENCODE_SET);
        if (this.f45h0 != null) {
            str = r4.a.o(new StringBuilder("id: "), this.f45h0, " ");
        }
        b10.append(str);
        b10.append("(");
        b10.append(this.Y);
        b10.append(", ");
        b10.append(this.Z);
        b10.append(") - (");
        b10.append(this.U);
        b10.append(" x ");
        return r4.a.l(b10, this.V, ")");
    }

    public final boolean u(int i6, int i10) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i6 == 0) {
            c cVar5 = this.I;
            c cVar6 = cVar5.f26f;
            if (cVar6 != null && cVar6.f23c && (cVar4 = (cVar3 = this.K).f26f) != null && cVar4.f23c) {
                if ((cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f26f.d()) >= i10) {
                    return true;
                }
                return false;
            }
            return false;
        }
        c cVar7 = this.J;
        c cVar8 = cVar7.f26f;
        if (cVar8 != null && cVar8.f23c && (cVar2 = (cVar = this.L).f26f) != null && cVar2.f23c) {
            if ((cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f26f.d()) >= i10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void v(int i6, int i10, int i11, int i12, d dVar) {
        i(i6).b(dVar.i(i10), i11, i12, true);
    }

    public final boolean w(int i6) {
        c cVar;
        c cVar2;
        int i10 = i6 * 2;
        c[] cVarArr = this.Q;
        c cVar3 = cVarArr[i10];
        c cVar4 = cVar3.f26f;
        if (cVar4 != null && cVar4.f26f != cVar3 && (cVar2 = (cVar = cVarArr[i10 + 1]).f26f) != null && cVar2.f26f == cVar) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        c cVar = this.I;
        c cVar2 = cVar.f26f;
        if (cVar2 == null || cVar2.f26f != cVar) {
            c cVar3 = this.K;
            c cVar4 = cVar3.f26f;
            if (cVar4 != null && cVar4.f26f == cVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean y() {
        c cVar = this.J;
        c cVar2 = cVar.f26f;
        if (cVar2 == null || cVar2.f26f != cVar) {
            c cVar3 = this.L;
            c cVar4 = cVar3.f26f;
            if (cVar4 != null && cVar4.f26f == cVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean z() {
        if (this.f42g && this.f43g0 != 8) {
            return true;
        }
        return false;
    }
}
