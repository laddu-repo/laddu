package ja;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;
import k8.k2;
import o9.f;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile c f7001c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f7002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f7003b;

    public c(AppMeasurementSdk appMeasurementSdk) {
        y.g(appMeasurementSdk);
        this.f7002a = appMeasurementSdk;
        this.f7003b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (ka.a.a(str) && ka.a.b(str2, bundle) && ka.a.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f7002a.logEvent(str, str2, bundle);
        }
    }

    public final f b(String str, k2 k2Var) {
        Object bVar;
        if (ka.a.a(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f7003b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.f7002a;
                if (zEquals) {
                    bVar = new sc.b(appMeasurementSdk, k2Var);
                } else if ("clx".equals(str)) {
                    ka.c cVar = new ka.c();
                    cVar.f7872v = k2Var;
                    appMeasurementSdk.a(new ka.b(1, cVar));
                    bVar = cVar;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    concurrentHashMap.put(str, bVar);
                    return new f(15);
                }
            }
        }
        return null;
    }
}
