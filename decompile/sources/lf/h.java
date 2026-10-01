package lf;

import gf.c0;
import kf.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends ne.j implements ve.p {
    public final /* synthetic */ k A;
    public final /* synthetic */ kf.i B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8369x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f8370y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f8371z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, kf.i iVar, Object obj, le.c cVar) {
        super(2, cVar);
        this.A = kVar;
        this.B = iVar;
        this.f8371z = obj;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f8369x) {
            case 0:
                return new h(this.A, this.B, this.f8371z, cVar);
            default:
                h hVar = new h(this.A, this.B, cVar);
                hVar.f8371z = obj;
                return hVar;
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        le.c cVar = (le.c) obj2;
        switch (this.f8369x) {
            case 0:
                return ((h) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
            default:
                return ((h) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.jvm.internal.w] */
    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8369x) {
            case 0:
                int i6 = this.f8370y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        he.a.f(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    he.a.f(obj);
                    f0 f0Var = this.A.B;
                    Object obj2 = this.f8371z;
                    this.f8370y = 1;
                    Object invoke = f0Var.invoke(this.B, obj2, this);
                    me.a aVar = me.a.f8833x;
                    if (invoke == aVar) {
                        return aVar;
                    }
                }
                return he.y.f6101a;
            default:
                int i10 = this.f8370y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        he.a.f(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    he.a.f(obj);
                    c0 c0Var = (c0) this.f8371z;
                    ?? obj3 = new Object();
                    k kVar = this.A;
                    kf.h hVar = kVar.A;
                    j jVar = new j((kotlin.jvm.internal.w) obj3, c0Var, kVar, this.B);
                    this.f8370y = 1;
                    Object collect = hVar.collect(jVar, this);
                    me.a aVar2 = me.a.f8833x;
                    if (collect == aVar2) {
                        return aVar2;
                    }
                }
                return he.y.f6101a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, kf.i iVar, le.c cVar) {
        super(2, cVar);
        this.A = kVar;
        this.B = iVar;
    }
}
