package com.unity3d.ads.core.log;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public enum LogLevel {
    DISABLED(0),
    ERROR(1),
    INFO(2),
    DEBUG(3),
    TRACE(4);

    private final int level;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevel.values().length];
            try {
                iArr[LogLevel.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevel.TRACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    LogLevel(int i6) {
        this.level = i6;
    }

    public final int getLevel$unity_ads_defaultRelease() {
        return this.level;
    }

    public final int toAndroidLogLevel() {
        int i6 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    return 4;
                }
                if (i6 == 4) {
                    return 3;
                }
                if (i6 == 5) {
                    return 2;
                }
                throw new RuntimeException();
            }
            return 6;
        }
        return Integer.MAX_VALUE;
    }
}
