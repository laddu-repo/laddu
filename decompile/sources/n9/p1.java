package n9;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p1 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9432x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l4 f9433y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ t1 f9434z;

    public /* synthetic */ p1(t1 t1Var, l4 l4Var, int i6) {
        this.f9432x = i6;
        this.f9433y = l4Var;
        this.f9434z = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9432x) {
            case 0:
                t1 t1Var = this.f9434z;
                t1Var.f9483e.w();
                t1Var.f9483e.U(this.f9433y);
                return;
            case 1:
                t1 t1Var2 = this.f9434z;
                t1Var2.f9483e.w();
                e4 e4Var = t1Var2.f9483e;
                e4Var.D().d1();
                e4Var.i0();
                l4 l4Var = this.f9433y;
                w8.x.g(l4Var);
                String str = l4Var.f9386x;
                w8.x.d(str);
                int i6 = 0;
                if (e4Var.b0().n1(null, e0.A0)) {
                    e4Var.D0().getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int l12 = e4Var.b0().l1(null, e0.f9252j0);
                    e4Var.b0();
                    long longValue = currentTimeMillis - ((Long) e0.f9237e.a(null)).longValue();
                    while (i6 < l12 && e4Var.C(null, longValue)) {
                        i6++;
                    }
                } else {
                    e4Var.b0();
                    long intValue = ((Integer) e0.f9257l.a(null)).intValue();
                    while (i6 < intValue && e4Var.C(str, 0L)) {
                        i6++;
                    }
                }
                if (e4Var.b0().n1(null, e0.B0)) {
                    e4Var.D().d1();
                    e4Var.B();
                }
                b4 b4Var = e4Var.G;
                int c10 = r4.a.c(l4Var.f9385b0);
                b4Var.d1();
                if (c10 == 2 && !b4.g1(str)) {
                    h1 h1Var = b4Var.f9511z.f9301x;
                    e4.P(h1Var);
                    com.google.android.gms.internal.measurement.g2 p12 = h1Var.p1(str);
                    if (p12 != null && p12.D() && !p12.E().q().isEmpty()) {
                        e4Var.r().L.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        e4Var.D0().getClass();
                        e4Var.m(str, System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                return;
            case 2:
                t1 t1Var3 = this.f9434z;
                t1Var3.f9483e.w();
                e4 e4Var2 = t1Var3.f9483e;
                e4Var2.D().d1();
                e4Var2.i0();
                l4 l4Var2 = this.f9433y;
                w8.x.d(l4Var2.f9386x);
                e4Var2.Y(l4Var2);
                return;
            case 3:
                t1 t1Var4 = this.f9434z;
                t1Var4.f9483e.w();
                e4 e4Var3 = t1Var4.f9483e;
                if (e4Var3.V != null) {
                    ArrayList arrayList = new ArrayList();
                    e4Var3.W = arrayList;
                    arrayList.addAll(e4Var3.V);
                }
                o oVar = e4Var3.f9303z;
                e4.P(oVar);
                n1 n1Var = (n1) oVar.f4301y;
                l4 l4Var3 = this.f9433y;
                String str2 = l4Var3.f9386x;
                w8.x.g(str2);
                w8.x.d(str2);
                oVar.d1();
                oVar.e1();
                try {
                    SQLiteDatabase U1 = oVar.U1();
                    String[] strArr = {str2};
                    int delete = U1.delete("apps", "app_id=?", strArr) + U1.delete("events", "app_id=?", strArr) + U1.delete("events_snapshot", "app_id=?", strArr) + U1.delete("user_attributes", "app_id=?", strArr) + U1.delete("conditional_properties", "app_id=?", strArr) + U1.delete("raw_events", "app_id=?", strArr) + U1.delete("raw_events_metadata", "app_id=?", strArr) + U1.delete("queue", "app_id=?", strArr) + U1.delete("audience_filter_values", "app_id=?", strArr) + U1.delete("main_event_params", "app_id=?", strArr) + U1.delete("default_event_params", "app_id=?", strArr) + U1.delete("trigger_uris", "app_id=?", strArr) + U1.delete("upload_queue", "app_id=?", strArr);
                    if (n1Var.A.n1(null, e0.f9253j1)) {
                        delete += U1.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (delete > 0) {
                        u0 u0Var = n1Var.C;
                        n1.g(u0Var);
                        u0Var.L.c(str2, Integer.valueOf(delete), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e10) {
                    u0 u0Var2 = n1Var.C;
                    n1.g(u0Var2);
                    u0Var2.D.c(u0.l1(str2), e10, "Error resetting analytics data. appId, error");
                }
                if (l4Var3.E) {
                    e4Var3.U(l4Var3);
                    return;
                }
                return;
            case 4:
                t1 t1Var5 = this.f9434z;
                t1Var5.f9483e.w();
                e4 e4Var4 = t1Var5.f9483e;
                e4Var4.D().d1();
                e4Var4.i0();
                l4 l4Var4 = this.f9433y;
                w8.x.d(l4Var4.f9386x);
                e4Var4.j0(l4Var4);
                e4Var4.k0(l4Var4);
                return;
            case 5:
                e4 e4Var5 = this.f9434z.f9483e;
                e4Var5.w();
                e4Var5.k0(this.f9433y);
                return;
            default:
                e4 e4Var6 = this.f9434z.f9483e;
                e4Var6.w();
                e4Var6.j0(this.f9433y);
                return;
        }
    }
}
