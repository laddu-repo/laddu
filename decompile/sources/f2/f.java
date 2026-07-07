package f2;

import android.os.Handler;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements n {
    public final /* synthetic */ g A;

    /* renamed from: x, reason: collision with root package name */
    public final l f4663x;

    /* renamed from: y, reason: collision with root package name */
    public i f4664y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4665z;

    public f(g gVar, l lVar) {
        this.A = gVar;
        this.f4663x = lVar;
    }

    @Override // f2.n
    public final void a() {
        Handler handler = this.A.Q;
        handler.getClass();
        u1.a0.U(handler, new a2.a(this, 20));
    }
}
