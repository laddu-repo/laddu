package com.unity3d.ads.core.domain.scar;

import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1", f = "CommonScarEventReceiver.kt", l = {35, 41, 52, 66, 73}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CommonScarEventReceiver$sendEvent$1 extends j implements p {
    final /* synthetic */ Enum<?> $eventId;
    final /* synthetic */ Object[] $params;
    int label;
    final /* synthetic */ CommonScarEventReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonScarEventReceiver$sendEvent$1(Enum<?> r12, Object[] objArr, CommonScarEventReceiver commonScarEventReceiver, c cVar) {
        super(2, cVar);
        this.$eventId = r12;
        this.$params = objArr;
        this.this$0 = commonScarEventReceiver;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new CommonScarEventReceiver$sendEvent$1(this.$eventId, this.$params, this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((CommonScarEventReceiver$sendEvent$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0123, code lost:
    
        if (r1.emit(r10, r20) == r9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r2.emit(r1, r20) == r9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r2.emit(r10, r20) == r9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
    
        if (r2.emit(r10, r20) == r9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ee, code lost:
    
        if (r1.emit(r10, r20) == r9) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f7  */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
