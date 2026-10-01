package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", l = {72, 76, 93, 97, 136}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidLoad$invoke$2 extends j implements p {
    final /* synthetic */ AdRequestOuterClass.BannerSize $bannerSize;
    final /* synthetic */ Context $context;
    final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ String $placement;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AndroidLoad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLoad$invoke$2(AndroidLoad androidLoad, AdRequestOuterClass.BannerSize bannerSize, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, ByteString byteString, String str, UnityAdsLoadOptions unityAdsLoadOptions, Context context, c cVar) {
        super(2, cVar);
        this.this$0 = androidLoad;
        this.$bannerSize = bannerSize;
        this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
        this.$opportunityId = byteString;
        this.$placement = str;
        this.$loadOptions = unityAdsLoadOptions;
        this.$context = context;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        AndroidLoad$invoke$2 androidLoad$invoke$2 = new AndroidLoad$invoke$2(this.this$0, this.$bannerSize, this.$headerBiddingAdMarkup, this.$opportunityId, this.$placement, this.$loadOptions, this.$context, cVar);
        androidLoad$invoke$2.L$0 = obj;
        return androidLoad$invoke$2;
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidLoad$invoke$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0347, code lost:
    
        if (r0 != r15) goto L117;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0263 A[Catch: UnityAdsNetworkException -> 0x0025, TryCatch #3 {UnityAdsNetworkException -> 0x0025, blocks: (B:9:0x001e, B:11:0x034a, B:13:0x0350, B:15:0x035e, B:18:0x0371, B:20:0x0378, B:24:0x037d, B:25:0x0382, B:34:0x022b, B:37:0x023e, B:39:0x0263, B:41:0x027f, B:43:0x02e8, B:44:0x02f4, B:46:0x0301, B:47:0x0312, B:49:0x0318, B:52:0x0334, B:68:0x0226, B:70:0x0056, B:72:0x01de, B:92:0x0162, B:95:0x0175, B:99:0x015d, B:101:0x0086, B:103:0x0115, B:118:0x0097, B:120:0x00a3, B:122:0x00b9, B:126:0x00c2, B:128:0x00ca, B:130:0x00f0, B:134:0x01a3, B:136:0x01c2, B:137:0x01c6, B:142:0x00c7), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x027f A[Catch: UnityAdsNetworkException -> 0x0025, TryCatch #3 {UnityAdsNetworkException -> 0x0025, blocks: (B:9:0x001e, B:11:0x034a, B:13:0x0350, B:15:0x035e, B:18:0x0371, B:20:0x0378, B:24:0x037d, B:25:0x0382, B:34:0x022b, B:37:0x023e, B:39:0x0263, B:41:0x027f, B:43:0x02e8, B:44:0x02f4, B:46:0x0301, B:47:0x0312, B:49:0x0318, B:52:0x0334, B:68:0x0226, B:70:0x0056, B:72:0x01de, B:92:0x0162, B:95:0x0175, B:99:0x015d, B:101:0x0086, B:103:0x0115, B:118:0x0097, B:120:0x00a3, B:122:0x00b9, B:126:0x00c2, B:128:0x00ca, B:130:0x00f0, B:134:0x01a3, B:136:0x01c2, B:137:0x01c6, B:142:0x00c7), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0173  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
