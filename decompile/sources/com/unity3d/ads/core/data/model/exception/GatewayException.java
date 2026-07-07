package com.unity3d.ads.core.data.model.exception;

import h8.c;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.internal.ws.WebSocketProtocol;
import r4.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class GatewayException extends UnityAdsNetworkException {
    public static final Companion Companion = new Companion(null);
    public static final String GATEWAY_RESPONSE_DEPTH_INITIALIZATION = "initialization";
    public static final String GATEWAY_RESPONSE_DEPTH_UNIVERSAL = "universal";
    private final String message;
    private final String reason;
    private final String reasonDebug;
    private final Throwable throwable;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ GatewayException(String str, Throwable th, String str2, String str3, int i6, f fVar) {
        this(str, (i6 & 2) != 0 ? null : th, (i6 & 4) != 0 ? "gateway" : str2, (i6 & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ GatewayException copy$default(GatewayException gatewayException, String str, Throwable th, String str2, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = gatewayException.getMessage();
        }
        if ((i6 & 2) != 0) {
            th = gatewayException.throwable;
        }
        if ((i6 & 4) != 0) {
            str2 = gatewayException.reason;
        }
        if ((i6 & 8) != 0) {
            str3 = gatewayException.reasonDebug;
        }
        return gatewayException.copy(str, th, str2, str3);
    }

    public final String component1() {
        return getMessage();
    }

    public final Throwable component2() {
        return this.throwable;
    }

    public final String component3() {
        return this.reason;
    }

    public final String component4() {
        return this.reasonDebug;
    }

    public final GatewayException copy(String message, Throwable th, String reason, String str) {
        k.e(message, "message");
        k.e(reason, "reason");
        return new GatewayException(message, th, reason, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GatewayException)) {
            return false;
        }
        GatewayException gatewayException = (GatewayException) obj;
        if (k.a(getMessage(), gatewayException.getMessage()) && k.a(this.throwable, gatewayException.throwable) && k.a(this.reason, gatewayException.reason) && k.a(this.reasonDebug, gatewayException.reasonDebug)) {
            return true;
        }
        return false;
    }

    @Override // com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException, java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = getMessage().hashCode() * 31;
        Throwable th = this.throwable;
        int i6 = 0;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        int g10 = c.g(this.reason, (hashCode2 + hashCode) * 31, 31);
        String str = this.reasonDebug;
        if (str != null) {
            i6 = str.hashCode();
        }
        return g10 + i6;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GatewayException(message=");
        sb2.append(getMessage());
        sb2.append(", throwable=");
        sb2.append(this.throwable);
        sb2.append(", reason=");
        sb2.append(this.reason);
        sb2.append(", reasonDebug=");
        return a.n(sb2, this.reasonDebug, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatewayException(String message, Throwable th, String reason, String str) {
        super(message, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
        k.e(message, "message");
        k.e(reason, "reason");
        this.message = message;
        this.throwable = th;
        this.reason = reason;
        this.reasonDebug = str;
    }
}
