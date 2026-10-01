package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.ServiceProvider;
import gatewayprotocol.v1.AdFormatOuterClass;
import gf.f0;
import he.y;
import java.util.List;
import kf.h;
import kf.i;
import kf.u;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidScarManager implements ScarManager {
    private final GMAScarAdapterBridge gmaBridge;
    private final CommonScarEventReceiver scarEventReceiver;
    private final ScarTimeHackFixer scarTimeHackFixer;

    public AndroidScarManager(CommonScarEventReceiver scarEventReceiver, GMAScarAdapterBridge gmaBridge, ScarTimeHackFixer scarTimeHackFixer) {
        k.e(scarEventReceiver, "scarEventReceiver");
        k.e(gmaBridge, "gmaBridge");
        k.e(scarTimeHackFixer, "scarTimeHackFixer");
        this.scarEventReceiver = scarEventReceiver;
        this.gmaBridge = gmaBridge;
        this.scarTimeHackFixer = scarTimeHackFixer;
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object getSignals(List<? extends AdFormatOuterClass.AdFormat> list, c cVar) {
        return f0.L(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, new AndroidScarManager$getSignals$2(list, this, null), cVar);
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object getVersion(c cVar) {
        return f0.L(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT, new AndroidScarManager$getVersion$2(this, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.unity3d.ads.core.data.manager.ScarManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadAd(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, le.c r20) {
        /*
            r13 = this;
            r0 = r20
            boolean r2 = r0 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1
            if (r2 == 0) goto L16
            r2 = r0
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r2 = (com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
        L14:
            r9 = r2
            goto L1c
        L16:
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r2 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1
            r2.<init>(r13, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.result
            int r2 = r9.label
            r10 = 0
            r11 = 1
            if (r2 == 0) goto L32
            if (r2 != r11) goto L2a
            he.a.f(r0)
            goto L66
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L32:
            he.a.f(r0)
            java.lang.String r0 = "INTERSTITIAL"
            boolean r2 = df.u.A(r14, r0, r11)
            com.unity3d.ads.core.domain.scar.CommonScarEventReceiver r0 = r13.scarEventReceiver
            kf.u0 r12 = r0.getGmaEventFlow()
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2 r0 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2
            r8 = 0
            r1 = r13
            r3 = r15
            r5 = r16
            r6 = r17
            r4 = r18
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            j1.f0 r1 = new j1.f0
            r1.<init>(r12, r0)
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3 r0 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3
            r0.<init>(r15, r10)
            r9.label = r11
            java.lang.Object r0 = kf.y0.m(r1, r0, r9)
            me.a r1 = me.a.f8833x
            if (r0 != r1) goto L66
            return r1
        L66:
            r1 = r0
            com.unity3d.ads.core.domain.scar.GmaEventData r1 = (com.unity3d.ads.core.domain.scar.GmaEventData) r1
            com.unity3d.scar.adapter.common.b r1 = r1.getGmaEvent()
            com.unity3d.scar.adapter.common.b r2 = com.unity3d.scar.adapter.common.b.H
            if (r1 == r2) goto L72
            r10 = r0
        L72:
            com.unity3d.ads.core.domain.scar.GmaEventData r10 = (com.unity3d.ads.core.domain.scar.GmaEventData) r10
            if (r10 == 0) goto L95
            com.unity3d.ads.core.data.model.exception.LoadException r0 = new com.unity3d.ads.core.data.model.exception.LoadException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error loading SCAR ad: "
            r1.<init>(r2)
            java.lang.String r2 = r10.getErrorMessage()
            if (r2 != 0) goto L89
            com.unity3d.scar.adapter.common.b r2 = r10.getGmaEvent()
        L89:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r0.<init>(r2, r1)
            throw r0
        L95:
            he.y r0 = he.y.f6101a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, le.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public h loadBannerAd(Context context, BannerView bannerView, sd.c scarAdMetadata, UnityBannerSize bannerSize, final String opportunityId) {
        k.e(context, "context");
        k.e(bannerView, "bannerView");
        k.e(scarAdMetadata, "scarAdMetadata");
        k.e(bannerSize, "bannerSize");
        k.e(opportunityId, "opportunityId");
        final u uVar = new u(new AndroidScarManager$loadBannerAd$1(this, context, bannerView, opportunityId, scarAdMetadata, bannerSize, null), this.scarEventReceiver.getGmaEventFlow());
        return new h() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1

            /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
            /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements i {
                final /* synthetic */ String $opportunityId$inlined;
                final /* synthetic */ i $this_unsafeFlow;

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2", f = "AndroidScarManager.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ne.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // ne.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(i iVar, String str) {
                    this.$this_unsafeFlow = iVar;
                    this.$opportunityId$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // kf.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, le.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2d
                        if (r1 != r2) goto L25
                        he.a.f(r7)
                        goto L54
                    L25:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2d:
                        he.a.f(r7)
                        kf.i r7 = r5.$this_unsafeFlow
                        r1 = r6
                        com.unity3d.ads.core.domain.scar.GmaEventData r1 = (com.unity3d.ads.core.domain.scar.GmaEventData) r1
                        com.unity3d.scar.adapter.common.b r3 = r1.getGmaEvent()
                        com.unity3d.scar.adapter.common.b r4 = com.unity3d.scar.adapter.common.b.f3390c0
                        if (r3 != r4) goto L54
                        java.lang.String r1 = r1.getOpportunityId()
                        java.lang.String r3 = r5.$opportunityId$inlined
                        boolean r1 = kotlin.jvm.internal.k.a(r1, r3)
                        if (r1 == 0) goto L54
                        r0.label = r2
                        java.lang.Object r6 = r7.emit(r6, r0)
                        me.a r7 = me.a.f8833x
                        if (r6 != r7) goto L54
                        return r7
                    L54:
                        he.y r6 = he.y.f6101a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                }
            }

            @Override // kf.h
            public Object collect(i iVar, c cVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar, opportunityId), cVar);
                if (collect == me.a.f8833x) {
                    return collect;
                }
                return y.f6101a;
            }
        };
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public h show(String placementId, String queryId) {
        k.e(placementId, "placementId");
        k.e(queryId, "queryId");
        return new lc.c((p) new dd.c(new j1.f0(this.scarEventReceiver.getGmaEventFlow(), new AndroidScarManager$show$1(this, placementId, queryId, null)), new AndroidScarManager$show$2(null), (c) null));
    }
}
