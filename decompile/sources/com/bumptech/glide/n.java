package com.bumptech.glide;

import com.bumptech.glide.manager.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements com.bumptech.glide.manager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f2441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f2442b;

    public n(o oVar, t tVar) {
        this.f2442b = oVar;
        this.f2441a = tVar;
    }

    @Override // com.bumptech.glide.manager.a
    public final void a(boolean z2) {
        if (z2) {
            synchronized (this.f2442b) {
                t tVar = this.f2441a;
                ArrayList arrayListE = v6.m.e((Set) tVar.f2438x);
                int size = arrayListE.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListE.get(i);
                    i++;
                    r6.c cVar = (r6.c) obj;
                    if (!cVar.j() && !cVar.b()) {
                        cVar.clear();
                        if (tVar.f2437w) {
                            ((HashSet) tVar.f2439y).add(cVar);
                        } else {
                            cVar.g();
                        }
                    }
                }
            }
        }
    }
}
