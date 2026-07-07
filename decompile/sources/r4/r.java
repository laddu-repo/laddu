package r4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r extends ud.c {
    public de.p A;
    public /* synthetic */ Object B;
    public final /* synthetic */ s C;
    public int D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f11214y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ce.a f11215z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, ud.c cVar) {
        super(cVar);
        this.C = sVar;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(0L, null, this);
    }
}
