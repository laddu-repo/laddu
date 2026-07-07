package com.unity3d.ads.core.log;

import ve.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface Logger {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th, int i6, Object obj) {
            if (obj == null) {
                if ((i6 & 2) != 0) {
                    th = null;
                }
                logger.error(str, th);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }

        public static /* synthetic */ void trace$default(Logger logger, String str, Throwable th, int i6, Object obj) {
            if (obj == null) {
                if ((i6 & 2) != 0) {
                    th = null;
                }
                logger.trace(str, th);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trace");
        }
    }

    void debug(String str);

    void debug(a aVar);

    void error(String str, Throwable th);

    LogLevel getLogLevel();

    void info(String str);

    void setLogLevel(LogLevel logLevel);

    void trace(String str, Throwable th);
}
