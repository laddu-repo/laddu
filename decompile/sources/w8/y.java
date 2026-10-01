package w8;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y extends Exception {

    /* renamed from: x, reason: collision with root package name */
    public final t8.b f14234x;

    public y(t8.b bVar) {
        boolean z10;
        if (bVar.f12629y != 0 && bVar.f12630z != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        x.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", z10);
        this.f14234x = bVar;
    }
}
