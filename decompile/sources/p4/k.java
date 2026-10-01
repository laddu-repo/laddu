package p4;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f10320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f10321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f10322d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f10319a = new ReentrantLock();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReentrantLock f10323e = new ReentrantLock();

    public k(int i) {
        this.f10320b = new long[i];
        this.f10321c = new boolean[i];
    }
}
