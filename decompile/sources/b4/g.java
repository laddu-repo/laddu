package b4;

import android.text.Layout;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f1450a;

    /* renamed from: b, reason: collision with root package name */
    public int f1451b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1452c;

    /* renamed from: d, reason: collision with root package name */
    public int f1453d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1454e;

    /* renamed from: k, reason: collision with root package name */
    public float f1459k;

    /* renamed from: l, reason: collision with root package name */
    public String f1460l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f1463o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f1464p;

    /* renamed from: r, reason: collision with root package name */
    public b f1466r;

    /* renamed from: t, reason: collision with root package name */
    public String f1467t;

    /* renamed from: u, reason: collision with root package name */
    public String f1468u;

    /* renamed from: f, reason: collision with root package name */
    public int f1455f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f1456g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f1457h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f1458i = -1;
    public int j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f1461m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f1462n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f1465q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i6;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f1452c && gVar.f1452c) {
                this.f1451b = gVar.f1451b;
                this.f1452c = true;
            }
            if (this.f1457h == -1) {
                this.f1457h = gVar.f1457h;
            }
            if (this.f1458i == -1) {
                this.f1458i = gVar.f1458i;
            }
            if (this.f1450a == null && (str = gVar.f1450a) != null) {
                this.f1450a = str;
            }
            if (this.f1455f == -1) {
                this.f1455f = gVar.f1455f;
            }
            if (this.f1456g == -1) {
                this.f1456g = gVar.f1456g;
            }
            if (this.f1462n == -1) {
                this.f1462n = gVar.f1462n;
            }
            if (this.f1463o == null && (alignment2 = gVar.f1463o) != null) {
                this.f1463o = alignment2;
            }
            if (this.f1464p == null && (alignment = gVar.f1464p) != null) {
                this.f1464p = alignment;
            }
            if (this.f1465q == -1) {
                this.f1465q = gVar.f1465q;
            }
            if (this.j == -1) {
                this.j = gVar.j;
                this.f1459k = gVar.f1459k;
            }
            if (this.f1466r == null) {
                this.f1466r = gVar.f1466r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = gVar.s;
            }
            if (this.f1467t == null) {
                this.f1467t = gVar.f1467t;
            }
            if (this.f1468u == null) {
                this.f1468u = gVar.f1468u;
            }
            if (!this.f1454e && gVar.f1454e) {
                this.f1453d = gVar.f1453d;
                this.f1454e = true;
            }
            if (this.f1461m == -1 && (i6 = gVar.f1461m) != -1) {
                this.f1461m = i6;
            }
        }
    }
}
