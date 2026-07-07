package k8;

import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.pc;
import com.google.android.gms.internal.measurement.xa;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f7560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7561c;

    public /* synthetic */ h1(j1 j1Var, String str, int i) {
        this.f7559a = i;
        this.f7560b = j1Var;
        this.f7561c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f7559a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new xa(new h1(this.f7560b, this.f7561c, 1));
            case 1:
                j1 j1Var = this.f7560b;
                n nVar = j1Var.f7447x.f7658x;
                n4.T(nVar);
                String str = this.f7561c;
                a1 a1VarH0 = nVar.H0(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((p1) j1Var.f2053w).f7695y.J();
                map.put("gmp_version", 161000L);
                if (a1VarH0 != null) {
                    String strO = a1VarH0.O();
                    if (strO != null) {
                        map.put("app_version", strO);
                    }
                    map.put("app_version_int", Long.valueOf(a1VarH0.Q()));
                    map.put("dynamite_version", Long.valueOf(a1VarH0.b()));
                }
                return map;
            default:
                k2 k2Var = new k2(22, this.f7560b, this.f7561c);
                pc pcVar = new pc(0, "internal.remoteConfig");
                pcVar.f2911w.put("getValue", new xa(pcVar, k2Var));
                return pcVar;
        }
    }
}
