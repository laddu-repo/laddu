package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k0 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f14347c = new z0(l0.f14350a);

    @Override // wf.a
    public final int h(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.k.e(jArr, "<this>");
        return jArr.length;
    }

    @Override // wf.n, wf.a
    public final void j(vf.a aVar, int i6, Object obj) {
        j0 builder = (j0) obj;
        kotlin.jvm.internal.k.e(builder, "builder");
        long y9 = aVar.y(this.f14427b, i6);
        builder.b(builder.d() + 1);
        long[] jArr = builder.f14341a;
        int i10 = builder.f14342b;
        builder.f14342b = i10 + 1;
        jArr[i10] = y9;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [wf.j0, java.lang.Object] */
    @Override // wf.a
    public final Object k(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.k.e(jArr, "<this>");
        ?? obj2 = new Object();
        obj2.f14341a = jArr;
        obj2.f14342b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // wf.z0
    public final Object n() {
        return new long[0];
    }

    @Override // wf.z0
    public final void o(yf.t encoder, Object obj, int i6) {
        long[] content = (long[]) obj;
        kotlin.jvm.internal.k.e(encoder, "encoder");
        kotlin.jvm.internal.k.e(content, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            long j = content[i10];
            y0 descriptor = this.f14427b;
            kotlin.jvm.internal.k.e(descriptor, "descriptor");
            encoder.g(descriptor, i10);
            encoder.m(j);
        }
    }
}
