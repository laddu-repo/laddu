package com.unity3d.ads.core.domain;

import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK", f = "AndroidInitializeBoldSDK.kt", l = {135, 136, 139}, m = "initializationSuccess")
/* loaded from: classes.dex */
public final class AndroidInitializeBoldSDK$initializationSuccess$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidInitializeBoldSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInitializeBoldSDK$initializationSuccess$1(AndroidInitializeBoldSDK androidInitializeBoldSDK, le.c cVar) {
        super(cVar);
        this.this$0 = androidInitializeBoldSDK;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object initializationSuccess;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        initializationSuccess = this.this$0.initializationSuccess(null, null, false, this);
        return initializationSuccess;
    }
}
