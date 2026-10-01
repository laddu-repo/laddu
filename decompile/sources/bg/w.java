package bg;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w implements Closeable {
    public final RandomAccessFile A;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1749x;

    /* renamed from: y, reason: collision with root package name */
    public int f1750y;

    /* renamed from: z, reason: collision with root package name */
    public final ReentrantLock f1751z = new ReentrantLock();

    public w(RandomAccessFile randomAccessFile) {
        this.A = randomAccessFile;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f1751z;
        reentrantLock.lock();
        try {
            if (this.f1749x) {
                return;
            }
            this.f1749x = true;
            if (this.f1750y != 0) {
                return;
            }
            synchronized (this) {
                this.A.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final p d(long j) {
        ReentrantLock reentrantLock = this.f1751z;
        reentrantLock.lock();
        try {
            if (!this.f1749x) {
                this.f1750y++;
                reentrantLock.unlock();
                return new p(this, j);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f1751z;
        reentrantLock.lock();
        try {
            if (!this.f1749x) {
                synchronized (this) {
                    length = this.A.length();
                }
                return length;
            }
            throw new IllegalStateException("closed");
        } finally {
            reentrantLock.unlock();
        }
    }
}
