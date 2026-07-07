package c4;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w1.b0;
import w1.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f2098a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f2099b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f2100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f2101d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f2100c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f2101d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, f fVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int length;
        int i10;
        int i11;
        int i12;
        int i13;
        i = fVar.f2084b;
        length = spannableStringBuilder.length();
        String str2 = fVar.f2083a;
        str2.getClass();
        i10 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                for (String str3 : fVar.f2086d) {
                    Map map = f2100c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = f2101d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new v1.i(fVar.f2085c), i, length, 33);
                break;
            case "ruby":
                int iC = c(list2, str, fVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, e.f2080c);
                int i14 = fVar.f2084b;
                int i15 = 0;
                int length2 = 0;
                while (i15 < arrayList.size()) {
                    if ("rt".equals(((e) arrayList.get(i15)).f2081a.f2083a)) {
                        e eVar = (e) arrayList.get(i15);
                        int iC2 = c(list2, str, eVar.f2081a);
                        if (iC2 == i10) {
                            iC2 = iC != i10 ? iC : 1;
                        }
                        int i16 = eVar.f2081a.f2084b - length2;
                        int i17 = eVar.f2082b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i16, i17);
                        spannableStringBuilder.delete(i16, i17);
                        spannableStringBuilder.setSpan(new v1.g(iC2, charSequenceSubSequence.toString()), i14, i16, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i14 = i16;
                    }
                    i15++;
                    i10 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, fVar);
        for (int i18 = 0; i18 < arrayListB.size(); i18++) {
            b bVar = ((g) arrayListB.get(i18)).f2088w;
            int i19 = bVar.f2070l;
            if (i19 == -1 && bVar.f2071m == -1) {
                i11 = -1;
            } else {
                i11 = (bVar.f2071m == 1 ? (char) 2 : (char) 0) | (i19 == 1 ? (char) 1 : (char) 0);
            }
            if (i11 != -1) {
                int i20 = bVar.f2070l;
                if (i20 == -1 && bVar.f2071m == -1) {
                    i13 = -1;
                    i12 = 1;
                } else {
                    i12 = 1;
                    i13 = (i20 == 1 ? 1 : 0) | (bVar.f2071m == 1 ? 2 : 0);
                }
                com.bumptech.glide.f.a(spannableStringBuilder, new StyleSpan(i13), i, length);
            } else {
                i12 = 1;
            }
            if (bVar.f2068j == i12) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, length, 33);
            }
            if (bVar.f2069k == i12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (bVar.f2066g) {
                if (!bVar.f2066g) {
                    throw new IllegalStateException("Font color not defined");
                }
                com.bumptech.glide.f.a(spannableStringBuilder, new ForegroundColorSpan(bVar.f), i, length);
            }
            if (bVar.i) {
                if (!bVar.i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                com.bumptech.glide.f.a(spannableStringBuilder, new BackgroundColorSpan(bVar.f2067h), i, length);
            }
            if (bVar.f2065e != null) {
                com.bumptech.glide.f.a(spannableStringBuilder, new TypefaceSpan(bVar.f2065e), i, length);
            }
            int i21 = bVar.f2072n;
            if (i21 == 1) {
                com.bumptech.glide.f.a(spannableStringBuilder, new AbsoluteSizeSpan((int) bVar.f2073o, true), i, length);
            } else if (i21 == 2) {
                com.bumptech.glide.f.a(spannableStringBuilder, new RelativeSizeSpan(bVar.f2073o), i, length);
            } else if (i21 == 3) {
                com.bumptech.glide.f.a(spannableStringBuilder, new RelativeSizeSpan(bVar.f2073o / 100.0f), i, length);
            }
            if (bVar.f2075q) {
                spannableStringBuilder.setSpan(new v1.e(), i, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, f fVar) {
        ?? size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            b bVar = (b) list.get(i);
            String str2 = fVar.f2083a;
            Set set = fVar.f2086d;
            String str3 = fVar.f2085c;
            if (bVar.f2061a.isEmpty() && bVar.f2062b.isEmpty() && bVar.f2063c.isEmpty() && bVar.f2064d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int iA = b.a(b.a(b.a(0, 1073741824, bVar.f2061a, str), 2, bVar.f2062b, str2), 4, bVar.f2064d, str3);
                size = (iA == -1 || !set.containsAll(bVar.f2063c)) ? 0 : iA + (bVar.f2063c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new g(size, bVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, f fVar) {
        ArrayList arrayListB = b(list, str, fVar);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i10 = ((g) arrayListB.get(i)).f2088w.f2074p;
            if (i10 != -1) {
                return i10;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, t tVar, ArrayList arrayList) {
        h hVar = new h();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            hVar.f2089a = j.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            hVar.f2090b = j.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, hVar);
            StringBuilder sb2 = new StringBuilder();
            tVar.getClass();
            String strK = tVar.k(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strK)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strK.trim());
                strK = tVar.k(StandardCharsets.UTF_8);
            }
            hVar.f2091c = f(str, sb2.toString(), arrayList);
            return new c(hVar.a().a(), hVar.f2089a, hVar.f2090b);
        } catch (IllegalArgumentException unused) {
            w1.a.C("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, h hVar) {
        int i;
        String strSubstring;
        int i10;
        int i11;
        Matcher matcher = f2099b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, hVar);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                i = 1;
                                break;
                            default:
                                w1.a.C("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        hVar.f2092d = i;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            strSubstring = strGroup2.substring(iIndexOf + 1);
                            strSubstring.getClass();
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i10 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i10 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    i10 = 2;
                                    break;
                                default:
                                    w1.a.C("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i10 = Integer.MIN_VALUE;
                                    break;
                            }
                            hVar.i = i10;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        hVar.f2095h = j.b(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        hVar.f2096j = j.b(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i11 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i11 = 1;
                        } else {
                            w1.a.C("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i11 = Integer.MIN_VALUE;
                        }
                        hVar.f2097k = i11;
                    } else {
                        w1.a.C("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                w1.a.C("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString f(String str, String str2, List list) {
        String str3;
        char c10;
        String strSubstring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String strTrim = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (f) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new f("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    strSubstring = str2.substring(i, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            w1.a.C("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int length = i + 1;
                if (length < str2.length()) {
                    boolean z2 = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i10 = length - 2;
                    boolean z10 = str2.charAt(i10) == '/';
                    int i11 = i + (z2 ? 2 : 1);
                    if (!z10) {
                        i10 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i11, i10);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        w1.a.d(!strTrim2.isEmpty());
                        int i12 = b0.f13686a;
                        str3 = strTrim2.split("[ \\.]", 2)[0];
                        str3.getClass();
                        switch (str3) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z2) {
                                    if (!z10) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        w1.a.d(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c10 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c10 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str4 = strArrSplit[c10];
                                        HashSet hashSet = new HashSet();
                                        for (int i13 = 1; i13 < strArrSplit.length; i13++) {
                                            hashSet.add(strArrSplit[i13]);
                                        }
                                        arrayDeque.push(new f(str4, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        f fVar = (f) arrayDeque.pop();
                                        a(str, fVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new e(fVar, spannableStringBuilder.length()));
                                        }
                                        if (fVar.f2083a.equals(str3)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = length;
            }
        }
    }

    public static void g(String str, h hVar) {
        String strSubstring;
        int i;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    w1.a.C("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            hVar.f2094g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            hVar.f2093e = j.b(str);
            hVar.f = 0;
        } else {
            hVar.f2093e = Integer.parseInt(str);
            hVar.f = 1;
        }
    }
}
