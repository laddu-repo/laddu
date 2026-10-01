package com.unity3d.ads.core.data.manager;

import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gf.c0;
import he.y;
import java.util.List;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", l = {132, 135, 148, 151}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransactionEventManager$onPurchasesReceived$1 extends j implements p {
    final /* synthetic */ List<PurchaseBridge> $purchases;
    final /* synthetic */ TransactionEventRequestOuterClass.TransactionOrigin $transactionOrigin;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ TransactionEventManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransactionEventManager$onPurchasesReceived$1(List<? extends PurchaseBridge> list, TransactionEventManager transactionEventManager, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, c cVar) {
        super(2, cVar);
        this.$purchases = list;
        this.this$0 = transactionEventManager;
        this.$transactionOrigin = transactionOrigin;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new TransactionEventManager$onPurchasesReceived$1(this.$purchases, this.this$0, this.$transactionOrigin, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((TransactionEventManager$onPurchasesReceived$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:19|20|21|22|23|24|(1:26)|27|28|29|30|31|32|33|34|(2:36|(22:38|39|40|41|42|43|44|45|46|47|(1:49)|(2:92|93)(1:51)|52|(1:54)(1:91)|(2:60|(5:62|63|64|65|(6:68|69|70|71|72|(13:74|23|24|(0)|27|28|29|30|31|32|33|34|(2:106|(1:108)(9:110|(1:112)|113|114|(1:116)|117|118|(1:120)(1:122)|121))(0)))(10:67|27|28|29|30|31|32|33|34|(0)(0))))|85|86|87|32|33|34|(0)(0))(2:104|105))(0)|18) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:38|(1:39)|40|41|42|43|44|45|46|47|(1:49)|(2:92|93)(1:51)|52|(1:54)(1:91)|(2:60|(5:62|63|64|65|(6:68|69|70|71|72|(13:74|23|24|(0)|27|28|29|30|31|32|33|34|(2:106|(1:108)(9:110|(1:112)|113|114|(1:116)|117|118|(1:120)(1:122)|121))(0)))(10:67|27|28|29|30|31|32|33|34|(0)(0))))|85|86|87|32|33|34|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:68)|69|70|71|72|(13:74|23|24|(0)|27|28|29|30|31|32|33|34|(2:106|(1:108)(9:110|(1:112)|113|114|(1:116)|117|118|(1:120)(1:122)|121))(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d5, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0284, code lost:
    
        if (r2 == r9) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x02a8, code lost:
    
        if (r1 == r9) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b6, code lost:
    
        r12 = r14;
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b9, code lost:
    
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d8, code lost:
    
        r15 = r1;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01eb, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a1 A[Catch: Exception -> 0x01b3, TryCatch #9 {Exception -> 0x01b3, blocks: (B:24:0x019b, B:26:0x01a1, B:27:0x01c0), top: B:23:0x019b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01bd -> B:27:0x01c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0198 -> B:23:0x019b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01f0 -> B:31:0x01cd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x01de -> B:32:0x01e9). Please report as a decompilation issue!!! */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
