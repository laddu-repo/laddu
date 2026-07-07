package j2;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.unity3d.services.core.device.MimeTypes;
import db.c1;
import db.h0;
import db.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f7050a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((q) arrayList.get(0)).f7091a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(q.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new aa.e(new Object(), 1));
        }
        if (Build.VERSION.SDK_INT < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((q) arrayList.get(0)).f7091a)) {
            arrayList.add((q) arrayList.remove(0));
        }
    }

    public static String b(r1.q qVar) {
        Pair c10;
        String str = qVar.f11670n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (c10 = u1.d.c(qVar)) != null) {
            int intValue = ((Integer) c10.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return MimeTypes.VIDEO_H264;
                }
                if (intValue == 1024) {
                    return MimeTypes.VIDEO_AV1;
                }
            } else {
                return MimeTypes.VIDEO_H265;
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return MimeTypes.VIDEO_H265;
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static synchronized List d(String str, boolean z10, boolean z11) {
        synchronized (a0.class) {
            try {
                v vVar = new v(str, z10, z11);
                HashMap hashMap = f7050a;
                List list = (List) hashMap.get(vVar);
                if (list != null) {
                    return list;
                }
                ArrayList e10 = e(vVar, new y(z10, z11, str.equals("video/mv-hevc")));
                if (z10 && e10.isEmpty() && Build.VERSION.SDK_INT <= 23) {
                    e10 = e(vVar, new ua.f(16));
                    if (!e10.isEmpty()) {
                        u1.a.p("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((q) e10.get(0)).f7091a);
                    }
                }
                a(str, e10);
                k0 k8 = k0.k(e10);
                hashMap.put(vVar, k8);
                return k8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r12 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118 A[Catch: Exception -> 0x0162, TRY_ENTER, TryCatch #4 {Exception -> 0x0162, blocks: (B:3:0x000a, B:5:0x001e, B:7:0x0028, B:11:0x0137, B:12:0x0034, B:15:0x003f, B:50:0x0110, B:53:0x0118, B:55:0x011e, B:58:0x013f, B:59:0x0160), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList e(j2.v r20, j2.x r21) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.a0.e(j2.v, j2.x):java.util.ArrayList");
    }

    public static c1 f(l lVar, r1.q qVar, boolean z10, boolean z11) {
        List b10;
        List b11 = lVar.b(qVar.f11670n, z10, z11);
        String b12 = b(qVar);
        if (b12 == null) {
            b10 = c1.B;
        } else {
            b10 = lVar.b(b12, z10, z11);
        }
        h0 j = k0.j();
        j.d(b11);
        j.d(b10);
        return j.g();
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (!mediaCodecInfo.isEncoder()) {
            if (z10 || !str.endsWith(".secure")) {
                int i6 = Build.VERSION.SDK_INT;
                if (i6 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
                    String str3 = Build.DEVICE;
                    if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                        return false;
                    }
                }
                if (i6 > 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (Build.VERSION.SDK_INT >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (!r1.k0.k(str)) {
            String p10 = dg.b.p(mediaCodecInfo.getName());
            if (!p10.startsWith("arc.")) {
                if (!p10.startsWith("omx.google.") && !p10.startsWith("omx.ffmpeg.")) {
                    if ((!p10.startsWith("omx.sec.") || !p10.contains(".sw.")) && !p10.equals("omx.qcom.video.decoder.hevcswvdec") && !p10.startsWith("c2.android.") && !p10.startsWith("c2.google.")) {
                        if (p10.startsWith("omx.") || p10.startsWith("c2.")) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }
}
