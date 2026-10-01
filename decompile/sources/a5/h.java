package a5;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class h implements g5.c {

    /* renamed from: x, reason: collision with root package name */
    public final h5.b f576x;

    /* renamed from: y, reason: collision with root package name */
    public final String f577y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f578z;

    public h(h5.b bVar, String str) {
        this.f576x = bVar;
        this.f577y = str;
    }

    public final void d() {
        if (!this.f578z) {
            return;
        }
        a8.d.m(21, "statement is closed");
        throw null;
    }

    @Override // g5.c
    public final boolean z() {
        if (getLong(0) == 0) {
            return false;
        }
        return true;
    }
}
