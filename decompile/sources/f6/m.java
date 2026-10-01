package f6;

import android.content.Context;
import androidx.lifecycle.j1;
import androidx.work.ListenableWorker;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements Runnable {
    public static final String D = v5.o.h("WorkForegroundRunnable");
    public final ListenableWorker A;
    public final o B;
    public final h6.a C;

    /* renamed from: x, reason: collision with root package name */
    public final g6.j f5050x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public final Context f5051y;

    /* renamed from: z, reason: collision with root package name */
    public final e6.i f5052z;

    /* JADX WARN: Type inference failed for: r0v0, types: [g6.j, java.lang.Object] */
    public m(Context context, e6.i iVar, ListenableWorker listenableWorker, o oVar, j1 j1Var) {
        this.f5051y = context;
        this.f5052z = iVar;
        this.A = listenableWorker;
        this.B = oVar;
        this.C = j1Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [g6.j, g6.h, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5052z.f4386q && !p0.a.a()) {
            ?? obj = new Object();
            j1 j1Var = (j1) this.C;
            ((g8.p) j1Var.A).execute(new l(this, obj, 0));
            obj.a(new l(this, obj, 1), (g8.p) j1Var.A);
            return;
        }
        this.f5050x.i(null);
    }
}
