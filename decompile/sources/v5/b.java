package v5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f13297a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f13298b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));

    /* renamed from: c, reason: collision with root package name */
    public final v f13299c;

    /* renamed from: d, reason: collision with root package name */
    public final p.l f13300d;

    /* renamed from: e, reason: collision with root package name */
    public final w5.a f13301e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13302f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13303g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13304h;

    /* JADX WARN: Type inference failed for: r6v14, types: [v5.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, p.l] */
    public b(ob.a aVar) {
        String str = w.f13337a;
        this.f13299c = new Object();
        this.f13300d = new Object();
        this.f13301e = new w5.a(0);
        this.f13302f = 4;
        this.f13303g = Integer.MAX_VALUE;
        this.f13304h = 20;
    }
}
