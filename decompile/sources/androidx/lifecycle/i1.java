package androidx.lifecycle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i1 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final h0 f940x;

    /* renamed from: y, reason: collision with root package name */
    public final w f941y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f942z;

    public i1(h0 registry, w event) {
        kotlin.jvm.internal.k.e(registry, "registry");
        kotlin.jvm.internal.k.e(event, "event");
        this.f940x = registry;
        this.f941y = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f942z) {
            this.f940x.f(this.f941y);
            this.f942z = true;
        }
    }
}
