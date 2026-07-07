package v6;

import android.content.Context;
import android.graphics.Bitmap;
import gf.y;
import java.util.List;
import okhttp3.Headers;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k {
    public final Integer A;
    public final d B;
    public final c C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f13381a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13382b;

    /* renamed from: c, reason: collision with root package name */
    public final x6.a f13383c;

    /* renamed from: d, reason: collision with root package name */
    public final j f13384d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap.Config f13385e;

    /* renamed from: f, reason: collision with root package name */
    public final w6.d f13386f;

    /* renamed from: g, reason: collision with root package name */
    public final List f13387g;

    /* renamed from: h, reason: collision with root package name */
    public final z6.d f13388h;

    /* renamed from: i, reason: collision with root package name */
    public final Headers f13389i;
    public final t j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f13390k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f13391l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f13392m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f13393n;

    /* renamed from: o, reason: collision with root package name */
    public final b f13394o;

    /* renamed from: p, reason: collision with root package name */
    public final b f13395p;

    /* renamed from: q, reason: collision with root package name */
    public final b f13396q;

    /* renamed from: r, reason: collision with root package name */
    public final y f13397r;
    public final y s;

    /* renamed from: t, reason: collision with root package name */
    public final y f13398t;

    /* renamed from: u, reason: collision with root package name */
    public final y f13399u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.lifecycle.y f13400v;

    /* renamed from: w, reason: collision with root package name */
    public final w6.i f13401w;

    /* renamed from: x, reason: collision with root package name */
    public final w6.g f13402x;

    /* renamed from: y, reason: collision with root package name */
    public final q f13403y;

    /* renamed from: z, reason: collision with root package name */
    public final Integer f13404z;

    public k(Context context, Object obj, x6.a aVar, j jVar, Bitmap.Config config, w6.d dVar, List list, z6.d dVar2, Headers headers, t tVar, boolean z10, boolean z11, boolean z12, boolean z13, b bVar, b bVar2, b bVar3, y yVar, y yVar2, y yVar3, y yVar4, androidx.lifecycle.y yVar5, w6.i iVar, w6.g gVar, q qVar, Integer num, Integer num2, d dVar3, c cVar) {
        this.f13381a = context;
        this.f13382b = obj;
        this.f13383c = aVar;
        this.f13384d = jVar;
        this.f13385e = config;
        this.f13386f = dVar;
        this.f13387g = list;
        this.f13388h = dVar2;
        this.f13389i = headers;
        this.j = tVar;
        this.f13390k = z10;
        this.f13391l = z11;
        this.f13392m = z12;
        this.f13393n = z13;
        this.f13394o = bVar;
        this.f13395p = bVar2;
        this.f13396q = bVar3;
        this.f13397r = yVar;
        this.s = yVar2;
        this.f13398t = yVar3;
        this.f13399u = yVar4;
        this.f13400v = yVar5;
        this.f13401w = iVar;
        this.f13402x = gVar;
        this.f13403y = qVar;
        this.f13404z = num;
        this.A = num2;
        this.B = dVar3;
        this.C = cVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (kotlin.jvm.internal.k.a(this.f13381a, kVar.f13381a) && this.f13382b.equals(kVar.f13382b) && kotlin.jvm.internal.k.a(this.f13383c, kVar.f13383c) && kotlin.jvm.internal.k.a(this.f13384d, kVar.f13384d) && this.f13385e == kVar.f13385e && this.f13386f == kVar.f13386f && kotlin.jvm.internal.k.a(this.f13387g, kVar.f13387g) && kotlin.jvm.internal.k.a(this.f13388h, kVar.f13388h) && kotlin.jvm.internal.k.a(this.f13389i, kVar.f13389i) && this.j.equals(kVar.j) && this.f13390k == kVar.f13390k && this.f13391l == kVar.f13391l && this.f13392m == kVar.f13392m && this.f13393n == kVar.f13393n && this.f13394o == kVar.f13394o && this.f13395p == kVar.f13395p && this.f13396q == kVar.f13396q && kotlin.jvm.internal.k.a(this.f13397r, kVar.f13397r) && kotlin.jvm.internal.k.a(this.s, kVar.s) && kotlin.jvm.internal.k.a(this.f13398t, kVar.f13398t) && kotlin.jvm.internal.k.a(this.f13399u, kVar.f13399u) && kotlin.jvm.internal.k.a(this.f13404z, kVar.f13404z) && kotlin.jvm.internal.k.a(this.A, kVar.A) && kotlin.jvm.internal.k.a(this.f13400v, kVar.f13400v) && this.f13401w.equals(kVar.f13401w) && this.f13402x == kVar.f13402x && this.f13403y.equals(kVar.f13403y) && this.B.equals(kVar.B) && kotlin.jvm.internal.k.a(this.C, kVar.C)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int hashCode = (this.f13382b.hashCode() + (this.f13381a.hashCode() * 31)) * 31;
        int i15 = 0;
        x6.a aVar = this.f13383c;
        if (aVar != null) {
            i6 = aVar.f14692y.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (hashCode + i6) * 31;
        j jVar = this.f13384d;
        if (jVar != null) {
            i10 = jVar.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = (this.j.f13432a.hashCode() + ((this.f13389i.hashCode() + ((this.f13388h.hashCode() + ((this.f13387g.hashCode() + ((this.f13386f.hashCode() + ((this.f13385e.hashCode() + ((i16 + i10) * 29791)) * 961)) * 29791)) * 31)) * 31)) * 31)) * 31;
        int i17 = 1237;
        if (this.f13390k) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i18 = (hashCode2 + i11) * 31;
        if (this.f13391l) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i19 = (i18 + i12) * 31;
        if (this.f13392m) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int i20 = (i19 + i13) * 31;
        if (this.f13393n) {
            i17 = 1231;
        }
        int hashCode3 = (this.f13403y.f13423x.hashCode() + ((this.f13402x.hashCode() + ((this.f13401w.hashCode() + ((this.f13400v.hashCode() + ((this.f13399u.hashCode() + ((this.f13398t.hashCode() + ((this.s.hashCode() + ((this.f13397r.hashCode() + ((this.f13396q.hashCode() + ((this.f13395p.hashCode() + ((this.f13394o.hashCode() + ((i20 + i17) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961;
        Integer num = this.f13404z;
        if (num != null) {
            i14 = num.hashCode();
        } else {
            i14 = 0;
        }
        int i21 = (hashCode3 + i14) * 961;
        Integer num2 = this.A;
        if (num2 != null) {
            i15 = num2.hashCode();
        }
        return this.C.hashCode() + ((this.B.hashCode() + ((i21 + i15) * 923521)) * 31);
    }
}
