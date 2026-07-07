package o5;

import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t extends s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v.e f9990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f9991b;

    public t(u uVar, v.e eVar) {
        this.f9991b = uVar;
        this.f9990a = eVar;
    }

    @Override // o5.s, o5.o
    public final void g(r rVar) {
        ((ArrayList) this.f9990a.get(this.f9991b.f9993y)).remove(rVar);
        rVar.y(this);
    }
}
