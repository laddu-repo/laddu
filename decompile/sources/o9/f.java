package o9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import com.google.android.gms.internal.measurement.e3;
import com.google.android.gms.internal.measurement.g3;
import com.google.android.gms.internal.measurement.n3;
import com.google.android.gms.internal.measurement.t3;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import k8.f0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class f implements c7.b, b8.e, com.bumptech.glide.manager.l, d6.a, e6.a, j2.s, k8.w {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9999v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ f f9995w = new f(17);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ f f9996x = new f(18);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ f f9997y = new f(19);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ f f9998z = new f(20);
    public static final /* synthetic */ f A = new f(21);
    public static final /* synthetic */ f B = new f(22);
    public static final /* synthetic */ f C = new f(23);
    public static final /* synthetic */ f D = new f(24);
    public static final /* synthetic */ f E = new f(25);
    public static final /* synthetic */ f F = new f(26);
    public static final /* synthetic */ f G = new f(27);
    public static final /* synthetic */ f H = new f(28);
    public static final /* synthetic */ f I = new f(29);

    public /* synthetic */ f(int i) {
        this.f9999v = i;
    }

    @Override // j2.s
    public s2.p B(j2.o oVar, j2.l lVar) {
        return new j2.r(oVar, lVar);
    }

    @Override // k8.w
    public Object a() {
        switch (this.f9999v) {
            case 17:
                return new Boolean(((Boolean) n3.f2909b.get()).booleanValue());
            case 18:
                List list = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(1, 3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time").get();
            case 19:
                List list2 = f0.f7479a;
                return (String) t3.f3101b.get();
            case 20:
                List list3 = f0.f7479a;
                e3.f2605w.get();
                return Integer.valueOf((int) ((Long) g3.f2655a.g(68, 10000L, "measurement.upload.max_conversions_per_day").get()).longValue());
            case 21:
                List list4 = f0.f7479a;
                e3.f2605w.get();
                return (String) g3.f2655a.i(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").get();
            case 22:
                List list5 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(29, 86400000L, "measurement.monitoring.sample_period_millis").get();
            case 23:
                List list6 = f0.f7479a;
                e3.f2605w.get();
                return Integer.valueOf((int) ((Long) g3.f2655a.g(42, 10L, "measurement.sgtm.batch.retry_max_count").get()).longValue());
            case 24:
                List list7 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(49, 1000L, "measurement.sgtm.upload.min_delay_after_broadcast").get();
            case 25:
                List list8 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(63, 43200000L, "measurement.upload.backoff_period").get();
            case 26:
                List list9 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(9, 1000L, "measurement.upload.debug_upload_interval").get();
            case 27:
                List list10 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(34, 604800000L, "measurement.upload.refresh_blacklisted_config_interval").get();
            case 28:
                List list11 = f0.f7479a;
                e3.f2605w.get();
                return Integer.valueOf((int) ((Long) g3.f2655a.g(76, 6L, "measurement.upload.retry_count").get()).longValue());
            default:
                List list12 = f0.f7479a;
                e3.f2605w.get();
                return Integer.valueOf((int) ((Long) g3.f2655a.g(22, 200L, "measurement.audience.filter_result_max_count").get()).longValue());
        }
    }

    @Override // b8.e
    public b8.d c(Context context, String str, b8.c cVar) {
        int iB;
        b8.d dVar = new b8.d();
        int iG = cVar.g(context, str);
        dVar.f1575a = iG;
        int i = 1;
        int i10 = 0;
        if (iG != 0) {
            iB = cVar.b(context, str, false);
            dVar.f1576b = iB;
        } else {
            iB = cVar.b(context, str, true);
            dVar.f1576b = iB;
        }
        int i11 = dVar.f1575a;
        if (i11 == 0) {
            if (iB == 0) {
                i = 0;
            }
            dVar.f1577c = i;
            return dVar;
        }
        i10 = i11;
        if (i10 >= iB) {
            i = -1;
        }
        dVar.f1577c = i;
        return dVar;
    }

    @Override // d6.a
    public Bitmap d(int i, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i10, config);
    }

    @Override // d6.a
    public Bitmap e(int i, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i10, config);
    }

    public void f(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // e6.a
    public File g(a6.f fVar) {
        return null;
    }

    @Override // nd.a
    public Object get() {
        switch (this.f9999v) {
            case 1:
                return new a7.s(0, Executors.newSingleThreadExecutor());
            default:
                kb.e eVar = new kb.e(15);
                HashMap map = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(x6.d.f14248v, new g7.b(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(x6.d.f14250x, new g7.b(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(g7.c.f5721w)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(x6.d.f14249w, new g7.b(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() < x6.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new g7.a(eVar, map);
        }
    }

    public Signature[] j(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // j2.s
    public s2.p v() {
        return new j2.r(j2.o.f6734l, null);
    }

    @Override // d6.a
    public void i() {
    }

    @Override // d6.a
    public void h(int i) {
    }

    @Override // e6.a
    public void b(a6.f fVar, a7.j jVar) {
    }
}
