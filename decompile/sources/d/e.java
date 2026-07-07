package d;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3426x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f3427y;

    public /* synthetic */ e(q qVar, int i6) {
        this.f3426x = i6;
        this.f3427y = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3426x) {
            case 0:
                this.f3427y.invalidateMenu();
                return;
            default:
                q.l(this.f3427y);
                return;
        }
    }
}
