package k8;

import android.os.Bundle;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.r5;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements w, ma.e, m4.b, n.w, qa.a, o8.g, t0.r, t3.k, u2.e0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7857v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ z f7853w = new z(0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ z f7854x = new z(1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ z f7855y = new z(2);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ z f7856z = new z(3);
    public static final /* synthetic */ z A = new z(4);
    public static final /* synthetic */ z B = new z(5);
    public static final /* synthetic */ z C = new z(6);
    public static final /* synthetic */ z D = new z(7);
    public static final /* synthetic */ z E = new z(8);
    public static final /* synthetic */ z F = new z(9);
    public static final /* synthetic */ z G = new z(10);
    public static final /* synthetic */ z H = new z(11);
    public static final /* synthetic */ z I = new z(12);
    public static final /* synthetic */ z J = new z(13);
    public static final /* synthetic */ z K = new z(14);
    public static final /* synthetic */ z L = new z(15);
    public static final /* synthetic */ z M = new z(16);

    public /* synthetic */ z(int i) {
        this.f7857v = i;
    }

    public static ArrayList c(List list) {
        de.i.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ef.x) obj) != ef.x.f5093x) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(pd.l.C(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((ef.x) obj2).f5096v);
        }
        return arrayList2;
    }

    public static byte[] g(List list) {
        de.i.e(list, "protocols");
        vf.c cVar = new vf.c();
        ArrayList arrayListC = c(list);
        int size = arrayListC.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListC.get(i);
            i++;
            String str = (String) obj;
            cVar.p0(str.length());
            cVar.v0(str);
        }
        return cVar.B(cVar.f13603w);
    }

    public static s5.a n(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new s5.a(httpURLConnection);
    }

    @Override // o8.g
    public o8.o C(Object obj) {
        return b8.h.o(Boolean.TRUE);
    }

    @Override // k8.w
    public Object a() {
        switch (this.f7857v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                List list = f0.f7479a;
                com.google.android.gms.internal.measurement.q4.f3007w.get();
                return (Boolean) com.google.android.gms.internal.measurement.s4.f3073a.b("measurement.test.boolean_flag", false, 0).get();
            case 1:
                List list2 = f0.f7479a;
                com.google.android.gms.internal.measurement.q4.f3007w.get();
                return (Long) com.google.android.gms.internal.measurement.s4.f3073a.g(1, -1L, "measurement.test.cached_long_flag").get();
            case 2:
                List list3 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f2655a.g(23, 27L, "measurement.upload.max_item_scoped_custom_parameters").get()).longValue());
            case 3:
                List list4 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (Long) com.google.android.gms.internal.measurement.g3.f2655a.g(62, 7200000L, "measurement.redaction.app_instance_id.ttl").get();
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                List list5 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (String) com.google.android.gms.internal.measurement.g3.f2655a.i(60, "measurement.rb.attribution.uri_scheme", "https").get();
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                List list6 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (String) com.google.android.gms.internal.measurement.g3.f2655a.i(32, "measurement.rb.attribution.app_allowlist", "").get();
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                List list7 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f2655a.g(75, 65536L, "measurement.upload.max_batch_size").get()).longValue());
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                List list8 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f2655a.g(25, 0L, "measurement.rb.attribution.max_trigger_uris_queried_at_once").get()).longValue());
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                List list9 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f2655a.g(30, 3000L, "measurement.rb.attribution.notify_app_delay_millis").get()).longValue());
            case 9:
                List list10 = f0.f7479a;
                return (Boolean) com.google.android.gms.internal.measurement.c4.f2532b.get();
            case 10:
                List list11 = f0.f7479a;
                return (Boolean) r5.f3041a.get();
            case 11:
                List list12 = f0.f7479a;
                return (Boolean) com.google.android.gms.internal.measurement.z3.f3271b.get();
            case 12:
                List list13 = f0.f7479a;
                com.google.android.gms.internal.measurement.t4.f3103w.get();
                return (Boolean) com.google.android.gms.internal.measurement.v4.f3159a.b("measurement.rb.attribution.service", true, 6).get();
            case 13:
                List list14 = f0.f7479a;
                com.google.android.gms.internal.measurement.t4.f3103w.get();
                return (Boolean) com.google.android.gms.internal.measurement.v4.f3159a.b("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true, 4).get();
            case 14:
                List list15 = f0.f7479a;
                return (Boolean) b5.f2504a.get();
            default:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.i4.f2713b.get()).booleanValue());
        }
    }

    @Override // t3.k
    public int e(t1.o oVar) {
        String str = oVar.f12061n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(d0.d.k("Unsupported MIME type: ", str));
    }

    @Override // t3.k
    public t3.m f(t1.o oVar) {
        String str = oVar.f12061n;
        List list = oVar.f12064q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new v3.h(list);
                case "application/pgs":
                    return new sb.p(26);
                case "application/x-mp4-vtt":
                    return new s5.d(7);
                case "text/vtt":
                    return new k2(6);
                case "application/x-quicktime-tx3g":
                    return new a4.a(list);
                case "text/x-ssa":
                    return new x3.a(list);
                case "application/vobsub":
                    return new sb.p(list);
                case "application/x-subrip":
                    return new y3.a();
                case "application/ttml+xml":
                    return new z3.e();
            }
        }
        throw new IllegalArgumentException(d0.d.k("Unsupported MIME type: ", str));
    }

    @Override // t3.k
    public boolean i(t1.o oVar) {
        String str = oVar.f12061n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // n.w
    public boolean k(n.l lVar) {
        return false;
    }

    @Override // qa.a
    public void l(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // m4.b
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // ma.e
    public /* synthetic */ Object p(ad.c cVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(cVar);
    }

    @Override // m4.b
    public void s(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // u2.e0
    public /* synthetic */ void h() {
    }

    @Override // u2.e0
    public /* synthetic */ void j() {
    }

    @Override // u2.e0
    public /* synthetic */ void o() {
    }

    @Override // u2.e0
    public /* synthetic */ void b(t1.d1 d1Var) {
    }

    @Override // n.w
    public void d(n.l lVar, boolean z2) {
    }

    @Override // t0.r
    public void onScrollLimit(int i, int i10, int i11, boolean z2) {
    }

    @Override // t0.r
    public void onScrollProgress(int i, int i10, int i11, int i12) {
    }
}
