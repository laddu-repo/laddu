package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14297b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(uf.g gVar, int i6) {
        super(gVar);
        this.f14297b = i6;
    }

    @Override // uf.g
    public final String a() {
        switch (this.f14297b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
