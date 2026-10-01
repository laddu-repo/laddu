package me;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8698c = AtomicIntegerFieldUpdater.newUpdater(i.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public i(h hVar, Throwable th, boolean z2) {
        if (th == null) {
            th = new CancellationException("Continuation " + hVar + " was cancelled normally");
        }
        super(th, z2);
        this._resumed$volatile = 0;
    }
}
