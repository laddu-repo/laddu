package pe;

/* JADX INFO: loaded from: classes.dex */
public final class i extends ud.c {
    public final /* synthetic */ ob.d A;
    public ob.d B;
    public d C;
    public qe.f D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f10570y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10571z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ob.d dVar, ud.c cVar) {
        super(cVar);
        this.A = dVar;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.f10570y = obj;
        this.f10571z |= Integer.MIN_VALUE;
        return this.A.g(null, this);
    }
}
