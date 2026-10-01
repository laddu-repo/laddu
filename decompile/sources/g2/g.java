package g2;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends t2.c {

    /* renamed from: g, reason: collision with root package name */
    public int f5313g;

    @Override // t2.s
    public final void b(long j, long j10, long j11, List list, r2.m[] mVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!a(this.f5313g, elapsedRealtime)) {
            return;
        }
        for (int i6 = this.f12514b - 1; i6 >= 0; i6--) {
            if (!a(i6, elapsedRealtime)) {
                this.f5313g = i6;
                return;
            }
        }
        throw new IllegalStateException();
    }

    @Override // t2.s
    public final int d() {
        return this.f5313g;
    }

    @Override // t2.s
    public final int o() {
        return 0;
    }

    @Override // t2.s
    public final Object r() {
        return null;
    }
}
