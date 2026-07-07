package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class dh extends wh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ch f2584d = new ch(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f2585c = new AtomicLong(2147483647L);

    @Override // com.google.android.gms.internal.measurement.wh
    public final void a() {
        this.f2585c.set(0L);
    }
}
