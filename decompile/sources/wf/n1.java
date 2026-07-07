package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n1 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final n1 f14364c = new z0(o1.f14371a);

    @Override // wf.a
    public final int h(Object obj) {
        int[] collectionSize = ((he.s) obj).f6095x;
        kotlin.jvm.internal.k.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // wf.n, wf.a
    public final void j(vf.a aVar, int i6, Object obj) {
        m1 builder = (m1) obj;
        kotlin.jvm.internal.k.e(builder, "builder");
        int l10 = aVar.r(this.f14427b, i6).l();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f14359a;
        int i10 = builder.f14360b;
        builder.f14360b = i10 + 1;
        iArr[i10] = l10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wf.m1] */
    @Override // wf.a
    public final Object k(Object obj) {
        int[] toBuilder = ((he.s) obj).f6095x;
        kotlin.jvm.internal.k.e(toBuilder, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.f14359a = toBuilder;
        obj2.f14360b = toBuilder.length;
        obj2.b(10);
        return obj2;
    }

    @Override // wf.z0
    public final Object n() {
        return new he.s(new int[0]);
    }

    @Override // wf.z0
    public final void o(yf.t encoder, Object obj, int i6) {
        int[] iArr = ((he.s) obj).f6095x;
        kotlin.jvm.internal.k.e(encoder, "encoder");
        for (int i10 = 0; i10 < i6; i10++) {
            encoder.j(this.f14427b, i10).k(iArr[i10]);
        }
    }
}
