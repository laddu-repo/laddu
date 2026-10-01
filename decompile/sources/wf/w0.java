package wf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class w0 implements uf.g, j {

    /* renamed from: a, reason: collision with root package name */
    public final String f14411a;

    /* renamed from: b, reason: collision with root package name */
    public final z f14412b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14413c;

    /* renamed from: d, reason: collision with root package name */
    public int f14414d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f14415e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f14416f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f14417g;

    /* renamed from: h, reason: collision with root package name */
    public Object f14418h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f14419i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f14420k;

    public w0(String str, z zVar, int i6) {
        this.f14411a = str;
        this.f14412b = zVar;
        this.f14413c = i6;
        String[] strArr = new String[i6];
        for (int i10 = 0; i10 < i6; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f14415e = strArr;
        int i11 = this.f14413c;
        this.f14416f = new List[i11];
        this.f14417g = new boolean[i11];
        this.f14418h = ie.s.f6847x;
        final int i12 = 0;
        ve.a aVar = new ve.a(this) { // from class: wf.v0

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ w0 f14406y;

            {
                this.f14406y = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [he.f, java.lang.Object] */
            @Override // ve.a
            public final Object invoke() {
                ArrayList arrayList;
                switch (i12) {
                    case 0:
                        z zVar2 = this.f14406y.f14412b;
                        if (zVar2 != null) {
                            return zVar2.b();
                        }
                        return u0.f14399b;
                    case 1:
                        if (this.f14406y.f14412b != null) {
                            arrayList = new ArrayList(0);
                        } else {
                            arrayList = null;
                        }
                        return u0.c(arrayList);
                    default:
                        w0 w0Var = this.f14406y;
                        return Integer.valueOf(u0.e(w0Var, (uf.g[]) w0Var.j.getValue()));
                }
            }
        };
        he.g gVar = he.g.f6074y;
        this.f14419i = he.a.c(gVar, aVar);
        final int i13 = 1;
        this.j = he.a.c(gVar, new ve.a(this) { // from class: wf.v0

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ w0 f14406y;

            {
                this.f14406y = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [he.f, java.lang.Object] */
            @Override // ve.a
            public final Object invoke() {
                ArrayList arrayList;
                switch (i13) {
                    case 0:
                        z zVar2 = this.f14406y.f14412b;
                        if (zVar2 != null) {
                            return zVar2.b();
                        }
                        return u0.f14399b;
                    case 1:
                        if (this.f14406y.f14412b != null) {
                            arrayList = new ArrayList(0);
                        } else {
                            arrayList = null;
                        }
                        return u0.c(arrayList);
                    default:
                        w0 w0Var = this.f14406y;
                        return Integer.valueOf(u0.e(w0Var, (uf.g[]) w0Var.j.getValue()));
                }
            }
        });
        final int i14 = 2;
        this.f14420k = he.a.c(gVar, new ve.a(this) { // from class: wf.v0

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ w0 f14406y;

            {
                this.f14406y = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [he.f, java.lang.Object] */
            @Override // ve.a
            public final Object invoke() {
                ArrayList arrayList;
                switch (i14) {
                    case 0:
                        z zVar2 = this.f14406y.f14412b;
                        if (zVar2 != null) {
                            return zVar2.b();
                        }
                        return u0.f14399b;
                    case 1:
                        if (this.f14406y.f14412b != null) {
                            arrayList = new ArrayList(0);
                        } else {
                            arrayList = null;
                        }
                        return u0.c(arrayList);
                    default:
                        w0 w0Var = this.f14406y;
                        return Integer.valueOf(u0.e(w0Var, (uf.g[]) w0Var.j.getValue()));
                }
            }
        });
    }

    @Override // uf.g
    public final String a() {
        return this.f14411a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    @Override // wf.j
    public final Set b() {
        return this.f14418h.keySet();
    }

    @Override // uf.g
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    @Override // uf.g
    public final int d(String name) {
        kotlin.jvm.internal.k.e(name, "name");
        Integer num = (Integer) this.f14418h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // uf.g
    public final int e() {
        return this.f14413c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [he.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [he.f, java.lang.Object] */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w0) {
                uf.g gVar = (uf.g) obj;
                if (this.f14411a.equals(gVar.a()) && Arrays.equals((uf.g[]) this.j.getValue(), (uf.g[]) ((w0) obj).j.getValue())) {
                    int e10 = gVar.e();
                    int i6 = this.f14413c;
                    if (i6 == e10) {
                        for (int i10 = 0; i10 < i6; i10++) {
                            if (kotlin.jvm.internal.k.a(h(i10).a(), gVar.h(i10).a()) && kotlin.jvm.internal.k.a(h(i10).getKind(), gVar.h(i10).getKind())) {
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
        return this.f14415e[i6];
    }

    @Override // uf.g
    public final List g(int i6) {
        List list = this.f14416f[i6];
        if (list == null) {
            return ie.r.f6846x;
        }
        return list;
    }

    @Override // uf.g
    public final List getAnnotations() {
        return ie.r.f6846x;
    }

    @Override // uf.g
    public a8.a getKind() {
        return uf.j.f13136f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [he.f, java.lang.Object] */
    @Override // uf.g
    public uf.g h(int i6) {
        return ((sf.a[]) this.f14419i.getValue())[i6].d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [he.f, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f14420k.getValue()).intValue();
    }

    @Override // uf.g
    public final boolean i(int i6) {
        return this.f14417g[i6];
    }

    @Override // uf.g
    public boolean isInline() {
        return false;
    }

    public final void j(String name, boolean z10) {
        kotlin.jvm.internal.k.e(name, "name");
        int i6 = this.f14414d + 1;
        this.f14414d = i6;
        String[] strArr = this.f14415e;
        strArr[i6] = name;
        this.f14417g[i6] = z10;
        this.f14416f[i6] = null;
        if (i6 == this.f14413c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                hashMap.put(strArr[i10], Integer.valueOf(i10));
            }
            this.f14418h = hashMap;
        }
    }

    public String toString() {
        return u0.j(this);
    }
}
