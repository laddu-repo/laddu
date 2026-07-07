package x4;

import gf.n1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final w f14578a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f14579b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f14580c;

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f14581d;

    /* renamed from: e, reason: collision with root package name */
    public final d.a0 f14582e;

    /* renamed from: f, reason: collision with root package name */
    public final d.a0 f14583f;

    /* renamed from: g, reason: collision with root package name */
    public final s8.l f14584g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f14585h;

    public i(w wVar, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.f14578a = wVar;
        p0 p0Var = new p0(wVar, hashMap, hashMap2, strArr, wVar.f14670k, new n1(1, this, i.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 4));
        this.f14579b = p0Var;
        this.f14580c = new LinkedHashMap();
        this.f14581d = new ReentrantLock();
        int i6 = 20;
        this.f14582e = new d.a0(this, i6);
        this.f14583f = new d.a0(this, i6);
        this.f14584g = new s8.l(wVar);
        this.f14585h = new Object();
        p0Var.f14629k = new androidx.lifecycle.i(this, 24);
    }
}
