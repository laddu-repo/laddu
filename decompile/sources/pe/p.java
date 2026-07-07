package pe;

/* JADX INFO: loaded from: classes.dex */
public final class p extends ud.c {
    public final /* synthetic */ p2.c A;
    public m B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f10587y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10588z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p2.c cVar, ud.c cVar2) {
        super(cVar2);
        this.A = cVar;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.f10587y = obj;
        this.f10588z |= Integer.MIN_VALUE;
        return this.A.g(null, this);
    }
}
