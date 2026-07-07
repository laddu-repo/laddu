package p4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends ud.c {
    public String[] A;
    public int B;
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ l0 F;
    public int G;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m f10308y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f10309z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(l0 l0Var, ud.c cVar) {
        super(cVar);
        this.F = l0Var;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return l0.c(this.F, null, 0, this);
    }
}
