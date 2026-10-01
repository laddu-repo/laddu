package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements androidx.lifecycle.i, u4.d, androidx.lifecycle.u0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y f1165v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final androidx.lifecycle.t0 f1166w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final androidx.emoji2.text.v f1167x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public androidx.lifecycle.r0 f1168y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public androidx.lifecycle.u f1169z = null;
    public com.bumptech.glide.manager.t A = null;

    public z0(y yVar, androidx.lifecycle.t0 t0Var, androidx.emoji2.text.v vVar) {
        this.f1165v = yVar;
        this.f1166w = t0Var;
        this.f1167x = vVar;
    }

    @Override // u4.d
    public final o.r a() {
        g();
        return (o.r) this.A.f2439y;
    }

    public final void b(androidx.lifecycle.m mVar) {
        this.f1169z.d(mVar);
    }

    @Override // androidx.lifecycle.i
    public final androidx.lifecycle.r0 c() {
        Application application;
        y yVar = this.f1165v;
        androidx.lifecycle.r0 r0VarC = yVar.c();
        if (!r0VarC.equals(yVar.f1147n0)) {
            this.f1168y = r0VarC;
            return r0VarC;
        }
        if (this.f1168y == null) {
            Context applicationContext = yVar.I().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f1168y = new androidx.lifecycle.m0(application, yVar, yVar.B);
        }
        return this.f1168y;
    }

    @Override // androidx.lifecycle.i
    public final r1.c d() {
        Application application;
        y yVar = this.f1165v;
        Context applicationContext = yVar.I().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        r1.c cVar = new r1.c(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f2053w;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.p0.f1228a, application);
        }
        linkedHashMap.put(androidx.lifecycle.i0.f1201a, yVar);
        linkedHashMap.put(androidx.lifecycle.i0.f1202b, this);
        Bundle bundle = yVar.B;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.i0.f1203c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.u0
    public final androidx.lifecycle.t0 e() {
        g();
        return this.f1166w;
    }

    @Override // androidx.lifecycle.s
    public final androidx.lifecycle.u f() {
        g();
        return this.f1169z;
    }

    public final void g() {
        if (this.f1169z == null) {
            this.f1169z = new androidx.lifecycle.u(this);
            com.bumptech.glide.manager.t tVar = new com.bumptech.glide.manager.t(this);
            this.A = tVar;
            tVar.e();
            this.f1167x.run();
        }
    }
}
