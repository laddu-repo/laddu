package com.unity3d.ads.core.domain;

import android.app.Activity;
import com.unity3d.ads.core.domain.LifecycleEvent;
import gf.c0;
import he.y;
import java.lang.ref.WeakReference;
import jf.u;
import jf.v;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$1", f = "AndroidGetLifecycleFlow.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$1 extends j implements p {
    final /* synthetic */ v $$this$channelFlow;
    final /* synthetic */ Activity $activity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$1(v vVar, Activity activity, c cVar) {
        super(2, cVar);
        this.$$this$channelFlow = vVar;
        this.$activity = activity;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$1(this.$$this$channelFlow, this.$activity, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            v vVar = this.$$this$channelFlow;
            LifecycleEvent.Stopped stopped = new LifecycleEvent.Stopped(new WeakReference(this.$activity));
            this.label = 1;
            Object i10 = ((u) vVar).A.i(stopped, this);
            me.a aVar = me.a.f8833x;
            if (i10 == aVar) {
                return aVar;
            }
        }
        return y.f6101a;
    }
}
