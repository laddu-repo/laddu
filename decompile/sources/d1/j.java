package d1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ud.c {
    public Object A;
    public de.p B;
    public e0 C;
    public /* synthetic */ Object D;
    public final /* synthetic */ k E;
    public int F;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f3897y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f3898z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ud.c cVar) {
        super(cVar);
        this.E = kVar;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.a(null, this);
    }
}
