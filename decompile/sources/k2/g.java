package k2;

import a7.l;
import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayDeque;
import t1.o;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c2.f {
    public final l N;
    public final DecoderInputBuffer O;
    public final ArrayDeque P;
    public boolean Q;
    public boolean R;
    public e S;
    public long T;
    public long U;
    public int V;
    public int W;
    public o X;
    public b Y;
    public DecoderInputBuffer Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public d f7288a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Bitmap f7289b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f7290c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public f f7291d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public f f7292e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f7293f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f7294g0;

    public g(l lVar) {
        super(4);
        this.N = lVar;
        this.f7288a0 = d.f7281a;
        this.O = DecoderInputBuffer.newNoDataInstance();
        this.S = e.f7282c;
        this.P = new ArrayDeque();
        this.U = -9223372036854775807L;
        this.T = -9223372036854775807L;
        this.V = 0;
        this.W = 1;
    }

    @Override // c2.f
    public final int A(o oVar) {
        this.N.getClass();
        return l.d(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(long r13) throws c2.o {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.g.C(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D(long r12) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.g.D(long):boolean");
    }

    public final void E() throws c2.o {
        if (this.f7294g0) {
            o oVar = this.X;
            oVar.getClass();
            l lVar = this.N;
            lVar.getClass();
            int iD = l.d(oVar);
            if (iD != j4.a.d(4, 0, 0, 0) && iD != j4.a.d(3, 0, 0, 0)) {
                throw f(new c("Provided decoder factory can't create decoder for format."), this.X, false, 4005);
            }
            b bVar = this.Y;
            if (bVar != null) {
                bVar.release();
            }
            this.Y = new b(lVar.f208v);
            this.f7294g0 = false;
        }
    }

    public final void F() {
        this.Z = null;
        this.V = 0;
        this.U = -9223372036854775807L;
        b bVar = this.Y;
        if (bVar != null) {
            bVar.release();
            this.Y = null;
        }
    }

    @Override // c2.f, c2.n1
    public final void c(int i, Object obj) {
        if (i != 15) {
            return;
        }
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar == null) {
            dVar = d.f7281a;
        }
        this.f7288a0 = dVar;
    }

    @Override // c2.f
    public final String j() {
        return "ImageRenderer";
    }

    @Override // c2.f
    public final boolean l() {
        return this.R;
    }

    @Override // c2.f
    public final boolean m() {
        int i = this.W;
        if (i != 3) {
            return i == 0 && this.f7290c0;
        }
        return true;
    }

    @Override // c2.f
    public final void o() {
        this.X = null;
        this.S = e.f7282c;
        this.P.clear();
        F();
        this.f7288a0.getClass();
    }

    @Override // c2.f
    public final void p(boolean z2, boolean z10) {
        this.W = z10 ? 1 : 0;
    }

    @Override // c2.f
    public final void q(boolean z2, long j8) {
        this.W = Math.min(this.W, 1);
        this.R = false;
        this.Q = false;
        this.f7289b0 = null;
        this.f7291d0 = null;
        this.f7292e0 = null;
        this.f7290c0 = false;
        this.Z = null;
        b bVar = this.Y;
        if (bVar != null) {
            bVar.flush();
        }
        this.P.clear();
    }

    @Override // c2.f
    public final void r() {
        F();
    }

    @Override // c2.f
    public final void s() {
        F();
        this.W = Math.min(this.W, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // c2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(t1.o[] r5, long r6, long r8, o2.d0 r10) {
        /*
            r4 = this;
            k2.e r5 = r4.S
            long r5 = r5.f7284b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.P
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.U
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.T
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            k2.e r6 = new k2.e
            long r0 = r4.U
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            k2.e r5 = new k2.e
            r5.<init>(r0, r8)
            r4.S = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.g.v(t1.o[], long, long, o2.d0):void");
    }

    @Override // c2.f
    public final void x(long j8, long j9) throws c2.o {
        if (this.R) {
            return;
        }
        if (this.X == null) {
            sc.b bVar = this.f1724x;
            bVar.G();
            DecoderInputBuffer decoderInputBuffer = this.O;
            decoderInputBuffer.clear();
            int iW = w(bVar, decoderInputBuffer, 2);
            if (iW != -5) {
                if (iW == -4) {
                    w1.a.j(decoderInputBuffer.isEndOfStream());
                    this.Q = true;
                    this.R = true;
                    return;
                }
                return;
            }
            o oVar = (o) bVar.f11787x;
            w1.a.k(oVar);
            this.X = oVar;
            this.f7294g0 = true;
        }
        if (this.Y == null) {
            E();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (C(j8)) {
            }
            while (D(j8)) {
            }
            Trace.endSection();
        } catch (c e7) {
            throw f(e7, null, false, 4003);
        }
    }
}
