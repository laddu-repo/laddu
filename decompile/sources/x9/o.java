package x9;

import c2.r;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o implements m {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final r f14303y = new r(3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f14304v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile m f14305w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f14306x;

    public o(m mVar) {
        mVar.getClass();
        this.f14305w = mVar;
    }

    @Override // x9.m
    public final Object get() {
        m mVar = this.f14305w;
        r rVar = f14303y;
        if (mVar != rVar) {
            synchronized (this.f14304v) {
                try {
                    if (this.f14305w != rVar) {
                        Object obj = this.f14305w.get();
                        this.f14306x = obj;
                        this.f14305w = rVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f14306x;
    }

    public final String toString() {
        Object obj = this.f14305w;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == f14303y) {
            obj = "<supplier that returned " + this.f14306x + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
