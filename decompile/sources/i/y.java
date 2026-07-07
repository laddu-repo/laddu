package i;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public Object f6268a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6269b;

    public y(Context context) {
        this.f6268a = context;
    }

    public static float g(int i6, int i10, int i11) {
        return c9.a.a((i6 - i10) / i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    }

    public abstract void c();

    public void d() {
        c2.g gVar = (c2.g) this.f6268a;
        if (gVar != null) {
            try {
                ((b0) this.f6269b).H.unregisterReceiver(gVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f6268a = null;
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem h(MenuItem menuItem) {
        if (menuItem instanceof n0.a) {
            n0.a aVar = (n0.a) menuItem;
            if (((v.l) this.f6269b) == null) {
                this.f6269b = new v.l(0);
            }
            MenuItem menuItem2 = (MenuItem) ((v.l) this.f6269b).get(aVar);
            if (menuItem2 == null) {
                o.s sVar = new o.s((Context) this.f6268a, aVar);
                ((v.l) this.f6269b).put(aVar, sVar);
                return sVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public abstract void i();

    public abstract void j();

    public abstract void k(pa.c cVar);

    public abstract void l();

    public void m() {
        d();
        IntentFilter e10 = e();
        if (e10.countActions() == 0) {
            return;
        }
        if (((c2.g) this.f6268a) == null) {
            this.f6268a = new c2.g(this, 3);
        }
        ((b0) this.f6269b).H.registerReceiver((c2.g) this.f6268a, e10);
    }

    public abstract void n();

    public abstract void o();

    public y(int i6) {
        this.f6269b = new ArrayList();
        for (int i10 = 0; i10 < i6; i10++) {
            ((ArrayList) this.f6269b).add(new pa.p());
        }
    }

    public y(b0 b0Var) {
        this.f6269b = b0Var;
    }
}
