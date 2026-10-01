package n9;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q1 implements Runnable {
    public final /* synthetic */ long A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9444x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9445y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f9446z;

    public /* synthetic */ q1(Object obj, String str, String str2, Object obj2, long j, int i6) {
        this.f9444x = i6;
        this.f9445y = str;
        this.f9446z = str2;
        this.B = obj2;
        this.A = j;
        this.C = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9444x) {
            case 0:
                String str = (String) this.f9446z;
                t1 t1Var = (t1) this.C;
                String str2 = (String) this.f9445y;
                if (str2 == null) {
                    e4 e4Var = t1Var.f9483e;
                    e4Var.D().d1();
                    String str3 = e4Var.f9297d0;
                    if (str3 == null || str3.equals(str)) {
                        e4Var.f9297d0 = str;
                        e4Var.f9296c0 = null;
                        return;
                    }
                    return;
                }
                u2 u2Var = new u2((String) this.B, str2, this.A);
                e4 e4Var2 = t1Var.f9483e;
                e4Var2.D().d1();
                String str4 = e4Var2.f9297d0;
                if (str4 != null) {
                    str4.equals(str);
                }
                e4Var2.f9297d0 = str;
                e4Var2.f9296c0 = u2Var;
                return;
            case 1:
                m2 m2Var = (m2) this.C;
                String str5 = (String) this.f9445y;
                String str6 = (String) this.f9446z;
                m2Var.o1(this.A, this.B, str5, str6);
                return;
            default:
                x2 x2Var = (x2) this.C;
                Bundle bundle = (Bundle) this.f9445y;
                u2 u2Var2 = (u2) this.f9446z;
                u2 u2Var3 = (u2) this.B;
                x2Var.getClass();
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                j4 j4Var = ((n1) x2Var.f4301y).F;
                n1.e(j4Var);
                x2Var.n1(u2Var2, u2Var3, this.A, true, j4Var.l1("screen_view", bundle, null, false));
                return;
        }
    }

    public q1(x2 x2Var, Bundle bundle, u2 u2Var, u2 u2Var2, long j) {
        this.f9444x = 2;
        this.f9445y = bundle;
        this.f9446z = u2Var;
        this.B = u2Var2;
        this.A = j;
        Objects.requireNonNull(x2Var);
        this.C = x2Var;
    }
}
