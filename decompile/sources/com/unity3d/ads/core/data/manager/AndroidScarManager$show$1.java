package com.unity3d.ads.core.data.manager;

import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import he.y;
import kf.i;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidScarManager$show$1 extends j implements p {
    final /* synthetic */ String $placementId;
    final /* synthetic */ String $queryId;
    int label;
    final /* synthetic */ AndroidScarManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidScarManager$show$1(AndroidScarManager androidScarManager, String str, String str2, c cVar) {
        super(2, cVar);
        this.this$0 = androidScarManager;
        this.$placementId = str;
        this.$queryId = str2;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidScarManager$show$1(this.this$0, this.$placementId, this.$queryId, cVar);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        GMAScarAdapterBridge gMAScarAdapterBridge;
        if (this.label == 0) {
            he.a.f(obj);
            gMAScarAdapterBridge = this.this$0.gmaBridge;
            gMAScarAdapterBridge.show(this.$placementId, this.$queryId);
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ve.p
    public final Object invoke(i iVar, c cVar) {
        return ((AndroidScarManager$show$1) create(iVar, cVar)).invokeSuspend(y.f6101a);
    }
}
