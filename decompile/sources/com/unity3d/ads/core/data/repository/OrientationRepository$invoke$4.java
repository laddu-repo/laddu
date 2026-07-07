package com.unity3d.ads.core.data.repository;

import android.app.Activity;
import he.a;
import he.y;
import java.lang.ref.WeakReference;
import kf.f1;
import kf.r0;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4", f = "OrientationRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OrientationRepository$invoke$4 extends j implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OrientationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrientationRepository$invoke$4(OrientationRepository orientationRepository, c cVar) {
        super(2, cVar);
        this.this$0 = orientationRepository;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        OrientationRepository$invoke$4 orientationRepository$invoke$4 = new OrientationRepository$invoke$4(this.this$0, cVar);
        orientationRepository$invoke$4.L$0 = obj;
        return orientationRepository$invoke$4;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        int i6;
        if (this.label == 0) {
            a.f(obj);
            WeakReference weakReference = (WeakReference) this.L$0;
            r0Var = this.this$0._resumedActivityOrientation;
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                i6 = activity.getRequestedOrientation();
            } else {
                i6 = -1;
            }
            Integer num = new Integer(i6);
            f1 f1Var = (f1) r0Var;
            f1Var.getClass();
            f1Var.h(null, num);
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ve.p
    public final Object invoke(WeakReference<Activity> weakReference, c cVar) {
        return ((OrientationRepository$invoke$4) create(weakReference, cVar)).invokeSuspend(y.f6101a);
    }
}
