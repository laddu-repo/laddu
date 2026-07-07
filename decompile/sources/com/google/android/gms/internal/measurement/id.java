package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class id implements x9.m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f2749v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q7.h f2750w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile int f2751x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p6 f2752y;

    public id(String str, q7.h hVar) {
        this.f2749v = str;
        this.f2750w = hVar;
    }

    public abstract Object a();

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.google.android.gms.internal.measurement.nb r9) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.id.b(com.google.android.gms.internal.measurement.nb):java.lang.Object");
    }

    public abstract Object c(String str);

    public abstract Object d(Object obj);

    public abstract Object e();

    public abstract void f(Object obj);

    @Override // x9.m
    public final Object get() {
        nb nbVar;
        int i = 0;
        if (jb.f2797d == null) {
            Object obj = nb.f2919j;
            jb.f2797d = new tb(0);
        }
        Context context = (Context) nb.f2920k.get();
        if (context == null) {
            jb.i();
            throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
        }
        nb nbVar2 = nb.f2921l;
        if (nbVar2 == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                de.i.e(applicationContext, "context");
                Context applicationContext2 = applicationContext.getApplicationContext();
                de.i.d(applicationContext2, "getApplicationContext(...)");
                Class<?> cls = applicationContext2.getClass();
                new StringBuilder(String.valueOf(cls).length() + 72);
                cls.toString();
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            } catch (IllegalStateException unused) {
                synchronized (nb.f2919j) {
                    try {
                        if (nb.f2921l != null) {
                            nbVar = nb.f2921l;
                        } else {
                            nbVar = (nb) new ob(applicationContext, i).get();
                            nb.f2921l = nbVar;
                            e1.i(Level.CONFIG, nbVar.a(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                        nbVar2 = nbVar;
                    } finally {
                    }
                }
            }
        }
        Object objB = b(nbVar2);
        objB.getClass();
        return objB;
    }
}
