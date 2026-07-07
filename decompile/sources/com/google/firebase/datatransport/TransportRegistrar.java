package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d8.e;
import e8.a;
import g8.r;
import java.util.Arrays;
import java.util.List;
import o5.p;
import qb.b;
import qb.c;
import qb.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ e lambda$getComponents$0(c cVar) {
        r.b((Context) cVar.a(Context.class));
        return r.a().c(a.f4465f);
    }

    public static /* synthetic */ e lambda$getComponents$1(c cVar) {
        r.b((Context) cVar.a(Context.class));
        return r.a().c(a.f4465f);
    }

    public static /* synthetic */ e lambda$getComponents$2(c cVar) {
        r.b((Context) cVar.a(Context.class));
        return r.a().c(a.f4464e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        qb.a a10 = b.a(e.class);
        a10.f11146a = LIBRARY_NAME;
        a10.a(h.a(Context.class));
        a10.f11152g = new p(23);
        b b10 = a10.b();
        qb.a b11 = b.b(new qb.p(sb.a.class, e.class));
        b11.a(h.a(Context.class));
        b11.f11152g = new p(24);
        b b12 = b11.b();
        qb.a b13 = b.b(new qb.p(sb.b.class, e.class));
        b13.a(h.a(Context.class));
        b13.f11152g = new p(25);
        return Arrays.asList(b10, b12, b13.b(), lg.c.e(LIBRARY_NAME, "18.2.0"));
    }
}
