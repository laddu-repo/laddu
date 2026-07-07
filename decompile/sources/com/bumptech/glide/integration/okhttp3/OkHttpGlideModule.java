package com.bumptech.glide.integration.okhttp3;

import com.bumptech.glide.k;
import g6.t;
import g6.v;
import java.util.ArrayList;
import java.util.HashMap;
import z5.b;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class OkHttpGlideModule {
    public final void a(k kVar) {
        b bVar = new b(0);
        v vVar = kVar.f2366a;
        synchronized (vVar) {
            ArrayList arrayListF = vVar.f5698a.f(bVar);
            int size = arrayListF.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListF.get(i);
                i++;
                ((t) obj).getClass();
            }
            ((HashMap) vVar.f5699b.f11492w).clear();
        }
    }
}
