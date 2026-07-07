package com.unity3d.ads.core.data.model;

import com.unity3d.ads.adplayer.model.ShowStatus;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import r4.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class ShowEvent {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class CancelTimeout extends ShowEvent {
        public static final CancelTimeout INSTANCE = new CancelTimeout();

        private CancelTimeout() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Clicked extends ShowEvent {
        public static final Clicked INSTANCE = new Clicked();

        private Clicked() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Completed extends ShowEvent {
        private final String reason;
        private final String reasonDebug;
        private final ShowStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(ShowStatus status, String str, String str2) {
            super(null);
            k.e(status, "status");
            this.status = status;
            this.reason = str;
            this.reasonDebug = str2;
        }

        public static /* synthetic */ Completed copy$default(Completed completed, ShowStatus showStatus, String str, String str2, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                showStatus = completed.status;
            }
            if ((i6 & 2) != 0) {
                str = completed.reason;
            }
            if ((i6 & 4) != 0) {
                str2 = completed.reasonDebug;
            }
            return completed.copy(showStatus, str, str2);
        }

        public final ShowStatus component1() {
            return this.status;
        }

        public final String component2() {
            return this.reason;
        }

        public final String component3() {
            return this.reasonDebug;
        }

        public final Completed copy(ShowStatus status, String str, String str2) {
            k.e(status, "status");
            return new Completed(status, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) obj;
            if (this.status == completed.status && k.a(this.reason, completed.reason) && k.a(this.reasonDebug, completed.reasonDebug)) {
                return true;
            }
            return false;
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        public final ShowStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.status.hashCode() * 31;
            String str = this.reason;
            int i6 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i10 = (hashCode2 + hashCode) * 31;
            String str2 = this.reasonDebug;
            if (str2 != null) {
                i6 = str2.hashCode();
            }
            return i10 + i6;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Completed(status=");
            sb2.append(this.status);
            sb2.append(", reason=");
            sb2.append(this.reason);
            sb2.append(", reasonDebug=");
            return a.n(sb2, this.reasonDebug, ')');
        }

        public /* synthetic */ Completed(ShowStatus showStatus, String str, String str2, int i6, f fVar) {
            this(showStatus, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? null : str2);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Error extends ShowEvent {
        private final int errorCode;
        private final String message;
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message, int i6, String reason) {
            super(null);
            k.e(message, "message");
            k.e(reason, "reason");
            this.message = message;
            this.errorCode = i6;
            this.reason = reason;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i6, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = error.message;
            }
            if ((i10 & 2) != 0) {
                i6 = error.errorCode;
            }
            if ((i10 & 4) != 0) {
                str2 = error.reason;
            }
            return error.copy(str, i6, str2);
        }

        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        public final String component3() {
            return this.reason;
        }

        public final Error copy(String message, int i6, String reason) {
            k.e(message, "message");
            k.e(reason, "reason");
            return new Error(message, i6, reason);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            if (k.a(this.message, error.message) && this.errorCode == error.errorCode && k.a(this.reason, error.reason)) {
                return true;
            }
            return false;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode() + (((this.message.hashCode() * 31) + this.errorCode) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.message);
            sb2.append(", errorCode=");
            sb2.append(this.errorCode);
            sb2.append(", reason=");
            return a.n(sb2, this.reason, ')');
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class LeftApplication extends ShowEvent {
        public static final LeftApplication INSTANCE = new LeftApplication();

        private LeftApplication() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Started extends ShowEvent {
        public static final Started INSTANCE = new Started();

        private Started() {
            super(null);
        }
    }

    public /* synthetic */ ShowEvent(f fVar) {
        this();
    }

    private ShowEvent() {
    }
}
