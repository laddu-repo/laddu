package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final va.t1 f2520a;

    static {
        ah ahVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            ahVar = new ah(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            ahVar = new ah(1);
        }
        f2520a = ahVar;
    }
}
