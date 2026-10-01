package w7;

import ne.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends c {
    public int A;

    /* renamed from: x, reason: collision with root package name */
    public String f14143x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f14144y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ b f14145z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f14145z = bVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f14144y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f14145z.a0(this);
    }
}
