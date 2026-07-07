package com.unity3d.ads.core.domain;

import a8.b;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import gf.f0;
import he.y;
import jf.v;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import le.c;
import ne.e;
import ne.j;
import okhttp3.internal.ws.WebSocketProtocol;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2", f = "AndroidGetLifecycleFlow.kt", l = {WebSocketProtocol.B0_FLAG_RSV1}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidGetLifecycleFlow$invoke$2 extends j implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidGetLifecycleFlow this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements ve.a {
        final /* synthetic */ AndroidGetLifecycleFlow$invoke$2$listener$1 $listener;
        final /* synthetic */ AndroidGetLifecycleFlow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidGetLifecycleFlow androidGetLifecycleFlow, AndroidGetLifecycleFlow$invoke$2$listener$1 androidGetLifecycleFlow$invoke$2$listener$1) {
            super(0);
            this.this$0 = androidGetLifecycleFlow;
            this.$listener = androidGetLifecycleFlow$invoke$2$listener$1;
        }

        @Override // ve.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m54invoke();
            return y.f6101a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m54invoke() {
            Context context;
            context = this.this$0.applicationContext;
            ((Application) context).unregisterActivityLifecycleCallbacks(this.$listener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetLifecycleFlow$invoke$2(AndroidGetLifecycleFlow androidGetLifecycleFlow, c cVar) {
        super(2, cVar);
        this.this$0 = androidGetLifecycleFlow;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        AndroidGetLifecycleFlow$invoke$2 androidGetLifecycleFlow$invoke$2 = new AndroidGetLifecycleFlow$invoke$2(this.this$0, cVar);
        androidGetLifecycleFlow$invoke$2.L$0 = obj;
        return androidGetLifecycleFlow$invoke$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Application$ActivityLifecycleCallbacks, com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1] */
    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            final v vVar = (v) this.L$0;
            ?? r02 = new Application.ActivityLifecycleCallbacks() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    k.e(activity, "activity");
                    v vVar2 = v.this;
                    f0.w(vVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityCreated$1(vVar2, activity, bundle, null), 3);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    k.e(activity, "activity");
                    v vVar2 = v.this;
                    f0.w(vVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1(vVar2, activity, null), 3);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    k.e(activity, "activity");
                    v vVar2 = v.this;
                    f0.w(vVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityPaused$1(vVar2, activity, null), 3);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    k.e(activity, "activity");
                    v vVar2 = v.this;
                    f0.w(vVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(vVar2, activity, null), 3);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    k.e(activity, "activity");
                    k.e(bundle, "bundle");
                    v vVar2 = v.this;
                    f0.w(vVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1(vVar2, activity, bundle, null), 3);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    k.e(activity, "activity");
                    v vVar2 = v.this;
                    f0.w(vVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1(vVar2, activity, null), 3);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    k.e(activity, "activity");
                    v vVar2 = v.this;
                    f0.w(vVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$1(vVar2, activity, null), 3);
                }
            };
            context = this.this$0.applicationContext;
            ((Application) context).registerActivityLifecycleCallbacks(r02);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, r02);
            this.label = 1;
            Object b10 = b.b(vVar, anonymousClass1, this);
            me.a aVar = me.a.f8833x;
            if (b10 == aVar) {
                return aVar;
            }
        }
        return y.f6101a;
    }

    @Override // ve.p
    public final Object invoke(v vVar, c cVar) {
        return ((AndroidGetLifecycleFlow$invoke$2) create(vVar, cVar)).invokeSuspend(y.f6101a);
    }
}
