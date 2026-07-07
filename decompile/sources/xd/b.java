package xd;

import android.content.Context;
import bf.y;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import okhttp3.HttpUrl;
import sd.d;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends y {

    /* renamed from: e, reason: collision with root package name */
    public vd.a f14719e;

    @Override // bf.y
    public final void n(Context context, String str, d dVar) {
        QueryInfo.generate(context, y(dVar), this.f14719e.a(), new a());
    }

    @Override // bf.y
    public final void o(Context context, d dVar, o oVar, rg.a aVar) {
        String str;
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    str = "gmaScarBiddingBannerSignal";
                }
            } else {
                str = "gmaScarBiddingRewardedSignal";
            }
        } else {
            str = "gmaScarBiddingInterstitialSignal";
        }
        n(context, str, dVar);
    }

    public final AdFormat y(d dVar) {
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return AdFormat.UNKNOWN;
                }
                return AdFormat.BANNER;
            }
            return AdFormat.REWARDED;
        }
        return AdFormat.INTERSTITIAL;
    }
}
