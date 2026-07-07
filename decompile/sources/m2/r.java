package m2;

import q2.y0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f8534a;

    /* renamed from: b, reason: collision with root package name */
    public final u2.o f8535b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f8536c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8537d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f8539f;

    public r(s sVar, w wVar, int i6, d dVar) {
        this.f8539f = sVar;
        this.f8535b = new u2.o(h8.c.i(i6, "ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper "));
        y0 y0Var = new y0(sVar.f8540x, null, null);
        this.f8536c = y0Var;
        this.f8534a = new q(sVar, wVar, i6, y0Var, dVar);
        y0Var.f10992f = sVar.f8542z;
    }

    public final void a() {
        if (!this.f8537d) {
            this.f8534a.f8531b.G = true;
            this.f8537d = true;
            s.b(this.f8539f);
        }
    }
}
