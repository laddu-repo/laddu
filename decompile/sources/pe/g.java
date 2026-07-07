package pe;

/* JADX INFO: loaded from: classes.dex */
public final class g extends ud.c {
    public final /* synthetic */ h A;
    public Object B;
    public d C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f10566y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10567z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ud.c cVar) {
        super(cVar);
        this.A = hVar;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.f10566y = obj;
        this.f10567z |= Integer.MIN_VALUE;
        return this.A.g(null, this);
    }
}
