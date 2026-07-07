package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.Listeners;
import he.y;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class LegacyShowUseCase$bannerLeftApplication$1 extends l implements ve.a {
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $placement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyShowUseCase$bannerLeftApplication$1(Listeners listeners, String str) {
        super(0);
        this.$listeners = listeners;
        this.$placement = str;
    }

    @Override // ve.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m60invoke();
        return y.f6101a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m60invoke() {
        this.$listeners.onLeftApplication(this.$placement);
    }
}
