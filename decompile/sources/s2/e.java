package s2;

import a2.a2;
import a2.g;
import a2.i0;
import a2.k0;
import a2.n0;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import db.c1;
import j4.b0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import o5.e0;
import p.l;
import q2.c0;
import q2.z0;
import r1.q;
import u1.a0;
import u5.r;
import v3.f;
import v3.i;
import v3.j;
import y1.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends g implements Handler.Callback {
    public final e0 P;
    public final h Q;
    public a R;
    public final d S;
    public boolean T;
    public int U;
    public v3.e V;
    public i W;
    public j X;
    public j Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public final Handler f12034a0;

    /* renamed from: b0, reason: collision with root package name */
    public final k0 f12035b0;

    /* renamed from: c0, reason: collision with root package name */
    public final b0 f12036c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f12037d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f12038e0;

    /* renamed from: f0, reason: collision with root package name */
    public q f12039f0;

    /* renamed from: g0, reason: collision with root package name */
    public long f12040g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f12041h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [o5.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, j4.b0] */
    public e(k0 k0Var, Looper looper) {
        super(3);
        Handler handler;
        a2 a2Var = d.f12033r;
        this.f12035b0 = k0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = a0.f12750a;
            handler = new Handler(looper, this);
        }
        this.f12034a0 = handler;
        this.S = a2Var;
        this.P = new Object();
        this.Q = new h(1, 0);
        this.f12036c0 = new Object();
        this.f12041h0 = -9223372036854775807L;
        this.f12040g0 = -9223372036854775807L;
    }

    @Override // a2.g
    public final int A(q qVar) {
        int i6;
        boolean equals = Objects.equals(qVar.f11670n, "application/x-media3-cues");
        String str = qVar.f11670n;
        if (!equals) {
            a2 a2Var = (a2) this.S;
            a2Var.getClass();
            if (!((l) a2Var.f162y).g(qVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                if (r1.k0.n(str)) {
                    return r4.a.d(1, 0, 0, 0);
                }
                return r4.a.d(0, 0, 0, 0);
            }
        }
        if (qVar.O == 0) {
            i6 = 4;
        } else {
            i6 = 2;
        }
        return r4.a.d(i6, 0, 0, 0);
    }

    public final void C() {
        boolean z10;
        if (!Objects.equals(this.f12039f0.f11670n, "application/cea-608") && !Objects.equals(this.f12039f0.f11670n, "application/x-mp4-cea-608") && !Objects.equals(this.f12039f0.f11670n, "application/cea-708")) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1.c.f("Legacy decoding is disabled, can't handle " + this.f12039f0.f11670n + " samples (expected application/x-media3-cues).", z10);
    }

    public final long D() {
        if (this.Z == -1) {
            return Long.MAX_VALUE;
        }
        this.X.getClass();
        if (this.Z >= this.X.s()) {
            return Long.MAX_VALUE;
        }
        return this.X.e(this.Z);
    }

    public final long E(long j) {
        boolean z10;
        if (j != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        return j - this.H;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r3.equals("application/cea-608") == false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x003e. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F() {
        /*
            r7 = this;
            r0 = 1
            r7.T = r0
            r1.q r1 = r7.f12039f0
            r1.getClass()
            s2.d r2 = r7.S
            a2.a2 r2 = (a2.a2) r2
            java.lang.Object r2 = r2.f162y
            p.l r2 = (p.l) r2
            java.lang.String r3 = r1.f11670n
            int r4 = r1.K
            if (r3 == 0) goto L50
            int r5 = r3.hashCode()
            r6 = -1
            switch(r5) {
                case 930165504: goto L34;
                case 1566015601: goto L2b;
                case 1566016562: goto L20;
                default: goto L1e;
            }
        L1e:
            r0 = -1
            goto L3e
        L20:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L29
            goto L1e
        L29:
            r0 = 2
            goto L3e
        L2b:
            java.lang.String r5 = "application/cea-608"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L3e
            goto L1e
        L34:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3d
            goto L1e
        L3d:
            r0 = 0
        L3e:
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L4a;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L50
        L42:
            w3.f r0 = new w3.f
            java.util.List r1 = r1.f11673q
            r0.<init>(r4, r1)
            goto L6e
        L4a:
            w3.c r0 = new w3.c
            r0.<init>(r3, r4)
            goto L6e
        L50:
            boolean r0 = r2.g(r1)
            if (r0 == 0) goto L76
            v3.m r0 = r2.c(r1)
            s2.b r1 = new s2.b
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2, r0)
            r0 = r1
        L6e:
            r7.V = r0
            long r1 = r7.I
            r0.b(r1)
            return
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = r4.a.k(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.e.F():void");
    }

    public final void G(t1.c cVar) {
        c1 c1Var = cVar.f12479a;
        k0 k0Var = this.f12035b0;
        k0Var.f295x.K.e(27, new i0(0, c1Var));
        n0 n0Var = k0Var.f295x;
        n0Var.A0 = cVar;
        n0Var.K.e(27, new a2.e0(cVar, 2));
    }

    public final void H() {
        this.W = null;
        this.Z = -1;
        j jVar = this.X;
        if (jVar != null) {
            jVar.release();
            this.X = null;
        }
        j jVar2 = this.Y;
        if (jVar2 != null) {
            jVar2.release();
            this.Y = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            G((t1.c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // a2.g
    public final String j() {
        return "TextRenderer";
    }

    @Override // a2.g
    public final boolean l() {
        return this.f12038e0;
    }

    @Override // a2.g
    public final boolean m() {
        q qVar = this.f12039f0;
        if (qVar != null) {
            if (Objects.equals(qVar.f11670n, "application/x-media3-cues")) {
                a aVar = this.R;
                aVar.getClass();
                if (aVar.c(this.f12040g0) == Long.MIN_VALUE) {
                    try {
                        z0 z0Var = this.F;
                        z0Var.getClass();
                        z0Var.b();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else if (!this.f12038e0) {
                if (this.f12037d0) {
                    j jVar = this.X;
                    long j = this.f12040g0;
                    if (jVar == null || jVar.s() <= 0 || jVar.e(jVar.s() - 1) <= j) {
                        j jVar2 = this.Y;
                        long j10 = this.f12040g0;
                        if ((jVar2 == null || jVar2.s() <= 0 || jVar2.e(jVar2.s() - 1) <= j10) && this.W != null) {
                            return false;
                        }
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // a2.g
    public final void o() {
        this.f12039f0 = null;
        this.f12041h0 = -9223372036854775807L;
        t1.c cVar = new t1.c(E(this.f12040g0), c1.B);
        Handler handler = this.f12034a0;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            G(cVar);
        }
        this.f12040g0 = -9223372036854775807L;
        if (this.V != null) {
            H();
            v3.e eVar = this.V;
            eVar.getClass();
            eVar.a();
            this.V = null;
            this.U = 0;
        }
    }

    @Override // a2.g
    public final void q(boolean z10, long j) {
        this.f12040g0 = j;
        a aVar = this.R;
        if (aVar != null) {
            aVar.clear();
        }
        t1.c cVar = new t1.c(E(this.f12040g0), c1.B);
        Handler handler = this.f12034a0;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            G(cVar);
        }
        this.f12037d0 = false;
        this.f12038e0 = false;
        this.f12041h0 = -9223372036854775807L;
        q qVar = this.f12039f0;
        if (qVar != null && !Objects.equals(qVar.f11670n, "application/x-media3-cues")) {
            if (this.U != 0) {
                H();
                v3.e eVar = this.V;
                eVar.getClass();
                eVar.a();
                this.V = null;
                this.U = 0;
                F();
                return;
            }
            H();
            v3.e eVar2 = this.V;
            eVar2.getClass();
            eVar2.flush();
            eVar2.b(this.I);
        }
    }

    @Override // a2.g
    public final void v(q[] qVarArr, long j, long j10, c0 c0Var) {
        a rVar;
        q qVar = qVarArr[0];
        this.f12039f0 = qVar;
        if (!Objects.equals(qVar.f11670n, "application/x-media3-cues")) {
            C();
            if (this.V != null) {
                this.U = 1;
                return;
            } else {
                F();
                return;
            }
        }
        if (this.f12039f0.L == 1) {
            rVar = new c();
        } else {
            rVar = new r(23);
        }
        this.R = rVar;
    }

    @Override // a2.g
    public final void x(long j, long j10) {
        boolean z10;
        long j11;
        if (this.K) {
            long j12 = this.f12041h0;
            if (j12 != -9223372036854775807L && j >= j12) {
                H();
                this.f12038e0 = true;
            }
        }
        if (!this.f12038e0) {
            q qVar = this.f12039f0;
            qVar.getClass();
            boolean equals = Objects.equals(qVar.f11670n, "application/x-media3-cues");
            Handler handler = this.f12034a0;
            b0 b0Var = this.f12036c0;
            boolean z11 = false;
            if (equals) {
                this.R.getClass();
                if (!this.f12037d0) {
                    h hVar = this.Q;
                    if (w(b0Var, hVar, 0) == -4) {
                        if (hVar.isEndOfStream()) {
                            this.f12037d0 = true;
                        } else {
                            hVar.d();
                            ByteBuffer byteBuffer = hVar.f14812z;
                            byteBuffer.getClass();
                            long j13 = hVar.B;
                            byte[] array = byteBuffer.array();
                            int arrayOffset = byteBuffer.arrayOffset();
                            int limit = byteBuffer.limit();
                            this.P.getClass();
                            Parcel obtain = Parcel.obtain();
                            obtain.unmarshall(array, arrayOffset, limit);
                            obtain.setDataPosition(0);
                            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                            obtain.recycle();
                            ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                            parcelableArrayList.getClass();
                            v3.a aVar = new v3.a(j13, readBundle.getLong("d"), u1.c.j(new u2.i(1), parcelableArrayList));
                            hVar.clear();
                            z11 = this.R.f(aVar, j);
                        }
                    }
                }
                long c10 = this.R.c(this.f12040g0);
                if (c10 == Long.MIN_VALUE && this.f12037d0 && !z11) {
                    this.f12038e0 = true;
                }
                if (c10 != Long.MIN_VALUE && c10 <= j) {
                    z11 = true;
                }
                if (z11) {
                    db.k0 i6 = this.R.i(j);
                    long o10 = this.R.o(j);
                    t1.c cVar = new t1.c(E(o10), i6);
                    if (handler != null) {
                        handler.obtainMessage(1, cVar).sendToTarget();
                    } else {
                        G(cVar);
                    }
                    this.R.p(o10);
                }
                this.f12040g0 = j;
                return;
            }
            C();
            this.f12040g0 = j;
            if (this.Y == null) {
                v3.e eVar = this.V;
                eVar.getClass();
                eVar.c(j);
                try {
                    v3.e eVar2 = this.V;
                    eVar2.getClass();
                    this.Y = (j) eVar2.d();
                } catch (f e10) {
                    u1.a.h("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f12039f0, e10);
                    t1.c cVar2 = new t1.c(E(this.f12040g0), c1.B);
                    if (handler != null) {
                        handler.obtainMessage(1, cVar2).sendToTarget();
                    } else {
                        G(cVar2);
                    }
                    H();
                    v3.e eVar3 = this.V;
                    eVar3.getClass();
                    eVar3.a();
                    this.V = null;
                    this.U = 0;
                    F();
                    return;
                }
            }
            if (this.E == 2) {
                if (this.X != null) {
                    long D = D();
                    z10 = false;
                    while (D <= j) {
                        this.Z++;
                        D = D();
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                j jVar = this.Y;
                if (jVar != null) {
                    if (jVar.isEndOfStream()) {
                        if (!z10 && D() == Long.MAX_VALUE) {
                            if (this.U == 2) {
                                H();
                                v3.e eVar4 = this.V;
                                eVar4.getClass();
                                eVar4.a();
                                this.V = null;
                                this.U = 0;
                                F();
                            } else {
                                H();
                                this.f12038e0 = true;
                            }
                        }
                    } else if (jVar.timeUs <= j) {
                        j jVar2 = this.X;
                        if (jVar2 != null) {
                            jVar2.release();
                        }
                        this.Z = jVar.c(j);
                        this.X = jVar;
                        this.Y = null;
                        z10 = true;
                    }
                }
                if (z10) {
                    this.X.getClass();
                    int c11 = this.X.c(j);
                    if (c11 != 0 && this.X.s() != 0) {
                        if (c11 == -1) {
                            j jVar3 = this.X;
                            j11 = jVar3.e(jVar3.s() - 1);
                        } else {
                            j11 = this.X.e(c11 - 1);
                        }
                    } else {
                        j11 = this.X.timeUs;
                    }
                    t1.c cVar3 = new t1.c(E(j11), this.X.p(j));
                    if (handler != null) {
                        handler.obtainMessage(1, cVar3).sendToTarget();
                    } else {
                        G(cVar3);
                    }
                }
                if (this.U != 2) {
                    while (!this.f12037d0) {
                        try {
                            i iVar = this.W;
                            if (iVar == null) {
                                v3.e eVar5 = this.V;
                                eVar5.getClass();
                                iVar = (i) eVar5.e();
                                if (iVar != null) {
                                    this.W = iVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.U == 1) {
                                iVar.setFlags(4);
                                v3.e eVar6 = this.V;
                                eVar6.getClass();
                                eVar6.f(iVar);
                                this.W = null;
                                this.U = 2;
                                return;
                            }
                            int w10 = w(b0Var, iVar, 0);
                            if (w10 == -4) {
                                if (iVar.isEndOfStream()) {
                                    this.f12037d0 = true;
                                    this.T = false;
                                } else {
                                    q qVar2 = (q) b0Var.f7159y;
                                    if (qVar2 != null) {
                                        iVar.F = qVar2.s;
                                        iVar.d();
                                        this.T &= !iVar.isKeyFrame();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.T) {
                                    v3.e eVar7 = this.V;
                                    eVar7.getClass();
                                    eVar7.f(iVar);
                                    this.W = null;
                                }
                            } else if (w10 == -3) {
                                return;
                            }
                        } catch (f e11) {
                            u1.a.h("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f12039f0, e11);
                            t1.c cVar4 = new t1.c(E(this.f12040g0), c1.B);
                            if (handler != null) {
                                handler.obtainMessage(1, cVar4).sendToTarget();
                            } else {
                                G(cVar4);
                            }
                            H();
                            v3.e eVar8 = this.V;
                            eVar8.getClass();
                            eVar8.a();
                            this.V = null;
                            this.U = 0;
                            F();
                            return;
                        }
                    }
                }
            }
        }
    }
}
