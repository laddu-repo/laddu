package z3;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14707e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f14711k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f14712l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f14715o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f14716p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f14718r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f14720t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f14721u;
    public int f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14708g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14709h = -1;
    public int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14710j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14713m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14714n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14717q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f14719s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f14705c && gVar.f14705c) {
                this.f14704b = gVar.f14704b;
                this.f14705c = true;
            }
            if (this.f14709h == -1) {
                this.f14709h = gVar.f14709h;
            }
            if (this.i == -1) {
                this.i = gVar.i;
            }
            if (this.f14703a == null && (str = gVar.f14703a) != null) {
                this.f14703a = str;
            }
            if (this.f == -1) {
                this.f = gVar.f;
            }
            if (this.f14708g == -1) {
                this.f14708g = gVar.f14708g;
            }
            if (this.f14714n == -1) {
                this.f14714n = gVar.f14714n;
            }
            if (this.f14715o == null && (alignment2 = gVar.f14715o) != null) {
                this.f14715o = alignment2;
            }
            if (this.f14716p == null && (alignment = gVar.f14716p) != null) {
                this.f14716p = alignment;
            }
            if (this.f14717q == -1) {
                this.f14717q = gVar.f14717q;
            }
            if (this.f14710j == -1) {
                this.f14710j = gVar.f14710j;
                this.f14711k = gVar.f14711k;
            }
            if (this.f14718r == null) {
                this.f14718r = gVar.f14718r;
            }
            if (this.f14719s == Float.MAX_VALUE) {
                this.f14719s = gVar.f14719s;
            }
            if (this.f14720t == null) {
                this.f14720t = gVar.f14720t;
            }
            if (this.f14721u == null) {
                this.f14721u = gVar.f14721u;
            }
            if (!this.f14707e && gVar.f14707e) {
                this.f14706d = gVar.f14706d;
                this.f14707e = true;
            }
            if (this.f14713m != -1 || (i = gVar.f14713m) == -1) {
                return;
            }
            this.f14713m = i;
        }
    }
}
