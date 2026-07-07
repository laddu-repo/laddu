package com.unity3d.ads.core.data.repository;

import android.os.Handler;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMResult;
import gf.c0;
import he.a;
import he.y;
import java.util.ArrayList;
import le.c;
import ne.e;
import ne.j;
import uc.b;
import ve.p;
import wc.g;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidOpenMeasurementRepository$finishSession$2 extends j implements p {
    final /* synthetic */ ByteString $opportunityId;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOpenMeasurementRepository$finishSession$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, ByteString byteString, c cVar) {
        super(2, cVar);
        this.this$0 = androidOpenMeasurementRepository;
        this.$opportunityId = byteString;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidOpenMeasurementRepository$finishSession$2(this.this$0, this.$opportunityId, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidOpenMeasurementRepository$finishSession$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        b session;
        boolean z10;
        if (this.label == 0) {
            a.f(obj);
            if (this.this$0.isOMActive()) {
                session = this.this$0.getSession(this.$opportunityId);
                if (session == null) {
                    return new OMResult.Failure("om_session_not_found", null, 2, null);
                }
                uc.j jVar = (uc.j) session;
                if (!jVar.f13100g) {
                    jVar.f13097d.clear();
                    if (!jVar.f13100g) {
                        jVar.f13096c.clear();
                    }
                    jVar.f13100g = true;
                    yc.a aVar = jVar.f13098e;
                    g.f14287a.a(aVar.e(), "finishSession", aVar.f15047a);
                    wc.c cVar = wc.c.f14279c;
                    ArrayList arrayList = cVar.f14281b;
                    ArrayList arrayList2 = cVar.f14281b;
                    if (arrayList.size() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.f14280a.remove(jVar);
                    arrayList2.remove(jVar);
                    if (z10 && arrayList2.size() <= 0) {
                        e7.c b10 = e7.c.b();
                        b10.getClass();
                        ad.b bVar = ad.b.f678g;
                        bVar.getClass();
                        Handler handler = ad.b.f680i;
                        if (handler != null) {
                            handler.removeCallbacks(ad.b.f681k);
                            ad.b.f680i = null;
                        }
                        bVar.f682a.clear();
                        ad.b.f679h.post(new a1.e(bVar, 1));
                        wc.b bVar2 = wc.b.A;
                        bVar2.f14282x = false;
                        bVar2.f14284z = null;
                        vc.a aVar2 = (vc.a) b10.f4401z;
                        aVar2.f13502a.getContentResolver().unregisterContentObserver(aVar2);
                    }
                    jVar.f13098e.d();
                    jVar.f13098e = null;
                }
                this.this$0.sessionFinished(this.$opportunityId);
                return OMResult.Success.INSTANCE;
            }
            return new OMResult.Failure("om_not_active", null, 2, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
