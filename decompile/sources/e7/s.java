package e7;

import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import java.util.Collections;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s extends e {

    /* renamed from: i, reason: collision with root package name */
    public final Object f4461i;

    public s(f0 f0Var, Object obj) {
        super(Collections.EMPTY_LIST);
        j(f0Var);
        this.f4461i = obj;
    }

    @Override // e7.e
    public final float b() {
        return 1.0f;
    }

    @Override // e7.e
    public final Object e() {
        f0 f0Var = this.f4408e;
        Object obj = this.f4461i;
        float f3 = this.f4407d;
        return f0Var.U(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, obj, obj, f3, f3, f3);
    }

    @Override // e7.e
    public final Object f(o7.a aVar, float f3) {
        return e();
    }

    @Override // e7.e
    public final void h() {
        if (this.f4408e != null) {
            super.h();
        }
    }

    @Override // e7.e
    public final void i(float f3) {
        this.f4407d = f3;
    }
}
