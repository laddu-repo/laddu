package me;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z0 {
    public final Object A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f8700z;

    public /* synthetic */ j(int i, Object obj) {
        this.f8700z = i;
        this.A = obj;
    }

    @Override // me.z0
    public final boolean k() {
        switch (this.f8700z) {
        }
        return false;
    }

    @Override // me.z0
    public final void l(Throwable th) {
        switch (this.f8700z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                h hVar = (h) this.A;
                Throwable thT = hVar.t(j());
                if (hVar.y()) {
                    re.f fVar = (re.f) hVar.f8696y;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = re.f.C;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        re.t tVar = re.a.f11370c;
                        if (de.i.a(obj, tVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, tVar, thT)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != tVar) {
                                }
                                break;
                            }
                        } else if (!(obj instanceof Throwable)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                }
                            }
                        }
                    }
                }
                hVar.q(thT);
                if (!hVar.y()) {
                    hVar.r();
                }
                break;
            case 1:
                ((h0) this.A).b();
                break;
            case 2:
                ((ce.l) this.A).a(th);
                break;
            default:
                a1 a1Var = (a1) this.A;
                Object obj2 = d1.f8687v.get(j());
                if (!(obj2 instanceof p)) {
                    a1Var.g(x.q(obj2));
                } else {
                    a1Var.g(fa.b.i(((p) obj2).f8723a));
                }
                break;
        }
    }
}
