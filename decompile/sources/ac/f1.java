package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends ud.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ g1 B;
    public int C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f359y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d1 f360z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var, sd.c cVar) {
        super(cVar);
        this.B = g1Var;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return g1.a(this.B, null, null, this);
    }
}
