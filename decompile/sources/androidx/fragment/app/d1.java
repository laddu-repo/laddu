package androidx.fragment.app;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.decoder.av1.Dav1dDecoder;
import com.livxow.tv.activities.MainActivity;
import com.livxow.tv.activities.SplashActivity;
import com.livxow.tv.activities.TvActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d1 implements p0.b, a2.h, w2.h, w1.m, x1.s, i7.b, mc.y, l2.x, ma.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1005v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1006w;

    public /* synthetic */ d1(int i, Object obj) {
        this.f1005v = i;
        this.f1006w = obj;
    }

    @Override // w1.m
    public void a(Object obj) {
        switch (this.f1005v) {
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                ((t1.l0) obj).K((t1.c0) this.f1006w);
                break;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                ((t1.l0) obj).t((t1.x0) this.f1006w);
                break;
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                ((t1.l0) obj).I((v1.c) this.f1006w);
                break;
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                ((t1.l0) obj).K(((c2.g0) this.f1006w).f1743v.f1791m0);
                break;
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                ((t1.l0) obj).G((t1.e0) this.f1006w);
                break;
            case 9:
                ((t1.l0) obj).p((List) this.f1006w);
                break;
            case 10:
            default:
                o2.z zVar = (o2.z) this.f1006w;
                d2.k kVar = (d2.k) obj;
                kVar.getClass();
                kVar.f4024w = zVar.f9590a;
                break;
            case 11:
                ((d2.k) obj).f4016o = (t1.h0) this.f1006w;
                break;
            case 12:
                c2.g gVar = (c2.g) this.f1006w;
                d2.k kVar2 = (d2.k) obj;
                kVar2.f4026y += gVar.f1738g;
                kVar2.f4027z += gVar.f1737e;
                break;
        }
    }

    @Override // mc.y
    public void b() {
        SplashActivity splashActivity = (SplashActivity) this.f1006w;
        int i = SplashActivity.f3665i0;
        splashActivity.startActivity(new Intent(splashActivity, (Class<?>) (splashActivity.f3667b0 ? TvActivity.class : MainActivity.class)));
        splashActivity.finish();
    }

    @Override // a2.h
    public void c(a2.i iVar) {
        ((Dav1dDecoder) this.f1006w).releaseOutputBuffer((VideoDecoderOutputBuffer) iVar);
    }

    @Override // w2.h
    public long d(long j8) {
        w2.t tVar = (w2.t) this.f1006w;
        return w1.b0.i((j8 * ((long) tVar.f13854e)) / 1000000, 0L, tVar.f13857j - 1);
    }

    @Override // i7.b
    public Object e() {
        SQLiteDatabase sQLiteDatabaseA;
        int i = this.f1005v;
        boolean z2 = false;
        Object obj = this.f1006w;
        switch (i) {
            case 17:
                h7.h hVar = (h7.h) ((h7.c) obj);
                hVar.getClass();
                int i10 = d7.a.f4365e;
                sb.p pVar = new sb.p(8, z2);
                pVar.f11743x = null;
                pVar.f11744y = new ArrayList();
                pVar.f11745z = null;
                pVar.f11742w = "";
                HashMap map = new HashMap();
                sQLiteDatabaseA = hVar.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    d7.a aVar = (d7.a) h7.h.G(sQLiteDatabaseA.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new ed.d(hVar, map, pVar, 4));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 18:
                h7.h hVar2 = (h7.h) ((h7.d) obj);
                long jD = hVar2.f6172w.d() - hVar2.f6174y.f6162d;
                sQLiteDatabaseA = hVar2.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jD)};
                    Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            hVar2.A(cursorRawQuery.getInt(0), d7.c.f4372x, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseA.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
            case 19:
                h7.h hVar3 = (h7.h) ((h7.c) ((ab.f) obj).i);
                sQLiteDatabaseA = hVar3.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    sQLiteDatabaseA.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseA.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f6172w.d()).execute();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                sb.p pVar2 = (sb.p) obj;
                Iterator it = ((Iterable) ((h7.h) ((h7.d) pVar2.f11743x)).l(new d2.e(25))).iterator();
                while (it.hasNext()) {
                    ((a7.j) pVar2.f11744y).u((a7.k) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // l2.x
    public int f(Object obj) {
        t1.o oVar = (t1.o) this.f1006w;
        l2.o oVar2 = (l2.o) obj;
        String str = oVar2.f8100b;
        return ((str.equals(oVar.f12061n) || str.equals(l2.y.b(oVar))) && oVar2.c(oVar, false) && oVar2.d(oVar)) ? 1 : 0;
    }

    @Override // x1.s
    public void g(long j8, w1.t tVar) {
        switch (this.f1005v) {
            case 14:
                w2.b.d(j8, tVar, ((d4.d0) this.f1006w).f4076c);
                break;
            default:
                w2.b.e(j8, tVar, ((d4.d0) this.f1006w).f4076c);
                break;
        }
    }

    @Override // p0.b
    public void onCancel() {
        c1 c1Var = (c1) this.f1006w;
        de.i.e(c1Var, "this$0");
        c1Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0596 A[Catch: Exception -> 0x05c3, TryCatch #2 {Exception -> 0x05c3, blocks: (B:115:0x0495, B:117:0x056b, B:118:0x0570, B:120:0x0596, B:122:0x059e, B:124:0x05ac, B:126:0x05b2, B:128:0x05bb, B:129:0x05bf), top: B:159:0x0495 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05ce  */
    @Override // ma.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(ad.c r57) {
        /*
            Method dump skipped, instruction units count: 1660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d1.p(ad.c):java.lang.Object");
    }

    public /* synthetic */ d1(d2.a aVar, Object obj, int i) {
        this.f1005v = i;
        this.f1006w = obj;
    }

    public /* synthetic */ d1(d2.a aVar, o2.u uVar, o2.z zVar, IOException iOException, boolean z2) {
        this.f1005v = 13;
        this.f1006w = zVar;
    }
}
