package ud;

import de.i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final sd.h f12977w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public transient sd.c f12978x;

    public c(sd.c cVar, sd.h hVar) {
        super(cVar);
        this.f12977w = hVar;
    }

    @Override // sd.c
    public sd.h f() {
        sd.h hVar = this.f12977w;
        i.b(hVar);
        return hVar;
    }

    @Override // ud.a
    public void p() {
        sd.c cVar = this.f12978x;
        if (cVar != null && cVar != this) {
            sd.f fVarA = f().A(sd.d.f11796v);
            i.b(fVarA);
            re.f fVar = (re.f) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = re.f.C;
            while (atomicReferenceFieldUpdater.get(fVar) == re.a.f11370c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            me.h hVar = obj instanceof me.h ? (me.h) obj : null;
            if (hVar != null) {
                hVar.r();
            }
        }
        this.f12978x = b.f12976v;
    }

    public c(sd.c cVar) {
        this(cVar, cVar != null ? cVar.f() : null);
    }
}
