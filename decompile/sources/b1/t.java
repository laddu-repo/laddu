package b1;

/* loaded from: classes.dex */
public final class t extends ne.c {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f1324x;

    /* renamed from: y, reason: collision with root package name */
    public int f1325y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ u f1326z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, le.c cVar) {
        super(cVar);
        this.f1326z = uVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f1324x = obj;
        this.f1325y |= Integer.MIN_VALUE;
        return this.f1326z.emit(null, this);
    }
}
