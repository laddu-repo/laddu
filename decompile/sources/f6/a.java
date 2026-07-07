package f6;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w5.l f5026y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ UUID f5027z;

    public a(w5.l lVar, UUID uuid) {
        this.f5026y = lVar;
        this.f5027z = uuid;
    }

    @Override // f6.c
    public final void b() {
        w5.l lVar = this.f5026y;
        WorkDatabase workDatabase = lVar.f14113c;
        workDatabase.c();
        try {
            c.a(lVar, this.f5027z.toString());
            workDatabase.r();
            workDatabase.h();
            w5.e.a(lVar.f14112b, lVar.f14113c, lVar.f14115e);
        } catch (Throwable th) {
            workDatabase.h();
            throw th;
        }
    }
}
