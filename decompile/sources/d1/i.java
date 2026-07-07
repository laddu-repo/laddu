package d1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ud.c {
    public final /* synthetic */ sb.p A;
    public int B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public sb.p f3889y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f3890z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(sb.p pVar, ud.c cVar) {
        super(cVar);
        this.A = pVar;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.f3890z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.h(this);
    }
}
