package c2;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o2.c1[] f1993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1995e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y0 f1996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1997h;
    public final boolean[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f[] f1998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r2.v f1999k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k1 f2000l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x0 f2001m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o2.j1 f2002n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r2.w f2003o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f2004p;

    public x0(f[] fVarArr, long j8, r2.v vVar, s2.e eVar, k1 k1Var, y0 y0Var, r2.w wVar) {
        this.f1998j = fVarArr;
        this.f2004p = j8;
        this.f1999k = vVar;
        this.f2000l = k1Var;
        o2.d0 d0Var = y0Var.f2007a;
        this.f1992b = d0Var.f9404a;
        this.f1996g = y0Var;
        this.f2002n = o2.j1.f9467d;
        this.f2003o = wVar;
        this.f1993c = new o2.c1[fVarArr.length];
        this.i = new boolean[fVarArr.length];
        long j9 = y0Var.f2008b;
        long j10 = y0Var.f2010d;
        boolean z2 = y0Var.f;
        k1Var.getClass();
        Object obj = d0Var.f9404a;
        int i = q1.f1893k;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        o2.d0 d0VarA = d0Var.a(pair.second);
        j1 j1Var = (j1) ((HashMap) k1Var.f1826e).get(obj2);
        j1Var.getClass();
        ((HashSet) k1Var.f1828h).add(j1Var);
        i1 i1Var = (i1) ((HashMap) k1Var.f).get(j1Var);
        if (i1Var != null) {
            i1Var.f1774a.e(i1Var.f1775b);
        }
        j1Var.f1809c.add(d0VarA);
        o2.b0 b0VarC = j1Var.f1807a.b(d0VarA, eVar, j9);
        ((IdentityHashMap) k1Var.f1825d).put(b0VarC, j1Var);
        k1Var.d();
        this.f1991a = j10 != -9223372036854775807L ? new o2.d(b0VarC, !z2, 0L, j10) : b0VarC;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, o2.b0] */
    public final long a(r2.w wVar, long j8, boolean z2, boolean[] zArr) {
        f[] fVarArr;
        o2.c1[] c1VarArr;
        int i = 0;
        while (true) {
            boolean z10 = true;
            if (i >= wVar.f11128a) {
                break;
            }
            if (z2 || !wVar.a(this.f2003o, i)) {
                z10 = false;
            }
            this.i[i] = z10;
            i++;
        }
        int i10 = 0;
        while (true) {
            fVarArr = this.f1998j;
            int length = fVarArr.length;
            c1VarArr = this.f1993c;
            if (i10 >= length) {
                break;
            }
            if (fVarArr[i10].f1723w == -2) {
                c1VarArr[i10] = null;
            }
            i10++;
        }
        b();
        this.f2003o = wVar;
        c();
        long jM = this.f1991a.m(wVar.f11130c, this.i, this.f1993c, zArr, j8);
        for (int i11 = 0; i11 < fVarArr.length; i11++) {
            if (fVarArr[i11].f1723w == -2 && this.f2003o.b(i11)) {
                c1VarArr[i11] = new o2.r();
            }
        }
        this.f = false;
        for (int i12 = 0; i12 < c1VarArr.length; i12++) {
            if (c1VarArr[i12] != null) {
                w1.a.j(wVar.b(i12));
                if (fVarArr[i12].f1723w != -2) {
                    this.f = true;
                }
            } else {
                w1.a.j(wVar.f11130c[i12] == null);
            }
        }
        return jM;
    }

    public final void b() {
        if (this.f2001m != null) {
            return;
        }
        int i = 0;
        while (true) {
            r2.w wVar = this.f2003o;
            if (i >= wVar.f11128a) {
                return;
            }
            boolean zB = wVar.b(i);
            r2.s sVar = this.f2003o.f11130c[i];
            if (zB && sVar != null) {
                sVar.g();
            }
            i++;
        }
    }

    public final void c() {
        if (this.f2001m != null) {
            return;
        }
        int i = 0;
        while (true) {
            r2.w wVar = this.f2003o;
            if (i >= wVar.f11128a) {
                return;
            }
            boolean zB = wVar.b(i);
            r2.s sVar = this.f2003o.f11130c[i];
            if (zB && sVar != null) {
                sVar.d();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, o2.e1] */
    public final long d() {
        if (!this.f1995e) {
            return this.f1996g.f2008b;
        }
        long jU = this.f ? this.f1991a.u() : Long.MIN_VALUE;
        return jU == Long.MIN_VALUE ? this.f1996g.f2011e : jU;
    }

    public final long e() {
        return this.f1996g.f2008b + this.f2004p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o2.b0] */
    public final void f(float f, t1.s0 s0Var, boolean z2) {
        this.f1995e = true;
        this.f2002n = this.f1991a.q();
        r2.w wVarJ = j(f, s0Var, z2);
        y0 y0Var = this.f1996g;
        long jMax = y0Var.f2008b;
        long j8 = y0Var.f2011e;
        if (j8 != -9223372036854775807L && jMax >= j8) {
            jMax = Math.max(0L, j8 - 1);
        }
        long jA = a(wVarJ, jMax, false, new boolean[this.f1998j.length]);
        long j9 = this.f2004p;
        y0 y0Var2 = this.f1996g;
        this.f2004p = (y0Var2.f2008b - jA) + j9;
        this.f1996g = y0Var2.b(jA);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o2.e1] */
    public final boolean g() {
        if (this.f1995e) {
            return !this.f || this.f1991a.u() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.f1995e) {
            return g() || d() - this.f1996g.f2008b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o2.b0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i() {
        b();
        ?? r02 = this.f1991a;
        try {
            boolean z2 = r02 instanceof o2.d;
            k1 k1Var = this.f2000l;
            if (z2) {
                k1Var.h(((o2.d) r02).f9399v);
            } else {
                k1Var.h(r02);
            }
        } catch (RuntimeException e7) {
            w1.a.p("MediaPeriodHolder", "Period release failed.", e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v30, types: [r2.r] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57, types: [r2.h] */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r5v3, types: [r2.r[]] */
    /* JADX WARN: Type inference failed for: r6v44, types: [r2.r] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v88 */
    /* JADX WARN: Type inference failed for: r7v43, types: [r2.r] */
    public final r2.w j(float f, t1.s0 s0Var, boolean z2) {
        r2.j jVar;
        ?? r62;
        String str;
        t1.t0 t0Var;
        Pair pairI;
        Object languageTag;
        long j8;
        boolean z10;
        y9.z0 z0VarQ;
        r2.s bVar;
        s2.d dVar;
        int i;
        int[] iArr;
        t1.t0 t0Var2;
        int i10;
        int[] iArr2;
        int[][] iArr3;
        int[] iArr4;
        CaptioningManager captioningManager;
        Locale locale;
        Context context;
        int[] iArr5;
        r2.v vVar = this.f1999k;
        f[] fVarArr = this.f1998j;
        o2.j1 j1Var = this.f2002n;
        vVar.getClass();
        int i11 = 1;
        int[] iArr6 = new int[fVarArr.length + 1];
        int length = fVarArr.length + 1;
        t1.t0[][] t0VarArr = new t1.t0[length][];
        int[][][] iArr7 = new int[fVarArr.length + 1][][];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = j1Var.f9468a;
            t0VarArr[i12] = new t1.t0[i13];
            iArr7[i12] = new int[i13][];
        }
        int length2 = fVarArr.length;
        int[] iArr8 = new int[length2];
        for (int i14 = 0; i14 < length2; i14++) {
            iArr8[i14] = fVarArr[i14].B();
        }
        int i15 = 0;
        while (i15 < j1Var.f9468a) {
            t1.t0 t0VarA = j1Var.a(i15);
            int i16 = t0VarA.f12113c == 5 ? i11 : 0;
            int length3 = fVarArr.length;
            int i17 = i11;
            int i18 = 0;
            int i19 = 0;
            while (i18 < fVarArr.length) {
                f fVar = fVarArr[i18];
                r2.v vVar2 = vVar;
                o2.j1 j1Var2 = j1Var;
                int i20 = i11;
                int iMax = 0;
                for (int i21 = 0; i21 < t0VarA.f12111a; i21++) {
                    iMax = Math.max(iMax, fVar.A(t0VarA.f12114d[i21]) & 7);
                }
                int i22 = iArr6[i18] == 0 ? i20 : 0;
                if (iMax > i19 || (iMax == i19 && i16 != 0 && i17 == 0 && i22 != 0)) {
                    i19 = iMax;
                    i17 = i22;
                    length3 = i18;
                }
                i18++;
                i11 = i20;
                vVar = vVar2;
                j1Var = j1Var2;
            }
            r2.v vVar3 = vVar;
            o2.j1 j1Var3 = j1Var;
            int i23 = i11;
            if (length3 == fVarArr.length) {
                iArr5 = new int[t0VarA.f12111a];
            } else {
                f fVar2 = fVarArr[length3];
                int[] iArr9 = new int[t0VarA.f12111a];
                for (int i24 = 0; i24 < t0VarA.f12111a; i24++) {
                    iArr9[i24] = fVar2.A(t0VarA.f12114d[i24]);
                }
                iArr5 = iArr9;
            }
            int i25 = iArr6[length3];
            t0VarArr[length3][i25] = t0VarA;
            iArr7[length3][i25] = iArr5;
            iArr6[length3] = i25 + 1;
            i15++;
            i11 = i23;
            vVar = vVar3;
            j1Var = j1Var3;
        }
        r2.v vVar4 = vVar;
        int i26 = i11;
        int i27 = 0;
        o2.j1[] j1VarArr = new o2.j1[fVarArr.length];
        String[] strArr = new String[fVarArr.length];
        int[] iArr10 = new int[fVarArr.length];
        for (int i28 = 0; i28 < fVarArr.length; i28++) {
            int i29 = iArr6[i28];
            j1VarArr[i28] = new o2.j1((t1.t0[]) w1.b0.O(i29, t0VarArr[i28]));
            iArr7[i28] = (int[][]) w1.b0.O(i29, iArr7[i28]);
            strArr[i28] = fVarArr[i28].j();
            iArr10[i28] = fVarArr[i28].f1723w;
        }
        r2.u uVar = new r2.u(iArr10, j1VarArr, iArr8, iArr7, new o2.j1((t1.t0[]) w1.b0.O(iArr6[fVarArr.length], t0VarArr[fVarArr.length])));
        r2.q qVar = (r2.q) vVar4;
        synchronized (qVar.f11113c) {
            qVar.f11116g = Thread.currentThread();
            jVar = qVar.f;
        }
        if (qVar.f11118j == null && (context = qVar.f11114d) != null) {
            qVar.f11118j = Boolean.valueOf(w1.b0.L(context));
        }
        if (jVar.A && Build.VERSION.SDK_INT >= 32 && qVar.f11117h == null) {
            qVar.f11117h = new b(qVar.f11114d, qVar, qVar.f11118j);
        }
        int i30 = uVar.f11121a;
        Context context2 = qVar.f11114d;
        ?? r52 = new r2.r[i30];
        int i31 = 0;
        while (true) {
            if (i31 >= uVar.f11121a) {
                r62 = 0;
                break;
            }
            if (2 == iArr10[i31] && j1VarArr[i31].f9468a > 0) {
                r62 = i26;
                break;
            }
            i31++;
        }
        Pair pairI2 = r2.q.i(i26, uVar, iArr7, new r2.d(r62, qVar, jVar, iArr8), new c4.d(12));
        if (pairI2 != null) {
            r52[((Integer) pairI2.second).intValue()] = (r2.r) pairI2.first;
        }
        if (pairI2 == null) {
            str = null;
        } else {
            r2.r rVar = (r2.r) pairI2.first;
            str = rVar.f11119a.f12114d[rVar.f11120b[0]].f12053d;
        }
        jVar.f12166o.getClass();
        Pair pairI3 = r2.q.i(2, uVar, iArr7, new androidx.fragment.app.f(jVar, str, iArr8, (!jVar.f12159g || context2 == null) ? null : w1.b0.t(context2)), new c4.d(11));
        int i32 = 3;
        int i33 = 4;
        if (pairI3 == null) {
            t0Var = null;
            pairI = r2.q.i(4, uVar, iArr7, new pa.a(i32, jVar), new c4.d(10));
        } else {
            t0Var = null;
            pairI = null;
        }
        if (pairI != null) {
            r52[((Integer) pairI.second).intValue()] = (r2.r) pairI.first;
        } else if (pairI3 != null) {
            r52[((Integer) pairI3.second).intValue()] = (r2.r) pairI3.first;
        }
        if (!jVar.f12168q || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = t0Var;
        } else {
            int i34 = w1.b0.f13686a;
            languageTag = locale.toLanguageTag();
        }
        Pair pairI4 = r2.q.i(3, uVar, iArr7, new ed.d(jVar, str, languageTag, 6), new c4.d(13));
        if (pairI4 != null) {
            r52[((Integer) pairI4.second).intValue()] = (r2.r) pairI4.first;
        }
        int i35 = 0;
        while (i35 < i30) {
            int i36 = iArr10[i35];
            if (i36 == 2 || i36 == 1 || i36 == 3 || i36 == i33) {
                i10 = i35;
                iArr2 = iArr10;
            } else {
                o2.j1 j1Var4 = j1VarArr[i35];
                int[][] iArr11 = iArr7[i35];
                int i37 = i27;
                int i38 = i37;
                t1.t0 t0Var3 = t0Var;
                ?? r20 = t0Var3;
                while (i37 < j1Var4.f9468a) {
                    t1.t0 t0VarA2 = j1Var4.a(i37);
                    int[] iArr12 = iArr11[i37];
                    int i39 = i35;
                    o2.j1 j1Var5 = j1Var4;
                    ?? r42 = r20;
                    int i40 = i38;
                    t1.t0 t0Var4 = t0Var3;
                    int i41 = i27;
                    while (i41 < t0VarA2.f12111a) {
                        int i42 = i41;
                        if (j4.a.f(iArr12[i41], jVar.B)) {
                            iArr3 = iArr11;
                            r2.h hVar = new r2.h(t0VarA2.f12114d[i42], iArr12[i42]);
                            if (r42 != 0) {
                                iArr4 = iArr10;
                                if (y9.x.f14627a.c(hVar.f11094w, r42.f11094w).c(hVar.f11093v, r42.f11093v).e() > 0) {
                                }
                            } else {
                                iArr4 = iArr10;
                            }
                            r42 = hVar;
                            t0Var4 = t0VarA2;
                            i40 = i42;
                        } else {
                            iArr3 = iArr11;
                            iArr4 = iArr10;
                        }
                        i41 = i42 + 1;
                        iArr11 = iArr3;
                        iArr10 = iArr4;
                        r42 = r42;
                    }
                    i37++;
                    t0Var3 = t0Var4;
                    i38 = i40;
                    j1Var4 = j1Var5;
                    r20 = r42;
                    i35 = i39;
                }
                i10 = i35;
                iArr2 = iArr10;
                r52[i10] = t0Var3 == null ? t0Var : new r2.r(i27, t0Var3, new int[]{i38});
            }
            i35 = i10 + 1;
            iArr10 = iArr2;
            i27 = 0;
            i33 = 4;
        }
        int i43 = uVar.f11121a;
        o2.j1[] j1VarArr2 = uVar.f11123c;
        HashMap map = new HashMap();
        for (int i44 = 0; i44 < i43; i44++) {
            r2.q.c(j1VarArr2[i44], jVar, map);
        }
        r2.q.c(uVar.f, jVar, map);
        for (int i45 = 0; i45 < i43; i45++) {
            t1.u0 u0Var = (t1.u0) map.get(Integer.valueOf(uVar.f11122b[i45]));
            if (u0Var != null) {
                t1.t0 t0Var5 = u0Var.f12121a;
                y9.f0 f0Var = u0Var.f12122b;
                r52[i45] = (f0Var.isEmpty() || j1VarArr2[i45].b(t0Var5) == -1) ? t0Var : new r2.r(0, t0Var5, z7.b.N(f0Var));
            }
        }
        int i46 = uVar.f11121a;
        for (int i47 = 0; i47 < i46; i47++) {
            o2.j1 j1Var6 = uVar.f11123c[i47];
            Map map2 = (Map) jVar.D.get(i47);
            if (map2 != null && map2.containsKey(j1Var6)) {
                Map map3 = (Map) jVar.D.get(i47);
                if (map3 != null && map3.get(j1Var6) != null) {
                    throw new ClassCastException();
                }
                r52[i47] = t0Var;
            }
        }
        for (int i48 = 0; i48 < i30; i48++) {
            int i49 = uVar.f11122b[i48];
            if (jVar.E.get(i48) || jVar.f12172u.contains(Integer.valueOf(i49))) {
                r52[i48] = t0Var;
            }
        }
        k8.z zVar = qVar.f11115e;
        s2.d dVar2 = qVar.f11127b;
        w1.a.k(dVar2);
        zVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i50 = 0;
        while (i50 < r52.length) {
            ?? r72 = r52[i50];
            if (r72 == 0 || r72.f11120b.length <= 1) {
                t0Var2 = t0Var;
                arrayList.add(t0Var2);
            } else {
                y9.b0 b0VarJ = y9.f0.j();
                b0VarJ.a(new r2.a(0L, 0L));
                arrayList.add(b0VarJ);
                t0Var2 = t0Var;
            }
            i50++;
            t0Var = t0Var2;
        }
        int length4 = r52.length;
        long[][] jArr = new long[length4][];
        int i51 = 0;
        while (true) {
            j8 = -1;
            if (i51 >= r52.length) {
                break;
            }
            ?? r14 = r52[i51];
            if (r14 == 0) {
                jArr[i51] = new long[0];
            } else {
                int[] iArr13 = r14.f11120b;
                jArr[i51] = new long[iArr13.length];
                int i52 = 0;
                while (i52 < iArr13.length) {
                    int i53 = i52;
                    long j9 = r14.f11119a.f12114d[iArr13[i52]].f12057j;
                    long[] jArr2 = jArr[i51];
                    if (j9 == -1) {
                        j9 = 0;
                    }
                    jArr2[i53] = j9;
                    i52 = i53 + 1;
                }
                Arrays.sort(jArr[i51]);
            }
            i51++;
        }
        int[] iArr14 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i54 = 0; i54 < length4; i54++) {
            long[] jArr4 = jArr[i54];
            jArr3[i54] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        r2.b.v(arrayList, jArr3);
        y9.p.d(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(y9.x0.f14630w);
        y9.v0 v0Var = new y9.v0();
        y9.w0 w0Var = new y9.w0(treeMap);
        w0Var.A = v0Var;
        int i55 = 0;
        while (i55 < length4) {
            long[] jArr5 = jArr[i55];
            long j10 = j8;
            if (jArr5.length <= 1) {
                dVar = dVar2;
                i = length4;
                iArr = iArr14;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                dVar = dVar2;
                int i56 = 0;
                while (true) {
                    long[] jArr6 = jArr[i55];
                    i = length4;
                    double dLog = 0.0d;
                    if (i56 >= jArr6.length) {
                        break;
                    }
                    int[] iArr15 = iArr14;
                    long j11 = jArr6[i56];
                    if (j11 != j10) {
                        dLog = Math.log(j11);
                    }
                    dArr[i56] = dLog;
                    i56++;
                    length4 = i;
                    iArr14 = iArr15;
                }
                iArr = iArr14;
                int i57 = length5 - 1;
                double d10 = dArr[i57] - dArr[0];
                int i58 = 0;
                while (i58 < i57) {
                    double d11 = dArr[i58];
                    int i59 = i58 + 1;
                    Double dValueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i59]) * 0.5d) - dArr[0]) / d10);
                    Integer numValueOf = Integer.valueOf(i55);
                    double d12 = d10;
                    Map map4 = w0Var.f14625y;
                    Collection collection = (Collection) map4.get(dValueOf);
                    if (collection == null) {
                        Collection collectionC = w0Var.c();
                        if (!collectionC.add(numValueOf)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        w0Var.f14626z++;
                        map4.put(dValueOf, collectionC);
                    } else if (collection.add(numValueOf)) {
                        w0Var.f14626z++;
                    }
                    i58 = i59;
                    d10 = d12;
                }
            }
            i55++;
            length4 = i;
            iArr14 = iArr;
            j8 = j10;
            dVar2 = dVar;
        }
        s2.d dVar3 = dVar2;
        int[] iArr16 = iArr14;
        y9.m mVar = w0Var.f14589w;
        if (mVar == null) {
            mVar = new y9.m(0, w0Var);
            w0Var.f14589w = mVar;
        }
        y9.f0 f0VarM = y9.f0.m(mVar);
        for (int i60 = 0; i60 < f0VarM.size(); i60++) {
            int iIntValue = ((Integer) f0VarM.get(i60)).intValue();
            int i61 = iArr16[iIntValue] + 1;
            iArr16[iIntValue] = i61;
            jArr3[iIntValue] = jArr[iIntValue][i61];
            r2.b.v(arrayList, jArr3);
        }
        for (int i62 = 0; i62 < r52.length; i62++) {
            if (arrayList.get(i62) != null) {
                jArr3[i62] = jArr3[i62] * 2;
            }
        }
        r2.b.v(arrayList, jArr3);
        y9.b0 b0VarJ2 = y9.f0.j();
        for (int i63 = 0; i63 < arrayList.size(); i63++) {
            y9.b0 b0Var = (y9.b0) arrayList.get(i63);
            b0VarJ2.a(b0Var == null ? y9.z0.f14637z : b0Var.g());
        }
        y9.z0 z0VarG = b0VarJ2.g();
        r2.s[] sVarArr = new r2.s[r52.length];
        for (int i64 = 0; i64 < r52.length; i64++) {
            ?? r63 = r52[i64];
            if (r63 != 0) {
                int[] iArr17 = r63.f11120b;
                if (iArr17.length != 0) {
                    if (iArr17.length == 1) {
                        bVar = new r2.t(r63.f11119a, new int[]{iArr17[0]});
                    } else {
                        long j12 = 25000;
                        bVar = new r2.b(r63.f11119a, iArr17, dVar3, 10000, j12, j12, (y9.f0) z0VarG.get(i64));
                    }
                    sVarArr[i64] = bVar;
                }
            }
        }
        r1[] r1VarArr = new r1[i30];
        for (int i65 = 0; i65 < i30; i65++) {
            r1VarArr[i65] = (jVar.E.get(i65) || jVar.f12172u.contains(Integer.valueOf(uVar.f11122b[i65])) || (uVar.f11122b[i65] != -2 && sVarArr[i65] == null)) ? null : r1.f1932c;
        }
        jVar.f12166o.getClass();
        Pair pairCreate = Pair.create(r1VarArr, sVarArr);
        r2.s[] sVarArr2 = (r2.s[]) pairCreate.second;
        List[] listArr = new List[sVarArr2.length];
        for (int i66 = 0; i66 < sVarArr2.length; i66++) {
            r2.s sVar = sVarArr2[i66];
            if (sVar != null) {
                z0VarQ = y9.f0.q(sVar);
            } else {
                y9.c0 c0Var = y9.f0.f14553w;
                z0VarQ = y9.z0.f14637z;
            }
            listArr[i66] = z0VarQ;
        }
        y9.b0 b0Var2 = new y9.b0(4);
        int i67 = 0;
        while (true) {
            int i68 = uVar.f11121a;
            o2.j1[] j1VarArr3 = uVar.f11123c;
            if (i67 >= i68) {
                break;
            }
            o2.j1 j1Var7 = j1VarArr3[i67];
            List list = listArr[i67];
            int i69 = 0;
            while (i69 < j1Var7.f9468a) {
                t1.t0 t0VarA3 = j1Var7.a(i69);
                int i70 = j1VarArr3[i67].a(i69).f12111a;
                int[] iArr18 = new int[i70];
                int i71 = 0;
                int i72 = 0;
                while (i71 < i70) {
                    List[] listArr2 = listArr;
                    if ((uVar.f11125e[i67][i69][i71] & 7) == 4) {
                        iArr18[i72] = i71;
                        i72++;
                    }
                    i71++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr18, i72);
                o2.j1 j1Var8 = j1Var7;
                int iMin = 16;
                String str2 = null;
                int i73 = 0;
                boolean z11 = false;
                int i74 = 0;
                while (i73 < iArrCopyOf.length) {
                    String str3 = j1VarArr3[i67].a(i69).f12114d[iArrCopyOf[i73]].f12061n;
                    int i75 = i74 + 1;
                    if (i74 == 0) {
                        str2 = str3;
                    } else {
                        z11 = (!Objects.equals(str2, str3)) | z11;
                    }
                    iMin = Math.min(iMin, uVar.f11125e[i67][i69][i73] & 24);
                    i73++;
                    i74 = i75;
                }
                if (z11) {
                    iMin = Math.min(iMin, uVar.f11124d[i67]);
                }
                boolean z12 = iMin != 0;
                int i76 = t0VarA3.f12111a;
                int[] iArr19 = new int[i76];
                boolean[] zArr = new boolean[i76];
                for (int i77 = 0; i77 < t0VarA3.f12111a; i77++) {
                    iArr19[i77] = uVar.f11125e[i67][i69][i77] & 7;
                    int i78 = 0;
                    while (true) {
                        if (i78 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        r2.s sVar2 = (r2.s) list.get(i78);
                        if (sVar2.j().equals(t0VarA3) && sVar2.u(i77) != -1) {
                            z10 = true;
                            break;
                        }
                        i78++;
                    }
                    zArr[i77] = z10;
                }
                b0Var2.a(new t1.y0(t0VarA3, z12, iArr19, zArr));
                i69++;
                listArr = listArr3;
                j1Var7 = j1Var8;
            }
            i67++;
        }
        o2.j1 j1Var9 = uVar.f;
        for (int i79 = 0; i79 < j1Var9.f9468a; i79++) {
            t1.t0 t0VarA4 = j1Var9.a(i79);
            int[] iArr20 = new int[t0VarA4.f12111a];
            Arrays.fill(iArr20, 0);
            b0Var2.a(new t1.y0(t0VarA4, false, iArr20, new boolean[t0VarA4.f12111a]));
        }
        r2.w wVar = new r2.w((r1[]) pairCreate.first, (r2.s[]) pairCreate.second, new t1.z0(b0Var2.g()), uVar);
        for (int i80 = 0; i80 < wVar.f11128a; i80++) {
            if (wVar.b(i80)) {
                w1.a.j(wVar.f11130c[i80] != null || this.f1998j[i80].f1723w == -2);
            } else {
                w1.a.j(wVar.f11130c[i80] == null);
            }
        }
        for (r2.s sVar3 : wVar.f11130c) {
            if (sVar3 != null) {
                sVar3.p(f);
                sVar3.a(z2);
            }
        }
        return wVar;
    }

    public final void k() {
        Object obj = this.f1991a;
        if (obj instanceof o2.d) {
            long j8 = this.f1996g.f2010d;
            if (j8 == -9223372036854775807L) {
                j8 = Long.MIN_VALUE;
            }
            o2.d dVar = (o2.d) obj;
            dVar.f9403z = 0L;
            dVar.A = j8;
        }
    }
}
