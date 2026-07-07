package com.google.android.gms.internal.measurement;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class rg implements Runnable, Closeable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public yg f3061v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f3062w = eh.d(Thread.currentThread());

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3063x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f3064y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f3065z;

    public rg(yg ygVar, boolean z2) {
        this.f3065z = false;
        this.f3061v = ygVar;
        this.f3065z = z2;
    }

    public final void a(da.k kVar) {
        if (this.f3063x) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.f3064y) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.f3064y = true;
        kVar.f(this, da.f0.f4407v);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        yg ygVar = this.f3061v;
        try {
            this.f3061v = null;
            boolean z2 = this.f3064y;
            if (!z2) {
                if (this.f3063x) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.f3063x = true;
                if (this.f3062w && !z2) {
                    eh.d(Thread.currentThread());
                }
            }
            if (ygVar != null) {
                ((dg) ygVar).close();
            }
            if (this.f3065z) {
                jg.a(jg.b(), qg.B);
            }
        } catch (Throwable th) {
            if (ygVar != null) {
                try {
                    ((dg) ygVar).close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        if (this.f3063x || !(z2 = this.f3064y)) {
            eh.e().post(ae.f2481x);
            return;
        }
        this.f3063x = true;
        if (!this.f3062w || z2) {
            return;
        }
        eh.d(Thread.currentThread());
    }
}
