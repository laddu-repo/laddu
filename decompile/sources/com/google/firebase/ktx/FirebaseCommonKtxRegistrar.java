package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gf.y;
import ie.k;
import java.util.List;
import java.util.concurrent.Executor;
import pb.c;
import pb.d;
import qb.a;
import qb.b;
import qb.h;
import qb.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        a b10 = b.b(new p(pb.a.class, y.class));
        b10.a(new h(new p(pb.a.class, Executor.class), 1, 0));
        b10.f11152g = hc.a.f6042y;
        b b11 = b10.b();
        a b12 = b.b(new p(c.class, y.class));
        b12.a(new h(new p(c.class, Executor.class), 1, 0));
        b12.f11152g = hc.a.f6043z;
        b b13 = b12.b();
        a b14 = b.b(new p(pb.b.class, y.class));
        b14.a(new h(new p(pb.b.class, Executor.class), 1, 0));
        b14.f11152g = hc.a.A;
        b b15 = b14.b();
        a b16 = b.b(new p(d.class, y.class));
        b16.a(new h(new p(d.class, Executor.class), 1, 0));
        b16.f11152g = hc.a.B;
        return k.t(b11, b13, b15, b16.b());
    }
}
