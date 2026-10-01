package d;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements e.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f3449b;

    public /* synthetic */ j(q qVar, int i6) {
        this.f3448a = i6;
        this.f3449b = qVar;
    }

    @Override // e.b
    public final void a(q qVar) {
        switch (this.f3448a) {
            case 0:
                q.v(this.f3449b, qVar);
                return;
            default:
                j1.a0 a0Var = (j1.a0) ((i.j) this.f3449b).f6217x.f8328x;
                a0Var.D.b(a0Var, a0Var, null);
                return;
        }
    }
}
