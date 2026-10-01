package d5;

import gf.c0;
import he.y;
import ne.j;
import ve.l;
import ve.p;
import x4.w;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends j implements p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ l B;

    /* renamed from: x, reason: collision with root package name */
    public int f3789x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w f3790y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f3791z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(le.c cVar, l lVar, w wVar, boolean z10, boolean z11) {
        super(2, cVar);
        this.f3790y = wVar;
        this.f3791z = z10;
        this.A = z11;
        this.B = lVar;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        return new a(cVar, this.B, this.f3790y, this.f3791z, this.A);
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((c0) obj, (le.c) obj2)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.f3789x;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        he.a.f(obj);
        l lVar = this.B;
        w wVar = this.f3790y;
        boolean z10 = this.A;
        boolean z11 = this.f3791z;
        c cVar = new c(null, lVar, wVar, z10, z11);
        this.f3789x = 1;
        Object s = wVar.s(z11, cVar, this);
        me.a aVar = me.a.f8833x;
        if (s == aVar) {
            return aVar;
        }
        return s;
    }
}
