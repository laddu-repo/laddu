package p1;

import gf.c0;
import gf.f0;
import kotlin.jvm.internal.k;
import le.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements AutoCloseable, c0 {

    /* renamed from: x, reason: collision with root package name */
    public final h f10451x;

    public a(h coroutineContext) {
        k.e(coroutineContext, "coroutineContext");
        this.f10451x = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        f0.h(this.f10451x, null);
    }

    @Override // gf.c0
    public final h getCoroutineContext() {
        return this.f10451x;
    }
}
