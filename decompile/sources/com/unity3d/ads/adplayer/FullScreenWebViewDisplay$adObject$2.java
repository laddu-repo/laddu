package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import he.f;
import he.g;
import he.j;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FullScreenWebViewDisplay$adObject$2 extends l implements ve.a {
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$adObject$2(FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        super(0);
        this.this$0 = fullScreenWebViewDisplay;
    }

    private static final AdRepository invoke$lambda$0(f fVar) {
        return (AdRepository) fVar.getValue();
    }

    @Override // ve.a
    public final AdObject invoke() {
        Object b10;
        String str;
        f c10 = he.a.c(g.f6075z, new FullScreenWebViewDisplay$adObject$2$invoke$$inlined$inject$default$1(this.this$0, HttpUrl.FRAGMENT_ENCODE_SET));
        FullScreenWebViewDisplay fullScreenWebViewDisplay = this.this$0;
        try {
            AdRepository invoke$lambda$0 = invoke$lambda$0(c10);
            str = fullScreenWebViewDisplay.opportunityId;
            UUID fromString = UUID.fromString(str);
            k.d(fromString, "fromString(opportunityId)");
            b10 = invoke$lambda$0.getAd(ProtobufExtensionsKt.toByteString(fromString));
        } catch (Throwable th) {
            b10 = he.a.b(th);
        }
        if (b10 instanceof j) {
            b10 = null;
        }
        return (AdObject) b10;
    }
}
