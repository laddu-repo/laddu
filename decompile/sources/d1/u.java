package d1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u extends ud.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ e0 B;
    public int C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e0 f3942y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ue.c f3943z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(e0 e0Var, ud.c cVar) {
        super(cVar);
        this.B = e0Var;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return e0.e(this.B, this);
    }
}
