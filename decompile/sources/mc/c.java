package mc;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import j1.f0;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import k4.z;
import org.json.JSONArray;
import org.json.JSONException;
import s9.n;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements s9.a, s9.g {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f8800x;

    public /* synthetic */ c(d dVar) {
        this.f8800x = dVar;
    }

    @Override // s9.g
    public n b(Object obj) {
        return this.f8800x.a();
    }

    @Override // s9.a
    public Object e(Task task) {
        boolean z10;
        d dVar = this.f8800x;
        if (task.h()) {
            nc.e eVar = dVar.f8804d;
            synchronized (eVar) {
                eVar.f9609c = dg.b.j(null);
            }
            eVar.f9608b.a();
            nc.g gVar = (nc.g) task.f();
            if (gVar != null) {
                JSONArray jSONArray = gVar.f9620d;
                kb.c cVar = dVar.f8802b;
                if (cVar != null) {
                    try {
                        cVar.c(d.g(jSONArray));
                    } catch (kb.a e10) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
                    } catch (JSONException e11) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e11);
                    }
                }
                n9.j jVar = dVar.f8810k;
                try {
                    ((f0) jVar.f9355y).S(gVar);
                    Iterator it = ((Set) jVar.A).iterator();
                    while (it.hasNext()) {
                        if (it.next() == null) {
                            ((Executor) jVar.f9356z).execute(new z(2));
                        } else {
                            throw new ClassCastException();
                        }
                    }
                } catch (f e12) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e12);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
