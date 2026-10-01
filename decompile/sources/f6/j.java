package f6;

import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements Runnable {
    public static final String A = v5.o.h("StopWorkRunnable");

    /* renamed from: x, reason: collision with root package name */
    public final w5.l f5042x;

    /* renamed from: y, reason: collision with root package name */
    public final String f5043y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f5044z;

    public j(w5.l lVar, String str, boolean z10) {
        this.f5042x = lVar;
        this.f5043y = str;
        this.f5044z = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean k8;
        w5.l lVar = this.f5042x;
        WorkDatabase workDatabase = lVar.f14113c;
        w5.c cVar = lVar.f14116f;
        e6.j y9 = workDatabase.y();
        workDatabase.c();
        try {
            String str = this.f5043y;
            synchronized (cVar.H) {
                containsKey = cVar.C.containsKey(str);
            }
            if (this.f5044z) {
                k8 = this.f5042x.f14116f.j(this.f5043y);
            } else {
                if (!containsKey && y9.e(this.f5043y) == 2) {
                    y9.l(new String[]{this.f5043y}, 1);
                }
                k8 = this.f5042x.f14116f.k(this.f5043y);
            }
            v5.o.f().b(A, "StopWorkRunnable for " + this.f5043y + "; Processor.stopWork = " + k8, new Throwable[0]);
            workDatabase.r();
            workDatabase.h();
        } catch (Throwable th) {
            workDatabase.h();
            throw th;
        }
    }
}
