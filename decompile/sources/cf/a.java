package cf;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f2047a;

    public a(j jVar) {
        this.f2047a = new AtomicReference(jVar);
    }

    @Override // cf.j
    public final Iterator iterator() {
        j jVar = (j) this.f2047a.getAndSet(null);
        if (jVar != null) {
            return jVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
