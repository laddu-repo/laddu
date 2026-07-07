package f6;

import androidx.work.impl.WorkDatabase;
import j4.b0;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final s8.l f5029x = new s8.l(22);

    public static void a(w5.l lVar, String str) {
        WorkDatabase workDatabase = lVar.f14113c;
        e6.j y9 = workDatabase.y();
        b0 t10 = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int e10 = y9.e(str2);
            if (e10 != 3 && e10 != 4) {
                y9.l(new String[]{str2}, 6);
            }
            linkedList.addAll(t10.q(str2));
        }
        w5.c cVar = lVar.f14116f;
        synchronized (cVar.H) {
            try {
                boolean z10 = false;
                v5.o.f().b(w5.c.I, "Processor cancelling " + str, new Throwable[0]);
                cVar.F.add(str);
                w5.m mVar = (w5.m) cVar.C.remove(str);
                if (mVar != null) {
                    z10 = true;
                }
                if (mVar == null) {
                    mVar = (w5.m) cVar.D.remove(str);
                }
                w5.c.b(str, mVar);
                if (z10) {
                    cVar.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = lVar.f14115e.iterator();
        while (it.hasNext()) {
            ((w5.d) it.next()).d(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        s8.l lVar = this.f5029x;
        try {
            b();
            lVar.z(v5.t.f13335t);
        } catch (Throwable th) {
            lVar.z(new v5.q(th));
        }
    }
}
