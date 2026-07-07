package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class xh extends wh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ch f3234d = new ch(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b8.j f3235e = new b8.j(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f3236c = new AtomicInteger();

    @Override // com.google.android.gms.internal.measurement.wh
    public final void a() {
        this.f3236c.decrementAndGet();
    }
}
