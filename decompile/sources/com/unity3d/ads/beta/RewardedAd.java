package com.unity3d.ads.beta;

import android.app.Activity;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class RewardedAd {
    public static final Companion Companion = new Companion(null);
    private final AdObject adObject;
    private final LoadOptions loadOptions;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final void load(LoadOptions options, LoadListener<RewardedAd> listener) {
            k.e(options, "options");
            k.e(listener, "listener");
        }

        private Companion() {
        }
    }

    public RewardedAd(AdObject adObject, LoadOptions loadOptions) {
        k.e(adObject, "adObject");
        k.e(loadOptions, "loadOptions");
        this.adObject = adObject;
        this.loadOptions = loadOptions;
    }

    public static final void load(LoadOptions loadOptions, LoadListener<RewardedAd> loadListener) {
        Companion.load(loadOptions, loadListener);
    }

    public static /* synthetic */ void show$default(RewardedAd rewardedAd, Activity activity, ShowOptions showOptions, RewardedShowListener rewardedShowListener, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            showOptions = null;
        }
        rewardedAd.show(activity, showOptions, rewardedShowListener);
    }

    public final void show(Activity activity, ShowOptions showOptions, RewardedShowListener listener) {
        k.e(activity, "activity");
        k.e(listener, "listener");
    }
}
