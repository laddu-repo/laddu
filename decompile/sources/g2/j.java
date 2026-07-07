package g2;

import android.net.Uri;
import com.google.android.gms.internal.measurement.k4;
import db.c1;
import db.i0;
import db.k0;
import f4.f0;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Http2;
import u1.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends r2.l {

    /* renamed from: j0, reason: collision with root package name */
    public static final AtomicInteger f5335j0 = new AtomicInteger();
    public final int H;
    public final int I;
    public final Uri J;
    public final boolean K;
    public final int L;
    public final w1.h M;
    public final w1.l N;
    public final b O;
    public final boolean P;
    public final boolean Q;
    public final y R;
    public final c S;
    public final List T;
    public final r1.m U;
    public final m3.i V;
    public final u1.t W;
    public final boolean X;
    public final boolean Y;
    public b Z;

    /* renamed from: a0, reason: collision with root package name */
    public q f5336a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f5337b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f5338c0;

    /* renamed from: d0, reason: collision with root package name */
    public volatile boolean f5339d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f5340e0;

    /* renamed from: f0, reason: collision with root package name */
    public k0 f5341f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f5342g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f5343h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f5344i0;

    public j(c cVar, w1.h hVar, w1.l lVar, r1.q qVar, boolean z10, w1.h hVar2, w1.l lVar2, boolean z11, Uri uri, List list, int i6, Object obj, long j, long j10, long j11, int i10, boolean z12, int i11, boolean z13, boolean z14, y yVar, r1.m mVar, b bVar, m3.i iVar, u1.t tVar, boolean z15, boolean z16, b2.m mVar2) {
        super(hVar, lVar, qVar, i6, obj, j, j10, j11);
        this.X = z10;
        this.L = i10;
        this.f5343h0 = z12 ? j10 - j : -9223372036854775807L;
        this.I = i11;
        this.N = lVar2;
        this.M = hVar2;
        this.f5338c0 = lVar2 != null;
        this.Y = z11;
        this.J = uri;
        this.P = z14;
        this.R = yVar;
        this.Q = z13;
        this.S = cVar;
        this.T = list;
        this.U = mVar;
        this.O = bVar;
        this.V = iVar;
        this.W = tVar;
        this.f5344i0 = z15;
        this.K = z16;
        i0 i0Var = k0.f4008y;
        this.f5341f0 = c1.B;
        this.H = f5335j0.getAndIncrement();
    }

    public static byte[] d(String str) {
        int i6;
        if (dg.b.p(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i6 = byteArray.length - 16;
        } else {
            i6 = 0;
        }
        System.arraycopy(byteArray, i6, bArr, (16 - byteArray.length) + i6, byteArray.length - i6);
        return bArr;
    }

    @Override // r2.l
    public final boolean b() {
        throw null;
    }

    public final void c(w1.h hVar, w1.l lVar, boolean z10, boolean z11) {
        w1.l c10;
        boolean z12;
        long j;
        boolean z13;
        if (z10) {
            if (this.f5337b0 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            z12 = z13;
            c10 = lVar;
        } else {
            c10 = lVar.c(this.f5337b0);
            z12 = false;
        }
        try {
            y2.l g10 = g(hVar, c10, z11);
            if (z12) {
                g10.j(this.f5337b0, false);
            }
            do {
                try {
                    try {
                        if (this.f5339d0) {
                            break;
                        }
                    } catch (EOFException e10) {
                        if ((this.A.f11663f & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            this.Z.f5305a.c(0L, 0L);
                            j = g10.A;
                        } else {
                            throw e10;
                        }
                    }
                } catch (Throwable th) {
                    this.f5337b0 = (int) (g10.A - lVar.f13546e);
                    throw th;
                }
            } while (this.Z.f5305a.i(g10, b.f5304f) == 0);
            j = g10.A;
            this.f5337b0 = (int) (j - lVar.f13546e);
        } finally {
            k4.f(hVar);
        }
    }

    public final int e(int i6) {
        u1.c.g(!this.f5344i0);
        if (i6 >= this.f5341f0.size()) {
            return 0;
        }
        return ((Integer) this.f5341f0.get(i6)).intValue();
    }

    public final boolean f() {
        if (this.f5343h0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y2.l g(w1.h r35, w1.l r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.j.g(w1.h, w1.l, boolean):y2.l");
    }

    @Override // u2.l
    public final void h() {
        b bVar;
        this.f5336a0.getClass();
        if (this.Z == null && (bVar = this.O) != null) {
            y2.o d10 = bVar.f5305a.d();
            if ((d10 instanceof f0) || (d10 instanceof s3.j)) {
                this.Z = this.O;
                this.f5338c0 = false;
            }
        }
        w1.l lVar = this.N;
        w1.h hVar = this.M;
        if (this.f5338c0) {
            hVar.getClass();
            lVar.getClass();
            c(hVar, lVar, this.Y, false);
            this.f5337b0 = 0;
            this.f5338c0 = false;
        }
        if (!this.f5339d0) {
            if (!this.Q) {
                c(this.F, this.f11786y, this.X, true);
            }
            this.f5340e0 = !this.f5339d0;
        }
    }

    @Override // u2.l
    public final void p() {
        this.f5339d0 = true;
    }
}
