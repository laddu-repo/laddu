package t7;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.e3;
import com.google.android.gms.internal.measurement.g3;
import com.google.android.gms.internal.measurement.w3;
import com.google.firebase.components.ComponentRegistrar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ab.g, b8.e, bb.a, w6.a, j6.d0, j7.a, jd.l, k8.f, k8.w {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static k f12374w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f12378v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ k f12375x = new k(16);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ k f12376y = new k(17);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ k f12377z = new k(18);
    public static final /* synthetic */ k A = new k(19);
    public static final /* synthetic */ k B = new k(20);
    public static final /* synthetic */ k C = new k(21);
    public static final /* synthetic */ k D = new k(22);
    public static final /* synthetic */ k E = new k(23);
    public static final /* synthetic */ k F = new k(24);
    public static final /* synthetic */ k G = new k(25);
    public static final /* synthetic */ k H = new k(26);
    public static final /* synthetic */ k I = new k(27);
    public static final /* synthetic */ k J = new k(28);
    public static final /* synthetic */ k K = new k(29);

    public /* synthetic */ k(int i) {
        this.f12378v = i;
    }

    public static synchronized k e() {
        try {
            if (f12374w == null) {
                f12374w = new k(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12374w;
    }

    @Override // k8.w
    public Object a() {
        switch (this.f12378v) {
            case 17:
                return new Boolean(((Boolean) w3.f3189a.get()).booleanValue());
            case 18:
                List list = k8.f0.f7479a;
                e3.f2605w.get();
                return (String) g3.f2655a.i(14, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp").get();
            case 19:
                List list2 = k8.f0.f7479a;
                e3.f2605w.get();
                return Integer.valueOf((int) ((Long) g3.f2655a.g(69, 1000L, "measurement.upload.max_error_events_per_day").get()).longValue());
            case 20:
                List list3 = k8.f0.f7479a;
                e3.f2605w.get();
                return Integer.valueOf((int) ((Long) g3.f2655a.g(20, 100000L, "measurement.store.max_stored_events_per_app").get()).longValue());
            case 21:
                List list4 = k8.f0.f7479a;
                e3.f2605w.get();
                return (String) g3.f2655a.i(45, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").get();
            case 22:
                List list5 = k8.f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(41, 1800000L, "measurement.sgtm.batch.retry_interval").get();
            case 23:
                List list6 = k8.f0.f7479a;
                e3.f2605w.get();
                return Integer.valueOf((int) ((Long) g3.f2655a.g(46, 5L, "measurement.sgtm.upload.batches_retrieval_limit").get()).longValue());
            case 24:
                List list7 = k8.f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(40, 240000L, "measurement.sgtm.batch.long_queuing_threshold").get();
            case 25:
                List list8 = k8.f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(65, 3600000L, "measurement.upload.interval").get();
            case 26:
                List list9 = k8.f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(27, 60000L, "measurement.alarm_manager.minimum_interval").get();
            case 27:
                List list10 = k8.f0.f7479a;
                e3.f2605w.get();
                return (String) g3.f2655a.i(8, "measurement.config.url_scheme", "https").get();
            case 28:
                List list11 = k8.f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(15, 605000L, "measurement.upload.google_signal_max_queue_time").get();
            default:
                List list12 = k8.f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(38, 1000L, "measurement.service_client.reconnect_millis").get();
        }
    }

    @Override // k8.f
    public /* synthetic */ String b(String str, String str2) {
        return null;
    }

    @Override // b8.e
    public b8.d c(Context context, String str, b8.c cVar) {
        b8.d dVar = new b8.d();
        int iG = cVar.g(context, str);
        dVar.f1575a = iG;
        if (iG != 0) {
            dVar.f1577c = -1;
            return dVar;
        }
        int iB = cVar.b(context, str, true);
        dVar.f1576b = iB;
        if (iB != 0) {
            dVar.f1577c = 1;
        }
        return dVar;
    }

    @Override // j7.a
    public long d() {
        return SystemClock.elapsedRealtime();
    }

    public List f(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (ma.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f8532a;
            if (str != null) {
                bVar = new ma.b(str, bVar.f8533b, bVar.f8534c, bVar.f8535d, bVar.f8536e, new androidx.fragment.app.e(3, str, bVar), bVar.f8537g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // ab.g
    public ab.d i(k8.a0 a0Var, JSONObject jSONObject) throws JSONException {
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        ab.c cVar = jSONObject.has("session") ? new ab.c(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new ab.c(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new ab.d(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (((long) iOptInt) * 1000) + System.currentTimeMillis(), cVar, new ab.b(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // j6.d0
    public void k(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // bb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.StackTraceElement[] m(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 0
            r3 = 1
            r4 = r2
            r5 = r4
            r6 = r3
        Ld:
            int r7 = r15.length
            if (r4 >= r7) goto L61
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L4f
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L26
            goto L4f
        L26:
            r11 = r2
        L27:
            if (r11 >= r10) goto L3b
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L38
            goto L4f
        L38:
            int r11 = r11 + 1
            goto L27
        L3b:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L4b
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L4b:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L57
        L4f:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r3
            r8 = r4
        L57:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Ld
        L61:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L6a
            return r0
        L6a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.k.m(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // j6.d0
    public void o(MediaExtractor mediaExtractor, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // w6.a
    public Object q() {
        return new c6.a0();
    }

    @Override // jd.l
    public boolean v() {
        return false;
    }

    public k(Context context) {
        this.f12378v = 6;
    }
}
