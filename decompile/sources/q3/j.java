package q3;

import android.util.Pair;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import t1.f0;
import w1.b0;
import w1.y;
import w2.e0;
import w2.g0;
import y9.c0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements w2.o {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final t1.o P;
    public long A;
    public long B;
    public i C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public w2.q I;
    public g0[] J;
    public g0[] K;
    public boolean L;
    public boolean M;
    public long N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3.k f10702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f10704c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f10708h;
    public final w1.t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f10709j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final cf.k f10714o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g0 f10715p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p4.s f10716q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z0 f10717r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10718s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10719t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f10720u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10721v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public w1.t f10722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f10723x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10724y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f10725z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final sc.b f10710k = new sc.b(16);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w1.t f10711l = new w1.t(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1.t f10706e = new w1.t(x1.o.f14146a);
    public final w1.t f = new w1.t(6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1.t f10707g = new w1.t();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayDeque f10712m = new ArrayDeque();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayDeque f10713n = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f10705d = new SparseArray();

    static {
        t1.n nVar = new t1.n();
        nVar.f12036m = f0.p("application/x-emsg");
        P = new t1.o(nVar);
    }

    public j(t3.k kVar, int i, y yVar, List list, f2.o oVar) {
        this.f10702a = kVar;
        this.f10703b = i;
        this.f10709j = yVar;
        this.f10704c = Collections.unmodifiableList(list);
        this.f10715p = oVar;
        byte[] bArr = new byte[16];
        this.f10708h = bArr;
        this.i = new w1.t(bArr);
        c0 c0Var = y9.f0.f14553w;
        this.f10717r = z0.f14637z;
        this.A = -9223372036854775807L;
        this.f10725z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = w2.q.f13846u;
        this.J = new g0[0];
        this.K = new g0[0];
        this.f10714o = new cf.k(new pa.a(2, this));
        this.f10716q = new p4.s(1);
        this.N = -1L;
    }

    public static t1.k d(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            x1.d dVar = (x1.d) list.get(i);
            if (dVar.f13896b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = dVar.f14093c.f13738a;
                p7.m mVarJ = p.j(bArr);
                UUID uuid = mVarJ == null ? null : (UUID) mVarJ.f10430w;
                if (uuid == null) {
                    w1.a.C("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new t1.j(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new t1.k(null, false, (t1.j[]) arrayList.toArray(new t1.j[0]));
    }

    public static void i(w1.t tVar, int i, s sVar) throws t1.g0 {
        tVar.J(i + 8);
        int iJ = tVar.j();
        byte[] bArr = e.f10682a;
        if ((iJ & 1) != 0) {
            throw t1.g0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z2 = (iJ & 2) != 0;
        int iB = tVar.B();
        if (iB == 0) {
            Arrays.fill(sVar.f10790l, 0, sVar.f10785e, false);
            return;
        }
        int i10 = sVar.f10785e;
        w1.t tVar2 = sVar.f10792n;
        if (iB != i10) {
            StringBuilder sbO = d0.d.o(iB, "Senc sample count ", " is different from fragment sample count");
            sbO.append(sVar.f10785e);
            throw t1.g0.a(null, sbO.toString());
        }
        Arrays.fill(sVar.f10790l, 0, iB, z2);
        tVar2.G(tVar.a());
        sVar.f10789k = true;
        sVar.f10793o = true;
        tVar.h(tVar2.f13738a, 0, tVar2.f13740c);
        tVar2.J(0);
        sVar.f10793o = false;
    }

    public static Pair j(long j8, w1.t tVar) throws t1.g0 {
        long jC;
        long jC2;
        w1.t tVar2 = tVar;
        tVar2.J(8);
        int iE = e.e(tVar2.j());
        tVar2.K(4);
        long jZ = tVar2.z();
        if (iE == 0) {
            jC = tVar2.z();
            jC2 = tVar2.z();
        } else {
            jC = tVar2.C();
            jC2 = tVar2.C();
        }
        long j9 = jC2 + j8;
        int i = b0.f13686a;
        long jU = b0.U(jC, 1000000L, jZ, RoundingMode.DOWN);
        tVar2.K(2);
        int iD = tVar2.D();
        int[] iArr = new int[iD];
        long[] jArr = new long[iD];
        long[] jArr2 = new long[iD];
        long[] jArr3 = new long[iD];
        long j10 = j9;
        long j11 = jU;
        int i10 = 0;
        while (i10 < iD) {
            int iJ = tVar2.j();
            if ((Integer.MIN_VALUE & iJ) != 0) {
                throw t1.g0.a(null, "Unhandled indirect reference");
            }
            long jZ2 = tVar2.z();
            iArr[i10] = iJ & Integer.MAX_VALUE;
            jArr[i10] = j10;
            jArr3[i10] = j11;
            jC += jZ2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jU2 = b0.U(jC, 1000000L, jZ, RoundingMode.DOWN);
            jArr4[i10] = jU2 - jArr5[i10];
            tVar2.K(4);
            j10 += (long) iArr[i10];
            i10++;
            iD = iD;
            tVar2 = tVar;
            j11 = jU2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jU), new w2.k(iArr, jArr, jArr2, jArr3));
    }

    public final void b() {
        this.f10718s = 0;
        this.f10721v = 0;
    }

    @Override // w2.o
    public final void c(w2.q qVar) {
        int i;
        int i10 = this.f10703b;
        if ((i10 & 32) == 0) {
            qVar = new c2.b(qVar, this.f10702a);
        }
        this.I = qVar;
        b();
        g0[] g0VarArr = new g0[2];
        this.J = g0VarArr;
        int i11 = 0;
        g0 g0Var = this.f10715p;
        if (g0Var != null) {
            g0VarArr[0] = g0Var;
            i = 1;
        } else {
            i = 0;
        }
        int i12 = 100;
        if ((i10 & 4) != 0) {
            g0VarArr[i] = this.I.r(100, 5);
            i12 = 101;
            i++;
        }
        g0[] g0VarArr2 = (g0[]) b0.O(i, this.J);
        this.J = g0VarArr2;
        for (g0 g0Var2 : g0VarArr2) {
            g0Var2.c(P);
        }
        List list = this.f10704c;
        this.K = new g0[list.size()];
        while (i11 < this.K.length) {
            g0 g0VarR = this.I.r(i12, 3);
            g0VarR.c((t1.o) list.get(i11));
            this.K[i11] = g0VarR;
            i11++;
            i12++;
        }
    }

    @Override // w2.o
    public final boolean e(w2.p pVar) {
        z0 z0VarQ;
        e0 e0VarN = p.n(pVar, true, false);
        if (e0VarN != null) {
            z0VarQ = y9.f0.q(e0VarN);
        } else {
            c0 c0Var = y9.f0.f14553w;
            z0VarQ = z0.f14637z;
        }
        this.f10717r = z0VarQ;
        return e0VarN == null;
    }

    @Override // w2.o
    public final void f(long j8, long j9) {
        SparseArray sparseArray = this.f10705d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((i) sparseArray.valueAt(i)).e();
        }
        this.f10713n.clear();
        this.f10724y = 0;
        ((PriorityQueue) this.f10714o.f2319e).clear();
        this.f10725z = j9;
        this.f10712m.clear();
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e5, code lost:
    
        if (r32.E >= r32.D) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e7, code lost:
    
        r2 = r32.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e9, code lost:
    
        if (r2 != 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ee, code lost:
    
        if (r32.K.length > 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f2, code lost:
    
        if (r32.G != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f4, code lost:
    
        r2 = x1.o.d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0204, code lost:
    
        if ((r4 + r2) > (r32.D - r32.E)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0206, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0209, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x020a, code lost:
    
        r33.readFully(r15, r6, r4 + r2);
        r9.J(0);
        r19 = r9.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0217, code lost:
    
        if (r19 < 0) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0219, code lost:
    
        r32.F = r19 - r2;
        r13 = r32.f10706e;
        r25 = r4;
        r13.J(0);
        r5.d(4, r13);
        r32.E += 4;
        r32.D += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0236, code lost:
    
        if (r32.K.length <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0238, code lost:
    
        if (r2 <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x023a, code lost:
    
        r13 = r15[4];
        r4 = r8.f12061n;
        r20 = r6;
        r6 = r8.f12058k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0246, code lost:
    
        if (java.util.Objects.equals(r4, r12) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024c, code lost:
    
        if (t1.f0.c(r6, r12) == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024f, code lost:
    
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0253, code lost:
    
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0258, code lost:
    
        if ((r13 & 31) == 6) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025a, code lost:
    
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0262, code lost:
    
        if (java.util.Objects.equals(r8.f12061n, r12) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0268, code lost:
    
        if (t1.f0.c(r6, r12) == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0272, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0275, code lost:
    
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0277, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0279, code lost:
    
        r20 = r6;
        r26 = r12;
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x027f, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0280, code lost:
    
        r32.H = r4;
        r5.d(r2, r9);
        r32.E += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x028a, code lost:
    
        if (r2 <= 0) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x028e, code lost:
    
        if (r32.G != false) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0294, code lost:
    
        if (x1.o.c(r15, r2, r8) == false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0296, code lost:
    
        r32.G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0299, code lost:
    
        r34 = r12;
        r6 = r20;
        r2 = r22;
        r4 = r25;
        r12 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ac, code lost:
    
        throw t1.g0.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ad, code lost:
    
        r25 = r4;
        r20 = r6;
        r26 = r12;
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02b7, code lost:
    
        if (r32.H == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02b9, code lost:
    
        r4 = r32.f10707g;
        r4.G(r2);
        r33.readFully(r4.f13738a, 0, r32.F);
        r5.d(r32.F, r4);
        r2 = r32.F;
        r2 = x1.o.m(r4.f13740c, r4.f13738a);
        r4.J(0);
        r4.I(r2);
        r2 = r8.f12063p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02e0, code lost:
    
        if (r2 != (-1)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02e4, code lost:
    
        if (r7.f2315a == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02e6, code lost:
    
        r7.I(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02ec, code lost:
    
        if (r7.f2315a == r2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02ee, code lost:
    
        r7.I(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02f1, code lost:
    
        r7.a(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02fd, code lost:
    
        if ((r22.a() & 4) == 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02ff, code lost:
    
        r7.v(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0302, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0305, code lost:
    
        r2 = r5.e(r33, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x030c, code lost:
    
        r32.E += r2;
        r32.F -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0317, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0319, code lost:
    
        r2 = r32.E;
        r4 = r32.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x031d, code lost:
    
        if (r2 >= r4) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x031f, code lost:
    
        r32.E += r5.e(r33, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x032b, code lost:
    
        r1 = r22.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0331, code lost:
    
        if (r32.G != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0333, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0336, code lost:
    
        r28 = r1;
        r1 = r22.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x033c, code lost:
    
        if (r1 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x033e, code lost:
    
        r31 = r1.f10778c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0343, code lost:
    
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0345, code lost:
    
        r26 = r10;
        r5.a(r26, r28, r32.D, 0, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0356, code lost:
    
        if (r3.isEmpty() != false) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0358, code lost:
    
        r1 = (q3.h) r3.removeFirst();
        r32.f10724y -= r1.f10690c;
        r4 = r1.f10688a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0369, code lost:
    
        if (r1.f10689b == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x036b, code lost:
    
        r4 = r4 + r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x036d, code lost:
    
        if (r14 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x036f, code lost:
    
        r4 = r14.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0373, code lost:
    
        r7 = r4;
        r2 = r32.J;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0378, code lost:
    
        if (r5 >= r4) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x037a, code lost:
    
        r2[r5].a(r7, 1, r1.f10690c, r32.f10724y, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x038c, code lost:
    
        if (r22.c() != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x038e, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0391, code lost:
    
        r32.f10718s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0396, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        r5 = r2.f10691a;
        r6 = r2.f10692b;
        r12 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
    
        if (r32.f10718s != 3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00df, code lost:
    
        if (r2.f10701m != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e1, code lost:
    
        r9 = r2.f10694d.f10799d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
    
        r9 = r6.f10787h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
    
        r32.D = r9;
        r9 = r2.f10694d.f10796a.f10771g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
    
        if (java.util.Objects.equals(r9.f12061n, "video/avc") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
    
        if ((r4 & 64) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
    
        if (java.util.Objects.equals(r9.f12061n, "video/hevc") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0114, code lost:
    
        if ((r4 & 128) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0117, code lost:
    
        r32.G = !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011f, code lost:
    
        if (r2.f >= r2.i) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
    
        r33.p(r32.D);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012a, code lost:
    
        if (r1 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012d, code lost:
    
        r3 = r6.f10792n;
        r1 = r1.f10779d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0131, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
    
        r3.K(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0136, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013a, code lost:
    
        if (r6.f10789k == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0140, code lost:
    
        if (r6.f10790l[r1] == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0142, code lost:
    
        r3.K(r3.D() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014e, code lost:
    
        if (r2.c() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0153, code lost:
    
        r32.f10718s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0156, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015f, code lost:
    
        if (r2.f10694d.f10796a.f10772h != r21) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0161, code lost:
    
        r32.D -= 8;
        r33.p(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017a, code lost:
    
        if ("audio/ac4".equals(r2.f10694d.f10796a.f10771g.f12061n) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017c, code lost:
    
        r32.E = r2.d(r32.D, 7);
        w2.b.g(r32.D, r8);
        r5.d(7, r8);
        r32.E += 7;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0195, code lost:
    
        r8 = 0;
        r32.E = r2.d(r32.D, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019f, code lost:
    
        r32.D += r32.E;
        r32.f10718s = 4;
        r32.F = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01aa, code lost:
    
        r4 = r2.f10694d;
        r8 = r4.f10796a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b0, code lost:
    
        if (r2.f10701m != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b2, code lost:
    
        r15 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b8, code lost:
    
        r34 = "video/hevc";
        r10 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bc, code lost:
    
        r15 = r6.i[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c3, code lost:
    
        if (r14 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c5, code lost:
    
        r10 = r14.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c9, code lost:
    
        r4 = r8.f10774k;
        r8 = r8.f10771g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cd, code lost:
    
        if (r4 == 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01cf, code lost:
    
        r9 = r32.f;
        r15 = r9.f13738a;
        r15[0] = 0;
        r15[1] = 0;
        r15[r20] = 0;
        r6 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01df, code lost:
    
        r22 = r2;
     */
    @Override // w2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(w2.p r33, t1.r r34) throws t1.g0 {
        /*
            Method dump skipped, instruction units count: 2288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.j.g(w2.p, t1.r):int");
    }

    @Override // w2.o
    public final List h() {
        return this.f10717r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:344:0x07df, code lost:
    
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x07e2, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(long r54) throws t1.g0 {
        /*
            Method dump skipped, instruction units count: 2019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.j.k(long):void");
    }

    @Override // w2.o
    public final w2.o a() {
        return this;
    }

    @Override // w2.o
    public final void release() {
    }
}
