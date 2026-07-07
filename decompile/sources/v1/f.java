package v1;

import r1.g0;
import r1.i0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f13195a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13196b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13197c;

    public f(long j, long j10, long j11) {
        this.f13195a = j;
        this.f13196b = j10;
        this.f13197c = j11;
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f13195a == fVar.f13195a && this.f13196b == fVar.f13196b && this.f13197c == fVar.f13197c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a8.g.k(this.f13197c) + ((a8.g.k(this.f13196b) + ((a8.g.k(this.f13195a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f13195a + ", modification time=" + this.f13196b + ", timescale=" + this.f13197c;
    }

    @Override // r1.i0
    public final /* synthetic */ void b(g0 g0Var) {
    }
}
