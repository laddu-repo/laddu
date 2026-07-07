package l2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.HashSet;
import k8.g2;
import w1.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements l {
    public int A = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final MediaCodec f8062v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g f8063w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m f8064x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final hd.a f8065y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8066z;

    public d(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, hd.a aVar) {
        this.f8062v = mediaCodec;
        this.f8063w = new g(handlerThread);
        this.f8064x = mVar;
        this.f8065y = aVar;
    }

    public static void c(d dVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        hd.a aVar;
        LoudnessCodecController loudnessCodecController;
        g gVar = dVar.f8063w;
        MediaCodec mediaCodec = dVar.f8062v;
        HandlerThread handlerThread = gVar.f8080b;
        w1.a.j(gVar.f8081c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(gVar, handler);
        gVar.f8081c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        dVar.f8064x.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (aVar = dVar.f8065y) != null && ((loudnessCodecController = (LoudnessCodecController) aVar.f6281y) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            w1.a.j(((HashSet) aVar.f6279w).add(mediaCodec));
        }
        dVar.A = 1;
    }

    public static String f(int i, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i == 1) {
            sb2.append("Audio");
        } else if (i == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // l2.l
    public final void a(int i, a2.d dVar, long j8, int i10) {
        this.f8064x.a(i, dVar, j8, i10);
    }

    @Override // l2.l
    public final void b(Bundle bundle) {
        this.f8064x.b(bundle);
    }

    @Override // l2.l
    public final void d(int i, int i10, long j8, int i11) {
        this.f8064x.d(i, i10, j8, i11);
    }

    @Override // l2.l
    public final int e(MediaCodec.BufferInfo bufferInfo) {
        this.f8064x.c();
        g gVar = this.f8063w;
        synchronized (gVar.f8079a) {
            try {
                IllegalStateException illegalStateException = gVar.f8090n;
                if (illegalStateException != null) {
                    gVar.f8090n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = gVar.f8086j;
                if (codecException != null) {
                    gVar.f8086j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = gVar.f8087k;
                if (cryptoException != null) {
                    gVar.f8087k = null;
                    throw cryptoException;
                }
                if (gVar.f8088l > 0 || gVar.f8089m) {
                    return -1;
                }
                o4.l lVar = gVar.f8083e;
                int i = lVar.f9809b;
                int i10 = lVar.f9810c;
                if (i == i10) {
                    return -1;
                }
                if (i == i10) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i11 = lVar.f9808a[i];
                lVar.f9809b = lVar.f9811d & (i + 1);
                if (i11 >= 0) {
                    w1.a.k(gVar.f8085h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) gVar.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i11 == -2) {
                    gVar.f8085h = (MediaFormat) gVar.f8084g.remove();
                }
                return i11;
            } finally {
            }
        }
    }

    @Override // l2.l
    public final void flush() {
        this.f8064x.flush();
        this.f8062v.flush();
        g gVar = this.f8063w;
        synchronized (gVar.f8079a) {
            gVar.f8088l++;
            Handler handler = gVar.f8081c;
            int i = b0.f13686a;
            handler.post(new jd.j(1, gVar));
        }
        this.f8062v.start();
    }

    @Override // l2.l
    public final void h(int i) {
        this.f8062v.releaseOutputBuffer(i, false);
    }

    @Override // l2.l
    public final void l(int i) {
        this.f8062v.setVideoScalingMode(i);
    }

    @Override // l2.l
    public final void m(u2.j jVar, Handler handler) {
        this.f8062v.setOnFrameRenderedListener(new b(this, jVar, 0), handler);
    }

    @Override // l2.l
    public final MediaFormat o() {
        MediaFormat mediaFormat;
        g gVar = this.f8063w;
        synchronized (gVar.f8079a) {
            try {
                mediaFormat = gVar.f8085h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // l2.l
    public final void r() {
        this.f8062v.detachOutputSurface();
    }

    @Override // l2.l
    public final void release() {
        hd.a aVar;
        hd.a aVar2;
        try {
            if (this.A == 1) {
                this.f8064x.shutdown();
                g gVar = this.f8063w;
                synchronized (gVar.f8079a) {
                    gVar.f8089m = true;
                    gVar.f8080b.quit();
                    gVar.a();
                }
            }
            this.A = 2;
            if (this.f8066z) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.f8062v.stop();
                }
                if (i >= 35 && (aVar2 = this.f8065y) != null) {
                    aVar2.L(this.f8062v);
                }
                this.f8062v.release();
                this.f8066z = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f8066z) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f8062v.stop();
                    }
                    if (i10 >= 35 && (aVar = this.f8065y) != null) {
                        aVar.L(this.f8062v);
                    }
                    this.f8062v.release();
                    this.f8066z = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // l2.l
    public final ByteBuffer s(int i) {
        return this.f8062v.getInputBuffer(i);
    }

    @Override // l2.l
    public final void t(Surface surface) {
        this.f8062v.setOutputSurface(surface);
    }

    @Override // l2.l
    public final ByteBuffer u(int i) {
        return this.f8062v.getOutputBuffer(i);
    }

    @Override // l2.l
    public final void w(int i, long j8) {
        this.f8062v.releaseOutputBuffer(i, j8);
    }

    @Override // l2.l
    public final boolean y(g2 g2Var) {
        g gVar = this.f8063w;
        synchronized (gVar.f8079a) {
            gVar.f8091o = g2Var;
        }
        return true;
    }

    @Override // l2.l
    public final int z() {
        this.f8064x.c();
        g gVar = this.f8063w;
        synchronized (gVar.f8079a) {
            try {
                IllegalStateException illegalStateException = gVar.f8090n;
                if (illegalStateException != null) {
                    gVar.f8090n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = gVar.f8086j;
                if (codecException != null) {
                    gVar.f8086j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = gVar.f8087k;
                if (cryptoException != null) {
                    gVar.f8087k = null;
                    throw cryptoException;
                }
                int i = -1;
                if (gVar.f8088l > 0 || gVar.f8089m) {
                    return -1;
                }
                o4.l lVar = gVar.f8082d;
                int i10 = lVar.f9809b;
                int i11 = lVar.f9810c;
                if (!(i10 == i11)) {
                    if (i10 == i11) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = lVar.f9808a[i10];
                    lVar.f9809b = (i10 + 1) & lVar.f9811d;
                }
                return i;
            } finally {
            }
        }
    }
}
