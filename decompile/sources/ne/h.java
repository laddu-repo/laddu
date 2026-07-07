package ne;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class h extends a {
    public h(le.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != le.i.f8353x) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // le.c
    public final le.h getContext() {
        return le.i.f8353x;
    }
}
