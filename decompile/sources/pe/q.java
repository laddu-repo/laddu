package pe;

/* JADX INFO: loaded from: classes.dex */
public final class q extends ud.c {
    public int A;
    public final /* synthetic */ m B;
    public Object C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m f10589y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f10590z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar, sd.c cVar) {
        super(cVar);
        this.B = mVar;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.f10590z = obj;
        this.A |= Integer.MIN_VALUE;
        return this.B.j(null, this);
    }
}
