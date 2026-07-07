package me;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements h0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ScheduledFuture f8695v;

    public g0(ScheduledFuture scheduledFuture) {
        this.f8695v = scheduledFuture;
    }

    @Override // me.h0
    public final void b() {
        this.f8695v.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f8695v + ']';
    }
}
