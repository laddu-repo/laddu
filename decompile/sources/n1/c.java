package n1;

import android.util.Log;
import androidx.fragment.app.q0;
import androidx.fragment.app.y;
import de.i;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f8966a = b.f8965a;

    public static b a(y yVar) {
        while (yVar != null) {
            if (yVar.p()) {
                yVar.l();
            }
            yVar = yVar.Q;
        }
        return f8966a;
    }

    public static void b(a aVar) {
        if (q0.I(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f8964v.getClass().getName()), aVar);
        }
    }

    public static final void c(y yVar, String str) {
        i.e(yVar, "fragment");
        i.e(str, "previousFragmentId");
        b(new a(yVar, "Attempting to reuse fragment " + yVar + " with previous ID " + str));
        a(yVar).getClass();
    }
}
