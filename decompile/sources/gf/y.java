package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class y extends le.a implements le.e {

    /* renamed from: x, reason: collision with root package name */
    public static final x f5726x = new x(le.d.f8352x, w.f5720x);

    public y() {
        super(le.d.f8352x);
    }

    public abstract void f0(le.h hVar, Runnable runnable);

    public void g0(le.h hVar, Runnable runnable) {
        f0(hVar, runnable);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.l, ve.l] */
    @Override // le.a, le.h
    public final le.f get(le.g key) {
        le.f fVar;
        kotlin.jvm.internal.k.e(key, "key");
        if (key instanceof x) {
            x xVar = (x) key;
            le.g key2 = getKey();
            kotlin.jvm.internal.k.e(key2, "key");
            if ((key2 != xVar && xVar.f5724y != key2) || (fVar = (le.f) xVar.f5723x.invoke(this)) == null) {
                return null;
            }
            return fVar;
        }
        if (le.d.f8352x != key) {
            return null;
        }
        return this;
    }

    public boolean h0() {
        return !(this instanceof i2);
    }

    public y i0(int i6) {
        mf.a.a(i6);
        return new mf.i(this, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (((le.f) r3.f5723x.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        return le.i.f8353x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        if (le.d.f8352x == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.l, ve.l] */
    @Override // le.a, le.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final le.h minusKey(le.g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.k.e(r3, r0)
            boolean r1 = r3 instanceof gf.x
            if (r1 == 0) goto L25
            gf.x r3 = (gf.x) r3
            le.g r1 = r2.getKey()
            kotlin.jvm.internal.k.e(r1, r0)
            if (r1 == r3) goto L1a
            le.g r0 = r3.f5724y
            if (r0 != r1) goto L19
            goto L1a
        L19:
            return r2
        L1a:
            kotlin.jvm.internal.l r3 = r3.f5723x
            java.lang.Object r3 = r3.invoke(r2)
            le.f r3 = (le.f) r3
            if (r3 == 0) goto L2c
            goto L29
        L25:
            le.d r0 = le.d.f8352x
            if (r0 != r3) goto L2c
        L29:
            le.i r3 = le.i.f8353x
            return r3
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.y.minusKey(le.g):le.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + f0.p(this);
    }
}
