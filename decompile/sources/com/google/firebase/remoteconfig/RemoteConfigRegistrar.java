package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import cc.e;
import com.google.firebase.components.ComponentRegistrar;
import ic.m;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import jb.g;
import lb.a;
import mc.l;
import nb.b;
import qb.c;
import qb.h;
import qb.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@Keep
/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static l lambda$getComponents$0(p pVar, c cVar) {
        kb.c cVar2;
        Context context = (Context) cVar.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) cVar.d(pVar);
        g gVar = (g) cVar.a(g.class);
        e eVar = (e) cVar.a(e.class);
        a aVar = (a) cVar.a(a.class);
        synchronized (aVar) {
            try {
                if (!aVar.f8321a.containsKey("frc")) {
                    aVar.f8321a.put("frc", new kb.c(aVar.f8322b));
                }
                cVar2 = (kb.c) aVar.f8321a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new l(context, scheduledExecutorService, gVar, eVar, cVar2, cVar.c(b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qb.b> getComponents() {
        p pVar = new p(pb.b.class, ScheduledExecutorService.class);
        qb.a aVar = new qb.a(l.class, new Class[]{pc.a.class});
        aVar.f11146a = LIBRARY_NAME;
        aVar.a(h.a(Context.class));
        aVar.a(new h(pVar, 1, 0));
        aVar.a(h.a(g.class));
        aVar.a(h.a(e.class));
        aVar.a(h.a(a.class));
        aVar.a(new h(0, 1, b.class));
        aVar.f11152g = new m(pVar, 1);
        aVar.c(2);
        return Arrays.asList(aVar.b(), lg.c.e(LIBRARY_NAME, "22.1.2"));
    }
}
