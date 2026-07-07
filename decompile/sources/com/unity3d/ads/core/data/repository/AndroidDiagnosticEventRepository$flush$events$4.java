package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidDiagnosticEventRepository$flush$events$4 extends l implements ve.l {
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDiagnosticEventRepository$flush$events$4(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        super(1);
        this.this$0 = androidDiagnosticEventRepository;
    }

    @Override // ve.l
    public final Boolean invoke(DiagnosticEventRequestOuterClass.DiagnosticEvent it) {
        Set set;
        k.e(it, "it");
        set = this.this$0.blockedEvents;
        return Boolean.valueOf(!set.contains(it.getEventType()));
    }
}
