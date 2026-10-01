package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.SessionChange;
import kotlin.jvm.internal.j;
import le.c;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public /* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$7 extends j implements p {
    public AndroidFullscreenWebViewAdPlayer$show$7(Object obj) {
        super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleSessionChange", "handleSessionChange(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // ve.p
    public final Object invoke(SessionChange sessionChange, c cVar) {
        Object handleSessionChange;
        handleSessionChange = ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleSessionChange(sessionChange, cVar);
        return handleSessionChange;
    }
}
