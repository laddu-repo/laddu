package q7;

import android.os.SystemClock;
import bg.k;
import bg.l;
import bg.r;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends r {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f11134x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar, b bVar) {
        super(lVar);
        this.f11134x = bVar;
    }

    @Override // bg.r, bg.j0
    public final void write(k source, long j) {
        kotlin.jvm.internal.k.e(source, "source");
        super.write(source, j);
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f11134x.f11136b;
        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            SystemClock.elapsedRealtime();
            Iterator it = concurrentLinkedQueue.iterator();
            if (it.hasNext()) {
                throw r4.a.i(it);
            }
        }
    }
}
