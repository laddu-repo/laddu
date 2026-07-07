package com.unity3d.ads.core.domain;

import com.unity3d.ads.TokenConfiguration;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface GetHeaderBiddingToken {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetHeaderBiddingToken getHeaderBiddingToken, int i6, TokenConfiguration tokenConfiguration, c cVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    tokenConfiguration = null;
                }
                return getHeaderBiddingToken.invoke(i6, tokenConfiguration, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    Object invoke(int i6, TokenConfiguration tokenConfiguration, c cVar);
}
