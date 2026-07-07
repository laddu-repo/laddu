package s3;

import android.util.Pair;
import android.util.SparseArray;
import db.c1;
import db.i0;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;
import r1.k0;
import r1.l0;
import u1.a0;
import u1.y;
import w4.q0;
import y2.d0;
import y2.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements y2.o {
    public static final byte[] P = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final r1.q Q;
    public long A;
    public long B;
    public long C;
    public i D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public y2.q J;
    public f0[] K;
    public f0[] L;
    public boolean M;
    public boolean N;
    public long O;

    /* renamed from: a, reason: collision with root package name */
    public final v3.k f12081a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12082b;

    /* renamed from: c, reason: collision with root package name */
    public final q f12083c;

    /* renamed from: d, reason: collision with root package name */
    public final List f12084d;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f12089i;
    public final u1.t j;

    /* renamed from: k, reason: collision with root package name */
    public final y f12090k;

    /* renamed from: p, reason: collision with root package name */
    public final o4.j f12095p;

    /* renamed from: q, reason: collision with root package name */
    public final f0 f12096q;

    /* renamed from: r, reason: collision with root package name */
    public final q0 f12097r;
    public c1 s;

    /* renamed from: t, reason: collision with root package name */
    public int f12098t;

    /* renamed from: u, reason: collision with root package name */
    public int f12099u;

    /* renamed from: v, reason: collision with root package name */
    public long f12100v;

    /* renamed from: w, reason: collision with root package name */
    public int f12101w;

    /* renamed from: x, reason: collision with root package name */
    public u1.t f12102x;

    /* renamed from: y, reason: collision with root package name */
    public long f12103y;

    /* renamed from: z, reason: collision with root package name */
    public int f12104z;

    /* renamed from: l, reason: collision with root package name */
    public final j1.f0 f12091l = new j1.f0(3);

    /* renamed from: m, reason: collision with root package name */
    public final u1.t f12092m = new u1.t(16);

    /* renamed from: f, reason: collision with root package name */
    public final u1.t f12086f = new u1.t(v1.o.f13247a);

    /* renamed from: g, reason: collision with root package name */
    public final u1.t f12087g = new u1.t(6);

    /* renamed from: h, reason: collision with root package name */
    public final u1.t f12088h = new u1.t();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f12093n = new ArrayDeque();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f12094o = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f12085e = new SparseArray();

    static {
        r1.p pVar = new r1.p();
        pVar.f11611m = k0.p("application/x-emsg");
        Q = new r1.q(pVar);
    }

    public j(v3.k kVar, int i6, y yVar, q qVar, List list, d2.o oVar) {
        this.f12081a = kVar;
        this.f12082b = i6;
        this.f12090k = yVar;
        this.f12083c = qVar;
        this.f12084d = Collections.unmodifiableList(list);
        this.f12096q = oVar;
        byte[] bArr = new byte[16];
        this.f12089i = bArr;
        this.j = new u1.t(bArr);
        i0 i0Var = db.k0.f4008y;
        this.s = c1.B;
        this.B = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.J = y2.q.f14930w;
        this.K = new f0[0];
        this.L = new f0[0];
        this.f12095p = new o4.j(new g(this));
        this.f12097r = new q0();
        this.O = -1L;
    }

    public static r1.m e(List list) {
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i6 = 0; i6 < size; i6++) {
            v1.d dVar = (v1.d) list.get(i6);
            if (dVar.f2000b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = dVar.f13192c.f12811a;
                s8.n j = p.j(bArr);
                if (j == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) j.f12260b;
                }
                if (uuid == null) {
                    u1.a.p("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new r1.l(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new r1.m(null, false, (r1.l[]) arrayList.toArray(new r1.l[0]));
    }

    public static void g(u1.t tVar, int i6, s sVar) {
        boolean z10;
        tVar.K(i6 + 8);
        int k8 = tVar.k();
        byte[] bArr = e.f12060a;
        if ((k8 & 1) == 0) {
            if ((k8 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int C = tVar.C();
            if (C == 0) {
                Arrays.fill(sVar.f12171l, 0, sVar.f12165e, false);
                return;
            }
            int i10 = sVar.f12165e;
            u1.t tVar2 = sVar.f12173n;
            if (C == i10) {
                Arrays.fill(sVar.f12171l, 0, C, z10);
                tVar2.H(tVar.a());
                sVar.f12170k = true;
                sVar.f12174o = true;
                tVar.i(tVar2.f12811a, 0, tVar2.f12813c);
                tVar2.K(0);
                sVar.f12174o = false;
                return;
            }
            StringBuilder n10 = h8.c.n(C, "Senc sample count ", " is different from fragment sample count");
            n10.append(sVar.f12165e);
            throw l0.a(null, n10.toString());
        }
        throw l0.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static Pair j(long j, u1.t tVar) {
        long D;
        long D2;
        u1.t tVar2 = tVar;
        tVar2.K(8);
        int e10 = e.e(tVar2.k());
        tVar2.L(4);
        long A = tVar2.A();
        if (e10 == 0) {
            D = tVar2.A();
            D2 = tVar2.A();
        } else {
            D = tVar2.D();
            D2 = tVar2.D();
        }
        long j10 = D2 + j;
        String str = a0.f12750a;
        long Y = a0.Y(D, 1000000L, A, RoundingMode.DOWN);
        tVar2.L(2);
        int E = tVar2.E();
        int[] iArr = new int[E];
        long[] jArr = new long[E];
        long[] jArr2 = new long[E];
        long[] jArr3 = new long[E];
        long j11 = j10;
        long j12 = Y;
        int i6 = 0;
        while (i6 < E) {
            int k8 = tVar2.k();
            if ((Integer.MIN_VALUE & k8) == 0) {
                long A2 = tVar2.A();
                iArr[i6] = k8 & Integer.MAX_VALUE;
                jArr[i6] = j11;
                jArr3[i6] = j12;
                D += A2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                long Y2 = a0.Y(D, 1000000L, A, RoundingMode.DOWN);
                jArr4[i6] = Y2 - jArr5[i6];
                tVar2.L(4);
                j11 += iArr[i6];
                i6++;
                E = E;
                tVar2 = tVar;
                j12 = Y2;
                jArr2 = jArr4;
                jArr3 = jArr5;
            } else {
                throw l0.a(null, "Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(Y), new y2.k(iArr, jArr, jArr2, jArr3));
    }

    public final void b() {
        this.f12098t = 0;
        this.f12101w = 0;
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        SparseArray sparseArray = this.f12085e;
        int size = sparseArray.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((i) sparseArray.valueAt(i6)).e();
        }
        this.f12094o.clear();
        this.f12104z = 0;
        ((PriorityQueue) this.f12095p.f9928e).clear();
        this.A = j10;
        this.f12093n.clear();
        b();
    }

    @Override // y2.o
    public final boolean f(y2.p pVar) {
        c1 c1Var;
        d0 n10 = p.n(pVar, true, false);
        if (n10 != null) {
            c1Var = db.k0.o(n10);
        } else {
            i0 i0Var = db.k0.f4008y;
            c1Var = c1.B;
        }
        this.s = c1Var;
        if (n10 == null) {
            return true;
        }
        return false;
    }

    @Override // y2.o
    public final List h() {
        return this.s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:369:0x00cb, code lost:
    
        r5 = r2.f12070b;
        r6 = r32.f12098t;
        r11 = com.unity3d.services.core.device.MimeTypes.VIDEO_H264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x00d6, code lost:
    
        if (r6 != 3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x00da, code lost:
    
        if (r2.f12080m != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x00dc, code lost:
    
        r6 = r2.f12072d.f12180d[r2.f12074f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x00eb, code lost:
    
        r32.E = r6;
        r6 = r2.f12072d.f12177a.f12151g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x00f9, code lost:
    
        if (java.util.Objects.equals(r6.f11670n, com.unity3d.services.core.device.MimeTypes.VIDEO_H264) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x00fd, code lost:
    
        if ((r4 & 64) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x00ff, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0110, code lost:
    
        r32.H = !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0118, code lost:
    
        if (r2.f12074f >= r2.f12077i) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x011a, code lost:
    
        r33.w(r32.E);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0123, code lost:
    
        if (r1 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0126, code lost:
    
        r3 = r5.f12173n;
        r1 = r1.f12159d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x012a, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x012c, code lost:
    
        r3.L(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x012f, code lost:
    
        r1 = r2.f12074f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0133, code lost:
    
        if (r5.f12170k == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0139, code lost:
    
        if (r5.f12171l[r1] == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x013b, code lost:
    
        r3.L(r3.E() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0148, code lost:
    
        if (r2.c() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x014a, code lost:
    
        r32.D = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x014d, code lost:
    
        r32.f12098t = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0150, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0158, code lost:
    
        if (r2.f12072d.f12177a.f12152h != 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x015a, code lost:
    
        r32.E -= 8;
        r33.w(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0173, code lost:
    
        if ("audio/ac4".equals(r2.f12072d.f12177a.f12151g.f11670n) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0175, code lost:
    
        r32.F = r2.d(r32.E, 7);
        y2.a.i(r32.E, r8);
        r2.f12069a.a(7, r8);
        r32.F += 7;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0198, code lost:
    
        r32.E += r32.F;
        r32.f12098t = 4;
        r32.G = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x018f, code lost:
    
        r6 = 0;
        r32.F = r2.d(r32.E, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0101, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0109, code lost:
    
        if (java.util.Objects.equals(r6.f11670n, com.unity3d.services.core.device.MimeTypes.VIDEO_H265) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x010d, code lost:
    
        if ((r4 & 128) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x00e5, code lost:
    
        r6 = r5.f12168h[r2.f12074f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x01a3, code lost:
    
        r4 = r2.f12072d;
        r6 = r4.f12177a;
        r8 = r2.f12069a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x01ab, code lost:
    
        if (r2.f12080m != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x01ad, code lost:
    
        r15 = r4.f12182f[r2.f12074f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x01b3, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x01bc, code lost:
    
        if (r14 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x01be, code lost:
    
        r4 = r14.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x01c2, code lost:
    
        r13 = r6.f12154k;
        r6 = r6.f12151g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x01c6, code lost:
    
        if (r13 == 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x01c8, code lost:
    
        r15 = r32.f12087g;
        r9 = r15.f12811a;
        r9[0] = 0;
        r9[1] = 0;
        r9[r20] = 0;
        r12 = 4 - r13;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x01da, code lost:
    
        r22 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x01e0, code lost:
    
        if (r32.F >= r32.E) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x01e2, code lost:
    
        r2 = r32.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x01e4, code lost:
    
        if (r2 != 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x01e9, code lost:
    
        if (r32.L.length > 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x01ed, code lost:
    
        if (r32.H != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0204, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0205, code lost:
    
        r33.readFully(r9, r12, r22 + r2);
        r15.K(0);
        r19 = r15.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0212, code lost:
    
        if (r19 < 0) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0214, code lost:
    
        r32.G = r19 - r2;
        r13 = r32.f12086f;
        r25 = r12;
        r13.K(0);
        r8.a(4, r13);
        r32.F += 4;
        r32.E += r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0232, code lost:
    
        if (r32.L.length <= 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0234, code lost:
    
        if (r2 <= 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0236, code lost:
    
        r13 = r9[4];
        r12 = r6.f11670n;
        r13 = r6.f11667k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0242, code lost:
    
        if (java.util.Objects.equals(r12, r11) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0248, code lost:
    
        if (r1.k0.c(r13, r11) == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x024b, code lost:
    
        r26 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x025c, code lost:
    
        if (java.util.Objects.equals(r6.f11670n, com.unity3d.services.core.device.MimeTypes.VIDEO_H265) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0262, code lost:
    
        if (r1.k0.c(r13, com.unity3d.services.core.device.MimeTypes.VIDEO_H265) == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0273, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0274, code lost:
    
        r32.I = r12;
        r8.a(r2, r15);
        r32.F += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x027e, code lost:
    
        if (r2 <= 0) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0282, code lost:
    
        if (r32.H != false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0288, code lost:
    
        if (v1.o.c(r9, r2, r6) == false) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x028a, code lost:
    
        r32.H = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x028d, code lost:
    
        r13 = r22;
        r12 = r25;
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x026c, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x026e, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x024f, code lost:
    
        r26 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0254, code lost:
    
        if ((r13 & 31) == 6) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0270, code lost:
    
        r26 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x029c, code lost:
    
        throw r1.l0.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x01ef, code lost:
    
        r2 = v1.o.d(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x01ff, code lost:
    
        if ((r22 + r2) > (r32.E - r32.F)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0201, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x029d, code lost:
    
        r26 = r11;
        r25 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x02a4, code lost:
    
        if (r32.I == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x02a6, code lost:
    
        r12 = r32.f12088h;
        r12.H(r2);
        r33.readFully(r12.f12811a, 0, r32.G);
        r8.a(r32.G, r12);
        r2 = r32.G;
        r2 = v1.o.m(r12.f12813c, r12.f12811a);
        r12.K(0);
        r12.J(r2);
        r2 = r6.f11672p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x02cd, code lost:
    
        if (r2 != (-1)) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x02d1, code lost:
    
        if (r7.f9924a == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x02d3, code lost:
    
        r7.v(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x02de, code lost:
    
        r7.a(r4, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x02ea, code lost:
    
        if ((r17.a() & 4) == 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x02ec, code lost:
    
        r7.i(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x02ef, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x02f9, code lost:
    
        r32.F += r2;
        r32.G -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x02d9, code lost:
    
        if (r7.f9924a == r2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x02db, code lost:
    
        r7.v(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x02f2, code lost:
    
        r2 = r8.e(r33, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0318, code lost:
    
        r1 = r17.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x031e, code lost:
    
        if (r32.H != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0320, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0323, code lost:
    
        r28 = r1;
        r1 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0329, code lost:
    
        if (r1 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x032b, code lost:
    
        r31 = r1.f12158c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0332, code lost:
    
        r26 = r4;
        r8.c(r26, r28, r32.E, 0, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0343, code lost:
    
        if (r3.isEmpty() != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0345, code lost:
    
        r1 = (s3.h) r3.removeFirst();
        r32.f12104z -= r1.f12068c;
        r4 = r1.f12066a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0356, code lost:
    
        if (r1.f12067b == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0358, code lost:
    
        r4 = r4 + r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x035a, code lost:
    
        if (r14 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x035c, code lost:
    
        r4 = r14.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0360, code lost:
    
        r7 = r4;
        r2 = r32.K;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0365, code lost:
    
        if (r5 >= r4) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0367, code lost:
    
        r2[r5].c(r7, 1, r1.f12068c, r32.f12104z, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0379, code lost:
    
        if (r17.c() != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x037b, code lost:
    
        r32.D = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x037e, code lost:
    
        r32.f12098t = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0383, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0330, code lost:
    
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0304, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0306, code lost:
    
        r2 = r32.F;
        r6 = r32.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x030a, code lost:
    
        if (r2 >= r6) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x030c, code lost:
    
        r32.F += r8.e(r33, r6 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x01b5, code lost:
    
        r15 = r5.f12169i[r2.f12074f];
     */
    @Override // y2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(y2.p r33, mc.i r34) {
        /*
            Method dump skipped, instructions count: 2272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.j.i(y2.p, mc.i):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0439, code lost:
    
        if ((u1.a0.Y(r40, 1000000, r7, r46) + u1.a0.Y(r7[0], 1000000, r3.f12147c, r46)) >= r3.f12149e) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0808, code lost:
    
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x080b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0725  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(long r55) {
        /*
            Method dump skipped, instructions count: 2060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.j.k(long):void");
    }

    @Override // y2.o
    public final void l(y2.q qVar) {
        int i6;
        String str;
        int i10 = this.f12082b;
        if ((i10 & 32) == 0) {
            qVar = new a2.c(qVar, this.f12081a);
        }
        this.J = qVar;
        b();
        f0[] f0VarArr = new f0[2];
        this.K = f0VarArr;
        f0 f0Var = this.f12096q;
        if (f0Var != null) {
            f0VarArr[0] = f0Var;
            i6 = 1;
        } else {
            i6 = 0;
        }
        int i11 = 100;
        if ((i10 & 4) != 0) {
            f0VarArr[i6] = this.J.A(100, 5);
            i11 = 101;
            i6++;
        }
        f0[] f0VarArr2 = (f0[]) a0.S(i6, this.K);
        this.K = f0VarArr2;
        for (f0 f0Var2 : f0VarArr2) {
            f0Var2.f(Q);
        }
        List list = this.f12084d;
        this.L = new f0[list.size()];
        int i12 = 0;
        while (i12 < this.L.length) {
            f0 A = this.J.A(i11, 3);
            A.f((r1.q) list.get(i12));
            this.L[i12] = A;
            i12++;
            i11++;
        }
        q qVar2 = this.f12083c;
        if (qVar2 != null) {
            r1.q qVar3 = qVar2.f12151g;
            r1.p a10 = qVar3.a();
            String str2 = qVar3.f11670n;
            if (k0.o(str2)) {
                str = "video/mp4";
            } else if (k0.k(str2)) {
                str = "audio/mp4";
            } else {
                if (k0.m(str2)) {
                    if (Objects.equals(str2, "image/heic")) {
                        str = "image/heif";
                    } else if (Objects.equals(str2, "image/avif")) {
                        str = "image/avif";
                    }
                }
                str = "application/mp4";
            }
            a10.f11610l = k0.p(str);
            this.f12085e.put(0, new i(this.J.A(0, qVar2.f12146b), new t(this.f12083c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new f(0, 0, 0, 0), new r1.q(a10)));
            this.J.t();
        }
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final y2.o d() {
        return this;
    }
}
