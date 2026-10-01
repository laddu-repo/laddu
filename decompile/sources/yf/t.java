package yf;

import com.google.android.gms.internal.measurement.p4;
import j2.y;
import o5.e0;
import wf.y0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final p4 f15094a;

    /* renamed from: b, reason: collision with root package name */
    public final xf.c f15095b;

    /* renamed from: c, reason: collision with root package name */
    public final x f15096c;

    /* renamed from: d, reason: collision with root package name */
    public final t[] f15097d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f15098e;

    /* renamed from: f, reason: collision with root package name */
    public final xf.i f15099f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15100g;

    /* renamed from: h, reason: collision with root package name */
    public String f15101h;

    /* renamed from: i, reason: collision with root package name */
    public String f15102i;

    public t(p4 composer, xf.c cVar, x xVar, t[] tVarArr) {
        kotlin.jvm.internal.k.e(composer, "composer");
        this.f15094a = composer;
        this.f15095b = cVar;
        this.f15096c = xVar;
        this.f15097d = tVarArr;
        this.f15098e = cVar.f14727b;
        this.f15099f = cVar.f14726a;
        int ordinal = xVar.ordinal();
        if (tVarArr != null) {
            t tVar = tVarArr[ordinal];
            if (tVar != null || tVar != this) {
                tVarArr[ordinal] = this;
            }
        }
    }

    public final t a(uf.g descriptor) {
        t tVar;
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        xf.c cVar = this.f15095b;
        x l10 = n.l(descriptor, cVar);
        char c10 = l10.f15108x;
        p4 p4Var = this.f15094a;
        p4Var.h(c10);
        p4Var.f2388a = true;
        String str = this.f15101h;
        if (str != null) {
            String str2 = this.f15102i;
            if (str2 == null) {
                str2 = descriptor.a();
            }
            p4Var.f();
            s(str);
            p4Var.h(':');
            s(str2);
            this.f15101h = null;
            this.f15102i = null;
        }
        if (this.f15096c == l10) {
            return this;
        }
        t[] tVarArr = this.f15097d;
        if (tVarArr != null && (tVar = tVarArr[l10.ordinal()]) != null) {
            return tVar;
        }
        return new t(p4Var, cVar, l10, tVarArr);
    }

    public final void b(boolean z10) {
        if (this.f15100g) {
            s(String.valueOf(z10));
        } else {
            ((y) this.f15094a.f2389b).w(String.valueOf(z10));
        }
    }

    public final void c(uf.g descriptor, int i6, boolean z10) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        g(descriptor, i6);
        b(z10);
    }

    public final void d(byte b10) {
        if (this.f15100g) {
            s(String.valueOf((int) b10));
        } else {
            this.f15094a.g(b10);
        }
    }

    public final void e(char c10) {
        s(String.valueOf(c10));
    }

    public final void f(double d10) {
        boolean z10 = this.f15100g;
        p4 p4Var = this.f15094a;
        if (z10) {
            s(String.valueOf(d10));
        } else {
            ((y) p4Var.f2389b).w(String.valueOf(d10));
        }
        if (Math.abs(d10) <= Double.MAX_VALUE) {
        } else {
            throw n.a(Double.valueOf(d10), ((y) p4Var.f2389b).toString());
        }
    }

    public final void g(uf.g descriptor, int i6) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        int ordinal = this.f15096c.ordinal();
        p4 p4Var = this.f15094a;
        boolean z10 = true;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (!p4Var.f2388a) {
                        p4Var.h(',');
                    }
                    p4Var.f();
                    n.k(descriptor, this.f15095b);
                    s(descriptor.f(i6));
                    p4Var.h(':');
                    p4Var.n();
                    return;
                }
                if (i6 == 0) {
                    this.f15100g = true;
                }
                if (i6 == 1) {
                    p4Var.h(',');
                    p4Var.n();
                    this.f15100g = false;
                    return;
                }
                return;
            }
            if (!p4Var.f2388a) {
                if (i6 % 2 == 0) {
                    p4Var.h(',');
                    p4Var.f();
                } else {
                    p4Var.h(':');
                    p4Var.n();
                    z10 = false;
                }
                this.f15100g = z10;
                return;
            }
            this.f15100g = true;
            p4Var.f();
            return;
        }
        if (!p4Var.f2388a) {
            p4Var.h(',');
        }
        p4Var.f();
    }

    public final void h(float f3) {
        boolean z10 = this.f15100g;
        p4 p4Var = this.f15094a;
        if (z10) {
            s(String.valueOf(f3));
        } else {
            ((y) p4Var.f2389b).w(String.valueOf(f3));
        }
        if (Math.abs(f3) <= Float.MAX_VALUE) {
        } else {
            throw n.a(Float.valueOf(f3), ((y) p4Var.f2389b).toString());
        }
    }

    public final t i(uf.g descriptor) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        boolean a10 = u.a(descriptor);
        x xVar = this.f15096c;
        xf.c cVar = this.f15095b;
        p4 p4Var = this.f15094a;
        if (a10) {
            if (!(p4Var instanceof j)) {
                p4Var = new j((y) p4Var.f2389b, this.f15100g);
            }
            return new t(p4Var, cVar, xVar, null);
        }
        if (descriptor.isInline() && descriptor.equals(xf.l.f14739a)) {
            if (!(p4Var instanceof i)) {
                p4Var = new i((y) p4Var.f2389b, this.f15100g);
            }
            return new t(p4Var, cVar, xVar, null);
        }
        if (this.f15101h != null) {
            this.f15102i = descriptor.a();
        }
        return this;
    }

    public final t j(y0 descriptor, int i6) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        g(descriptor, i6);
        return i(descriptor.h(i6));
    }

    public final void k(int i6) {
        if (this.f15100g) {
            s(String.valueOf(i6));
        } else {
            this.f15094a.i(i6);
        }
    }

    public final void l(int i6, int i10, uf.g descriptor) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        g(descriptor, i6);
        k(i10);
    }

    public final void m(long j) {
        if (this.f15100g) {
            s(String.valueOf(j));
        } else {
            this.f15094a.j(j);
        }
    }

    public final void n() {
        this.f15094a.k("null");
    }

    public final void o(uf.g descriptor, int i6, sf.a serializer, Object obj) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        kotlin.jvm.internal.k.e(serializer, "serializer");
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        kotlin.jvm.internal.k.e(serializer, "serializer");
        g(descriptor, i6);
        if (serializer.d().c()) {
            q(serializer, obj);
        } else if (obj == null) {
            n();
        } else {
            q(serializer, obj);
        }
    }

    public final void p(uf.g descriptor, int i6, sf.a serializer, Object obj) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        kotlin.jvm.internal.k.e(serializer, "serializer");
        g(descriptor, i6);
        q(serializer, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x003e, code lost:
    
        if (kotlin.jvm.internal.k.a(r1, uf.j.f13139i) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1 != xf.a.f14720x) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(sf.a r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.k.e(r6, r0)
            xf.c r0 = r5.f15095b
            xf.i r1 = r0.f14726a
            xf.a r1 = r1.f14738d
            boolean r2 = r6 instanceof sf.d
            r3 = 0
            if (r2 == 0) goto L15
            xf.a r4 = xf.a.f14720x
            if (r1 == r4) goto L49
            goto L40
        L15:
            int r1 = r1.ordinal()
            if (r1 == 0) goto L49
            r4 = 1
            if (r1 == r4) goto L28
            r0 = 2
            if (r1 != r0) goto L22
            goto L49
        L22:
            a2.x0 r6 = new a2.x0
            r6.<init>()
            throw r6
        L28:
            uf.g r1 = r6.d()
            a8.a r1 = r1.getKind()
            uf.j r4 = uf.j.f13136f
            boolean r4 = kotlin.jvm.internal.k.a(r1, r4)
            if (r4 != 0) goto L40
            uf.j r4 = uf.j.f13139i
            boolean r1 = kotlin.jvm.internal.k.a(r1, r4)
            if (r1 == 0) goto L49
        L40:
            uf.g r1 = r6.d()
            java.lang.String r0 = yf.n.e(r1, r0)
            goto L4a
        L49:
            r0 = r3
        L4a:
            if (r2 == 0) goto L75
            sf.d r6 = (sf.d) r6
            if (r7 != 0) goto L71
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Value for serializer "
            r7.<init>(r0)
            uf.g r6 = r6.d()
            r7.append(r6)
            java.lang.String r6 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L71:
            cf.m.k(r6, r5, r7)
            throw r3
        L75:
            if (r0 == 0) goto L83
            uf.g r1 = r6.d()
            java.lang.String r1 = r1.a()
            r5.f15101h = r0
            r5.f15102i = r1
        L83:
            r6.c(r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.t.q(sf.a, java.lang.Object):void");
    }

    public final void r(short s) {
        if (this.f15100g) {
            s(String.valueOf((int) s));
        } else {
            this.f15094a.l(s);
        }
    }

    public final void s(String value) {
        kotlin.jvm.internal.k.e(value, "value");
        this.f15094a.m(value);
    }

    public final void t(uf.g descriptor, int i6, String value) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        kotlin.jvm.internal.k.e(value, "value");
        g(descriptor, i6);
        s(value);
    }

    public final void u(uf.g descriptor) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        p4 p4Var = this.f15094a;
        p4Var.getClass();
        p4Var.f2388a = false;
        p4Var.h(this.f15096c.f15109y);
    }

    public final boolean v(uf.g descriptor) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        return this.f15099f.f14735a;
    }
}
