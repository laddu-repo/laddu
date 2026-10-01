package qf;

import java.util.concurrent.atomic.AtomicReferenceArray;
import mf.u;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends u {
    public final /* synthetic */ AtomicReferenceArray B;

    public k(long j, k kVar, int i6) {
        super(j, kVar, i6);
        this.B = new AtomicReferenceArray(j.f11226f);
    }

    @Override // mf.u
    public final int g() {
        return j.f11226f;
    }

    @Override // mf.u
    public final void h(int i6, le.h hVar) {
        this.B.set(i6, j.f11225e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f8877z + ", hashCode=" + hashCode() + ']';
    }
}
