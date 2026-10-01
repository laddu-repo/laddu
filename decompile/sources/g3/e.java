package g3;

import db.c1;
import db.h0;
import db.k0;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f5418a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f5419b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f5420c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r6 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static d2.i a(java.lang.String r20) {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r20
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = u1.c.m(r0, r1)
            r3 = 0
            if (r2 == 0) goto Lcf
            db.i0 r2 = db.k0.f4008y
            db.c1 r2 = db.c1.B
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = u1.c.m(r0, r8)
            r9 = 1
            if (r8 == 0) goto L9b
            r2 = 0
            r6 = 0
        L36:
            r7 = 4
            if (r6 >= r7) goto Lc8
            java.lang.String[] r8 = g3.e.f5418a
            r8 = r8[r6]
            java.lang.String r8 = u1.c.k(r0, r8)
            if (r8 == 0) goto L98
            int r6 = java.lang.Integer.parseInt(r8)
            if (r6 != r9) goto Lc8
            r6 = 0
        L4a:
            if (r6 >= r7) goto L60
            java.lang.String[] r8 = g3.e.f5419b
            r8 = r8[r6]
            java.lang.String r8 = u1.c.k(r0, r8)
            if (r8 == 0) goto L62
            long r6 = java.lang.Long.parseLong(r8)
            r10 = -1
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 != 0) goto L65
        L60:
            r6 = r4
            goto L65
        L62:
            int r6 = r6 + 1
            goto L4a
        L65:
            r8 = 2
            if (r2 >= r8) goto L93
            java.lang.String[] r8 = g3.e.f5420c
            r8 = r8[r2]
            java.lang.String r8 = u1.c.k(r0, r8)
            if (r8 == 0) goto L90
            long r12 = java.lang.Long.parseLong(r8)
            g3.c r14 = new g3.c
            r16 = 0
            r18 = 0
            java.lang.String r15 = "image/jpeg"
            r14.<init>(r15, r16, r18)
            r2 = r14
            g3.c r10 = new g3.c
            java.lang.String r11 = "video/mp4"
            r14 = 0
            r10.<init>(r11, r12, r14)
            db.c1 r2 = db.k0.p(r2, r10)
            goto Lbc
        L90:
            int r2 = r2 + 1
            goto L65
        L93:
            db.i0 r2 = db.k0.f4008y
            db.c1 r2 = db.c1.B
            goto Lbc
        L98:
            int r6 = r6 + 1
            goto L36
        L9b:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = u1.c.m(r0, r8)
            if (r8 == 0) goto Lac
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            db.c1 r2 = b(r0, r2, r8)
            goto Lbc
        Lac:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = u1.c.m(r0, r8)
            if (r8 == 0) goto Lbc
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            db.c1 r2 = b(r0, r2, r8)
        Lbc:
            boolean r8 = u1.c.l(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc9
        Lc8:
            return r3
        Lc9:
            d2.i r0 = new d2.i
            r0.<init>(r6, r2, r9)
            return r0
        Lcf:
            java.lang.String r0 = "Couldn't find xmp metadata"
            r1.l0 r0 = r1.l0.a(r3, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.e.a(java.lang.String):d2.i");
    }

    public static c1 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        h0 j10 = k0.j();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (u1.c.m(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String k8 = u1.c.k(xmlPullParser, concat3);
                String k9 = u1.c.k(xmlPullParser, concat4);
                String k10 = u1.c.k(xmlPullParser, concat5);
                String k11 = u1.c.k(xmlPullParser, concat6);
                if (k8 != null && k9 != null) {
                    long j11 = 0;
                    if (k10 != null) {
                        j = Long.parseLong(k10);
                    } else {
                        j = 0;
                    }
                    if (k11 != null) {
                        j11 = Long.parseLong(k11);
                    }
                    j10.a(new c(k8, j, j11));
                } else {
                    return c1.B;
                }
            }
        } while (!u1.c.l(xmlPullParser, concat2));
        return j10.g();
    }
}
