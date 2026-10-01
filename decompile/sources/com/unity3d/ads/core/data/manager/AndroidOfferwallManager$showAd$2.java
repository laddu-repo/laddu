package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import he.y;
import kf.i;
import le.c;
import ne.e;
import ne.j;
import ve.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2", f = "AndroidOfferwallManager.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidOfferwallManager$showAd$2 extends j implements q {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public AndroidOfferwallManager$showAd$2(c cVar) {
        super(3, cVar);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        OfferwallEventData offerwallEventData;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                offerwallEventData = (OfferwallEventData) this.L$0;
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            i iVar = (i) this.L$0;
            offerwallEventData = (OfferwallEventData) this.L$1;
            this.L$0 = offerwallEventData;
            this.label = 1;
            Object emit = iVar.emit(offerwallEventData, this);
            me.a aVar = me.a.f8833x;
            if (emit == aVar) {
                return aVar;
            }
        }
        return Boolean.valueOf(!ie.i.Z(new OfferwallEvent[]{OfferwallEvent.ON_CONTENT_DISMISS, OfferwallEvent.SHOW_FAILED}, offerwallEventData.getOfferwallEvent()));
    }

    @Override // ve.q
    public final Object invoke(i iVar, OfferwallEventData offerwallEventData, c cVar) {
        AndroidOfferwallManager$showAd$2 androidOfferwallManager$showAd$2 = new AndroidOfferwallManager$showAd$2(cVar);
        androidOfferwallManager$showAd$2.L$0 = iVar;
        androidOfferwallManager$showAd$2.L$1 = offerwallEventData;
        return androidOfferwallManager$showAd$2.invokeSuspend(y.f6101a);
    }
}
