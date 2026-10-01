package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnActivityDestroyedEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class WebViewAdPlayer$sendActivityDestroyed$2 extends l implements ve.a {
    public static final WebViewAdPlayer$sendActivityDestroyed$2 INSTANCE = new WebViewAdPlayer$sendActivityDestroyed$2();

    public WebViewAdPlayer$sendActivityDestroyed$2() {
        super(0);
    }

    @Override // ve.a
    public final WebViewEvent invoke() {
        return new OnActivityDestroyedEvent();
    }
}
