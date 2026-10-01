package vb;

import android.content.Context;
import android.util.Log;
import androidx.emoji2.text.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sb.p;
import wb.j;
import wb.l;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ga.c f13568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f13569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wb.c f13570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wb.c f13571e;
    public final wb.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wb.g f13572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wb.h f13573h;
    public final l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2.c f13574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f13575k;

    public b(Context context, ga.c cVar, Executor executor, wb.c cVar2, wb.c cVar3, wb.c cVar4, wb.g gVar, wb.h hVar, l lVar, p2.c cVar5, p pVar) {
        this.f13567a = context;
        this.f13568b = cVar;
        this.f13569c = executor;
        this.f13570d = cVar2;
        this.f13571e = cVar3;
        this.f = cVar4;
        this.f13572g = gVar;
        this.f13573h = hVar;
        this.i = lVar;
        this.f13574j = cVar5;
        this.f13575k = pVar;
    }

    public static ArrayList c(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final String a(String str) {
        String string;
        wb.h hVar = this.f13573h;
        wb.e eVarC = hVar.f13987c.c();
        String string2 = null;
        if (eVarC == null) {
            string = null;
        } else {
            try {
                string = eVarC.f13969b.getString(str);
            } catch (JSONException unused) {
                string = null;
            }
        }
        if (string == null) {
            wb.e eVarC2 = hVar.f13988d.c();
            if (eVarC2 != null) {
                try {
                    string2 = eVarC2.f13969b.getString(str);
                } catch (JSONException unused2) {
                }
            }
            if (string2 != null) {
                return string2;
            }
            Log.w("FirebaseRemoteConfig", "No value of type 'String' exists for parameter key '" + str + "'.");
            return "";
        }
        wb.e eVarC3 = hVar.f13987c.c();
        if (eVarC3 != null) {
            synchronized (hVar.f13985a) {
                try {
                    Iterator it = hVar.f13985a.iterator();
                    while (it.hasNext()) {
                        hVar.f13986b.execute(new n((g) it.next(), str, eVarC3, 9));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return string;
    }

    public final void b(boolean z2) {
        p2.c cVar = this.f13574j;
        synchronized (cVar) {
            ((j) cVar.f10197x).k(z2);
            if (!z2) {
                cVar.a();
            }
        }
    }
}
