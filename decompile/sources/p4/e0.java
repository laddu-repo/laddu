package p4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends ud.c {
    public final /* synthetic */ l0 A;
    public int B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f10294y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f10295z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(l0 l0Var, ud.c cVar) {
        super(cVar);
        this.A = l0Var;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.f10295z = obj;
        this.B |= Integer.MIN_VALUE;
        return l0.a(this.A, null, this);
    }
}
