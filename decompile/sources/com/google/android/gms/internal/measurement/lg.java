package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class lg extends n4 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p6 f2868x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HashMap f2869y;

    public lg(p6 p6Var) {
        super("require");
        this.f2869y = new HashMap();
        this.f2868x = p6Var;
    }

    @Override // com.google.android.gms.internal.measurement.n4
    public final z5 h(z7 z7Var, List list) {
        z5 z5Var;
        jb.f("require", 1, list);
        String strE = ((f6) z7Var.f3283x).f(z7Var, (z5) list.get(0)).e();
        HashMap map = this.f2869y;
        if (map.containsKey(strE)) {
            return (z5) map.get(strE);
        }
        HashMap map2 = (HashMap) this.f2868x.f2983w;
        if (map2.containsKey(strE)) {
            try {
                z5Var = (z5) ((Callable) map2.get(strE)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strE)));
            }
        } else {
            z5Var = z5.f3274a;
        }
        if (z5Var instanceof n4) {
            map.put(strE, (n4) z5Var);
        }
        return z5Var;
    }
}
