package d4;

import androidx.fragment.app.d1;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.g0[] f4076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cf.k f4077d;

    public d0(int i, List list) {
        this.f4074a = i;
        switch (i) {
            case 1:
                this.f4075b = list;
                this.f4076c = new w2.g0[list.size()];
                cf.k kVar = new cf.k(new d1(15, this));
                this.f4077d = kVar;
                kVar.I(3);
                break;
            default:
                this.f4075b = list;
                this.f4076c = new w2.g0[list.size()];
                this.f4077d = new cf.k(new d1(14, this));
                break;
        }
    }

    public void a(long j8, w1.t tVar) {
        if (tVar.a() < 9) {
            return;
        }
        int iJ = tVar.j();
        int iJ2 = tVar.j();
        int iX = tVar.x();
        if (iJ == 434 && iJ2 == 1195456820 && iX == 3) {
            this.f4077d.a(j8, tVar);
        }
    }

    public final void b(w2.q qVar, g0 g0Var) {
        switch (this.f4074a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int i = 0;
                while (true) {
                    w2.g0[] g0VarArr = this.f4076c;
                    if (i < g0VarArr.length) {
                        g0Var.a();
                        g0Var.b();
                        w2.g0 g0VarR = qVar.r(g0Var.f4140d, 3);
                        t1.o oVar = (t1.o) this.f4075b.get(i);
                        String str = oVar.f12061n;
                        w1.a.c("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                        String str2 = oVar.f12050a;
                        if (str2 == null) {
                            g0Var.b();
                            str2 = g0Var.f4141e;
                        }
                        t1.n nVar = new t1.n();
                        nVar.f12026a = str2;
                        nVar.f12035l = t1.f0.p("video/mp2t");
                        nVar.f12036m = t1.f0.p(str);
                        nVar.f12030e = oVar.f12054e;
                        nVar.f12029d = oVar.f12053d;
                        nVar.J = oVar.K;
                        nVar.f12039p = oVar.f12064q;
                        d0.d.r(nVar, g0VarR);
                        g0VarArr[i] = g0VarR;
                        i++;
                    }
                    break;
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    w2.g0[] g0VarArr2 = this.f4076c;
                    if (i10 < g0VarArr2.length) {
                        g0Var.a();
                        g0Var.b();
                        w2.g0 g0VarR2 = qVar.r(g0Var.f4140d, 3);
                        t1.o oVar2 = (t1.o) this.f4075b.get(i10);
                        String str3 = oVar2.f12061n;
                        w1.a.c("Invalid closed caption MIME type provided: " + str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                        t1.n nVar2 = new t1.n();
                        g0Var.b();
                        nVar2.f12026a = g0Var.f4141e;
                        nVar2.f12035l = t1.f0.p("video/mp2t");
                        nVar2.f12036m = t1.f0.p(str3);
                        nVar2.f12030e = oVar2.f12054e;
                        nVar2.f12029d = oVar2.f12053d;
                        nVar2.J = oVar2.K;
                        nVar2.f12039p = oVar2.f12064q;
                        d0.d.r(nVar2, g0VarR2);
                        g0VarArr2[i10] = g0VarR2;
                        i10++;
                    }
                    break;
                }
                break;
        }
    }
}
