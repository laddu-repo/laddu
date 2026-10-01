package u1;

import android.os.SystemClock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final v f12771a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12772b;

    public f() {
        this(v.f12817a);
    }

    public final synchronized void a() {
        while (!this.f12772b) {
            this.f12771a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f12772b) {
            try {
                this.f12771a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j) {
        if (j <= 0) {
            return this.f12772b;
        }
        this.f12771a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = j + elapsedRealtime;
        if (j10 < elapsedRealtime) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f12772b && elapsedRealtime < j10) {
                try {
                    this.f12771a.getClass();
                    wait(j10 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                this.f12771a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f12772b;
    }

    public final synchronized void d() {
        this.f12772b = false;
    }

    public final synchronized boolean e() {
        if (this.f12772b) {
            return false;
        }
        this.f12772b = true;
        notifyAll();
        return true;
    }

    public f(v vVar) {
        this.f12771a = vVar;
    }
}
