package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class kg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kg f2832c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f2833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f2834b;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f2832c = new kg(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public kg(UUID uuid, long j8) {
        this.f2833a = uuid;
        this.f2834b = new AtomicLong((j8 ^ 25214903917L) & 281474976710655L);
    }

    public final long a() {
        AtomicLong atomicLong;
        long j8;
        long j9;
        long j10;
        do {
            atomicLong = this.f2834b;
            j8 = atomicLong.get();
            j9 = ((j8 * 25214903917L) + 11) & 281474976710655L;
            j10 = ((25214903917L * j9) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j8, j10));
        return (((long) ((int) (j9 >>> 16))) << 32) + ((long) ((int) (j10 >>> 16)));
    }

    public final UUID b() {
        long jA = a() & (-61441);
        long jA2 = a() >>> 2;
        UUID uuid = this.f2833a;
        return new UUID(jA ^ uuid.getMostSignificantBits(), jA2 ^ uuid.getLeastSignificantBits());
    }
}
