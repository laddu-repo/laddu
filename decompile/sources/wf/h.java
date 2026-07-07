package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final h f14328c = new z0(i.f14334a);

    @Override // wf.a
    public final int h(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.k.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // wf.n, wf.a
    public final void j(vf.a aVar, int i6, Object obj) {
        g builder = (g) obj;
        kotlin.jvm.internal.k.e(builder, "builder");
        byte m9 = aVar.m(this.f14427b, i6);
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f14322a;
        int i10 = builder.f14323b;
        builder.f14323b = i10 + 1;
        bArr[i10] = m9;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wf.g] */
    @Override // wf.a
    public final Object k(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.k.e(bArr, "<this>");
        ?? obj2 = new Object();
        obj2.f14322a = bArr;
        obj2.f14323b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // wf.z0
    public final Object n() {
        return new byte[0];
    }

    @Override // wf.z0
    public final void o(yf.t encoder, Object obj, int i6) {
        byte[] content = (byte[]) obj;
        kotlin.jvm.internal.k.e(encoder, "encoder");
        kotlin.jvm.internal.k.e(content, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            byte b10 = content[i10];
            y0 descriptor = this.f14427b;
            kotlin.jvm.internal.k.e(descriptor, "descriptor");
            encoder.g(descriptor, i10);
            encoder.d(b10);
        }
    }
}
