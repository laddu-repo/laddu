package j2;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.google.protobuf.CodedOutputStream;
import java.util.HashMap;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import r1.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f7091a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7092b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7093c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f7094d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7095e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7096f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7097g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7098h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7099i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f7100k;

    /* renamed from: l, reason: collision with root package name */
    public float f7101l;

    public q(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.f7091a = str;
        this.f7092b = str2;
        this.f7093c = str3;
        this.f7094d = codecCapabilities;
        this.f7097g = z10;
        this.f7095e = z13;
        this.f7096f = z14;
        this.f7098h = z15;
        this.f7099i = k0.o(str2);
        this.f7101l = -3.4028235E38f;
        this.j = -1;
        this.f7100k = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        r3 = r3.getAchievableFrameRatesFor(r4, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.media.MediaCodecInfo.VideoCapabilities r3, int r4, int r5, double r6) {
        /*
            int r0 = r3.getWidthAlignment()
            int r1 = r3.getHeightAlignment()
            android.graphics.Point r2 = new android.graphics.Point
            int r4 = u1.a0.f(r4, r0)
            int r4 = r4 * r0
            int r5 = u1.a0.f(r5, r1)
            int r5 = r5 * r1
            r2.<init>(r4, r5)
            int r4 = r2.x
            int r5 = r2.y
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L55
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L2a
            goto L55
        L2a:
            double r6 = java.lang.Math.floor(r6)
            boolean r0 = r3.areSizeAndRateSupported(r4, r5, r6)
            if (r0 != 0) goto L35
            goto L53
        L35:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto L3c
            goto L51
        L3c:
            android.util.Range r3 = com.google.android.gms.internal.measurement.d4.g(r3, r4, r5)
            if (r3 != 0) goto L43
            goto L51
        L43:
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 > 0) goto L53
        L51:
            r3 = 1
            return r3
        L53:
            r3 = 0
            return r3
        L55:
            boolean r3 = r3.isSizeSupported(r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.q.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r11) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j2.q i(java.lang.String r11, java.lang.String r12, java.lang.String r13, android.media.MediaCodecInfo.CodecCapabilities r14, boolean r15, boolean r16, boolean r17, boolean r18) {
        /*
            j2.q r0 = new j2.q
            r1 = 0
            r2 = 1
            if (r14 == 0) goto L39
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L39
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 22
            if (r3 > r4) goto L37
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L26
            java.lang.String r4 = "Nexus 10"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L37
        L26:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L39
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L37
            goto L39
        L37:
            r8 = 1
            goto L3a
        L39:
            r8 = 0
        L3a:
            if (r14 == 0) goto L42
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r14.isFeatureSupported(r3)
        L42:
            if (r18 != 0) goto L51
            if (r14 == 0) goto L4f
            java.lang.String r3 = "secure-playback"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L4f
            goto L51
        L4f:
            r9 = 0
            goto L52
        L51:
            r9 = 1
        L52:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 35
            if (r3 < r4) goto L98
            if (r14 == 0) goto L98
            java.lang.String r3 = "detached-surface"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L98
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Xiaomi"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L98
            java.lang.String r4 = "OPPO"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L98
            java.lang.String r4 = "realme"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L98
            java.lang.String r4 = "motorola"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L98
            java.lang.String r4 = "LENOVO"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L8d
            goto L98
        L8d:
            r10 = 1
        L8e:
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            goto L9a
        L98:
            r10 = 0
            goto L8e
        L9a:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.q.i(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):j2.q");
    }

    public final a2.i b(r1.q qVar, r1.q qVar2) {
        int i6;
        r1.q qVar3;
        r1.q qVar4;
        int i10;
        int i11;
        String str = qVar.f11670n;
        r1.h hVar = qVar.D;
        String str2 = qVar2.f11670n;
        r1.h hVar2 = qVar2.D;
        boolean equals = Objects.equals(str, str2);
        boolean z10 = false;
        if (!equals) {
            i6 = 8;
        } else {
            i6 = 0;
        }
        if (this.f7099i) {
            if (qVar.f11681z != qVar2.f11681z) {
                i6 |= 1024;
            }
            if (qVar.f11676u != qVar2.f11676u || qVar.f11677v != qVar2.f11677v) {
                z10 = true;
            }
            if (!this.f7095e && z10) {
                i6 |= 512;
            }
            if ((!r1.h.e(hVar) || !r1.h.e(hVar2)) && !Objects.equals(hVar, hVar2)) {
                i6 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f7091a) && !qVar.b(qVar2)) {
                i6 |= 2;
            }
            int i12 = qVar.f11678w;
            if (i12 != -1 && (i11 = qVar.f11679x) != -1 && i12 == qVar2.f11678w && i11 == qVar2.f11679x && z10) {
                i6 |= 2;
            }
            if (i6 == 0) {
                if (qVar.b(qVar2)) {
                    i10 = 3;
                } else {
                    i10 = 2;
                }
                return new a2.i(this.f7091a, qVar, qVar2, i10, 0);
            }
            qVar3 = qVar;
            qVar4 = qVar2;
        } else {
            qVar3 = qVar;
            qVar4 = qVar2;
            if (qVar3.F != qVar4.F) {
                i6 |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
            }
            if (qVar3.G != qVar4.G) {
                i6 |= 8192;
            }
            if (qVar3.H != qVar4.H) {
                i6 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            String str3 = this.f7092b;
            if (i6 == 0 && "audio/mp4a-latm".equals(str3)) {
                HashMap hashMap = a0.f7050a;
                Pair c10 = u1.d.c(qVar3);
                Pair c11 = u1.d.c(qVar4);
                if (c10 != null && c11 != null) {
                    int intValue = ((Integer) c10.first).intValue();
                    int intValue2 = ((Integer) c11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new a2.i(this.f7091a, qVar3, qVar4, 3, 0);
                    }
                }
            }
            if (!qVar3.b(qVar4)) {
                i6 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i6 |= 2;
            }
            if (i6 == 0) {
                return new a2.i(this.f7091a, qVar3, qVar4, 1, 0);
            }
        }
        return new a2.i(this.f7091a, qVar3, qVar4, 0, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(r1.q r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.q.c(r1.q, boolean):boolean");
    }

    public final boolean d(r1.q qVar) {
        if (Objects.equals(qVar.f11670n, "audio/flac") && qVar.H == 22 && Build.VERSION.SDK_INT < 34 && this.f7091a.equals("c2.android.flac.decoder")) {
            return false;
        }
        return true;
    }

    public final boolean e(r1.q qVar) {
        int i6;
        int i10;
        String str = qVar.f11670n;
        String str2 = this.f7092b;
        if ((!str2.equals(str) && !str2.equals(a0.b(qVar))) || !c(qVar, true) || !d(qVar)) {
            return false;
        }
        if (this.f7099i) {
            int i11 = qVar.f11676u;
            if (i11 > 0 && (i10 = qVar.f11677v) > 0) {
                return g(i11, i10, qVar.f11680y);
            }
        } else {
            int i12 = qVar.G;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7094d;
            if (i12 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i12)) {
                    h("sampleRate.support, " + i12);
                    return false;
                }
            }
            int i13 = qVar.F;
            if (i13 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i6 = 6;
                    } else if ("audio/eac3".equals(str2)) {
                        i6 = 16;
                    } else {
                        i6 = 30;
                    }
                    u1.a.p("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f7091a + ", [" + maxInputChannelCount + " to " + i6 + "]");
                    maxInputChannelCount = i6;
                }
                if (maxInputChannelCount < i13) {
                    h("channelCount.support, " + i13);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(r1.q qVar) {
        if (this.f7099i) {
            return this.f7095e;
        }
        HashMap hashMap = a0.f7050a;
        Pair c10 = u1.d.c(qVar);
        if (c10 != null && ((Integer) c10.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        if (r2 == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(int r12, int r13, double r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.q.g(int, int, double):boolean");
    }

    public final void h(String str) {
        StringBuilder q9 = r4.a.q("NoSupport [", str, "] [");
        q9.append(this.f7091a);
        q9.append(", ");
        q9.append(this.f7092b);
        q9.append("] [");
        q9.append(u1.a0.f12750a);
        q9.append("]");
        u1.a.f("MediaCodecInfo", q9.toString());
    }

    public final String toString() {
        return this.f7091a;
    }
}
