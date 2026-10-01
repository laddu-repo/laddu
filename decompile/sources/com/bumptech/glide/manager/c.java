package com.bumptech.glide.manager;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f2408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.bumptech.glide.n f2409w;

    public c(Context context, com.bumptech.glide.n nVar) {
        this.f2408v = context.getApplicationContext();
        this.f2409w = nVar;
    }

    @Override // com.bumptech.glide.manager.h
    public final void c() {
        t tVarD = t.d(this.f2408v);
        com.bumptech.glide.n nVar = this.f2409w;
        synchronized (tVarD) {
            ((HashSet) tVarD.f2439y).remove(nVar);
            if (tVarD.f2437w && ((HashSet) tVarD.f2439y).isEmpty()) {
                ((n) tVarD.f2438x).a();
                tVarD.f2437w = false;
            }
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void k() {
        t tVarD = t.d(this.f2408v);
        com.bumptech.glide.n nVar = this.f2409w;
        synchronized (tVarD) {
            ((HashSet) tVarD.f2439y).add(nVar);
            if (!tVarD.f2437w && !((HashSet) tVarD.f2439y).isEmpty()) {
                tVarD.f2437w = ((n) tVarD.f2438x).b();
            }
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void l() {
    }
}
