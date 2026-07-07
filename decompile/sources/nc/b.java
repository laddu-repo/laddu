package nc;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9592x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f9593y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c f9594z;

    public b(c cVar, int i6, long j) {
        this.f9594z = cVar;
        this.f9592x = i6;
        this.f9593y = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final c cVar = this.f9594z;
        int i6 = this.f9592x;
        final long j = this.f9593y;
        synchronized (cVar) {
            final int i10 = i6 - 1;
            final s9.n c10 = ((j) cVar.f9598d).c(3 - i10);
            final Task b10 = ((e) cVar.f9599e).b();
            dg.b.r(c10, b10).d((ScheduledExecutorService) cVar.f9601g, new s9.a() { // from class: nc.a
                @Override // s9.a
                public final Object e(Task task) {
                    Boolean valueOf;
                    c cVar2 = c.this;
                    s9.n nVar = c10;
                    Task task2 = b10;
                    long j10 = j;
                    int i11 = i10;
                    if (!nVar.h()) {
                        return dg.b.i(new jb.i("Failed to auto-fetch config update.", nVar.e()));
                    }
                    if (!task2.h()) {
                        return dg.b.i(new jb.i("Failed to get activated config for auto-fetch", task2.e()));
                    }
                    i iVar = (i) nVar.f();
                    g gVar = (g) task2.f();
                    g gVar2 = iVar.f9628b;
                    boolean z10 = false;
                    if (gVar2 != null) {
                        if (gVar2.f9622f >= j10) {
                            z10 = true;
                        }
                        valueOf = Boolean.valueOf(z10);
                    } else {
                        if (iVar.f9627a == 1) {
                            z10 = true;
                        }
                        valueOf = Boolean.valueOf(z10);
                    }
                    if (!valueOf.booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        cVar2.a(i11, j10);
                        return dg.b.j(null);
                    }
                    if (iVar.f9628b == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return dg.b.j(null);
                    }
                    if (gVar == null) {
                        gVar = g.c().a();
                    }
                    g gVar3 = iVar.f9628b;
                    JSONObject jSONObject = gVar.f9621e;
                    JSONObject jSONObject2 = gVar3.f9617a;
                    JSONObject jSONObject3 = gVar3.f9618b;
                    JSONObject jSONObject4 = gVar3.f9621e;
                    JSONObject jSONObject5 = g.a(new JSONObject(jSONObject2.toString())).f9618b;
                    HashMap b11 = gVar.b();
                    HashMap b12 = gVar3.b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject6 = gVar.f9618b;
                    Iterator<String> keys = jSONObject6.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                            hashSet.add(next);
                        } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                            hashSet.add(next);
                        } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                            hashSet.add(next);
                        } else if (b11.containsKey(next) != b12.containsKey(next)) {
                            hashSet.add(next);
                        } else if (b11.containsKey(next) && b12.containsKey(next) && !((Map) b11.get(next)).equals(b12.get(next))) {
                            hashSet.add(next);
                        } else {
                            jSONObject5.remove(next);
                        }
                    }
                    Iterator<String> keys2 = jSONObject5.keys();
                    while (keys2.hasNext()) {
                        hashSet.add(keys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                        return dg.b.j(null);
                    }
                    mc.a aVar = new mc.a(hashSet);
                    synchronized (cVar2) {
                        Iterator it = ((LinkedHashSet) cVar2.f9596b).iterator();
                        while (it.hasNext()) {
                            ((mc.b) it.next()).a(aVar);
                        }
                    }
                    return dg.b.j(null);
                }
            });
        }
    }
}
