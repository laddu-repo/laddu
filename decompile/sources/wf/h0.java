package wf;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final sf.a f14329a;

    /* renamed from: b, reason: collision with root package name */
    public final sf.a f14330b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f14331c;

    public h0(sf.a kSerializer, sf.a vSerializer) {
        kotlin.jvm.internal.k.e(kSerializer, "kSerializer");
        kotlin.jvm.internal.k.e(vSerializer, "vSerializer");
        this.f14329a = kSerializer;
        this.f14330b = vSerializer;
        this.f14331c = new g0(kSerializer.d(), vSerializer.d());
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        h(obj);
        g0 descriptor = this.f14331c;
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        yf.t a10 = tVar.a(descriptor);
        Iterator g10 = g(obj);
        int i6 = 0;
        while (g10.hasNext()) {
            Map.Entry entry = (Map.Entry) g10.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i6 + 1;
            a10.p(descriptor, i6, this.f14329a, key);
            i6 += 2;
            a10.p(descriptor, i10, this.f14330b, value);
        }
        a10.u(descriptor);
    }

    @Override // sf.a
    public final uf.g d() {
        return this.f14331c;
    }

    @Override // wf.a
    public final Object e() {
        return new LinkedHashMap();
    }

    @Override // wf.a
    public final int f(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.k.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // wf.a
    public final Iterator g(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.k.e(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // wf.a
    public final int h(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.k.e(map, "<this>");
        return map.size();
    }

    @Override // wf.a
    public final void j(vf.a aVar, int i6, Object obj) {
        Object f3;
        Map builder = (Map) obj;
        kotlin.jvm.internal.k.e(builder, "builder");
        sf.a aVar2 = this.f14329a;
        g0 g0Var = this.f14331c;
        Object f10 = aVar.f(g0Var, i6, aVar2, null);
        int b10 = aVar.b(g0Var);
        if (b10 == i6 + 1) {
            boolean containsKey = builder.containsKey(f10);
            sf.a aVar3 = this.f14330b;
            if (containsKey && !(aVar3.d().getKind() instanceof uf.f)) {
                f3 = aVar.f(g0Var, b10, aVar3, ie.w.u(f10, builder));
            } else {
                f3 = aVar.f(g0Var, b10, aVar3, null);
            }
            builder.put(f10, f3);
            return;
        }
        throw new IllegalArgumentException(h8.c.l("Value must follow key in a map, index for key: ", ", returned index for value: ", i6, b10).toString());
    }

    @Override // wf.a
    public final Object k(Object obj) {
        kotlin.jvm.internal.k.e(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // wf.a
    public final Object l(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        kotlin.jvm.internal.k.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
