package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import he.y;
import kf.i;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidScarManager$loadAd$2 extends j implements p {
    final /* synthetic */ String $adString;
    final /* synthetic */ String $adUnitId;
    final /* synthetic */ boolean $canSkip;
    final /* synthetic */ String $placementId;
    final /* synthetic */ String $queryId;
    final /* synthetic */ int $videoLength;
    int label;
    final /* synthetic */ AndroidScarManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidScarManager$loadAd$2(AndroidScarManager androidScarManager, boolean z10, String str, String str2, String str3, String str4, int i6, c cVar) {
        super(2, cVar);
        this.this$0 = androidScarManager;
        this.$canSkip = z10;
        this.$placementId = str;
        this.$queryId = str2;
        this.$adString = str3;
        this.$adUnitId = str4;
        this.$videoLength = i6;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidScarManager$loadAd$2(this.this$0, this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, this.$videoLength, cVar);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        GMAScarAdapterBridge gMAScarAdapterBridge;
        ScarTimeHackFixer scarTimeHackFixer;
        if (this.label == 0) {
            he.a.f(obj);
            gMAScarAdapterBridge = this.this$0.gmaBridge;
            boolean z10 = this.$canSkip;
            String str = this.$placementId;
            String str2 = this.$queryId;
            String str3 = this.$adString;
            String str4 = this.$adUnitId;
            scarTimeHackFixer = this.this$0.scarTimeHackFixer;
            gMAScarAdapterBridge.load(z10, str, str2, str3, str4, scarTimeHackFixer.invoke(this.$videoLength));
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ve.p
    public final Object invoke(i iVar, c cVar) {
        return ((AndroidScarManager$loadAd$2) create(iVar, cVar)).invokeSuspend(y.f6101a);
    }
}
