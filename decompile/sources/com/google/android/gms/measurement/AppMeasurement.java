package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.v0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l9.a;
import l9.b;
import l9.c;
import n9.a2;
import n9.n1;
import n9.n2;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f2552b;

    /* renamed from: a, reason: collision with root package name */
    public final c f2553a;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;
    }

    public AppMeasurement(n1 n1Var) {
        this.f2553a = new a(n1Var);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f2552b == null) {
            synchronized (AppMeasurement.class) {
                if (f2552b == null) {
                    n2 n2Var = (n2) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (n2Var != null) {
                        f2552b = new AppMeasurement(n2Var);
                    } else {
                        f2552b = new AppMeasurement(n1.m(context, new v0(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return f2552b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f2553a.h(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f2553a.j(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f2553a.g(str);
    }

    @Keep
    public long generateEventId() {
        return this.f2553a.i();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f2553a.m();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty, java.lang.Object] */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int size;
        List<Bundle> k8 = this.f2553a.k(str, str2);
        if (k8 == null) {
            size = 0;
        } else {
            size = k8.size();
        }
        ArrayList arrayList = new ArrayList(size);
        for (Bundle bundle : k8) {
            ?? obj = new Object();
            x.g(bundle);
            obj.mAppId = (String) a2.e(bundle, "app_id", String.class, null);
            obj.mOrigin = (String) a2.e(bundle, "origin", String.class, null);
            obj.mName = (String) a2.e(bundle, MediationMetaData.KEY_NAME, String.class, null);
            obj.mValue = a2.e(bundle, "value", Object.class, null);
            obj.mTriggerEventName = (String) a2.e(bundle, "trigger_event_name", String.class, null);
            obj.mTriggerTimeout = ((Long) a2.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            obj.mTimedOutEventName = (String) a2.e(bundle, "timed_out_event_name", String.class, null);
            obj.mTimedOutEventParams = (Bundle) a2.e(bundle, "timed_out_event_params", Bundle.class, null);
            obj.mTriggeredEventName = (String) a2.e(bundle, "triggered_event_name", String.class, null);
            obj.mTriggeredEventParams = (Bundle) a2.e(bundle, "triggered_event_params", Bundle.class, null);
            obj.mTimeToLive = ((Long) a2.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            obj.mExpiredEventName = (String) a2.e(bundle, "expired_event_name", String.class, null);
            obj.mExpiredEventParams = (Bundle) a2.e(bundle, "expired_event_params", Bundle.class, null);
            obj.mActive = ((Boolean) a2.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.mCreationTimestamp = ((Long) a2.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            obj.mTriggeredTimestamp = ((Long) a2.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f2553a.e();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f2553a.d();
    }

    @Keep
    public String getGmpAppId() {
        return this.f2553a.n();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f2553a.l(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f2553a.o(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f2553a.c(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        x.g(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString(MediationMetaData.KEY_NAME, str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            a2.c(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f2553a.f(bundle);
    }

    public AppMeasurement(n2 n2Var) {
        this.f2553a = new b(n2Var);
    }
}
