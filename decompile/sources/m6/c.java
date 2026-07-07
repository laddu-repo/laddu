package m6;

import android.os.SystemClock;
import bg.l0;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends bg.s {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8643x = 0;

    /* renamed from: y, reason: collision with root package name */
    public Object f8644y;

    public /* synthetic */ c(l0 l0Var) {
        super(l0Var);
    }

    @Override // bg.s, bg.l0
    public final long read(bg.k sink, long j) {
        switch (this.f8643x) {
            case 0:
                try {
                    return super.read(sink, j);
                } catch (Exception e10) {
                    this.f8644y = e10;
                    throw e10;
                }
            default:
                q7.d dVar = (q7.d) this.f8644y;
                u7.b bVar = dVar.f11143z;
                ConcurrentLinkedQueue concurrentLinkedQueue = dVar.f11142y;
                kotlin.jvm.internal.k.e(sink, "sink");
                try {
                    long read = super.read(sink, j);
                    if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
                        SystemClock.elapsedRealtime();
                        Iterator it = concurrentLinkedQueue.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    if (read == -1 && bVar != null) {
                        bVar.invoke();
                    }
                    return read;
                } catch (Exception e11) {
                    if (bVar != null) {
                        bVar.invoke();
                    }
                    throw e11;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(bg.m mVar, q7.d dVar) {
        super(mVar);
        this.f8644y = dVar;
    }
}
