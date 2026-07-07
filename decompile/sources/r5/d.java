package r5;

import j5.j;
import java.util.List;
import java.util.Locale;
import k8.k4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f11265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11268e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f11270h;
    public final p5.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f11271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f11272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f11274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f11275n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f11276o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f11277p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p5.a f11278q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p2.c f11279r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p5.b f11280s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f11281t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f11282u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f11283v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k4 f11284w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ad.c f11285x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f11286y;

    public d(List list, j jVar, String str, long j8, int i, long j9, String str2, List list2, p5.d dVar, int i10, int i11, int i12, float f, float f4, float f10, float f11, p5.a aVar, p2.c cVar, List list3, int i13, p5.b bVar, boolean z2, k4 k4Var, ad.c cVar2, int i14) {
        this.f11264a = list;
        this.f11265b = jVar;
        this.f11266c = str;
        this.f11267d = j8;
        this.f11268e = i;
        this.f = j9;
        this.f11269g = str2;
        this.f11270h = list2;
        this.i = dVar;
        this.f11271j = i10;
        this.f11272k = i11;
        this.f11273l = i12;
        this.f11274m = f;
        this.f11275n = f4;
        this.f11276o = f10;
        this.f11277p = f11;
        this.f11278q = aVar;
        this.f11279r = cVar;
        this.f11281t = list3;
        this.f11282u = i13;
        this.f11280s = bVar;
        this.f11283v = z2;
        this.f11284w = k4Var;
        this.f11285x = cVar2;
        this.f11286y = i14;
    }

    public final String a(String str) {
        int i;
        StringBuilder sbB = y.e.b(str);
        sbB.append(this.f11266c);
        sbB.append("\n");
        long j8 = this.f;
        j jVar = this.f11265b;
        d dVar = (d) jVar.i.d(j8);
        if (dVar != null) {
            sbB.append("\t\tParents: ");
            sbB.append(dVar.f11266c);
            for (d dVar2 = (d) jVar.i.d(dVar.f); dVar2 != null; dVar2 = (d) jVar.i.d(dVar2.f)) {
                sbB.append("->");
                sbB.append(dVar2.f11266c);
            }
            sbB.append(str);
            sbB.append("\n");
        }
        List list = this.f11270h;
        if (!list.isEmpty()) {
            sbB.append(str);
            sbB.append("\tMasks: ");
            sbB.append(list.size());
            sbB.append("\n");
        }
        int i10 = this.f11271j;
        if (i10 != 0 && (i = this.f11272k) != 0) {
            sbB.append(str);
            sbB.append("\tBackground: ");
            sbB.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i10), Integer.valueOf(i), Integer.valueOf(this.f11273l)));
        }
        List list2 = this.f11264a;
        if (!list2.isEmpty()) {
            sbB.append(str);
            sbB.append("\tShapes:\n");
            for (Object obj : list2) {
                sbB.append(str);
                sbB.append("\t\t");
                sbB.append(obj);
                sbB.append("\n");
            }
        }
        return sbB.toString();
    }

    public final String toString() {
        return a("");
    }
}
