package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f14314c = new z0(f0.f14319a);

    @Override // wf.a
    public final int h(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.k.e(iArr, "<this>");
        return iArr.length;
    }

    @Override // wf.n, wf.a
    public final void j(vf.a aVar, int i6, Object obj) {
        d0 builder = (d0) obj;
        kotlin.jvm.internal.k.e(builder, "builder");
        int t10 = aVar.t(this.f14427b, i6);
        builder.b(builder.d() + 1);
        int[] iArr = builder.f14308a;
        int i10 = builder.f14309b;
        builder.f14309b = i10 + 1;
        iArr[i10] = t10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [wf.d0, java.lang.Object] */
    @Override // wf.a
    public final Object k(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.k.e(iArr, "<this>");
        ?? obj2 = new Object();
        obj2.f14308a = iArr;
        obj2.f14309b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // wf.z0
    public final Object n() {
        return new int[0];
    }

    @Override // wf.z0
    public final void o(yf.t encoder, Object obj, int i6) {
        int[] content = (int[]) obj;
        kotlin.jvm.internal.k.e(encoder, "encoder");
        kotlin.jvm.internal.k.e(content, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            encoder.l(i10, content[i10], this.f14427b);
        }
    }
}
