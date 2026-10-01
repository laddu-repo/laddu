package j7;

import b7.j;
import j4.b0;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f7266a;

    /* renamed from: b, reason: collision with root package name */
    public final j f7267b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7268c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7269d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7270e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7271f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7272g;

    /* renamed from: h, reason: collision with root package name */
    public final List f7273h;

    /* renamed from: i, reason: collision with root package name */
    public final h7.d f7274i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7275k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7276l;

    /* renamed from: m, reason: collision with root package name */
    public final float f7277m;

    /* renamed from: n, reason: collision with root package name */
    public final float f7278n;

    /* renamed from: o, reason: collision with root package name */
    public final float f7279o;

    /* renamed from: p, reason: collision with root package name */
    public final float f7280p;

    /* renamed from: q, reason: collision with root package name */
    public final h7.a f7281q;

    /* renamed from: r, reason: collision with root package name */
    public final b0 f7282r;
    public final h7.b s;

    /* renamed from: t, reason: collision with root package name */
    public final List f7283t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7284u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f7285v;

    /* renamed from: w, reason: collision with root package name */
    public final k7.d f7286w;

    /* renamed from: x, reason: collision with root package name */
    public final b4.h f7287x;

    /* renamed from: y, reason: collision with root package name */
    public final int f7288y;

    public d(List list, j jVar, String str, long j, int i6, long j10, String str2, List list2, h7.d dVar, int i10, int i11, int i12, float f3, float f10, float f11, float f12, h7.a aVar, b0 b0Var, List list3, int i13, h7.b bVar, boolean z10, k7.d dVar2, b4.h hVar, int i14) {
        this.f7266a = list;
        this.f7267b = jVar;
        this.f7268c = str;
        this.f7269d = j;
        this.f7270e = i6;
        this.f7271f = j10;
        this.f7272g = str2;
        this.f7273h = list2;
        this.f7274i = dVar;
        this.j = i10;
        this.f7275k = i11;
        this.f7276l = i12;
        this.f7277m = f3;
        this.f7278n = f10;
        this.f7279o = f11;
        this.f7280p = f12;
        this.f7281q = aVar;
        this.f7282r = b0Var;
        this.f7283t = list3;
        this.f7284u = i13;
        this.s = bVar;
        this.f7285v = z10;
        this.f7286w = dVar2;
        this.f7287x = hVar;
        this.f7288y = i14;
    }

    public final String a(String str) {
        int i6;
        StringBuilder b10 = y.e.b(str);
        b10.append(this.f7268c);
        b10.append("\n");
        long j = this.f7271f;
        j jVar = this.f7267b;
        d dVar = (d) jVar.f1550i.d(j);
        if (dVar != null) {
            b10.append("\t\tParents: ");
            b10.append(dVar.f7268c);
            for (d dVar2 = (d) jVar.f1550i.d(dVar.f7271f); dVar2 != null; dVar2 = (d) jVar.f1550i.d(dVar2.f7271f)) {
                b10.append("->");
                b10.append(dVar2.f7268c);
            }
            b10.append(str);
            b10.append("\n");
        }
        List list = this.f7273h;
        if (!list.isEmpty()) {
            b10.append(str);
            b10.append("\tMasks: ");
            b10.append(list.size());
            b10.append("\n");
        }
        int i10 = this.j;
        if (i10 != 0 && (i6 = this.f7275k) != 0) {
            b10.append(str);
            b10.append("\tBackground: ");
            b10.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i10), Integer.valueOf(i6), Integer.valueOf(this.f7276l)));
        }
        List list2 = this.f7266a;
        if (!list2.isEmpty()) {
            b10.append(str);
            b10.append("\tShapes:\n");
            for (Object obj : list2) {
                b10.append(str);
                b10.append("\t\t");
                b10.append(obj);
                b10.append("\n");
            }
        }
        return b10.toString();
    }

    public final String toString() {
        return a(HttpUrl.FRAGMENT_ENCODE_SET);
    }
}
