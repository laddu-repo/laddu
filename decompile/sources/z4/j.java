package z4;

import kotlin.jvm.internal.w;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends ne.c {
    public long A;
    public /* synthetic */ Object B;
    public final /* synthetic */ k C;
    public int D;

    /* renamed from: x, reason: collision with root package name */
    public k f15185x;

    /* renamed from: y, reason: collision with root package name */
    public ve.a f15186y;

    /* renamed from: z, reason: collision with root package name */
    public w f15187z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ne.c cVar) {
        super(cVar);
        this.C = kVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(0L, null, this);
    }
}
