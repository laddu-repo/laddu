package d4;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4146e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f4147g;

    public h(List list) {
        this.f4142a = 0;
        this.f = list;
        this.f4147g = new w2.g0[list.size()];
        this.f4144c = -9223372036854775807L;
    }

    @Override // d4.i
    public final void a() {
        switch (this.f4142a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f4143b = false;
                this.f4144c = -9223372036854775807L;
                break;
            default:
                this.f4143b = false;
                this.f4144c = -9223372036854775807L;
                break;
        }
    }

    @Override // d4.i
    public final void b(w1.t tVar) {
        boolean z2;
        boolean z10;
        switch (this.f4142a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if (this.f4143b) {
                    if (this.f4145d == 2) {
                        if (tVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (tVar.x() != 32) {
                                this.f4143b = false;
                            }
                            this.f4145d--;
                            z10 = this.f4143b;
                        }
                        if (!z10) {
                        }
                    }
                    if (this.f4145d == 1) {
                        if (tVar.a() == 0) {
                            z2 = false;
                        } else {
                            if (tVar.x() != 0) {
                                this.f4143b = false;
                            }
                            this.f4145d--;
                            z2 = this.f4143b;
                        }
                        if (!z2) {
                        }
                    }
                    int i = tVar.f13739b;
                    int iA = tVar.a();
                    for (w2.g0 g0Var : (w2.g0[]) this.f4147g) {
                        tVar.J(i);
                        g0Var.d(iA, tVar);
                    }
                    this.f4146e += iA;
                }
                break;
            default:
                w1.t tVar2 = (w1.t) this.f;
                w1.a.k((w2.g0) this.f4147g);
                if (this.f4143b) {
                    int iA2 = tVar.a();
                    int i10 = this.f4146e;
                    if (i10 < 10) {
                        int iMin = Math.min(iA2, 10 - i10);
                        System.arraycopy(tVar.f13738a, tVar.f13739b, tVar2.f13738a, this.f4146e, iMin);
                        if (this.f4146e + iMin == 10) {
                            tVar2.J(0);
                            if (73 == tVar2.x() && 68 == tVar2.x() && 51 == tVar2.x()) {
                                tVar2.K(3);
                                this.f4145d = tVar2.w() + 10;
                            } else {
                                w1.a.C("Id3Reader", "Discarding invalid ID3 tag");
                                this.f4143b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.f4145d - this.f4146e);
                    ((w2.g0) this.f4147g).d(iMin2, tVar);
                    this.f4146e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // d4.i
    public final void c(boolean z2) {
        int i;
        switch (this.f4142a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if (this.f4143b) {
                    w1.a.j(this.f4144c != -9223372036854775807L);
                    for (w2.g0 g0Var : (w2.g0[]) this.f4147g) {
                        g0Var.a(this.f4144c, 1, this.f4146e, 0, null);
                    }
                    this.f4143b = false;
                }
                break;
            default:
                w1.a.k((w2.g0) this.f4147g);
                if (this.f4143b && (i = this.f4145d) != 0 && this.f4146e == i) {
                    w1.a.j(this.f4144c != -9223372036854775807L);
                    ((w2.g0) this.f4147g).a(this.f4144c, 1, this.f4145d, 0, null);
                    this.f4143b = false;
                    break;
                }
                break;
        }
    }

    @Override // d4.i
    public final void d(int i, long j8) {
        switch (this.f4142a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if ((i & 4) != 0) {
                    this.f4143b = true;
                    this.f4144c = j8;
                    this.f4146e = 0;
                    this.f4145d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.f4143b = true;
                    this.f4144c = j8;
                    this.f4145d = 0;
                    this.f4146e = 0;
                    break;
                }
                break;
        }
    }

    @Override // d4.i
    public final void e(w2.q qVar, g0 g0Var) {
        switch (this.f4142a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                w2.g0[] g0VarArr = (w2.g0[]) this.f4147g;
                for (int i = 0; i < g0VarArr.length; i++) {
                    f0 f0Var = (f0) ((List) this.f).get(i);
                    g0Var.a();
                    g0Var.b();
                    w2.g0 g0VarR = qVar.r(g0Var.f4140d, 3);
                    t1.n nVar = new t1.n();
                    g0Var.b();
                    nVar.f12026a = g0Var.f4141e;
                    nVar.f12035l = t1.f0.p("video/mp2t");
                    nVar.f12036m = t1.f0.p("application/dvbsubs");
                    nVar.f12039p = Collections.singletonList(f0Var.f4121b);
                    nVar.f12029d = f0Var.f4120a;
                    d0.d.r(nVar, g0VarR);
                    g0VarArr[i] = g0VarR;
                }
                break;
            default:
                g0Var.a();
                g0Var.b();
                w2.g0 g0VarR2 = qVar.r(g0Var.f4140d, 5);
                this.f4147g = g0VarR2;
                t1.n nVar2 = new t1.n();
                g0Var.b();
                nVar2.f12026a = g0Var.f4141e;
                nVar2.f12035l = t1.f0.p("video/mp2t");
                nVar2.f12036m = t1.f0.p("application/id3");
                d0.d.r(nVar2, g0VarR2);
                break;
        }
    }

    public h() {
        this.f4142a = 1;
        this.f = new w1.t(10);
        this.f4144c = -9223372036854775807L;
    }
}
