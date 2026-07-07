package com.unity3d.services.core.domain.task;

import android.app.Application;
import com.unity3d.services.core.api.Lifecycle;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.properties.ClientProperties;
import kotlin.jvm.internal.k;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class InitializeStateReset extends MetricTask<Params, Configuration> {
    private final ISDKDispatchers dispatchers;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Params implements BaseParams {
        private final Configuration config;

        public Params(Configuration config) {
            k.e(config, "config");
            this.config = config;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final Params copy(Configuration config) {
            k.e(config, "config");
            return new Params(config);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Params) && k.a(this.config, ((Params) obj).config)) {
                return true;
            }
            return false;
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        public String toString() {
            return "Params(config=" + this.config + ')';
        }
    }

    public InitializeStateReset(ISDKDispatchers dispatchers) {
        k.e(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: doWork-gIAlu-s$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m86doWorkgIAlus$suspendImpl(com.unity3d.services.core.domain.task.InitializeStateReset r4, com.unity3d.services.core.domain.task.InitializeStateReset.Params r5, le.c r6) {
        /*
            boolean r0 = r6 instanceof com.unity3d.services.core.domain.task.InitializeStateReset$doWork$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.services.core.domain.task.InitializeStateReset$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateReset$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeStateReset$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateReset$doWork$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            he.a.f(r6)
            goto L47
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            he.a.f(r6)
            com.unity3d.services.core.domain.ISDKDispatchers r6 = r4.dispatchers
            gf.y r6 = r6.getDefault()
            com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2 r1 = new com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2
            r3 = 0
            r1.<init>(r5, r4, r3)
            r0.label = r2
            java.lang.Object r6 = gf.f0.J(r6, r1, r0)
            me.a r4 = me.a.f8833x
            if (r6 != r4) goto L47
            return r4
        L47:
            he.k r6 = (he.k) r6
            java.lang.Object r4 = r6.f6079x
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateReset.m86doWorkgIAlus$suspendImpl(com.unity3d.services.core.domain.task.InitializeStateReset, com.unity3d.services.core.domain.task.InitializeStateReset$Params, le.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterLifecycleCallbacks() {
        if (Lifecycle.getLifecycleListener() != null) {
            Application application = ClientProperties.getApplication();
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(Lifecycle.getLifecycleListener());
            }
            Lifecycle.setLifecycleListener(null);
        }
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo70doWorkgIAlus(Params params, c cVar) {
        return m86doWorkgIAlus$suspendImpl(this, params, cVar);
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public String getMetricName() {
        return getMetricNameForInitializeTask("reset");
    }
}
