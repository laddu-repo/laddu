package androidx.lifecycle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends ne.c {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f943x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f944y;

    /* renamed from: z, reason: collision with root package name */
    public int f945z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ne.c cVar) {
        super(cVar);
        this.f944y = kVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f943x = obj;
        this.f945z |= Integer.MIN_VALUE;
        this.f944y.i(this);
        return he.y.f6101a;
    }
}
