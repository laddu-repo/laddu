package rb;

import a2.a2;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ a2 A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11935x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f11936y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Runnable f11937z;

    public /* synthetic */ d(e eVar, Runnable runnable, a2 a2Var, int i6) {
        this.f11935x = i6;
        this.f11936y = eVar;
        this.f11937z = runnable;
        this.A = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11935x) {
            case 0:
                ExecutorService executorService = this.f11936y.f11938x;
                final int i6 = 0;
                final Runnable runnable = this.f11937z;
                final a2 a2Var = this.A;
                executorService.execute(new Runnable() { // from class: rb.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((g) a2Var.f162y).k(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((g) a2Var.f162y).k(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                g gVar = (g) a2Var.f162y;
                                try {
                                    runnable2.run();
                                    gVar.j(null);
                                    return;
                                } catch (Exception e12) {
                                    gVar.k(e12);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ExecutorService executorService2 = this.f11936y.f11938x;
                final int i10 = 2;
                final Runnable runnable2 = this.f11937z;
                final a2 a2Var2 = this.A;
                executorService2.execute(new Runnable() { // from class: rb.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((g) a2Var2.f162y).k(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((g) a2Var2.f162y).k(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                g gVar = (g) a2Var2.f162y;
                                try {
                                    runnable22.run();
                                    gVar.j(null);
                                    return;
                                } catch (Exception e12) {
                                    gVar.k(e12);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ExecutorService executorService3 = this.f11936y.f11938x;
                final int i11 = 1;
                final Runnable runnable3 = this.f11937z;
                final a2 a2Var3 = this.A;
                executorService3.execute(new Runnable() { // from class: rb.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((g) a2Var3.f162y).k(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((g) a2Var3.f162y).k(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                g gVar = (g) a2Var3.f162y;
                                try {
                                    runnable22.run();
                                    gVar.j(null);
                                    return;
                                } catch (Exception e12) {
                                    gVar.k(e12);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
