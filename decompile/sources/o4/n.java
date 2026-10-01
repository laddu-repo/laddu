package o4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f9819w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f9820x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f9817z = new ThreadLocal();
    public static final f0.h A = new f0.h(4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f9818v = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f9821y = new ArrayList();

    public static z0 c(RecyclerView recyclerView, int i, long j8) {
        int iY = recyclerView.A.y();
        for (int i10 = 0; i10 < iY; i10++) {
            z0 z0VarM = RecyclerView.M(recyclerView.A.x(i10));
            if (z0VarM.f9912c == i && !z0VarM.f()) {
                return null;
            }
        }
        p0 p0Var = recyclerView.f1396x;
        if (j8 == Long.MAX_VALUE) {
            try {
                if (p0.k.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.U(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.T();
        z0 z0VarL = p0Var.l(i, j8);
        if (z0VarL != null) {
            if (!z0VarL.e() || z0VarL.f()) {
                p0Var.a(z0VarL, false);
            } else {
                p0Var.i(z0VarL.f9910a);
            }
        }
        recyclerView.U(false);
        Trace.endSection();
        return z0VarL;
    }

    public final void a(RecyclerView recyclerView, int i, int i10) {
        if (recyclerView.N) {
            if (RecyclerView.W0 && !this.f9818v.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f9819w == 0) {
                this.f9819w = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        l lVar = recyclerView.A0;
        lVar.f9809b = i;
        lVar.f9810c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r18) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.n.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f9818v;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f9820x);
                }
            }
        } finally {
            this.f9819w = 0L;
            Trace.endSection();
        }
    }
}
