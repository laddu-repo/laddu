package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class lc implements Closeable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Inflater f2857v = new Inflater(true);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2857v.end();
    }
}
