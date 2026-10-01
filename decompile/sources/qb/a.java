package qb;

import java.io.Serializable;
import java.util.HashSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f11146a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f11147b;

    /* renamed from: c, reason: collision with root package name */
    public int f11148c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11149d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f11150e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f11151f;

    /* renamed from: g, reason: collision with root package name */
    public Object f11152g;

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f11149d = hashSet;
        this.f11150e = new HashSet();
        this.f11147b = 0;
        this.f11148c = 0;
        this.f11151f = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            a8.c.d(cls2, "Null interface");
            ((HashSet) this.f11149d).add(p.a(cls2));
        }
    }

    public void a(h hVar) {
        if (!((HashSet) this.f11149d).contains(hVar.f11168a)) {
            ((HashSet) this.f11150e).add(hVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public b b() {
        boolean z10;
        if (((d) this.f11152g) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new b(this.f11146a, new HashSet((HashSet) this.f11149d), new HashSet((HashSet) this.f11150e), this.f11147b, this.f11148c, (d) this.f11152g, (HashSet) this.f11151f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i6) {
        boolean z10;
        if (this.f11147b == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f11147b = i6;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
