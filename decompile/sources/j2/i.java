package j2;

import a2.q0;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f7074b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f7075c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f7080h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f7081i;
    public MediaCodec.CodecException j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f7082k;

    /* renamed from: l, reason: collision with root package name */
    public long f7083l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7084m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f7085n;

    /* renamed from: o, reason: collision with root package name */
    public lc.c f7086o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f7073a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final v.h f7076d = new v.h();

    /* renamed from: e, reason: collision with root package name */
    public final v.h f7077e = new v.h();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f7078f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f7079g = new ArrayDeque();

    public i(HandlerThread handlerThread) {
        this.f7074b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f7079g;
        if (!arrayDeque.isEmpty()) {
            this.f7081i = (MediaFormat) arrayDeque.getLast();
        }
        v.h hVar = this.f7076d;
        hVar.f13157b = hVar.f13156a;
        v.h hVar2 = this.f7077e;
        hVar2.f13157b = hVar2.f13156a;
        this.f7078f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f7073a) {
            this.f7085n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f7073a) {
            this.f7082k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f7073a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i6) {
        q0 q0Var;
        synchronized (this.f7073a) {
            this.f7076d.a(i6);
            lc.c cVar = this.f7086o;
            if (cVar != null && (q0Var = ((t) cVar.f8328x).f7116d0) != null) {
                q0Var.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i6, MediaCodec.BufferInfo bufferInfo) {
        q0 q0Var;
        synchronized (this.f7073a) {
            try {
                MediaFormat mediaFormat = this.f7081i;
                if (mediaFormat != null) {
                    this.f7077e.a(-2);
                    this.f7079g.add(mediaFormat);
                    this.f7081i = null;
                }
                this.f7077e.a(i6);
                this.f7078f.add(bufferInfo);
                lc.c cVar = this.f7086o;
                if (cVar != null && (q0Var = ((t) cVar.f8328x).f7116d0) != null) {
                    q0Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f7073a) {
            this.f7077e.a(-2);
            this.f7079g.add(mediaFormat);
            this.f7081i = null;
        }
    }
}
