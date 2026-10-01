package nb;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.z0;
import java.util.concurrent.ConcurrentHashMap;
import u5.r;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    public static volatile c f9587b;

    /* renamed from: a, reason: collision with root package name */
    public final r f9588a;

    public c(r rVar) {
        x.g(rVar);
        this.f9588a = rVar;
        new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!ob.b.f10042b.contains(str) && ob.b.a(str2, bundle) && ob.b.c(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            l1 l1Var = (l1) this.f9588a.f12916y;
            l1Var.c(new z0(l1Var, str, str2, bundle, 1));
        }
    }
}
