package d1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends ud.c {
    public final /* synthetic */ e0 A;
    public int B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public de.o f3855y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f3856z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, ud.c cVar) {
        super(cVar);
        this.A = e0Var;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.f3856z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.k(null, false, this);
    }
}
