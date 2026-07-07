package j1;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.d1;
import androidx.lifecycle.g1;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.lifecycle.p1;
import androidx.lifecycle.q1;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x0 implements androidx.lifecycle.s, e5.g, q1 {
    public n1 A;
    public androidx.lifecycle.h0 B = null;
    public e5.f C = null;

    /* renamed from: x, reason: collision with root package name */
    public final y f7014x;

    /* renamed from: y, reason: collision with root package name */
    public final p1 f7015y;

    /* renamed from: z, reason: collision with root package name */
    public final a2.a f7016z;

    public x0(y yVar, p1 p1Var, a2.a aVar) {
        this.f7014x = yVar;
        this.f7015y = p1Var;
        this.f7016z = aVar;
    }

    public final void a(androidx.lifecycle.w wVar) {
        this.B.f(wVar);
    }

    public final void b() {
        if (this.B == null) {
            this.B = new androidx.lifecycle.h0(this);
            e5.f fVar = new e5.f(new f5.b(this, new androidx.lifecycle.i(this, 3)));
            this.C = fVar;
            fVar.a();
            this.f7016z.run();
        }
    }

    @Override // androidx.lifecycle.s
    public final o1.c getDefaultViewModelCreationExtras() {
        Application application;
        y yVar = this.f7014x;
        Context applicationContext = yVar.F().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        o1.e eVar = new o1.e(0);
        LinkedHashMap linkedHashMap = eVar.f9848a;
        if (application != null) {
            linkedHashMap.put(m1.f960e, application);
        }
        linkedHashMap.put(d1.f902a, yVar);
        linkedHashMap.put(d1.f903b, this);
        Bundle bundle = yVar.D;
        if (bundle != null) {
            linkedHashMap.put(d1.f904c, bundle);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.s
    public final n1 getDefaultViewModelProviderFactory() {
        Application application;
        y yVar = this.f7014x;
        n1 defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(yVar.f7035s0)) {
            this.A = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.A == null) {
            Context applicationContext = yVar.F().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.A = new g1(application, yVar, yVar.D);
        }
        return this.A;
    }

    @Override // androidx.lifecycle.f0
    public final androidx.lifecycle.y getLifecycle() {
        b();
        return this.B;
    }

    @Override // e5.g
    public final e5.e getSavedStateRegistry() {
        b();
        return this.C.f4357b;
    }

    @Override // androidx.lifecycle.q1
    public final p1 getViewModelStore() {
        b();
        return this.f7015y;
    }
}
