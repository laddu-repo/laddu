package n9;

import com.google.android.gms.internal.measurement.z5;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f9305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9306c;

    public /* synthetic */ f1(h1 h1Var, String str, int i6) {
        this.f9304a = i6;
        this.f9305b = h1Var;
        this.f9306c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f9304a) {
            case 0:
                return new com.google.android.gms.internal.measurement.m4(new f1(this.f9305b, this.f9306c, 1));
            case 1:
                h1 h1Var = this.f9305b;
                o oVar = h1Var.f9511z.f9303z;
                e4.P(oVar);
                String str = this.f9306c;
                z0 h22 = oVar.h2(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                ((n1) h1Var.f4301y).A.i1();
                hashMap.put("gmp_version", 130000L);
                if (h22 != null) {
                    String N = h22.N();
                    if (N != null) {
                        hashMap.put("app_version", N);
                    }
                    hashMap.put("app_version_int", Long.valueOf(h22.P()));
                    hashMap.put("dynamite_version", Long.valueOf(h22.b()));
                }
                return hashMap;
            default:
                j1.f0 f0Var = new j1.f0(this.f9305b, this.f9306c, 15, false);
                z5 z5Var = new z5("internal.remoteConfig", 0);
                z5Var.f2240y.put("getValue", new com.google.android.gms.internal.measurement.m4(z5Var, f0Var));
                return z5Var;
        }
    }
}
