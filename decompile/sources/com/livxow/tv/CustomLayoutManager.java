package com.livxow.tv;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import fc.d;
import hc.h;
import o4.j0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class CustomLayoutManager extends GridLayoutManager {
    public CustomLayoutManager(h hVar) {
        super(3);
        this.K = new d(hVar);
    }

    @Override // o4.j0
    public final void Y(View view, int i) {
        try {
            int iG = j0.G(view);
            int iB = B();
            int i10 = this.F + iG;
            if (i != 130 || iG < 0 || i10 >= iB) {
                return;
            }
            r0(i10);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }
}
