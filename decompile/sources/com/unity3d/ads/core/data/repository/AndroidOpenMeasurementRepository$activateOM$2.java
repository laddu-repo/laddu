package com.unity3d.ads.core.data.repository;

import android.content.Context;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import gf.c0;
import he.a;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidOpenMeasurementRepository$activateOM$2 extends j implements p {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOpenMeasurementRepository$activateOM$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, Context context, c cVar) {
        super(2, cVar);
        this.this$0 = androidOpenMeasurementRepository;
        this.$context = context;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidOpenMeasurementRepository$activateOM$2(this.this$0, this.$context, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidOpenMeasurementRepository$activateOM$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        OmidManager omidManager;
        OmidManager omidManager2;
        if (this.label == 0) {
            a.f(obj);
            if (!this.this$0.isOMActive()) {
                try {
                    omidManager = this.this$0.omidManager;
                    omidManager.activate(this.$context);
                    AndroidOpenMeasurementRepository androidOpenMeasurementRepository = this.this$0;
                    omidManager2 = androidOpenMeasurementRepository.omidManager;
                    androidOpenMeasurementRepository.setOMActive(omidManager2.isActive());
                    if (this.this$0.isOMActive()) {
                        return OMResult.Success.INSTANCE;
                    }
                    return new OMResult.Failure("om_activate_failure_time", null, 2, null);
                } catch (Throwable th) {
                    return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
                }
            }
            return new OMResult.Failure("om_already_active", null, 2, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
