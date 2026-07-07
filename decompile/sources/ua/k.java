package ua;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends k6.e {
    @Override // k6.e
    public final void c(o7.b bVar, float f3, float f10) {
        float f11 = f10 * f3;
        bVar.d(f11, 180.0f, 90.0f);
        float f12 = f11 * 2.0f;
        r rVar = new r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12, f12);
        rVar.f13038f = 180.0f;
        rVar.f13039g = 90.0f;
        ((ArrayList) bVar.f10032f).add(rVar);
        p pVar = new p(rVar);
        bVar.a(180.0f);
        ((ArrayList) bVar.f10033g).add(pVar);
        bVar.f10030d = 270.0f;
        float f13 = (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + f12) * 0.5f;
        float f14 = (f12 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / 2.0f;
        double d10 = 270.0f;
        bVar.f10028b = (((float) Math.cos(Math.toRadians(d10))) * f14) + f13;
        bVar.f10029c = (f14 * ((float) Math.sin(Math.toRadians(d10)))) + f13;
    }
}
