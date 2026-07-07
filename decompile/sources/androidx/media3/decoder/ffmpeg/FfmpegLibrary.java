package androidx.media3.decoder.ffmpeg;

import com.unity3d.services.core.device.MimeTypes;
import r1.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class FfmpegLibrary {

    /* renamed from: a, reason: collision with root package name */
    public static final e f1019a;

    /* renamed from: b, reason: collision with root package name */
    public static String f1020b;

    /* renamed from: c, reason: collision with root package name */
    public static int f1021c;

    static {
        f0.a("media3.decoder.ffmpeg");
        f1019a = new e(new String[]{"ffmpegJNI"}, 0);
        f1021c = -1;
    }

    public static String a(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals(MimeTypes.VIDEO_H265)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1003765268:
                if (str.equals("audio/vorbis")) {
                    c10 = 4;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c10 = 5;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c10 = 6;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 7;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1331836730:
                if (str.equals(MimeTypes.VIDEO_H264)) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1504470054:
                if (str.equals("audio/alac")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 14;
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c10 = 15;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = 16;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = 17;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = 18;
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c10 = 19;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case '\f':
                return "eac3";
            case 1:
                return "hevc";
            case 2:
                return "amrwb";
            case 3:
            case 16:
                return "dca";
            case 4:
                return "vorbis";
            case 5:
            case 6:
            case 14:
                return "mp3";
            case 7:
                return "aac";
            case '\b':
                return "ac3";
            case '\t':
                return "h264";
            case '\n':
                return "amrnb";
            case 11:
                return "alac";
            case '\r':
                return "flac";
            case 15:
                return "opus";
            case 17:
                return "truehd";
            case 18:
                return "pcm_alaw";
            case 19:
                return "pcm_mulaw";
            default:
                return null;
        }
    }

    public static int b() {
        if (!f1019a.a()) {
            return -1;
        }
        if (f1021c == -1) {
            f1021c = ffmpegGetInputBufferPaddingSize();
        }
        return f1021c;
    }

    public static String c() {
        if (!f1019a.a()) {
            return null;
        }
        if (f1020b == null) {
            f1020b = ffmpegGetVersion();
        }
        return f1020b;
    }

    public static boolean d(String str) {
        String a10;
        if (!f1019a.a() || (a10 = a(str)) == null) {
            return false;
        }
        if (!ffmpegHasDecoder(a10)) {
            u1.a.p("FfmpegLibrary", "No " + a10 + " decoder available. Check the FFmpeg build configuration.");
            return false;
        }
        return true;
    }

    private static native int ffmpegGetInputBufferPaddingSize();

    private static native String ffmpegGetVersion();

    private static native boolean ffmpegHasDecoder(String str);
}
