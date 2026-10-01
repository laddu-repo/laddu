package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;
import h8.c;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class LoadResult {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_AD_MARKUP_PARSING = "[UnityAds] Could not parse Ad Markup";
    public static final String MSG_AD_OBJECT = "[UnityAds] Ad not found";
    public static final String MSG_COMMUNICATION_FAILURE = "[UnityAds] Internal communication failure";
    public static final String MSG_COMMUNICATION_FAILURE_WITH_DETAILS = "[UnityAds] Internal communication failure: %s";
    public static final String MSG_COMMUNICATION_TIMEOUT = "[UnityAds] Internal communication timeout";
    public static final String MSG_CREATE_REQUEST = "[UnityAds] Failed to create load request";
    public static final String MSG_INIT_FAILED = "[UnityAds] SDK Initialization Failed";
    public static final String MSG_INIT_FAILURE = "[UnityAds] SDK Initialization Failure";
    public static final String MSG_NOT_INITIALIZED = "[UnityAds] SDK not initialized";
    public static final String MSG_NO_FILL = "[UnityAds] No fill";
    public static final String MSG_OPPORTUNITY_ID_USED = "[UnityAds] Object ID already used";
    public static final String MSG_PLACEMENT_NULL = "[UnityAds] Placement ID cannot be null";
    public static final String MSG_TIMEOUT = "[UnityAds] Timeout while loading ";

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Failure extends LoadResult {
        private final UnityAds.UnityAdsLoadError error;
        private final boolean isScarAd;
        private final String message;
        private final String reason;
        private final String reasonDebug;
        private final Throwable throwable;

        public /* synthetic */ Failure(UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th, String str2, String str3, boolean z10, int i6, f fVar) {
            this(unityAdsLoadError, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? null : th, str2, (i6 & 16) != 0 ? null : str3, (i6 & 32) != 0 ? false : z10);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th, String str2, String str3, boolean z10, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                unityAdsLoadError = failure.error;
            }
            if ((i6 & 2) != 0) {
                str = failure.message;
            }
            if ((i6 & 4) != 0) {
                th = failure.throwable;
            }
            if ((i6 & 8) != 0) {
                str2 = failure.reason;
            }
            if ((i6 & 16) != 0) {
                str3 = failure.reasonDebug;
            }
            if ((i6 & 32) != 0) {
                z10 = failure.isScarAd;
            }
            String str4 = str3;
            boolean z11 = z10;
            return failure.copy(unityAdsLoadError, str, th, str2, str4, z11);
        }

        public final UnityAds.UnityAdsLoadError component1() {
            return this.error;
        }

        public final String component2() {
            return this.message;
        }

        public final Throwable component3() {
            return this.throwable;
        }

        public final String component4() {
            return this.reason;
        }

        public final String component5() {
            return this.reasonDebug;
        }

        public final boolean component6() {
            return this.isScarAd;
        }

        public final Failure copy(UnityAds.UnityAdsLoadError error, String str, Throwable th, String reason, String str2, boolean z10) {
            k.e(error, "error");
            k.e(reason, "reason");
            return new Failure(error, str, th, reason, str2, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            if (this.error == failure.error && k.a(this.message, failure.message) && k.a(this.throwable, failure.throwable) && k.a(this.reason, failure.reason) && k.a(this.reasonDebug, failure.reasonDebug) && this.isScarAd == failure.isScarAd) {
                return true;
            }
            return false;
        }

        public final UnityAds.UnityAdsLoadError getError() {
            return this.error;
        }

        public final String getMessage() {
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

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.error.hashCode() * 31;
            String str = this.message;
            int i6 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i10 = (hashCode3 + hashCode) * 31;
            Throwable th = this.throwable;
            if (th == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = th.hashCode();
            }
            int g10 = c.g(this.reason, (i10 + hashCode2) * 31, 31);
            String str2 = this.reasonDebug;
            if (str2 != null) {
                i6 = str2.hashCode();
            }
            int i11 = (g10 + i6) * 31;
            boolean z10 = this.isScarAd;
            int i12 = z10;
            if (z10 != 0) {
                i12 = 1;
            }
            return i11 + i12;
        }

        public final boolean isScarAd() {
            return this.isScarAd;
        }

        public String toString() {
            return "Failure(error=" + this.error + ", message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", isScarAd=" + this.isScarAd + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(UnityAds.UnityAdsLoadError error, String str, Throwable th, String reason, String str2, boolean z10) {
            super(null);
            k.e(error, "error");
            k.e(reason, "reason");
            this.error = error;
            this.message = str;
            this.throwable = th;
            this.reason = reason;
            this.reasonDebug = str2;
            this.isScarAd = z10;
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Success extends LoadResult {
        private final AdObject adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(AdObject adObject) {
            super(null);
            k.e(adObject, "adObject");
            this.adObject = adObject;
        }

        public static /* synthetic */ Success copy$default(Success success, AdObject adObject, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                adObject = success.adObject;
            }
            return success.copy(adObject);
        }

        public final AdObject component1() {
            return this.adObject;
        }

        public final Success copy(AdObject adObject) {
            k.e(adObject, "adObject");
            return new Success(adObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Success) && k.a(this.adObject, ((Success) obj).adObject)) {
                return true;
            }
            return false;
        }

        public final AdObject getAdObject() {
            return this.adObject;
        }

        public int hashCode() {
            return this.adObject.hashCode();
        }

        public String toString() {
            return "Success(adObject=" + this.adObject + ')';
        }
    }

    public /* synthetic */ LoadResult(f fVar) {
        this();
    }

    private LoadResult() {
    }
}
