package com.unity3d.ads.core.data.datasource;

import androidx.lifecycle.d0;
import androidx.lifecycle.w;
import gf.f0;
import kf.d1;
import kf.f1;
import kf.r0;
import kf.t0;
import kf.y0;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidLifecycleDataSource implements LifecycleDataSource, d0 {
    private final r0 _appActive;
    private final d1 appActive;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidLifecycleDataSource() {
        f1 c10 = y0.c(Boolean.TRUE);
        this._appActive = c10;
        this.appActive = new t0(c10);
        registerAppLifecycle();
    }

    private final void registerAppLifecycle() {
        f0.w(f0.d(), null, new AndroidLifecycleDataSource$registerAppLifecycle$1(this, null), 3);
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public boolean appIsForeground() {
        return ((Boolean) getAppActive().getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public d1 getAppActive() {
        return this.appActive;
    }

    @Override // androidx.lifecycle.d0
    public void onStateChanged(androidx.lifecycle.f0 source, w event) {
        k.e(source, "source");
        k.e(event, "event");
        r0 r0Var = this._appActive;
        int i6 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        boolean z10 = true;
        if (i6 != 1) {
            if (i6 != 2) {
                z10 = ((Boolean) getAppActive().getValue()).booleanValue();
            }
        } else {
            z10 = false;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        f1 f1Var = (f1) r0Var;
        f1Var.getClass();
        f1Var.h(null, valueOf);
    }
}
