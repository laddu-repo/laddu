package j2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.lifecycle.j1;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements n {
    public final j1 A;
    public boolean B;
    public int C = 0;

    /* renamed from: x, reason: collision with root package name */
    public final MediaCodec f7055x;

    /* renamed from: y, reason: collision with root package name */
    public final i f7056y;

    /* renamed from: z, reason: collision with root package name */
    public final o f7057z;

    public d(MediaCodec mediaCodec, HandlerThread handlerThread, o oVar, j1 j1Var) {
        this.f7055x = mediaCodec;
        this.f7056y = new i(handlerThread);
        this.f7057z = oVar;
        this.A = j1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if (r7 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(j2.d r5, android.media.MediaFormat r6, android.view.Surface r7, android.media.MediaCrypto r8, int r9) {
        /*
            j2.i r0 = r5.f7056y
            android.media.MediaCodec r1 = r5.f7055x
            android.os.HandlerThread r2 = r0.f7074b
            android.os.Handler r3 = r0.f7075c
            r4 = 1
            if (r3 != 0) goto Ld
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            u1.c.g(r3)
            r2.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r2 = r2.getLooper()
            r3.<init>(r2)
            com.google.android.gms.internal.measurement.d4.o(r1, r0, r3)
            r0.f7075c = r3
            java.lang.String r0 = "configureCodec"
            android.os.Trace.beginSection(r0)
            r1.configure(r6, r7, r8, r9)
            android.os.Trace.endSection()
            j2.o r6 = r5.f7057z
            r6.start()
            java.lang.String r6 = "startCodec"
            android.os.Trace.beginSection(r6)
            r1.start()
            android.os.Trace.endSection()
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 35
            if (r6 < r7) goto L5f
            androidx.lifecycle.j1 r6 = r5.A
            if (r6 == 0) goto L5f
            java.lang.Object r7 = r6.A
            android.media.LoudnessCodecController r7 = (android.media.LoudnessCodecController) r7
            if (r7 == 0) goto L54
            boolean r7 = j2.a.e(r7, r1)
            if (r7 != 0) goto L54
            goto L5f
        L54:
            java.lang.Object r6 = r6.f949y
            java.util.HashSet r6 = (java.util.HashSet) r6
            boolean r6 = r6.add(r1)
            u1.c.g(r6)
        L5f:
            r5.C = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.d.h(j2.d, android.media.MediaFormat, android.view.Surface, android.media.MediaCrypto, int):void");
    }

    public static String i(int i6, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i6 == 1) {
            sb2.append("Audio");
        } else if (i6 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i6);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // j2.n
    public final void a() {
        j1 j1Var;
        j1 j1Var2;
        try {
            if (this.C == 1) {
                this.f7057z.shutdown();
                i iVar = this.f7056y;
                synchronized (iVar.f7073a) {
                    iVar.f7084m = true;
                    iVar.f7074b.quit();
                    iVar.a();
                }
            }
            this.C = 2;
            if (!this.B) {
                try {
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 30 && i6 < 33) {
                        this.f7055x.stop();
                    }
                    if (i6 >= 35 && (j1Var2 = this.A) != null) {
                        j1Var2.z(this.f7055x);
                    }
                    this.f7055x.release();
                    this.B = true;
                } finally {
                }
            }
        } catch (Throwable th) {
            if (!this.B) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f7055x.stop();
                    }
                    if (i10 >= 35 && (j1Var = this.A) != null) {
                        j1Var.z(this.f7055x);
                    }
                    this.f7055x.release();
                    this.B = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // j2.n
    public final void b(Bundle bundle) {
        this.f7057z.b(bundle);
    }

    @Override // j2.n
    public final void c(int i6, y1.d dVar, long j, int i10) {
        this.f7057z.c(i6, dVar, j, i10);
    }

    @Override // j2.n
    public final void d(int i6, int i10, long j, int i11) {
        this.f7057z.d(i6, i10, j, i11);
    }

    @Override // j2.n
    public final boolean e(lc.c cVar) {
        i iVar = this.f7056y;
        synchronized (iVar.f7073a) {
            iVar.f7086o = cVar;
        }
        return true;
    }

    @Override // j2.n
    public final void f(int i6) {
        this.f7055x.releaseOutputBuffer(i6, false);
    }

    @Override // j2.n
    public final void flush() {
        this.f7057z.flush();
        this.f7055x.flush();
        i iVar = this.f7056y;
        synchronized (iVar.f7073a) {
            iVar.f7083l++;
            Handler handler = iVar.f7075c;
            String str = u1.a0.f12750a;
            handler.post(new h(iVar, 0));
        }
        this.f7055x.start();
    }

    @Override // j2.n
    public final MediaFormat g() {
        MediaFormat mediaFormat;
        i iVar = this.f7056y;
        synchronized (iVar.f7073a) {
            try {
                mediaFormat = iVar.f7080h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // j2.n
    public final void j() {
        this.f7055x.detachOutputSurface();
    }

    @Override // j2.n
    public final void k(int i6, long j) {
        this.f7055x.releaseOutputBuffer(i6, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[Catch: all -> 0x002e, DONT_GENERATE, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0021, B:18:0x002c, B:21:0x0030, B:26:0x0048, B:29:0x003e, B:30:0x004a, B:31:0x004f, B:33:0x0050, B:34:0x0052, B:35:0x0053, B:36:0x0055, B:37:0x0056, B:38:0x0058), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0021, B:18:0x002c, B:21:0x0030, B:26:0x0048, B:29:0x003e, B:30:0x004a, B:31:0x004f, B:33:0x0050, B:34:0x0052, B:35:0x0053, B:36:0x0055, B:37:0x0056, B:38:0x0058), top: B:3:0x000a }] */
    @Override // j2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o() {
        /*
            r9 = this;
            j2.o r0 = r9.f7057z
            r0.a()
            j2.i r0 = r9.f7056y
            java.lang.Object r1 = r0.f7073a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f7085n     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            if (r2 != 0) goto L56
            android.media.MediaCodec$CodecException r2 = r0.j     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L53
            android.media.MediaCodec$CryptoException r2 = r0.f7082k     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L50
            long r2 = r0.f7083l     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            r6 = 0
            r7 = 1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L28
            boolean r2 = r0.f7084m     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L26
            goto L28
        L26:
            r2 = 0
            goto L29
        L28:
            r2 = 1
        L29:
            r3 = -1
            if (r2 == 0) goto L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            return r3
        L2e:
            r0 = move-exception
            goto L59
        L30:
            v.h r0 = r0.f7076d     // Catch: java.lang.Throwable -> L2e
            int r2 = r0.f13156a     // Catch: java.lang.Throwable -> L2e
            int r4 = r0.f13157b     // Catch: java.lang.Throwable -> L2e
            if (r2 != r4) goto L39
            r6 = 1
        L39:
            if (r6 == 0) goto L3c
            goto L48
        L3c:
            if (r2 == r4) goto L4a
            int[] r3 = r0.f13158c     // Catch: java.lang.Throwable -> L2e
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L2e
            int r2 = r2 + r7
            int r4 = r0.f13159d     // Catch: java.lang.Throwable -> L2e
            r2 = r2 & r4
            r0.f13156a = r2     // Catch: java.lang.Throwable -> L2e
        L48:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            return r3
        L4a:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            throw r0     // Catch: java.lang.Throwable -> L2e
        L50:
            r0.f7082k = r3     // Catch: java.lang.Throwable -> L2e
            throw r2     // Catch: java.lang.Throwable -> L2e
        L53:
            r0.j = r3     // Catch: java.lang.Throwable -> L2e
            throw r2     // Catch: java.lang.Throwable -> L2e
        L56:
            r0.f7085n = r3     // Catch: java.lang.Throwable -> L2e
            throw r2     // Catch: java.lang.Throwable -> L2e
        L59:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.d.o():int");
    }

    @Override // j2.n
    public final void p(w2.j jVar, Handler handler) {
        this.f7055x.setOnFrameRenderedListener(new b(this, jVar, 0), handler);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[Catch: all -> 0x002e, DONT_GENERATE, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0021, B:18:0x002c, B:21:0x0031, B:25:0x003c, B:28:0x0040, B:30:0x004c, B:31:0x0073, B:35:0x0069, B:36:0x0075, B:37:0x007a, B:39:0x007b, B:40:0x007d, B:41:0x007e, B:42:0x0080, B:43:0x0081, B:44:0x0083), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0021, B:18:0x002c, B:21:0x0031, B:25:0x003c, B:28:0x0040, B:30:0x004c, B:31:0x0073, B:35:0x0069, B:36:0x0075, B:37:0x007a, B:39:0x007b, B:40:0x007d, B:41:0x007e, B:42:0x0080, B:43:0x0081, B:44:0x0083), top: B:3:0x000a }] */
    @Override // j2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int s(android.media.MediaCodec.BufferInfo r11) {
        /*
            r10 = this;
            j2.o r0 = r10.f7057z
            r0.a()
            j2.i r0 = r10.f7056y
            java.lang.Object r1 = r0.f7073a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f7085n     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            if (r2 != 0) goto L81
            android.media.MediaCodec$CodecException r2 = r0.j     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L7e
            android.media.MediaCodec$CryptoException r2 = r0.f7082k     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L7b
            long r2 = r0.f7083l     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            r6 = 0
            r7 = 1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L28
            boolean r2 = r0.f7084m     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L26
            goto L28
        L26:
            r2 = 0
            goto L29
        L28:
            r2 = 1
        L29:
            r3 = -1
            if (r2 == 0) goto L31
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            return r3
        L2e:
            r0 = move-exception
            r11 = r0
            goto L84
        L31:
            v.h r2 = r0.f7077e     // Catch: java.lang.Throwable -> L2e
            int r4 = r2.f13156a     // Catch: java.lang.Throwable -> L2e
            int r5 = r2.f13157b     // Catch: java.lang.Throwable -> L2e
            if (r4 != r5) goto L3a
            r6 = 1
        L3a:
            if (r6 == 0) goto L3e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            return r3
        L3e:
            if (r4 == r5) goto L75
            int[] r3 = r2.f13158c     // Catch: java.lang.Throwable -> L2e
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L2e
            int r4 = r4 + r7
            int r5 = r2.f13159d     // Catch: java.lang.Throwable -> L2e
            r4 = r4 & r5
            r2.f13156a = r4     // Catch: java.lang.Throwable -> L2e
            if (r3 < 0) goto L66
            android.media.MediaFormat r2 = r0.f7080h     // Catch: java.lang.Throwable -> L2e
            u1.c.h(r2)     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayDeque r0 = r0.f7078f     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L2e
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L2e
            int r5 = r0.offset     // Catch: java.lang.Throwable -> L2e
            int r6 = r0.size     // Catch: java.lang.Throwable -> L2e
            long r7 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L2e
            int r9 = r0.flags     // Catch: java.lang.Throwable -> L2e
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L2e
            goto L73
        L66:
            r11 = -2
            if (r3 != r11) goto L73
            java.util.ArrayDeque r11 = r0.f7079g     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r11 = r11.remove()     // Catch: java.lang.Throwable -> L2e
            android.media.MediaFormat r11 = (android.media.MediaFormat) r11     // Catch: java.lang.Throwable -> L2e
            r0.f7080h = r11     // Catch: java.lang.Throwable -> L2e
        L73:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            return r3
        L75:
            java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L2e
            r11.<init>()     // Catch: java.lang.Throwable -> L2e
            throw r11     // Catch: java.lang.Throwable -> L2e
        L7b:
            r0.f7082k = r3     // Catch: java.lang.Throwable -> L2e
            throw r2     // Catch: java.lang.Throwable -> L2e
        L7e:
            r0.j = r3     // Catch: java.lang.Throwable -> L2e
            throw r2     // Catch: java.lang.Throwable -> L2e
        L81:
            r0.f7085n = r3     // Catch: java.lang.Throwable -> L2e
            throw r2     // Catch: java.lang.Throwable -> L2e
        L84:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.d.s(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // j2.n
    public final void u(int i6) {
        this.f7055x.setVideoScalingMode(i6);
    }

    @Override // j2.n
    public final ByteBuffer x(int i6) {
        return this.f7055x.getInputBuffer(i6);
    }

    @Override // j2.n
    public final void y(Surface surface) {
        this.f7055x.setOutputSurface(surface);
    }

    @Override // j2.n
    public final ByteBuffer z(int i6) {
        return this.f7055x.getOutputBuffer(i6);
    }
}
