package w2;

import a2.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f13609x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s8.l f13610y;

    public /* synthetic */ c0(s8.l lVar, int i6, long j) {
        this.f13609x = 3;
        this.f13610y = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f13609x;
        s8.l lVar = this.f13610y;
        switch (i6) {
            case 0:
                e0 e0Var = (e0) lVar.f12252z;
                String str = u1.a0.f12750a;
                b2.f fVar = ((k0) e0Var).f295x.Q;
                fVar.W(fVar.V(), 1016, new a2.t(20));
                return;
            case 1:
                e0 e0Var2 = (e0) lVar.f12252z;
                String str2 = u1.a0.f12750a;
                b2.f fVar2 = ((k0) e0Var2).f295x.Q;
                fVar2.W(fVar2.V(), 1030, new b2.c(28));
                return;
            case 2:
                e0 e0Var3 = (e0) lVar.f12252z;
                String str3 = u1.a0.f12750a;
                b2.f fVar3 = ((k0) e0Var3).f295x.Q;
                fVar3.W(fVar3.V(), 1019, new a2.t(10));
                return;
            case 3:
                e0 e0Var4 = (e0) lVar.f12252z;
                String str4 = u1.a0.f12750a;
                b2.f fVar4 = ((k0) e0Var4).f295x.Q;
                fVar4.W(fVar4.S((q2.c0) fVar4.A.f900e), 1018, new b2.c(0));
                return;
            case 4:
                e0 e0Var5 = (e0) lVar.f12252z;
                String str5 = u1.a0.f12750a;
                b2.f fVar5 = ((k0) e0Var5).f295x.Q;
                fVar5.W(fVar5.S((q2.c0) fVar5.A.f900e), 1021, new b2.c(1));
                return;
            case 5:
                e0 e0Var6 = (e0) lVar.f12252z;
                String str6 = u1.a0.f12750a;
                b2.f fVar6 = ((k0) e0Var6).f295x.Q;
                fVar6.W(fVar6.V(), 1015, new b2.c(11));
                return;
            default:
                e0 e0Var7 = (e0) lVar.f12252z;
                String str7 = u1.a0.f12750a;
                b2.f fVar7 = ((k0) e0Var7).f295x.Q;
                fVar7.W(fVar7.V(), 1017, new b2.c(7));
                return;
        }
    }

    public /* synthetic */ c0(s8.l lVar, long j, int i6) {
        this.f13609x = 4;
        this.f13610y = lVar;
    }

    public /* synthetic */ c0(s8.l lVar, Object obj, int i6) {
        this.f13609x = i6;
        this.f13610y = lVar;
    }

    public /* synthetic */ c0(s8.l lVar, String str, long j, long j10) {
        this.f13609x = 0;
        this.f13610y = lVar;
    }

    public /* synthetic */ c0(s8.l lVar, r1.q qVar, a2.i iVar) {
        this.f13609x = 6;
        this.f13610y = lVar;
    }
}
