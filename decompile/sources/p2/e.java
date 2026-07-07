package p2;

import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParser;
import r1.k0;
import r1.p;
import r1.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends com.unity3d.scar.adapter.common.f {

    /* renamed from: e, reason: collision with root package name */
    public q f10485e;

    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList p(java.lang.String r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L98
            byte[] r10 = u1.a0.t(r10)
            byte[] r1 = u1.d.f12764a
            int r1 = r10.length
            r2 = 4
            if (r1 > r2) goto L16
            goto L22
        L16:
            r1 = 0
            r3 = 0
        L18:
            byte[] r4 = u1.d.f12764a
            if (r3 >= r2) goto L28
            r5 = r10[r3]
            r4 = r4[r3]
            if (r5 == r4) goto L25
        L22:
            r1 = 0
            goto L8f
        L25:
            int r3 = r3 + 1
            goto L18
        L28:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
        L2e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.add(r5)
            int r4 = r4 + r2
            int r5 = r10.length
            int r5 = r5 - r2
        L38:
            r6 = -1
            if (r4 > r5) goto L53
            int r7 = r10.length
            int r7 = r7 - r4
            if (r7 > r2) goto L40
            goto L4d
        L40:
            r7 = 0
        L41:
            byte[] r8 = u1.d.f12764a
            if (r7 >= r2) goto L54
            int r9 = r4 + r7
            r9 = r10[r9]
            r8 = r8[r7]
            if (r9 == r8) goto L50
        L4d:
            int r4 = r4 + 1
            goto L38
        L50:
            int r7 = r7 + 1
            goto L41
        L53:
            r4 = -1
        L54:
            if (r4 != r6) goto L2e
            int r2 = r3.size()
            byte[][] r2 = new byte[r2]
            r4 = 0
        L5d:
            int r5 = r3.size()
            if (r4 >= r5) goto L8e
            java.lang.Object r5 = r3.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r6 = r3.size()
            int r6 = r6 + (-1)
            if (r4 >= r6) goto L82
            int r6 = r4 + 1
            java.lang.Object r6 = r3.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L83
        L82:
            int r6 = r10.length
        L83:
            int r6 = r6 - r5
            byte[] r7 = new byte[r6]
            java.lang.System.arraycopy(r10, r5, r7, r1, r6)
            r2[r4] = r7
            int r4 = r4 + 1
            goto L5d
        L8e:
            r1 = r2
        L8f:
            if (r1 != 0) goto L95
            r0.add(r10)
            return r0
        L95:
            java.util.Collections.addAll(r0, r1)
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.e.p(java.lang.String):java.util.ArrayList");
    }

    @Override // com.unity3d.scar.adapter.common.f
    public final Object e() {
        return this.f10485e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    @Override // com.unity3d.scar.adapter.common.f
    public final void m(XmlPullParser xmlPullParser) {
        String str;
        int i6;
        p pVar = new p();
        String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
        if (attributeValue != null) {
            if (!attributeValue.equalsIgnoreCase("H264") && !attributeValue.equalsIgnoreCase("X264") && !attributeValue.equalsIgnoreCase("AVC1") && !attributeValue.equalsIgnoreCase("DAVC")) {
                if (attributeValue.equalsIgnoreCase("AAC") || attributeValue.equalsIgnoreCase("AACL") || attributeValue.equalsIgnoreCase("AACH") || attributeValue.equalsIgnoreCase("AACP")) {
                    str = "audio/mp4a-latm";
                } else if (!attributeValue.equalsIgnoreCase("TTML") && !attributeValue.equalsIgnoreCase("DFXP")) {
                    if (!attributeValue.equalsIgnoreCase("ac-3") && !attributeValue.equalsIgnoreCase("dac3")) {
                        if (!attributeValue.equalsIgnoreCase("ec-3") && !attributeValue.equalsIgnoreCase("dec3")) {
                            if (attributeValue.equalsIgnoreCase("dtsc")) {
                                str = "audio/vnd.dts";
                            } else if (!attributeValue.equalsIgnoreCase("dtsh") && !attributeValue.equalsIgnoreCase("dtsl")) {
                                if (attributeValue.equalsIgnoreCase("dtse")) {
                                    str = "audio/vnd.dts.hd;profile=lbr";
                                } else if (attributeValue.equalsIgnoreCase("opus")) {
                                    str = "audio/opus";
                                } else {
                                    str = null;
                                }
                            } else {
                                str = "audio/vnd.dts.hd";
                            }
                        } else {
                            str = "audio/eac3";
                        }
                    } else {
                        str = "audio/ac3";
                    }
                } else {
                    str = "application/ttml+xml";
                }
            } else {
                str = MimeTypes.VIDEO_H264;
            }
            int intValue = ((Integer) f("Type")).intValue();
            if (intValue == 2) {
                ArrayList p10 = p(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                pVar.f11610l = k0.p("video/mp4");
                pVar.f11617t = com.unity3d.scar.adapter.common.f.l(xmlPullParser, "MaxWidth");
                pVar.f11618u = com.unity3d.scar.adapter.common.f.l(xmlPullParser, "MaxHeight");
                pVar.f11614p = p10;
            } else if (intValue == 1) {
                if (str == null) {
                    str = "audio/mp4a-latm";
                }
                int l10 = com.unity3d.scar.adapter.common.f.l(xmlPullParser, "Channels");
                int l11 = com.unity3d.scar.adapter.common.f.l(xmlPullParser, "SamplingRate");
                ArrayList p11 = p(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                boolean isEmpty = p11.isEmpty();
                ArrayList arrayList = p11;
                if (isEmpty) {
                    arrayList = p11;
                    if ("audio/mp4a-latm".equals(str)) {
                        arrayList = Collections.singletonList(y2.a.a(l11, l10));
                    }
                }
                pVar.f11610l = k0.p("audio/mp4");
                pVar.E = l10;
                pVar.F = l11;
                pVar.f11614p = arrayList;
            } else if (intValue == 3) {
                String str2 = (String) f("Subtype");
                if (str2 != null) {
                    if (!str2.equals("CAPT")) {
                        if (str2.equals("DESC")) {
                            i6 = 1024;
                        }
                    } else {
                        i6 = 64;
                    }
                    pVar.f11610l = k0.p("application/mp4");
                    pVar.f11605f = i6;
                }
                i6 = 0;
                pVar.f11610l = k0.p("application/mp4");
                pVar.f11605f = i6;
            } else {
                pVar.f11610l = k0.p("application/mp4");
            }
            pVar.f11600a = xmlPullParser.getAttributeValue(null, "Index");
            pVar.f11601b = (String) f("Name");
            pVar.f11611m = k0.p(str);
            pVar.f11607h = com.unity3d.scar.adapter.common.f.l(xmlPullParser, "Bitrate");
            pVar.f11603d = (String) f("Language");
            this.f10485e = new q(pVar);
            return;
        }
        throw new e3.d("FourCC", 1);
    }
}
