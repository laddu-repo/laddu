package k8;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.q9;
import com.google.android.gms.internal.measurement.r9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f7609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f7610c;

    public l(n nVar, String str) {
        this.f7610c = nVar;
        t7.y.d(str);
        this.f7608a = str;
        this.f7609b = -1L;
    }

    public final List a() {
        List list;
        n nVar = this.f7610c;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(this.f7609b);
        String str = this.f7608a;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = nVar.u0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, strValueOf}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j8 = cursorQuery.getLong(0);
                        long j9 = cursorQuery.getLong(3);
                        boolean z2 = cursorQuery.getLong(5) == 1;
                        long j10 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j8 > this.f7609b) {
                            this.f7609b = j8;
                        }
                        try {
                            q9 q9Var = (q9) p4.o0(r9.K(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            q9Var.o(string);
                            long j11 = cursorQuery.getLong(2);
                            q9Var.b();
                            ((r9) q9Var.f2653w).R(j11);
                            q9Var.b();
                            ((r9) q9Var.f2653w).u(j10);
                            arrayList.add(new k(j8, j9, z2, (r9) q9Var.e()));
                        } catch (IOException e7) {
                            v0 v0Var = ((p1) nVar.f2053w).A;
                            p1.l(v0Var);
                            v0Var.B.c(v0.L(str), e7, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    list = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e10) {
                v0 v0Var2 = ((p1) nVar.f2053w).A;
                p1.l(v0Var2);
                v0Var2.B.c(v0.L(str), e10, "Data loss. Error querying raw events batch. appId");
                list = arrayList;
            }
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public l(n nVar, String str, long j8) {
        this.f7610c = nVar;
        t7.y.d(str);
        this.f7608a = str;
        this.f7609b = nVar.a0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j8)}, -1L);
    }
}
