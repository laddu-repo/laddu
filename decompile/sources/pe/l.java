package pe;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends ud.c {
    public final /* synthetic */ m A;
    public int B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m f10576y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f10577z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, sd.c cVar) {
        super(cVar);
        this.A = mVar;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.f10577z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.j(null, this);
    }
}
