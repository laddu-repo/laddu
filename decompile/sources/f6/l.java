package f6;

import android.content.Context;
import androidx.lifecycle.j1;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5047x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g6.j f5048y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ m f5049z;

    public /* synthetic */ l(m mVar, g6.j jVar, int i6) {
        this.f5047x = i6;
        this.f5049z = mVar;
        this.f5048y = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [hb.x, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5047x) {
            case 0:
                this.f5048y.k(this.f5049z.A.getForegroundInfoAsync());
                return;
            default:
                m mVar = this.f5049z;
                g6.j jVar = mVar.f5050x;
                ListenableWorker listenableWorker = mVar.A;
                e6.i iVar = mVar.f5052z;
                try {
                    v5.h hVar = (v5.h) this.f5048y.get();
                    if (hVar != null) {
                        v5.o.f().b(m.D, "Updating notification for " + iVar.f4373c, new Throwable[0]);
                        listenableWorker.setRunInForeground(true);
                        o oVar = mVar.B;
                        Context context = mVar.f5051y;
                        UUID id2 = listenableWorker.getId();
                        oVar.getClass();
                        ?? obj = new Object();
                        ((j1) oVar.f5056a).k(new n(oVar, obj, id2, hVar, context, 0));
                        jVar.k(obj);
                        return;
                    }
                    throw new IllegalStateException("Worker was marked important (" + iVar.f4373c + ") but did not provide ForegroundInfo");
                } catch (Throwable th) {
                    jVar.j(th);
                    return;
                }
        }
    }
}
