package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import gf.c0;
import he.y;
import j1.f0;
import kf.i;
import kf.y0;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2", f = "AndroidScarManager.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidScarManager$getVersion$2 extends j implements p {
    int label;
    final /* synthetic */ AndroidScarManager this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends j implements p {
        int label;
        final /* synthetic */ AndroidScarManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidScarManager androidScarManager, c cVar) {
            super(2, cVar);
            this.this$0 = androidScarManager;
        }

        @Override // ne.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        @Override // ne.a
        public final Object invokeSuspend(Object obj) {
            GMAScarAdapterBridge gMAScarAdapterBridge;
            if (this.label == 0) {
                he.a.f(obj);
                gMAScarAdapterBridge = this.this$0.gmaBridge;
                gMAScarAdapterBridge.getVersion();
                return y.f6101a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // ve.p
        public final Object invoke(i iVar, c cVar) {
            return ((AnonymousClass1) create(iVar, cVar)).invokeSuspend(y.f6101a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidScarManager$getVersion$2(AndroidScarManager androidScarManager, c cVar) {
        super(2, cVar);
        this.this$0 = androidScarManager;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidScarManager$getVersion$2(this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidScarManager$getVersion$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        CommonScarEventReceiver commonScarEventReceiver;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        he.a.f(obj);
        commonScarEventReceiver = this.this$0.scarEventReceiver;
        f0 f0Var = new f0(commonScarEventReceiver.getVersionFlow(), new AnonymousClass1(this.this$0, null));
        this.label = 1;
        Object l10 = y0.l(f0Var, this);
        me.a aVar = me.a.f8833x;
        if (l10 == aVar) {
            return aVar;
        }
        return l10;
    }
}
