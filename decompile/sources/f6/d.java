package f6;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: z, reason: collision with root package name */
    public static final String f5030z = v5.o.h("EnqueueRunnable");

    /* renamed from: x, reason: collision with root package name */
    public final w5.f f5031x;

    /* renamed from: y, reason: collision with root package name */
    public final s8.l f5032y = new s8.l(22);

    public d(w5.f fVar) {
        this.f5031x = fVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f9  */
    /* JADX WARN: Type inference failed for: r3v22, types: [e6.h, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(w5.f r21) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.d.a(w5.f):boolean");
    }

    public static void b(e6.i iVar) {
        v5.c cVar = iVar.j;
        String str = iVar.f4373c;
        if (!str.equals(ConstraintTrackingWorker.class.getName())) {
            if (cVar.f13309d || cVar.f13310e) {
                k7.c cVar2 = new k7.c(29);
                cVar2.B(iVar.f4375e.f13319a);
                ((HashMap) cVar2.f7745y).put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                iVar.f4373c = ConstraintTrackingWorker.class.getName();
                v5.f fVar = new v5.f((HashMap) cVar2.f7745y);
                v5.f.b(fVar);
                iVar.f4375e = fVar;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        s8.l lVar = this.f5032y;
        w5.f fVar = this.f5031x;
        w5.l lVar2 = fVar.f14092a;
        try {
            HashSet hashSet = new HashSet();
            hashSet.addAll(fVar.f14094c);
            HashSet p10 = w5.f.p(fVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (p10.contains((String) it.next())) {
                        z10 = true;
                        break;
                    }
                } else {
                    hashSet.removeAll(fVar.f14094c);
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                WorkDatabase workDatabase = lVar2.f14113c;
                workDatabase.c();
                try {
                    boolean a10 = a(fVar);
                    workDatabase.r();
                    if (a10) {
                        g.a(lVar2.f14111a, RescheduleReceiver.class, true);
                        w5.e.a(lVar2.f14112b, lVar2.f14113c, lVar2.f14115e);
                    }
                    lVar.z(v5.t.f13335t);
                    return;
                } finally {
                    workDatabase.h();
                }
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + fVar + ")");
        } catch (Throwable th) {
            lVar.z(new v5.q(th));
        }
    }
}
