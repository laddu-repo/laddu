package wb;

import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import o8.o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f13954v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f13955w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e2.e f13956x;

    public b(e2.e eVar, int i, long j8) {
        this.f13956x = eVar;
        this.f13954v = i;
        this.f13955w = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final e2.e eVar = this.f13956x;
        int i = this.f13954v;
        final long j8 = this.f13955w;
        synchronized (eVar) {
            final int i10 = i - 1;
            final o oVarC = ((g) eVar.f4603d).c(3 - i10);
            final o oVarB = ((c) eVar.f4604e).b();
            b8.h.P(oVarC, oVarB).f((ScheduledExecutorService) eVar.f4605g, new o8.a() { // from class: wb.a
                @Override // o8.a
                public final Object d(o oVar) throws JSONException {
                    Boolean boolValueOf;
                    e2.e eVar2 = eVar;
                    o oVar2 = oVarC;
                    o oVar3 = oVarB;
                    long j9 = j8;
                    int i11 = i10;
                    if (!oVar2.j()) {
                        return b8.h.n(new vb.c("Failed to auto-fetch config update.", oVar2.g()));
                    }
                    if (!oVar3.j()) {
                        return b8.h.n(new vb.c("Failed to get activated config for auto-fetch", oVar3.g()));
                    }
                    f fVar = (f) oVar2.h();
                    e eVarA = (e) oVar3.h();
                    e eVar3 = fVar.f13975b;
                    if (eVar3 != null) {
                        boolValueOf = Boolean.valueOf(eVar3.f >= j9);
                    } else {
                        boolValueOf = Boolean.valueOf(fVar.f13974a == 1);
                    }
                    Object obj = null;
                    if (!boolValueOf.booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        eVar2.a(i11, j9);
                        return b8.h.o(null);
                    }
                    if (fVar.f13975b == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return b8.h.o(null);
                    }
                    if (eVarA == null) {
                        eVarA = e.d().a();
                    }
                    e eVar4 = fVar.f13975b;
                    JSONObject jSONObject = eVarA.f13972e;
                    JSONObject jSONObject2 = eVar4.f13968a;
                    JSONObject jSONObject3 = eVar4.f13969b;
                    JSONObject jSONObject4 = eVar4.f13972e;
                    JSONObject jSONObject5 = e.a(new JSONObject(jSONObject2.toString())).f13969b;
                    HashMap mapC = eVarA.c();
                    HashMap mapC2 = eVar4.c();
                    HashMap mapB = eVarA.b();
                    HashMap mapB2 = eVar4.b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject6 = eVarA.f13969b;
                    Iterator<String> itKeys = jSONObject6.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (jSONObject3.has(next)) {
                            Object obj2 = obj;
                            if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                                hashSet.add(next);
                            } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                                hashSet.add(next);
                            } else if ((jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) || mapC.containsKey(next) != mapC2.containsKey(next)) {
                                hashSet.add(next);
                            } else if ((mapC.containsKey(next) && mapC2.containsKey(next) && !((Map) mapC.get(next)).equals(mapC2.get(next))) || mapB.containsKey(next) != mapB2.containsKey(next)) {
                                hashSet.add(next);
                            } else if (mapB2.containsKey(next) && mapB.containsKey(next) && !((JSONObject) mapB2.get(next)).toString().equals(((JSONObject) mapB.get(next)).toString())) {
                                hashSet.add(next);
                            } else {
                                jSONObject5.remove(next);
                            }
                            obj = obj2;
                        } else {
                            hashSet.add(next);
                        }
                    }
                    Object obj3 = obj;
                    Iterator<String> itKeys2 = jSONObject5.keys();
                    while (itKeys2.hasNext()) {
                        hashSet.add(itKeys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                        return b8.h.o(obj3);
                    }
                    synchronized (eVar2) {
                        Iterator it = ((LinkedHashSet) eVar2.f4601b).iterator();
                        while (it.hasNext()) {
                            ((i) it.next()).getClass();
                        }
                    }
                    return b8.h.o(obj3);
                }
            });
        }
    }
}
