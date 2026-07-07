package q7;

import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends l implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11139x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f11140y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i6) {
        super(0);
        this.f11139x = i6;
        this.f11140y = dVar;
    }

    @Override // ve.a
    public final Object invoke() {
        switch (this.f11139x) {
            case 0:
                d dVar = this.f11140y;
                return bg.b.d(new m6.c(dVar.f11141x.source(), dVar));
            default:
                return Long.valueOf(this.f11140y.f11141x.contentLength());
        }
    }
}
