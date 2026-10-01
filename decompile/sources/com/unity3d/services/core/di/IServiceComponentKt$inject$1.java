package com.unity3d.services.core.di;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import ve.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class IServiceComponentKt$inject$1 extends l implements a {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IServiceComponentKt$inject$1(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    @Override // ve.a
    public final T invoke() {
        this.$this_inject.getServiceProvider().getRegistry();
        k.j();
        throw null;
    }
}
