package j2;

import android.content.ClipData;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.j1;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.decoder.av1.Gav1Decoder;
import db.c1;
import db.h0;
import db.k0;
import i4.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.HttpUrl;
import r1.e1;
import t0.q0;
import t0.w1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements z, t0.s, o8.b, s9.g, m5.j, t2.n, u1.g, y1.i {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7138x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f7139y;

    public /* synthetic */ u(Object obj, int i6) {
        this.f7138x = i6;
        this.f7139y = obj;
    }

    @Override // j2.z
    public int a(Object obj) {
        r1.q qVar = (r1.q) this.f7139y;
        q qVar2 = (q) obj;
        String str = qVar2.f7092b;
        if ((!str.equals(qVar.f11670n) && !str.equals(a0.b(qVar))) || !qVar2.c(qVar, false) || !qVar2.d(qVar)) {
            return 0;
        }
        return 1;
    }

    @Override // u1.g
    public void accept(Object obj) {
        switch (this.f7138x) {
            case 14:
                v3.h hVar = (v3.h) this.f7139y;
                v3.a aVar = (v3.a) obj;
                v3.g gVar = new v3.g(aVar.f13262b, ob.a.g(aVar.f13263c, aVar.f13261a));
                hVar.f13273c.add(gVar);
                long j = hVar.j;
                if (j == -9223372036854775807L || aVar.f13264d >= j) {
                    hVar.b(gVar);
                    return;
                }
                return;
            default:
                ((h0) this.f7139y).a((v3.a) obj);
                return;
        }
    }

    @Override // s9.g
    public s9.n b(Object obj) {
        return dg.b.j((nc.i) this.f7139y);
    }

    @Override // m5.j
    public void c() {
        int i6 = this.f7138x;
        Object obj = this.f7139y;
        switch (i6) {
            case 9:
                bf.o[] oVarArr = nd.d.D0;
                ((nd.d) obj).P().getData();
                return;
            default:
                bf.o[] oVarArr2 = nd.e.A0;
                ((nd.e) obj).O();
                return;
        }
    }

    @Override // t2.n
    public c1 d(int i6, e1 e1Var, int[] iArr) {
        t2.k kVar = (t2.k) this.f7139y;
        h0 j = k0.j();
        for (int i10 = 0; i10 < e1Var.f11386a; i10++) {
            j.a(new t2.h(i6, e1Var, i10, kVar, iArr[i10]));
        }
        return j.g();
    }

    @Override // y1.i
    public void e(y1.j jVar) {
        switch (this.f7138x) {
            case 16:
                w3.i iVar = (w3.i) this.f7139y;
                w3.h hVar = (w3.h) jVar;
                hVar.clear();
                iVar.f13793b.add(hVar);
                return;
            default:
                ((Gav1Decoder) this.f7139y).q((VideoDecoderOutputBuffer) jVar);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ic.s] */
    @Override // o8.b
    public Object execute() {
        SQLiteDatabase d10;
        int i6 = this.f7138x;
        Object obj = this.f7139y;
        switch (i6) {
            case 4:
                n8.g gVar = (n8.g) ((n8.c) obj);
                gVar.getClass();
                int i10 = j8.a.f7298e;
                ?? obj2 = new Object();
                obj2.f6782y = null;
                obj2.f6783z = new ArrayList();
                obj2.A = null;
                obj2.f6781x = HttpUrl.FRAGMENT_ENCODE_SET;
                HashMap hashMap = new HashMap();
                d10 = gVar.d();
                d10.beginTransaction();
                try {
                    j8.a aVar = (j8.a) n8.g.S(d10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new i4.h0(gVar, hashMap, (Object) obj2, 8));
                    d10.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 5:
                n8.g gVar2 = (n8.g) ((n8.d) obj);
                long f3 = gVar2.f9142y.f() - gVar2.A.f9134d;
                d10 = gVar2.d();
                d10.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(f3)};
                    Cursor rawQuery = d10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            gVar2.y(rawQuery.getInt(0), j8.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = d10.delete("events", "timestamp_ms < ?", strArr);
                    d10.setTransactionSuccessful();
                    d10.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 6:
                n8.g gVar3 = (n8.g) ((n8.c) ((e6.j) obj).f4396i);
                d10 = gVar3.d();
                d10.beginTransaction();
                try {
                    d10.compileStatement("DELETE FROM log_event_dropped").execute();
                    d10.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.f9142y.f()).execute();
                    d10.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                c6.h hVar = (c6.h) obj;
                Iterator it = ((Iterable) ((n8.g) ((n8.d) hVar.f1982y)).l(new u0(26))).iterator();
                while (it.hasNext()) {
                    ((j1) hVar.f1983z).B((g8.i) it.next(), 1, false);
                }
                return null;
        }
    }

    public boolean f(lc.c cVar, int i6, Bundle bundle) {
        t0.c cVar2;
        p.v vVar = (p.v) this.f7139y;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i6 & 1) != 0) {
            try {
                ((v0.g) cVar.f8328x).c();
                Parcelable parcelable = (Parcelable) ((v0.g) cVar.f8328x).e();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        v0.g gVar = (v0.g) cVar.f8328x;
        ClipData clipData = new ClipData(gVar.getDescription(), new ClipData.Item(gVar.b()));
        if (i10 >= 31) {
            cVar2 = new k7.c(clipData, 2);
        } else {
            t0.d dVar = new t0.d();
            dVar.f12336y = clipData;
            dVar.f12337z = 2;
            cVar2 = dVar;
        }
        cVar2.e(gVar.d());
        cVar2.setExtras(bundle);
        if (q0.n(vVar, cVar2.build()) != null) {
            return false;
        }
        return true;
    }

    @Override // t0.s
    public w1 v(View v10, w1 w1Var) {
        fd.h0 h0Var = (fd.h0) this.f7139y;
        kotlin.jvm.internal.k.e(v10, "v");
        l0.c f3 = w1Var.f12417a.f(647);
        kotlin.jvm.internal.k.d(f3, "getInsets(...)");
        h0Var.invoke(v10, f3);
        return w1Var;
    }
}
