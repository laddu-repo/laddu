package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final p f14373c = new z0(q.f14376a);

    @Override // wf.a
    public final int h(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.k.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // wf.n, wf.a
    public final void j(vf.a aVar, int i6, Object obj) {
        o builder = (o) obj;
        kotlin.jvm.internal.k.e(builder, "builder");
        double i10 = aVar.i(this.f14427b, i6);
        builder.b(builder.d() + 1);
        double[] dArr = builder.f14365a;
        int i11 = builder.f14366b;
        builder.f14366b = i11 + 1;
        dArr[i11] = i10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [wf.o, java.lang.Object] */
    @Override // wf.a
    public final Object k(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.k.e(dArr, "<this>");
        ?? obj2 = new Object();
        obj2.f14365a = dArr;
        obj2.f14366b = dArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // wf.z0
    public final Object n() {
        return new double[0];
    }

    @Override // wf.z0
    public final void o(yf.t encoder, Object obj, int i6) {
        double[] content = (double[]) obj;
        kotlin.jvm.internal.k.e(encoder, "encoder");
        kotlin.jvm.internal.k.e(content, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            double d10 = content[i10];
            y0 descriptor = this.f14427b;
            kotlin.jvm.internal.k.e(descriptor, "descriptor");
            encoder.g(descriptor, i10);
            encoder.f(d10);
        }
    }
}
