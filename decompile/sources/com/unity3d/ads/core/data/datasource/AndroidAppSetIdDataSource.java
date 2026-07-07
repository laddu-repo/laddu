package com.unity3d.ads.core.data.datasource;

import a2.e0;
import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.Task;
import kf.f1;
import kf.r0;
import kf.y0;
import kotlin.jvm.internal.k;
import s9.i;
import s9.n;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidAppSetIdDataSource {
    private final r0 _appSetIdFlow;
    private final Context applicationContext;
    private final r0 isCollecting;

    public AndroidAppSetIdDataSource(Context applicationContext) {
        k.e(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
        this.isCollecting = y0.c(Boolean.FALSE);
        this._appSetIdFlow = y0.c(null);
    }

    public static /* synthetic */ void a(l lVar, Object obj) {
        invoke$lambda$1(lVar, obj);
    }

    public static final void invoke$lambda$1(l tmp0, Object obj) {
        k.e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final String getAppSetId() {
        return (String) ((f1) this._appSetIdFlow).getValue();
    }

    public final void invoke() {
        f1 f1Var;
        Object value;
        Boolean bool;
        r0 r0Var = this.isCollecting;
        do {
            f1Var = (f1) r0Var;
            value = f1Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!f1Var.f(value, Boolean.TRUE));
        if (!bool.booleanValue()) {
            try {
                Task appSetIdInfo = AppSet.getClient(this.applicationContext).getAppSetIdInfo();
                e0 e0Var = new e0(new AndroidAppSetIdDataSource$invoke$2(this), 14);
                n nVar = (n) appSetIdInfo;
                nVar.getClass();
                nVar.c(i.f12264a, e0Var);
            } catch (Throwable unused) {
            }
        }
    }
}
