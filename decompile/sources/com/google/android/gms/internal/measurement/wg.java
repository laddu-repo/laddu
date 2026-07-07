package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wg f3208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f3209d = new HashMap(0);

    public wg(int i, int i10) {
        if (i > i10) {
            throw new IllegalArgumentException();
        }
        this.f3206a = i;
        this.f3207b = i10;
        this.f3208c = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        return u5.a.b(iIdentityHashCode, "Node", new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4));
    }
}
