package f4;

import com.unity3d.services.UnityAdsConstants;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Settings;
import r1.k0;
import r1.l0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final u1.t f4786a;

    /* renamed from: c, reason: collision with root package name */
    public final String f4788c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4789d;

    /* renamed from: f, reason: collision with root package name */
    public String f4791f;

    /* renamed from: g, reason: collision with root package name */
    public y2.f0 f4792g;

    /* renamed from: i, reason: collision with root package name */
    public int f4794i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f4795k;

    /* renamed from: l, reason: collision with root package name */
    public r1.q f4796l;

    /* renamed from: m, reason: collision with root package name */
    public int f4797m;

    /* renamed from: n, reason: collision with root package name */
    public int f4798n;

    /* renamed from: h, reason: collision with root package name */
    public int f4793h = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f4801q = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f4787b = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    public int f4799o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f4800p = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String f4790e = "video/mp2t";

    public g(String str, int i6, int i10) {
        this.f4786a = new u1.t(new byte[i10]);
        this.f4788c = str;
        this.f4789d = i6;
    }

    @Override // f4.i
    public final void a(u1.t tVar) {
        boolean z10;
        int i6;
        int i10;
        int i11;
        byte b10;
        int i12;
        byte b11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        long j;
        long j10;
        int i21;
        int i22;
        long j11;
        int i23;
        int i24;
        long j12;
        int i25;
        int i26;
        int i27;
        u1.c.h(this.f4792g);
        while (tVar.a() > 0) {
            int i28 = this.f4793h;
            u1.t tVar2 = this.f4786a;
            switch (i28) {
                case 0:
                    while (true) {
                        if (tVar.a() > 0) {
                            int i29 = this.j << 8;
                            this.j = i29;
                            int y9 = i29 | tVar.y();
                            this.j = y9;
                            if (y9 != 2147385345 && y9 != -25230976 && y9 != 536864768 && y9 != -14745368) {
                                if (y9 != 1683496997 && y9 != 622876772) {
                                    if (y9 != 1078008818 && y9 != -233094848) {
                                        if (y9 != 1908687592 && y9 != -398277519) {
                                            i10 = 0;
                                        } else {
                                            i10 = 4;
                                        }
                                    } else {
                                        i10 = 3;
                                    }
                                } else {
                                    i10 = 2;
                                }
                            } else {
                                i10 = 1;
                            }
                            this.f4798n = i10;
                            if (i10 != 0) {
                                byte[] bArr = tVar2.f12811a;
                                bArr[0] = (byte) ((y9 >> 24) & 255);
                                bArr[1] = (byte) ((y9 >> 16) & 255);
                                bArr[2] = (byte) ((y9 >> 8) & 255);
                                bArr[3] = (byte) (y9 & 255);
                                this.f4794i = 4;
                                this.j = 0;
                                if (i10 != 3 && i10 != 4) {
                                    if (i10 == 1) {
                                        this.f4793h = 1;
                                        break;
                                    } else {
                                        this.f4793h = 2;
                                        break;
                                    }
                                } else {
                                    this.f4793h = 4;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!b(tVar, tVar2.f12811a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = tVar2.f12811a;
                        if (this.f4796l == null) {
                            String str = this.f4791f;
                            u1.s m9 = y2.a.m(bArr2);
                            m9.t(60);
                            int i30 = y2.a.j[m9.i(6)];
                            int i31 = y2.a.f14835k[m9.i(4)];
                            int i32 = m9.i(5);
                            int[] iArr = y2.a.f14836l;
                            if (i32 >= 29) {
                                i13 = -1;
                            } else {
                                i13 = (iArr[i32] * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT) / 2;
                            }
                            m9.t(10);
                            if (m9.i(2) > 0) {
                                i14 = 1;
                            } else {
                                i14 = 0;
                            }
                            int i33 = i30 + i14;
                            r1.p pVar = new r1.p();
                            pVar.f11600a = str;
                            pVar.f11610l = k0.p(this.f4790e);
                            pVar.f11611m = k0.p("audio/vnd.dts");
                            pVar.f11607h = i13;
                            pVar.E = i33;
                            pVar.F = i31;
                            pVar.f11615q = null;
                            pVar.f11603d = this.f4788c;
                            pVar.f11605f = this.f4789d;
                            r1.q qVar = new r1.q(pVar);
                            this.f4796l = qVar;
                            this.f4792g.f(qVar);
                        }
                        this.f4797m = y2.a.j(bArr2);
                        byte b12 = bArr2[0];
                        if (b12 != -2) {
                            if (b12 != -1) {
                                if (b12 != 31) {
                                    i11 = (bArr2[4] & 1) << 6;
                                    b10 = bArr2[5];
                                } else {
                                    i11 = (bArr2[5] & 7) << 4;
                                    b11 = bArr2[6];
                                }
                            } else {
                                i11 = (bArr2[4] & 7) << 4;
                                b11 = bArr2[7];
                            }
                            i12 = b11 & 60;
                            this.f4795k = a8.f.G(u1.a0.W(this.f4796l.G, (((i12 >> 2) | i11) + 1) * 32));
                            tVar2.K(0);
                            this.f4792g.a(18, tVar2);
                            this.f4793h = 6;
                            break;
                        } else {
                            i11 = (bArr2[5] & 1) << 6;
                            b10 = bArr2[4];
                        }
                        i12 = b10 & 252;
                        this.f4795k = a8.f.G(u1.a0.W(this.f4796l.G, (((i12 >> 2) | i11) + 1) * 32));
                        tVar2.K(0);
                        this.f4792g.a(18, tVar2);
                        this.f4793h = 6;
                    }
                case 2:
                    int i34 = 12;
                    if (b(tVar, tVar2.f12811a, 7)) {
                        u1.s m10 = y2.a.m(tVar2.f12811a);
                        m10.t(42);
                        if (!m10.h()) {
                            i34 = 8;
                        }
                        this.f4799o = m10.i(i34) + 1;
                        this.f4793h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (b(tVar, tVar2.f12811a, this.f4799o)) {
                        u1.s m11 = y2.a.m(tVar2.f12811a);
                        m11.t(40);
                        int i35 = m11.i(2);
                        if (!m11.h()) {
                            i15 = 16;
                            i16 = 8;
                        } else {
                            i15 = 20;
                            i16 = 12;
                        }
                        m11.t(i16);
                        int i36 = m11.i(i15) + 1;
                        boolean h4 = m11.h();
                        if (h4) {
                            i17 = m11.i(2);
                            i18 = (m11.i(3) + 1) * 512;
                            if (m11.h()) {
                                m11.t(36);
                            }
                            int i37 = m11.i(3) + 1;
                            int i38 = m11.i(3) + 1;
                            if (i37 == 1 && i38 == 1) {
                                int i39 = i35 + 1;
                                int i40 = m11.i(i39);
                                for (int i41 = 0; i41 < i39; i41++) {
                                    if (((i40 >> i41) & 1) == 1) {
                                        m11.t(8);
                                    }
                                }
                                if (m11.h()) {
                                    m11.t(2);
                                    int i42 = (m11.i(2) + 1) << 2;
                                    int i43 = m11.i(2) + 1;
                                    for (int i44 = 0; i44 < i43; i44++) {
                                        m11.t(i42);
                                    }
                                }
                            } else {
                                throw l0.c("Multiple audio presentations or assets not supported");
                            }
                        } else {
                            i17 = -1;
                            i18 = 0;
                        }
                        m11.t(i15);
                        m11.t(12);
                        if (h4) {
                            if (m11.h()) {
                                m11.t(4);
                            }
                            if (m11.h()) {
                                m11.t(24);
                            }
                            if (m11.h()) {
                                m11.u(m11.i(10) + 1);
                            }
                            m11.t(5);
                            int i45 = y2.a.f14837m[m11.i(4)];
                            i19 = m11.i(8) + 1;
                            i20 = i45;
                        } else {
                            i19 = -1;
                            i20 = -2147483647;
                        }
                        if (h4) {
                            if (i17 != 0) {
                                if (i17 != 1) {
                                    if (i17 == 2) {
                                        i21 = 48000;
                                    } else {
                                        throw l0.a(null, "Unsupported reference clock code in DTS HD header: " + i17);
                                    }
                                } else {
                                    i21 = 44100;
                                }
                            } else {
                                i21 = 32000;
                            }
                            String str2 = u1.a0.f12750a;
                            j = u1.a0.Y(i18, 1000000L, i21, RoundingMode.DOWN);
                        } else {
                            j = -9223372036854775807L;
                        }
                        g(new jd.s("audio/vnd.dts.hd;profile=lbr", i19, i20, i36, j));
                        this.f4797m = i36;
                        if (j == -9223372036854775807L) {
                            j10 = 0;
                        } else {
                            j10 = j;
                        }
                        this.f4795k = j10;
                        tVar2.K(0);
                        this.f4792g.a(this.f4799o, tVar2);
                        this.f4793h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (b(tVar, tVar2.f12811a, 6)) {
                        u1.s m12 = y2.a.m(tVar2.f12811a);
                        m12.t(32);
                        int u3 = y2.a.u(m12, y2.a.f14842r) + 1;
                        this.f4800p = u3;
                        int i46 = this.f4794i;
                        if (i46 > u3) {
                            int i47 = i46 - u3;
                            this.f4794i = i46 - i47;
                            tVar.K(tVar.f12812b - i47);
                        }
                        this.f4793h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (b(tVar, tVar2.f12811a, this.f4800p)) {
                        byte[] bArr3 = tVar2.f12811a;
                        u1.s m13 = y2.a.m(bArr3);
                        if (m13.i(32) == 1078008818) {
                            i22 = 1;
                        } else {
                            i22 = 0;
                        }
                        int u10 = y2.a.u(m13, y2.a.f14838n);
                        int i48 = u10 + 1;
                        if (i22 != 0) {
                            if (m13.h()) {
                                int i49 = u10 - 1;
                                int i50 = ((bArr3[i49] << 8) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (bArr3[u10] & 255);
                                String str3 = u1.a0.f12750a;
                                int i51 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                for (int i52 = 0; i52 < i49; i52++) {
                                    byte b13 = bArr3[i52];
                                    int i53 = (((i51 >> 12) & 255) ^ ((b13 & 255) >> 4)) & 255;
                                    int i54 = (i51 << 4) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                    int[] iArr2 = u1.a0.f12759k;
                                    int i55 = (iArr2[i53] ^ i54) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                    i51 = (iArr2[((b13 & 15) ^ ((i55 >> 12) & 255)) & 255] ^ ((i55 << 4) & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                }
                                if (i50 == i51) {
                                    int i56 = m13.i(2);
                                    if (i56 != 0) {
                                        if (i56 != 1) {
                                            if (i56 == 2) {
                                                i26 = 384;
                                            } else {
                                                throw l0.a(null, "Unsupported base duration index in DTS UHD header: " + i56);
                                            }
                                        } else {
                                            i26 = 480;
                                        }
                                        i25 = 3;
                                    } else {
                                        i25 = 3;
                                        i26 = 512;
                                    }
                                    int i57 = (m13.i(i25) + 1) * i26;
                                    int i58 = m13.i(2);
                                    if (i58 != 0) {
                                        if (i58 != 1) {
                                            if (i58 == 2) {
                                                i27 = 48000;
                                            } else {
                                                throw l0.a(null, "Unsupported clock rate index in DTS UHD header: " + i58);
                                            }
                                        } else {
                                            i27 = 44100;
                                        }
                                    } else {
                                        i27 = 32000;
                                    }
                                    if (m13.h()) {
                                        m13.t(36);
                                    }
                                    int i59 = i27 * (1 << m13.i(2));
                                    j11 = u1.a0.Y(i57, 1000000L, i27, RoundingMode.DOWN);
                                    i23 = i59;
                                } else {
                                    throw l0.a(null, "CRC check failed");
                                }
                            } else {
                                throw l0.c("Only supports full channel mask-based audio presentation");
                            }
                        } else {
                            j11 = -9223372036854775807L;
                            i23 = -2147483647;
                        }
                        int i60 = 0;
                        for (int i61 = 0; i61 < i22; i61++) {
                            i60 += y2.a.u(m13, y2.a.f14839o);
                        }
                        AtomicInteger atomicInteger = this.f4787b;
                        if (i22 != 0) {
                            atomicInteger.set(y2.a.u(m13, y2.a.f14840p));
                        }
                        if (atomicInteger.get() != 0) {
                            i24 = y2.a.u(m13, y2.a.f14841q);
                        } else {
                            i24 = 0;
                        }
                        int i62 = i60 + i24 + i48;
                        long j13 = j11;
                        jd.s sVar = new jd.s("audio/vnd.dts.uhd;profile=p2", 2, i23, i62, j13);
                        if (this.f4798n == 3) {
                            g(sVar);
                        }
                        this.f4797m = i62;
                        if (j13 == -9223372036854775807L) {
                            j12 = 0;
                        } else {
                            j12 = j13;
                        }
                        this.f4795k = j12;
                        tVar2.K(0);
                        this.f4792g.a(this.f4800p, tVar2);
                        this.f4793h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(tVar.a(), this.f4797m - this.f4794i);
                    this.f4792g.a(min, tVar);
                    int i63 = this.f4794i + min;
                    this.f4794i = i63;
                    if (i63 != this.f4797m) {
                        break;
                    } else {
                        if (this.f4801q != -9223372036854775807L) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        u1.c.g(z10);
                        y2.f0 f0Var = this.f4792g;
                        long j14 = this.f4801q;
                        if (this.f4798n == 4) {
                            i6 = 0;
                        } else {
                            i6 = 1;
                        }
                        f0Var.c(j14, i6, this.f4797m, 0, null);
                        this.f4801q += this.f4795k;
                        this.f4793h = 0;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public final boolean b(u1.t tVar, byte[] bArr, int i6) {
        int min = Math.min(tVar.a(), i6 - this.f4794i);
        tVar.i(bArr, this.f4794i, min);
        int i10 = this.f4794i + min;
        this.f4794i = i10;
        if (i10 == i6) {
            return true;
        }
        return false;
    }

    @Override // f4.i
    public final void c() {
        this.f4793h = 0;
        this.f4794i = 0;
        this.j = 0;
        this.f4801q = -9223372036854775807L;
        this.f4787b.set(0);
    }

    @Override // f4.i
    public final void e(int i6, long j) {
        this.f4801q = j;
    }

    @Override // f4.i
    public final void f(y2.q qVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f4791f = h0Var.f4815e;
        h0Var.b();
        this.f4792g = qVar.A(h0Var.f4814d, 1);
    }

    public final void g(jd.s sVar) {
        r1.p a10;
        int i6 = sVar.f7405a;
        String str = sVar.f7407c;
        int i10 = sVar.f7406b;
        if (i6 != -2147483647 && i10 != -1) {
            r1.q qVar = this.f4796l;
            if (qVar == null || i10 != qVar.F || i6 != qVar.G || !str.equals(qVar.f11670n)) {
                r1.q qVar2 = this.f4796l;
                if (qVar2 == null) {
                    a10 = new r1.p();
                } else {
                    a10 = qVar2.a();
                }
                a10.f11600a = this.f4791f;
                a10.f11610l = k0.p(this.f4790e);
                a10.f11611m = k0.p(str);
                a10.E = i10;
                a10.F = i6;
                a10.f11603d = this.f4788c;
                a10.f11605f = this.f4789d;
                r1.q qVar3 = new r1.q(a10);
                this.f4796l = qVar3;
                this.f4792g.f(qVar3);
            }
        }
    }

    @Override // f4.i
    public final void d(boolean z10) {
    }
}
