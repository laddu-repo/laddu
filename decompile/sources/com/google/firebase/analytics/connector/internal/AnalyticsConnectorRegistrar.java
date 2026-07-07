package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.l1;
import com.google.firebase.components.ComponentRegistrar;
import i.p;
import java.util.Arrays;
import java.util.List;
import jb.g;
import n9.z;
import nb.b;
import qb.a;
import qb.c;
import qb.h;
import qb.j;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static b lambda$getComponents$0(c cVar) {
        g gVar = (g) cVar.a(g.class);
        Context context = (Context) cVar.a(Context.class);
        yb.c cVar2 = (yb.c) cVar.a(yb.c.class);
        x.g(gVar);
        x.g(context);
        x.g(cVar2);
        x.g(context.getApplicationContext());
        if (nb.c.f9587b == null) {
            synchronized (nb.c.class) {
                try {
                    if (nb.c.f9587b == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.f7332b)) {
                            ((j) cVar2).a(p.f6253y, z.f9541a0);
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.h());
                        }
                        nb.c.f9587b = new nb.c(l1.e(context, bundle).f2330b);
                    }
                } finally {
                }
            }
        }
        return nb.c.f9587b;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<qb.b> getComponents() {
        a a10 = qb.b.a(b.class);
        a10.a(h.a(g.class));
        a10.a(h.a(Context.class));
        a10.a(h.a(yb.c.class));
        a10.f11152g = ob.a.f10040x;
        a10.c(2);
        return Arrays.asList(a10.b(), lg.c.e("fire-analytics", "22.5.0"));
    }
}
