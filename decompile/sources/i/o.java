package i;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements Executor {
    public final Object A;
    public final Executor B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6250x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayDeque f6251y;

    /* renamed from: z, reason: collision with root package name */
    public Runnable f6252z;

    public o(Executor executor) {
        this.f6250x = 1;
        kotlin.jvm.internal.k.e(executor, "executor");
        this.B = executor;
        this.f6251y = new ArrayDeque();
        this.A = new Object();
    }

    private final void a(Runnable runnable) {
        synchronized (this.A) {
            try {
                this.f6251y.add(new a2.c0(18, this, runnable));
                if (this.f6252z == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        synchronized (this.A) {
            try {
                Runnable runnable = (Runnable) this.f6251y.poll();
                this.f6252z = runnable;
                if (runnable != null) {
                    ((p) this.B).execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        switch (this.f6250x) {
            case 0:
                c();
                return;
            default:
                synchronized (this.A) {
                    Object poll = this.f6251y.poll();
                    Runnable runnable = (Runnable) poll;
                    this.f6252z = runnable;
                    if (poll != null) {
                        this.B.execute(runnable);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        switch (this.f6250x) {
            case 0:
                a(command);
                return;
            default:
                kotlin.jvm.internal.k.e(command, "command");
                synchronized (this.A) {
                    this.f6251y.offer(new m8.c(16, command, this));
                    if (this.f6252z == null) {
                        b();
                    }
                }
                return;
        }
    }

    public o(p pVar) {
        this.f6250x = 0;
        this.A = new Object();
        this.f6251y = new ArrayDeque();
        this.B = pVar;
    }
}
