package com.google.firebase.sessions;

import a7.j;
import a7.u;
import ac.i;
import ac.m;
import ac.p;
import ac.v;
import ac.w;
import ac.x;
import ac.y;
import android.content.Context;
import androidx.annotation.Keep;
import com.bumptech.glide.e;
import com.google.firebase.components.ComponentRegistrar;
import fa.g;
import java.util.List;
import k8.k2;
import la.a;
import la.b;
import ma.c;
import ma.s;
import nb.d;
import o.o3;
import sd.h;
import x6.f;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final y Companion = new y();
    private static final s appContext = s.a(Context.class);
    private static final s firebaseApp = s.a(g.class);
    private static final s firebaseInstallationsApi = s.a(d.class);
    private static final s backgroundDispatcher = new s(a.class, me.s.class);
    private static final s blockingDispatcher = new s(b.class, me.s.class);
    private static final s transportFactory = s.a(f.class);
    private static final s firebaseSessionsComponent = s.a(v.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final p getComponents$lambda$0(c cVar) {
        return (p) ((i) ((v) cVar.h(firebaseSessionsComponent))).f402p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v getComponents$lambda$1(c cVar) {
        Object objH = cVar.h(appContext);
        de.i.d(objH, "get(...)");
        Object objH2 = cVar.h(backgroundDispatcher);
        de.i.d(objH2, "get(...)");
        Object objH3 = cVar.h(blockingDispatcher);
        de.i.d(objH3, "get(...)");
        Object objH4 = cVar.h(firebaseApp);
        de.i.d(objH4, "get(...)");
        Object objH5 = cVar.h(firebaseInstallationsApi);
        de.i.d(objH5, "get(...)");
        mb.b bVarI = cVar.i(transportFactory);
        de.i.d(bVarI, "getProvider(...)");
        i iVar = new i();
        iVar.f389a = cc.c.a((g) objH4);
        cc.c cVarA = cc.c.a((Context) objH);
        iVar.f390b = cVarA;
        iVar.f391c = cc.a.a(new m(cVarA, 1));
        iVar.f392d = cc.a.a(x.f463a);
        iVar.f393e = cc.c.a((d) objH5);
        iVar.f = cc.a.a(new s5.d(iVar.f389a));
        cc.c cVarA2 = cc.c.a((h) objH3);
        iVar.f394g = cVarA2;
        iVar.f395h = cc.a.a(new w(iVar.f, cVarA2));
        iVar.i = cc.c.a((h) objH2);
        boolean z2 = false;
        iVar.f396j = cc.a.a(new sc.b(iVar.f391c, cc.a.a(new ad.c(iVar.f392d, iVar.f393e, iVar.f, iVar.f395h, cc.a.a(new j(iVar.i, iVar.f392d, cc.a.a(new w(iVar.f390b, (cc.d) iVar.f394g)), 20)), 4)), z2, 12));
        cc.d dVarA = cc.a.a(x.f464b);
        iVar.f397k = dVarA;
        iVar.f398l = cc.a.a(new k2(iVar.f392d, dVarA, z2, 2));
        iVar.f399m = cc.a.a(new ad.c(iVar.f389a, iVar.f393e, iVar.f396j, cc.a.a(new m(cc.c.a(bVarI), 0)), iVar.i, 2));
        iVar.f400n = cc.a.a(new j(iVar.f390b, iVar.f394g, cc.a.a(new a9.g(2, iVar.f398l)), 2));
        cc.d dVarA2 = cc.a.a(new o3(iVar.f396j, iVar.f398l, iVar.f399m, iVar.f392d, iVar.f400n, cc.a.a(new sc.b(iVar.f390b, iVar.f397k, false, 2)), iVar.i));
        iVar.f401o = dVarA2;
        iVar.f402p = cc.a.a(new sb.p(iVar.f389a, iVar.f396j, iVar.i, cc.a.a(new s5.c(2, dVarA2)), 1));
        return iVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ma.b> getComponents() {
        ma.a aVarA = ma.b.a(p.class);
        aVarA.f8526a = LIBRARY_NAME;
        aVarA.a(ma.j.b(firebaseSessionsComponent));
        aVarA.f = new u(3);
        aVarA.c(2);
        ma.b bVarB = aVarA.b();
        ma.a aVarA2 = ma.b.a(v.class);
        aVarA2.f8526a = "fire-sessions-component";
        aVarA2.a(ma.j.b(appContext));
        aVarA2.a(ma.j.b(backgroundDispatcher));
        aVarA2.a(ma.j.b(blockingDispatcher));
        aVarA2.a(ma.j.b(firebaseApp));
        aVarA2.a(ma.j.b(firebaseInstallationsApi));
        aVarA2.a(new ma.j(transportFactory, 1, 1));
        aVarA2.f = new u(4);
        return pd.i.W(new ma.b[]{bVarB, aVarA2.b(), e.d(LIBRARY_NAME, "3.0.6")});
    }
}
