package androidx.fragment.app;

import android.animation.Animator;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.internal.measurement.mb;
import com.google.android.material.button.MaterialButton;
import com.livxow.tv.activities.SplashActivity;
import com.livxow.tv.activities.TvActivity;
import com.livxow.tv.app.App;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements p0.b, w1.n, w1.m, ma.e, i7.b, o8.c, qc.j, nc.c, h7.f, mb.a, w1.f, o8.a, o8.g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1007v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1008w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1009x;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f1007v = i;
        this.f1008w = obj;
        this.f1009x = obj2;
    }

    private final Object h(o8.o oVar) {
        sb.i iVar = (sb.i) this.f1008w;
        String str = (String) this.f1009x;
        synchronized (iVar) {
            ((v.e) iVar.f11728b).remove(str);
        }
        return oVar;
    }

    private final Object i(o8.o oVar) {
        wb.g gVar = (wb.g) this.f1008w;
        Date date = (Date) this.f1009x;
        if (oVar.j()) {
            wb.l lVar = gVar.f13983g;
            synchronized (lVar.f14012b) {
                lVar.f14011a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
            return oVar;
        }
        Exception excG = oVar.g();
        if (excG == null) {
            return oVar;
        }
        if (excG instanceof vb.e) {
            gVar.f13983g.i();
            return oVar;
        }
        gVar.f13983g.h();
        return oVar;
    }

    @Override // o8.g
    public o8.o C(Object obj) {
        wb.c cVar = (wb.c) this.f1008w;
        wb.e eVar = (wb.e) this.f1009x;
        synchronized (cVar) {
            cVar.f13961c = b8.h.o(eVar);
        }
        return b8.h.o(eVar);
    }

    @Override // w1.m
    public void a(Object obj) {
        d2.a aVar = (d2.a) this.f1008w;
        o2.z zVar = (o2.z) this.f1009x;
        d2.k kVar = (d2.k) obj;
        kVar.getClass();
        o2.d0 d0Var = aVar.f3975d;
        if (d0Var == null) {
            return;
        }
        t1.o oVar = zVar.f9592c;
        oVar.getClass();
        int i = zVar.f9593d;
        d2.h hVar = kVar.f4006c;
        t1.s0 s0Var = aVar.f3973b;
        d0Var.getClass();
        b3.a aVar2 = new b3.a(oVar, i, hVar.d(s0Var, d0Var), 3);
        int i10 = zVar.f9591b;
        if (i10 != 0) {
            if (i10 == 1) {
                kVar.f4018q = aVar2;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                kVar.f4019r = aVar2;
                return;
            }
        }
        kVar.f4017p = aVar2;
    }

    @Override // w1.f
    public void accept(Object obj) {
        b3.a aVar = (b3.a) this.f1008w;
        ((o2.k0) obj).h(aVar.f1528w, (o2.d0) aVar.f1529x, (o2.z) this.f1009x);
    }

    @Override // h7.f
    public Object apply(Object obj) {
        h7.h hVar = (h7.h) this.f1008w;
        a7.k kVar = (a7.k) this.f1009x;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        h7.a aVar = hVar.f6174y;
        ArrayList arrayListM = hVar.m(sQLiteDatabase, kVar, aVar.f6160b);
        for (x6.d dVar : x6.d.values()) {
            if (dVar != kVar.f207c) {
                int size = aVar.f6160b - arrayListM.size();
                if (size <= 0) {
                    break;
                }
                arrayListM.addAll(hVar.m(sQLiteDatabase, kVar.b(dVar), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListM.size(); i++) {
            sb2.append(((h7.b) arrayListM.get(i)).f6164a);
            if (i < arrayListM.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j8 = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j8));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j8), hashSet);
                }
                hashSet.add(new h7.g(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListM.listIterator();
        while (listIterator.hasNext()) {
            h7.b bVar = (h7.b) listIterator.next();
            long j9 = bVar.f6164a;
            if (map.containsKey(Long.valueOf(j9))) {
                a7.h hVarC = bVar.f6166c.c();
                for (h7.g gVar : (Set) map.get(Long.valueOf(j9))) {
                    hVarC.a(gVar.f6169a, gVar.f6170b);
                }
                listIterator.set(new h7.b(j9, bVar.f6165b, hVarC.b()));
            }
        }
        return arrayListM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:395:? A[RETURN, SYNTHETIC] */
    @Override // w1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.Object r26, t1.m r27) {
        /*
            Method dump skipped, instruction units count: 1702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e.b(java.lang.Object, t1.m):void");
    }

    @Override // qc.j
    public void c(String str, boolean z2) {
        String str2;
        int i = this.f1007v;
        Object obj = this.f1009x;
        Object obj2 = this.f1008w;
        switch (i) {
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                SplashActivity splashActivity = (SplashActivity) obj2;
                String str3 = (String) obj;
                int i10 = SplashActivity.f3665i0;
                if (z2) {
                    try {
                        App app = App.P;
                        JSONObject jSONObject = new JSONArray(str).getJSONObject(0);
                        splashActivity.f3670e0 = vc.a.v(splashActivity, app, jSONObject);
                        splashActivity.f3671f0 = jSONObject.optString("new_app_versions", "3");
                        if (splashActivity.f3672g0) {
                            splashActivity.z();
                        } else {
                            splashActivity.f3672g0 = true;
                            ((LottieAnimationView) splashActivity.W.f479w).setSpeed(4.0f);
                        }
                    } catch (IndexOutOfBoundsException | JSONException unused) {
                        File externalFilesDir = splashActivity.getExternalFilesDir(null);
                        if (externalFilesDir != null) {
                            ka.c.G(externalFilesDir);
                        }
                        splashActivity.y(str3);
                        return;
                    }
                } else if (!"cHJvX2lzX3Bybw==".equals(str)) {
                    splashActivity.y(str3);
                } else {
                    splashActivity.f3666a0 = false;
                    ((ScrollView) splashActivity.X.f11742w).setVisibility(0);
                }
                break;
            case 12:
                qc.h hVar = (qc.h) obj2;
                String str4 = (String) obj;
                try {
                    JSONObject jSONObject2 = new JSONObject(android.support.v4.media.session.b.k(str));
                    if (!jSONObject2.has("playback_url")) {
                        String string = jSONObject2.getString("link");
                        HashMap map = new HashMap();
                        if (string.contains("|")) {
                            String[] strArrSplit = string.split("\\|");
                            str2 = strArrSplit[0];
                            map = android.support.v4.media.session.b.s(strArrSplit[1]);
                        } else {
                            str2 = string;
                        }
                        String string2 = jSONObject2.getString("type");
                        ef.q qVarT = android.support.v4.media.session.b.t(map);
                        b8.h.K(str2, false, null, qVarT, new qc.e(hVar, str2, string2, str4, qVarT));
                    } else {
                        hVar.h(jSONObject2.getString("playback_url"), null);
                    }
                } catch (JSONException unused2) {
                    hVar.h("error", null);
                    return;
                }
                break;
            default:
                String str5 = (String) obj2;
                qc.j jVar = (qc.j) obj;
                if (!z2) {
                    jVar.c("https://error.m3u8", false);
                } else {
                    new Thread(new androidx.emoji2.text.n(str, str5, jVar, 7)).start();
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5 A[Catch: all -> 0x0055, TryCatch #3 {all -> 0x0055, blocks: (B:11:0x003c, B:14:0x0041, B:15:0x0042, B:23:0x005d, B:56:0x00d1, B:58:0x00d5, B:59:0x00d9), top: B:104:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #3 {all -> 0x0055, blocks: (B:11:0x003c, B:14:0x0041, B:15:0x0042, B:23:0x005d, B:56:0x00d1, B:58:0x00d5, B:59:0x00d9), top: B:104:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0121  */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [o8.o] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v3, types: [wb.j] */
    @Override // o8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(o8.o r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e.d(o8.o):java.lang.Object");
    }

    @Override // i7.b
    public Object e() {
        switch (this.f1007v) {
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                ab.f fVar = (ab.f) this.f1008w;
                Iterable iterable = (Iterable) this.f1009x;
                h7.h hVar = (h7.h) ((h7.d) fVar.f300c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + h7.h.D(iterable)).execute();
                    break;
                }
                break;
            default:
                ab.f fVar2 = (ab.f) this.f1008w;
                for (Map.Entry entry : ((HashMap) this.f1009x).entrySet()) {
                    ((h7.h) ((h7.c) fVar2.i)).A(((Integer) entry.getValue()).intValue(), d7.c.B, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // mb.a
    public void f(mb.b bVar) {
        mb.a aVar = (mb.a) this.f1008w;
        mb.a aVar2 = (mb.a) this.f1009x;
        aVar.f(bVar);
        aVar2.f(bVar);
    }

    @Override // nc.c
    public void g(int i) {
        TvActivity tvActivity = (TvActivity) this.f1008w;
        mb mbVar = (mb) this.f1009x;
        int i10 = TvActivity.f3678g0;
        if (i == ((LinearLayout) mbVar.f2889c).getId()) {
            View view = tvActivity.f3680b0;
            if (view != null) {
                view.setSelected(false);
            }
            MaterialButton materialButton = tvActivity.W.f7063c;
            tvActivity.f3680b0 = materialButton;
            materialButton.setSelected(true);
        }
    }

    @Override // p0.b
    public void onCancel() {
        Animator animator = (Animator) this.f1008w;
        c1 c1Var = (c1) this.f1009x;
        de.i.e(c1Var, "$operation");
        animator.end();
        if (q0.I(2)) {
            Log.v("FragmentManager", "Animator from operation " + c1Var + " has been canceled.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // ma.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(ad.c r5) {
        /*
            r4 = this;
            int r0 = r4.f1007v
            switch(r0) {
                case 3: goto L99;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f1008w
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.f1009x
            d2.e r1 = (d2.e) r1
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Object r5 = r5.b(r2)
            android.content.Context r5 = (android.content.Context) r5
            int r1 = r1.f3985v
            switch(r1) {
                case 10: goto L87;
                case 11: goto L72;
                case 12: goto L30;
                default: goto L1a;
            }
        L1a:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            java.lang.String r5 = r5.getPackageName()
            java.lang.String r5 = r1.getInstallerPackageName(r5)
            if (r5 == 0) goto L2d
            java.lang.String r5 = com.google.firebase.FirebaseCommonRegistrar.a(r5)
            goto L93
        L2d:
            java.lang.String r5 = ""
            goto L93
        L30:
            int r1 = android.os.Build.VERSION.SDK_INT
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.television"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L41
            java.lang.String r5 = "tv"
            goto L93
        L41:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.watch"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L50
            java.lang.String r5 = "watch"
            goto L93
        L50:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.automotive"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L5f
            java.lang.String r5 = "auto"
            goto L93
        L5f:
            r2 = 26
            if (r1 < r2) goto L2d
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r1 = "android.hardware.type.embedded"
            boolean r5 = r5.hasSystemFeature(r1)
            if (r5 == 0) goto L2d
            java.lang.String r5 = "embedded"
            goto L93
        L72:
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            if (r5 == 0) goto L2d
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L2d
            int r5 = a2.c.a(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            goto L93
        L87:
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            if (r5 == 0) goto L2d
            int r5 = r5.targetSdkVersion
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L93:
            ub.a r1 = new ub.a
            r1.<init>(r0, r5)
            return r1
        L99:
            java.lang.Object r0 = r4.f1008w
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.f1009x
            ma.b r1 = (ma.b) r1
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> Lae
            ma.e r0 = r1.f     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r5 = r0.p(r5)     // Catch: java.lang.Throwable -> Lae
            android.os.Trace.endSection()
            return r5
        Lae:
            r5 = move-exception
            android.os.Trace.endSection()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e.p(ad.c):java.lang.Object");
    }

    @Override // o8.c
    public void u(o8.o oVar) {
        int i = this.f1007v;
        Object obj = this.f1009x;
        Object obj2 = this.f1008w;
        switch (i) {
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                SplashActivity splashActivity = (SplashActivity) obj2;
                vb.b bVar = (vb.b) obj;
                int i10 = SplashActivity.f3665i0;
                String strA = bVar.a("api_url");
                splashActivity.f3668c0.f10469b = bVar.a("telegram_url");
                vc.a.j(splashActivity).edit().putString("api_host", strA).apply();
                splashActivity.v(strA);
                break;
            default:
                ((sb.g) obj2).a((Intent) obj);
                break;
        }
    }
}
