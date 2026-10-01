package u1;

import a2.e1;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.MimeTypes;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import hb.d0;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okhttp3.internal.ws.WebSocketProtocol;
import r1.k0;
import r1.l0;
import r1.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12750a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f12751b;

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f12752c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f12753d;

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f12754e;

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f12755f;

    /* renamed from: g, reason: collision with root package name */
    public static HashMap f12756g;

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f12757h;

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f12758i;
    public static final int[] j;

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f12759k;

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f12760l;

    static {
        int i6 = Build.VERSION.SDK_INT;
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        f12750a = str + ", " + Build.MODEL + ", " + str2 + ", " + i6;
        f12751b = new byte[0];
        f12752c = new long[0];
        f12753d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f12754e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f12755f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f12757h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f12758i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f12759k = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f12760l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, WebSocketProtocol.PAYLOAD_SHORT, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, ModuleDescriptor.MODULE_VERSION, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static long A(long j10) {
        if (j10 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime() + j10;
    }

    public static int B(int i6, ByteOrder byteOrder) {
        if (i6 != 8) {
            if (i6 != 16) {
                if (i6 != 24) {
                    if (i6 != 32) {
                        return 0;
                    }
                    if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                        return 22;
                    }
                    return 1610612736;
                }
                if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                    return 21;
                }
                return 1342177280;
            }
            if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                return 2;
            }
            return 268435456;
        }
        return 3;
    }

    public static r1.q C(int i6, int i10, int i11) {
        r1.p pVar = new r1.p();
        pVar.f11611m = k0.p("audio/raw");
        pVar.E = i10;
        pVar.F = i11;
        pVar.G = i6;
        return new r1.q(pVar);
    }

    public static long D(long j10, float f3) {
        if (f3 == 1.0f) {
            return j10;
        }
        return Math.round(j10 / f3);
    }

    public static String E(StringBuilder sb2, Formatter formatter, long j10) {
        String str;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        if (j10 < 0) {
            str = "-";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        long abs = (Math.abs(j10) + 500) / 1000;
        long j11 = abs % 60;
        long j12 = (abs / 60) % 60;
        long j13 = abs / 3600;
        sb2.setLength(0);
        if (j13 > 0) {
            return formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString();
        }
        return formatter.format("%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11)).toString();
    }

    public static String F(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            a.h("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    public static String G(int i6) {
        switch (i6) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return BuildConfig.FLAVOR;
            case 1:
                return MimeTypes.BASE_TYPE_AUDIO;
            case 2:
                return MimeTypes.BASE_TYPE_VIDEO;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i6 >= 10000) {
                    return h8.c.j(i6, "custom (", ")");
                }
                return "?";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean H(r1.u0 r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.e0()
            r2 = 1
            if (r1 != r2) goto L17
            r3 = 2
            boolean r3 = r4.n0(r3)
            if (r3 == 0) goto L17
            r4.c()
        L15:
            r0 = 1
            goto L24
        L17:
            r3 = 4
            if (r1 != r3) goto L24
            boolean r1 = r4.n0(r3)
            if (r1 == 0) goto L24
            r4.B()
            goto L15
        L24:
            boolean r1 = r4.n0(r2)
            if (r1 == 0) goto L2e
            r4.j0()
            return r2
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.a0.H(r1.u0):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int I(android.net.Uri r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.a0.I(android.net.Uri, java.lang.String):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean J(u1.t r3, u1.t r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.a()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            byte[] r0 = r4.f12811a
            int r0 = r0.length
            int r2 = r3.a()
            if (r0 >= r2) goto L1a
            int r0 = r3.a()
            int r0 = r0 * 2
            r4.c(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.f12811a
            int r2 = r3.f12812b
            int r3 = r3.a()
            r5.setInput(r0, r2, r3)
            r3 = 0
        L2d:
            byte[] r0 = r4.f12811a     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            int r2 = r0.length     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            if (r0 == 0) goto L46
            r4.J(r3)     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            r5.reset()
            r3 = 1
            return r3
        L44:
            r3 = move-exception
            goto L63
        L46:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            if (r0 != 0) goto L5f
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            if (r0 == 0) goto L53
            goto L5f
        L53:
            byte[] r0 = r4.f12811a     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            int r2 = r0.length     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            if (r3 != r2) goto L2d
            int r0 = r0.length     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            int r0 = r0 * 2
            r4.c(r0)     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            goto L2d
        L5f:
            r5.reset()
            return r1
        L63:
            r5.reset()
            throw r3
        L67:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.a0.J(u1.t, u1.t, java.util.zip.Inflater):boolean");
    }

    public static void K(int i6) {
        Integer.toString(i6, 36);
    }

    public static boolean L(int i6) {
        if (i6 != 3 && i6 != 2 && i6 != 268435456 && i6 != 21 && i6 != 1342177280 && i6 != 22 && i6 != 1610612736 && i6 != 4) {
            return false;
        }
        return true;
    }

    public static boolean M(Context context) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i6 == 30) {
                String str = Build.MODEL;
                if (dg.b.f(str, "moto g(20)") || dg.b.f(str, "rmx3231")) {
                    return true;
                }
            }
            if (i6 != 34 || !dg.b.f(Build.MODEL, "sm-x200")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean N(int i6) {
        if (i6 != 10 && i6 != 13) {
            return false;
        }
        return true;
    }

    public static boolean O(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static void P(ArrayList arrayList, int i6, int i10, int i11) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i12 = (i10 - i6) - 1; i12 >= 0; i12--) {
            arrayDeque.addFirst(arrayList.remove(i6 + i12));
        }
        arrayList.addAll(Math.min(i11, arrayList.size()), arrayDeque);
    }

    public static long Q(long j10) {
        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            return j10 * 1000;
        }
        return j10;
    }

    public static String R(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String p10 = dg.b.p(str);
        int i6 = 0;
        String str2 = p10.split("-", 2)[0];
        if (f12756g == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f12757h;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                hashMap.put(strArr[i10], strArr[i10 + 1]);
            }
            f12756g = hashMap;
        }
        String str4 = (String) f12756g.get(str2);
        if (str4 != null) {
            StringBuilder b10 = y.e.b(str4);
            b10.append(p10.substring(str2.length()));
            p10 = b10.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return p10;
        }
        while (true) {
            String[] strArr2 = f12758i;
            if (i6 < strArr2.length) {
                if (p10.startsWith(strArr2[i6])) {
                    return strArr2[i6 + 1] + p10.substring(strArr2[i6].length());
                }
                i6 += 2;
            } else {
                return p10;
            }
        }
    }

    public static Object[] S(int i6, Object[] objArr) {
        boolean z10;
        if (i6 <= objArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        c.b(z10);
        return Arrays.copyOf(objArr, i6);
    }

    public static long T(String str) {
        Matcher matcher = f12753d.matcher(str);
        if (matcher.matches()) {
            int i6 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i6 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                if ("-".equals(matcher.group(11))) {
                    i6 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i6 != 0) {
                return timeInMillis - (i6 * 60000);
            }
            return timeInMillis;
        }
        throw l0.a(null, "Invalid date/time format: " + str);
    }

    public static void U(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return;
        }
        if (looper == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void V(ArrayList arrayList, int i6, int i10) {
        if (i6 >= 0 && i10 <= arrayList.size() && i6 <= i10) {
            if (i6 != i10) {
                arrayList.subList(i6, i10).clear();
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static long W(int i6, long j10) {
        return Y(j10, 1000000L, i6, RoundingMode.DOWN);
    }

    public static void X(long[] jArr, long j10) {
        long j11;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i6 = 0;
        if (j10 >= 1000000 && j10 % 1000000 == 0) {
            long h4 = cf.m.h(j10, 1000000L, RoundingMode.UNNECESSARY);
            while (i6 < jArr.length) {
                jArr[i6] = cf.m.h(jArr[i6], h4, roundingMode);
                i6++;
            }
            return;
        }
        if (j10 < 1000000 && 1000000 % j10 == 0) {
            long h10 = cf.m.h(1000000L, j10, RoundingMode.UNNECESSARY);
            while (i6 < jArr.length) {
                jArr[i6] = cf.m.B(jArr[i6], h10);
                i6++;
            }
            return;
        }
        int i10 = 0;
        while (i10 < jArr.length) {
            long j12 = jArr[i10];
            if (j12 != 0) {
                if (j10 >= j12 && j10 % j12 == 0) {
                    jArr[i10] = cf.m.h(1000000L, cf.m.h(j10, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j10 < j12 && j12 % j10 == 0) {
                    jArr[i10] = cf.m.B(1000000L, cf.m.h(j12, j10, RoundingMode.UNNECESSARY));
                } else {
                    j11 = j10;
                    jArr[i10] = Z(j12, 1000000L, j11, roundingMode);
                    i10++;
                    j10 = j11;
                }
            }
            j11 = j10;
            i10++;
            j10 = j11;
        }
    }

    public static long Y(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        if (j12 >= j11 && j12 % j11 == 0) {
            return cf.m.h(j10, cf.m.h(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return cf.m.B(j10, cf.m.h(j11, j12, RoundingMode.UNNECESSARY));
        }
        if (j12 >= j10 && j12 % j10 == 0) {
            return cf.m.h(j11, cf.m.h(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j12 < j10 && j10 % j12 == 0) {
            return cf.m.B(j11, cf.m.h(j10, j12, RoundingMode.UNNECESSARY));
        }
        return Z(j10, j11, j12, roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (java.lang.Math.abs(r9 - r2) == 0.5d) goto L54;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x007e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long Z(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.a0.Z(long, long, long, java.math.RoundingMode):long");
    }

    public static int a(long[] jArr, long j10, boolean z10) {
        int i6;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i6 = binarySearch + 1;
            if (i6 >= jArr.length || jArr[i6] != j10) {
                break;
            }
            binarySearch = i6;
        }
        if (z10) {
            return binarySearch;
        }
        return i6;
    }

    public static boolean a0(u0 u0Var, boolean z10) {
        if (u0Var == null || !u0Var.m() || u0Var.e0() == 1 || u0Var.e0() == 4 || (z10 && u0Var.v0() != 0 && u0Var.v0() != 4)) {
            return true;
        }
        return false;
    }

    public static int b(j2.y yVar, long j10) {
        int i6 = yVar.f7144y - 1;
        int i10 = 0;
        while (i10 <= i6) {
            int i11 = (i10 + i6) >>> 1;
            if (yVar.k(i11) < j10) {
                i10 = i11 + 1;
            } else {
                i6 = i11 - 1;
            }
        }
        int i12 = i6 + 1;
        if (i12 < yVar.f7144y && yVar.k(i12) == j10) {
            return i12;
        }
        if (i6 == -1) {
            return 0;
        }
        return i6;
    }

    public static String[] b0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int c(List list, Long l10, boolean z10) {
        int i6;
        int binarySearch = Collections.binarySearch(list, l10);
        if (binarySearch < 0) {
            i6 = -(binarySearch + 2);
        } else {
            while (true) {
                int i10 = binarySearch - 1;
                if (i10 < 0 || ((Comparable) list.get(i10)).compareTo(l10) != 0) {
                    break;
                }
                binarySearch = i10;
            }
            i6 = binarySearch;
        }
        if (z10) {
            return Math.max(0, i6);
        }
        return i6;
    }

    public static String c0(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i6 = 0; i6 < bArr.length; i6++) {
            sb2.append(Character.forDigit((bArr[i6] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i6] & 15, 16));
        }
        return sb2.toString();
    }

    public static int d(int[] iArr, int i6, boolean z10, boolean z11) {
        int i10;
        int i11;
        int binarySearch = Arrays.binarySearch(iArr, i6);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                i10 = binarySearch - 1;
                if (i10 < 0 || iArr[i10] != i6) {
                    break;
                }
                binarySearch = i10;
            }
            if (z10) {
                i11 = binarySearch;
            } else {
                i11 = i10;
            }
        }
        if (z11) {
            return Math.max(0, i11);
        }
        return i11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hb.d0, java.lang.Object, hb.o] */
    public static d0 d0(hb.x xVar, hb.p pVar) {
        ?? obj = new Object();
        m8.c cVar = new m8.c(11, obj, xVar);
        hb.q qVar = hb.q.f6029x;
        obj.a(cVar, qVar);
        xVar.a(new e1(xVar, (Object) obj, pVar, 19), qVar);
        return obj;
    }

    public static int e(long[] jArr, long j10, boolean z10) {
        int i6;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i6 = -(binarySearch + 2);
        } else {
            while (true) {
                int i10 = binarySearch - 1;
                if (i10 < 0 || jArr[i10] != j10) {
                    break;
                }
                binarySearch = i10;
            }
            i6 = binarySearch;
        }
        if (z10) {
            return Math.max(0, i6);
        }
        return i6;
    }

    public static long e0(long j10) {
        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            return j10 / 1000;
        }
        return j10;
    }

    public static int f(int i6, int i10) {
        return ((i6 + i10) - 1) / i10;
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float h(float f3, float f10, float f11) {
        return Math.max(f10, Math.min(f3, f11));
    }

    public static int i(int i6, int i10, int i11) {
        return Math.max(i10, Math.min(i6, i11));
    }

    public static long j(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static boolean k(SparseArray sparseArray, int i6) {
        if (sparseArray.indexOfKey(i6) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean l(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int m(int i6, byte[] bArr, int i10, int i11) {
        while (i6 < i10) {
            i11 = j[((i11 >>> 24) ^ (bArr[i6] & 255)) & 255] ^ (i11 << 8);
            i6++;
        }
        return i11;
    }

    public static Handler n(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        c.h(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String o(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int p(int i6) {
        if (i6 != 30) {
            switch (i6) {
                case 2:
                case 3:
                    return 3;
                case 4:
                case 5:
                case 6:
                    return 21;
                case 7:
                case 8:
                    return 23;
                case 9:
                case 10:
                case 11:
                case 12:
                    return 28;
                default:
                    switch (i6) {
                        case 14:
                            return 25;
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                            return 28;
                        default:
                            switch (i6) {
                                case 20:
                                    return 30;
                                case 21:
                                case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                                    return 31;
                                default:
                                    return Integer.MAX_VALUE;
                            }
                    }
            }
        }
        return 34;
    }

    public static AudioFormat q(int i6, int i10, int i11) {
        return new AudioFormat.Builder().setSampleRate(i6).setChannelMask(i10).setEncoding(i11).build();
    }

    public static int r(int i6) {
        if (i6 != 10) {
            if (i6 != 12) {
                if (i6 != 24) {
                    switch (i6) {
                        case 1:
                            return 4;
                        case 2:
                            return 12;
                        case 3:
                            return 28;
                        case 4:
                            return 204;
                        case 5:
                            return 220;
                        case 6:
                            return 252;
                        case 7:
                            return 1276;
                        case 8:
                            return 6396;
                        default:
                            return 0;
                    }
                }
                if (Build.VERSION.SDK_INT < 32) {
                    return 0;
                }
                return 67108860;
            }
            return 743676;
        }
        if (Build.VERSION.SDK_INT < 32) {
            return 6396;
        }
        return 737532;
    }

    public static int s(int i6) {
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 != 4) {
                    if (i6 != 21) {
                        if (i6 != 22) {
                            if (i6 != 268435456) {
                                if (i6 != 1342177280) {
                                    if (i6 != 1610612736) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                    return 3;
                }
                return 4;
            }
            return 1;
        }
        return 2;
    }

    public static byte[] t(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i6 = 0; i6 < length; i6++) {
            int i10 = i6 * 2;
            bArr[i6] = (byte) (Character.digit(str.charAt(i10 + 1), 16) + (Character.digit(str.charAt(i10), 16) << 4));
        }
        return bArr;
    }

    public static int u(int i6, String str) {
        int i10 = 0;
        for (String str2 : b0(str)) {
            if (i6 == k0.i(k0.e(str2))) {
                i10++;
            }
        }
        return i10;
    }

    public static String v(int i6, String str) {
        String[] b02 = b0(str);
        if (b02.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (String str2 : b02) {
                if (i6 == k0.i(k0.e(str2))) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str2);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
            return null;
        }
        return null;
    }

    public static Point w(Context context) {
        Display display;
        String F;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && O(context)) {
            if (Build.VERSION.SDK_INT < 28) {
                F = F("sys.display-size");
            } else {
                F = F("vendor.display-size");
            }
            if (!TextUtils.isEmpty(F)) {
                try {
                    String[] split = F.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                a.g("Util", "Invalid display size: " + F);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 23) {
            Display.Mode c10 = p5.c.c(display);
            point.x = p5.c.a(c10);
            point.y = p5.c.x(c10);
            return point;
        }
        display.getRealSize(point);
        return point;
    }

    public static int x(int i6) {
        if (i6 != 2 && i6 != 4) {
            if (i6 != 10) {
                if (i6 != 7) {
                    if (i6 != 8) {
                        switch (i6) {
                            case 15:
                                return 6003;
                            case 16:
                            case 18:
                                return 6005;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                                return 6004;
                            default:
                                switch (i6) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return 6003;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }

    public static int y(String str) {
        String[] split;
        int length;
        boolean z10;
        int i6 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            str2.getClass();
            i6 = Integer.parseInt(str2);
            if (z10) {
                return -i6;
            }
        } catch (NumberFormatException unused) {
        }
        return i6;
    }

    public static long z(long j10, float f3) {
        if (f3 == 1.0f) {
            return j10;
        }
        return Math.round(j10 * f3);
    }
}
