package kf;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f0 extends ne.j implements ve.q {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7947x;

    /* renamed from: y, reason: collision with root package name */
    public int f7948y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f7949z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, le.c cVar, int i6) {
        super(3, cVar);
        this.f7947x = i6;
        this.B = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ne.j, ve.q] */
    @Override // ve.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f7947x) {
            case 0:
                f0 f0Var = new f0((n) this.B, (le.c) obj3, 0);
                f0Var.f7949z = (i) obj;
                f0Var.A = obj2;
                return f0Var.invokeSuspend(he.y.f6101a);
            case 1:
                f0 f0Var2 = new f0((ne.j) this.B, (le.c) obj3);
                f0Var2.f7949z = (i) obj;
                f0Var2.A = (Object[]) obj2;
                return f0Var2.invokeSuspend(he.y.f6101a);
            default:
                f0 f0Var3 = new f0((od.j) this.B, (le.c) obj3, 2);
                f0Var3.f7949z = (jd.y) obj;
                f0Var3.A = (String) obj2;
                return f0Var3.invokeSuspend(he.y.f6101a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [ne.j, ve.q] */
    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        i iVar2;
        switch (this.f7947x) {
            case 0:
                int i6 = this.f7948y;
                me.a aVar = me.a.f8833x;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            he.a.f(obj);
                            return he.y.f6101a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = (i) this.f7949z;
                    he.a.f(obj);
                } else {
                    he.a.f(obj);
                    iVar = (i) this.f7949z;
                    Object obj2 = this.A;
                    n nVar = (n) this.B;
                    this.f7949z = iVar;
                    this.f7948y = 1;
                    obj = nVar.invoke(obj2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                this.f7949z = null;
                this.f7948y = 2;
                if (iVar.emit(obj, this) == aVar) {
                    return aVar;
                }
                return he.y.f6101a;
            case 1:
                int i10 = this.f7948y;
                me.a aVar2 = me.a.f8833x;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            he.a.f(obj);
                            return he.y.f6101a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar2 = (i) this.f7949z;
                    he.a.f(obj);
                } else {
                    he.a.f(obj);
                    iVar2 = (i) this.f7949z;
                    Object[] objArr = (Object[]) this.A;
                    ?? r42 = (ne.j) this.B;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    this.f7949z = iVar2;
                    this.f7948y = 1;
                    obj = r42.invoke(obj3, obj4, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                this.f7949z = null;
                this.f7948y = 2;
                if (iVar2.emit(obj, this) == aVar2) {
                    return aVar2;
                }
                return he.y.f6101a;
            default:
                jd.y yVar = (jd.y) this.f7949z;
                String str = (String) this.A;
                int i11 = this.f7948y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        he.a.f(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    he.a.f(obj);
                    od.j jVar = (od.j) this.B;
                    if (yVar instanceof jd.x) {
                        List list = (List) ((jd.x) yVar).f7412a;
                        of.d dVar = gf.o0.f5694b;
                        n nVar2 = new n(str, list, jVar, (le.c) null, 3);
                        this.f7949z = null;
                        this.A = null;
                        this.f7948y = 1;
                        obj = gf.f0.J(dVar, nVar2, this);
                        me.a aVar3 = me.a.f8833x;
                        if (obj == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if ((yVar instanceof jd.v) || (yVar instanceof jd.w)) {
                            return yVar;
                        }
                        throw new RuntimeException();
                    }
                }
                return new jd.x((List) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(ve.q qVar, le.c cVar) {
        super(3, cVar);
        this.f7947x = 1;
        this.B = (ne.j) qVar;
    }
}
