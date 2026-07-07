package hc;

import c6.h;
import gf.f0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.k;
import pb.b;
import pb.c;
import qb.d;
import qb.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6044x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f6042y = new a(0);

    /* renamed from: z, reason: collision with root package name */
    public static final a f6043z = new a(1);
    public static final a A = new a(2);
    public static final a B = new a(3);

    public /* synthetic */ a(int i6) {
        this.f6044x = i6;
    }

    @Override // qb.d
    public final Object d(h hVar) {
        switch (this.f6044x) {
            case 0:
                Object d10 = hVar.d(new p(pb.a.class, Executor.class));
                k.d(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return f0.n((Executor) d10);
            case 1:
                Object d11 = hVar.d(new p(c.class, Executor.class));
                k.d(d11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return f0.n((Executor) d11);
            case 2:
                Object d12 = hVar.d(new p(b.class, Executor.class));
                k.d(d12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return f0.n((Executor) d12);
            default:
                Object d13 = hVar.d(new p(pb.d.class, Executor.class));
                k.d(d13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return f0.n((Executor) d13);
        }
    }
}
