package ue;

import ac.t;
import ce.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import me.q1;
import od.l;
import re.r;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements me.f, q1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final me.h f12982v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f12983w;

    public b(c cVar, me.h hVar) {
        this.f12983w = cVar;
        this.f12982v = hVar;
    }

    @Override // me.q1
    public final void a(r rVar, int i) {
        this.f12982v.a(rVar, i);
    }

    @Override // me.f
    public final void e(Object obj, q qVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.C;
        c cVar = this.f12983w;
        atomicReferenceFieldUpdater.set(cVar, null);
        t tVar = new t(cVar, this);
        me.h hVar = this.f12982v;
        hVar.D(l.f10126a, hVar.f8686x, new me.g(0, tVar));
    }

    @Override // sd.c
    public final sd.h f() {
        return this.f12982v.f8697z;
    }

    @Override // sd.c
    public final void g(Object obj) {
        this.f12982v.g(obj);
    }

    @Override // me.f
    public final re.t k(Object obj, q qVar) {
        c cVar = this.f12983w;
        me.g gVar = new me.g(cVar, this);
        re.t tVarK = this.f12982v.k((l) obj, gVar);
        if (tVarK != null) {
            c.C.set(cVar, null);
        }
        return tVarK;
    }

    @Override // me.f
    public final void n(Object obj) {
        this.f12982v.n(obj);
    }
}
