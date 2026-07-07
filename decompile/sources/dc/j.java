package dc;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ud.c {
    public int A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f4487y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k f4488z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ud.c cVar) {
        super(cVar);
        this.f4488z = kVar;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.f4487y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f4488z.b(this);
    }
}
