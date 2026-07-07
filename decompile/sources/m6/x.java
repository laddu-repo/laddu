package m6;

import android.graphics.ImageDecoder;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f8692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f8693b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f8694c;

    public x(kotlin.jvm.internal.w wVar, z zVar, kotlin.jvm.internal.s sVar) {
        this.f8692a = wVar;
        this.f8693b = zVar;
        this.f8694c = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHeaderDecoded(android.graphics.ImageDecoder r8, android.graphics.ImageDecoder.ImageInfo r9, android.graphics.ImageDecoder.Source r10) {
        /*
            r7 = this;
            kotlin.jvm.internal.w r10 = r7.f8692a
            r10.f8055x = r8
            android.util.Size r9 = m6.u.m(r9)
            int r10 = r9.getWidth()
            int r9 = r9.getHeight()
            m6.z r0 = r7.f8693b
            v6.o r0 = r0.f8699b
            w6.h r1 = r0.f13410d
            w6.g r0 = r0.f13411e
            w6.h r2 = w6.h.f14134c
            boolean r3 = kotlin.jvm.internal.k.a(r1, r2)
            if (r3 == 0) goto L22
            r0 = r10
            goto L28
        L22:
            e9.f r1 = r1.f14135a
            int r0 = a8.e.C(r1, r0)
        L28:
            m6.z r1 = r7.f8693b
            v6.o r1 = r1.f8699b
            w6.h r3 = r1.f13410d
            w6.g r1 = r1.f13411e
            boolean r2 = kotlin.jvm.internal.k.a(r3, r2)
            if (r2 == 0) goto L38
            r1 = r9
            goto L3e
        L38:
            e9.f r2 = r3.f14136b
            int r1 = a8.e.C(r2, r1)
        L3e:
            r2 = 1
            if (r10 <= 0) goto L79
            if (r9 <= 0) goto L79
            if (r10 != r0) goto L47
            if (r9 == r1) goto L79
        L47:
            m6.z r3 = r7.f8693b
            v6.o r3 = r3.f8699b
            w6.g r3 = r3.f13411e
            double r0 = a8.a.f(r10, r9, r0, r1, r3)
            kotlin.jvm.internal.s r3 = r7.f8694c
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L5b
            r4 = 1
            goto L5c
        L5b:
            r4 = 0
        L5c:
            r3.f8051x = r4
            if (r4 != 0) goto L68
            m6.z r3 = r7.f8693b
            v6.o r3 = r3.f8699b
            boolean r3 = r3.f13412f
            if (r3 != 0) goto L79
        L68:
            double r3 = (double) r10
            double r3 = r3 * r0
            int r10 = a8.b.k(r3)
            double r3 = (double) r9
            double r0 = r0 * r3
            int r9 = a8.b.k(r0)
            m6.u.t(r8, r10, r9)
        L79:
            m6.z r9 = r7.f8693b
            v6.o r9 = r9.f8699b
            android.graphics.Bitmap$Config r10 = r9.f13408b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L8d
            android.graphics.Bitmap$Config r0 = m6.b.g()
            if (r10 != r0) goto L8d
            r10 = 3
            goto L8e
        L8d:
            r10 = 1
        L8e:
            a9.c.p(r8, r10)
            boolean r10 = r9.f13413g
            r10 = r10 ^ r2
            a9.c.B(r8, r10)
            android.graphics.ColorSpace r10 = r9.f13409c
            if (r10 == 0) goto L9e
            a9.c.q(r8, r10)
        L9e:
            boolean r10 = r9.f13414h
            r10 = r10 ^ r2
            a9.c.r(r8, r10)
            v6.q r9 = r9.f13417l
            java.lang.String r10 = "coil#animated_transformation"
            java.util.Map r9 = r9.f13423x
            java.lang.Object r9 = r9.get(r10)
            if (r9 != 0) goto Lb4
            a9.c.o(r8)
            return
        Lb4:
            java.lang.ClassCastException r8 = new java.lang.ClassCastException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.x.onHeaderDecoded(android.graphics.ImageDecoder, android.graphics.ImageDecoder$ImageInfo, android.graphics.ImageDecoder$Source):void");
    }
}
