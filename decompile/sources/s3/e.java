package s3;

import android.util.Pair;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import n9.o3;
import r1.j0;
import r1.k0;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f12060a;

    static {
        String str = a0.f12750a;
        f12060a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(u1.t tVar) {
        int i6 = tVar.f12812b;
        tVar.L(4);
        if (tVar.k() != 1751411826) {
            i6 += 4;
        }
        tVar.K(i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:318:0x05a5, code lost:
    
        if (r14 == 2) goto L272;
     */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x083c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0a28  */
    /* JADX WARN: Type inference failed for: r11v36, types: [y2.c, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(u1.t r50, int r51, int r52, int r53, int r54, java.lang.String r55, boolean r56, r1.m r57, s3.c r58, int r59) {
        /*
            Method dump skipped, instructions count: 3250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.e.b(u1.t, int, int, int, int, java.lang.String, boolean, r1.m, s3.c, int):void");
    }

    public static o3 c(int i6, u1.t tVar) {
        tVar.K(i6 + 12);
        tVar.L(1);
        d(tVar);
        tVar.L(2);
        int y9 = tVar.y();
        if ((y9 & 128) != 0) {
            tVar.L(2);
        }
        if ((y9 & 64) != 0) {
            tVar.L(tVar.y());
        }
        if ((y9 & 32) != 0) {
            tVar.L(2);
        }
        tVar.L(1);
        d(tVar);
        String f3 = k0.f(tVar.y());
        if (!"audio/mpeg".equals(f3) && !"audio/vnd.dts".equals(f3) && !"audio/vnd.dts.hd".equals(f3)) {
            tVar.L(4);
            long A = tVar.A();
            long A2 = tVar.A();
            tVar.L(1);
            int d10 = d(tVar);
            long j = A2;
            byte[] bArr = new byte[d10];
            tVar.i(bArr, 0, d10);
            long j10 = -1;
            if (j <= 0) {
                j = -1;
            }
            if (A > 0) {
                j10 = A;
            }
            return new o3(f3, bArr, j, j10);
        }
        return new o3(f3, null, -1L, -1L);
    }

    public static int d(u1.t tVar) {
        int y9 = tVar.y();
        int i6 = y9 & 127;
        while ((y9 & 128) == 128) {
            y9 = tVar.y();
            i6 = (i6 << 7) | (y9 & 127);
        }
        return i6;
    }

    public static int e(int i6) {
        return (i6 >> 24) & 255;
    }

    public static j0 f(v1.c cVar) {
        v1.a aVar;
        v1.d n10 = cVar.n(1751411826);
        v1.d n11 = cVar.n(1801812339);
        v1.d n12 = cVar.n(1768715124);
        if (n10 != null && n11 != null && n12 != null) {
            u1.t tVar = n10.f13192c;
            tVar.K(16);
            if (tVar.k() == 1835299937) {
                u1.t tVar2 = n11.f13192c;
                tVar2.K(12);
                int k8 = tVar2.k();
                String[] strArr = new String[k8];
                for (int i6 = 0; i6 < k8; i6++) {
                    int k9 = tVar2.k();
                    tVar2.L(4);
                    strArr[i6] = tVar2.w(k9 - 8, StandardCharsets.UTF_8);
                }
                u1.t tVar3 = n12.f13192c;
                tVar3.K(8);
                ArrayList arrayList = new ArrayList();
                while (tVar3.a() > 8) {
                    int i10 = tVar3.f12812b;
                    int k10 = tVar3.k();
                    int k11 = tVar3.k() - 1;
                    if (k11 >= 0 && k11 < k8) {
                        String str = strArr[k11];
                        int i11 = i10 + k10;
                        while (true) {
                            int i12 = tVar3.f12812b;
                            if (i12 < i11) {
                                int k12 = tVar3.k();
                                if (tVar3.k() == 1684108385) {
                                    int k13 = tVar3.k();
                                    int k14 = tVar3.k();
                                    int i13 = k12 - 16;
                                    byte[] bArr = new byte[i13];
                                    tVar3.i(bArr, 0, i13);
                                    aVar = new v1.a(str, bArr, k14, k13);
                                    break;
                                }
                                tVar3.K(i12 + k12);
                            } else {
                                aVar = null;
                                break;
                            }
                        }
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    } else {
                        h8.c.p(k11, "Skipped metadata with unknown key index: ", "BoxParsers");
                    }
                    tVar3.K(i10 + k10);
                }
                if (!arrayList.isEmpty()) {
                    return new j0(arrayList);
                }
            }
        }
        return null;
    }

    public static v1.f g(u1.t tVar) {
        long s;
        long s7;
        tVar.K(8);
        if (e(tVar.k()) == 0) {
            s = tVar.A();
            s7 = tVar.A();
        } else {
            s = tVar.s();
            s7 = tVar.s();
        }
        return new v1.f(s, s7, tVar.A());
    }

    public static Pair h(u1.t tVar, int i6, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        r rVar;
        Pair create;
        int i11;
        int i12;
        Integer num2;
        boolean z13;
        int i13 = tVar.f12812b;
        while (i13 - i6 < i10) {
            tVar.K(i13);
            int k8 = tVar.k();
            boolean z14 = false;
            if (k8 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            y2.a.e("childAtomSize must be positive", z10);
            if (tVar.k() == 1936289382) {
                int i14 = i13 + 8;
                int i15 = -1;
                Integer num3 = null;
                String str = null;
                int i16 = 0;
                while (i14 - i13 < k8) {
                    tVar.K(i14);
                    int k9 = tVar.k();
                    int k10 = tVar.k();
                    if (k10 == 1718775137) {
                        num3 = Integer.valueOf(tVar.k());
                    } else if (k10 == 1935894637) {
                        tVar.L(4);
                        str = tVar.w(4, StandardCharsets.UTF_8);
                    } else if (k10 == 1935894633) {
                        i15 = i14;
                        i16 = k9;
                    }
                    i14 += k9;
                }
                byte[] bArr = null;
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num3 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    y2.a.e("frma atom is mandatory", z11);
                    if (i15 != -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    y2.a.e("schi atom is mandatory", z12);
                    int i17 = i15 + 8;
                    while (true) {
                        if (i17 - i15 < i16) {
                            tVar.K(i17);
                            int k11 = tVar.k();
                            if (tVar.k() == 1952804451) {
                                int e10 = e(tVar.k());
                                tVar.L(1);
                                if (e10 == 0) {
                                    tVar.L(1);
                                    i12 = 0;
                                    i11 = 0;
                                } else {
                                    int y9 = tVar.y();
                                    i11 = y9 & 15;
                                    i12 = (y9 & 240) >> 4;
                                }
                                if (tVar.y() == 1) {
                                    num2 = num3;
                                    z13 = true;
                                } else {
                                    num2 = num3;
                                    z13 = false;
                                }
                                int y10 = tVar.y();
                                byte[] bArr2 = new byte[16];
                                tVar.i(bArr2, 0, 16);
                                if (z13 && y10 == 0) {
                                    int y11 = tVar.y();
                                    byte[] bArr3 = new byte[y11];
                                    tVar.i(bArr3, 0, y11);
                                    bArr = bArr3;
                                }
                                num = num2;
                                rVar = new r(z13, str, y10, bArr2, i12, i11, bArr);
                            } else {
                                i17 += k11;
                            }
                        } else {
                            num = num3;
                            rVar = null;
                            break;
                        }
                    }
                    if (rVar != null) {
                        z14 = true;
                    }
                    y2.a.e("tenc atom is mandatory", z14);
                    String str2 = a0.f12750a;
                    create = Pair.create(num, rVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i13 += k8;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0822  */
    /* JADX WARN: Type inference failed for: r13v41, types: [c2.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [s3.c, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static s3.c i(u1.t r67, s3.d r68, java.lang.String r69, r1.m r70, boolean r71) {
        /*
            Method dump skipped, instructions count: 3447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.e.i(u1.t, s3.d, java.lang.String, r1.m, boolean):s3.c");
    }

    /* JADX WARN: Code restructure failed: missing block: B:317:0x00e3, code lost:
    
        if (r23 == 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:221:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0625 A[ADDED_TO_REGION, LOOP:15: B:264:0x0625->B:267:0x062f, LOOP_START, PHI: r26
  0x0625: PHI (r26v3 int) = (r26v2 int), (r26v4 int) binds: [B:263:0x0623, B:267:0x062f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0611 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x097e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06f2  */
    /* JADX WARN: Type inference failed for: r13v3, types: [s3.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.google.android.material.datepicker.o, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList j(v1.c r54, y2.u r55, long r56, r1.m r58, boolean r59, boolean r60, cb.e r61) {
        /*
            Method dump skipped, instructions count: 2440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.e.j(v1.c, y2.u, long, r1.m, boolean, boolean, cb.e):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ba, code lost:
    
        r1.K(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a3, code lost:
    
        r1.K(r9);
        r1.L(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b6, code lost:
    
        r9 = new m3.l(r0, r8, r1.u(r10 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x023d, code lost:
    
        u1.a.f("MetadataUtil", "Skipped unknown metadata entry: " + ca.e.b(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0250, code lost:
    
        r1.K(r15);
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0079, code lost:
    
        r0 = m3.k.a(s3.p.h(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0082, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0084, code lost:
    
        r9 = new m3.o("TCON", r12, db.k0.o(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x008e, code lost:
    
        u1.a.p("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0093, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00a8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0270, code lost:
    
        r1.K(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0273, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c4, code lost:
    
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01cb, code lost:
    
        if (r0 != 6516084) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01cd, code lost:
    
        r9 = s3.p.e(r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d5, code lost:
    
        if (r0 == 7233901) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01da, code lost:
    
        if (r0 != 7631467) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01e1, code lost:
    
        if (r0 == 6516589) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01e6, code lost:
    
        if (r0 != 7828084) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01ed, code lost:
    
        if (r0 != 6578553) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01ef, code lost:
    
        r9 = s3.p.l(r13, "TDRC", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01f9, code lost:
    
        if (r0 != 4280916) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01fb, code lost:
    
        r9 = s3.p.l(r13, "TPE1", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r1.K(r7);
        r7 = r7 + r13;
        r1.L(r0);
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0205, code lost:
    
        if (r0 != 7630703) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0207, code lost:
    
        r9 = s3.p.l(r13, "TSSE", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0211, code lost:
    
        if (r0 != 6384738) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0213, code lost:
    
        r9 = s3.p.l(r13, "TALB", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x021d, code lost:
    
        if (r0 != 7108978) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x021f, code lost:
    
        r9 = s3.p.l(r13, "USLT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0229, code lost:
    
        if (r0 != 6776174) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r13 = r1.f12812b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x022b, code lost:
    
        r9 = s3.p.l(r13, "TCON", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0233, code lost:
    
        if (r0 != 6779504) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0235, code lost:
    
        r9 = s3.p.l(r13, "TIT1", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0255, code lost:
    
        r9 = s3.p.l(r13, "TCOM", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x025d, code lost:
    
        r9 = s3.p.l(r13, "TIT2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x027a, code lost:
    
        if (r6.isEmpty() == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r13 >= r7) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x027e, code lost:
    
        r12 = new r1.j0(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r15 = r1.k() + r13;
        r13 = r1.k();
        r0 = (r13 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r0 == 169) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r0 != 253) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r13 != 1735291493) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        if (r13 != 1684632427) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        r9 = s3.p.g(r13, "TPOS", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        r1.K(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0265, code lost:
    
        if (r9 == null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0267, code lost:
    
        r6.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x026a, code lost:
    
        r3 = false;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        if (r13 != 1953655662) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
    
        r9 = s3.p.g(r13, "TRCK", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (r13 != 1953329263) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        r9 = s3.p.i(r13, "TBPM", r1, true, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (r13 != 1668311404) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        r9 = s3.p.i(r13, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        if (r13 != 1668249202) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        r9 = s3.p.f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
    
        if (r13 != 1631670868) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
    
        r9 = s3.p.l(r13, "TPE2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e8, code lost:
    
        if (r13 != 1936682605) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ea, code lost:
    
        r9 = s3.p.l(r13, "TSOT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
    
        if (r13 != 1936679276) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
    
        r9 = s3.p.l(r13, "TSOA", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0100, code lost:
    
        if (r13 != 1936679282) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0102, code lost:
    
        r9 = s3.p.l(r13, "TSOP", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010c, code lost:
    
        if (r13 != 1936679265) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010e, code lost:
    
        r9 = s3.p.l(r13, "TSO2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
    
        if (r13 != 1936679791) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011b, code lost:
    
        r9 = s3.p.l(r13, "TSOC", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0126, code lost:
    
        if (r13 != 1920233063) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0128, code lost:
    
        r9 = s3.p.i(r13, "ITUNESADVISORY", r1, r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0133, code lost:
    
        if (r13 != 1885823344) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0135, code lost:
    
        r9 = s3.p.i(r13, "ITUNESGAPLESS", r1, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0140, code lost:
    
        if (r13 != 1936683886) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0142, code lost:
    
        r9 = s3.p.l(r13, "TVSHOWSORT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014d, code lost:
    
        if (r13 != 1953919848) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014f, code lost:
    
        r9 = s3.p.l(r13, "TVSHOW", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015a, code lost:
    
        if (r13 != 757935405) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015c, code lost:
    
        r0 = r12;
        r8 = r0;
        r9 = -1;
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0160, code lost:
    
        r13 = r1.f12812b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0162, code lost:
    
        if (r13 >= r15) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0164, code lost:
    
        r14 = r1.k();
        r12 = r1.k();
        r1.L(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0175, code lost:
    
        if (r12 != 1835360622) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0177, code lost:
    
        r0 = r1.u(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0181, code lost:
    
        if (r12 != 1851878757) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0183, code lost:
    
        r8 = r1.u(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018d, code lost:
    
        if (r12 != 1684108385) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018f, code lost:
    
        r9 = r13;
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0191, code lost:
    
        r1.L(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019b, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019d, code lost:
    
        if (r8 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a0, code lost:
    
        if (r9 != (-1)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b9, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0328  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static r1.j0 k(v1.d r17) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.e.k(v1.d):r1.j0");
    }
}
