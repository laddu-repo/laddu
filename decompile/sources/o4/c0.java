package o4;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((r0) ((Observable) this).mObservers.get(size)).f9848a;
            recyclerView.k(null);
            recyclerView.B0.f = true;
            recyclerView.Y(true);
            if (!recyclerView.f1400z.y()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            r0 r0Var = (r0) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = r0Var.f9848a;
            recyclerView.k(null);
            cf.k kVar = recyclerView.f1400z;
            ArrayList arrayList = (ArrayList) kVar.f2317c;
            arrayList.add(kVar.A(null, 4, i, 1));
            kVar.f2315a |= 4;
            if (arrayList.size() == 1) {
                r0Var.a();
            }
        }
    }

    public final void d(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            r0 r0Var = (r0) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = r0Var.f9848a;
            recyclerView.k(null);
            cf.k kVar = recyclerView.f1400z;
            ArrayList arrayList = (ArrayList) kVar.f2317c;
            arrayList.add(kVar.A(null, 1, i, 1));
            kVar.f2315a |= 1;
            if (arrayList.size() == 1) {
                r0Var.a();
            }
        }
    }

    public final void e(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            r0 r0Var = (r0) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = r0Var.f9848a;
            recyclerView.k(null);
            cf.k kVar = recyclerView.f1400z;
            ArrayList arrayList = (ArrayList) kVar.f2317c;
            arrayList.add(kVar.A(null, 2, i, 1));
            kVar.f2315a |= 2;
            if (arrayList.size() == 1) {
                r0Var.a();
            }
        }
    }
}
