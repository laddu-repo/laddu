package androidx.lifecycle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l1 implements he.f {
    public final ve.a A;
    public k1 B;

    /* renamed from: x, reason: collision with root package name */
    public final kotlin.jvm.internal.e f955x;

    /* renamed from: y, reason: collision with root package name */
    public final ve.a f956y;

    /* renamed from: z, reason: collision with root package name */
    public final ve.a f957z;

    public l1(kotlin.jvm.internal.e eVar, ve.a aVar, ve.a aVar2, ve.a aVar3) {
        this.f955x = eVar;
        this.f956y = aVar;
        this.f957z = aVar2;
        this.A = aVar3;
    }

    @Override // he.f
    public final Object getValue() {
        k1 k1Var = this.B;
        if (k1Var == null) {
            p1 store = (p1) this.f956y.invoke();
            n1 factory = (n1) this.f957z.invoke();
            o1.c extras = (o1.c) this.A.invoke();
            kotlin.jvm.internal.k.e(store, "store");
            kotlin.jvm.internal.k.e(factory, "factory");
            kotlin.jvm.internal.k.e(extras, "extras");
            ic.s sVar = new ic.s(store, factory, extras);
            kotlin.jvm.internal.e eVar = this.f955x;
            String b10 = eVar.b();
            if (b10 != null) {
                k1 p10 = sVar.p("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), eVar);
                this.B = p10;
                return p10;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return k1Var;
    }
}
