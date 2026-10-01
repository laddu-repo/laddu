package mc;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.playfy.tv.R;
import i4.h0;
import i4.u0;
import j1.f0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import nc.m;
import nc.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import s9.n;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8801a;

    /* renamed from: b, reason: collision with root package name */
    public final kb.c f8802b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f8803c;

    /* renamed from: d, reason: collision with root package name */
    public final nc.e f8804d;

    /* renamed from: e, reason: collision with root package name */
    public final nc.e f8805e;

    /* renamed from: f, reason: collision with root package name */
    public final nc.e f8806f;

    /* renamed from: g, reason: collision with root package name */
    public final nc.j f8807g;

    /* renamed from: h, reason: collision with root package name */
    public final nc.k f8808h;

    /* renamed from: i, reason: collision with root package name */
    public final o f8809i;
    public final f0 j;

    /* renamed from: k, reason: collision with root package name */
    public final n9.j f8810k;

    public d(Context context, kb.c cVar, Executor executor, nc.e eVar, nc.e eVar2, nc.e eVar3, nc.j jVar, nc.k kVar, o oVar, f0 f0Var, n9.j jVar2) {
        this.f8801a = context;
        this.f8802b = cVar;
        this.f8803c = executor;
        this.f8804d = eVar;
        this.f8805e = eVar2;
        this.f8806f = eVar3;
        this.f8807g = jVar;
        this.f8808h = kVar;
        this.f8809i = oVar;
        this.j = f0Var;
        this.f8810k = jVar2;
    }

    public static ArrayList g(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i6);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public final n a() {
        Task b10 = this.f8804d.b();
        Task b11 = this.f8805e.b();
        return dg.b.r(b10, b11).d(this.f8803c, new h0(this, b10, b11, 5));
    }

    public final void b(ed.a aVar) {
        f0 f0Var = this.j;
        synchronized (f0Var) {
            ((LinkedHashSet) f0Var.f6907y).add(aVar);
            f0Var.B();
        }
    }

    public final n c() {
        nc.j jVar = this.f8807g;
        long j = jVar.f9637g.f9666a.getLong("minimum_fetch_interval_in_seconds", nc.j.f9630i);
        HashMap hashMap = new HashMap(jVar.f9638h);
        hashMap.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return jVar.f9635e.b().d(jVar.f9633c, new m8.g(jVar, j, hashMap)).k(rb.h.f11940x, new u0(25)).k(this.f8803c, new c(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d(java.lang.String r10) {
        /*
            r9 = this;
            nc.k r0 = r9.f8808h
            nc.e r1 = r0.f9641c
            nc.g r1 = r1.c()
            r2 = 0
            if (r1 != 0) goto Lc
            goto L14
        Lc:
            org.json.JSONObject r1 = r1.f9618b     // Catch: org.json.JSONException -> L13
            java.lang.String r1 = r1.getString(r10)     // Catch: org.json.JSONException -> L13
            goto L15
        L13:
        L14:
            r1 = r2
        L15:
            if (r1 == 0) goto L48
            nc.e r2 = r0.f9641c
            nc.g r2 = r2.c()
            if (r2 != 0) goto L20
            goto L45
        L20:
            java.util.HashSet r3 = r0.f9639a
            monitor-enter(r3)
            java.util.HashSet r4 = r0.f9639a     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L42
        L29:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L44
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L42
            mc.j r5 = (mc.j) r5     // Catch: java.lang.Throwable -> L42
            java.util.concurrent.Executor r6 = r0.f9640b     // Catch: java.lang.Throwable -> L42
            a2.e1 r7 = new a2.e1     // Catch: java.lang.Throwable -> L42
            r8 = 17
            r7.<init>(r5, r10, r2, r8)     // Catch: java.lang.Throwable -> L42
            r6.execute(r7)     // Catch: java.lang.Throwable -> L42
            goto L29
        L42:
            r10 = move-exception
            goto L46
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
        L45:
            return r1
        L46:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r10
        L48:
            nc.e r0 = r0.f9642d
            nc.g r0 = r0.c()
            if (r0 != 0) goto L51
            goto L59
        L51:
            org.json.JSONObject r0 = r0.f9618b     // Catch: org.json.JSONException -> L58
            java.lang.String r2 = r0.getString(r10)     // Catch: org.json.JSONException -> L58
            goto L59
        L58:
        L59:
            if (r2 == 0) goto L5c
            return r2
        L5c:
            java.lang.String r0 = "FirebaseRemoteConfig"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No value of type 'String' exists for parameter key '"
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r10 = "'."
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.w(r0, r10)
            java.lang.String r10 = ""
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mc.d.d(java.lang.String):java.lang.String");
    }

    public final void e(boolean z10) {
        f0 f0Var = this.j;
        synchronized (f0Var) {
            ((m) f0Var.f6908z).k(z10);
            if (!z10) {
                f0Var.B();
            }
        }
    }

    public final n f() {
        Context context = this.f8801a;
        HashMap hashMap = new HashMap();
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                Log.e("FirebaseRemoteConfig", "Could not find the resources of the current context while trying to set defaults from an XML.");
            } else {
                XmlResourceParser xml = resources.getXml(R.xml.def);
                String str = null;
                String str2 = null;
                String str3 = null;
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    if (eventType == 2) {
                        str = xml.getName();
                    } else if (eventType == 3) {
                        if (xml.getName().equals("entry")) {
                            if (str2 != null && str3 != null) {
                                hashMap.put(str2, str3);
                            } else {
                                Log.w("FirebaseRemoteConfig", "An entry in the defaults XML has an invalid key and/or value tag.");
                            }
                            str2 = null;
                            str3 = null;
                        }
                        str = null;
                    } else if (eventType == 4 && str != null) {
                        int hashCode = str.hashCode();
                        if (hashCode != 106079) {
                            if (hashCode == 111972721 && str.equals("value")) {
                                str3 = xml.getText();
                            }
                            Log.w("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                        } else {
                            if (str.equals("key")) {
                                str2 = xml.getText();
                            }
                            Log.w("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                        }
                    }
                }
            }
        } catch (IOException e10) {
            e = e10;
            Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e);
            nc.f c10 = nc.g.c();
            c10.f9610a = new JSONObject(hashMap);
            return this.f8806f.e(c10.a()).k(rb.h.f11940x, new u0(24));
        } catch (XmlPullParserException e11) {
            e = e11;
            Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e);
            nc.f c102 = nc.g.c();
            c102.f9610a = new JSONObject(hashMap);
            return this.f8806f.e(c102.a()).k(rb.h.f11940x, new u0(24));
        }
        try {
            nc.f c1022 = nc.g.c();
            c1022.f9610a = new JSONObject(hashMap);
            return this.f8806f.e(c1022.a()).k(rb.h.f11940x, new u0(24));
        } catch (JSONException e12) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e12);
            return dg.b.j(null);
        }
    }
}
