package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v.e f3196a = new v.e(0);

    public static synchronized void a() {
        v.e eVar = f3196a;
        Iterator it = ((v.d) eVar.values()).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        eVar.clear();
    }
}
