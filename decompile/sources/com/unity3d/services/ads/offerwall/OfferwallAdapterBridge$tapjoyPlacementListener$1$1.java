package com.unity3d.services.ads.offerwall;

import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1", f = "OfferwallAdapterBridge.kt", l = {77, 83}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OfferwallAdapterBridge$tapjoyPlacementListener$1$1 extends j implements p {
    final /* synthetic */ boolean $placementAvailable;
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallAdapterBridge$tapjoyPlacementListener$1$1(boolean z10, OfferwallAdapterBridge offerwallAdapterBridge, String str, c cVar) {
        super(2, cVar);
        this.$placementAvailable = z10;
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(this.$placementAvailable, this.this$0, this.$placementName, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r12.emit(r4, r11) == r3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r12.emit(r4, r11) == r3) goto L28;
     */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L17
            if (r0 == r2) goto L13
            if (r0 != r1) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L13:
            he.a.f(r12)
            goto L74
        L17:
            he.a.f(r12)
            boolean r12 = r11.$placementAvailable
            java.lang.String r0 = ""
            me.a r3 = me.a.f8833x
            if (r12 == 0) goto L44
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r12 = r11.this$0
            kf.q0 r12 = com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.access$get_offerwallEventFlow$p(r12)
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r4 = new com.unity3d.ads.core.domain.offerwall.OfferwallEventData
            com.unity3d.services.ads.offerwall.OfferwallEvent r5 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_SUCCESS
            java.lang.String r1 = r11.$placementName
            if (r1 != 0) goto L32
            r6 = r0
            goto L33
        L32:
            r6 = r1
        L33:
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.label = r2
            java.lang.Object r12 = r12.emit(r4, r11)
            if (r12 != r3) goto L74
            goto L73
        L44:
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r12 = r11.this$0
            java.util.HashMap r12 = com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.access$getPlacementsMap$p(r12)
            java.lang.String r2 = r11.$placementName
            if (r2 != 0) goto L4f
            r2 = r0
        L4f:
            r12.remove(r2)
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r12 = r11.this$0
            kf.q0 r12 = com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.access$get_offerwallEventFlow$p(r12)
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r4 = new com.unity3d.ads.core.domain.offerwall.OfferwallEventData
            com.unity3d.services.ads.offerwall.OfferwallEvent r5 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_FAILED
            java.lang.String r2 = r11.$placementName
            if (r2 != 0) goto L62
            r6 = r0
            goto L63
        L62:
            r6 = r2
        L63:
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.label = r1
            java.lang.Object r12 = r12.emit(r4, r11)
            if (r12 != r3) goto L74
        L73:
            return r3
        L74:
            he.y r12 = he.y.f6101a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
