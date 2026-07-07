package b4;

import b2.j;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import u1.a0;
import v3.l;
import v3.m;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements m {

    /* renamed from: x, reason: collision with root package name */
    public final XmlPullParserFactory f1440x;

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f1438y = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f1439z = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern A = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern B = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern C = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern D = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern E = Pattern.compile("^(\\d+) (\\d+)$");
    public static final d F = new d(30.0f, 1, 1);

    public e() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f1440x = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static g a(g gVar) {
        if (gVar == null) {
            return new g();
        }
        return gVar;
    }

    public static boolean b(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals(JsonStorageKeyNames.DATA_KEY) && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = E.matcher(attributeValue);
        if (!matcher.matches()) {
            u1.a.p("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z10 = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z10 = false;
            }
            u1.c.a("Invalid cell resolution " + parseInt + " " + parseInt2, z10);
            return parseInt2;
        } catch (NumberFormatException unused) {
            u1.a.p("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, g gVar) {
        Matcher matcher;
        String str2 = a0.f12750a;
        char c10 = 65535;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = A;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            u1.a.p("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(r4.a.l(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    gVar.j = 3;
                    break;
                case 1:
                    gVar.j = 2;
                    break;
                case 2:
                    gVar.j = 1;
                    break;
                default:
                    throw new Exception(h8.c.m("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            gVar.f1459k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(h8.c.m("Invalid expression for fontSize: '", str, "'."));
    }

    public static d e(XmlPullParser xmlPullParser) {
        int i6;
        float f3;
        boolean z10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i6 = Integer.parseInt(attributeValue);
        } else {
            i6 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = a0.f12750a;
            if (attributeValue2.split(" ", -1).length == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1.c.a("frameRateMultiplier doesn't have 2 parts", z10);
            f3 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f3 = 1.0f;
        }
        d dVar = F;
        int i10 = dVar.f1436b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = dVar.f1437c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new d(i6 * f3, i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x023b, code lost:
    
        if (u1.c.m(r20, "metadata") != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x023d, code lost:
    
        r20.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0246, code lost:
    
        if (u1.c.m(r20, "image") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0248, code lost:
    
        r6 = u1.c.k(r20, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024c, code lost:
    
        if (r6 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024e, code lost:
    
        r25.put(r6, r20.nextText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x025e, code lost:
    
        if (u1.c.l(r20, "metadata") == false) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, b2.j r23, java.util.HashMap r24, java.util.HashMap r25) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.e.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, b2.j, java.util.HashMap, java.util.HashMap):void");
    }

    public static c h(XmlPullParser xmlPullParser, c cVar, HashMap hashMap, d dVar) {
        long j;
        char c10;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        g i6 = i(xmlPullParser, null);
        String str = null;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j12 = j(attributeValue, dVar);
                    break;
                case 2:
                    j11 = j(attributeValue, dVar);
                    break;
                case 3:
                    j10 = j(attributeValue, dVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = a0.f12750a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (cVar != null) {
            long j13 = cVar.f1426d;
            if (j13 != -9223372036854775807L) {
                if (j10 != -9223372036854775807L) {
                    j10 += j13;
                }
                if (j11 != -9223372036854775807L) {
                    j11 += j13;
                }
            }
        }
        if (j11 == -9223372036854775807L) {
            if (j12 != -9223372036854775807L) {
                j11 = j10 + j12;
            } else if (cVar != null) {
                long j14 = cVar.f1427e;
                if (j14 != -9223372036854775807L) {
                    j = j14;
                    return new c(xmlPullParser.getName(), null, j10, j, i6, strArr, str2, str, cVar);
                }
            }
        }
        j = j11;
        return new c(xmlPullParser.getName(), null, j10, j, i6, strArr, str2, str, cVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x014e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:214:0x04b8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static b4.g i(org.xmlpull.v1.XmlPullParser r18, b4.g r19) {
        /*
            Method dump skipped, instructions count: 1510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.e.i(org.xmlpull.v1.XmlPullParser, b4.g):b4.g");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long j(java.lang.String r13, b4.d r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.e.j(java.lang.String, b4.d):long");
    }

    public static j k(XmlPullParser xmlPullParser) {
        String k8 = u1.c.k(xmlPullParser, "extent");
        if (k8 == null) {
            return null;
        }
        Matcher matcher = D.matcher(k8);
        if (!matcher.matches()) {
            u1.a.p("TtmlParser", "Ignoring non-pixel tts extent: ".concat(k8));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new j(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            u1.a.p("TtmlParser", "Ignoring malformed tts extent: ".concat(k8));
            return null;
        }
    }

    @Override // v3.m
    public final int B() {
        return 1;
    }

    @Override // v3.m
    public final v3.d g(byte[] bArr, int i6, int i10) {
        try {
            XmlPullParser newPullParser = this.f1440x.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put(HttpUrl.FRAGMENT_ENCODE_SET, new f(HttpUrl.FRAGMENT_ENCODE_SET, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            j jVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i6, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVar = F;
            h hVar = null;
            int i11 = 15;
            int i12 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVar = e(newPullParser);
                            i11 = c(newPullParser);
                            jVar = k(newPullParser);
                        }
                        d dVar2 = dVar;
                        j jVar2 = jVar;
                        int i13 = i11;
                        if (!b(name)) {
                            u1.a.k("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        } else {
                            if ("head".equals(name)) {
                                f(newPullParser, hashMap, i13, jVar2, hashMap2, hashMap3);
                            } else {
                                try {
                                    c h4 = h(newPullParser, cVar, hashMap2, dVar2);
                                    arrayDeque.push(h4);
                                    if (cVar != null) {
                                        if (cVar.f1434m == null) {
                                            cVar.f1434m = new ArrayList();
                                        }
                                        cVar.f1434m.add(h4);
                                    }
                                } catch (v3.f e10) {
                                    u1.a.q("TtmlParser", "Suppressing parser error", e10);
                                }
                            }
                            i11 = i13;
                            jVar = jVar2;
                            dVar = dVar2;
                        }
                        i12++;
                        i11 = i13;
                        jVar = jVar2;
                        dVar = dVar2;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c a10 = c.a(newPullParser.getText());
                        if (cVar.f1434m == null) {
                            cVar.f1434m = new ArrayList();
                        }
                        cVar.f1434m.add(a10);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            hVar = new h(cVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                newPullParser.next();
            }
            hVar.getClass();
            return hVar;
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override // v3.m
    public final void o(byte[] bArr, int i6, int i10, l lVar, u1.g gVar) {
        a8.b.o(g(bArr, i6, i10), lVar, gVar);
    }

    @Override // v3.m
    public final /* synthetic */ void reset() {
    }
}
