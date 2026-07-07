package r1;

import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m0 extends v0 {

    /* renamed from: c, reason: collision with root package name */
    public static final String f11586c;

    /* renamed from: b, reason: collision with root package name */
    public final float f11587b;

    static {
        String str = u1.a0.f12750a;
        f11586c = Integer.toString(1, 36);
    }

    public m0() {
        this.f11587b = -1.0f;
    }

    @Override // r1.v0
    public final boolean b() {
        if (this.f11587b != -1.0f) {
            return true;
        }
        return false;
    }

    @Override // r1.v0
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(v0.f11719a, 1);
        bundle.putFloat(f11586c, this.f11587b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        if (this.f11587b != ((m0) obj).f11587b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f11587b));
    }

    public m0(float f3) {
        u1.c.a("percent must be in the range of [0, 100]", f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 <= 100.0f);
        this.f11587b = f3;
    }
}
