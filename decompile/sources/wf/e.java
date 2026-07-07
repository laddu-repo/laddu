package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f14313c = new z0(f.f14317a);

    @Override // wf.a
    public final int h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.k.e(zArr, "<this>");
        return zArr.length;
    }

    @Override // wf.n, wf.a
    public final void j(vf.a aVar, int i6, Object obj) {
        d builder = (d) obj;
        kotlin.jvm.internal.k.e(builder, "builder");
        boolean n10 = aVar.n(this.f14427b, i6);
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f14306a;
        int i10 = builder.f14307b;
        builder.f14307b = i10 + 1;
        zArr[i10] = n10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [wf.d, java.lang.Object] */
    @Override // wf.a
    public final Object k(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.k.e(zArr, "<this>");
        ?? obj2 = new Object();
        obj2.f14306a = zArr;
        obj2.f14307b = zArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // wf.z0
    public final Object n() {
        return new boolean[0];
    }

    @Override // wf.z0
    public final void o(yf.t encoder, Object obj, int i6) {
        boolean[] content = (boolean[]) obj;
        kotlin.jvm.internal.k.e(encoder, "encoder");
        kotlin.jvm.internal.k.e(content, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            encoder.c(this.f14427b, i10, content[i10]);
        }
    }
}
