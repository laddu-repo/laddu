package com.bumptech.glide.manager;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.u f2414v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sc.b f2415w;

    public i(sc.b bVar, androidx.lifecycle.u uVar) {
        this.f2415w = bVar;
        this.f2414v = uVar;
    }

    @Override // com.bumptech.glide.manager.h
    public final void l() {
        ((HashMap) this.f2415w.f11786w).remove(this.f2414v);
    }

    @Override // com.bumptech.glide.manager.h
    public final void c() {
    }

    @Override // com.bumptech.glide.manager.h
    public final void k() {
    }
}
