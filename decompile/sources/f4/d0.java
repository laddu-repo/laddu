package f4;

import java.util.List;
import r1.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4737a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4738b;

    /* renamed from: c, reason: collision with root package name */
    public final y2.f0[] f4739c;

    /* renamed from: d, reason: collision with root package name */
    public final o4.j f4740d;

    public d0(int i6, List list) {
        this.f4737a = i6;
        switch (i6) {
            case 1:
                this.f4738b = list;
                this.f4739c = new y2.f0[list.size()];
                o4.j jVar = new o4.j(new a2.e0(this, 19));
                this.f4740d = jVar;
                jVar.v(3);
                return;
            default:
                this.f4738b = list;
                this.f4739c = new y2.f0[list.size()];
                this.f4740d = new o4.j(new a2.e0(this, 18));
                return;
        }
    }

    public void a(long j, u1.t tVar) {
        if (tVar.a() >= 9) {
            int k8 = tVar.k();
            int k9 = tVar.k();
            int y9 = tVar.y();
            if (k8 == 434 && k9 == 1195456820 && y9 == 3) {
                this.f4740d.a(j, tVar);
            }
        }
    }

    public final void b(y2.q qVar, h0 h0Var) {
        boolean z10;
        boolean z11;
        switch (this.f4737a) {
            case 0:
                int i6 = 0;
                while (true) {
                    y2.f0[] f0VarArr = this.f4739c;
                    if (i6 < f0VarArr.length) {
                        h0Var.a();
                        h0Var.b();
                        y2.f0 A = qVar.A(h0Var.f4814d, 3);
                        r1.q qVar2 = (r1.q) this.f4738b.get(i6);
                        String str = qVar2.f11670n;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        u1.c.a("Invalid closed caption MIME type provided: " + str, z10);
                        String str2 = qVar2.f11658a;
                        if (str2 == null) {
                            h0Var.b();
                            str2 = h0Var.f4815e;
                        }
                        r1.p pVar = new r1.p();
                        pVar.f11600a = str2;
                        pVar.f11610l = k0.p("video/mp2t");
                        pVar.f11611m = k0.p(str);
                        pVar.f11604e = qVar2.f11662e;
                        pVar.f11603d = qVar2.f11661d;
                        pVar.J = qVar2.K;
                        pVar.f11614p = qVar2.f11673q;
                        r4.a.v(pVar, A);
                        f0VarArr[i6] = A;
                        i6++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    y2.f0[] f0VarArr2 = this.f4739c;
                    if (i10 < f0VarArr2.length) {
                        h0Var.a();
                        h0Var.b();
                        y2.f0 A2 = qVar.A(h0Var.f4814d, 3);
                        r1.q qVar3 = (r1.q) this.f4738b.get(i10);
                        String str3 = qVar3.f11670n;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        u1.c.a("Invalid closed caption MIME type provided: " + str3, z11);
                        r1.p pVar2 = new r1.p();
                        h0Var.b();
                        pVar2.f11600a = h0Var.f4815e;
                        pVar2.f11610l = k0.p("video/mp2t");
                        pVar2.f11611m = k0.p(str3);
                        pVar2.f11604e = qVar3.f11662e;
                        pVar2.f11603d = qVar3.f11661d;
                        pVar2.J = qVar3.K;
                        pVar2.f11614p = qVar3.f11673q;
                        r4.a.v(pVar2, A2);
                        f0VarArr2[i10] = A2;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
