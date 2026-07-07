package e2;

import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.j1;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.services.core.device.MimeTypes;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import r1.l0;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class e extends DefaultHandler implements u2.q {

    /* renamed from: x, reason: collision with root package name */
    public final XmlPullParserFactory f4236x;

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f4234y = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f4235z = Pattern.compile("CC([1-4])=.*");
    public static final Pattern A = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] B = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] C = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public e() {
        try {
            this.f4236x = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static long a(ArrayList arrayList, long j, long j10, int i6, long j11) {
        int i10;
        if (i6 >= 0) {
            i10 = i6 + 1;
        } else {
            String str = a0.f12750a;
            i10 = (int) ((((j11 - j) + j10) - 1) / j10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new q(j, j10));
            j += j10;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i6 = 1;
            while (i6 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i6++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i6--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008f, code lost:
    
        if (r13 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0093, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
    
        if (r13.equals("fa01") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019b, code lost:
    
        if (r13 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ae, code lost:
    
        if (r13 < 33) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.e.c(org.xmlpull.v1.XmlPullParser, java.lang.String):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z10) {
        int i6;
        int i10;
        String str;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i6 = Integer.parseInt(attributeValue);
        } else if (z10) {
            i6 = 1;
        } else {
            i6 = Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        if (attributeValue2 != null) {
            i10 = Integer.parseInt(attributeValue2);
        } else {
            i10 = 1;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!u1.c.l(xmlPullParser, "BaseURL"));
        if (str2 != null && u1.a.j(str2)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str2;
            }
            return db.r.p(new b(str2, attributeValue3, i6, i10));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            b bVar = (b) arrayList.get(i11);
            String n10 = u1.a.n(bVar.f4210a, str2);
            if (attributeValue3 == null) {
                str = n10;
            } else {
                str = attributeValue3;
            }
            if (z10) {
                i6 = bVar.f4212c;
                i10 = bVar.f4213d;
                str = bVar.f4211b;
            }
            arrayList2.add(new b(n10, str, i6, i10));
        }
        return arrayList2;
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (!TextUtils.isEmpty(attributeValue)) {
            if (MimeTypes.BASE_TYPE_AUDIO.equals(attributeValue)) {
                return 1;
            }
            if (MimeTypes.BASE_TYPE_VIDEO.equals(attributeValue)) {
                return 2;
            }
            if ("text".equals(attributeValue)) {
                return 3;
            }
            if ("image".equals(attributeValue)) {
                return 4;
            }
            return -1;
        }
        return -1;
    }

    public static f i(XmlPullParser xmlPullParser, String str) {
        String str2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        if (attributeValue3 != null) {
            str2 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!u1.c.l(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j) {
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = a0.f12754e.matcher(attributeValue);
        if (matcher.matches()) {
            boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d15 = 0.0d;
            if (group != null) {
                d10 = Double.parseDouble(group) * 3.1556908E7d;
            } else {
                d10 = 0.0d;
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                d11 = Double.parseDouble(group2) * 2629739.0d;
            } else {
                d11 = 0.0d;
            }
            double d16 = d10 + d11;
            String group3 = matcher.group(7);
            if (group3 != null) {
                d12 = Double.parseDouble(group3) * 86400.0d;
            } else {
                d12 = 0.0d;
            }
            double d17 = d16 + d12;
            String group4 = matcher.group(10);
            if (group4 != null) {
                d13 = Double.parseDouble(group4) * 3600.0d;
            } else {
                d13 = 0.0d;
            }
            double d18 = d17 + d13;
            String group5 = matcher.group(12);
            if (group5 != null) {
                d14 = Double.parseDouble(group5) * 60.0d;
            } else {
                d14 = 0.0d;
            }
            double d19 = d18 + d14;
            String group6 = matcher.group(14);
            if (group6 != null) {
                d15 = Double.parseDouble(group6);
            }
            long j10 = (long) ((d19 + d15) * 1000.0d);
            if (!isEmpty) {
                return -j10;
            }
            return j10;
        }
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }

    public static float k(XmlPullParser xmlPullParser, float f3) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f4234y.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                if (!TextUtils.isEmpty(matcher.group(2))) {
                    return parseInt / Integer.parseInt(r2);
                }
                return parseInt;
            }
        }
        return f3;
    }

    public static j m(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j10;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j10 = (Long.parseLong(split[1]) - j) + 1;
                return new j(attributeValue, j, j10);
            }
        } else {
            j = 0;
        }
        j10 = -1;
        return new j(attributeValue, j, j10);
    }

    public static int n(String str) {
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -2060497896:
                    if (str.equals("subtitle")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1724546052:
                    if (str.equals("description")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1580883024:
                    if (str.equals("enhanced-audio-intelligibility")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1574842690:
                    if (str.equals("forced_subtitle")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1408024454:
                    if (str.equals("alternate")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1396432756:
                    if (str.equals("forced-subtitle")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 99825:
                    if (str.equals("dub")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3343801:
                    if (str.equals("main")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3530173:
                    if (str.equals("sign")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 552573414:
                    if (str.equals("caption")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 899152809:
                    if (str.equals("commentary")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 1629013393:
                    if (str.equals("emergency")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 1855372047:
                    if (str.equals("supplementary")) {
                        c10 = '\f';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 3:
                case 5:
                    return 128;
                case 1:
                    return 512;
                case 2:
                    return 2048;
                case 4:
                    return 2;
                case 6:
                    return 16;
                case 7:
                    return 1;
                case '\b':
                    return 256;
                case '\t':
                    return 64;
                case '\n':
                    return 8;
                case 11:
                    return 32;
                case '\f':
                    return 4;
            }
        }
        return 0;
    }

    public static int o(ArrayList arrayList) {
        int i6 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (dg.b.f("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i10)).f4237a)) {
                i6 = Http2.INITIAL_MAX_FRAME_SIZE;
            }
        }
        return i6;
    }

    public static r p(XmlPullParser xmlPullParser, r rVar) {
        long j;
        long j10;
        long j11;
        if (rVar != null) {
            j = rVar.f4273b;
        } else {
            j = 1;
        }
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        long j12 = j;
        long j13 = 0;
        if (rVar != null) {
            j10 = rVar.f4274c;
        } else {
            j10 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j10 = Long.parseLong(attributeValue2);
        }
        long j14 = j10;
        if (rVar != null) {
            j11 = rVar.f4270d;
        } else {
            j11 = 0;
        }
        if (rVar != null) {
            j13 = rVar.f4271e;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j11 = Long.parseLong(split[0]);
            j13 = (Long.parseLong(split[1]) - j11) + 1;
        }
        long j15 = j13;
        long j16 = j11;
        if (rVar != null) {
            jVar = rVar.f4272a;
        }
        while (true) {
            xmlPullParser.next();
            if (u1.c.m(xmlPullParser, "Initialization")) {
                jVar = m(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar2 = jVar;
            if (u1.c.l(xmlPullParser, "SegmentBase")) {
                return new r(jVar2, j12, j14, j16, j15);
            }
            jVar = jVar2;
        }
    }

    public static o q(XmlPullParser xmlPullParser, o oVar, long j, long j10, long j11, long j12, long j13) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19 = 1;
        if (oVar != null) {
            j14 = oVar.f4273b;
        } else {
            j14 = 1;
        }
        List list = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j14 = Long.parseLong(attributeValue);
        }
        long j20 = j14;
        if (oVar != null) {
            j15 = oVar.f4274c;
        } else {
            j15 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j15 = Long.parseLong(attributeValue2);
        }
        long j21 = j15;
        if (oVar != null) {
            j16 = oVar.f4261e;
        } else {
            j16 = -9223372036854775807L;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j16 = Long.parseLong(attributeValue3);
        }
        long j22 = j16;
        if (oVar != null) {
            j19 = oVar.f4260d;
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j19 = Long.parseLong(attributeValue4);
        }
        long j23 = j19;
        if (j12 == -9223372036854775807L) {
            j17 = j11;
        } else {
            j17 = j12;
        }
        if (j17 == Long.MAX_VALUE) {
            j18 = -9223372036854775807L;
        } else {
            j18 = j17;
        }
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (u1.c.m(xmlPullParser, "Initialization")) {
                jVar = m(xmlPullParser, "sourceURL", "range");
            } else if (u1.c.m(xmlPullParser, "SegmentTimeline")) {
                list2 = s(xmlPullParser, j20, j10);
            } else if (u1.c.m(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(m(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!u1.c.l(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVar == null) {
                jVar = oVar.f4272a;
            }
            if (list2 == null) {
                list2 = oVar.f4262f;
            }
            if (list == null) {
                list = oVar.j;
            }
        }
        return new o(jVar, j20, j21, j23, j22, list2, j18, list, a0.Q(j13), a0.Q(j));
    }

    public static p r(XmlPullParser xmlPullParser, p pVar, List list, long j, long j10, long j11, long j12, long j13) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        j1 j1Var;
        j1 j1Var2;
        long j20 = 1;
        if (pVar != null) {
            j14 = pVar.f4273b;
        } else {
            j14 = 1;
        }
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j14 = Long.parseLong(attributeValue);
        }
        long j21 = j14;
        if (pVar != null) {
            j15 = pVar.f4274c;
        } else {
            j15 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j15 = Long.parseLong(attributeValue2);
        }
        long j22 = j15;
        if (pVar != null) {
            j16 = pVar.f4261e;
        } else {
            j16 = -9223372036854775807L;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j16 = Long.parseLong(attributeValue3);
        }
        long j23 = j16;
        if (pVar != null) {
            j20 = pVar.f4260d;
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j20 = Long.parseLong(attributeValue4);
        }
        long j24 = j20;
        int i6 = 0;
        while (true) {
            if (i6 < list.size()) {
                f fVar = (f) list.get(i6);
                if (dg.b.f("http://dashif.org/guidelines/last-segment-number", fVar.f4237a)) {
                    j17 = Long.parseLong(fVar.f4238b);
                    break;
                }
                i6++;
            } else {
                j17 = -1;
                break;
            }
        }
        long j25 = j17;
        if (j12 == -9223372036854775807L) {
            j18 = j11;
        } else {
            j18 = j12;
        }
        if (j18 == Long.MAX_VALUE) {
            j19 = -9223372036854775807L;
        } else {
            j19 = j18;
        }
        if (pVar != null) {
            j1Var = pVar.f4266k;
        } else {
            j1Var = null;
        }
        j1 t10 = t(xmlPullParser, "media", j1Var);
        if (pVar != null) {
            j1Var2 = pVar.j;
        } else {
            j1Var2 = null;
        }
        j1 t11 = t(xmlPullParser, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, j1Var2);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (u1.c.m(xmlPullParser, "Initialization")) {
                jVar = m(xmlPullParser, "sourceURL", "range");
            } else if (u1.c.m(xmlPullParser, "SegmentTimeline")) {
                list2 = s(xmlPullParser, j21, j10);
            } else {
                b(xmlPullParser);
            }
        } while (!u1.c.l(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar == null) {
                jVar = pVar.f4272a;
            }
            if (list2 == null) {
                list2 = pVar.f4262f;
            }
        }
        return new p(jVar, j21, j22, j24, j25, j23, list2, j19, t11, t10, a0.Q(j13), a0.Q(j));
    }

    public static ArrayList s(XmlPullParser xmlPullParser, long j, long j10) {
        long parseLong;
        long j11;
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i6 = 0;
        do {
            xmlPullParser.next();
            if (u1.c.m(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                if (attributeValue == null) {
                    parseLong = -9223372036854775807L;
                } else {
                    parseLong = Long.parseLong(attributeValue);
                }
                if (z10) {
                    int i10 = i6;
                    j11 = parseLong;
                    j12 = a(arrayList, j12, j13, i10, j11);
                } else {
                    j11 = parseLong;
                }
                if (j11 != -9223372036854775807L) {
                    j12 = j11;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                if (attributeValue2 == null) {
                    j13 = -9223372036854775807L;
                } else {
                    j13 = Long.parseLong(attributeValue2);
                }
                String attributeValue3 = xmlPullParser.getAttributeValue(null, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                if (attributeValue3 == null) {
                    i6 = 0;
                } else {
                    i6 = Integer.parseInt(attributeValue3);
                }
                z10 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!u1.c.l(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            String str = a0.f12750a;
            a(arrayList, j12, j13, i6, a0.Y(j10, j, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00ff. Please report as an issue. */
    public static j1 t(XmlPullParser xmlPullParser, String str, j1 j1Var) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add(HttpUrl.FRAGMENT_ENCODE_SET);
            int i6 = 0;
            while (i6 < attributeValue.length()) {
                int indexOf = attributeValue.indexOf("$", i6);
                char c10 = 65535;
                if (indexOf == -1) {
                    arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i6));
                    i6 = attributeValue.length();
                } else if (indexOf != i6) {
                    arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i6, indexOf));
                    i6 = indexOf;
                } else if (attributeValue.startsWith("$$", i6)) {
                    arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                    i6 += 2;
                } else {
                    arrayList3.add(HttpUrl.FRAGMENT_ENCODE_SET);
                    int i10 = i6 + 1;
                    int indexOf2 = attributeValue.indexOf("$", i10);
                    String substring = attributeValue.substring(i10, indexOf2);
                    if (substring.equals("RepresentationID")) {
                        arrayList2.add(1);
                    } else {
                        int indexOf3 = substring.indexOf("%0");
                        if (indexOf3 != -1) {
                            str2 = substring.substring(indexOf3);
                            if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                                str2 = str2.concat("d");
                            }
                            substring = substring.substring(0, indexOf3);
                        } else {
                            str2 = "%01d";
                        }
                        substring.getClass();
                        switch (substring.hashCode()) {
                            case -1950496919:
                                if (substring.equals("Number")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case 2606829:
                                if (substring.equals("Time")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case 38199441:
                                if (substring.equals("Bandwidth")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c10) {
                            case 0:
                                arrayList2.add(2);
                                break;
                            case 1:
                                arrayList2.add(4);
                                break;
                            case 2:
                                arrayList2.add(3);
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                        }
                        arrayList3.set(arrayList2.size() - 1, str2);
                    }
                    arrayList.add(HttpUrl.FRAGMENT_ENCODE_SET);
                    i6 = indexOf2 + 1;
                }
            }
            return new j1(arrayList, arrayList2, arrayList3, 9);
        }
        return j1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016f  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair f(org.xmlpull.v1.XmlPullParser r15) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.e.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    @Override // u2.q
    public final Object h(Uri uri, w1.k kVar) {
        try {
            XmlPullParser newPullParser = this.f4236x.newPullParser();
            newPullParser.setInput(kVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return l(newPullParser, uri);
            }
            throw l0.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw l0.b(null, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:376:0x0987, code lost:
    
        if ("audio/eac3-joc".equals(r3) != false) goto L325;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0fdc A[LOOP:5: B:181:0x0408->B:190:0x0fdc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0e5a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0c89 A[LOOP:11: B:349:0x06a3->B:358:0x0c89, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x08f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x13d4 A[LOOP:1: B:35:0x00cd->B:43:0x13d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x13a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0b3f  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0b51  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0c1a  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0c36  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0c41  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0c1d  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0b5f  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0b3a  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0b09 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:561:0x098f  */
    /* JADX WARN: Type inference failed for: r1v119, types: [java.lang.Object, e2.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e2.c l(org.xmlpull.v1.XmlPullParser r169, android.net.Uri r170) {
        /*
            Method dump skipped, instructions count: 5148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.e.l(org.xmlpull.v1.XmlPullParser, android.net.Uri):e2.c");
    }
}
