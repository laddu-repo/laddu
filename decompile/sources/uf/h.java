package uf;

import cf.q;
import he.m;
import ie.l;
import ie.r;
import ie.u;
import ie.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements g, wf.j {

    /* renamed from: a, reason: collision with root package name */
    public final String f13124a;

    /* renamed from: b, reason: collision with root package name */
    public final a8.a f13125b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13126c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f13127d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f13128e;

    /* renamed from: f, reason: collision with root package name */
    public final g[] f13129f;

    /* renamed from: g, reason: collision with root package name */
    public final List[] f13130g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f13131h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f13132i;
    public final g[] j;

    /* renamed from: k, reason: collision with root package name */
    public final m f13133k;

    public h(String serialName, a8.a aVar, int i6, List list, a aVar2) {
        kotlin.jvm.internal.k.e(serialName, "serialName");
        this.f13124a = serialName;
        this.f13125b = aVar;
        this.f13126c = i6;
        ArrayList arrayList = aVar2.f13106b;
        kotlin.jvm.internal.k.e(arrayList, "<this>");
        HashSet hashSet = new HashSet(w.w(l.x(arrayList, 12)));
        ie.j.X(arrayList, hashSet);
        this.f13127d = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f13128e = strArr;
        this.f13129f = u0.c(aVar2.f13108d);
        this.f13130g = (List[]) aVar2.f13109e.toArray(new List[0]);
        this.f13131h = ie.j.V(aVar2.f13110f);
        kotlin.jvm.internal.k.e(strArr, "<this>");
        q qVar = new q(new androidx.lifecycle.i(strArr, 7), 1);
        ArrayList arrayList2 = new ArrayList(l.x(qVar, 10));
        Iterator it = qVar.iterator();
        while (true) {
            cf.b bVar = (cf.b) it;
            if (bVar.f2050z.hasNext()) {
                u uVar = (u) bVar.next();
                arrayList2.add(new he.i(uVar.f6850b, Integer.valueOf(uVar.f6849a)));
            } else {
                this.f13132i = w.C(arrayList2);
                this.j = u0.c(list);
                this.f13133k = he.a.d(new androidx.lifecycle.i(this, 23));
                return;
            }
        }
    }

    @Override // uf.g
    public final String a() {
        return this.f13124a;
    }

    @Override // wf.j
    public final Set b() {
        return this.f13127d;
    }

    @Override // uf.g
    public final boolean c() {
        return false;
    }

    @Override // uf.g
    public final int d(String name) {
        kotlin.jvm.internal.k.e(name, "name");
        Integer num = (Integer) this.f13132i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // uf.g
    public final int e() {
        return this.f13126c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                g gVar = (g) obj;
                if (kotlin.jvm.internal.k.a(this.f13124a, gVar.a()) && Arrays.equals(this.j, ((h) obj).j)) {
                    int e10 = gVar.e();
                    int i6 = this.f13126c;
                    if (i6 == e10) {
                        for (int i10 = 0; i10 < i6; i10++) {
                            g[] gVarArr = this.f13129f;
                            if (kotlin.jvm.internal.k.a(gVarArr[i10].a(), gVar.h(i10).a()) && kotlin.jvm.internal.k.a(gVarArr[i10].getKind(), gVar.h(i10).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // uf.g
    public final String f(int i6) {
        return this.f13128e[i6];
    }

    @Override // uf.g
    public final List g(int i6) {
        return this.f13130g[i6];
    }

    @Override // uf.g
    public final List getAnnotations() {
        return r.f6846x;
    }

    @Override // uf.g
    public final a8.a getKind() {
        return this.f13125b;
    }

    @Override // uf.g
    public final g h(int i6) {
        return this.f13129f[i6];
    }

    public final int hashCode() {
        return ((Number) this.f13133k.getValue()).intValue();
    }

    @Override // uf.g
    public final boolean i(int i6) {
        return this.f13131h[i6];
    }

    @Override // uf.g
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return u0.j(this);
    }
}
