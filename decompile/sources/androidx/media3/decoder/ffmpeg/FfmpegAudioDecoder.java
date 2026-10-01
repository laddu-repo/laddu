package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import okhttp3.internal.http2.Settings;
import r1.q;
import u1.a0;
import u1.t;
import y1.f;
import y1.h;
import y1.j;
import y1.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FfmpegAudioDecoder extends k {

    /* renamed from: o, reason: collision with root package name */
    public final String f1012o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f1013p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1014q;

    /* renamed from: r, reason: collision with root package name */
    public int f1015r;
    public long s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1016t;

    /* renamed from: u, reason: collision with root package name */
    public volatile int f1017u;

    /* renamed from: v, reason: collision with root package name */
    public volatile int f1018v;

    public FfmpegAudioDecoder(int i6, q qVar, boolean z10) {
        super(new h[16], new SimpleDecoderOutputBuffer[16]);
        byte[] bArr;
        byte[] bArr2;
        int i10;
        if (FfmpegLibrary.f1019a.a()) {
            String str = qVar.f11670n;
            str.getClass();
            String a10 = FfmpegLibrary.a(str);
            a10.getClass();
            this.f1012o = a10;
            List list = qVar.f11673q;
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1003765268:
                    if (str.equals("audio/vorbis")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -53558318:
                    if (str.equals("audio/mp4a-latm")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1504470054:
                    if (str.equals("audio/alac")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1504891608:
                    if (str.equals("audio/opus")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    byte[] bArr3 = (byte[]) list.get(0);
                    byte[] bArr4 = (byte[]) list.get(1);
                    byte[] bArr5 = new byte[bArr3.length + bArr4.length + 6];
                    bArr5[0] = (byte) (bArr3.length >> 8);
                    bArr5[1] = (byte) (bArr3.length & 255);
                    System.arraycopy(bArr3, 0, bArr5, 2, bArr3.length);
                    bArr5[bArr3.length + 2] = 0;
                    bArr5[bArr3.length + 3] = 0;
                    bArr5[bArr3.length + 4] = (byte) (bArr4.length >> 8);
                    bArr5[bArr3.length + 5] = (byte) (bArr4.length & 255);
                    System.arraycopy(bArr4, 0, bArr5, bArr3.length + 6, bArr4.length);
                    bArr = bArr5;
                    break;
                case 1:
                case 3:
                    bArr2 = (byte[]) list.get(0);
                    bArr = bArr2;
                    break;
                case 2:
                    byte[] bArr6 = (byte[]) list.get(0);
                    int length = bArr6.length + 12;
                    ByteBuffer allocate = ByteBuffer.allocate(length);
                    allocate.putInt(length);
                    allocate.putInt(1634492771);
                    allocate.putInt(0);
                    allocate.put(bArr6, 0, bArr6.length);
                    bArr2 = allocate.array();
                    bArr = bArr2;
                    break;
                default:
                    bArr2 = null;
                    bArr = bArr2;
                    break;
            }
            this.f1013p = bArr;
            this.f1014q = z10 ? 4 : 2;
            if (z10) {
                i10 = 131070;
            } else {
                i10 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            }
            this.f1015r = i10;
            long ffmpegInitialize = ffmpegInitialize(a10, bArr, z10, qVar.G, qVar.F);
            this.s = ffmpegInitialize;
            if (ffmpegInitialize != 0) {
                p(i6);
                return;
            }
            throw new Exception("Initialization failed.");
        }
        throw new Exception("Failed to load decoder native libraries.");
    }

    private native int ffmpegDecode(long j, ByteBuffer byteBuffer, int i6, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, ByteBuffer byteBuffer2, int i10);

    private native int ffmpegGetChannelCount(long j);

    private native int ffmpegGetSampleRate(long j);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z10, int i6, int i10);

    private native void ffmpegRelease(long j);

    private native long ffmpegReset(long j, byte[] bArr);

    private ByteBuffer growOutputBuffer(SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i6) {
        boolean z10;
        this.f1015r = i6;
        ByteBuffer byteBuffer = simpleDecoderOutputBuffer.f1009y;
        byteBuffer.getClass();
        if (i6 >= byteBuffer.limit()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        ByteBuffer order = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder());
        int position = byteBuffer.position();
        byteBuffer.position(0);
        order.put(byteBuffer);
        order.position(position);
        order.limit(i6);
        simpleDecoderOutputBuffer.f1009y = order;
        return order;
    }

    @Override // y1.k, y1.e
    public final void a() {
        super.a();
        ffmpegRelease(this.s);
        this.s = 0L;
    }

    @Override // y1.k
    public final h g() {
        return new h(2, FfmpegLibrary.b());
    }

    @Override // y1.e
    public final String getName() {
        return "ffmpeg" + FfmpegLibrary.c() + "-" + this.f1012o;
    }

    @Override // y1.k
    public final j h() {
        return new SimpleDecoderOutputBuffer(new b(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y1.f, java.lang.Exception] */
    @Override // y1.k
    public final f i(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [y1.f, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r9v8, types: [y1.f, java.lang.Exception] */
    @Override // y1.k
    public final f j(h hVar, j jVar, boolean z10) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) jVar;
        if (z10) {
            long ffmpegReset = ffmpegReset(this.s, this.f1013p);
            this.s = ffmpegReset;
            if (ffmpegReset == 0) {
                return new Exception("Error resetting (see logcat).");
            }
        }
        ByteBuffer byteBuffer = hVar.f14812z;
        String str = a0.f12750a;
        int limit = byteBuffer.limit();
        long j = hVar.B;
        int i6 = this.f1015r;
        simpleDecoderOutputBuffer.timeUs = j;
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.f1009y;
        if (byteBuffer2 == null || byteBuffer2.capacity() < i6) {
            simpleDecoderOutputBuffer.f1009y = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder());
        }
        simpleDecoderOutputBuffer.f1009y.position(0);
        simpleDecoderOutputBuffer.f1009y.limit(i6);
        int ffmpegDecode = ffmpegDecode(this.s, byteBuffer, limit, simpleDecoderOutputBuffer, simpleDecoderOutputBuffer.f1009y, this.f1015r);
        if (ffmpegDecode == -2) {
            return new Exception("Error decoding (see logcat).");
        }
        if (ffmpegDecode == -1) {
            simpleDecoderOutputBuffer.shouldBeSkipped = true;
            return null;
        }
        if (ffmpegDecode == 0) {
            simpleDecoderOutputBuffer.shouldBeSkipped = true;
            return null;
        }
        if (!this.f1016t) {
            this.f1017u = ffmpegGetChannelCount(this.s);
            this.f1018v = ffmpegGetSampleRate(this.s);
            if (this.f1018v == 0 && "alac".equals(this.f1012o)) {
                this.f1013p.getClass();
                t tVar = new t(this.f1013p);
                tVar.K(this.f1013p.length - 4);
                this.f1018v = tVar.C();
            }
            this.f1016t = true;
        }
        ByteBuffer byteBuffer3 = simpleDecoderOutputBuffer.f1009y;
        byteBuffer3.getClass();
        byteBuffer3.position(0);
        byteBuffer3.limit(ffmpegDecode);
        return null;
    }
}
