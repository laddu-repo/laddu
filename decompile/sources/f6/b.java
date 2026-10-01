package f6;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w5.l f5028y;

    public b(w5.l lVar) {
        this.f5028y = lVar;
    }

    @Override // f6.c
    public final void b() {
        w5.l lVar = this.f5028y;
        WorkDatabase workDatabase = lVar.f14113c;
        workDatabase.c();
        try {
            ArrayList f3 = workDatabase.y().f();
            int size = f3.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = f3.get(i6);
                i6++;
                c.a(lVar, (String) obj);
            }
            workDatabase.r();
            workDatabase.h();
        } catch (Throwable th) {
            workDatabase.h();
            throw th;
        }
    }
}
