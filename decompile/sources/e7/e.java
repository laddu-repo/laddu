package e7;

import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: c, reason: collision with root package name */
    public final b f4406c;

    /* renamed from: e, reason: collision with root package name */
    public f0 f4408e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4404a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f4405b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f4407d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* renamed from: f, reason: collision with root package name */
    public Object f4409f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f4410g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f4411h = -1.0f;

    public e(List list) {
        b cVar;
        b bVar;
        if (list.isEmpty()) {
            bVar = new ua.f(9);
        } else {
            if (list.size() == 1) {
                cVar = new d(list);
            } else {
                cVar = new c(list);
            }
            bVar = cVar;
        }
        this.f4406c = bVar;
    }

    public final void a(a aVar) {
        this.f4404a.add(aVar);
    }

    public float b() {
        if (this.f4411h == -1.0f) {
            this.f4411h = this.f4406c.j();
        }
        return this.f4411h;
    }

    public final float c() {
        Interpolator interpolator;
        o7.a e10 = this.f4406c.e();
        if (e10 != null && !e10.c() && (interpolator = e10.f10015d) != null) {
            return interpolator.getInterpolation(d());
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float d() {
        if (!this.f4405b) {
            o7.a e10 = this.f4406c.e();
            if (e10.c()) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            return (this.f4407d - e10.b()) / (e10.a() - e10.b());
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public Object e() {
        Object f3;
        float d10 = d();
        f0 f0Var = this.f4408e;
        b bVar = this.f4406c;
        if (f0Var == null && bVar.d(d10) && !k()) {
            return this.f4409f;
        }
        o7.a e10 = bVar.e();
        Interpolator interpolator = e10.f10016e;
        Interpolator interpolator2 = e10.f10017f;
        if (interpolator != null && interpolator2 != null) {
            f3 = g(e10, d10, interpolator.getInterpolation(d10), interpolator2.getInterpolation(d10));
        } else {
            f3 = f(e10, c());
        }
        this.f4409f = f3;
        return f3;
    }

    public abstract Object f(o7.a aVar, float f3);

    public Object g(o7.a aVar, float f3, float f10, float f11) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f4404a;
            if (i6 < arrayList.size()) {
                ((a) arrayList.get(i6)).a();
                i6++;
            } else {
                return;
            }
        }
    }

    public void i(float f3) {
        b bVar = this.f4406c;
        if (!bVar.isEmpty()) {
            if (this.f4410g == -1.0f) {
                this.f4410g = bVar.n();
            }
            float f10 = this.f4410g;
            if (f3 < f10) {
                if (f10 == -1.0f) {
                    this.f4410g = bVar.n();
                }
                f3 = this.f4410g;
            } else if (f3 > b()) {
                f3 = b();
            }
            if (f3 != this.f4407d) {
                this.f4407d = f3;
                if (bVar.f(f3)) {
                    h();
                }
            }
        }
    }

    public final void j(f0 f0Var) {
        f0 f0Var2 = this.f4408e;
        if (f0Var2 != null) {
            f0Var2.getClass();
        }
        this.f4408e = f0Var;
    }

    public boolean k() {
        return false;
    }
}
