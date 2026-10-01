package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import he.j;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidFullscreenWebViewAdPlayer$adObject$2 extends l implements ve.a {
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$adObject$2(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
        super(0);
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // ve.a
    public final AdObject invoke() {
        Object b10;
        AdRepository adRepository;
        String str;
        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
        try {
            adRepository = androidFullscreenWebViewAdPlayer.adRepository;
            str = androidFullscreenWebViewAdPlayer.opportunityId;
            UUID fromString = UUID.fromString(str);
            k.d(fromString, "fromString(opportunityId)");
            b10 = adRepository.getAd(ProtobufExtensionsKt.toByteString(fromString));
        } catch (Throwable th) {
            b10 = he.a.b(th);
        }
        if (b10 instanceof j) {
            b10 = null;
        }
        return (AdObject) b10;
    }
}
