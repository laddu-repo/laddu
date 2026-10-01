package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class mf implements xe {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2899v;

    static {
        new AtomicInteger();
    }

    @Override // com.google.android.gms.internal.measurement.xe
    public final Object a(we weVar) throws IOException {
        if (this.f2899v) {
            if (weVar.f3202b.isEmpty()) {
                return weVar.f3201a.g(weVar.f3204d);
            }
            throw new a6.c("Short circuit would skip transforms.");
        }
        Closeable closeableH = e1.h(weVar);
        try {
            if (!(closeableH instanceof ef)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileA = ((ef) closeableH).a();
            if (closeableH != null) {
                closeableH.close();
            }
            return fileA;
        } catch (Throwable th) {
            if (closeableH != null) {
                try {
                    closeableH.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
