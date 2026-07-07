package com.unity3d.ads.adplayer;

import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import gf.c0;
import gf.f0;
import he.h;
import he.y;
import java.util.Map;
import kf.q0;
import kf.y0;
import kotlin.jvm.internal.k;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface AdPlayer {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
    public static final int SCAR_EVENT_QUEUE_SIZE = 10;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
        public static final int SCAR_EVENT_QUEUE_SIZE = 10;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final q0 broadcastEventChannel = y0.b(0, 7);

        private Companion() {
        }

        public final q0 getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static Object destroy(AdPlayer adPlayer, c cVar) {
            f0.i(adPlayer.getScope());
            return y.f6101a;
        }

        public static void show(AdPlayer adPlayer, ShowOptions showOptions) {
            k.e(showOptions, "showOptions");
            throw new h();
        }
    }

    Object destroy(c cVar);

    void dispatchShowCompleted();

    kf.h getOnLoadEvent();

    kf.h getOnOfferwallEvent();

    kf.h getOnScarEvent();

    kf.h getOnShowEvent();

    c0 getScope();

    WebViewContainer getWebViewContainer();

    Object onAllowedPiiChange(byte[] bArr, c cVar);

    Object onBroadcastEvent(String str, c cVar);

    Object requestShow(Map<String, ? extends Object> map, c cVar);

    Object sendActivityDestroyed(c cVar);

    Object sendFocusChange(boolean z10, c cVar);

    Object sendGmaEvent(com.unity3d.scar.adapter.common.b bVar, c cVar);

    Object sendMuteChange(boolean z10, c cVar);

    Object sendOfferwallEvent(OfferwallEvent offerwallEvent, c cVar);

    Object sendPrivacyFsmChange(byte[] bArr, c cVar);

    Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, c cVar);

    Object sendUserConsentChange(byte[] bArr, c cVar);

    Object sendVisibilityChange(boolean z10, c cVar);

    Object sendVolumeChange(double d10, c cVar);

    void show(ShowOptions showOptions);
}
