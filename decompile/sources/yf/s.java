package yf;

import j2.y;
import java.util.ArrayList;
import o5.e0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s extends a8.f implements vf.b, vf.a {

    /* renamed from: c, reason: collision with root package name */
    public final xf.c f15088c;

    /* renamed from: d, reason: collision with root package name */
    public final x f15089d;

    /* renamed from: e, reason: collision with root package name */
    public final y2.j f15090e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f15091f;

    /* renamed from: g, reason: collision with root package name */
    public int f15092g;

    /* renamed from: h, reason: collision with root package name */
    public final xf.i f15093h;

    public s(xf.c json, x xVar, y2.j jVar, uf.g descriptor) {
        kotlin.jvm.internal.k.e(json, "json");
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        this.f15088c = json;
        this.f15089d = xVar;
        this.f15090e = jVar;
        this.f15091f = json.f14727b;
        this.f15092g = -1;
        this.f15093h = json.f14726a;
    }

    @Override // a8.f, vf.b
    public final short A() {
        y2.j jVar = this.f15090e;
        long i6 = jVar.i();
        short s = (short) i6;
        if (i6 == s) {
            return s;
        }
        y2.j.q(jVar, "Failed to parse short for input '" + i6 + '\'', 0, null, 6);
        throw null;
    }

    @Override // a8.f, vf.b
    public final float B() {
        y2.j jVar = this.f15090e;
        String l10 = jVar.l();
        try {
            float parseFloat = Float.parseFloat(l10);
            xf.i iVar = this.f15088c.f14726a;
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            n.m(jVar, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            y2.j.q(jVar, w8.k.b('\'', "Failed to parse type 'float' for input '", l10), 0, null, 6);
            throw null;
        }
    }

    @Override // a8.f, vf.b
    public final double C() {
        y2.j jVar = this.f15090e;
        String l10 = jVar.l();
        try {
            double parseDouble = Double.parseDouble(l10);
            xf.i iVar = this.f15088c.f14726a;
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            n.m(jVar, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            y2.j.q(jVar, w8.k.b('\'', "Failed to parse type 'double' for input '", l10), 0, null, 6);
            throw null;
        }
    }

    public final xf.k X() {
        return new y(this.f15088c.f14726a, this.f15090e).p();
    }

    @Override // vf.a
    public final int b(uf.g descriptor) {
        boolean z10;
        boolean z11;
        String x10;
        boolean z12;
        y2.j jVar = this.f15090e;
        b2.k kVar = (b2.k) jVar.f14914c;
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        x xVar = this.f15089d;
        int ordinal = xVar.ordinal();
        char c10 = ':';
        boolean z13 = false;
        xf.c cVar = this.f15088c;
        boolean z14 = true;
        int i6 = -1;
        if (ordinal != 0) {
            if (ordinal != 2) {
                boolean D = jVar.D();
                if (jVar.c()) {
                    int i10 = this.f15092g;
                    if (i10 != -1 && !D) {
                        y2.j.q(jVar, "Expected end of the array or comma", 0, null, 6);
                        throw null;
                    }
                    i6 = i10 + 1;
                    this.f15092g = i6;
                } else if (D) {
                    xf.i iVar = cVar.f14726a;
                    n.i(jVar, "array");
                    throw null;
                }
            } else {
                int i11 = this.f15092g;
                if (i11 % 2 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (i11 != -1) {
                        z13 = jVar.D();
                    }
                } else {
                    jVar.h(':');
                }
                if (jVar.c()) {
                    if (z12) {
                        if (this.f15092g == -1) {
                            int i12 = jVar.f14913b;
                            if (z13) {
                                y2.j.q(jVar, "Unexpected leading comma", i12, null, 4);
                                throw null;
                            }
                        } else {
                            int i13 = jVar.f14913b;
                            if (!z13) {
                                y2.j.q(jVar, "Expected comma after the key-value pair", i13, null, 4);
                                throw null;
                            }
                        }
                    }
                    i6 = this.f15092g + 1;
                    this.f15092g = i6;
                } else if (z13) {
                    xf.i iVar2 = cVar.f14726a;
                    n.i(jVar, "object");
                    throw null;
                }
            }
        } else {
            boolean D2 = jVar.D();
            while (jVar.c()) {
                String e10 = jVar.e();
                jVar.h(c10);
                int g10 = n.g(descriptor, cVar, e10);
                if (g10 != -3) {
                    if (this.f15093h.f14737c) {
                        boolean i14 = descriptor.i(g10);
                        uf.g h4 = descriptor.h(g10);
                        if (!i14 || h4.c() || !jVar.E(z14)) {
                            if (kotlin.jvm.internal.k.a(h4.getKind(), uf.i.f13135g) && ((!h4.c() || !jVar.E(false)) && (x10 = jVar.x()) != null && n.g(h4, cVar, x10) == -3 && i14)) {
                                jVar.j();
                            }
                        }
                        z10 = jVar.D();
                        z11 = false;
                    }
                    i6 = g10;
                    break;
                }
                z10 = false;
                z11 = true;
                if (z11) {
                    if (!n.h(descriptor, cVar)) {
                        int i15 = kVar.f1383y;
                        int[] iArr = (int[]) kVar.A;
                        if (iArr[i15] == -2) {
                            iArr[i15] = -1;
                            kVar.f1383y = i15 - 1;
                        }
                        int i16 = kVar.f1383y;
                        if (i16 != -1) {
                            kVar.f1383y = i16 - 1;
                        }
                        int T = df.m.T(6, jVar.C(0, jVar.f14913b), e10);
                        throw new l("Encountered an unknown key '" + e10 + "' at offset " + T + " at path: " + kVar.k() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) n.j(jVar.s(), T)), 0);
                    }
                    ArrayList arrayList = new ArrayList();
                    byte w10 = jVar.w();
                    byte b10 = 6;
                    if (w10 == 8 || w10 == 6) {
                        while (true) {
                            byte w11 = jVar.w();
                            z14 = true;
                            if (w11 == 1) {
                                jVar.e();
                            } else {
                                if (w11 != 8 && w11 != b10) {
                                    if (w11 == 9) {
                                        if (((Number) ie.j.M(arrayList)).byteValue() == 8) {
                                            ie.p.B(arrayList);
                                        } else {
                                            throw n.b(jVar.f14913b, "found ] instead of } at path: " + kVar, jVar.s());
                                        }
                                    } else if (w11 == 7) {
                                        if (((Number) ie.j.M(arrayList)).byteValue() == 6) {
                                            ie.p.B(arrayList);
                                        } else {
                                            throw n.b(jVar.f14913b, "found } instead of ] at path: " + kVar, jVar.s());
                                        }
                                    } else if (w11 == 10) {
                                        y2.j.q(jVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    b10 = 6;
                                } else {
                                    arrayList.add(Byte.valueOf(w11));
                                }
                                jVar.f();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                            }
                        }
                    } else {
                        jVar.l();
                        z14 = true;
                    }
                    D2 = jVar.D();
                    c10 = ':';
                } else {
                    D2 = z10;
                    c10 = ':';
                    z14 = true;
                }
            }
            if (D2) {
                xf.i iVar3 = cVar.f14726a;
                n.i(jVar, "object");
                throw null;
            }
        }
        if (xVar != x.B) {
            ((int[]) kVar.A)[kVar.f1383y] = i6;
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    @Override // a8.f, vf.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(sf.a r10) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.s.c(sf.a):java.lang.Object");
    }

    @Override // a8.f, vf.b
    public final boolean d() {
        boolean z10;
        boolean z11;
        y2.j jVar = this.f15090e;
        int B = jVar.B();
        if (B != jVar.s().length()) {
            if (jVar.s().charAt(B) == '\"') {
                B++;
                z10 = true;
            } else {
                z10 = false;
            }
            int y9 = jVar.y(B);
            if (y9 < jVar.s().length() && y9 != -1) {
                int i6 = y9 + 1;
                int charAt = jVar.s().charAt(y9) | ' ';
                if (charAt != 102) {
                    if (charAt == 116) {
                        jVar.d(i6, "rue");
                        z11 = true;
                    } else {
                        y2.j.q(jVar, "Expected valid boolean literal prefix, but had '" + jVar.l() + '\'', 0, null, 6);
                        throw null;
                    }
                } else {
                    jVar.d(i6, "alse");
                    z11 = false;
                }
                if (z10) {
                    if (jVar.f14913b != jVar.s().length()) {
                        if (jVar.s().charAt(jVar.f14913b) == '\"') {
                            jVar.f14913b++;
                            return z11;
                        }
                        y2.j.q(jVar, "Expected closing quotation mark", 0, null, 6);
                        throw null;
                    }
                    y2.j.q(jVar, "EOF", 0, null, 6);
                    throw null;
                }
                return z11;
            }
            y2.j.q(jVar, "EOF", 0, null, 6);
            throw null;
        }
        y2.j.q(jVar, "EOF", 0, null, 6);
        throw null;
    }

    @Override // a8.f, vf.b
    public final vf.b e(uf.g descriptor) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        if (u.a(descriptor)) {
            return new k(this.f15090e, this.f15088c);
        }
        return this;
    }

    @Override // a8.f, vf.a
    public final Object f(uf.g descriptor, int i6, sf.a deserializer, Object obj) {
        boolean z10;
        b2.k kVar = (b2.k) this.f15090e.f14914c;
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        kotlin.jvm.internal.k.e(deserializer, "deserializer");
        if (this.f15089d == x.B && (i6 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int[] iArr = (int[]) kVar.A;
            int i10 = kVar.f1383y;
            if (iArr[i10] == -2) {
                ((Object[]) kVar.f1384z)[i10] = o.f15078a;
            }
        }
        Object f3 = super.f(descriptor, i6, deserializer, obj);
        if (z10) {
            int[] iArr2 = (int[]) kVar.A;
            int i11 = kVar.f1383y;
            if (iArr2[i11] != -2) {
                int i12 = i11 + 1;
                kVar.f1383y = i12;
                if (i12 == ((Object[]) kVar.f1384z).length) {
                    kVar.y();
                }
            }
            Object[] objArr = (Object[]) kVar.f1384z;
            int i13 = kVar.f1383y;
            objArr[i13] = f3;
            ((int[]) kVar.A)[i13] = -2;
        }
        return f3;
    }

    @Override // a8.f, vf.b
    public final char g() {
        y2.j jVar = this.f15090e;
        String l10 = jVar.l();
        if (l10.length() == 1) {
            return l10.charAt(0);
        }
        y2.j.q(jVar, w8.k.b('\'', "Expected single char, but got '", l10), 0, null, 6);
        throw null;
    }

    @Override // a8.f, vf.b
    public final vf.a h(uf.g descriptor) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        xf.c cVar = this.f15088c;
        x l10 = n.l(descriptor, cVar);
        y2.j jVar = this.f15090e;
        b2.k kVar = (b2.k) jVar.f14914c;
        int i6 = kVar.f1383y + 1;
        kVar.f1383y = i6;
        if (i6 == ((Object[]) kVar.f1384z).length) {
            kVar.y();
        }
        ((Object[]) kVar.f1384z)[i6] = descriptor;
        jVar.h(l10.f15108x);
        if (jVar.w() != 4) {
            int ordinal = l10.ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (this.f15089d == l10) {
                    return this;
                }
                return new s(cVar, l10, jVar, descriptor);
            }
            return new s(cVar, l10, jVar, descriptor);
        }
        y2.j.q(jVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (yf.n.h(r6, r2) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (b(r6) != (-1)) goto L20;
     */
    @Override // a8.f, vf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(uf.g r6) {
        /*
            r5 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.k.e(r6, r0)
            int r0 = r6.e()
            r1 = -1
            xf.c r2 = r5.f15088c
            if (r0 != 0) goto L1a
            boolean r0 = yf.n.h(r6, r2)
            if (r0 == 0) goto L1a
        L14:
            int r0 = r5.b(r6)
            if (r0 != r1) goto L14
        L1a:
            y2.j r6 = r5.f15090e
            boolean r0 = r6.D()
            if (r0 != 0) goto L45
            yf.x r0 = r5.f15089d
            char r0 = r0.f15109y
            r6.h(r0)
            java.lang.Object r6 = r6.f14914c
            b2.k r6 = (b2.k) r6
            int r0 = r6.f1383y
            java.lang.Object r2 = r6.A
            int[] r2 = (int[]) r2
            r3 = r2[r0]
            r4 = -2
            if (r3 != r4) goto L3d
            r2[r0] = r1
            int r0 = r0 + r1
            r6.f1383y = r0
        L3d:
            int r0 = r6.f1383y
            if (r0 == r1) goto L44
            int r0 = r0 + r1
            r6.f1383y = r0
        L44:
            return
        L45:
            xf.i r0 = r2.f14726a
            java.lang.String r0 = ""
            yf.n.i(r6, r0)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.s.j(uf.g):void");
    }

    @Override // a8.f, vf.b
    public final int k(uf.g enumDescriptor) {
        kotlin.jvm.internal.k.e(enumDescriptor, "enumDescriptor");
        y2.j jVar = this.f15090e;
        String name = jVar.j();
        String suffix = " at path " + ((b2.k) jVar.f14914c).k();
        kotlin.jvm.internal.k.e(enumDescriptor, "<this>");
        xf.c json = this.f15088c;
        kotlin.jvm.internal.k.e(json, "json");
        kotlin.jvm.internal.k.e(name, "name");
        kotlin.jvm.internal.k.e(suffix, "suffix");
        int g10 = n.g(enumDescriptor, json, name);
        if (g10 != -3) {
            return g10;
        }
        throw new IllegalArgumentException(enumDescriptor.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    @Override // a8.f, vf.b
    public final int l() {
        y2.j jVar = this.f15090e;
        long i6 = jVar.i();
        int i10 = (int) i6;
        if (i6 == i10) {
            return i10;
        }
        y2.j.q(jVar, "Failed to parse int for input '" + i6 + '\'', 0, null, 6);
        throw null;
    }

    @Override // vf.a
    public final e0 o() {
        return this.f15091f;
    }

    @Override // a8.f, vf.b
    public final String q() {
        return this.f15090e.j();
    }

    @Override // a8.f, vf.b
    public final long u() {
        return this.f15090e.i();
    }

    @Override // a8.f, vf.b
    public final boolean v() {
        if (!this.f15090e.E(true)) {
            return true;
        }
        return false;
    }

    @Override // a8.f, vf.b
    public final byte z() {
        y2.j jVar = this.f15090e;
        long i6 = jVar.i();
        byte b10 = (byte) i6;
        if (i6 == b10) {
            return b10;
        }
        y2.j.q(jVar, "Failed to parse byte for input '" + i6 + '\'', 0, null, 6);
        throw null;
    }
}
