package d1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends ud.c {
    public Object A;
    public n0 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ l0 D;
    public int E;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public l0 f3906y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f3907z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, ud.c cVar) {
        super(cVar);
        this.D = l0Var;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.b(null, this);
    }
}
