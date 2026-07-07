package c2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Executor {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1801x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1802y;

    public /* synthetic */ g0(Object obj, int i6) {
        this.f1801x = i6;
        this.f1802y = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1801x) {
            case 0:
                ((Handler) this.f1802y).post(runnable);
                return;
            default:
                u1.a0.U(((i4.b0) this.f1802y).f6311l, runnable);
                return;
        }
    }
}
