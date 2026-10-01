package mf;

import gf.c0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements c0 {

    /* renamed from: x, reason: collision with root package name */
    public final le.h f8858x;

    public e(le.h hVar) {
        this.f8858x = hVar;
    }

    @Override // gf.c0
    public final le.h getCoroutineContext() {
        return this.f8858x;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f8858x + ')';
    }
}
