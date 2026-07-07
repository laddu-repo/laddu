package n2;

import java.util.Locale;
import java.util.TreeMap;
import m2.l;
import okhttp3.internal.http2.Settings;
import r1.l0;
import u1.a0;
import u1.t;
import v1.o;
import y2.f0;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8982a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8983b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8984c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8985d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8986e;

    /* renamed from: f, reason: collision with root package name */
    public int f8987f;

    /* renamed from: g, reason: collision with root package name */
    public long f8988g;

    /* renamed from: h, reason: collision with root package name */
    public int f8989h;

    /* renamed from: i, reason: collision with root package name */
    public int f8990i;
    public long j;

    public e(String str, String str2, long j, int i6, int i10, int i11, int[] iArr, TreeMap treeMap) {
        this.f8982a = 2;
        this.f8983b = str;
        this.f8984c = str2;
        this.f8988g = j;
        this.j = 0L;
        this.f8987f = i6;
        this.f8989h = i10;
        this.f8990i = i11;
        this.f8985d = iArr;
        this.f8986e = treeMap;
    }

    @Override // n2.i
    public void c(long j, long j10) {
        switch (this.f8982a) {
            case 0:
                this.f8988g = j;
                this.f8990i = 0;
                this.j = j10;
                return;
            default:
                this.f8988g = j;
                this.f8990i = 0;
                this.j = j10;
                return;
        }
    }

    @Override // n2.i
    public void d(long j) {
        int i6 = this.f8982a;
    }

    @Override // n2.i
    public void e(q qVar, int i6) {
        switch (this.f8982a) {
            case 0:
                f0 A = qVar.A(i6, 2);
                this.f8986e = A;
                String str = a0.f12750a;
                A.f(((l) this.f8985d).f8518c);
                return;
            default:
                f0 A2 = qVar.A(i6, 2);
                this.f8986e = A2;
                A2.f(((l) this.f8985d).f8518c);
                return;
        }
    }

    @Override // n2.i
    public void f(t tVar, long j, int i6, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11 = this.f8982a;
        Object obj = this.f8983b;
        int i12 = 1;
        switch (i11) {
            case 0:
                try {
                    int i13 = tVar.f12811a[0] & 31;
                    u1.c.h((f0) this.f8986e);
                    if (i13 > 0 && i13 < 24) {
                        int a10 = tVar.a();
                        this.f8990i = g() + this.f8990i;
                        ((f0) this.f8986e).a(a10, tVar);
                        this.f8990i += a10;
                        if ((tVar.f12811a[0] & 31) != 5) {
                            i12 = 0;
                        }
                        this.f8987f = i12;
                    } else if (i13 == 24) {
                        tVar.y();
                        while (tVar.a() > 4) {
                            int E = tVar.E();
                            this.f8990i = g() + this.f8990i;
                            ((f0) this.f8986e).a(E, tVar);
                            this.f8990i += E;
                        }
                        this.f8987f = 0;
                    } else if (i13 == 28) {
                        t tVar2 = (t) obj;
                        byte[] bArr = tVar.f12811a;
                        byte b10 = bArr[0];
                        byte b11 = bArr[1];
                        int i14 = (b10 & 224) | (b11 & 31);
                        if ((b11 & 128) > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((b11 & 64) > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11) {
                            this.f8990i = g() + this.f8990i;
                            byte[] bArr2 = tVar.f12811a;
                            bArr2[1] = (byte) i14;
                            tVar2.getClass();
                            tVar2.I(bArr2.length, bArr2);
                            tVar2.K(1);
                        } else {
                            int a11 = m2.i.a(this.f8989h);
                            if (i6 != a11) {
                                String str = a0.f12750a;
                                Locale locale = Locale.US;
                                u1.a.p("RtpH264Reader", "Received RTP packet with unexpected sequence number. Expected: " + a11 + "; received: " + i6 + ". Dropping packet.");
                            } else {
                                byte[] bArr3 = tVar.f12811a;
                                tVar2.getClass();
                                tVar2.I(bArr3.length, bArr3);
                                tVar2.K(2);
                            }
                        }
                        int a12 = tVar2.a();
                        ((f0) this.f8986e).a(a12, tVar2);
                        this.f8990i += a12;
                        if (z12) {
                            if ((i14 & 31) != 5) {
                                i12 = 0;
                            }
                            this.f8987f = i12;
                        }
                    } else {
                        throw l0.b(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i13)), null);
                    }
                    if (z10) {
                        if (this.f8988g == -9223372036854775807L) {
                            this.f8988g = j;
                        }
                        ((f0) this.f8986e).c(a8.d.o(this.j, j, this.f8988g, 90000), this.f8987f, this.f8990i, 0, null);
                        this.f8990i = 0;
                    }
                    this.f8989h = i6;
                    return;
                } catch (IndexOutOfBoundsException e10) {
                    throw l0.b(null, e10);
                }
            default:
                byte[] bArr4 = tVar.f12811a;
                if (bArr4.length != 0) {
                    int i15 = (bArr4[0] >> 1) & 63;
                    u1.c.h((f0) this.f8986e);
                    if (i15 >= 0 && i15 < 48) {
                        int a13 = tVar.a();
                        this.f8990i = h() + this.f8990i;
                        ((f0) this.f8986e).a(a13, tVar);
                        this.f8990i += a13;
                        int i16 = (tVar.f12811a[0] >> 1) & 63;
                        if (i16 != 19 && i16 != 20) {
                            i12 = 0;
                        }
                        this.f8987f = i12;
                    } else if (i15 == 48) {
                        tVar.K(2);
                        int i17 = 0;
                        while (tVar.a() > 2) {
                            int E2 = tVar.E();
                            int i18 = (tVar.f12811a[tVar.f12812b] & 126) >> 1;
                            if (tVar.a() >= E2) {
                                this.f8990i = h() + this.f8990i;
                                ((f0) this.f8986e).a(E2, tVar);
                                this.f8990i += E2;
                                int i19 = this.f8987f;
                                if (i18 != 19 && i18 != 20) {
                                    i10 = 0;
                                } else {
                                    i10 = 1;
                                }
                                this.f8987f = i19 | i10;
                                i17++;
                            } else {
                                throw l0.b("Malformed Aggregation Packet. NAL unit size exceeds packet size.", null);
                            }
                        }
                        if (tVar.a() <= 0) {
                            if (i17 < 2) {
                                throw l0.b("Aggregation Packet must contain at least 2 NAL units.", null);
                            }
                        } else {
                            throw l0.b("Malformed Aggregation Packet. Packet size exceeds NAL unit size.", null);
                        }
                    } else if (i15 == 49) {
                        t tVar3 = (t) obj;
                        byte[] bArr5 = tVar.f12811a;
                        if (bArr5.length >= 3) {
                            int i20 = bArr5[1] & 7;
                            byte b12 = bArr5[2];
                            int i21 = b12 & 63;
                            if ((b12 & 128) > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if ((b12 & 64) > 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z13) {
                                this.f8990i = h() + this.f8990i;
                                byte[] bArr6 = tVar.f12811a;
                                bArr6[1] = (byte) ((i21 << 1) & 127);
                                bArr6[2] = (byte) i20;
                                tVar3.getClass();
                                tVar3.I(bArr6.length, bArr6);
                                tVar3.K(1);
                            } else {
                                int i22 = (this.f8989h + 1) % Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                if (i6 != i22) {
                                    String str2 = a0.f12750a;
                                    Locale locale2 = Locale.US;
                                    u1.a.p("RtpH265Reader", "Received RTP packet with unexpected sequence number. Expected: " + i22 + "; received: " + i6 + ". Dropping packet.");
                                } else {
                                    tVar3.getClass();
                                    tVar3.I(bArr5.length, bArr5);
                                    tVar3.K(3);
                                }
                            }
                            int a14 = tVar3.a();
                            ((f0) this.f8986e).a(a14, tVar3);
                            this.f8990i += a14;
                            if (z14) {
                                if (i21 != 19 && i21 != 20) {
                                    i12 = 0;
                                }
                                this.f8987f = i12;
                            }
                        } else {
                            throw l0.b("Malformed FU header.", null);
                        }
                    } else {
                        throw l0.b(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i15)), null);
                    }
                    if (z10) {
                        if (this.f8988g == -9223372036854775807L) {
                            this.f8988g = j;
                        }
                        ((f0) this.f8986e).c(a8.d.o(this.j, j, this.f8988g, 90000), this.f8987f, this.f8990i, 0, null);
                        this.f8990i = 0;
                    }
                    this.f8989h = i6;
                    return;
                }
                throw l0.b("Empty RTP data packet.", null);
        }
    }

    public int g() {
        t tVar = (t) this.f8984c;
        tVar.K(0);
        int a10 = tVar.a();
        f0 f0Var = (f0) this.f8986e;
        f0Var.getClass();
        f0Var.a(a10, tVar);
        return a10;
    }

    public int h() {
        t tVar = (t) this.f8984c;
        tVar.K(0);
        int a10 = tVar.a();
        f0 f0Var = (f0) this.f8986e;
        f0Var.getClass();
        f0Var.a(a10, tVar);
        return a10;
    }

    public e(l lVar, int i6) {
        this.f8982a = i6;
        switch (i6) {
            case 1:
                this.f8983b = new t();
                this.f8984c = new t(o.f13247a);
                this.f8985d = lVar;
                this.f8988g = -9223372036854775807L;
                this.f8989h = -1;
                return;
            default:
                this.f8984c = new t(o.f13247a);
                this.f8985d = lVar;
                this.f8983b = new t();
                this.f8988g = -9223372036854775807L;
                this.f8989h = -1;
                return;
        }
    }

    private final void a(long j) {
    }

    private final void b(long j) {
    }
}
