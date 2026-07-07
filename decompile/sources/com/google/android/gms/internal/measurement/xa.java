package com.google.android.gms.internal.measurement;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class xa extends n4 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3229x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f3230y;

    public xa(a7.j jVar) {
        super("internal.eventLogger");
        this.f3230y = jVar;
    }

    @Override // com.google.android.gms.internal.measurement.n4
    public final z5 h(z7 z7Var, List list) {
        TreeMap treeMap;
        switch (this.f3229x) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                jb.f(this.f2910v, 3, list);
                String strE = ((f6) z7Var.f3283x).f(z7Var, (z5) list.get(0)).e();
                z5 z5Var = (z5) list.get(1);
                f6 f6Var = (f6) z7Var.f3283x;
                long jS = (long) jb.s(f6Var.f(z7Var, z5Var).d().doubleValue());
                z5 z5VarF = f6Var.f(z7Var, (z5) list.get(2));
                HashMap mapU = z5VarF instanceof w5 ? jb.u((w5) z5VarF) : new HashMap();
                a7.j jVar = (a7.j) this.f3230y;
                jVar.getClass();
                HashMap map = new HashMap();
                for (String str : mapU.keySet()) {
                    HashMap map2 = ((b) jVar.f202w).f2496c;
                    map.put(str, b.b(map2.containsKey(str) ? map2.get(str) : null, mapU.get(str), str));
                }
                ((ArrayList) jVar.f204y).add(new b(strE, jS, map));
                return z5.f3274a;
            case 1:
                jb.f("getValue", 2, list);
                z5 z5VarF2 = ((f6) z7Var.f3283x).f(z7Var, (z5) list.get(0));
                z5 z5VarF3 = ((f6) z7Var.f3283x).f(z7Var, (z5) list.get(1));
                String strE2 = z5VarF2.e();
                k8.k2 k2Var = (k8.k2) this.f3230y;
                Map map3 = (Map) ((k8.j1) k2Var.f7603x).f7588z.get((String) k2Var.f7602w);
                String str2 = (map3 == null || !map3.containsKey(strE2)) ? null : (String) map3.get(strE2);
                return str2 != null ? new c6(str2) : z5VarF3;
            case 2:
                return z5.f3274a;
            case 3:
                try {
                    return eh.a(((k8.h1) this.f3230y).call());
                } catch (Exception unused) {
                    return z5.f3274a;
                }
            default:
                jb.f(this.f2910v, 3, list);
                ((f6) z7Var.f3283x).f(z7Var, (z5) list.get(0)).e();
                z5 z5Var2 = (z5) list.get(1);
                f6 f6Var2 = (f6) z7Var.f3283x;
                z5 z5VarF4 = f6Var2.f(z7Var, z5Var2);
                if (!(z5VarF4 instanceof y5)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                z5 z5VarF5 = f6Var2.f(z7Var, (z5) list.get(2));
                if (!(z5VarF5 instanceof w5)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                w5 w5Var = (w5) z5VarF5;
                HashMap map4 = w5Var.f3192v;
                if (!map4.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strE3 = w5Var.c("type").e();
                int iR = map4.containsKey("priority") ? jb.r(w5Var.c("priority").d().doubleValue()) : 1000;
                f6 f6Var3 = (f6) this.f3230y;
                y5 y5Var = (y5) z5VarF4;
                f6Var3.getClass();
                if ("create".equals(strE3)) {
                    treeMap = (TreeMap) f6Var3.f2639x;
                } else {
                    if (!"edit".equals(strE3)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strE3)));
                    }
                    treeMap = (TreeMap) f6Var3.f2638w;
                }
                if (treeMap.containsKey(Integer.valueOf(iR))) {
                    iR = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iR), y5Var);
                return z5.f3274a;
        }
    }

    public xa(f6 f6Var) {
        super("internal.registerCallback");
        this.f3230y = f6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(pc pcVar, k8.k2 k2Var) {
        super("getValue");
        this.f3230y = k2Var;
    }

    public xa(k8.h1 h1Var) {
        super("internal.appMetadata");
        this.f3230y = h1Var;
    }

    public xa(s5.c cVar) {
        super("internal.logger");
        this.f3230y = cVar;
        this.f2911w.put("log", new bf(this, false, true));
        this.f2911w.put("silent", new pc(1, "silent"));
        ((n4) this.f2911w.get("silent")).i("log", new bf(this, true, true));
        this.f2911w.put("unmonitored", new pc(2, "unmonitored"));
        ((n4) this.f2911w.get("unmonitored")).i("log", new bf(this, false, false));
    }
}
