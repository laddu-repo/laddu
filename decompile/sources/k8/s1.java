package k8;

import android.os.Bundle;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements Runnable {
    public final /* synthetic */ Object A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7756v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f7757w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f7758x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f7759y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f7760z;

    public /* synthetic */ s1(Object obj, String str, String str2, Object obj2, long j8, int i) {
        this.f7756v = i;
        this.f7757w = str;
        this.f7758x = str2;
        this.f7760z = obj2;
        this.f7759y = j8;
        this.A = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7756v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                String str = (String) this.f7758x;
                x1 x1Var = (x1) this.A;
                String str2 = (String) this.f7757w;
                if (str2 != null) {
                    c3 c3Var = new c3(this.f7759y, (String) this.f7760z, str2);
                    n4 n4Var = x1Var.f7834d;
                    n4Var.d().D();
                    String str3 = n4Var.f7652b0;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    n4Var.f7652b0 = str;
                    n4Var.f7651a0 = c3Var;
                } else {
                    n4 n4Var2 = x1Var.f7834d;
                    n4Var2.d().D();
                    String str4 = n4Var2.f7652b0;
                    if (str4 == null || str4.equals(str)) {
                        n4Var2.f7652b0 = str;
                        n4Var2.f7651a0 = null;
                    }
                }
                break;
            case 1:
                u2 u2Var = (u2) this.A;
                String str5 = (String) this.f7757w;
                String str6 = (String) this.f7758x;
                u2Var.O(this.f7759y, this.f7760z, str5, str6);
                break;
            default:
                Bundle bundle = (Bundle) this.f7757w;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                f3 f3Var = (f3) this.A;
                t4 t4Var = ((p1) f3Var.f2053w).D;
                p1.j(t4Var);
                f3Var.J((c3) this.f7758x, (c3) this.f7760z, this.f7759y, true, t4Var.N("screen_view", bundle, null, false));
                break;
        }
    }

    public s1(f3 f3Var, Bundle bundle, c3 c3Var, c3 c3Var2, long j8) {
        this.f7756v = 2;
        this.f7757w = bundle;
        this.f7758x = c3Var;
        this.f7760z = c3Var2;
        this.f7759y = j8;
        Objects.requireNonNull(f3Var);
        this.A = f3Var;
    }
}
