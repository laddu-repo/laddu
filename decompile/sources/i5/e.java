package i5;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: x, reason: collision with root package name */
    public final f f6612x;

    /* renamed from: y, reason: collision with root package name */
    public final Throwable f6613y;

    public e(f fVar, Throwable th) {
        super(th);
        this.f6612x = fVar;
        this.f6613y = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f6613y;
    }
}
