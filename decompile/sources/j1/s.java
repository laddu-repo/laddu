package j1;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s extends f.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f6978a;

    public s(AtomicReference atomicReference) {
        this.f6978a = atomicReference;
    }

    @Override // f.c
    public final void a(Object obj) {
        f.c cVar = (f.c) this.f6978a.get();
        if (cVar != null) {
            cVar.a(obj);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
}
