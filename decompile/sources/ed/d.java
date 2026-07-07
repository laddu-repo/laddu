package ed;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import k8.k4;
import o2.d0;
import o2.k0;
import o2.z;
import sb.p;
import sb.q;
import t1.t0;
import y9.b0;
import y9.f0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements i7.b, h7.f, w1.f, r2.n, o8.g, o8.a, o8.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4874v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4875w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f4876x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f4877y;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i) {
        this.f4874v = i;
        this.f4875w = obj;
        this.f4876x = obj2;
        this.f4877y = obj3;
    }

    @Override // o8.g
    public o8.o C(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f4875w;
        String str = (String) this.f4876x;
        q qVar = (q) this.f4877y;
        String str2 = (String) obj;
        k4 k4VarC = FirebaseMessaging.c(firebaseMessaging.f3614b);
        fa.g gVar = firebaseMessaging.f3613a;
        gVar.a();
        String strD = "[DEFAULT]".equals(gVar.f5337b) ? "" : gVar.d();
        String strA = firebaseMessaging.i.a();
        synchronized (k4VarC) {
            String strA2 = q.a(System.currentTimeMillis(), str2, strA);
            if (strA2 != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) k4VarC.f7607v).edit();
                editorEdit.putString(strD + "|T|" + str + "|*", strA2);
                editorEdit.commit();
            }
        }
        if (qVar == null || !str2.equals(qVar.f11747a)) {
            fa.g gVar2 = firebaseMessaging.f3613a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f5337b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb2.append(gVar2.f5337b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new sb.i(firebaseMessaging.f3614b).b(intent);
            }
        }
        return b8.h.o(str2);
    }

    @Override // r2.n
    public z0 a(int i, t0 t0Var, int[] iArr) {
        r2.j jVar = (r2.j) this.f4875w;
        String str = (String) this.f4876x;
        String str2 = (String) this.f4877y;
        b0 b0VarJ = f0.j();
        for (int i10 = 0; i10 < t0Var.f12111a; i10++) {
            b0VarJ.a(new r2.m(i, t0Var, i10, jVar, iArr[i10], str, str2));
        }
        return b0VarJ.g();
    }

    @Override // w1.f
    public void accept(Object obj) {
        b3.a aVar = (b3.a) this.f4875w;
        ((k0) obj).f(aVar.f1528w, (d0) this.f4876x, (z) this.f4877y);
    }

    @Override // h7.f
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        d7.c cVar;
        int i = this.f4874v;
        int i10 = 5;
        int i11 = 4;
        int i12 = 3;
        d7.c cVar2 = d7.c.f4373y;
        int i13 = 2;
        int i14 = 1;
        Object obj2 = this.f4877y;
        Object obj3 = this.f4876x;
        int i15 = 0;
        h7.h hVar = (h7.h) this.f4875w;
        switch (i) {
            case 2:
                a7.i iVar = (a7.i) obj3;
                a7.o oVar = iVar.f194c;
                String str = iVar.f192a;
                a7.k kVar = (a7.k) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                h7.a aVar = hVar.f6174y;
                if (jSimpleQueryForLong >= aVar.f6159a) {
                    hVar.A(1L, cVar2, str);
                    return -1L;
                }
                Long lI = h7.h.i(sQLiteDatabase, kVar);
                if (lI != null) {
                    jInsert = lI.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", kVar.f205a);
                    contentValues.put("priority", Integer.valueOf(k7.a.a(kVar.f207c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = kVar.f206b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i16 = aVar.f6163e;
                byte[] bArr2 = oVar.f215b;
                boolean z2 = bArr2.length <= i16;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(iVar.f195d));
                contentValues2.put("uptime_ms", Long.valueOf(iVar.f196e));
                contentValues2.put("payload_encoding", oVar.f214a.f14247a);
                contentValues2.put("code", iVar.f193b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z2));
                contentValues2.put("payload", z2 ? bArr2 : new byte[0]);
                contentValues2.put("product_id", iVar.f197g);
                contentValues2.put("pseudonymous_id", iVar.f198h);
                contentValues2.put("experiment_ids_clear_blob", iVar.i);
                contentValues2.put("experiment_ids_encrypted_blob", iVar.f199j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z2) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i16));
                    for (int i17 = 1; i17 <= iCeil; i17++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i17 - 1) * i16, Math.min(i17 * i16, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i17));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(iVar.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 3:
                ArrayList arrayList = (ArrayList) obj3;
                a7.k kVar2 = (a7.k) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j8 = cursor2.getLong(0);
                    int i18 = cursor2.getInt(7) != 0 ? i14 : 0;
                    a7.h hVar2 = new a7.h();
                    hVar2.f190h = new HashMap();
                    String string = cursor2.getString(i14);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    hVar2.f184a = string;
                    hVar2.f = Long.valueOf(cursor2.getLong(i13));
                    hVar2.f189g = Long.valueOf(cursor2.getLong(3));
                    if (i18 != 0) {
                        String string2 = cursor2.getString(4);
                        hVar2.f188e = new a7.o(string2 == null ? h7.h.A : new x6.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        x6.c cVar3 = string3 == null ? h7.h.A : new x6.c(string3);
                        Cursor cursorQuery = hVar.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j8)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                                break;
                            }
                            byte[] bArr3 = new byte[length];
                            int i19 = 0;
                            int length2 = 0;
                            while (i19 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i19);
                                cursor = cursorQuery;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i19++;
                                    cursorQuery = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            hVar2.f188e = new a7.o(cVar3, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        hVar2.f186c = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        hVar2.f187d = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        hVar2.f185b = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        hVar2.i = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        hVar2.f191j = cursor2.getBlob(11);
                    }
                    arrayList.add(new h7.b(j8, kVar2, hVar2.b()));
                    i13 = 2;
                    i14 = 1;
                }
                return null;
            default:
                HashMap map = (HashMap) obj3;
                p pVar = (p) obj2;
                ArrayList arrayList4 = (ArrayList) pVar.f11744y;
                Cursor cursor3 = (Cursor) obj;
                hVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i15);
                    int i20 = cursor3.getInt(1);
                    d7.c cVar4 = d7.c.f4371w;
                    if (i20 != 0) {
                        if (i20 == 1) {
                            cVar4 = d7.c.f4372x;
                        } else if (i20 == 2) {
                            cVar = cVar2;
                        } else if (i20 == i12) {
                            cVar4 = d7.c.f4374z;
                        } else if (i20 == i11) {
                            cVar4 = d7.c.A;
                        } else if (i20 == i10) {
                            cVar4 = d7.c.B;
                        } else if (i20 == 6) {
                            cVar4 = d7.c.C;
                        } else {
                            b8.h.j("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i20));
                        }
                        cVar = cVar4;
                    } else {
                        cVar = cVar4;
                    }
                    long j9 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new d7.d(j9, cVar));
                    i15 = 0;
                    i10 = 5;
                    i11 = 4;
                    i12 = 3;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i21 = d7.e.f4378c;
                    new ArrayList();
                    arrayList4.add(new d7.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jD = hVar.f6172w.d();
                SQLiteDatabase sQLiteDatabaseA = hVar.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        d7.g gVar = new d7.g(cursorRawQuery.getLong(0), jD);
                        cursorRawQuery.close();
                        sQLiteDatabaseA.setTransactionSuccessful();
                        sQLiteDatabaseA.endTransaction();
                        pVar.f11743x = gVar;
                        pVar.f11745z = new d7.b(new d7.f(hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), h7.a.f.f6159a));
                        pVar.f11742w = (String) hVar.f6175z.get();
                        return new d7.a((d7.g) pVar.f11743x, Collections.unmodifiableList(arrayList4), (d7.b) pVar.f11745z, (String) pVar.f11742w);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseA.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // o8.a
    public Object d(o8.o oVar) {
        wb.e eVar;
        URL url;
        switch (this.f4874v) {
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                o8.h hVar = (o8.h) this.f4875w;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f4876x;
                k4 k4Var = (k4) this.f4877y;
                if (oVar.j()) {
                    hVar.c(oVar.h());
                } else if (oVar.g() != null) {
                    hVar.b(oVar.g());
                } else if (atomicBoolean.getAndSet(true)) {
                    ((o8.o) ((k4) k4Var.f7607v).f7607v).m(null);
                }
                return b8.h.o(null);
            case 9:
                vb.b bVar = (vb.b) this.f4875w;
                o8.o oVar2 = (o8.o) this.f4876x;
                o8.o oVar3 = (o8.o) this.f4877y;
                if (!oVar2.j() || oVar2.h() == null) {
                    return b8.h.o(Boolean.FALSE);
                }
                wb.e eVar2 = (wb.e) oVar2.h();
                return (oVar3.j() && (eVar = (wb.e) oVar3.h()) != null && eVar2.f13970c.equals(eVar.f13970c)) ? b8.h.o(Boolean.FALSE) : bVar.f13571e.e(eVar2).e(bVar.f13569c, new vb.a(bVar));
            default:
                wb.j jVar = (wb.j) this.f4875w;
                o8.o oVar4 = (o8.o) this.f4876x;
                o8.o oVar5 = (o8.o) this.f4877y;
                if (!oVar4.j()) {
                    return b8.h.n(new vb.c("Firebase Installations failed to get installation auth token for config update listener connection.", oVar4.g()));
                }
                if (!oVar5.j()) {
                    return b8.h.n(new vb.c("Firebase Installations failed to get installation ID for config update listener connection.", oVar5.g()));
                }
                try {
                    try {
                        url = new URL(jVar.c(jVar.f14003n));
                        break;
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    jVar.l(httpURLConnection, (String) oVar5.h(), ((nb.a) oVar4.h()).f9069a);
                    return b8.h.o(httpURLConnection);
                } catch (IOException e7) {
                    return b8.h.n(new vb.c("Failed to open HTTP stream connection", e7));
                }
        }
    }

    @Override // i7.b
    public Object e() {
        f7.a aVar = (f7.a) this.f4875w;
        a7.k kVar = (a7.k) this.f4876x;
        a7.i iVar = (a7.i) this.f4877y;
        h7.h hVar = (h7.h) aVar.f5303d;
        hVar.getClass();
        x6.d dVar = kVar.f207c;
        String str = iVar.f192a;
        String str2 = kVar.f205a;
        String strW = b8.h.w("SQLiteEventStore");
        if (Log.isLoggable(strW, 3)) {
            Log.d(strW, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar.l(new d(hVar, iVar, kVar, 2))).getClass();
        aVar.f5300a.u(kVar, 1, false);
        return null;
    }

    @Override // o8.e
    public void n(Object obj) {
        p pVar = (p) this.f4875w;
        o8.o oVar = (o8.o) this.f4876x;
        pa.c cVar = (pa.c) this.f4877y;
        try {
            wb.e eVar = (wb.e) oVar.h();
            if (eVar != null) {
                ((Executor) pVar.f11744y).execute(new xb.a(cVar, ((p2.c) pVar.f11743x).f(eVar), 1));
            }
        } catch (vb.d e7) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e7);
        }
    }
}
