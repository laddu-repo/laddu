package com.bumptech.glide.manager;

import androidx.lifecycle.z;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements g, androidx.lifecycle.r {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashSet f2406v = new HashSet();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final androidx.lifecycle.u f2407w;

    public LifecycleLifecycle(androidx.lifecycle.u uVar) {
        this.f2407w = uVar;
        uVar.a(this);
    }

    @Override // com.bumptech.glide.manager.g
    public final void j(h hVar) {
        this.f2406v.add(hVar);
        androidx.lifecycle.n nVar = this.f2407w.f1238c;
        if (nVar == androidx.lifecycle.n.f1217v) {
            hVar.l();
        } else if (nVar.compareTo(androidx.lifecycle.n.f1220y) >= 0) {
            hVar.k();
        } else {
            hVar.c();
        }
    }

    @Override // com.bumptech.glide.manager.g
    public final void l(h hVar) {
        this.f2406v.remove(hVar);
    }

    @z(androidx.lifecycle.m.ON_DESTROY)
    public void onDestroy(androidx.lifecycle.s sVar) {
        ArrayList arrayListE = v6.m.e(this.f2406v);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((h) obj).l();
        }
        sVar.f().f(this);
    }

    @z(androidx.lifecycle.m.ON_START)
    public void onStart(androidx.lifecycle.s sVar) {
        ArrayList arrayListE = v6.m.e(this.f2406v);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((h) obj).k();
        }
    }

    @z(androidx.lifecycle.m.ON_STOP)
    public void onStop(androidx.lifecycle.s sVar) {
        ArrayList arrayListE = v6.m.e(this.f2406v);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((h) obj).c();
        }
    }
}
