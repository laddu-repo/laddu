package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.data.model.OperationType;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class NetworkTimeoutException extends UnityAdsNetworkException {
    public /* synthetic */ NetworkTimeoutException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4, int i6, f fVar) {
        this(str, (i6 & 2) != 0 ? OperationType.UNKNOWN : operationType, (i6 & 4) != 0 ? null : num, (i6 & 8) != 0 ? null : str2, (i6 & 16) != 0 ? null : str3, (i6 & 32) != 0 ? null : num2, (i6 & 64) != 0 ? null : str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkTimeoutException(String message, OperationType type, Integer num, String str, String str2, Integer num2, String str3) {
        super(message, type, num, str, str2, num2, str3);
        k.e(message, "message");
        k.e(type, "type");
    }
}
