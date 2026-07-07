package com.bumptech.glide.manager;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f2420a;

    public m(t tVar) {
        this.f2420a = tVar;
    }

    @Override // com.bumptech.glide.manager.a
    public final void a(boolean z2) {
        ArrayList arrayList;
        v6.m.a();
        synchronized (this.f2420a) {
            arrayList = new ArrayList((HashSet) this.f2420a.f2439y);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((a) obj).a(z2);
        }
    }
}
