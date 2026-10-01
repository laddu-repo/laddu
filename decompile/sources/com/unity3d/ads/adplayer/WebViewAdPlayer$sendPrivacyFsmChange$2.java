package com.unity3d.ads.adplayer;

import android.util.Base64;
import com.unity3d.ads.adplayer.model.OnPrivacyFsmChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class WebViewAdPlayer$sendPrivacyFsmChange$2 extends l implements ve.a {
    final /* synthetic */ byte[] $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$sendPrivacyFsmChange$2(byte[] bArr) {
        super(0);
        this.$value = bArr;
    }

    @Override // ve.a
    public final WebViewEvent invoke() {
        String encodeToString = Base64.encodeToString(this.$value, 2);
        k.d(encodeToString, "encodeToString(value, Base64.NO_WRAP)");
        return new OnPrivacyFsmChangeEvent(encodeToString);
    }
}
