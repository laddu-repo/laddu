package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends ne.j implements ve.l {

    /* renamed from: x, reason: collision with root package name */
    public int f7980x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f7981y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f7982z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar, kotlin.jvm.internal.w wVar, le.c cVar) {
        super(1, cVar);
        this.f7981y = iVar;
        this.f7982z = wVar;
    }

    @Override // ne.a
    public final le.c create(le.c cVar) {
        return new m(this.f7981y, this.f7982z, cVar);
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        return ((m) create((le.c) obj)).invokeSuspend(he.y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.f7980x;
        kotlin.jvm.internal.w wVar = this.f7982z;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            h5.a aVar = lf.c.f8363b;
            Object obj2 = wVar.f8055x;
            if (obj2 == aVar) {
                obj2 = null;
            }
            this.f7980x = 1;
            Object emit = this.f7981y.emit(obj2, this);
            me.a aVar2 = me.a.f8833x;
            if (emit == aVar2) {
                return aVar2;
            }
        }
        wVar.f8055x = null;
        return he.y.f6101a;
    }
}
