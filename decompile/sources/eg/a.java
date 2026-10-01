package eg;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends Throwable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4586x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, int i6) {
        super(str);
        this.f4586x = i6;
    }

    private final synchronized Throwable a() {
        return this;
    }

    private final synchronized Throwable b() {
        return this;
    }

    private final synchronized Throwable c() {
        return this;
    }

    private final synchronized Throwable d() {
        return this;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f4586x) {
            case 1:
                a();
                return this;
            case 2:
                b();
                return this;
            case 3:
                c();
                return this;
            case 4:
                d();
                return this;
            default:
                return super.fillInStackTrace();
        }
    }
}
