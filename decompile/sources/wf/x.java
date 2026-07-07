package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final x f14423c = new z0(y.f14424a);

    @Override // wf.a
    public final int h(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.k.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // wf.n, wf.a
    public final void j(vf.a aVar, int i6, Object obj) {
        w builder = (w) obj;
        kotlin.jvm.internal.k.e(builder, "builder");
        float s = aVar.s(this.f14427b, i6);
        builder.b(builder.d() + 1);
        float[] fArr = builder.f14409a;
        int i10 = builder.f14410b;
        builder.f14410b = i10 + 1;
        fArr[i10] = s;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wf.w] */
    @Override // wf.a
    public final Object k(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.k.e(fArr, "<this>");
        ?? obj2 = new Object();
        obj2.f14409a = fArr;
        obj2.f14410b = fArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // wf.z0
    public final Object n() {
        return new float[0];
    }

    @Override // wf.z0
    public final void o(yf.t encoder, Object obj, int i6) {
        float[] content = (float[]) obj;
        kotlin.jvm.internal.k.e(encoder, "encoder");
        kotlin.jvm.internal.k.e(content, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            float f3 = content[i10];
            y0 descriptor = this.f14427b;
            kotlin.jvm.internal.k.e(descriptor, "descriptor");
            encoder.g(descriptor, i10);
            encoder.h(f3);
        }
    }
}
