package com.google.android.gms.internal.measurement;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pb implements x9.m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2986v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2987w;

    public /* synthetic */ pb(int i, Object obj) {
        this.f2986v = i;
        this.f2987w = obj;
    }

    @Override // x9.m
    public final Object get() {
        int i = this.f2986v;
        Object obj = this.f2987w;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Object obj2 = nb.f2919j;
                return new ye((ArrayList) obj);
            default:
                qe qeVar = (qe) obj;
                da.v0 v0Var = (da.v0) qeVar.f3028c.get();
                v0Var.getClass();
                hc hcVar = (hc) qeVar.f3027b.get();
                hcVar.getClass();
                ya yaVar = hcVar.f2692a;
                com.bumptech.glide.manager.t tVarB = com.bumptech.glide.manager.t.b();
                tVarB.f2438x = new p6(8, yaVar);
                tVarB.f2439y = new q7.d[]{h.f2671c};
                tVarB.f2437w = false;
                da.a aVarB = hc.b(yaVar.b(0, tVarB.a()));
                c3 c3Var = c3.f2529z;
                int i10 = da.c.G;
                da.b bVar = new da.b(aVarB, fc.class, c3Var);
                aVarB.f(bVar, va.t1.l(v0Var, bVar));
                rd rdVar = new rd(2, qeVar);
                int i11 = da.w.F;
                da.v vVar = new da.v(bVar, rdVar);
                bVar.f(vVar, va.t1.l(v0Var, vVar));
                vVar.f(new zd(4, vVar), v0Var);
                return vVar;
        }
    }
}
