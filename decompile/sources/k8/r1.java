package k8;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.v8;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7731v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v4 f7732w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x1 f7733x;

    public /* synthetic */ r1(x1 x1Var, v4 v4Var, int i) {
        this.f7731v = i;
        this.f7732w = v4Var;
        this.f7733x = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f7731v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                x1 x1Var = this.f7733x;
                x1Var.f7834d.V();
                x1Var.f7834d.Y(this.f7732w);
                break;
            case 1:
                x1 x1Var2 = this.f7733x;
                x1Var2.f7834d.V();
                n4 n4Var = x1Var2.f7834d;
                n4Var.d().D();
                n4Var.l0();
                v4 v4Var = this.f7732w;
                t7.y.g(v4Var);
                String str = v4Var.f7805v;
                t7.y.d(str);
                int i = 0;
                if (n4Var.e0().O(null, f0.f7536z0)) {
                    n4Var.g().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iM = n4Var.e0().M(null, f0.f7500i0);
                    n4Var.e0();
                    long jLongValue = jCurrentTimeMillis - ((Long) f0.f7490e.a(null)).longValue();
                    while (i < iM && n4Var.I(null, jLongValue)) {
                        i++;
                    }
                } else {
                    n4Var.e0();
                    long jIntValue = ((Integer) f0.f7508l.a(null)).intValue();
                    while (i < jIntValue && n4Var.I(str, 0L)) {
                        i++;
                    }
                }
                if (n4Var.e0().O(null, f0.A0)) {
                    n4Var.d().D();
                    n4Var.H();
                }
                j4 j4Var = n4Var.E;
                int iC = j4.a.c(v4Var.Z);
                j4Var.D();
                if (iC == 2 && !j4.G(str)) {
                    j1 j1Var = j4Var.f7447x.f7656v;
                    n4.T(j1Var);
                    v8 v8VarP = j1Var.P(str);
                    if (v8VarP != null && v8VarP.I() && !v8VarP.J().v().isEmpty()) {
                        n4Var.c().J.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        n4Var.g().getClass();
                        n4Var.r(str, System.currentTimeMillis());
                        break;
                    }
                }
                break;
            case 2:
                x1 x1Var3 = this.f7733x;
                x1Var3.f7834d.V();
                n4 n4Var2 = x1Var3.f7834d;
                n4Var2.d().D();
                n4Var2.l0();
                v4 v4Var2 = this.f7732w;
                t7.y.d(v4Var2.f7805v);
                n4Var2.c0(v4Var2);
                break;
            case 3:
                x1 x1Var4 = this.f7733x;
                x1Var4.f7834d.V();
                n4 n4Var3 = x1Var4.f7834d;
                if (n4Var3.T != null) {
                    ArrayList arrayList = new ArrayList();
                    n4Var3.U = arrayList;
                    arrayList.addAll(n4Var3.T);
                }
                n nVar = n4Var3.f7658x;
                n4.T(nVar);
                p1 p1Var = (p1) nVar.f2053w;
                v4 v4Var3 = this.f7732w;
                String str2 = v4Var3.f7805v;
                t7.y.g(str2);
                t7.y.d(str2);
                nVar.D();
                nVar.E();
                try {
                    SQLiteDatabase sQLiteDatabaseU0 = nVar.u0();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseU0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseU0.delete("events", "app_id=?", strArr) + sQLiteDatabaseU0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseU0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseU0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseU0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseU0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseU0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseU0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseU0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseU0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseU0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseU0.delete("upload_queue", "app_id=?", strArr);
                    if (p1Var.f7695y.O(null, f0.f7489d1)) {
                        iDelete += sQLiteDatabaseU0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int iDelete2 = iDelete + sQLiteDatabaseU0.delete("diagnostic_signals", "app_id=?", strArr);
                    if (iDelete2 > 0) {
                        v0 v0Var = p1Var.A;
                        p1.l(v0Var);
                        v0Var.J.c(str2, Integer.valueOf(iDelete2), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e7) {
                    v0 v0Var2 = p1Var.A;
                    p1.l(v0Var2);
                    v0Var2.B.c(v0.L(str2), e7, "Error resetting analytics data. appId, error");
                }
                if (v4Var3.C) {
                    n4Var3.Y(v4Var3);
                }
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                x1 x1Var5 = this.f7733x;
                x1Var5.f7834d.V();
                n4 n4Var4 = x1Var5.f7834d;
                n4Var4.d().D();
                n4Var4.l0();
                v4 v4Var4 = this.f7732w;
                t7.y.d(v4Var4.f7805v);
                n4Var4.m0(v4Var4);
                n4Var4.n0(v4Var4);
                break;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                n4 n4Var5 = this.f7733x.f7834d;
                n4Var5.V();
                n4Var5.n0(this.f7732w);
                break;
            default:
                n4 n4Var6 = this.f7733x.f7834d;
                n4Var6.V();
                n4Var6.m0(this.f7732w);
                break;
        }
    }
}
