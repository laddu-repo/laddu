package qb;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements yb.c, yb.b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11171a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f11172b;

    /* renamed from: c, reason: collision with root package name */
    public final rb.k f11173c;

    public j() {
        rb.k kVar = rb.k.f11948x;
        this.f11171a = new HashMap();
        this.f11172b = new ArrayDeque();
        this.f11173c = kVar;
    }

    public final synchronized void a(Executor executor, yb.a aVar) {
        try {
            executor.getClass();
            if (!this.f11171a.containsKey(jb.b.class)) {
                this.f11171a.put(jb.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f11171a.get(jb.b.class)).put(aVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
