package com.google.android.gms.internal.measurement;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m4 extends h {
    public final Object A;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f2344z = 2;

    public m4(a2.a2 a2Var) {
        super("internal.logger");
        this.A = a2Var;
        this.f2240y.put("log", new u9(this, false, true));
        this.f2240y.put("silent", new z5("silent", 1));
        ((h) this.f2240y.get("silent")).c("log", new u9(this, true, true));
        this.f2240y.put("unmonitored", new z5("unmonitored", 2));
        ((h) this.f2240y.get("unmonitored")).c("log", new u9(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n i(ic.s sVar, List list) {
        HashMap hashMap;
        Object obj;
        String str;
        int i6;
        TreeMap treeMap;
        switch (this.f2344z) {
            case 0:
                a8.a.w(this.f2239x, 3, list);
                String f3 = ((t) sVar.f6782y).c(sVar, (n) list.get(0)).f();
                n nVar = (n) list.get(1);
                t tVar = (t) sVar.f6782y;
                long D = (long) a8.a.D(tVar.c(sVar, nVar).b().doubleValue());
                n c10 = tVar.c(sVar, (n) list.get(2));
                if (c10 instanceof k) {
                    hashMap = a8.a.F((k) c10);
                } else {
                    hashMap = new HashMap();
                }
                androidx.lifecycle.j1 j1Var = (androidx.lifecycle.j1) this.A;
                j1Var.getClass();
                HashMap hashMap2 = new HashMap();
                for (String str2 : hashMap.keySet()) {
                    HashMap hashMap3 = ((b) j1Var.f949y).f2153c;
                    if (hashMap3.containsKey(str2)) {
                        obj = hashMap3.get(str2);
                    } else {
                        obj = null;
                    }
                    hashMap2.put(str2, b.b(obj, hashMap.get(str2), str2));
                }
                ((ArrayList) j1Var.A).add(new b(f3, D, hashMap2));
                return n.f2352a;
            case 1:
                a8.a.w("getValue", 2, list);
                n c11 = ((t) sVar.f6782y).c(sVar, (n) list.get(0));
                n c12 = ((t) sVar.f6782y).c(sVar, (n) list.get(1));
                String f10 = c11.f();
                j1.f0 f0Var = (j1.f0) this.A;
                Map map = (Map) ((n9.h1) f0Var.f6908z).B.get((String) f0Var.f6907y);
                if (map != null && map.containsKey(f10)) {
                    str = (String) map.get(f10);
                } else {
                    str = null;
                }
                if (str != null) {
                    return new q(str);
                }
                return c12;
            case 2:
                return n.f2352a;
            case 3:
                try {
                    return a8.b.p(((n9.f1) this.A).call());
                } catch (Exception unused) {
                    return n.f2352a;
                }
            default:
                a8.a.w(this.f2239x, 3, list);
                ((t) sVar.f6782y).c(sVar, (n) list.get(0)).f();
                n nVar2 = (n) list.get(1);
                t tVar2 = (t) sVar.f6782y;
                n c13 = tVar2.c(sVar, nVar2);
                if (c13 instanceof m) {
                    n c14 = tVar2.c(sVar, (n) list.get(2));
                    if (c14 instanceof k) {
                        k kVar = (k) c14;
                        HashMap hashMap4 = kVar.f2315x;
                        if (hashMap4.containsKey(HandleInvocationsFromAdViewer.KEY_AD_TYPE)) {
                            String f11 = kVar.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE).f();
                            if (hashMap4.containsKey(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY)) {
                                i6 = a8.a.C(kVar.a(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY).b().doubleValue());
                            } else {
                                i6 = UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
                            }
                            t tVar3 = (t) this.A;
                            m mVar = (m) c13;
                            tVar3.getClass();
                            if ("create".equals(f11)) {
                                treeMap = (TreeMap) tVar3.f2426b;
                            } else if ("edit".equals(f11)) {
                                treeMap = (TreeMap) tVar3.f2425a;
                            } else {
                                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(f11)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(i6))) {
                                i6 = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(i6), mVar);
                            return n.f2352a;
                        }
                        throw new IllegalArgumentException("Undefined rule type");
                    }
                    throw new IllegalArgumentException("Invalid callback params");
                }
                throw new IllegalArgumentException("Invalid callback type");
        }
    }

    public m4(androidx.lifecycle.j1 j1Var) {
        super("internal.eventLogger");
        this.A = j1Var;
    }

    public m4(t tVar) {
        super("internal.registerCallback");
        this.A = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(z5 z5Var, j1.f0 f0Var) {
        super("getValue");
        this.A = f0Var;
    }

    public m4(n9.f1 f1Var) {
        super("internal.appMetadata");
        this.A = f1Var;
    }
}
