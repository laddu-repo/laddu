package f2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4670x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f4671y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f4672z;

    public /* synthetic */ j(l lVar, m mVar, int i6) {
        this.f4670x = i6;
        this.f4671y = lVar;
        this.f4672z = mVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f2.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [f2.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [f2.m, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4670x) {
            case 0:
                l lVar = this.f4671y;
                this.f4672z.l(lVar.f4675a, lVar.f4676b);
                return;
            case 1:
                l lVar2 = this.f4671y;
                this.f4672z.n(lVar2.f4675a, lVar2.f4676b);
                return;
            default:
                l lVar3 = this.f4671y;
                this.f4672z.z(lVar3.f4675a, lVar3.f4676b);
                return;
        }
    }
}
