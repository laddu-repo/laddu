package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f1 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f1 f14321c = new z0(g1.f14326a);

    @Override // wf.a
    public final int h(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.k.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // wf.n, wf.a
    public final void j(vf.a aVar, int i6, Object obj) {
        e1 builder = (e1) obj;
        kotlin.jvm.internal.k.e(builder, "builder");
        short x10 = aVar.x(this.f14427b, i6);
        builder.b(builder.d() + 1);
        short[] sArr = builder.f14315a;
        int i10 = builder.f14316b;
        builder.f14316b = i10 + 1;
        sArr[i10] = x10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [wf.e1, java.lang.Object] */
    @Override // wf.a
    public final Object k(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.k.e(sArr, "<this>");
        ?? obj2 = new Object();
        obj2.f14315a = sArr;
        obj2.f14316b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // wf.z0
    public final Object n() {
        return new short[0];
    }

    @Override // wf.z0
    public final void o(yf.t encoder, Object obj, int i6) {
        short[] content = (short[]) obj;
        kotlin.jvm.internal.k.e(encoder, "encoder");
        kotlin.jvm.internal.k.e(content, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            short s = content[i10];
            y0 descriptor = this.f14427b;
            kotlin.jvm.internal.k.e(descriptor, "descriptor");
            encoder.g(descriptor, i10);
            encoder.r(s);
        }
    }
}
