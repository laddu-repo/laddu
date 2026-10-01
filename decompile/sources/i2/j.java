package i2;

import android.net.Uri;
import d4.e0;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import w1.y;
import y9.c0;
import y9.f0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j extends p2.l {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final AtomicInteger f6386h0 = new AtomicInteger();
    public final int F;
    public final int G;
    public final Uri H;
    public final boolean I;
    public final int J;
    public final y1.h K;
    public final y1.k L;
    public final b M;
    public final boolean N;
    public final boolean O;
    public final y P;
    public final c Q;
    public final List R;
    public final t1.k S;
    public final k3.i T;
    public final w1.t U;
    public final boolean V;
    public final boolean W;
    public b X;
    public q Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f6387a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public volatile boolean f6388b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f6389c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public f0 f6390d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f6391e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public long f6392f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f6393g0;

    public j(c cVar, y1.h hVar, y1.k kVar, t1.o oVar, boolean z2, y1.h hVar2, y1.k kVar2, boolean z10, Uri uri, List list, int i, Object obj, long j8, long j9, long j10, int i10, boolean z11, int i11, boolean z12, boolean z13, y yVar, t1.k kVar3, b bVar, k3.i iVar, w1.t tVar, boolean z14, boolean z15, d2.l lVar) {
        super(hVar, kVar, oVar, i, obj, j8, j9, j10);
        this.V = z2;
        this.J = i10;
        this.f6392f0 = z11 ? j9 - j8 : -9223372036854775807L;
        this.G = i11;
        this.L = kVar2;
        this.K = hVar2;
        this.f6387a0 = kVar2 != null;
        this.W = z10;
        this.H = uri;
        this.N = z13;
        this.P = yVar;
        this.O = z12;
        this.Q = cVar;
        this.R = list;
        this.S = kVar3;
        this.M = bVar;
        this.T = iVar;
        this.U = tVar;
        this.f6393g0 = z14;
        this.I = z15;
        c0 c0Var = f0.f14553w;
        this.f6390d0 = z0.f14637z;
        this.F = f6386h0.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (com.bumptech.glide.f.U(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // p2.l
    public final boolean b() {
        throw null;
    }

    @Override // s2.k
    public final void c() {
        b bVar;
        this.Y.getClass();
        if (this.X == null && (bVar = this.M) != null) {
            w2.o oVarA = bVar.f6354a.a();
            if ((oVarA instanceof e0) || (oVarA instanceof q3.j)) {
                this.X = this.M;
                this.f6387a0 = false;
            }
        }
        y1.k kVar = this.L;
        y1.h hVar = this.K;
        if (this.f6387a0) {
            hVar.getClass();
            kVar.getClass();
            d(hVar, kVar, this.W, false);
            this.Z = 0;
            this.f6387a0 = false;
        }
        if (this.f6388b0) {
            return;
        }
        if (!this.O) {
            d(this.D, this.f10209w, this.V, true);
        }
        this.f6389c0 = !this.f6388b0;
    }

    public final void d(y1.h hVar, y1.k kVar, boolean z2, boolean z10) {
        y1.k kVarC;
        boolean z11;
        long j8;
        if (z2) {
            z11 = this.Z != 0;
            kVarC = kVar;
        } else {
            kVarC = kVar.c(this.Z);
            z11 = false;
        }
        try {
            w2.l lVarH = h(hVar, kVarC, z10);
            if (z11) {
                lVarH.q(this.Z, false);
            }
            while (!this.f6388b0 && this.X.f6354a.g(lVarH, b.f) == 0) {
                try {
                    try {
                    } catch (EOFException e7) {
                        if ((this.f10211y.f & 16384) == 0) {
                            throw e7;
                        }
                        this.X.f6354a.f(0L, 0L);
                        j8 = lVarH.f13837y;
                    }
                } catch (Throwable th) {
                    this.Z = (int) (lVarH.f13837y - kVar.f14381e);
                    throw th;
                }
            }
            j8 = lVarH.f13837y;
            this.Z = (int) (j8 - kVar.f14381e);
        } finally {
            android.support.v4.media.session.b.e(hVar);
        }
    }

    public final int f(int i) {
        w1.a.j(!this.f6393g0);
        if (i >= this.f6390d0.size()) {
            return 0;
        }
        return ((Integer) this.f6390d0.get(i)).intValue();
    }

    public final boolean g() {
        return this.f6392f0 != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final w2.l h(y1.h r34, y1.k r35, boolean r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.j.h(y1.h, y1.k, boolean):w2.l");
    }

    @Override // s2.k
    public final void j() {
        this.f6388b0 = true;
    }
}
