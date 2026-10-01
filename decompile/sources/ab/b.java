package ab;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f289c;

    public /* synthetic */ b(boolean z2, boolean z10, boolean z11) {
        this.f287a = z2;
        this.f288b = z10;
        this.f289c = z11;
    }

    public e2.f a() {
        if (this.f287a || !(this.f288b || this.f289c)) {
            return new e2.f(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public boolean b() {
        return (this.f289c || this.f288b) && this.f287a;
    }
}
