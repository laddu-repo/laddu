package u1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f12761x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o4.j f12762y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f12763z;

    public /* synthetic */ b(o4.j jVar, Object obj, int i6) {
        this.f12761x = i6;
        this.f12762y = jVar;
        this.f12763z = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12761x) {
            case 0:
                o4.j jVar = this.f12762y;
                if (jVar.f9924a == 0) {
                    jVar.z(this.f12763z);
                    return;
                }
                return;
            default:
                o4.j jVar2 = this.f12762y;
                int i6 = jVar2.f9924a - 1;
                jVar2.f9924a = i6;
                if (i6 == 0) {
                    jVar2.z(this.f12763z);
                    return;
                }
                return;
        }
    }
}
