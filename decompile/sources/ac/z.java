package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z extends ud.c {
    public final /* synthetic */ u A;
    public int B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f473y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f474z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(u uVar, ud.c cVar) {
        super(cVar);
        this.A = uVar;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.f474z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, this);
    }
}
