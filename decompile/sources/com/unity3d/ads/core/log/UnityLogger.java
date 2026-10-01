package com.unity3d.ads.core.log;

import android.util.Log;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import java.io.File;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import ve.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UnityLogger implements Logger {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "UnityAds";
    private final boolean isForced;
    private LogLevel logLevel;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public UnityLogger(SessionRepository sessionRepository, CreateFile createFile) {
        k.e(sessionRepository, "sessionRepository");
        k.e(createFile, "createFile");
        this.logLevel = LogLevel.INFO;
        File invoke = createFile.invoke("/data/local/tmp/UnityAdsForceDebugMode");
        try {
            try {
                boolean enableTracing = sessionRepository.getNativeConfiguration().getDebugSettings().getEnableTracing();
                if (invoke.exists() || enableTracing) {
                    setLogLevel(LogLevel.TRACE);
                    debug("Unity logger initialized in TRACE mode");
                }
            } finally {
                this.isForced = getLogLevel() == LogLevel.TRACE;
            }
        } catch (Throwable unused) {
            Log.w(LOG_TAG, "An issue occurred while initializing the logger");
            this.isForced = getLogLevel() == LogLevel.TRACE;
        }
    }

    private final boolean canLog(int i6) {
        if (i6 >= getLogLevel().toAndroidLogLevel()) {
            return true;
        }
        return false;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(String message) {
        k.e(message, "message");
        if (canLog(3)) {
            Log.d(LOG_TAG, message);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void error(String message, Throwable th) {
        k.e(message, "message");
        if (!canLog(6)) {
            return;
        }
        Log.e(LOG_TAG, message, th);
    }

    @Override // com.unity3d.ads.core.log.Logger
    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void info(String message) {
        k.e(message, "message");
        if (!canLog(4)) {
            return;
        }
        Log.i(LOG_TAG, message);
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void setLogLevel(LogLevel value) {
        k.e(value, "value");
        if (!this.isForced) {
            this.logLevel = value;
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(String message, Throwable th) {
        k.e(message, "message");
        if (!canLog(2)) {
            return;
        }
        Log.v(LOG_TAG, message, th);
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(a fb2) {
        k.e(fb2, "fb");
        if (canLog(3)) {
            debug((String) fb2.invoke());
        }
    }
}
