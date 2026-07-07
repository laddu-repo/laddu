package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends ud.c {
    public int A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f452y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ w0 f453z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, ud.c cVar) {
        super(cVar);
        this.f453z = w0Var;
    }

    @Override // ud.a
    public final Object o(Object obj) {
        this.f452y = obj;
        this.A |= Integer.MIN_VALUE;
        return w0.a(this.f453z, this);
    }
}
