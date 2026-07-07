package ab;

import a7.j;
import a7.k;
import a7.q;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import androidx.fragment.app.d1;
import androidx.media3.decoder.DecoderInputBuffer;
import de.i;
import ed.o;
import h7.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k8.a0;
import org.json.JSONObject;
import z6.g0;
import z6.h0;
import z6.j0;
import z6.l;
import z6.m;
import z6.n;
import z6.p;
import z6.r;
import z6.s;
import z6.t;
import z6.v;
import z6.z;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f302e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f304h;
    public Object i;

    public f(hd.a aVar, a9.g gVar, Handler handler) {
        i.e(handler, "uiHandler");
        this.f298a = aVar;
        this.f299b = handler;
        this.f300c = new Object();
        this.f301d = new LinkedHashMap();
        this.f302e = new LinkedHashMap();
        this.f = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("FetchNotificationsIO");
        handlerThread.start();
        this.f303g = new Handler(handlerThread.getLooper());
        this.f304h = new LinkedHashMap();
        this.i = new o(this);
    }

    public static void f(JSONObject jSONObject, String str) {
        StringBuilder sbB = y.e.b(str);
        sbB.append(jSONObject.toString());
        String string = sbB.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public void a(int i, qc.a aVar) {
        synchronized (this.f300c) {
            try {
                Set linkedHashSet = (Set) ((LinkedHashMap) this.f301d).get(Integer.valueOf(i));
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(new WeakReference(aVar));
                ((LinkedHashMap) this.f301d).put(Integer.valueOf(i), linkedHashSet);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (this.f300c) {
            ((LinkedHashMap) this.f301d).clear();
            ((LinkedHashMap) this.f302e).clear();
            ((ArrayList) this.f).clear();
            ((LinkedHashMap) this.f304h).clear();
        }
    }

    public d c(int i) {
        d dVar = null;
        try {
            if (!y.e.a(2, i)) {
                JSONObject jSONObjectI = ((s5.c) this.f302e).I();
                if (jSONObjectI != null) {
                    d dVarD = ((a9.g) this.f300c).D(jSONObjectI);
                    f(jSONObjectI, "Loaded cached settings: ");
                    ((a0) this.f301d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (y.e.a(3, i) || dVarD.f293c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return dVarD;
                        } catch (Exception e7) {
                            e = e7;
                            dVar = dVarD;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return dVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e10) {
            e = e10;
        }
    }

    public d d() {
        return (d) ((AtomicReference) this.f304h).get();
    }

    public void e(k kVar, int i) {
        byte[] bArr;
        long j8;
        b7.a aVar;
        String str;
        b7.a aVar2;
        int i10;
        k2.f fVarB;
        String str2;
        Integer numValueOf;
        f fVar;
        byte[] bArr2;
        final f fVar2 = this;
        final k kVar2 = kVar;
        byte[] bArr3 = kVar2.f206b;
        i7.c cVar = (i7.c) fVar2.f;
        b7.e eVarA = ((b7.d) fVar2.f299b).a(kVar2.f205a);
        long jMax = 0;
        while (true) {
            final int i11 = 0;
            h7.h hVar = (h7.h) cVar;
            if (!((Boolean) hVar.B(new i7.b(fVar2) { // from class: g7.d

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ ab.f f5725w;

                {
                    this.f5725w = fVar2;
                }

                @Override // i7.b
                public final Object e() {
                    Boolean bool;
                    switch (i11) {
                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                            k kVar3 = kVar2;
                            h hVar2 = (h) ((h7.d) this.f5725w.f300c);
                            SQLiteDatabase sQLiteDatabaseA = hVar2.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lI = h.i(sQLiteDatabaseA, kVar3);
                                if (lI == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lI.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                return bool;
                            } finally {
                                sQLiteDatabaseA.endTransaction();
                            }
                        default:
                            h hVar3 = (h) ((h7.d) this.f5725w.f300c);
                            hVar3.getClass();
                            return (Iterable) hVar3.l(new androidx.fragment.app.e(9, hVar3, kVar2));
                    }
                }
            })).booleanValue()) {
                hVar.B(new g7.f(fVar2, kVar2, jMax));
                return;
            }
            final int i12 = 1;
            Iterable iterable = (Iterable) hVar.B(new i7.b(fVar2) { // from class: g7.d

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ ab.f f5725w;

                {
                    this.f5725w = fVar2;
                }

                @Override // i7.b
                public final Object e() {
                    Boolean bool;
                    switch (i12) {
                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                            k kVar3 = kVar2;
                            h hVar2 = (h) ((h7.d) this.f5725w.f300c);
                            SQLiteDatabase sQLiteDatabaseA = hVar2.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lI = h.i(sQLiteDatabaseA, kVar3);
                                if (lI == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lI.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                return bool;
                            } finally {
                                sQLiteDatabaseA.endTransaction();
                            }
                        default:
                            h hVar3 = (h) ((h7.d) this.f5725w.f300c);
                            hVar3.getClass();
                            return (Iterable) hVar3.l(new androidx.fragment.app.e(9, hVar3, kVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (eVarA == null) {
                b8.h.j("Uploader", "Unknown backend for %s, deleting event batch for it...", kVar2);
                aVar2 = new b7.a(3, -1L);
                bArr = bArr3;
                j8 = jMax;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((h7.b) it.next()).f6166c);
                }
                if (bArr3 != null) {
                    h7.c cVar2 = (h7.c) fVar2.i;
                    Objects.requireNonNull(cVar2);
                    d7.a aVar3 = (d7.a) hVar.B(new d1(17, cVar2));
                    a7.h hVar2 = new a7.h();
                    hVar2.f190h = new HashMap();
                    hVar2.f = Long.valueOf(((j7.a) fVar2.f303g).d());
                    hVar2.f189g = Long.valueOf(((j7.a) fVar2.f304h).d());
                    hVar2.f184a = "GDT_CLIENT_METRICS";
                    x6.c cVar3 = new x6.c("proto");
                    aVar3.getClass();
                    hd.a aVar4 = q.f217a;
                    aVar4.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        aVar4.r(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    hVar2.f188e = new a7.o(cVar3, byteArrayOutputStream.toByteArray());
                    arrayList.add(((y6.b) eVarA).a(hVar2.b()));
                }
                y6.b bVar = (y6.b) eVarA;
                HashMap map = new HashMap();
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    a7.i iVar = (a7.i) obj;
                    String str3 = iVar.f192a;
                    if (map.containsKey(str3)) {
                        bArr2 = bArr3;
                        ((List) map.get(str3)).add(iVar);
                    } else {
                        bArr2 = bArr3;
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(iVar);
                        map.put(str3, arrayList2);
                    }
                    bArr3 = bArr2;
                }
                bArr = bArr3;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    a7.i iVar2 = (a7.i) ((List) entry.getValue()).get(0);
                    j0 j0Var = j0.f14780v;
                    long jD = bVar.f.d();
                    long jD2 = bVar.f14508e.d();
                    n nVar = new n(new l(Integer.valueOf(iVar2.b("sdk-version")), iVar2.a("model"), iVar2.a("hardware"), iVar2.a("device"), iVar2.a("product"), iVar2.a("os-uild"), iVar2.a("manufacturer"), iVar2.a("fingerprint"), iVar2.a("locale"), iVar2.a("country"), iVar2.a("mcc_mnc"), iVar2.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (a7.i iVar3 : (List) entry.getValue()) {
                        Iterator it3 = it2;
                        a7.o oVar = iVar3.f194c;
                        byte[] bArr4 = iVar3.f199j;
                        x6.c cVar4 = oVar.f214a;
                        byte[] bArr5 = oVar.f215b;
                        long j9 = jMax;
                        if (cVar4.equals(new x6.c("proto"))) {
                            fVar = new f();
                            fVar.f302e = bArr5;
                        } else if (cVar4.equals(new x6.c("json"))) {
                            String str4 = new String(bArr5, Charset.forName("UTF-8"));
                            f fVar3 = new f();
                            fVar3.f = str4;
                            fVar = fVar3;
                        } else {
                            String strW = b8.h.w("CctTransportBackend");
                            if (Log.isLoggable(strW, 5)) {
                                Log.w(strW, "Received event of unsupported encoding " + cVar4 + ". Skipping...");
                            }
                            it2 = it3;
                            jMax = j9;
                        }
                        fVar.f298a = Long.valueOf(iVar3.f195d);
                        fVar.f301d = Long.valueOf(iVar3.f196e);
                        String str5 = (String) iVar3.f.get("tz-offset");
                        fVar.f303g = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        fVar.f304h = new v((h0) h0.f14763v.get(iVar3.b("net-type")), (g0) g0.f14759v.get(iVar3.b("mobile-subtype")));
                        Integer num = iVar3.f193b;
                        if (num != null) {
                            fVar.f299b = num;
                        }
                        Integer num2 = iVar3.f197g;
                        if (num2 != null) {
                            r rVar = new r(new z6.q(num2));
                            z zVar = z.f14819v;
                            fVar.f300c = new z6.o(rVar);
                        }
                        byte[] bArr6 = iVar3.i;
                        if (bArr6 != null || bArr4 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            fVar.i = new p(bArr6, bArr4 != null ? bArr4 : null);
                        }
                        String strC = ((Long) fVar.f298a) == null ? " eventTimeMs" : "";
                        if (((Long) fVar.f301d) == null) {
                            strC = strC.concat(" eventUptimeMs");
                        }
                        if (((Long) fVar.f303g) == null) {
                            strC = u5.a.c(strC, " timezoneOffsetSeconds");
                        }
                        if (!strC.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strC));
                        }
                        arrayList4.add(new s(((Long) fVar.f298a).longValue(), (Integer) fVar.f299b, (z6.o) fVar.f300c, ((Long) fVar.f301d).longValue(), (byte[]) fVar.f302e, (String) fVar.f, ((Long) fVar.f303g).longValue(), (v) fVar.f304h, (p) fVar.i));
                        it2 = it3;
                        jMax = j9;
                    }
                    arrayList3.add(new t(jD, jD2, nVar, numValueOf, str2, arrayList4));
                    it2 = it2;
                }
                j8 = jMax;
                m mVar = new m(arrayList3);
                URL urlB = bVar.f14507d;
                if (bArr != null) {
                    try {
                        y6.a aVarA = y6.a.a(bArr);
                        str = aVarA.f14503b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = aVarA.f14502a;
                        if (str6 != null) {
                            urlB = y6.b.b(str6);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new b7.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    xa.a aVar5 = new xa.a(urlB, mVar, str);
                    pa.a aVar6 = new pa.a(20, bVar);
                    int i14 = 5;
                    do {
                        fVarB = aVar6.b(aVar5);
                        URL url = (URL) fVarB.f7287c;
                        if (url != null) {
                            b8.h.j("CctTransportBackend", "Following redirect to: %s", url);
                            aVar5 = new xa.a(url, (m) aVar5.f14310x, (String) aVar5.f14308v);
                        } else {
                            aVar5 = null;
                        }
                        if (aVar5 == null) {
                            break;
                        } else {
                            i14--;
                        }
                    } while (i14 >= 1);
                    int i15 = fVarB.f7285a;
                    if (i15 == 200) {
                        aVar2 = new b7.a(1, fVarB.f7286b);
                    } else {
                        if (i15 >= 500 || i15 == 404) {
                            aVar = new b7.a(2, -1L);
                        } else if (i15 == 400) {
                            try {
                                aVar = new b7.a(4, -1L);
                            } catch (IOException e7) {
                                e = e7;
                                b8.h.m("CctTransportBackend", "Could not make request to the backend", e);
                                i10 = 2;
                                aVar2 = new b7.a(2, -1L);
                            }
                        } else {
                            aVar = new b7.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e10) {
                    e = e10;
                }
            }
            i10 = 2;
            int i16 = aVar2.f1566a;
            if (i16 == i10) {
                hVar.B(new g7.e(this, iterable, kVar, j8));
                ((j) this.f301d).u(kVar, i + 1, true);
                return;
            }
            fVar2 = this;
            kVar2 = kVar;
            jMax = j8;
            hVar.B(new androidx.fragment.app.e(4, fVar2, iterable));
            if (i16 == 1) {
                jMax = Math.max(jMax, aVar2.f1567b);
                if (bArr != null) {
                    hVar.B(new d1(19, fVar2));
                }
            } else if (i16 == 4) {
                HashMap map2 = new HashMap();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String str7 = ((h7.b) it4.next()).f6166c.f192a;
                    if (map2.containsKey(str7)) {
                        map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                    } else {
                        map2.put(str7, 1);
                    }
                }
                hVar.B(new androidx.fragment.app.e(5, fVar2, map2));
            }
            bArr3 = bArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r3.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(int r3, zc.e r4) {
        /*
            r2 = this;
            java.lang.String r0 = "fetchListener"
            de.i.e(r4, r0)
            java.lang.Object r0 = r2.f300c
            monitor-enter(r0)
            java.lang.Object r1 = r2.f301d     // Catch: java.lang.Throwable -> L1d
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Set r3 = (java.util.Set) r3     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L1f
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r3 = move-exception
            goto L3d
        L1f:
            r3 = 0
        L20:
            if (r3 == 0) goto L3b
        L22:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L1d
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1d
            boolean r1 = de.i.a(r1, r4)     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L22
            r3.remove()     // Catch: java.lang.Throwable -> L1d
        L3b:
            monitor-exit(r0)
            return
        L3d:
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.f.g(int, zc.e):void");
    }
}
