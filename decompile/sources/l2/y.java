package l2;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import k8.b0;
import y9.f0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f8150a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).f8099a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new t(0, new j()));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((o) arrayList.get(0)).f8099a)) {
            return;
        }
        arrayList.add((o) arrayList.remove(0));
    }

    public static String b(t1.o oVar) {
        Pair pairB;
        String str = oVar.f12061n;
        String str2 = oVar.f12061n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairB = w1.c.b(oVar)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
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

    public static synchronized List d(String str, boolean z2, boolean z10) {
        try {
            u uVar = new u(str, z2, z10);
            HashMap map = f8150a;
            List list = (List) map.get(uVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListE = e(uVar, new c6.i(z2, z10, str.equals("video/mv-hevc")));
            if (z2 && arrayListE.isEmpty() && Build.VERSION.SDK_INT <= 23) {
                arrayListE = e(uVar, new b0(16));
                if (!arrayListE.isEmpty()) {
                    w1.a.C("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((o) arrayListE.get(0)).f8099a);
                }
            }
            a(str, arrayListE);
            f0 f0VarM = f0.m(arrayListE);
            map.put(uVar, f0VarM);
            return f0VarM;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0119 A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #4 {Exception -> 0x0163, blocks: (B:3:0x000a, B:5:0x001f, B:7:0x0029, B:77:0x0138, B:10:0x0035, B:13:0x0040, B:71:0x0111, B:74:0x0119, B:76:0x011f, B:78:0x0140, B:79:0x0161), top: B:92:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0140 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList e(l2.u r20, l2.w r21) throws l2.v {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.y.e(l2.u, l2.w):java.util.ArrayList");
    }

    public static z0 f(j jVar, t1.o oVar, boolean z2, boolean z10) {
        List listA = jVar.a(oVar.f12061n, z2, z10);
        String strB = b(oVar);
        List listA2 = strB == null ? z0.f14637z : jVar.a(strB, z2, z10);
        y9.b0 b0VarJ = f0.j();
        b0VarJ.d(listA);
        b0VarJ.d(listA2);
        return b0VarJ.g();
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z2, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z2 && str.endsWith(".secure")) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (t1.f0.k(str)) {
            return true;
        }
        String strU = com.bumptech.glide.f.U(mediaCodecInfo.getName());
        if (strU.startsWith("arc.")) {
            return false;
        }
        if (strU.startsWith("omx.google.") || strU.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strU.startsWith("omx.sec.") && strU.contains(".sw.")) || strU.equals("omx.qcom.video.decoder.hevcswvdec") || strU.startsWith("c2.android.") || strU.startsWith("c2.google.")) {
            return true;
        }
        return (strU.startsWith("omx.") || strU.startsWith("c2.")) ? false : true;
    }
}
