package androidx.lifecycle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends ne.j implements ve.p {
    public final /* synthetic */ kf.h A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f984x;

    /* renamed from: y, reason: collision with root package name */
    public int f985y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f986z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(kf.h hVar, le.c cVar, int i6) {
        super(2, cVar);
        this.f984x = i6;
        this.A = hVar;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f984x) {
            case 0:
                q qVar = new q(this.A, cVar, 0);
                qVar.f986z = obj;
                return qVar;
            default:
                q qVar2 = new q(this.A, cVar, 1);
                qVar2.f986z = obj;
                return qVar2;
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f984x) {
            case 0:
                return ((q) create((p0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            default:
                return ((q) create((jf.v) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
        }
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f984x) {
            case 0:
                int i6 = this.f985y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        he.a.f(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    he.a.f(obj);
                    p pVar = new p((p0) this.f986z);
                    this.f985y = 1;
                    Object collect = this.A.collect(pVar, this);
                    me.a aVar = me.a.f8833x;
                    if (collect == aVar) {
                        return aVar;
                    }
                }
                return he.y.f6101a;
            default:
                int i10 = this.f985y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        he.a.f(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    he.a.f(obj);
                    kf.h0 h0Var = new kf.h0((jf.v) this.f986z, 2);
                    this.f985y = 1;
                    Object collect2 = this.A.collect(h0Var, this);
                    me.a aVar2 = me.a.f8833x;
                    if (collect2 == aVar2) {
                        return aVar2;
                    }
                }
                return he.y.f6101a;
        }
    }
}
