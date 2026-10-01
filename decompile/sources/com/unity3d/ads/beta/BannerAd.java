package com.unity3d.ads.beta;

import com.unity3d.ads.core.data.model.AdObject;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class BannerAd {
    public static final Companion Companion = new Companion(null);
    private final AdObject adObject;
    private final BannerLoadOptions loadOptions;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final void load(BannerLoadOptions options, LoadListener<BannerAd> listener) {
            k.e(options, "options");
            k.e(listener, "listener");
        }

        private Companion() {
        }
    }

    public BannerAd(AdObject adObject, BannerLoadOptions loadOptions) {
        k.e(adObject, "adObject");
        k.e(loadOptions, "loadOptions");
        this.adObject = adObject;
        this.loadOptions = loadOptions;
    }

    public static final void load(BannerLoadOptions bannerLoadOptions, LoadListener<BannerAd> loadListener) {
        Companion.load(bannerLoadOptions, loadListener);
    }
}
