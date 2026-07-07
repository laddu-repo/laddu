package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class nb {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f2919j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicReference f2920k = new AtomicReference();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile nb f2921l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final x9.m f2922m = u1.c.z(rb.f3049w);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a7.j f2923a = new a7.j(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x9.m f2925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x9.m f2926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x9.m f2927e;
    public final x9.m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qe f2928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x9.m f2929h;
    public final de i;

    public nb(Context context, x9.m mVar, x9.m mVar2, x9.m mVar3, x9.m mVar4, x9.m mVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        mVar.getClass();
        mVar2.getClass();
        mVar3.getClass();
        mVar4.getClass();
        mVar5.getClass();
        x9.m mVarZ = u1.c.z(mVar);
        x9.m mVarZ2 = u1.c.z(mVar2);
        x9.m mVarZ3 = u1.c.z(new sb(mVar3, 0));
        x9.m mVarZ4 = u1.c.z(mVar4);
        x9.m mVarZ5 = u1.c.z(mVar5);
        this.f2924b = applicationContext;
        this.f2925c = mVarZ;
        this.f2926d = mVarZ2;
        this.f2927e = mVarZ3;
        this.f = mVarZ4;
        this.f2928g = new qe(applicationContext, mVarZ, mVarZ4, mVarZ2);
        this.f2929h = mVarZ5;
        this.i = new de(applicationContext, mVarZ, mVarZ3, mVarZ2);
    }

    public static void b() {
        jb.i();
        if (f2920k.get() == null && jb.f2796c == null) {
            jb.f2796c = new tb(0);
        }
    }

    public final da.v0 a() {
        return (da.v0) this.f2925c.get();
    }
}
