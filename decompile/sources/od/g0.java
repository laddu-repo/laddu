package od;

import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g0 extends ne.c {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ i0 D;
    public int E;

    /* renamed from: x, reason: collision with root package name */
    public Map f10083x;

    /* renamed from: y, reason: collision with root package name */
    public kotlin.jvm.internal.w f10084y;

    /* renamed from: z, reason: collision with root package name */
    public int f10085z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, ne.c cVar) {
        super(cVar);
        this.D = i0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.i(null, this);
    }
}
