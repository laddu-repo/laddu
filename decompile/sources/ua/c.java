package ua;

import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f12974a;

    public c(float f3) {
        this.f12974a = f3;
    }

    @Override // ua.d
    public final float a(RectF rectF) {
        return c9.a.a(this.f12974a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.f12974a == ((c) obj).f12974a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f12974a)});
    }
}
