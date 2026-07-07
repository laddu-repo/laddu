package nb;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k8.a0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f9090b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f9091c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static j f9092d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f9093a;

    public j(a0 a0Var) {
        this.f9093a = a0Var;
    }

    public final boolean a(ob.b bVar) {
        if (TextUtils.isEmpty(bVar.f10097c)) {
            return true;
        }
        long j8 = bVar.f + bVar.f10099e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f9093a.getClass();
        return j8 < timeUnit.toSeconds(System.currentTimeMillis()) + f9090b;
    }
}
