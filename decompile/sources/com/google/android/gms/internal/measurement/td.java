package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class td {
    public static final p6 i = new p6(13);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ld f3108j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile le f3109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nb f3110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3113e;
    public final y9.i0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p6 f3114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a7.j f3115h;

    static {
        c3 c3Var = c3.f2527x;
        int i10 = y9.i0.f14562x;
        f3108j = new ld(c3Var, false, y9.f1.E);
    }

    public td(nb nbVar, ld ldVar) {
        this.f3110b = nbVar;
        Context context = nbVar.f2924b;
        String str = ldVar.f2861d;
        if (str == null) {
            str = (String) ldVar.f2858a.apply(context);
            ldVar.f2861d = str;
        }
        this.f3111c = str;
        this.f3112d = "";
        this.f3113e = ldVar.f2859b;
        this.f = ldVar.f2860c;
        this.f3109a = null;
        this.f3114g = new p6(14);
        this.f3115h = new a7.j(nbVar, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x0013, B:13:0x0026, B:15:0x0031, B:17:0x0039, B:19:0x0043, B:29:0x00b0, B:31:0x00b4, B:34:0x00bf, B:22:0x0063, B:24:0x0089, B:25:0x0098, B:27:0x00a0, B:36:0x00c3, B:37:0x00c6, B:38:0x00c7, B:8:0x000d), top: B:43:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x0013, B:13:0x0026, B:15:0x0031, B:17:0x0039, B:19:0x0043, B:29:0x00b0, B:31:0x00b4, B:34:0x00bf, B:22:0x0063, B:24:0x0089, B:25:0x0098, B:27:0x00a0, B:36:0x00c3, B:37:0x00c6, B:38:0x00c7, B:8:0x000d), top: B:43:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.le a() {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.td.a():com.google.android.gms.internal.measurement.le");
    }

    public final void b() {
        a7.j jVar = this.f3115h;
        nb nbVar = (nb) jVar.f203x;
        hc hcVar = (hc) nbVar.f2926d.get();
        String str = (String) jVar.f202w;
        hcVar.getClass();
        str.getClass();
        ya yaVar = hcVar.f2692a;
        com.bumptech.glide.manager.t tVarB = com.bumptech.glide.manager.t.b();
        int i10 = 1;
        tVarB.f2438x = new wd(i10, str);
        da.a aVarB = hc.b(yaVar.b(0, tVarB.a()).e(da.f0.f4407v, new f1(12)));
        c3 c3Var = c3.f2528y;
        da.v0 v0VarA = nbVar.a();
        int i11 = da.w.F;
        da.v vVar = new da.v(aVarB, c3Var);
        aVarB.f(vVar, va.t1.l(v0VarA, vVar));
        od odVar = new od(i10, jVar);
        nb nbVar2 = this.f3110b;
        da.o0.f(vVar, odVar, nbVar2.a()).f(new pd(this, vVar, i10), nbVar2.a());
    }
}
