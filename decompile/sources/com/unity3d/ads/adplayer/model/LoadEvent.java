package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class LoadEvent {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Completed extends LoadEvent {
        public static final Completed INSTANCE = new Completed();

        private Completed() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Error extends LoadEvent {
        private final int errorCode;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message, int i6) {
            super(null);
            k.e(message, "message");
            this.message = message;
            this.errorCode = i6;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = error.message;
            }
            if ((i10 & 2) != 0) {
                i6 = error.errorCode;
            }
            return error.copy(str, i6);
        }

        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        public final Error copy(String message, int i6) {
            k.e(message, "message");
            return new Error(message, i6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            if (k.a(this.message, error.message) && this.errorCode == error.errorCode) {
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

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.errorCode;
        }

        public String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ')';
        }
    }

    public /* synthetic */ LoadEvent(f fVar) {
        this();
    }

    private LoadEvent() {
    }
}
