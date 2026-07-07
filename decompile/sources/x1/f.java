package x1;

import t1.b0;
import t1.d0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14098c;

    public f(long j8, long j9, long j10) {
        this.f14096a = j8;
        this.f14097b = j9;
        this.f14098c = j10;
    }

    @Override // t1.d0
    public final /* synthetic */ t1.o a() {
        return null;
    }

    @Override // t1.d0
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
        return this.f14096a == fVar.f14096a && this.f14097b == fVar.f14097b && this.f14098c == fVar.f14098c;
    }

    public final int hashCode() {
        return a.a.q(this.f14098c) + ((a.a.q(this.f14097b) + ((a.a.q(this.f14096a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f14096a + ", modification time=" + this.f14097b + ", timescale=" + this.f14098c;
    }

    @Override // t1.d0
    public final /* synthetic */ void b(b0 b0Var) {
    }
}
