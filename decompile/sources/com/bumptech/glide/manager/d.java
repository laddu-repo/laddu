package com.bumptech.glide.manager;

import android.view.View;
import android.view.ViewTreeObserver;
import da.m0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ View f2410v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f2411w;

    public d(e eVar, View view) {
        this.f2411w = eVar;
        this.f2410v = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        v6.m.f().post(new m0(this, this, false, 1));
    }
}
