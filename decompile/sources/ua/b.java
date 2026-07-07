package ua;

import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f12972a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12973b;

    public b(float f3, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f12972a;
            f3 += ((b) dVar).f12973b;
        }
        this.f12972a = dVar;
        this.f12973b = f3;
    }

    @Override // ua.d
    public final float a(RectF rectF) {
        return Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f12972a.a(rectF) + this.f12973b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f12972a.equals(bVar.f12972a) && this.f12973b == bVar.f12973b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12972a, Float.valueOf(this.f12973b)});
    }
}
