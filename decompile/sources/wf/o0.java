package wf;

import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o0 implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public final sf.a f14367a;

    /* renamed from: b, reason: collision with root package name */
    public final sf.a f14368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14369c;

    /* renamed from: d, reason: collision with root package name */
    public final uf.h f14370d;

    public o0(sf.a aVar, sf.a aVar2, byte b10) {
        this.f14367a = aVar;
        this.f14368b = aVar2;
    }

    @Override // sf.a
    public final Object a(vf.b bVar) {
        Object n0Var;
        Object obj = u0.f14400c;
        uf.g d10 = d();
        vf.a h4 = bVar.h(d10);
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int b10 = h4.b(d());
            if (b10 != -1) {
                if (b10 != 0) {
                    if (b10 == 1) {
                        obj3 = h4.f(d(), 1, this.f14368b, null);
                    } else {
                        throw new IllegalArgumentException(h8.c.i(b10, "Invalid index: "));
                    }
                } else {
                    obj2 = h4.f(d(), 0, this.f14367a, null);
                }
            } else {
                if (obj2 != obj) {
                    if (obj3 != obj) {
                        switch (this.f14369c) {
                            case 0:
                                n0Var = new n0(obj2, obj3);
                                break;
                            default:
                                n0Var = new he.i(obj2, obj3);
                                break;
                        }
                        h4.j(d10);
                        return n0Var;
                    }
                    throw new IllegalArgumentException("Element 'value' is missing");
                }
                throw new IllegalArgumentException("Element 'key' is missing");
            }
        }
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        Object key;
        Object value;
        yf.t a10 = tVar.a(d());
        uf.g d10 = d();
        sf.a aVar = this.f14367a;
        switch (this.f14369c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.k.e(entry, "<this>");
                key = entry.getKey();
                break;
            default:
                he.i iVar = (he.i) obj;
                kotlin.jvm.internal.k.e(iVar, "<this>");
                key = iVar.f6076x;
                break;
        }
        a10.p(d10, 0, aVar, key);
        uf.g d11 = d();
        sf.a aVar2 = this.f14368b;
        switch (this.f14369c) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                kotlin.jvm.internal.k.e(entry2, "<this>");
                value = entry2.getValue();
                break;
            default:
                he.i iVar2 = (he.i) obj;
                kotlin.jvm.internal.k.e(iVar2, "<this>");
                value = iVar2.f6077y;
                break;
        }
        a10.p(d11, 1, aVar2, value);
        a10.u(d());
    }

    @Override // sf.a
    public final uf.g d() {
        switch (this.f14369c) {
            case 0:
                return this.f14370d;
            default:
                return this.f14370d;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(final sf.a aVar, final sf.a aVar2, int i6) {
        this(aVar, aVar2, (byte) 0);
        this.f14369c = i6;
        switch (i6) {
            case 1:
                this(aVar, aVar2, (byte) 0);
                final int i10 = 1;
                this.f14370d = a.a.d("kotlin.Pair", new uf.g[0], new ve.l() { // from class: wf.m0
                    @Override // ve.l
                    public final Object invoke(Object obj) {
                        uf.a buildSerialDescriptor = (uf.a) obj;
                        switch (i10) {
                            case 0:
                                kotlin.jvm.internal.k.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                                uf.a.a(buildSerialDescriptor, "key", aVar.d());
                                uf.a.a(buildSerialDescriptor, "value", aVar2.d());
                                break;
                            default:
                                kotlin.jvm.internal.k.e(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                                uf.a.a(buildSerialDescriptor, "first", aVar.d());
                                uf.a.a(buildSerialDescriptor, "second", aVar2.d());
                                break;
                        }
                        return he.y.f6101a;
                    }
                });
                return;
            default:
                final int i11 = 0;
                this.f14370d = a.a.e("kotlin.collections.Map.Entry", uf.j.f13138h, new uf.g[0], new ve.l() { // from class: wf.m0
                    @Override // ve.l
                    public final Object invoke(Object obj) {
                        uf.a buildSerialDescriptor = (uf.a) obj;
                        switch (i11) {
                            case 0:
                                kotlin.jvm.internal.k.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                                uf.a.a(buildSerialDescriptor, "key", aVar.d());
                                uf.a.a(buildSerialDescriptor, "value", aVar2.d());
                                break;
                            default:
                                kotlin.jvm.internal.k.e(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                                uf.a.a(buildSerialDescriptor, "first", aVar.d());
                                uf.a.a(buildSerialDescriptor, "second", aVar2.d());
                                break;
                        }
                        return he.y.f6101a;
                    }
                });
                return;
        }
    }
}
