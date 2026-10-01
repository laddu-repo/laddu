package rg;

import b4.h;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final qg.b f11954e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final h f11955a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f11956b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f11957c;

    /* renamed from: d, reason: collision with root package name */
    public final tg.a f11958d;

    public b(h hVar) {
        this.f11955a = hVar;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        k.d(newSetFromMap, "newSetFromMap(...)");
        this.f11956b = newSetFromMap;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f11957c = concurrentHashMap;
        qg.b bVar = f11954e;
        tg.a aVar = new tg.a(bVar, "_root_", null, hVar, 8);
        this.f11958d = aVar;
        newSetFromMap.add(bVar);
        concurrentHashMap.put("_root_", aVar);
    }
}
