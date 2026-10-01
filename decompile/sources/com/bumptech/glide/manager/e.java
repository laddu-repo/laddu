package com.bumptech.glide.manager;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile boolean f2412v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f2413w;

    public e(int i) {
        switch (i) {
            case 1:
                this.f2413w = new Object();
                break;
            default:
                this.f2413w = Collections.newSetFromMap(new WeakHashMap());
                break;
        }
    }

    @Override // com.bumptech.glide.manager.f
    public void b(h.j jVar) {
        if (!this.f2412v && ((Set) this.f2413w).add(jVar)) {
            View decorView = jVar.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new d(this, decorView));
        }
    }
}
