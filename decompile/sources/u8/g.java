package u8;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends UnsupportedOperationException {

    /* renamed from: x, reason: collision with root package name */
    public final t8.d f12952x;

    public g(t8.d dVar) {
        this.f12952x = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f12952x));
    }
}
