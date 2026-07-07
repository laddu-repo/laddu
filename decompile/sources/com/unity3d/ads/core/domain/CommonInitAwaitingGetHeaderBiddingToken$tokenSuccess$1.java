package com.unity3d.ads.core.domain;

import com.unity3d.ads.IUnityAdsTokenListener;
import he.y;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken$tokenSuccess$1 extends l implements ve.a {
    final /* synthetic */ String $token;
    final /* synthetic */ CommonInitAwaitingGetHeaderBiddingToken this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonInitAwaitingGetHeaderBiddingToken$tokenSuccess$1(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, String str) {
        super(0);
        this.this$0 = commonInitAwaitingGetHeaderBiddingToken;
        this.$token = str;
    }

    @Override // ve.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m57invoke();
        return y.f6101a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m57invoke() {
        IUnityAdsTokenListener listener = this.this$0.getListener();
        if (listener != null) {
            listener.onUnityAdsTokenReady(this.$token);
        }
    }
}
