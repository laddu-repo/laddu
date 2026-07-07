package ue;

import java.util.concurrent.atomic.AtomicReferenceArray;
import re.r;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f12995e;

    public j(long j8, j jVar, int i) {
        super(j8, jVar, i);
        this.f12995e = new AtomicReferenceArray(i.f);
    }

    @Override // re.r
    public final int f() {
        return i.f;
    }

    @Override // re.r
    public final void g(int i, sd.h hVar) {
        this.f12995e.set(i, i.f12994e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f11400c + ", hashCode=" + hashCode() + ']';
    }
}
