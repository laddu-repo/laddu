package r4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y extends ud.c {
    public h A;
    public /* synthetic */ Object B;
    public final /* synthetic */ z C;
    public int D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f11233y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ce.l f11234z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, ud.c cVar) {
        super(cVar);
        this.C = zVar;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.c(null, null, this);
    }
}
