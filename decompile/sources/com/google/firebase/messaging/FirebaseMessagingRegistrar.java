package com.google.firebase.messaging;

import ac.a;
import androidx.annotation.Keep;
import c6.h;
import cc.e;
import com.google.firebase.components.ComponentRegistrar;
import ic.m;
import java.util.Arrays;
import java.util.List;
import jb.g;
import lc.b;
import qb.c;
import qb.p;
import zb.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(p pVar, h hVar) {
        return lambda$getComponents$0(pVar, hVar);
    }

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(p pVar, c cVar) {
        g gVar = (g) cVar.a(g.class);
        if (cVar.a(a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.c(b.class), cVar.c(f.class), (e) cVar.a(e.class), cVar.e(pVar), (yb.c) cVar.a(yb.c.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<qb.b> getComponents() {
        p pVar = new p(sb.b.class, d8.e.class);
        qb.a a10 = qb.b.a(FirebaseMessaging.class);
        a10.f11146a = LIBRARY_NAME;
        a10.a(qb.h.a(g.class));
        a10.a(new qb.h(0, 0, a.class));
        a10.a(new qb.h(0, 1, b.class));
        a10.a(new qb.h(0, 1, f.class));
        a10.a(qb.h.a(e.class));
        a10.a(new qb.h(pVar, 0, 1));
        a10.a(qb.h.a(yb.c.class));
        a10.f11152g = new m(pVar, 0);
        a10.c(1);
        return Arrays.asList(a10.b(), lg.c.e(LIBRARY_NAME, "24.1.2"));
    }
}
