package androidx.lifecycle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class c1 implements n1 {

    /* renamed from: b, reason: collision with root package name */
    public static c1 f894b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f895a;

    @Override // androidx.lifecycle.n1
    public k1 a(Class cls) {
        switch (this.f895a) {
            case 0:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            case 1:
                return lg.c.g(cls);
            case 2:
                return new j1.r0(true);
            default:
                return new q1.a();
        }
    }

    @Override // androidx.lifecycle.n1
    public final k1 b(kotlin.jvm.internal.e eVar, o1.e eVar2) {
        switch (this.f895a) {
            case 0:
                return new f1();
            case 1:
                return c(cf.m.r(eVar), eVar2);
            case 2:
                return r4.a.a(this, eVar, eVar2);
            default:
                return r4.a.a(this, eVar, eVar2);
        }
    }

    @Override // androidx.lifecycle.n1
    public k1 c(Class cls, o1.e eVar) {
        switch (this.f895a) {
            case 0:
                a(cls);
                throw null;
            case 1:
                return a(cls);
            case 2:
                return a(cls);
            default:
                return a(cls);
        }
    }
}
