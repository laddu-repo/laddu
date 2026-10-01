package d;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 extends kotlin.jvm.internal.j implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3461x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i6, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i6, obj, cls, str, str2, i10);
        this.f3461x = i11;
    }

    @Override // ve.a
    public final Object invoke() {
        switch (this.f3461x) {
            case 0:
                ((n0) this.receiver).f();
                return he.y.f6101a;
            case 1:
                ((n0) this.receiver).f();
                return he.y.f6101a;
            default:
                x4.w wVar = (x4.w) this.receiver;
                mf.e eVar = wVar.f14661a;
                if (eVar != null) {
                    gf.f0.i(eVar);
                    wVar.j();
                    x4.s sVar = wVar.f14665e;
                    if (sVar != null) {
                        sVar.f14639f.close();
                        return he.y.f6101a;
                    }
                    kotlin.jvm.internal.k.k("connectionManager");
                    throw null;
                }
                kotlin.jvm.internal.k.k("coroutineScope");
                throw null;
        }
    }
}
