package l2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import c2.m0;
import java.util.ArrayDeque;
import k8.g2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f8080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f8081c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f8085h;
    public MediaFormat i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f8086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f8087k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f8088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IllegalStateException f8090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g2 f8091o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8079a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o4.l f8082d = new o4.l();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o4.l f8083e = new o4.l();
    public final ArrayDeque f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f8084g = new ArrayDeque();

    public g(HandlerThread handlerThread) {
        this.f8080b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f8084g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        o4.l lVar = this.f8082d;
        lVar.f9810c = lVar.f9809b;
        o4.l lVar2 = this.f8083e;
        lVar2.f9810c = lVar2.f9809b;
        this.f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f8079a) {
            this.f8090n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f8079a) {
            this.f8087k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f8079a) {
            this.f8086j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        m0 m0Var;
        synchronized (this.f8079a) {
            this.f8082d.a(i);
            g2 g2Var = this.f8091o;
            if (g2Var != null && (m0Var = ((s) g2Var.f7546w).f8122c0) != null) {
                m0Var.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        m0 m0Var;
        synchronized (this.f8079a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.f8083e.a(-2);
                    this.f8084g.add(mediaFormat);
                    this.i = null;
                }
                this.f8083e.a(i);
                this.f.add(bufferInfo);
                g2 g2Var = this.f8091o;
                if (g2Var != null && (m0Var = ((s) g2Var.f7546w).f8122c0) != null) {
                    m0Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f8079a) {
            this.f8083e.a(-2);
            this.f8084g.add(mediaFormat);
            this.i = null;
        }
    }
}
