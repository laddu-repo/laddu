package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k1 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final k1 f14348c = new z0(l1.f14352a);

    @Override // wf.a
    public final int h(Object obj) {
        byte[] collectionSize = ((he.q) obj).f6093x;
        kotlin.jvm.internal.k.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // wf.n, wf.a
    public final void j(vf.a aVar, int i6, Object obj) {
        j1 builder = (j1) obj;
        kotlin.jvm.internal.k.e(builder, "builder");
        byte z10 = aVar.r(this.f14427b, i6).z();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f14343a;
        int i10 = builder.f14344b;
        builder.f14344b = i10 + 1;
        bArr[i10] = z10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wf.j1] */
    @Override // wf.a
    public final Object k(Object obj) {
        byte[] toBuilder = ((he.q) obj).f6093x;
        kotlin.jvm.internal.k.e(toBuilder, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.f14343a = toBuilder;
        obj2.f14344b = toBuilder.length;
        obj2.b(10);
        return obj2;
    }

    @Override // wf.z0
    public final Object n() {
        return new he.q(new byte[0]);
    }

    @Override // wf.z0
    public final void o(yf.t encoder, Object obj, int i6) {
        byte[] bArr = ((he.q) obj).f6093x;
        kotlin.jvm.internal.k.e(encoder, "encoder");
        for (int i10 = 0; i10 < i6; i10++) {
            encoder.j(this.f14427b, i10).d(bArr[i10]);
        }
    }
}
