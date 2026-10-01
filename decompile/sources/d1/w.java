package d1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w extends ud.c {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ e0 C;
    public int D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e0 f3950y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i1 f3951z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e0 e0Var, sd.c cVar) {
        super(cVar);
        this.C = e0Var;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return e0.f(this.C, false, this);
    }
}
