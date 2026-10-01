package x4;

import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f14557b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(String[] strArr, x xVar) {
        super(strArr);
        this.f14557b = xVar;
    }

    @Override // x4.g
    public final void a(Set tables) {
        kotlin.jvm.internal.k.e(tables, "tables");
        q.b H = q.b.H();
        j2.h hVar = new j2.h(this.f14557b, 17);
        if (H.f10787f.I()) {
            hVar.run();
        } else {
            H.I(hVar);
        }
    }
}
