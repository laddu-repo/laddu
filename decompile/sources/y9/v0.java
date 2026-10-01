package y9;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements x9.m, Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f14623v;

    public v0() {
        p.d(2, "expectedValuesPerKey");
        this.f14623v = 2;
    }

    @Override // x9.m
    public final Object get() {
        return new ArrayList(this.f14623v);
    }
}
