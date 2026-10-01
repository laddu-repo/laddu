package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ji {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hi f2805e;
    public static final ii f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi f2808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ii f2809d;

    static {
        int i = 0;
        f2805e = new hi(i);
        f = new ii(i);
    }

    public ji(ji jiVar) {
        HashMap map = new HashMap();
        this.f2806a = map;
        HashMap map2 = new HashMap();
        this.f2807b = map2;
        map.putAll(jiVar.f2806a);
        map2.putAll(jiVar.f2807b);
        this.f2808c = jiVar.f2808c;
        this.f2809d = jiVar.f2809d;
    }

    public void a(sh shVar, Object obj, ei eiVar) {
        hi hiVar = (hi) this.f2806a.get(shVar);
        if (hiVar != null) {
            hiVar.a(shVar, obj, eiVar);
        } else {
            this.f2808c.a(shVar, obj, eiVar);
        }
    }

    public void b(sh shVar, Iterator it, ei eiVar) {
        ii iiVar = (ii) this.f2807b.get(shVar);
        if (iiVar != null) {
            iiVar.a(shVar, it, eiVar);
            return;
        }
        ii iiVar2 = this.f2809d;
        if (iiVar2 != null && !this.f2806a.containsKey(shVar)) {
            iiVar2.a(shVar, it, eiVar);
        } else {
            while (it.hasNext()) {
                a(shVar, it.next(), eiVar);
            }
        }
    }

    public /* synthetic */ ji() {
        hi hiVar = h.f2673e;
        this.f2806a = new HashMap();
        this.f2807b = new HashMap();
        this.f2809d = null;
        this.f2808c = hiVar;
    }
}
