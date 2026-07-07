package v1;

import r1.g0;
import r1.i0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13188a;

    public b(int i6) {
        this.f13188a = i6;
    }

    @Override // r1.i0
    public final /* synthetic */ r1.q a() {
        return null;
    }

    @Override // r1.i0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.f13188a == ((b) obj).f13188a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13188a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f13188a;
    }

    @Override // r1.i0
    public final /* synthetic */ void b(g0 g0Var) {
    }
}
