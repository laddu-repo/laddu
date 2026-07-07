package r1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class i1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public HashMap D;
    public HashSet E;

    /* renamed from: e, reason: collision with root package name */
    public int f11498e;

    /* renamed from: f, reason: collision with root package name */
    public int f11499f;

    /* renamed from: g, reason: collision with root package name */
    public int f11500g;

    /* renamed from: h, reason: collision with root package name */
    public int f11501h;

    /* renamed from: m, reason: collision with root package name */
    public db.k0 f11505m;

    /* renamed from: n, reason: collision with root package name */
    public db.k0 f11506n;

    /* renamed from: o, reason: collision with root package name */
    public int f11507o;

    /* renamed from: p, reason: collision with root package name */
    public db.k0 f11508p;

    /* renamed from: q, reason: collision with root package name */
    public int f11509q;

    /* renamed from: r, reason: collision with root package name */
    public int f11510r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public db.k0 f11511t;

    /* renamed from: u, reason: collision with root package name */
    public h1 f11512u;

    /* renamed from: v, reason: collision with root package name */
    public db.k0 f11513v;

    /* renamed from: w, reason: collision with root package name */
    public int f11514w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11515x;

    /* renamed from: y, reason: collision with root package name */
    public int f11516y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11517z;

    /* renamed from: a, reason: collision with root package name */
    public int f11494a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public int f11495b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f11496c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f11497d = Integer.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f11502i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11503k = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11504l = true;

    public i1() {
        db.i0 i0Var = db.k0.f4008y;
        db.c1 c1Var = db.c1.B;
        this.f11505m = c1Var;
        this.f11506n = c1Var;
        this.f11507o = 0;
        this.f11508p = c1Var;
        this.f11509q = 0;
        this.f11510r = Integer.MAX_VALUE;
        this.s = Integer.MAX_VALUE;
        this.f11511t = c1Var;
        this.f11512u = h1.f11487d;
        this.f11513v = c1Var;
        this.f11514w = 0;
        this.f11515x = true;
        this.f11516y = 0;
        this.f11517z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = new HashMap();
        this.E = new HashSet();
    }

    public static db.c1 f(String[] strArr) {
        db.h0 j = db.k0.j();
        for (String str : strArr) {
            str.getClass();
            j.a(u1.a0.R(str));
        }
        return j.g();
    }

    public void a(f1 f1Var) {
        this.D.put(f1Var.f11397a, f1Var);
    }

    public j1 b() {
        return new j1(this);
    }

    public i1 c() {
        this.D.clear();
        return this;
    }

    public i1 d(int i6) {
        Iterator it = this.D.values().iterator();
        while (it.hasNext()) {
            if (((f1) it.next()).f11397a.f11388c == i6) {
                it.remove();
            }
        }
        return this;
    }

    public final void e(j1 j1Var) {
        this.f11494a = j1Var.f11539a;
        this.f11495b = j1Var.f11540b;
        this.f11496c = j1Var.f11541c;
        this.f11497d = j1Var.f11542d;
        this.f11498e = j1Var.f11543e;
        this.f11499f = j1Var.f11544f;
        this.f11500g = j1Var.f11545g;
        this.f11501h = j1Var.f11546h;
        this.f11502i = j1Var.f11547i;
        this.j = j1Var.j;
        this.f11503k = j1Var.f11548k;
        this.f11504l = j1Var.f11549l;
        this.f11505m = j1Var.f11550m;
        this.f11506n = j1Var.f11551n;
        this.f11507o = j1Var.f11552o;
        this.f11508p = j1Var.f11553p;
        this.f11509q = j1Var.f11554q;
        this.f11510r = j1Var.f11555r;
        this.s = j1Var.s;
        this.f11511t = j1Var.f11556t;
        this.f11512u = j1Var.f11557u;
        this.f11513v = j1Var.f11558v;
        this.f11514w = j1Var.f11559w;
        this.f11515x = j1Var.f11560x;
        this.f11516y = j1Var.f11561y;
        this.f11517z = j1Var.f11562z;
        this.A = j1Var.A;
        this.B = j1Var.B;
        this.C = j1Var.C;
        this.E = new HashSet(j1Var.E);
        this.D = new HashMap(j1Var.D);
    }

    public i1 g() {
        this.f11516y = -3;
        return this;
    }

    public i1 h(f1 f1Var) {
        e1 e1Var = f1Var.f11397a;
        d(e1Var.f11388c);
        this.D.put(e1Var, f1Var);
        return this;
    }

    public i1 i() {
        return j(new String[0]);
    }

    public i1 j(String... strArr) {
        this.f11513v = f(strArr);
        this.f11515x = false;
        return this;
    }

    public i1 k() {
        this.f11514w = 0;
        this.f11515x = false;
        return this;
    }

    public i1 l(int i6, boolean z10) {
        if (z10) {
            this.E.add(Integer.valueOf(i6));
            return this;
        }
        this.E.remove(Integer.valueOf(i6));
        return this;
    }
}
