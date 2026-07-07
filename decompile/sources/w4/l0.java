package w4;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((a1) ((Observable) this).mObservers.get(size)).f13814a;
            recyclerView.i(null);
            recyclerView.D0.f13862f = true;
            recyclerView.V(true);
            if (!recyclerView.B.l()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i6, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            a1 a1Var = (a1) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = a1Var.f13814a;
            recyclerView.i(null);
            o4.j jVar = recyclerView.B;
            ArrayList arrayList = (ArrayList) jVar.f9928e;
            if (i6 != i10) {
                arrayList.add(jVar.n(null, 8, i6, i10));
                jVar.f9924a |= 8;
                if (arrayList.size() == 1) {
                    a1Var.a();
                }
            }
        }
    }

    public final void d(int i6, int i10, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            a1 a1Var = (a1) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = a1Var.f13814a;
            recyclerView.i(null);
            o4.j jVar = recyclerView.B;
            ArrayList arrayList = (ArrayList) jVar.f9928e;
            if (i10 >= 1) {
                arrayList.add(jVar.n(obj, 4, i6, i10));
                jVar.f9924a = 4 | jVar.f9924a;
                if (arrayList.size() == 1) {
                    a1Var.a();
                }
            }
        }
    }

    public final void e(int i6, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            a1 a1Var = (a1) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = a1Var.f13814a;
            recyclerView.i(null);
            o4.j jVar = recyclerView.B;
            ArrayList arrayList = (ArrayList) jVar.f9928e;
            if (i10 >= 1) {
                arrayList.add(jVar.n(null, 1, i6, i10));
                jVar.f9924a |= 1;
                if (arrayList.size() == 1) {
                    a1Var.a();
                }
            }
        }
    }

    public final void f(int i6, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            a1 a1Var = (a1) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = a1Var.f13814a;
            recyclerView.i(null);
            o4.j jVar = recyclerView.B;
            ArrayList arrayList = (ArrayList) jVar.f9928e;
            if (i10 >= 1) {
                arrayList.add(jVar.n(null, 2, i6, i10));
                jVar.f9924a |= 2;
                if (arrayList.size() == 1) {
                    a1Var.a();
                }
            }
        }
    }
}
