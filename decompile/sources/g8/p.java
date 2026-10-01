package g8;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.j1;
import com.google.android.gms.internal.measurement.h0;
import java.util.concurrent.Executor;
import n9.l1;
import n9.m2;
import n9.n1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p implements Executor {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5550x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f5551y;

    public /* synthetic */ p(Object obj, int i6) {
        this.f5550x = i6;
        this.f5551y = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f5550x) {
            case 0:
                ((Executor) this.f5551y).execute(new b9.b(runnable, 1));
                return;
            case 1:
                ((Handler) ((j1) this.f5551y).f950z).post(runnable);
                return;
            case 2:
                l1 l1Var = ((n1) ((m2) this.f5551y).f4301y).D;
                n1.g(l1Var);
                l1Var.m1(runnable);
                return;
            default:
                ((h0) this.f5551y).post(runnable);
                return;
        }
    }

    public p() {
        this.f5550x = 3;
        Handler handler = new Handler(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f5551y = handler;
    }
}
