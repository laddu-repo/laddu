package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.scar.adapter.common.b;
import he.y;
import kf.i;
import le.c;
import ne.e;
import ne.j;
import ve.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$2", f = "AndroidScarManager.kt", l = {127}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidScarManager$show$2 extends j implements q {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public AndroidScarManager$show$2(c cVar) {
        super(3, cVar);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        GmaEventData gmaEventData;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                gmaEventData = (GmaEventData) this.L$0;
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            i iVar = (i) this.L$0;
            gmaEventData = (GmaEventData) this.L$1;
            this.L$0 = gmaEventData;
            this.label = 1;
            Object emit = iVar.emit(gmaEventData, this);
            me.a aVar = me.a.f8833x;
            if (emit == aVar) {
                return aVar;
            }
        }
        return Boolean.valueOf(!ie.i.Z(new b[]{b.f3388a0, b.M, b.R, b.Q}, gmaEventData.getGmaEvent()));
    }

    @Override // ve.q
    public final Object invoke(i iVar, GmaEventData gmaEventData, c cVar) {
        AndroidScarManager$show$2 androidScarManager$show$2 = new AndroidScarManager$show$2(cVar);
        androidScarManager$show$2.L$0 = iVar;
        androidScarManager$show$2.L$1 = gmaEventData;
        return androidScarManager$show$2.invokeSuspend(y.f6101a);
    }
}
