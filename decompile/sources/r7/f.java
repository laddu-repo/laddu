package r7;

import bg.j0;
import bg.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends r {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f11858x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f11859y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, g gVar, j0 j0Var) {
        super(j0Var);
        this.f11858x = iVar;
        this.f11859y = gVar;
    }

    @Override // bg.r, bg.j0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        i iVar = this.f11858x;
        g gVar = this.f11859y;
        synchronized (iVar) {
            if (gVar.f11863d) {
                return;
            }
            gVar.f11863d = true;
            super.close();
            this.f11859y.f11860a.commit();
        }
    }
}
