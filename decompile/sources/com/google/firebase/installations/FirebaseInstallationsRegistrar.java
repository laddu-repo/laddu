package com.google.firebase.installations;

import androidx.annotation.Keep;
import cc.d;
import cc.e;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import jb.g;
import pb.a;
import pb.b;
import qb.c;
import qb.h;
import qb.p;
import rb.j;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static e lambda$getComponents$0(c cVar) {
        return new d((g) cVar.a(g.class), cVar.c(zb.e.class), (ExecutorService) cVar.d(new p(a.class, ExecutorService.class)), new j((Executor) cVar.d(new p(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qb.b> getComponents() {
        qb.a a10 = qb.b.a(e.class);
        a10.f11146a = LIBRARY_NAME;
        a10.a(h.a(g.class));
        a10.a(new h(0, 1, zb.e.class));
        a10.a(new h(new p(a.class, ExecutorService.class), 1, 0));
        a10.a(new h(new p(b.class, Executor.class), 1, 0));
        a10.f11152g = new b2.c(29);
        qb.b b10 = a10.b();
        zb.d dVar = new zb.d(0);
        qb.a a11 = qb.b.a(zb.d.class);
        a11.f11148c = 1;
        a11.f11152g = new b2.d(dVar);
        return Arrays.asList(b10, a11.b(), lg.c.e(LIBRARY_NAME, "17.2.0"));
    }
}
