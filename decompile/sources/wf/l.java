package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final l f14349c = new z0(m.f14354a);

    @Override // wf.a
    public final int h(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.k.e(cArr, "<this>");
        return cArr.length;
    }

    @Override // wf.n, wf.a
    public final void j(vf.a aVar, int i6, Object obj) {
        k builder = (k) obj;
        kotlin.jvm.internal.k.e(builder, "builder");
        char w10 = aVar.w(this.f14427b, i6);
        builder.b(builder.d() + 1);
        char[] cArr = builder.f14345a;
        int i10 = builder.f14346b;
        builder.f14346b = i10 + 1;
        cArr[i10] = w10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wf.k] */
    @Override // wf.a
    public final Object k(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.k.e(cArr, "<this>");
        ?? obj2 = new Object();
        obj2.f14345a = cArr;
        obj2.f14346b = cArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // wf.z0
    public final Object n() {
        return new char[0];
    }

    @Override // wf.z0
    public final void o(yf.t encoder, Object obj, int i6) {
        char[] content = (char[]) obj;
        kotlin.jvm.internal.k.e(encoder, "encoder");
        kotlin.jvm.internal.k.e(content, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            char c10 = content[i10];
            y0 descriptor = this.f14427b;
            kotlin.jvm.internal.k.e(descriptor, "descriptor");
            encoder.g(descriptor, i10);
            encoder.e(c10);
        }
    }
}
