package p4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends ud.c {
    public String[] A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ l0 E;
    public int F;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m f10311y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f10312z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, ud.c cVar) {
        super(cVar);
        this.E = l0Var;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return l0.d(this.E, null, 0, this);
    }
}
