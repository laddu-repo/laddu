package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.k;
import uc.f;
import uc.g;
import uc.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class OmidOptions {
    private final f creativeType;
    private final String customReferenceData;
    private final h impressionOwner;
    private final g impressionType;
    private final boolean isolateVerificationScripts;
    private final h mediaEventsOwner;
    private final h videoEventsOwner;

    public OmidOptions() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OmidOptions copy$default(OmidOptions omidOptions, boolean z10, h hVar, h hVar2, String str, g gVar, f fVar, h hVar3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z10 = omidOptions.isolateVerificationScripts;
        }
        if ((i6 & 2) != 0) {
            hVar = omidOptions.impressionOwner;
        }
        if ((i6 & 4) != 0) {
            hVar2 = omidOptions.videoEventsOwner;
        }
        if ((i6 & 8) != 0) {
            str = omidOptions.customReferenceData;
        }
        if ((i6 & 16) != 0) {
            gVar = omidOptions.impressionType;
        }
        if ((i6 & 32) != 0) {
            fVar = omidOptions.creativeType;
        }
        if ((i6 & 64) != 0) {
            hVar3 = omidOptions.mediaEventsOwner;
        }
        f fVar2 = fVar;
        h hVar4 = hVar3;
        g gVar2 = gVar;
        h hVar5 = hVar2;
        return omidOptions.copy(z10, hVar, hVar5, str, gVar2, fVar2, hVar4);
    }

    public final boolean component1() {
        return this.isolateVerificationScripts;
    }

    public final h component2() {
        return this.impressionOwner;
    }

    public final h component3() {
        return this.videoEventsOwner;
    }

    public final String component4() {
        return this.customReferenceData;
    }

    public final g component5() {
        return this.impressionType;
    }

    public final f component6() {
        return this.creativeType;
    }

    public final h component7() {
        return this.mediaEventsOwner;
    }

    public final OmidOptions copy(boolean z10, h hVar, h hVar2, String str, g gVar, f fVar, h hVar3) {
        return new OmidOptions(z10, hVar, hVar2, str, gVar, fVar, hVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OmidOptions)) {
            return false;
        }
        OmidOptions omidOptions = (OmidOptions) obj;
        if (this.isolateVerificationScripts == omidOptions.isolateVerificationScripts && this.impressionOwner == omidOptions.impressionOwner && this.videoEventsOwner == omidOptions.videoEventsOwner && k.a(this.customReferenceData, omidOptions.customReferenceData) && this.impressionType == omidOptions.impressionType && this.creativeType == omidOptions.creativeType && this.mediaEventsOwner == omidOptions.mediaEventsOwner) {
            return true;
        }
        return false;
    }

    public final f getCreativeType() {
        return this.creativeType;
    }

    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public final h getImpressionOwner() {
        return this.impressionOwner;
    }

    public final g getImpressionType() {
        return this.impressionType;
    }

    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    public final h getMediaEventsOwner() {
        return this.mediaEventsOwner;
    }

    public final h getVideoEventsOwner() {
        return this.videoEventsOwner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        boolean z10 = this.isolateVerificationScripts;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i6 = r02 * 31;
        h hVar = this.impressionOwner;
        int i10 = 0;
        if (hVar == null) {
            hashCode = 0;
        } else {
            hashCode = hVar.hashCode();
        }
        int i11 = (i6 + hashCode) * 31;
        h hVar2 = this.videoEventsOwner;
        if (hVar2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = hVar2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str = this.customReferenceData;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        g gVar = this.impressionType;
        if (gVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = gVar.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        f fVar = this.creativeType;
        if (fVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = fVar.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        h hVar3 = this.mediaEventsOwner;
        if (hVar3 != null) {
            i10 = hVar3.hashCode();
        }
        return i15 + i10;
    }

    public String toString() {
        return "OmidOptions(isolateVerificationScripts=" + this.isolateVerificationScripts + ", impressionOwner=" + this.impressionOwner + ", videoEventsOwner=" + this.videoEventsOwner + ", customReferenceData=" + this.customReferenceData + ", impressionType=" + this.impressionType + ", creativeType=" + this.creativeType + ", mediaEventsOwner=" + this.mediaEventsOwner + ')';
    }

    public OmidOptions(boolean z10, h hVar, h hVar2, String str, g gVar, f fVar, h hVar3) {
        this.isolateVerificationScripts = z10;
        this.impressionOwner = hVar;
        this.videoEventsOwner = hVar2;
        this.customReferenceData = str;
        this.impressionType = gVar;
        this.creativeType = fVar;
        this.mediaEventsOwner = hVar3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ OmidOptions(boolean r2, uc.h r3, uc.h r4, java.lang.String r5, uc.g r6, uc.f r7, uc.h r8, int r9, kotlin.jvm.internal.f r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L5
            r2 = 0
        L5:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lb
            r3 = r0
        Lb:
            r10 = r9 & 4
            if (r10 == 0) goto L10
            r4 = r0
        L10:
            r10 = r9 & 8
            if (r10 == 0) goto L15
            r5 = r0
        L15:
            r10 = r9 & 16
            if (r10 == 0) goto L1a
            r6 = r0
        L1a:
            r10 = r9 & 32
            if (r10 == 0) goto L1f
            r7 = r0
        L1f:
            r9 = r9 & 64
            if (r9 == 0) goto L2c
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L34
        L2c:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L34:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.OmidOptions.<init>(boolean, uc.h, uc.h, java.lang.String, uc.g, uc.f, uc.h, int, kotlin.jvm.internal.f):void");
    }
}
