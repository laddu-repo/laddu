package u2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements p {
    public static final ef.g A = new ef.g(0, -9223372036854775807L, false);
    public static final ef.g B = new ef.g(2, -9223372036854775807L, false);
    public static final ef.g C = new ef.g(3, -9223372036854775807L, false);

    /* renamed from: x, reason: collision with root package name */
    public final v2.a f12868x;

    /* renamed from: y, reason: collision with root package name */
    public k f12869y;

    /* renamed from: z, reason: collision with root package name */
    public IOException f12870z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "ExoPlayer:Loader:"
            java.lang.String r3 = r4.a.k(r0, r3)
            java.lang.String r0 = u1.a0.f12750a
            e1.a r0 = new e1.a
            r1 = 1
            r0.<init>(r3, r1)
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            u2.i r0 = new u2.i
            r1 = 0
            r0.<init>(r1)
            v2.a r1 = new v2.a
            r1.<init>(r3, r0)
            r2.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.o.<init>(java.lang.String):void");
    }

    public final void a() {
        k kVar = this.f12869y;
        u1.c.h(kVar);
        kVar.a(false);
    }

    @Override // u2.p
    public final void b() {
        IOException iOException = this.f12870z;
        if (iOException == null) {
            k kVar = this.f12869y;
            if (kVar != null) {
                int i6 = kVar.f12865x;
                IOException iOException2 = kVar.B;
                if (iOException2 != null && kVar.C > i6) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final boolean c() {
        if (this.f12870z != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f12869y != null) {
            return true;
        }
        return false;
    }

    public final void e(m mVar) {
        k kVar = this.f12869y;
        if (kVar != null) {
            kVar.a(true);
        }
        v2.a aVar = this.f12868x;
        if (mVar != null) {
            aVar.execute(new a1.e(mVar, 23));
        }
        aVar.f13256y.accept(aVar.f13255x);
    }

    public final void f(l lVar, j jVar, int i6) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        u1.c.h(myLooper);
        this.f12870z = null;
        k kVar = new k(this, myLooper, lVar, jVar, i6, SystemClock.elapsedRealtime());
        if (this.f12869y == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        this.f12869y = kVar;
        kVar.b();
    }

    public o(v2.a aVar) {
        this.f12868x = aVar;
    }
}
