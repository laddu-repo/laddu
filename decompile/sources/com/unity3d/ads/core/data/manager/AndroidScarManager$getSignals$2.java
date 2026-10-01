package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.extensions.AdFormatExtensions;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.AdFormatOuterClass;
import gf.c0;
import gf.k;
import he.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import le.c;
import ne.e;
import ne.j;
import sd.d;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2", f = "AndroidScarManager.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidScarManager$getSignals$2 extends j implements p {
    final /* synthetic */ List<AdFormatOuterClass.AdFormat> $adFormat;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AndroidScarManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidScarManager$getSignals$2(List<? extends AdFormatOuterClass.AdFormat> list, AndroidScarManager androidScarManager, c cVar) {
        super(2, cVar);
        this.$adFormat = list;
        this.this$0 = androidScarManager;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidScarManager$getSignals$2(this.$adFormat, this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidScarManager$getSignals$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        GMAScarAdapterBridge gMAScarAdapterBridge;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        he.a.f(obj);
        List<AdFormatOuterClass.AdFormat> list = this.$adFormat;
        AndroidScarManager androidScarManager = this.this$0;
        this.L$0 = list;
        this.L$1 = androidScarManager;
        this.label = 1;
        final k kVar = new k(1, a8.c.i(this));
        kVar.s();
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                d unityAdFormat = AdFormatExtensions.toUnityAdFormat((AdFormatOuterClass.AdFormat) it.next());
                if (unityAdFormat == d.f12292x) {
                    unityAdFormat = null;
                }
                if (unityAdFormat != null) {
                    arrayList.add(unityAdFormat);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            gMAScarAdapterBridge = androidScarManager.gmaBridge;
            gMAScarAdapterBridge.getSCARBiddingSignals(arrayList, new BiddingSignalsHandler(true, new IBiddingSignalsListener() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2$1$1
                @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                public void onSignalsFailure(String str) {
                    gf.j.this.resumeWith(he.a.b(new Exception(str)));
                }

                @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                public void onSignalsReady(BiddingSignals biddingSignals) {
                    gf.j.this.resumeWith(biddingSignals);
                }
            }));
        } else {
            kVar.resumeWith(null);
        }
        Object r10 = kVar.r();
        me.a aVar = me.a.f8833x;
        if (r10 == aVar) {
            return aVar;
        }
        return r10;
    }
}
