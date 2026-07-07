package r1;

import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w0 extends v0 {

    /* renamed from: d, reason: collision with root package name */
    public static final String f11736d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f11737e;

    /* renamed from: b, reason: collision with root package name */
    public final int f11738b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11739c;

    static {
        String str = u1.a0.f12750a;
        f11736d = Integer.toString(1, 36);
        f11737e = Integer.toString(2, 36);
    }

    public w0(int i6) {
        u1.c.a("maxStars must be a positive integer", i6 > 0);
        this.f11738b = i6;
        this.f11739c = -1.0f;
    }

    @Override // r1.v0
    public final boolean b() {
        if (this.f11739c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override // r1.v0
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(v0.f11719a, 2);
        bundle.putInt(f11736d, this.f11738b);
        bundle.putFloat(f11737e, this.f11739c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f11738b != w0Var.f11738b || this.f11739c != w0Var.f11739c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11738b), Float.valueOf(this.f11739c));
    }

    public w0(int i6, float f3) {
        boolean z10 = false;
        u1.c.a("maxStars must be a positive integer", i6 > 0);
        if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 <= i6) {
            z10 = true;
        }
        u1.c.a("starRating is out of range [0, maxStars]", z10);
        this.f11738b = i6;
        this.f11739c = f3;
    }
}
