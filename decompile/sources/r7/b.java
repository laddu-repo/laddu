package r7;

import bg.l0;
import bg.s;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends s {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f11843x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l0 l0Var, c cVar) {
        super(l0Var);
        this.f11843x = cVar;
    }

    @Override // bg.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11843x.f11844x.close();
        super.close();
    }
}
