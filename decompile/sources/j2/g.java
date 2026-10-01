package j2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements o {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f7063g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f7064h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f7065a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f7066b;

    /* renamed from: c, reason: collision with root package name */
    public f2.c f7067c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f7068d;

    /* renamed from: e, reason: collision with root package name */
    public final u1.f f7069e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7070f;

    public g(MediaCodec mediaCodec, HandlerThread handlerThread) {
        u1.f fVar = new u1.f();
        this.f7065a = mediaCodec;
        this.f7066b = handlerThread;
        this.f7069e = fVar;
        this.f7068d = new AtomicReference();
    }

    public static f e() {
        ArrayDeque arrayDeque = f7063g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new f();
                }
                return (f) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(f fVar) {
        ArrayDeque arrayDeque = f7063g;
        synchronized (arrayDeque) {
            arrayDeque.add(fVar);
        }
    }

    @Override // j2.o
    public final void a() {
        RuntimeException runtimeException = (RuntimeException) this.f7068d.getAndSet(null);
        if (runtimeException == null) {
        } else {
            throw runtimeException;
        }
    }

    @Override // j2.o
    public final void b(Bundle bundle) {
        a();
        f2.c cVar = this.f7067c;
        String str = u1.a0.f12750a;
        cVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // j2.o
    public final void c(int i6, y1.d dVar, long j, int i10) {
        a();
        f e10 = e();
        e10.f7058a = i6;
        e10.f7059b = 0;
        e10.f7061d = j;
        e10.f7062e = i10;
        MediaCodec.CryptoInfo cryptoInfo = e10.f7060c;
        cryptoInfo.numSubSamples = dVar.f14806f;
        int[] iArr = dVar.f14804d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = dVar.f14805e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = dVar.f14802b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 != null && bArr2.length >= bArr.length) {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = dVar.f14801a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 != null && bArr4.length >= bArr3.length) {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            } else {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = dVar.f14803c;
        if (Build.VERSION.SDK_INT >= 24) {
            e.r();
            cryptoInfo.setPattern(c2.w.g(dVar.f14807g, dVar.f14808h));
        }
        f2.c cVar = this.f7067c;
        String str = u1.a0.f12750a;
        cVar.obtainMessage(2, e10).sendToTarget();
    }

    @Override // j2.o
    public final void d(int i6, int i10, long j, int i11) {
        a();
        f e10 = e();
        e10.f7058a = i6;
        e10.f7059b = i10;
        e10.f7061d = j;
        e10.f7062e = i11;
        f2.c cVar = this.f7067c;
        String str = u1.a0.f12750a;
        cVar.obtainMessage(1, e10).sendToTarget();
    }

    @Override // j2.o
    public final void flush() {
        if (this.f7070f) {
            try {
                f2.c cVar = this.f7067c;
                cVar.getClass();
                cVar.removeCallbacksAndMessages(null);
                u1.f fVar = this.f7069e;
                synchronized (fVar) {
                    fVar.f12772b = false;
                }
                f2.c cVar2 = this.f7067c;
                cVar2.getClass();
                cVar2.obtainMessage(3).sendToTarget();
                fVar.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // j2.o
    public final void shutdown() {
        if (this.f7070f) {
            flush();
            this.f7066b.quit();
        }
        this.f7070f = false;
    }

    @Override // j2.o
    public final void start() {
        if (!this.f7070f) {
            HandlerThread handlerThread = this.f7066b;
            handlerThread.start();
            this.f7067c = new f2.c(this, handlerThread.getLooper(), 4);
            this.f7070f = true;
        }
    }
}
