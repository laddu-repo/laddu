package pe;

/* JADX INFO: loaded from: classes.dex */
public final class j extends ud.c {
    public final /* synthetic */ p2.c A;
    public p2.c B;
    public d C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f10572y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10573z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p2.c cVar, ud.c cVar2) {
        super(cVar2);
        this.A = cVar;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.f10572y = obj;
        this.f10573z |= Integer.MIN_VALUE;
        return this.A.g(null, this);
    }
}
