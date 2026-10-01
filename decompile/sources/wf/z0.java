package wf;

import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class z0 extends n {

    /* renamed from: b, reason: collision with root package name */
    public final y0 f14427b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(sf.a primitiveSerializer) {
        super(primitiveSerializer);
        kotlin.jvm.internal.k.e(primitiveSerializer, "primitiveSerializer");
        this.f14427b = new y0(primitiveSerializer.d());
    }

    @Override // wf.a, sf.a
    public final Object a(vf.b bVar) {
        return i(bVar);
    }

    @Override // wf.n, sf.a
    public final void c(yf.t tVar, Object obj) {
        int h4 = h(obj);
        y0 descriptor = this.f14427b;
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        yf.t a10 = tVar.a(descriptor);
        o(a10, obj, h4);
        a10.u(descriptor);
    }

    @Override // sf.a
    public final uf.g d() {
        return this.f14427b;
    }

    @Override // wf.a
    public final Object e() {
        return (x0) k(n());
    }

    @Override // wf.a
    public final int f(Object obj) {
        x0 x0Var = (x0) obj;
        kotlin.jvm.internal.k.e(x0Var, "<this>");
        return x0Var.d();
    }

    @Override // wf.a
    public final Iterator g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // wf.a
    public final Object l(Object obj) {
        x0 x0Var = (x0) obj;
        kotlin.jvm.internal.k.e(x0Var, "<this>");
        return x0Var.a();
    }

    @Override // wf.n
    public final void m(int i6, Object obj, Object obj2) {
        kotlin.jvm.internal.k.e((x0) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object n();

    public abstract void o(yf.t tVar, Object obj, int i6);
}
