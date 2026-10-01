package com.google.android.gms.internal.measurement;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2831b;

    public ke(int i) {
        this.f2830a = 2;
        this.f2831b = i;
    }

    public int a() {
        int i = this.f2831b;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public void b(o4.z0 z0Var) {
        View view = z0Var.f9910a;
        this.f2830a = view.getLeft();
        this.f2831b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public /* synthetic */ ke(int i, int i10) {
        this.f2830a = i;
        this.f2831b = i10;
    }
}
