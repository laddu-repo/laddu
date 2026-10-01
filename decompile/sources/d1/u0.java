package d1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends ud.c {
    public Object A;
    public /* synthetic */ Object B;
    public final /* synthetic */ w0 C;
    public int D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f3944y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f3945z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var, ud.c cVar) {
        super(cVar);
        this.C = w0Var;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, this);
    }
}
