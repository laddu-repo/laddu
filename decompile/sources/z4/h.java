package z4;

import kf.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends ne.c {
    public final /* synthetic */ z A;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f15179x;

    /* renamed from: y, reason: collision with root package name */
    public int f15180y;

    /* renamed from: z, reason: collision with root package name */
    public kf.i f15181z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z zVar, le.c cVar) {
        super(cVar);
        this.A = zVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f15179x = obj;
        this.f15180y |= Integer.MIN_VALUE;
        return this.A.emit(null, this);
    }
}
