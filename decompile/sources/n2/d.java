package n2;

import java.util.Locale;
import m2.l;
import r1.p;
import u1.a0;
import u1.t;
import y2.f0;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8970a;

    /* renamed from: b, reason: collision with root package name */
    public final l f8971b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f8972c;

    /* renamed from: d, reason: collision with root package name */
    public long f8973d;

    /* renamed from: e, reason: collision with root package name */
    public long f8974e;

    /* renamed from: f, reason: collision with root package name */
    public int f8975f;

    /* renamed from: g, reason: collision with root package name */
    public int f8976g;

    /* renamed from: h, reason: collision with root package name */
    public long f8977h;

    /* renamed from: i, reason: collision with root package name */
    public int f8978i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8979k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8980l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8981m;

    public d(l lVar, int i6) {
        this.f8970a = i6;
        switch (i6) {
            case 1:
                this.f8971b = lVar;
                this.f8973d = -9223372036854775807L;
                this.f8976g = -1;
                this.f8977h = -9223372036854775807L;
                this.f8974e = 0L;
                this.f8975f = -1;
                this.f8978i = -1;
                this.j = -1;
                return;
            default:
                this.f8971b = lVar;
                this.f8973d = -9223372036854775807L;
                this.f8976g = -1;
                return;
        }
    }

    @Override // n2.i
    public final void c(long j, long j10) {
        switch (this.f8970a) {
            case 0:
                this.f8973d = j;
                this.f8975f = 0;
                this.f8974e = j10;
                return;
            default:
                this.f8973d = j;
                this.f8976g = -1;
                this.f8974e = j10;
                return;
        }
    }

    @Override // n2.i
    public final void d(long j) {
        boolean z10;
        boolean z11;
        switch (this.f8970a) {
            case 0:
                if (this.f8973d == -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1.c.g(z10);
                this.f8973d = j;
                return;
            default:
                if (this.f8973d == -9223372036854775807L) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u1.c.g(z11);
                this.f8973d = j;
                return;
        }
    }

    @Override // n2.i
    public final void e(q qVar, int i6) {
        switch (this.f8970a) {
            case 0:
                f0 A = qVar.A(i6, 2);
                this.f8972c = A;
                A.f(this.f8971b.f8518c);
                return;
            default:
                f0 A2 = qVar.A(i6, 2);
                this.f8972c = A2;
                A2.f(this.f8971b.f8518c);
                return;
        }
    }

    @Override // n2.i
    public final void f(t tVar, long j, int i6, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        boolean z14;
        int i12 = this.f8970a;
        l lVar = this.f8971b;
        switch (i12) {
            case 0:
                u1.c.h(this.f8972c);
                int i13 = tVar.f12812b;
                int E = tVar.E();
                if ((E & 1024) > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((E & 512) == 0 && (E & 504) == 0 && (E & 7) == 0) {
                    if (z11) {
                        if (this.f8981m && this.f8975f > 0) {
                            f0 f0Var = this.f8972c;
                            f0Var.getClass();
                            f0Var.c(this.f8977h, this.f8979k ? 1 : 0, this.f8975f, 0, null);
                            this.f8975f = 0;
                            this.f8977h = -9223372036854775807L;
                            this.f8979k = false;
                            this.f8981m = false;
                        }
                        this.f8981m = true;
                        if ((tVar.h() & 252) < 128) {
                            u1.a.p("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                            return;
                        }
                        byte[] bArr = tVar.f12811a;
                        bArr[i13] = 0;
                        bArr[i13 + 1] = 0;
                        tVar.K(i13);
                    } else if (this.f8981m) {
                        int a10 = m2.i.a(this.f8976g);
                        if (i6 < a10) {
                            String str = a0.f12750a;
                            Locale locale = Locale.US;
                            u1.a.p("RtpH263Reader", "Received RTP packet with unexpected sequence number. Expected: " + a10 + "; received: " + i6 + ". Dropping packet.");
                            return;
                        }
                    } else {
                        u1.a.p("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                        return;
                    }
                    if (this.f8975f == 0) {
                        boolean z15 = this.f8980l;
                        int i14 = tVar.f12812b;
                        if (((tVar.A() >> 10) & 63) == 32) {
                            int h4 = tVar.h();
                            int i15 = (h4 >> 1) & 1;
                            if (!z15 && i15 == 0) {
                                int i16 = (h4 >> 2) & 7;
                                if (i16 == 1) {
                                    this.f8978i = 128;
                                    this.j = 96;
                                } else {
                                    int i17 = i16 - 2;
                                    this.f8978i = 176 << i17;
                                    this.j = 144 << i17;
                                }
                            }
                            tVar.K(i14);
                            if (i15 == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            this.f8979k = z12;
                        } else {
                            tVar.K(i14);
                            this.f8979k = false;
                        }
                        if (!this.f8980l && this.f8979k) {
                            int i18 = this.f8978i;
                            r1.q qVar = lVar.f8518c;
                            if (i18 != qVar.f11676u || this.j != qVar.f11677v) {
                                f0 f0Var2 = this.f8972c;
                                p a11 = qVar.a();
                                a11.f11617t = this.f8978i;
                                a11.f11618u = this.j;
                                r4.a.v(a11, f0Var2);
                            }
                            this.f8980l = true;
                        }
                    }
                    int a12 = tVar.a();
                    this.f8972c.a(a12, tVar);
                    this.f8975f += a12;
                    this.f8977h = a8.d.o(this.f8974e, j, this.f8973d, 90000);
                    if (z10) {
                        f0 f0Var3 = this.f8972c;
                        f0Var3.getClass();
                        f0Var3.c(this.f8977h, this.f8979k ? 1 : 0, this.f8975f, 0, null);
                        this.f8975f = 0;
                        this.f8977h = -9223372036854775807L;
                        this.f8979k = false;
                        this.f8981m = false;
                    }
                    this.f8976g = i6;
                    return;
                }
                u1.a.p("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                return;
            default:
                u1.c.h(this.f8972c);
                int y9 = tVar.y();
                if ((y9 & 8) == 8) {
                    if (this.f8979k && this.f8976g > 0) {
                        f0 f0Var4 = this.f8972c;
                        f0Var4.getClass();
                        f0Var4.c(this.f8977h, this.f8981m ? 1 : 0, this.f8976g, 0, null);
                        this.f8976g = -1;
                        this.f8977h = -9223372036854775807L;
                        this.f8979k = false;
                    }
                    this.f8979k = true;
                } else if (this.f8979k) {
                    int a13 = m2.i.a(this.f8975f);
                    if (i6 < a13) {
                        String str2 = a0.f12750a;
                        Locale locale2 = Locale.US;
                        u1.a.p("RtpVp9Reader", "Received RTP packet with unexpected sequence number. Expected: " + a13 + "; received: " + i6 + ". Dropping packet.");
                        return;
                    }
                } else {
                    u1.a.p("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                    return;
                }
                if ((y9 & 128) == 0 || (tVar.y() & 128) == 0 || tVar.a() >= 1) {
                    int i19 = y9 & 16;
                    if (i19 == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    u1.c.a("VP9 flexible mode is not supported.", z13);
                    if ((y9 & 32) != 0) {
                        tVar.L(1);
                        if (tVar.a() >= 1) {
                            if (i19 == 0) {
                                tVar.L(1);
                            }
                        } else {
                            return;
                        }
                    }
                    if ((y9 & 2) != 0) {
                        int y10 = tVar.y();
                        int i20 = (y10 >> 5) & 7;
                        if ((y10 & 16) != 0) {
                            int i21 = i20 + 1;
                            if (tVar.a() >= i21 * 4) {
                                for (int i22 = 0; i22 < i21; i22++) {
                                    this.f8978i = tVar.E();
                                    this.j = tVar.E();
                                }
                            } else {
                                return;
                            }
                        }
                        if ((y10 & 8) != 0) {
                            int y11 = tVar.y();
                            if (tVar.a() >= y11) {
                                for (int i23 = 0; i23 < y11; i23++) {
                                    int E2 = (tVar.E() & 12) >> 2;
                                    if (tVar.a() >= E2) {
                                        tVar.L(E2);
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    if (this.f8976g == -1 && this.f8979k) {
                        if ((tVar.h() & 4) == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        this.f8981m = z14;
                    }
                    if (!this.f8980l && (i10 = this.f8978i) != -1 && (i11 = this.j) != -1) {
                        r1.q qVar2 = lVar.f8518c;
                        if (i10 != qVar2.f11676u || i11 != qVar2.f11677v) {
                            f0 f0Var5 = this.f8972c;
                            p a14 = qVar2.a();
                            a14.f11617t = this.f8978i;
                            a14.f11618u = this.j;
                            r4.a.v(a14, f0Var5);
                        }
                        this.f8980l = true;
                    }
                    int a15 = tVar.a();
                    this.f8972c.a(a15, tVar);
                    int i24 = this.f8976g;
                    if (i24 == -1) {
                        this.f8976g = a15;
                    } else {
                        this.f8976g = i24 + a15;
                    }
                    this.f8977h = a8.d.o(this.f8974e, j, this.f8973d, 90000);
                    if (z10) {
                        f0 f0Var6 = this.f8972c;
                        f0Var6.getClass();
                        f0Var6.c(this.f8977h, this.f8981m ? 1 : 0, this.f8976g, 0, null);
                        this.f8976g = -1;
                        this.f8977h = -9223372036854775807L;
                        this.f8979k = false;
                    }
                    this.f8975f = i6;
                    return;
                }
                return;
        }
    }
}
