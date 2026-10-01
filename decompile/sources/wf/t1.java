package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t1 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t1 f14395c = new z0(u1.f14401a);

    @Override // wf.a
    public final int h(Object obj) {
        short[] collectionSize = ((he.x) obj).f6100x;
        kotlin.jvm.internal.k.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // wf.n, wf.a
    public final void j(vf.a aVar, int i6, Object obj) {
        s1 builder = (s1) obj;
        kotlin.jvm.internal.k.e(builder, "builder");
        short A = aVar.r(this.f14427b, i6).A();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f14389a;
        int i10 = builder.f14390b;
        builder.f14390b = i10 + 1;
        sArr[i10] = A;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [wf.s1, java.lang.Object] */
    @Override // wf.a
    public final Object k(Object obj) {
        short[] toBuilder = ((he.x) obj).f6100x;
        kotlin.jvm.internal.k.e(toBuilder, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.f14389a = toBuilder;
        obj2.f14390b = toBuilder.length;
        obj2.b(10);
        return obj2;
    }

    @Override // wf.z0
    public final Object n() {
        return new he.x(new short[0]);
    }

    @Override // wf.z0
    public final void o(yf.t encoder, Object obj, int i6) {
        short[] sArr = ((he.x) obj).f6100x;
        kotlin.jvm.internal.k.e(encoder, "encoder");
        for (int i10 = 0; i10 < i6; i10++) {
            encoder.j(this.f14427b, i10).r(sArr[i10]);
        }
    }
}
