package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class hg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f2696a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f2697b = new WeakHashMap();

    public static void a(Throwable th) {
        Throwable cause;
        f1 f1Var;
        Closeable closeable;
        WeakHashMap weakHashMap = f2697b;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } finally {
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        WeakHashMap weakHashMap2 = f2696a;
        synchronized (weakHashMap2) {
            Throwable cause2 = th;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } finally {
                }
            }
            if (cause2 == null) {
                f1Var = null;
            } else {
                weakHashMap2.put(th, (eg) weakHashMap2.get(cause2));
                f1Var = new f1(17);
            }
        }
        if (f1Var != null || (closeable = jg.b().f3233b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (closeable = jg.b().f3233b; closeable != null; closeable = ((dg) closeable).f2579v) {
            arrayList.add(closeable);
        }
        UUID uuid = ((dg) ((yg) arrayList.get(0))).f2580w;
        if (uuid == null) {
            throw new NullPointerException("Null rootTraceId");
        }
        ((yg) arrayList.get(0)).getClass();
        y9.b0 b0VarK = y9.f0.k(arrayList.size());
        y9.b0 b0VarK2 = y9.f0.k(arrayList.size());
        for (yg ygVar : y9.p.s(arrayList)) {
            b0VarK2.a(((dg) ygVar).f2582y);
            b0VarK.a(ygVar.d());
        }
        WeakHashMap weakHashMap3 = f2696a;
        synchronized (weakHashMap3) {
            try {
                y9.z0 z0VarG = b0VarK2.g();
                if (z0VarG == null) {
                    throw new NullPointerException("Null spansNames");
                }
                y9.z0 z0VarG2 = b0VarK.g();
                if (z0VarG2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap3.put(th, new eg(z0VarG, z0VarG2, uuid));
            } finally {
            }
        }
    }
}
