package jb;

import gf.f0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.k;
import qb.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements qb.d {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7342x;

    /* renamed from: y, reason: collision with root package name */
    public static final h f7340y = new h(0);

    /* renamed from: z, reason: collision with root package name */
    public static final h f7341z = new h(1);
    public static final h A = new h(2);
    public static final h B = new h(3);

    public /* synthetic */ h(int i6) {
        this.f7342x = i6;
    }

    @Override // qb.d
    public final Object d(c6.h hVar) {
        switch (this.f7342x) {
            case 0:
                Object d10 = hVar.d(new p(pb.a.class, Executor.class));
                k.d(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return f0.n((Executor) d10);
            case 1:
                Object d11 = hVar.d(new p(pb.c.class, Executor.class));
                k.d(d11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return f0.n((Executor) d11);
            case 2:
                Object d12 = hVar.d(new p(pb.b.class, Executor.class));
                k.d(d12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return f0.n((Executor) d12);
            default:
                Object d13 = hVar.d(new p(pb.d.class, Executor.class));
                k.d(d13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return f0.n((Executor) d13);
        }
    }
}
