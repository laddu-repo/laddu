package com.unity3d.ads.core.data.repository;

import he.y;
import kotlin.jvm.internal.l;
import ve.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidDiagnosticEventRepository$configure$1 extends l implements a {
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDiagnosticEventRepository$configure$1(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        super(0);
        this.this$0 = androidDiagnosticEventRepository;
    }

    @Override // ve.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m53invoke();
        return y.f6101a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m53invoke() {
        this.this$0.flush();
    }
}
