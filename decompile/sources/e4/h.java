package e4;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import u1.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f4345a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f4346b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f4347c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f4348d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f4347c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f4348d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, e eVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c10;
        char c11;
        char c12;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = eVar.f4330b;
        int length = spannableStringBuilder.length();
        String str2 = eVar.f4329a;
        str2.getClass();
        int i15 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i14, length, 33);
                break;
            case 2:
                for (String str3 : eVar.f4332d) {
                    Map map = f4347c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i14, length, 33);
                    } else {
                        Map map2 = f4348d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i14, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i14, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i14, length, 33);
                break;
            case 5:
                spannableStringBuilder.setSpan(new t1.i(eVar.f4331c), i14, length, 33);
                break;
            case 7:
                int c13 = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.f4326c);
                int i16 = eVar.f4330b;
                int i17 = 0;
                int i18 = 0;
                while (i17 < arrayList.size()) {
                    if ("rt".equals(((d) arrayList.get(i17)).f4327a.f4329a)) {
                        d dVar = (d) arrayList.get(i17);
                        int c14 = c(list2, str, dVar.f4327a);
                        if (c14 == i15) {
                            if (c13 != i15) {
                                c14 = c13;
                            } else {
                                c14 = 1;
                            }
                        }
                        int i19 = dVar.f4327a.f4330b - i18;
                        int i20 = dVar.f4328b - i18;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i19, i20);
                        spannableStringBuilder.delete(i19, i20);
                        spannableStringBuilder.setSpan(new t1.g(subSequence.toString(), c14), i16, i19, 33);
                        i18 = subSequence.length() + i18;
                        i16 = i19;
                    }
                    i17++;
                    i15 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b10 = b(list2, str, eVar);
        for (int i21 = 0; i21 < b10.size(); i21++) {
            b bVar = ((f) b10.get(i21)).f4334y;
            int i22 = bVar.f4317l;
            if (i22 == -1 && bVar.f4318m == -1) {
                i6 = -1;
            } else {
                if (i22 == 1) {
                    c11 = 1;
                } else {
                    c11 = 0;
                }
                if (bVar.f4318m == 1) {
                    c12 = 2;
                } else {
                    c12 = 0;
                }
                i6 = c12 | c11;
            }
            if (i6 != -1) {
                int i23 = bVar.f4317l;
                if (i23 == -1 && bVar.f4318m == -1) {
                    i13 = -1;
                    i10 = 1;
                } else {
                    i10 = 1;
                    if (i23 == 1) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    if (bVar.f4318m == 1) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    i13 = i11 | i12;
                }
                a8.e.a(spannableStringBuilder, new StyleSpan(i13), i14, length);
            } else {
                i10 = 1;
            }
            if (bVar.j == i10) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i14, length, 33);
            }
            if (bVar.f4316k == i10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i14, length, 33);
            }
            if (bVar.f4313g) {
                if (bVar.f4313g) {
                    a8.e.a(spannableStringBuilder, new ForegroundColorSpan(bVar.f4312f), i14, length);
                } else {
                    throw new IllegalStateException("Font color not defined");
                }
            }
            if (bVar.f4315i) {
                if (bVar.f4315i) {
                    a8.e.a(spannableStringBuilder, new BackgroundColorSpan(bVar.f4314h), i14, length);
                } else {
                    throw new IllegalStateException("Background color not defined.");
                }
            }
            if (bVar.f4311e != null) {
                a8.e.a(spannableStringBuilder, new TypefaceSpan(bVar.f4311e), i14, length);
            }
            int i24 = bVar.f4319n;
            if (i24 != 1) {
                if (i24 != 2) {
                    if (i24 == 3) {
                        a8.e.a(spannableStringBuilder, new RelativeSizeSpan(bVar.f4320o / 100.0f), i14, length);
                    }
                } else {
                    a8.e.a(spannableStringBuilder, new RelativeSizeSpan(bVar.f4320o), i14, length);
                }
            } else {
                a8.e.a(spannableStringBuilder, new AbsoluteSizeSpan((int) bVar.f4320o, true), i14, length);
            }
            if (bVar.f4322q) {
                spannableStringBuilder.setSpan(new Object(), i14, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, e eVar) {
        int i6;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            b bVar = (b) list.get(i10);
            String str2 = eVar.f4329a;
            Set set = eVar.f4332d;
            String str3 = eVar.f4331c;
            if (bVar.f4307a.isEmpty() && bVar.f4308b.isEmpty() && bVar.f4309c.isEmpty() && bVar.f4310d.isEmpty()) {
                i6 = TextUtils.isEmpty(str2);
            } else {
                int a10 = b.a(bVar.f4310d, str3, b.a(bVar.f4308b, str2, b.a(bVar.f4307a, str, 0, 1073741824), 2), 4);
                if (a10 != -1 && set.containsAll(bVar.f4309c)) {
                    i6 = a10 + (bVar.f4309c.size() * 4);
                } else {
                    i6 = 0;
                }
            }
            if (i6 > 0) {
                arrayList.add(new f(i6, bVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList b10 = b(list, str, eVar);
        for (int i6 = 0; i6 < b10.size(); i6++) {
            int i10 = ((f) b10.get(i6)).f4334y.f4321p;
            if (i10 != -1) {
                return i10;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, t tVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String group = matcher.group(1);
            group.getClass();
            gVar.f4335a = i.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            gVar.f4336b = i.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, gVar);
            StringBuilder sb2 = new StringBuilder();
            tVar.getClass();
            String l10 = tVar.l(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(l10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(l10.trim());
                l10 = tVar.l(StandardCharsets.UTF_8);
            }
            gVar.f4337c = f(str, sb2.toString(), arrayList);
            return new c(gVar.a().a(), gVar.f4335a, gVar.f4336b);
        } catch (IllegalArgumentException unused) {
            u1.a.p("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0081, code lost:
    
        if (r6.equals("center") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c5, code lost:
    
        if (r7.equals("start") == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.lang.String r18, e4.g r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.h.e(java.lang.String, e4.g):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01d3, code lost:
    
        switch(r10) {
            case 0: goto L123;
            case 1: goto L122;
            case 2: goto L121;
            case 3: goto L120;
            default: goto L119;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01d6, code lost:
    
        u1.a.p("WebvttCueParser", "ignoring unsupported entity: '&" + r7 + ";'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01fe, code lost:
    
        if (r6 != r15) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0200, code lost:
    
        r3.append((java.lang.CharSequence) " ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0203, code lost:
    
        r7 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ef, code lost:
    
        r3.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01f3, code lost:
    
        r3.append('&');
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f7, code lost:
    
        r3.append('<');
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01fb, code lost:
    
        r3.append('>');
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x00a0. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString f(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.h.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, g gVar) {
        int indexOf = str.indexOf(44);
        char c10 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i6 = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    i6 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i6 = 0;
                    break;
                default:
                    u1.a.p("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i6 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f4341g = i6;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            gVar.f4339e = i.b(str);
            gVar.f4340f = 0;
        } else {
            gVar.f4339e = Integer.parseInt(str);
            gVar.f4340f = 1;
        }
    }
}
