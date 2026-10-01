package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface l0 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(n0 n0Var);

    void getAppInstanceId(n0 n0Var);

    void getCachedAppInstanceId(n0 n0Var);

    void getConditionalUserProperties(String str, String str2, n0 n0Var);

    void getCurrentScreenClass(n0 n0Var);

    void getCurrentScreenName(n0 n0Var);

    void getGmpAppId(n0 n0Var);

    void getMaxUserProperties(String str, n0 n0Var);

    void getSessionId(n0 n0Var);

    void getTestFlag(n0 n0Var, int i6);

    void getUserProperties(String str, String str2, boolean z10, n0 n0Var);

    void initForTests(Map map);

    void initialize(d9.a aVar, v0 v0Var, long j);

    void isDataCollectionEnabled(n0 n0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, n0 n0Var, long j);

    void logHealthData(int i6, String str, d9.a aVar, d9.a aVar2, d9.a aVar3);

    void onActivityCreated(d9.a aVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(x0 x0Var, Bundle bundle, long j);

    void onActivityDestroyed(d9.a aVar, long j);

    void onActivityDestroyedByScionActivityInfo(x0 x0Var, long j);

    void onActivityPaused(d9.a aVar, long j);

    void onActivityPausedByScionActivityInfo(x0 x0Var, long j);

    void onActivityResumed(d9.a aVar, long j);

    void onActivityResumedByScionActivityInfo(x0 x0Var, long j);

    void onActivitySaveInstanceState(d9.a aVar, n0 n0Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(x0 x0Var, n0 n0Var, long j);

    void onActivityStarted(d9.a aVar, long j);

    void onActivityStartedByScionActivityInfo(x0 x0Var, long j);

    void onActivityStopped(d9.a aVar, long j);

    void onActivityStoppedByScionActivityInfo(x0 x0Var, long j);

    void performAction(Bundle bundle, n0 n0Var, long j);

    void registerOnMeasurementEventListener(s0 s0Var);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(p0 p0Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(d9.a aVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(x0 x0Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(s0 s0Var);

    void setInstanceIdProvider(u0 u0Var);

    void setMeasurementEnabled(boolean z10, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, d9.a aVar, boolean z10, long j);

    void unregisterOnMeasurementEventListener(s0 s0Var);
}
