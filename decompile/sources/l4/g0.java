package l4;

import android.os.Bundle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f8124b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f8125c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f8126d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f8127e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f8128f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f8129g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f8130h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f8131i;
    public static final c j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f8132k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f8133l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f8134m;

    /* renamed from: n, reason: collision with root package name */
    public static final c f8135n;

    /* renamed from: o, reason: collision with root package name */
    public static final d f8136o;

    /* renamed from: p, reason: collision with root package name */
    public static final c f8137p;

    /* renamed from: q, reason: collision with root package name */
    public static final c f8138q;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8139a;

    static {
        boolean z10 = false;
        f8124b = new d(2, z10);
        int i6 = 4;
        f8125c = new d(i6, z10);
        boolean z11 = true;
        f8126d = new c(i6, z11);
        f8127e = new c(5, z11);
        f8128f = new d(3, z10);
        f8129g = new c(6, z11);
        f8130h = new c(7, z11);
        f8131i = new d(1, z10);
        j = new c(2, z11);
        f8132k = new c(3, z11);
        int i10 = 0;
        f8133l = new d(i10, z10);
        f8134m = new c(i10, z11);
        f8135n = new c(1, z11);
        f8136o = new d(5, z11);
        f8137p = new c(8, z11);
        f8138q = new c(9, z11);
    }

    public g0(boolean z10) {
        this.f8139a = z10;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }
}
