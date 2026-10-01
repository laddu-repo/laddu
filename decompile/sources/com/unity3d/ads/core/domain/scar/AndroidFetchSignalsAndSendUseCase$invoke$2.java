package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2", f = "AndroidFetchSignalsAndSendUseCase.kt", l = {34, 54}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidFetchSignalsAndSendUseCase$invoke$2 extends j implements p {
    final /* synthetic */ TokenConfiguration $tokenConfiguration;
    final /* synthetic */ ByteString $tokenId;
    final /* synthetic */ int $tokenNumber;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidFetchSignalsAndSendUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFetchSignalsAndSendUseCase$invoke$2(AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase, TokenConfiguration tokenConfiguration, int i6, ByteString byteString, c cVar) {
        super(2, cVar);
        this.this$0 = androidFetchSignalsAndSendUseCase;
        this.$tokenConfiguration = tokenConfiguration;
        this.$tokenNumber = i6;
        this.$tokenId = byteString;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        AndroidFetchSignalsAndSendUseCase$invoke$2 androidFetchSignalsAndSendUseCase$invoke$2 = new AndroidFetchSignalsAndSendUseCase$invoke$2(this.this$0, this.$tokenConfiguration, this.$tokenNumber, this.$tokenId, cVar);
        androidFetchSignalsAndSendUseCase$invoke$2.L$0 = obj;
        return androidFetchSignalsAndSendUseCase$invoke$2;
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidFetchSignalsAndSendUseCase$invoke$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fa, code lost:
    
        if (r0 == r5) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
