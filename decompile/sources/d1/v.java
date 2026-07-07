package d1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v extends ud.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ e0 B;
    public int C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e0 f3946y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f3947z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(e0 e0Var, ud.c cVar) {
        super(cVar);
        this.B = e0Var;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.i(this);
    }
}
