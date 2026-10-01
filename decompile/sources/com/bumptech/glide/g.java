package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.manager.t;
import java.util.List;
import k8.a0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f2352k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d6.f f2353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q7.h f2354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f2355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kb.e f2356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f2357e;
    public final v.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c6.m f2358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a9.g f2359h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r6.g f2360j;

    static {
        a aVar = new a();
        aVar.f2341v = t6.b.f12306a;
        f2352k = aVar;
    }

    public g(Context context, d6.f fVar, t tVar, a0 a0Var, kb.e eVar, v.e eVar2, List list, c6.m mVar, a9.g gVar) {
        super(context.getApplicationContext());
        this.f2353a = fVar;
        this.f2355c = a0Var;
        this.f2356d = eVar;
        this.f2357e = list;
        this.f = eVar2;
        this.f2358g = mVar;
        this.f2359h = gVar;
        this.i = 4;
        this.f2354b = new q7.h(tVar);
    }

    public final synchronized r6.g a() {
        try {
            if (this.f2360j == null) {
                this.f2356d.getClass();
                r6.g gVar = new r6.g();
                gVar.H = true;
                this.f2360j = gVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2360j;
    }

    public final k b() {
        return (k) this.f2354b.get();
    }
}
