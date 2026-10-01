package lf;

import gf.c0;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o extends ne.j implements ve.p {
    public final /* synthetic */ AtomicInteger A;
    public final /* synthetic */ jf.h B;

    /* renamed from: x, reason: collision with root package name */
    public int f8383x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ kf.h[] f8384y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f8385z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kf.h[] hVarArr, int i6, AtomicInteger atomicInteger, jf.h hVar, le.c cVar) {
        super(2, cVar);
        this.f8384y = hVarArr;
        this.f8385z = i6;
        this.A = atomicInteger;
        this.B = hVar;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        return new o(this.f8384y, this.f8385z, this.A, this.B, cVar);
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.f8383x;
        AtomicInteger atomicInteger = this.A;
        jf.h hVar = this.B;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    he.a.f(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                he.a.f(obj);
                kf.h[] hVarArr = this.f8384y;
                int i10 = this.f8385z;
                kf.h hVar2 = hVarArr[i10];
                n nVar = new n(hVar, i10);
                this.f8383x = 1;
                Object collect = hVar2.collect(nVar, this);
                me.a aVar = me.a.f8833x;
                if (collect == aVar) {
                    return aVar;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                hVar.k(null);
            }
            return he.y.f6101a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                hVar.k(null);
            }
        }
    }
}
