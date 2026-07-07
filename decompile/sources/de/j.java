package de;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class j implements g, Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f4518v;

    public j(int i) {
        this.f4518v = i;
    }

    @Override // de.g
    public final int d() {
        return this.f4518v;
    }

    public final String toString() {
        q.f4523a.getClass();
        String strA = r.a(this);
        i.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
