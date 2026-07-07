package b1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends ne.j implements ve.l {

    /* renamed from: x, reason: collision with root package name */
    public int f1289x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f1290y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, le.c cVar) {
        super(1, cVar);
        this.f1290y = dVar;
    }

    @Override // ne.a
    public final le.c create(le.c cVar) {
        return new f(this.f1290y, cVar);
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        return ((f) create((le.c) obj)).invokeSuspend(he.y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.f1289x;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            this.f1289x = 1;
            Object cleanUp = this.f1290y.cleanUp(this);
            me.a aVar = me.a.f8833x;
            if (cleanUp == aVar) {
                return aVar;
            }
        }
        return he.y.f6101a;
    }
}
