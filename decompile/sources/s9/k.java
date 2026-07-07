package s9;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements m, e, d, b {
    public final n A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f12269x;

    /* renamed from: y, reason: collision with root package name */
    public final Executor f12270y;

    /* renamed from: z, reason: collision with root package name */
    public final a f12271z;

    public /* synthetic */ k(Executor executor, a aVar, n nVar, int i6) {
        this.f12269x = i6;
        this.f12270y = executor;
        this.f12271z = aVar;
        this.A = nVar;
    }

    @Override // s9.m
    public final void a(Task task) {
        switch (this.f12269x) {
            case 0:
                this.f12270y.execute(new rb.i(this, task, 3, false));
                return;
            default:
                this.f12270y.execute(new rb.i(this, task, 4, false));
                return;
        }
    }

    @Override // s9.b
    public void b() {
        this.A.n();
    }

    @Override // s9.d
    public void onFailure(Exception exc) {
        this.A.l(exc);
    }

    @Override // s9.e
    public void onSuccess(Object obj) {
        this.A.m(obj);
    }
}
