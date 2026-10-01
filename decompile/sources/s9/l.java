package s9;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements m, e, d, b {
    public final Object A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f12272x;

    /* renamed from: y, reason: collision with root package name */
    public final Executor f12273y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f12274z;

    public l(Executor executor, b bVar) {
        this.f12272x = 0;
        this.f12274z = new Object();
        this.f12273y = executor;
        this.A = bVar;
    }

    private final void c(Task task) {
        synchronized (this.f12274z) {
        }
        this.f12273y.execute(new rb.i(this, task, 5, false));
    }

    private final void d(Task task) {
        if (!task.h() && !((n) task).f12278d) {
            synchronized (this.f12274z) {
            }
            this.f12273y.execute(new rb.i(this, task, 6, false));
        }
    }

    private final void e(Task task) {
        if (task.h()) {
            synchronized (this.f12274z) {
            }
            this.f12273y.execute(new rb.i(this, task, 7, false));
        }
    }

    @Override // s9.m
    public final void a(Task task) {
        switch (this.f12272x) {
            case 0:
                if (((n) task).f12278d) {
                    synchronized (this.f12274z) {
                    }
                    this.f12273y.execute(new a1.e(this, 22));
                    return;
                }
                return;
            case 1:
                c(task);
                return;
            case 2:
                d(task);
                return;
            case 3:
                e(task);
                return;
            default:
                this.f12273y.execute(new rb.i(this, task, 8, false));
                return;
        }
    }

    @Override // s9.b
    public void b() {
        ((n) this.A).n();
    }

    @Override // s9.d
    public void onFailure(Exception exc) {
        ((n) this.A).l(exc);
    }

    @Override // s9.e
    public void onSuccess(Object obj) {
        ((n) this.A).m(obj);
    }

    public l(Executor executor, c cVar) {
        this.f12272x = 1;
        this.f12274z = new Object();
        this.f12273y = executor;
        this.A = cVar;
    }

    public l(Executor executor, d dVar) {
        this.f12272x = 2;
        this.f12274z = new Object();
        this.f12273y = executor;
        this.A = dVar;
    }

    public l(Executor executor, e eVar) {
        this.f12272x = 3;
        this.f12274z = new Object();
        this.f12273y = executor;
        this.A = eVar;
    }

    public l(Executor executor, g gVar, n nVar) {
        this.f12272x = 4;
        this.f12273y = executor;
        this.f12274z = gVar;
        this.A = nVar;
    }
}
