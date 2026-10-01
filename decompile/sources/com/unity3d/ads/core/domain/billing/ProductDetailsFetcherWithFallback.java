package com.unity3d.ads.core.domain.billing;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ProductDetailsFetcherWithFallback implements ProductDetailsFetcher {
    private final ProductDetailsFetcher primaryFetcher;
    private final ProductDetailsFetcher secondaryFetcher;

    public ProductDetailsFetcherWithFallback(ProductDetailsFetcher primaryFetcher, ProductDetailsFetcher secondaryFetcher) {
        k.e(primaryFetcher, "primaryFetcher");
        k.e(secondaryFetcher, "secondaryFetcher");
        this.primaryFetcher = primaryFetcher;
        this.secondaryFetcher = secondaryFetcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object fetchProductDetails(java.lang.String r9, le.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1 r0 = (com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1 r0 = new com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            me.a r5 = me.a.f8833x
            if (r1 == 0) goto L49
            if (r1 == r4) goto L3d
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r9 = r0.L$0
            com.unity3d.ads.core.domain.billing.ProductDetailsResult r9 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) r9
            he.a.f(r10)
            goto L8e
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            he.a.f(r10)
            return r10
        L3d:
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r1 = r0.L$0
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback r1 = (com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback) r1
            he.a.f(r10)
            goto L5c
        L49:
            he.a.f(r10)
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r10 = r8.primaryFetcher
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r10.fetchProductDetails(r9, r0)
            if (r10 != r5) goto L5b
            goto L8a
        L5b:
            r1 = r8
        L5c:
            com.unity3d.ads.core.domain.billing.ProductDetailsResult r10 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) r10
            boolean r4 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success
            if (r4 == 0) goto L63
            return r10
        L63:
            boolean r4 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.NotFound
            r6 = 0
            if (r4 == 0) goto L78
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r10 = r1.secondaryFetcher
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r9 = r10.fetchProductDetails(r9, r0)
            if (r9 != r5) goto L77
            goto L8a
        L77:
            return r9
        L78:
            boolean r3 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Failure
            if (r3 == 0) goto L96
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r1 = r1.secondaryFetcher
            r0.L$0 = r10
            r0.L$1 = r6
            r0.label = r2
            java.lang.Object r9 = r1.fetchProductDetails(r9, r0)
            if (r9 != r5) goto L8b
        L8a:
            return r5
        L8b:
            r7 = r10
            r10 = r9
            r9 = r7
        L8e:
            com.unity3d.ads.core.domain.billing.ProductDetailsResult r10 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) r10
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success
            if (r0 == 0) goto L95
            return r10
        L95:
            return r9
        L96:
            a2.x0 r9 = new a2.x0
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.fetchProductDetails(java.lang.String, le.c):java.lang.Object");
    }
}
