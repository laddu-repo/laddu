package jb;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements v8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f7327a = new AtomicReference();

    @Override // v8.b
    public final void a(boolean z10) {
        synchronized (g.j) {
            try {
                ArrayList arrayList = new ArrayList(g.f7330k.values());
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    g gVar = (g) obj;
                    if (gVar.f7335e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = gVar.f7339i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).f7326a;
                            if (!z10) {
                                ((zb.c) gVar2.f7338h.get()).c();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
