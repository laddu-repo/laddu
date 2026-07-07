package l6;

import gf.c0;
import he.y;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends ne.j implements p {
    public final /* synthetic */ v6.k A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8234x;

    /* renamed from: y, reason: collision with root package name */
    public int f8235y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k f8236z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(k kVar, v6.k kVar2, le.c cVar, int i6) {
        super(2, cVar);
        this.f8234x = i6;
        this.f8236z = kVar;
        this.A = kVar2;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f8234x) {
            case 0:
                return new g(this.f8236z, this.A, cVar, 0);
            case 1:
                return new g(this.f8236z, this.A, cVar, 1);
            default:
                return new g(this.f8236z, this.A, cVar, 2);
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        le.c cVar = (le.c) obj2;
        switch (this.f8234x) {
            case 0:
                return ((g) create(c0Var, cVar)).invokeSuspend(y.f6101a);
            case 1:
                return ((g) create(c0Var, cVar)).invokeSuspend(y.f6101a);
            default:
                return ((g) create(c0Var, cVar)).invokeSuspend(y.f6101a);
        }
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8234x) {
            case 0:
                int i6 = this.f8235y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        he.a.f(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    he.a.f(obj);
                    this.f8235y = 1;
                    obj = k.a(this.f8236z, this.A, 0, this);
                    me.a aVar = me.a.f8833x;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            case 1:
                int i10 = this.f8235y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        he.a.f(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                he.a.f(obj);
                this.f8235y = 1;
                Object a10 = k.a(this.f8236z, this.A, 1, this);
                me.a aVar2 = me.a.f8833x;
                if (a10 == aVar2) {
                    return aVar2;
                }
                return a10;
            default:
                int i11 = this.f8235y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        he.a.f(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                he.a.f(obj);
                this.f8235y = 1;
                Object a11 = k.a(this.f8236z, this.A, 1, this);
                me.a aVar3 = me.a.f8833x;
                if (a11 == aVar3) {
                    return aVar3;
                }
                return a11;
        }
    }
}
