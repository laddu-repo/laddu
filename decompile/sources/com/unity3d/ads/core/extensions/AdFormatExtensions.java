package com.unity3d.ads.core.extensions;

import com.unity3d.ads.AdFormat;
import gatewayprotocol.v1.AdFormatOuterClass;
import kotlin.jvm.internal.k;
import sd.d;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AdFormatExtensions {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AdFormatOuterClass.AdFormat.values().length];
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AdFormat.values().length];
            try {
                iArr2[AdFormat.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AdFormat.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AdFormat.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AdFormat.REWARDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final AdFormatOuterClass.AdFormat toProtoAdFormat(AdFormat adFormat) {
        k.e(adFormat, "<this>");
        int i6 = WhenMappings.$EnumSwitchMapping$1[adFormat.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        return AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED;
                    }
                    throw new RuntimeException();
                }
                return AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL;
            }
            return AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER;
        }
        return AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED;
    }

    public static final d toUnityAdFormat(AdFormatOuterClass.AdFormat adFormat) {
        k.e(adFormat, "<this>");
        int i6 = WhenMappings.$EnumSwitchMapping$0[adFormat.ordinal()];
        if (i6 == 1) {
            return d.f12294z;
        }
        if (i6 == 2) {
            return d.f12293y;
        }
        if (i6 == 3) {
            return d.A;
        }
        if (i6 != 4) {
            return null;
        }
        return d.f12292x;
    }

    public static final d toUnityAdFormat(AdFormat adFormat) {
        k.e(adFormat, "<this>");
        int i6 = WhenMappings.$EnumSwitchMapping$1[adFormat.ordinal()];
        if (i6 == 1) {
            return d.f12292x;
        }
        if (i6 == 2) {
            return d.A;
        }
        if (i6 == 3) {
            return d.f12293y;
        }
        if (i6 == 4) {
            return d.f12294z;
        }
        throw new RuntimeException();
    }
}
