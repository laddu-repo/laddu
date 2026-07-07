package fa;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e implements s7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f5331a = new AtomicReference();

    @Override // s7.b
    public final void a(boolean z2) {
        synchronized (g.f5334k) {
            try {
                ArrayList arrayList = new ArrayList(g.f5335l.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    g gVar = (g) obj;
                    if (gVar.f5340e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = gVar.i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).f5330a;
                            if (!z2) {
                                ((kb.d) gVar2.f5342h.get()).c();
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
