package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3291a = 0;

    static {
        Math.abs(new Random().nextInt());
        new HashMap();
    }

    public static final f6 a(da.a0 a0Var) {
        de.i.e(a0Var, "asyncCallable");
        xg xgVarB = jg.b();
        Object objI = xgVarB.f3233b;
        if (objI == null || objI == qg.B) {
            objI = og.i(xgVarB);
        }
        return new f6(8, objI, a0Var);
    }

    public static final be b(da.b0 b0Var) {
        xg xgVarB = jg.b();
        Object objI = xgVarB.f3233b;
        if (objI == null || objI == qg.B) {
            objI = og.i(xgVarB);
        }
        return new be(4, objI, b0Var);
    }
}
