package com.unity3d.services.core.di;

import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import he.y;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UnityAdsModule$publicApiJob$1$1 extends l implements ve.l {
    final /* synthetic */ DiagnosticEventRepository $diagnosticEventRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsModule$publicApiJob$1$1(DiagnosticEventRepository diagnosticEventRepository) {
        super(1);
        this.$diagnosticEventRepository = diagnosticEventRepository;
    }

    @Override // ve.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return y.f6101a;
    }

    public final void invoke(Throwable th) {
        this.$diagnosticEventRepository.flush();
    }
}
