package i2;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends r2.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6364g;

    @Override // r2.s
    public final int l() {
        return 0;
    }

    @Override // r2.s
    public final int m() {
        return this.f6364g;
    }

    @Override // r2.s
    public final Object q() {
        return null;
    }

    @Override // r2.s
    public final void s(long j8, long j9, long j10, List list, p2.m[] mVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (b(this.f6364g, jElapsedRealtime)) {
            for (int i = this.f11081b - 1; i >= 0; i--) {
                if (!b(i, jElapsedRealtime)) {
                    this.f6364g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
