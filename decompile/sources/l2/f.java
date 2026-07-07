package l2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import w1.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f implements m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f8072g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f8073h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f8074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f8075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h.c f8076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f8077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1.e f8078e;
    public boolean f;

    public f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        w1.e eVar = new w1.e();
        this.f8074a = mediaCodec;
        this.f8075b = handlerThread;
        this.f8078e = eVar;
        this.f8077d = new AtomicReference();
    }

    public static e e() {
        ArrayDeque arrayDeque = f8072g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new e();
                }
                return (e) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(e eVar) {
        ArrayDeque arrayDeque = f8072g;
        synchronized (arrayDeque) {
            arrayDeque.add(eVar);
        }
    }

    @Override // l2.m
    public final void a(int i, a2.d dVar, long j8, int i10) {
        c();
        e eVarE = e();
        eVarE.f8067a = i;
        eVarE.f8068b = 0;
        eVarE.f8070d = j8;
        eVarE.f8071e = i10;
        MediaCodec.CryptoInfo cryptoInfo = eVarE.f8069c;
        cryptoInfo.numSubSamples = dVar.f;
        int[] iArr = dVar.f118d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = dVar.f119e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = dVar.f116b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = dVar.f115a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = dVar.f117c;
        if (Build.VERSION.SDK_INT >= 24) {
            h.v.s();
            cryptoInfo.setPattern(h.v.d(dVar.f120g, dVar.f121h));
        }
        h.c cVar = this.f8076c;
        int i11 = b0.f13686a;
        cVar.obtainMessage(2, eVarE).sendToTarget();
    }

    @Override // l2.m
    public final void b(Bundle bundle) {
        c();
        h.c cVar = this.f8076c;
        int i = b0.f13686a;
        cVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // l2.m
    public final void c() {
        RuntimeException runtimeException = (RuntimeException) this.f8077d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // l2.m
    public final void d(int i, int i10, long j8, int i11) {
        c();
        e eVarE = e();
        eVarE.f8067a = i;
        eVarE.f8068b = i10;
        eVarE.f8070d = j8;
        eVarE.f8071e = i11;
        h.c cVar = this.f8076c;
        int i12 = b0.f13686a;
        cVar.obtainMessage(1, eVarE).sendToTarget();
    }

    @Override // l2.m
    public final void flush() {
        if (this.f) {
            try {
                h.c cVar = this.f8076c;
                cVar.getClass();
                cVar.removeCallbacksAndMessages(null);
                w1.e eVar = this.f8078e;
                synchronized (eVar) {
                    eVar.f13705b = false;
                }
                h.c cVar2 = this.f8076c;
                cVar2.getClass();
                cVar2.obtainMessage(3).sendToTarget();
                eVar.a();
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e7);
            }
        }
    }

    @Override // l2.m
    public final void shutdown() {
        if (this.f) {
            flush();
            this.f8075b.quit();
        }
        this.f = false;
    }

    @Override // l2.m
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.f8075b;
        handlerThread.start();
        this.f8076c = new h.c(this, handlerThread.getLooper(), 3);
        this.f = true;
    }
}
