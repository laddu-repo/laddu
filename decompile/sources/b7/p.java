package b7;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f1575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1576c;

    public /* synthetic */ p(y yVar, String str, int i6) {
        this.f1574a = i6;
        this.f1575b = yVar;
        this.f1576c = str;
    }

    @Override // b7.x
    public final void run() {
        switch (this.f1574a) {
            case 0:
                this.f1575b.r(this.f1576c);
                return;
            case 1:
                this.f1575b.q(this.f1576c);
                return;
            default:
                this.f1575b.t(this.f1576c);
                return;
        }
    }
}
