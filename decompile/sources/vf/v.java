package vf;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f13643d = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13646c;

    public v a() {
        this.f13644a = false;
        return this;
    }

    public v b() {
        this.f13646c = 0L;
        return this;
    }

    public long c() {
        if (this.f13644a) {
            return this.f13645b;
        }
        throw new IllegalStateException("No deadline");
    }

    public v d(long j8) {
        this.f13644a = true;
        this.f13645b = j8;
        return this;
    }

    public boolean e() {
        return this.f13644a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f13644a && this.f13645b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public v g(long j8) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        de.i.e(timeUnit, "unit");
        if (j8 >= 0) {
            this.f13646c = timeUnit.toNanos(j8);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j8).toString());
    }
}
