package xf;

import wf.a1;
import wf.b1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r implements sf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r f14745a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f14746b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xf.r] */
    static {
        uf.e eVar = uf.e.f13123n;
        if (!df.m.S("kotlinx.serialization.json.JsonLiteral")) {
            Object it = ((je.h) b1.f14299a.values()).iterator();
            while (((f1.c) it).hasNext()) {
                sf.a aVar = (sf.a) ((je.d) it).next();
                if ("kotlinx.serialization.json.JsonLiteral".equals(aVar.d().a())) {
                    throw new IllegalArgumentException(df.n.s("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + kotlin.jvm.internal.x.a(aVar.getClass()).c() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                }
            }
            f14746b = new a1("kotlinx.serialization.json.JsonLiteral", eVar);
            return;
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    @Override // sf.a
    public final Object a(vf.b bVar) {
        k X = a8.c.b(bVar).X();
        if (X instanceof q) {
            return (q) X;
        }
        throw yf.n.b(-1, "Unexpected JSON element, expected JsonLiteral, had " + kotlin.jvm.internal.x.a(X.getClass()), X.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    @Override // sf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(yf.t r4, java.lang.Object r5) {
        /*
            r3 = this;
            xf.q r5 = (xf.q) r5
            java.lang.String r0 = "value"
            kotlin.jvm.internal.k.e(r5, r0)
            java.lang.String r0 = r5.f14744y
            a8.c.a(r4)
            boolean r5 = r5.f14743x
            if (r5 == 0) goto L14
            r4.s(r0)
            return
        L14:
            java.lang.Long r5 = df.t.x(r0)
            if (r5 == 0) goto L22
            long r0 = r5.longValue()
            r4.m(r0)
            return
        L22:
            he.t r5 = a8.c.s(r0)
            if (r5 == 0) goto L34
            long r0 = r5.f6096x
            wf.a0 r5 = wf.r1.f14385b
            yf.t r4 = r4.i(r5)
            r4.m(r0)
            return
        L34:
            r5 = 0
            boolean r1 = df.s.u(r0)     // Catch: java.lang.NumberFormatException -> L44
            if (r1 == 0) goto L45
            double r1 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> L44
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L44
            goto L46
        L44:
        L45:
            r1 = r5
        L46:
            if (r1 == 0) goto L50
            double r0 = r1.doubleValue()
            r4.f(r0)
            goto L72
        L50:
            java.lang.String r1 = "true"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5b
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L65
        L5b:
            java.lang.String r1 = "false"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L65
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L65:
            if (r5 == 0) goto L6f
            boolean r5 = r5.booleanValue()
            r4.b(r5)
            goto L72
        L6f:
            r4.s(r0)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xf.r.c(yf.t, java.lang.Object):void");
    }

    @Override // sf.a
    public final uf.g d() {
        return f14746b;
    }
}
