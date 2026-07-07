package i2;

import a2.a2;
import a2.g;
import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageOutput;
import com.playfy.tv.activities.PlayerActivity;
import j4.b0;
import java.util.ArrayDeque;
import r1.q;
import y1.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends g {
    public final a2 P;
    public final h Q;
    public final ArrayDeque R;
    public boolean S;
    public boolean T;
    public e U;
    public long V;
    public long W;
    public int X;
    public int Y;
    public q Z;

    /* renamed from: a0, reason: collision with root package name */
    public b f6283a0;

    /* renamed from: b0, reason: collision with root package name */
    public h f6284b0;

    /* renamed from: c0, reason: collision with root package name */
    public ImageOutput f6285c0;

    /* renamed from: d0, reason: collision with root package name */
    public Bitmap f6286d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6287e0;

    /* renamed from: f0, reason: collision with root package name */
    public e8.b f6288f0;

    /* renamed from: g0, reason: collision with root package name */
    public e8.b f6289g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f6290h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f6291i0;

    public f(a2 a2Var) {
        super(4);
        this.P = a2Var;
        this.f6285c0 = ImageOutput.f1062a;
        this.Q = new h(0, 0);
        this.U = e.f6280c;
        this.R = new ArrayDeque();
        this.W = -9223372036854775807L;
        this.V = -9223372036854775807L;
        this.X = 0;
        this.Y = 1;
    }

    @Override // a2.g
    public final int A(q qVar) {
        this.P.getClass();
        return a2.R(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0148, code lost:
    
        if (r14 == ((r0 * r1.M) - 1)) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(long r13) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.f.C(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0110, code lost:
    
        if (r2 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Type inference failed for: r3v5, types: [e8.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D(long r13) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.f.D(long):boolean");
    }

    public final void E() {
        if (!this.f6291i0) {
            return;
        }
        q qVar = this.Z;
        qVar.getClass();
        a2 a2Var = this.P;
        a2Var.getClass();
        int R = a2.R(qVar);
        if (R != r4.a.d(4, 0, 0, 0) && R != r4.a.d(3, 0, 0, 0)) {
            throw a(new Exception("Provided decoder factory can't create decoder for format."), this.Z, false, 4005);
        }
        b bVar = this.f6283a0;
        if (bVar != null) {
            bVar.a();
        }
        this.f6283a0 = new b((PlayerActivity) a2Var.f162y);
        this.f6291i0 = false;
    }

    public final void F() {
        this.f6284b0 = null;
        this.X = 0;
        this.W = -9223372036854775807L;
        b bVar = this.f6283a0;
        if (bVar != null) {
            bVar.a();
            this.f6283a0 = null;
        }
    }

    @Override // a2.g, a2.u1
    public final void h(int i6, Object obj) {
        ImageOutput imageOutput;
        if (i6 != 15) {
            return;
        }
        if (obj instanceof ImageOutput) {
            imageOutput = (ImageOutput) obj;
        } else {
            imageOutput = null;
        }
        if (imageOutput == null) {
            imageOutput = ImageOutput.f1062a;
        }
        this.f6285c0 = imageOutput;
    }

    @Override // a2.g
    public final String j() {
        return "ImageRenderer";
    }

    @Override // a2.g
    public final boolean l() {
        return this.T;
    }

    @Override // a2.g
    public final boolean m() {
        int i6 = this.Y;
        if (i6 != 3) {
            if (i6 != 0 || !this.f6287e0) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // a2.g
    public final void o() {
        this.Z = null;
        this.U = e.f6280c;
        this.R.clear();
        F();
        this.f6285c0.a();
    }

    @Override // a2.g
    public final void p(boolean z10, boolean z11) {
        this.Y = z11 ? 1 : 0;
    }

    @Override // a2.g
    public final void q(boolean z10, long j) {
        this.Y = Math.min(this.Y, 1);
        this.T = false;
        this.S = false;
        this.f6286d0 = null;
        this.f6288f0 = null;
        this.f6289g0 = null;
        this.f6287e0 = false;
        this.f6284b0 = null;
        b bVar = this.f6283a0;
        if (bVar != null) {
            bVar.flush();
        }
        this.R.clear();
    }

    @Override // a2.g
    public final void r() {
        F();
    }

    @Override // a2.g
    public final void s() {
        F();
        this.Y = Math.min(this.Y, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // a2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(r1.q[] r5, long r6, long r8, q2.c0 r10) {
        /*
            r4 = this;
            i2.e r5 = r4.U
            long r5 = r5.f6282b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L31
            java.util.ArrayDeque r5 = r4.R
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.W
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.V
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 < 0) goto L26
            goto L31
        L26:
            i2.e r6 = new i2.e
            long r0 = r4.W
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            i2.e r5 = new i2.e
            r5.<init>(r0, r8)
            r4.U = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.f.v(r1.q[], long, long, q2.c0):void");
    }

    @Override // a2.g
    public final void x(long j, long j10) {
        if (!this.T) {
            if (this.Z == null) {
                b0 b0Var = this.f246z;
                b0Var.i();
                h hVar = this.Q;
                hVar.clear();
                int w10 = w(b0Var, hVar, 2);
                if (w10 == -5) {
                    q qVar = (q) b0Var.f7159y;
                    u1.c.h(qVar);
                    this.Z = qVar;
                    this.f6291i0 = true;
                } else {
                    if (w10 == -4) {
                        u1.c.g(hVar.isEndOfStream());
                        this.S = true;
                        this.T = true;
                        return;
                    }
                    return;
                }
            }
            if (this.f6283a0 == null) {
                E();
            }
            try {
                Trace.beginSection("drainAndFeedDecoder");
                do {
                } while (C(j));
                do {
                } while (D(j));
                Trace.endSection();
            } catch (c e10) {
                throw a(e10, null, false, 4003);
            }
        }
    }
}
