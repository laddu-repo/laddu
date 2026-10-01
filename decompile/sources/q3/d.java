package q3;

import android.util.SparseArray;
import db.c1;
import db.i0;
import db.k0;
import j2.y;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import okhttp3.internal.ws.RealWebSocket;
import r1.l0;
import u1.a0;
import u1.t;
import u5.r;
import v3.k;
import y2.g0;
import y2.l;
import y2.o;
import y2.p;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f11047f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: g0, reason: collision with root package name */
    public static final byte[] f11048g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final byte[] f11049h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final byte[] f11050i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final UUID f11051j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final Map f11052k0;
    public long A;
    public boolean B;
    public long C;
    public long D;
    public long E;
    public y F;
    public y G;
    public boolean H;
    public boolean I;
    public int J;
    public long K;
    public long L;
    public int M;
    public int N;
    public int[] O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public long U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final b f11053a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f11054a0;

    /* renamed from: b, reason: collision with root package name */
    public final e f11055b;

    /* renamed from: b0, reason: collision with root package name */
    public int f11056b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f11057c;

    /* renamed from: c0, reason: collision with root package name */
    public byte f11058c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11059d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f11060d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11061e;

    /* renamed from: e0, reason: collision with root package name */
    public q f11062e0;

    /* renamed from: f, reason: collision with root package name */
    public final k f11063f;

    /* renamed from: g, reason: collision with root package name */
    public final t f11064g;

    /* renamed from: h, reason: collision with root package name */
    public final t f11065h;

    /* renamed from: i, reason: collision with root package name */
    public final t f11066i;
    public final t j;

    /* renamed from: k, reason: collision with root package name */
    public final t f11067k;

    /* renamed from: l, reason: collision with root package name */
    public final t f11068l;

    /* renamed from: m, reason: collision with root package name */
    public final t f11069m;

    /* renamed from: n, reason: collision with root package name */
    public final t f11070n;

    /* renamed from: o, reason: collision with root package name */
    public final t f11071o;

    /* renamed from: p, reason: collision with root package name */
    public final t f11072p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f11073q;

    /* renamed from: r, reason: collision with root package name */
    public long f11074r;
    public long s;

    /* renamed from: t, reason: collision with root package name */
    public long f11075t;

    /* renamed from: u, reason: collision with root package name */
    public long f11076u;

    /* renamed from: v, reason: collision with root package name */
    public long f11077v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f11078w;

    /* renamed from: x, reason: collision with root package name */
    public c f11079x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11080y;

    /* renamed from: z, reason: collision with root package name */
    public int f11081z;

    static {
        String str = a0.f12750a;
        f11048g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f11049h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f11050i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f11051j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        h8.c.q(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        h8.c.q(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f11052k0 = Collections.unmodifiableMap(hashMap);
    }

    public d(k kVar, int i6) {
        boolean z10;
        b bVar = new b();
        this.s = -1L;
        this.f11075t = -9223372036854775807L;
        this.f11076u = -9223372036854775807L;
        this.f11077v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.f11053a = bVar;
        bVar.f11016d = new r(this, 22);
        this.f11063f = kVar;
        if ((i6 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11059d = z10;
        this.f11061e = (i6 & 2) == 0;
        this.f11055b = new e();
        this.f11057c = new SparseArray();
        this.f11066i = new t(4);
        this.j = new t(ByteBuffer.allocate(4).putInt(-1).array());
        this.f11067k = new t(4);
        this.f11064g = new t(v1.o.f13247a);
        this.f11065h = new t(4);
        this.f11068l = new t();
        this.f11069m = new t();
        this.f11070n = new t(8);
        this.f11071o = new t();
        this.f11072p = new t();
        this.O = new int[1];
    }

    public static byte[] j(String str, long j, long j10) {
        boolean z10;
        if (j != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        int i6 = (int) (j / 3600000000L);
        long j11 = j - (i6 * 3600000000L);
        int i10 = (int) (j11 / 60000000);
        long j12 = j11 - (i10 * 60000000);
        int i11 = (int) (j12 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j12 - (i11 * 1000000)) / j10)));
        String str2 = a0.f12750a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    public final void b(int i6) {
        if (this.F != null && this.G != null) {
            return;
        }
        throw l0.a(null, "Element " + i6 + " must be in a Cues");
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        this.E = -9223372036854775807L;
        this.J = 0;
        b bVar = this.f11053a;
        bVar.f11017e = 0;
        bVar.f11014b.clear();
        e eVar = bVar.f11015c;
        eVar.f11084b = 0;
        eVar.f11085c = 0;
        e eVar2 = this.f11055b;
        eVar2.f11084b = 0;
        eVar2.f11085c = 0;
        m();
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = this.f11057c;
            if (i6 < sparseArray.size()) {
                g0 g0Var = ((c) sparseArray.valueAt(i6)).V;
                if (g0Var != null) {
                    g0Var.f14902b = false;
                    g0Var.f14903c = 0;
                }
                i6++;
            } else {
                return;
            }
        }
    }

    public final void e(int i6) {
        if (this.f11079x != null) {
            return;
        }
        throw l0.a(null, "Element " + i6 + " must be in a TrackEntry");
    }

    @Override // y2.o
    public final boolean f(p pVar) {
        y yVar = new y((byte) 0, 3);
        t tVar = (t) yVar.f7145z;
        l lVar = (l) pVar;
        long j = lVar.f14925z;
        long j10 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (j != -1 && j <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j10 = j;
        }
        int i6 = (int) j10;
        lVar.k(tVar.f12811a, 0, 4, false);
        long A = tVar.A();
        yVar.f7144y = 4;
        while (true) {
            if (A != 440786851) {
                int i10 = yVar.f7144y + 1;
                yVar.f7144y = i10;
                if (i10 == i6) {
                    break;
                }
                lVar.k(tVar.f12811a, 0, 1, false);
                A = ((A << 8) & (-256)) | (tVar.f12811a[0] & 255);
            } else {
                long s = yVar.s(lVar);
                long j11 = yVar.f7144y;
                if (s != Long.MIN_VALUE && (j == -1 || j11 + s < j)) {
                    while (true) {
                        long j12 = yVar.f7144y;
                        long j13 = j11 + s;
                        if (j12 < j13) {
                            if (yVar.s(lVar) != Long.MIN_VALUE) {
                                long s7 = yVar.s(lVar);
                                if (s7 < 0 || s7 > 2147483647L) {
                                    break;
                                }
                                if (s7 != 0) {
                                    int i11 = (int) s7;
                                    lVar.b(i11, false);
                                    yVar.f7144y += i11;
                                }
                            } else {
                                break;
                            }
                        } else if (j12 == j13) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(q3.c r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.d.g(q3.c, long, int, int, int):void");
    }

    @Override // y2.o
    public final List h() {
        i0 i0Var = k0.f4008y;
        return c1.B;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01ae, code lost:
    
        throw r1.l0.a(null, "Mandatory element SeekID or SeekPosition not found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x08b2, code lost:
    
        if (r1.s() == r2.getLeastSignificantBits()) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0be7, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0be8, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0fbf, code lost:
    
        if (r5 != false) goto L870;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x0fc1, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x0fc2, code lost:
    
        r1 = r0.f11057c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x0fc8, code lost:
    
        if (r3 >= r1.size()) goto L935;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x0fca, code lost:
    
        r1 = (q3.c) r1.valueAt(r3);
        r1.f11021a0.getClass();
        r2 = r1.V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x0fd7, code lost:
    
        if (r2 == null) goto L937;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x0fd9, code lost:
    
        r2.a(r1.f11021a0, r1.f11032k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x0fe0, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x0fe3, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x0fe6, code lost:
    
        return 0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x0387. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:132:0x0563. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0915  */
    /* JADX WARN: Type inference failed for: r0v5, types: [q3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v69 */
    @Override // y2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(y2.p r43, mc.i r44) {
        /*
            Method dump skipped, instructions count: 4902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.d.i(y2.p, mc.i):int");
    }

    public final void k(p pVar, int i6) {
        t tVar = this.f11066i;
        if (tVar.f12813c >= i6) {
            return;
        }
        byte[] bArr = tVar.f12811a;
        if (bArr.length < i6) {
            tVar.c(Math.max(bArr.length * 2, i6));
        }
        byte[] bArr2 = tVar.f12811a;
        int i10 = tVar.f12813c;
        pVar.readFully(bArr2, i10, i6 - i10);
        tVar.J(i6);
    }

    @Override // y2.o
    public final void l(q qVar) {
        if (this.f11061e) {
            qVar = new a2.c(qVar, this.f11063f);
        }
        this.f11062e0 = qVar;
    }

    public final void m() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.f11054a0 = false;
        this.f11056b0 = 0;
        this.f11058c0 = (byte) 0;
        this.f11060d0 = false;
        this.f11068l.H(0);
    }

    public final long n(long j) {
        long j10 = this.f11075t;
        if (j10 != -9223372036854775807L) {
            String str = a0.f12750a;
            return a0.Y(j, j10, 1000L, RoundingMode.DOWN);
        }
        throw l0.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if (r9 != 1683496997) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        r0 = r18.f11023b0;
        r0.getClass();
        r0.f11611m = r1.k0.p("audio/vnd.dts.hd");
        r0 = r18.f11021a0;
        r7 = r18.f11023b0;
        r7.getClass();
        r0.f(new r1.q(r7));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o(y2.p r17, q3.c r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.d.o(y2.p, q3.c, int, boolean):int");
    }

    public final void p(p pVar, byte[] bArr, int i6) {
        int length = bArr.length + i6;
        t tVar = this.f11069m;
        byte[] bArr2 = tVar.f12811a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i6);
            tVar.getClass();
            tVar.I(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pVar.readFully(tVar.f12811a, bArr.length, i6);
        tVar.K(0);
        tVar.J(length);
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final o d() {
        return this;
    }
}
