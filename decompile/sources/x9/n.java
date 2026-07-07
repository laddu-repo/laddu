package x9;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements m, Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient Object f14299v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f14300w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile transient boolean f14301x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public transient Object f14302y;

    public n(m mVar) {
        mVar.getClass();
        this.f14300w = mVar;
    }

    @Override // x9.m
    public final Object get() {
        if (!this.f14301x) {
            synchronized (this.f14299v) {
                try {
                    if (!this.f14301x) {
                        Object obj = this.f14300w.get();
                        this.f14302y = obj;
                        this.f14301x = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f14302y;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (this.f14301x) {
            obj = "<supplier that returned " + this.f14302y + ">";
        } else {
            obj = this.f14300w;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
