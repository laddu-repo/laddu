package com.unity3d.ads.core.domain.offerwall;

import com.unity3d.services.ads.offerwall.OfferwallEvent;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class OfferwallEventData {
    private final Integer errorCode;
    private final String errorMessage;
    private final OfferwallEvent offerwallEvent;
    private final String placementName;

    public OfferwallEventData(OfferwallEvent offerwallEvent, String str, String str2, Integer num) {
        k.e(offerwallEvent, "offerwallEvent");
        this.offerwallEvent = offerwallEvent;
        this.placementName = str;
        this.errorMessage = str2;
        this.errorCode = num;
    }

    public static /* synthetic */ OfferwallEventData copy$default(OfferwallEventData offerwallEventData, OfferwallEvent offerwallEvent, String str, String str2, Integer num, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            offerwallEvent = offerwallEventData.offerwallEvent;
        }
        if ((i6 & 2) != 0) {
            str = offerwallEventData.placementName;
        }
        if ((i6 & 4) != 0) {
            str2 = offerwallEventData.errorMessage;
        }
        if ((i6 & 8) != 0) {
            num = offerwallEventData.errorCode;
        }
        return offerwallEventData.copy(offerwallEvent, str, str2, num);
    }

    public final OfferwallEvent component1() {
        return this.offerwallEvent;
    }

    public final String component2() {
        return this.placementName;
    }

    public final String component3() {
        return this.errorMessage;
    }

    public final Integer component4() {
        return this.errorCode;
    }

    public final OfferwallEventData copy(OfferwallEvent offerwallEvent, String str, String str2, Integer num) {
        k.e(offerwallEvent, "offerwallEvent");
        return new OfferwallEventData(offerwallEvent, str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferwallEventData)) {
            return false;
        }
        OfferwallEventData offerwallEventData = (OfferwallEventData) obj;
        if (this.offerwallEvent == offerwallEventData.offerwallEvent && k.a(this.placementName, offerwallEventData.placementName) && k.a(this.errorMessage, offerwallEventData.errorMessage) && k.a(this.errorCode, offerwallEventData.errorCode)) {
            return true;
        }
        return false;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final OfferwallEvent getOfferwallEvent() {
        return this.offerwallEvent;
    }

    public final String getPlacementName() {
        return this.placementName;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.offerwallEvent.hashCode() * 31;
        String str = this.placementName;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode3 + hashCode) * 31;
        String str2 = this.errorMessage;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Integer num = this.errorCode;
        if (num != null) {
            i6 = num.hashCode();
        }
        return i11 + i6;
    }

    public String toString() {
        return "OfferwallEventData(offerwallEvent=" + this.offerwallEvent + ", placementName=" + this.placementName + ", errorMessage=" + this.errorMessage + ", errorCode=" + this.errorCode + ')';
    }

    public /* synthetic */ OfferwallEventData(OfferwallEvent offerwallEvent, String str, String str2, Integer num, int i6, f fVar) {
        this(offerwallEvent, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? null : str2, (i6 & 8) != 0 ? null : num);
    }
}
