package a2;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import com.unity3d.services.UnityAdsConstants;
import db.c1;
import db.h0;
import db.k0;
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
import r1.e1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f176a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f177b;

    /* renamed from: c, reason: collision with root package name */
    public final q2.z0[] f178c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f179d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f180e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f181f;

    /* renamed from: g, reason: collision with root package name */
    public d1 f182g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f183h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f184i;
    public final g[] j;

    /* renamed from: k, reason: collision with root package name */
    public final t2.v f185k;

    /* renamed from: l, reason: collision with root package name */
    public final r1 f186l;

    /* renamed from: m, reason: collision with root package name */
    public c1 f187m;

    /* renamed from: n, reason: collision with root package name */
    public q2.k1 f188n;

    /* renamed from: o, reason: collision with root package name */
    public t2.w f189o;

    /* renamed from: p, reason: collision with root package name */
    public long f190p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [q2.d] */
    public c1(g[] gVarArr, long j, t2.v vVar, u2.e eVar, r1 r1Var, d1 d1Var, t2.w wVar) {
        this.j = gVarArr;
        this.f190p = j;
        this.f185k = vVar;
        this.f186l = r1Var;
        q2.c0 c0Var = d1Var.f197a;
        this.f177b = c0Var.f10834a;
        this.f182g = d1Var;
        this.f188n = q2.k1.f10907d;
        this.f189o = wVar;
        this.f178c = new q2.z0[gVarArr.length];
        this.f184i = new boolean[gVarArr.length];
        long j10 = d1Var.f198b;
        long j11 = d1Var.f200d;
        boolean z10 = d1Var.f202f;
        r1Var.getClass();
        Object obj = c0Var.f10834a;
        int i6 = x1.f489n;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        q2.c0 a10 = c0Var.a(pair.second);
        q1 q1Var = (q1) ((HashMap) r1Var.f381e).get(obj2);
        q1Var.getClass();
        ((HashSet) r1Var.f384h).add(q1Var);
        p1 p1Var = (p1) ((HashMap) r1Var.f382f).get(q1Var);
        if (p1Var != null) {
            p1Var.f362a.f(p1Var.f363b);
        }
        q1Var.f368c.add(a10);
        q2.v c10 = q1Var.f366a.c(a10, eVar, j10);
        ((IdentityHashMap) r1Var.f380d).put(c10, q1Var);
        r1Var.d();
        this.f176a = j11 != -9223372036854775807L ? new q2.d(c10, !z10, 0L, j11) : c10;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [q2.a0, java.lang.Object] */
    public final long a(t2.w wVar, long j, boolean z10, boolean[] zArr) {
        g[] gVarArr;
        Object[] objArr;
        boolean z11;
        int i6 = 0;
        while (true) {
            boolean z12 = true;
            if (i6 >= wVar.f12562a) {
                break;
            }
            if (z10 || !wVar.a(this.f189o, i6)) {
                z12 = false;
            }
            this.f184i[i6] = z12;
            i6++;
        }
        int i10 = 0;
        while (true) {
            gVarArr = this.j;
            int length = gVarArr.length;
            objArr = this.f178c;
            if (i10 >= length) {
                break;
            }
            if (gVarArr[i10].f245y == -2) {
                objArr[i10] = null;
            }
            i10++;
        }
        b();
        this.f189o = wVar;
        c();
        long p10 = this.f176a.p(wVar.f12564c, this.f184i, this.f178c, zArr, j);
        for (int i11 = 0; i11 < gVarArr.length; i11++) {
            if (gVarArr[i11].f245y == -2 && this.f189o.b(i11)) {
                objArr[i11] = new Object();
            }
        }
        this.f181f = false;
        for (int i12 = 0; i12 < objArr.length; i12++) {
            if (objArr[i12] != null) {
                u1.c.g(wVar.b(i12));
                if (gVarArr[i12].f245y != -2) {
                    this.f181f = true;
                }
            } else {
                if (wVar.f12564c[i12] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u1.c.g(z11);
            }
        }
        return p10;
    }

    public final void b() {
        if (this.f187m == null) {
            int i6 = 0;
            while (true) {
                t2.w wVar = this.f189o;
                if (i6 < wVar.f12562a) {
                    boolean b10 = wVar.b(i6);
                    t2.s sVar = this.f189o.f12564c[i6];
                    if (b10 && sVar != null) {
                        sVar.l();
                    }
                    i6++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.f187m == null) {
            int i6 = 0;
            while (true) {
                t2.w wVar = this.f189o;
                if (i6 < wVar.f12562a) {
                    boolean b10 = wVar.b(i6);
                    t2.s sVar = this.f189o.f12564c[i6];
                    if (b10 && sVar != null) {
                        sVar.i();
                    }
                    i6++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [q2.b1, java.lang.Object] */
    public final long d() {
        long j;
        if (!this.f180e) {
            return this.f182g.f198b;
        }
        if (this.f181f) {
            j = this.f176a.r();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.f182g.f201e;
        }
        return j;
    }

    public final long e() {
        return this.f182g.f198b + this.f190p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [q2.a0, java.lang.Object] */
    public final void f(float f3, r1.d1 d1Var, boolean z10) {
        this.f180e = true;
        this.f188n = this.f176a.q();
        t2.w j = j(f3, d1Var, z10);
        d1 d1Var2 = this.f182g;
        long j10 = d1Var2.f198b;
        long j11 = d1Var2.f201e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a10 = a(j, j10, false, new boolean[this.j.length]);
        long j12 = this.f190p;
        d1 d1Var3 = this.f182g;
        this.f190p = (d1Var3.f198b - a10) + j12;
        this.f182g = d1Var3.b(a10);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [q2.b1, java.lang.Object] */
    public final boolean g() {
        if (this.f180e) {
            if (!this.f181f || this.f176a.r() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if (this.f180e) {
            if (g() || d() - this.f182g.f198b >= -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [q2.a0, java.lang.Object] */
    public final void i() {
        b();
        ?? r02 = this.f176a;
        try {
            boolean z10 = r02 instanceof q2.d;
            r1 r1Var = this.f186l;
            if (z10) {
                r1Var.h(((q2.d) r02).f10842x);
            } else {
                r1Var.h(r02);
            }
        } catch (RuntimeException e10) {
            u1.a.h("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [db.e0, db.h0] */
    public final t2.w j(float f3, r1.d1 d1Var, boolean z10) {
        final t2.k kVar;
        final boolean z11;
        final String str;
        final Point point;
        int i6;
        Pair j;
        int[] iArr;
        Pair j10;
        String str2;
        Pair j11;
        CaptioningManager captioningManager;
        Locale locale;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        db.c1 c1Var;
        int i10;
        boolean z16;
        y1 y1Var;
        t2.c bVar;
        db.c1 g10;
        int i11;
        int[] iArr2;
        double d10;
        long j12;
        Object obj;
        t2.r rVar;
        int i12;
        t2.r rVar2;
        int i13;
        int i14;
        Context context;
        boolean z17;
        int[] iArr3;
        boolean z18;
        t2.v vVar = this.f185k;
        g[] gVarArr = this.j;
        q2.k1 k1Var = this.f188n;
        vVar.getClass();
        int[] iArr4 = new int[gVarArr.length + 1];
        int length = gVarArr.length + 1;
        r1.e1[][] e1VarArr = new r1.e1[length];
        int[][][] iArr5 = new int[gVarArr.length + 1][];
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = k1Var.f10909a;
            e1VarArr[i15] = new r1.e1[i16];
            iArr5[i15] = new int[i16];
        }
        int length2 = gVarArr.length;
        final int[] iArr6 = new int[length2];
        for (int i17 = 0; i17 < length2; i17++) {
            iArr6[i17] = gVarArr[i17].B();
        }
        int i18 = 0;
        while (i18 < k1Var.f10909a) {
            r1.e1 a10 = k1Var.a(i18);
            if (a10.f11388c == 5) {
                z17 = true;
            } else {
                z17 = false;
            }
            int length3 = gVarArr.length;
            int i19 = 0;
            int i20 = 0;
            boolean z19 = true;
            while (i19 < gVarArr.length) {
                g gVar = gVarArr[i19];
                t2.v vVar2 = vVar;
                q2.k1 k1Var2 = k1Var;
                int i21 = 0;
                for (int i22 = 0; i22 < a10.f11386a; i22++) {
                    i21 = Math.max(i21, gVar.A(a10.f11389d[i22]) & 7);
                }
                if (iArr4[i19] == 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (i21 > i20 || (i21 == i20 && z17 && !z19 && z18)) {
                    i20 = i21;
                    z19 = z18;
                    length3 = i19;
                }
                i19++;
                vVar = vVar2;
                k1Var = k1Var2;
            }
            t2.v vVar3 = vVar;
            q2.k1 k1Var3 = k1Var;
            if (length3 == gVarArr.length) {
                iArr3 = new int[a10.f11386a];
            } else {
                g gVar2 = gVarArr[length3];
                int[] iArr7 = new int[a10.f11386a];
                for (int i23 = 0; i23 < a10.f11386a; i23++) {
                    iArr7[i23] = gVar2.A(a10.f11389d[i23]);
                }
                iArr3 = iArr7;
            }
            int i24 = iArr4[length3];
            e1VarArr[length3][i24] = a10;
            iArr5[length3][i24] = iArr3;
            iArr4[length3] = i24 + 1;
            i18++;
            vVar = vVar3;
            k1Var = k1Var3;
        }
        t2.v vVar4 = vVar;
        q2.k1[] k1VarArr = new q2.k1[gVarArr.length];
        String[] strArr = new String[gVarArr.length];
        int[] iArr8 = new int[gVarArr.length];
        for (int i25 = 0; i25 < gVarArr.length; i25++) {
            int i26 = iArr4[i25];
            k1VarArr[i25] = new q2.k1((r1.e1[]) u1.a0.S(i26, e1VarArr[i25]));
            iArr5[i25] = (int[][]) u1.a0.S(i26, iArr5[i25]);
            strArr[i25] = gVarArr[i25].j();
            iArr8[i25] = gVarArr[i25].f245y;
        }
        t2.u uVar = new t2.u(iArr8, k1VarArr, iArr6, iArr5, new q2.k1((r1.e1[]) u1.a0.S(iArr4[gVarArr.length], e1VarArr[gVarArr.length])));
        final t2.q qVar = (t2.q) vVar4;
        synchronized (qVar.f12545c) {
            qVar.f12549g = Thread.currentThread();
            kVar = qVar.f12548f;
        }
        if (qVar.j == null && (context = qVar.f12546d) != null) {
            qVar.j = Boolean.valueOf(u1.a0.O(context));
        }
        if (kVar.f12535s0 && Build.VERSION.SDK_INT >= 32 && qVar.f12550h == null) {
            qVar.f12550h = new c(qVar.f12546d, qVar, qVar.j);
        }
        int i27 = uVar.f12554a;
        Context context2 = qVar.f12546d;
        t2.r[] rVarArr = new t2.r[i27];
        int i28 = 0;
        while (true) {
            if (i28 < uVar.f12554a) {
                if (2 == iArr8[i28] && k1VarArr[i28].f10909a > 0) {
                    z11 = true;
                    break;
                }
                i28++;
            } else {
                z11 = false;
                break;
            }
        }
        Pair j13 = t2.q.j(1, uVar, iArr5, new t2.n() { // from class: t2.e
            @Override // t2.n
            public final c1 d(int i29, e1 e1Var, int[] iArr9) {
                q qVar2 = q.this;
                qVar2.getClass();
                k kVar2 = kVar;
                f fVar = new f(qVar2, kVar2);
                int i30 = iArr6[i29];
                h0 j14 = k0.j();
                for (int i31 = 0; i31 < e1Var.f11386a; i31++) {
                    j14.a(new g(i29, e1Var, i31, kVar2, iArr9[i31], z11, fVar, i30));
                }
                return j14.g();
            }
        }, new d2.a(12));
        if (j13 != null) {
            rVarArr[((Integer) j13.second).intValue()] = (t2.r) j13.first;
        }
        if (j13 == null) {
            str = null;
        } else {
            t2.r rVar3 = (t2.r) j13.first;
            str = rVar3.f12552a.f11389d[rVar3.f12553b[0]].f11661d;
        }
        r1.h1 h1Var = kVar.f11557u;
        Object obj2 = null;
        int i29 = 11;
        if (h1Var.f11491a == 2) {
            j = null;
            i6 = 2;
        } else {
            if (kVar.f11548k && context2 != null) {
                point = u1.a0.w(context2);
            } else {
                point = null;
            }
            i6 = 2;
            j = t2.q.j(2, uVar, iArr5, new t2.n() { // from class: t2.d
                /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
                @Override // t2.n
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final db.c1 d(int r17, r1.e1 r18, int[] r19) {
                    /*
                        Method dump skipped, instructions count: 204
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: t2.d.d(int, r1.e1, int[]):db.c1");
                }
            }, new d2.a(i29));
        }
        int i30 = 4;
        if ((!kVar.A && j != null) || h1Var.f11491a == i6) {
            iArr = iArr8;
            j10 = null;
        } else {
            iArr = iArr8;
            j10 = t2.q.j(4, uVar, iArr5, new j2.u(kVar, 12), new d2.a(10));
        }
        if (j10 != null) {
            rVarArr[((Integer) j10.second).intValue()] = (t2.r) j10.first;
        } else if (j != null) {
            rVarArr[((Integer) j.second).intValue()] = (t2.r) j.first;
        }
        int i31 = 3;
        if (h1Var.f11491a == 2) {
            j11 = null;
        } else {
            if (kVar.f11560x && context2 != null && (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) != null && captioningManager.isEnabled() && (locale = captioningManager.getLocale()) != null) {
                String str3 = u1.a0.f12750a;
                str2 = locale.toLanguageTag();
            } else {
                str2 = null;
            }
            j11 = t2.q.j(3, uVar, iArr5, new i4.h0(kVar, str, str2, 11), new d2.a(13));
        }
        if (j11 != null) {
            rVarArr[((Integer) j11.second).intValue()] = (t2.r) j11.first;
        }
        int i32 = 0;
        while (i32 < i27) {
            int i33 = iArr[i32];
            if (i33 != 2 && i33 != 1 && i33 != i31 && i33 != i30) {
                q2.k1 k1Var4 = k1VarArr[i32];
                int[][] iArr9 = iArr5[i32];
                if (h1Var.f11491a == 2) {
                    i12 = i32;
                } else {
                    r1.e1 e1Var = null;
                    t2.i iVar = null;
                    int i34 = 0;
                    int i35 = 0;
                    while (i34 < k1Var4.f10909a) {
                        r1.e1 a11 = k1Var4.a(i34);
                        int[] iArr10 = iArr9[i34];
                        int i36 = i32;
                        q2.k1 k1Var5 = k1Var4;
                        t2.i iVar2 = iVar;
                        int i37 = i35;
                        r1.e1 e1Var2 = e1Var;
                        int i38 = 0;
                        while (i38 < a11.f11386a) {
                            int[][] iArr11 = iArr9;
                            if (r4.a.f(iArr10[i38], kVar.f12536t0)) {
                                i13 = i38;
                                t2.i iVar3 = new t2.i(a11.f11389d[i38], iArr10[i13]);
                                if (iVar2 != null) {
                                    i14 = i34;
                                    if (db.z.f4060a.c(iVar3.f12528y, iVar2.f12528y).c(iVar3.f12527x, iVar2.f12527x).e() <= 0) {
                                    }
                                } else {
                                    i14 = i34;
                                }
                                iVar2 = iVar3;
                                e1Var2 = a11;
                                i37 = i13;
                            } else {
                                i13 = i38;
                                i14 = i34;
                            }
                            i38 = i13 + 1;
                            iArr9 = iArr11;
                            i34 = i14;
                        }
                        i34++;
                        e1Var = e1Var2;
                        i35 = i37;
                        k1Var4 = k1Var5;
                        iVar = iVar2;
                        i32 = i36;
                    }
                    i12 = i32;
                    if (e1Var != null) {
                        rVar2 = new t2.r(0, e1Var, new int[]{i35});
                        rVarArr[i12] = rVar2;
                    }
                }
                rVar2 = null;
                rVarArr[i12] = rVar2;
            } else {
                i12 = i32;
            }
            i32 = i12 + 1;
            i31 = 3;
            i30 = 4;
        }
        int i39 = uVar.f12554a;
        q2.k1[] k1VarArr2 = uVar.f12556c;
        HashMap hashMap = new HashMap();
        for (int i40 = 0; i40 < i39; i40++) {
            t2.q.c(k1VarArr2[i40], kVar, hashMap);
        }
        t2.q.c(uVar.f12559f, kVar, hashMap);
        for (int i41 = 0; i41 < i39; i41++) {
            r1.f1 f1Var = (r1.f1) hashMap.get(Integer.valueOf(uVar.f12555b[i41]));
            if (f1Var != null) {
                r1.e1 e1Var3 = f1Var.f11397a;
                db.k0 k0Var = f1Var.f11398b;
                if (!k0Var.isEmpty() && k1VarArr2[i41].b(e1Var3) != -1) {
                    rVar = new t2.r(0, e1Var3, a8.f.U(k0Var));
                } else {
                    rVar = null;
                }
                rVarArr[i41] = rVar;
            }
        }
        int i42 = uVar.f12554a;
        for (int i43 = 0; i43 < i42; i43++) {
            q2.k1 k1Var6 = uVar.f12556c[i43];
            Map map = (Map) kVar.f12538v0.get(i43);
            if (map != null && map.containsKey(k1Var6)) {
                Map map2 = (Map) kVar.f12538v0.get(i43);
                if (map2 != null && map2.get(k1Var6) != null) {
                    throw new ClassCastException();
                }
                rVarArr[i43] = null;
            }
        }
        for (int i44 = 0; i44 < i27; i44++) {
            int i45 = uVar.f12555b[i44];
            if (kVar.f12539w0.get(i44) || kVar.E.contains(Integer.valueOf(i45))) {
                rVarArr[i44] = null;
            }
        }
        ob.a aVar = qVar.f12547e;
        u2.d dVar = qVar.f12561b;
        u1.c.h(dVar);
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i46 = 0;
        while (i46 < rVarArr.length) {
            t2.r rVar4 = rVarArr[i46];
            if (rVar4 != null && rVar4.f12553b.length > 1) {
                db.h0 j14 = db.k0.j();
                j14.a(new t2.a(0L, 0L));
                arrayList.add(j14);
                obj = obj2;
            } else {
                obj = obj2;
                arrayList.add(obj);
            }
            i46++;
            obj2 = obj;
        }
        int length4 = rVarArr.length;
        long[][] jArr = new long[length4];
        for (int i47 = 0; i47 < rVarArr.length; i47++) {
            t2.r rVar5 = rVarArr[i47];
            if (rVar5 == null) {
                jArr[i47] = new long[0];
            } else {
                int[] iArr12 = rVar5.f12553b;
                jArr[i47] = new long[iArr12.length];
                int i48 = 0;
                while (i48 < iArr12.length) {
                    int i49 = i48;
                    long j15 = rVar5.f12552a.f11389d[iArr12[i48]].j;
                    long[] jArr2 = jArr[i47];
                    if (j15 == -1) {
                        j15 = 0;
                    }
                    jArr2[i49] = j15;
                    i48 = i49 + 1;
                }
                Arrays.sort(jArr[i47]);
            }
        }
        int[] iArr13 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i50 = 0; i50 < length4; i50++) {
            long[] jArr4 = jArr[i50];
            if (jArr4.length == 0) {
                j12 = 0;
            } else {
                j12 = jArr4[0];
            }
            jArr3[i50] = j12;
        }
        t2.b.v(arrayList, jArr3);
        db.r.e(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(db.z0.f4063y);
        db.x0 x0Var = new db.x0();
        db.y0 y0Var = new db.y0(treeMap);
        y0Var.C = x0Var;
        int i51 = 0;
        while (i51 < length4) {
            long[] jArr5 = jArr[i51];
            u2.d dVar2 = dVar;
            if (jArr5.length <= 1) {
                i11 = length4;
                iArr2 = iArr13;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                int i52 = 0;
                while (true) {
                    long[] jArr6 = jArr[i51];
                    i11 = length4;
                    double d11 = 0.0d;
                    if (i52 >= jArr6.length) {
                        break;
                    }
                    int[] iArr14 = iArr13;
                    long j16 = jArr6[i52];
                    if (j16 != -1) {
                        d11 = Math.log(j16);
                    }
                    dArr[i52] = d11;
                    i52++;
                    length4 = i11;
                    iArr13 = iArr14;
                }
                iArr2 = iArr13;
                int i53 = length5 - 1;
                double d12 = dArr[i53] - dArr[0];
                int i54 = 0;
                while (i54 < i53) {
                    double d13 = dArr[i54];
                    i54++;
                    double d14 = (d13 + dArr[i54]) * 0.5d;
                    if (d12 == 0.0d) {
                        d10 = 1.0d;
                    } else {
                        d10 = (d14 - dArr[0]) / d12;
                    }
                    int i55 = i53;
                    Double valueOf = Double.valueOf(d10);
                    double d15 = d12;
                    Integer valueOf2 = Integer.valueOf(i51);
                    Map map3 = y0Var.A;
                    long[][] jArr7 = jArr;
                    Collection collection = (Collection) map3.get(valueOf);
                    if (collection == null) {
                        Collection d16 = y0Var.d();
                        if (d16.add(valueOf2)) {
                            y0Var.B++;
                            map3.put(valueOf, d16);
                        } else {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                    } else if (collection.add(valueOf2)) {
                        y0Var.B++;
                    }
                    i53 = i55;
                    d12 = d15;
                    jArr = jArr7;
                }
            }
            i51++;
            length4 = i11;
            iArr13 = iArr2;
            dVar = dVar2;
            jArr = jArr;
        }
        u2.d dVar3 = dVar;
        int[] iArr15 = iArr13;
        long[][] jArr8 = jArr;
        Collection collection2 = y0Var.f4025y;
        if (collection2 == null) {
            collection2 = new db.n(0, y0Var);
            y0Var.f4025y = collection2;
        }
        db.k0 k8 = db.k0.k(collection2);
        for (int i56 = 0; i56 < k8.size(); i56++) {
            int intValue = ((Integer) k8.get(i56)).intValue();
            int i57 = iArr15[intValue] + 1;
            iArr15[intValue] = i57;
            jArr3[intValue] = jArr8[intValue][i57];
            t2.b.v(arrayList, jArr3);
        }
        for (int i58 = 0; i58 < rVarArr.length; i58++) {
            if (arrayList.get(i58) != null) {
                jArr3[i58] = jArr3[i58] * 2;
            }
        }
        t2.b.v(arrayList, jArr3);
        db.h0 j17 = db.k0.j();
        for (int i59 = 0; i59 < arrayList.size(); i59++) {
            db.h0 h0Var = (db.h0) arrayList.get(i59);
            if (h0Var == null) {
                g10 = db.c1.B;
            } else {
                g10 = h0Var.g();
            }
            j17.a(g10);
        }
        db.c1 g11 = j17.g();
        t2.s[] sVarArr = new t2.s[rVarArr.length];
        for (int i60 = 0; i60 < rVarArr.length; i60++) {
            t2.r rVar6 = rVarArr[i60];
            if (rVar6 != null) {
                int[] iArr16 = rVar6.f12553b;
                if (iArr16.length != 0) {
                    if (iArr16.length == 1) {
                        bVar = new t2.c(rVar6.f12552a, new int[]{iArr16[0]});
                    } else {
                        long j18 = 25000;
                        bVar = new t2.b(rVar6.f12552a, iArr16, dVar3, UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS, j18, j18, (db.k0) g11.get(i60));
                    }
                    sVarArr[i60] = bVar;
                }
            }
        }
        y1[] y1VarArr = new y1[i27];
        for (int i61 = 0; i61 < i27; i61++) {
            int i62 = uVar.f12555b[i61];
            if (!kVar.f12539w0.get(i61) && !kVar.E.contains(Integer.valueOf(i62)) && (uVar.f12555b[i61] == -2 || sVarArr[i61] != null)) {
                y1Var = y1.f503c;
            } else {
                y1Var = null;
            }
            y1VarArr[i61] = y1Var;
        }
        if (kVar.f11557u.f11491a != 0) {
            int i63 = 0;
            int i64 = -1;
            int i65 = 0;
            while (true) {
                if (i65 < uVar.f12554a) {
                    int i66 = uVar.f12555b[i65];
                    t2.s sVar = sVarArr[i65];
                    if (i66 != 1 && sVar != null) {
                        break;
                    }
                    if (i66 == 1 && sVar != null && sVar.length() == 1) {
                        if (t2.q.i(kVar, iArr5[i65][uVar.f12556c[i65].b(sVar.c())][sVar.j(0)], sVar.n())) {
                            i63++;
                            i64 = i65;
                        }
                    }
                    i65++;
                } else if (i63 == 1) {
                    if (kVar.f11557u.f11492b) {
                        i10 = 1;
                    } else {
                        i10 = 2;
                    }
                    y1 y1Var2 = y1VarArr[i64];
                    if (y1Var2 != null && y1Var2.f505b) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    y1VarArr[i64] = new y1(i10, z16);
                }
            }
        }
        Pair create = Pair.create(y1VarArr, sVarArr);
        t2.s[] sVarArr2 = (t2.s[]) create.second;
        List[] listArr = new List[sVarArr2.length];
        for (int i67 = 0; i67 < sVarArr2.length; i67++) {
            t2.s sVar2 = sVarArr2[i67];
            if (sVar2 != null) {
                c1Var = db.k0.o(sVar2);
            } else {
                db.i0 i0Var = db.k0.f4008y;
                c1Var = db.c1.B;
            }
            listArr[i67] = c1Var;
        }
        ?? e0Var = new db.e0(4);
        int i68 = 0;
        while (true) {
            int i69 = uVar.f12554a;
            q2.k1[] k1VarArr3 = uVar.f12556c;
            if (i68 >= i69) {
                break;
            }
            q2.k1 k1Var7 = k1VarArr3[i68];
            List list = listArr[i68];
            int i70 = 0;
            while (i70 < k1Var7.f10909a) {
                r1.e1 a12 = k1Var7.a(i70);
                int i71 = k1VarArr3[i68].a(i70).f11386a;
                int[] iArr17 = new int[i71];
                int i72 = 0;
                int i73 = 0;
                while (i72 < i71) {
                    List[] listArr2 = listArr;
                    if ((uVar.f12558e[i68][i70][i72] & 7) == 4) {
                        iArr17[i73] = i72;
                        i73++;
                    }
                    i72++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr17, i73);
                q2.k1 k1Var8 = k1Var7;
                String str4 = null;
                int i74 = 0;
                boolean z20 = false;
                int i75 = 0;
                int i76 = 16;
                while (i74 < copyOf.length) {
                    String str5 = k1VarArr3[i68].a(i70).f11389d[copyOf[i74]].f11670n;
                    int i77 = i75 + 1;
                    if (i75 == 0) {
                        str4 = str5;
                    } else {
                        z20 = (!Objects.equals(str4, str5)) | z20;
                    }
                    i76 = Math.min(i76, uVar.f12558e[i68][i70][i74] & 24);
                    i74++;
                    i75 = i77;
                }
                if (z20) {
                    i76 = Math.min(i76, uVar.f12557d[i68]);
                }
                if (i76 != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i78 = a12.f11386a;
                int[] iArr18 = new int[i78];
                boolean[] zArr = new boolean[i78];
                for (int i79 = 0; i79 < a12.f11386a; i79++) {
                    iArr18[i79] = uVar.f12558e[i68][i70][i79] & 7;
                    int i80 = 0;
                    while (true) {
                        if (i80 < list.size()) {
                            t2.s sVar3 = (t2.s) list.get(i80);
                            if (sVar3.c().equals(a12) && sVar3.u(i79) != -1) {
                                z15 = true;
                                break;
                            }
                            i80++;
                        } else {
                            z15 = false;
                            break;
                        }
                    }
                    zArr[i79] = z15;
                }
                e0Var.a(new r1.k1(a12, z14, iArr18, zArr));
                i70++;
                listArr = listArr3;
                k1Var7 = k1Var8;
            }
            i68++;
        }
        q2.k1 k1Var9 = uVar.f12559f;
        for (int i81 = 0; i81 < k1Var9.f10909a; i81++) {
            r1.e1 a13 = k1Var9.a(i81);
            int[] iArr19 = new int[a13.f11386a];
            Arrays.fill(iArr19, 0);
            e0Var.a(new r1.k1(a13, false, iArr19, new boolean[a13.f11386a]));
        }
        t2.w wVar = new t2.w((y1[]) create.first, (t2.s[]) create.second, new r1.l1(e0Var.g()), uVar);
        for (int i82 = 0; i82 < wVar.f12562a; i82++) {
            if (wVar.b(i82)) {
                if (wVar.f12564c[i82] == null && this.j[i82].f245y != -2) {
                    z13 = false;
                    u1.c.g(z13);
                }
                z13 = true;
                u1.c.g(z13);
            } else {
                if (wVar.f12564c[i82] == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u1.c.g(z12);
            }
        }
        for (t2.s sVar4 : wVar.f12564c) {
            if (sVar4 != null) {
                sVar4.q(f3);
                sVar4.f(z10);
            }
        }
        return wVar;
    }

    public final void k() {
        Object obj = this.f176a;
        if (obj instanceof q2.d) {
            long j = this.f182g.f200d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            q2.d dVar = (q2.d) obj;
            dVar.B = 0L;
            dVar.C = j;
        }
    }
}
