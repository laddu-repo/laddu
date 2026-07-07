package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMResult;
import gf.c0;
import he.a;
import he.y;
import le.c;
import ne.e;
import ne.j;
import uc.b;
import uc.h;
import ve.p;
import wc.g;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidOpenMeasurementRepository$impressionOccurred$2 extends j implements p {
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ boolean $signalLoaded;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOpenMeasurementRepository$impressionOccurred$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, ByteString byteString, boolean z10, c cVar) {
        super(2, cVar);
        this.this$0 = androidOpenMeasurementRepository;
        this.$opportunityId = byteString;
        this.$signalLoaded = z10;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidOpenMeasurementRepository$impressionOccurred$2(this.this$0, this.$opportunityId, this.$signalLoaded, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidOpenMeasurementRepository$impressionOccurred$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        b session;
        OmidManager omidManager;
        if (this.label == 0) {
            a.f(obj);
            session = this.this$0.getSession(this.$opportunityId);
            if (session != null) {
                omidManager = this.this$0.omidManager;
                uc.a createAdEvents = omidManager.createAdEvents(session);
                boolean z10 = this.$signalLoaded;
                h hVar = h.NATIVE;
                g gVar = g.f14287a;
                if (z10) {
                    uc.j jVar = createAdEvents.f13069a;
                    if (jVar.f13099f) {
                        if (!jVar.f13100g) {
                            if (hVar == jVar.f13095b.f13070a) {
                                if (!jVar.j) {
                                    yc.a aVar = jVar.f13098e;
                                    gVar.a(aVar.e(), "publishLoadedEvent", null, aVar.f15047a);
                                    jVar.j = true;
                                } else {
                                    throw new IllegalStateException("Loaded event can only be sent once");
                                }
                            } else {
                                throw new IllegalStateException("Impression event is not expected from the Native AdSession");
                            }
                        } else {
                            throw new IllegalStateException("AdSession is finished");
                        }
                    } else {
                        throw new IllegalStateException("AdSession is not started");
                    }
                }
                uc.j jVar2 = createAdEvents.f13069a;
                boolean z11 = jVar2.f13100g;
                if (!z11) {
                    if (hVar == jVar2.f13095b.f13070a) {
                        if (!jVar2.f13099f || z11) {
                            try {
                                jVar2.b();
                            } catch (Exception unused) {
                            }
                        }
                        if (jVar2.f13099f && !jVar2.f13100g) {
                            if (!jVar2.f13102i) {
                                yc.a aVar2 = jVar2.f13098e;
                                gVar.a(aVar2.e(), "publishImpressionEvent", aVar2.f15047a);
                                jVar2.f13102i = true;
                            } else {
                                throw new IllegalStateException("Impression event can only be sent once");
                            }
                        }
                        return OMResult.Success.INSTANCE;
                    }
                    throw new IllegalStateException("Impression event is not expected from the Native AdSession");
                }
                throw new IllegalStateException("AdSession is finished");
            }
            return new OMResult.Failure("om_session_not_found", null, 2, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
