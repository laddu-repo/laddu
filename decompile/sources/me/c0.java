package me;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends re.q {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8681z = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // re.q, me.d1
    public final void j(Object obj) {
        o(obj);
    }

    @Override // re.q, me.d1
    public final void o(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f8681z;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                re.a.h(x.m(obj), t1.h(this.f11398y));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
