package com.bumptech.glide.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u implements h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Set f2440v = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.h
    public final void c() {
        ArrayList arrayListE = v6.m.e(this.f2440v);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((s6.d) obj).c();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void k() {
        ArrayList arrayListE = v6.m.e(this.f2440v);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((s6.d) obj).k();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void l() {
        ArrayList arrayListE = v6.m.e(this.f2440v);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((s6.d) obj).l();
        }
    }
}
