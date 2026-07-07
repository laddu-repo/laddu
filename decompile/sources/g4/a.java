package g4;

import com.google.android.material.datepicker.o;
import java.math.RoundingMode;
import okhttp3.internal.http.StatusLine;
import r1.k0;
import r1.l0;
import r1.p;
import u1.a0;
import u1.t;
import y2.f0;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f5421m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f5422n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final q f5423a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f5424b;

    /* renamed from: c, reason: collision with root package name */
    public final o f5425c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5426d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f5427e;

    /* renamed from: f, reason: collision with root package name */
    public final t f5428f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5429g;

    /* renamed from: h, reason: collision with root package name */
    public final r1.q f5430h;

    /* renamed from: i, reason: collision with root package name */
    public int f5431i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f5432k;

    /* renamed from: l, reason: collision with root package name */
    public long f5433l;

    public a(q qVar, f0 f0Var, o oVar) {
        this.f5423a = qVar;
        this.f5424b = f0Var;
        this.f5425c = oVar;
        int i6 = oVar.f2674y;
        int max = Math.max(1, i6 / 10);
        this.f5429g = max;
        t tVar = new t((byte[]) oVar.B);
        tVar.r();
        int r10 = tVar.r();
        this.f5426d = r10;
        int i10 = oVar.f2673x;
        int i11 = oVar.f2675z;
        int i12 = (((i11 - (i10 * 4)) * 8) / (oVar.A * i10)) + 1;
        if (r10 == i12) {
            int f3 = a0.f(max, r10);
            this.f5427e = new byte[f3 * i11];
            this.f5428f = new t(r10 * 2 * i10 * f3);
            int i13 = ((i11 * i6) * 8) / r10;
            p pVar = new p();
            pVar.f11611m = k0.p("audio/raw");
            pVar.f11607h = i13;
            pVar.f11608i = i13;
            pVar.f11612n = max * 2 * i10;
            pVar.E = i10;
            pVar.F = i6;
            pVar.G = 2;
            this.f5430h = new r1.q(pVar);
            return;
        }
        throw l0.a(null, "Expected frames per block: " + i12 + "; got: " + r10);
    }

    @Override // g4.b
    public final void a(long j) {
        this.f5431i = 0;
        this.j = j;
        this.f5432k = 0;
        this.f5433l = 0L;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0046 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0046->B:14:0x0046 BREAK  A[LOOP:0: B:5:0x0024->B:11:0x0040], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003d -> B:3:0x0021). Please report as a decompilation issue!!! */
    @Override // g4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(y2.p r25, long r26) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.a.b(y2.p, long):boolean");
    }

    @Override // g4.b
    public final void c(int i6, long j) {
        this.f5423a.n(new f(this.f5425c, this.f5426d, i6, j));
        this.f5424b.f(this.f5430h);
    }

    public final void d(int i6) {
        long j = this.j;
        long j10 = this.f5433l;
        o oVar = this.f5425c;
        long j11 = oVar.f2674y;
        String str = a0.f12750a;
        long Y = j + a0.Y(j10, 1000000L, j11, RoundingMode.DOWN);
        int i10 = i6 * 2 * oVar.f2673x;
        this.f5424b.c(Y, 1, i10, this.f5432k - i10, null);
        this.f5433l += i6;
        this.f5432k -= i10;
    }
}
