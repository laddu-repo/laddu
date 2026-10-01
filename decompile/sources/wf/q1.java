package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q1 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final q1 f14379c = new z0(r1.f14384a);

    @Override // wf.a
    public final int h(Object obj) {
        long[] collectionSize = ((he.u) obj).f6097x;
        kotlin.jvm.internal.k.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // wf.n, wf.a
    public final void j(vf.a aVar, int i6, Object obj) {
        p1 builder = (p1) obj;
        kotlin.jvm.internal.k.e(builder, "builder");
        long u3 = aVar.r(this.f14427b, i6).u();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f14374a;
        int i10 = builder.f14375b;
        builder.f14375b = i10 + 1;
        jArr[i10] = u3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wf.p1] */
    @Override // wf.a
    public final Object k(Object obj) {
        long[] toBuilder = ((he.u) obj).f6097x;
        kotlin.jvm.internal.k.e(toBuilder, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.f14374a = toBuilder;
        obj2.f14375b = toBuilder.length;
        obj2.b(10);
        return obj2;
    }

    @Override // wf.z0
    public final Object n() {
        return new he.u(new long[0]);
    }

    @Override // wf.z0
    public final void o(yf.t encoder, Object obj, int i6) {
        long[] jArr = ((he.u) obj).f6097x;
        kotlin.jvm.internal.k.e(encoder, "encoder");
        for (int i10 = 0; i10 < i6; i10++) {
            encoder.j(this.f14427b, i10).m(jArr[i10]);
        }
    }
}
