package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import i4.u0;
import java.util.Arrays;
import java.util.List;
import lb.a;
import nb.b;
import qb.c;
import qb.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a lambda$getComponents$0(c cVar) {
        return new a((Context) cVar.a(Context.class), cVar.c(b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qb.b> getComponents() {
        qb.a a10 = qb.b.a(a.class);
        a10.f11146a = LIBRARY_NAME;
        a10.a(h.a(Context.class));
        a10.a(new h(0, 1, b.class));
        a10.f11152g = new u0(21);
        return Arrays.asList(a10.b(), lg.c.e(LIBRARY_NAME, "21.1.1"));
    }
}
