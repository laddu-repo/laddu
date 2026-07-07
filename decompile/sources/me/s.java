package me;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends sd.a implements sd.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final r f8730w = new r(sd.d.f11796v, new ac.r(2));

    public s() {
        super(sd.d.f11796v);
    }

    @Override // sd.a, sd.h
    public final sd.f A(sd.g gVar) {
        sd.f fVar;
        de.i.e(gVar, "key");
        if (!(gVar instanceof r)) {
            if (sd.d.f11796v == gVar) {
                return this;
            }
            return null;
        }
        r rVar = (r) gVar;
        sd.g gVar2 = this.f11793v;
        if ((gVar2 == rVar || rVar.f8728w == gVar2) && (fVar = (sd.f) rVar.f8727v.a(this)) != null) {
            return fVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((sd.f) r3.f8727v.a(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (sd.d.f11796v == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return sd.i.f11797v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    @Override // sd.a, sd.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final sd.h l(sd.g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            de.i.e(r3, r0)
            boolean r0 = r3 instanceof me.r
            if (r0 == 0) goto L20
            me.r r3 = (me.r) r3
            sd.g r0 = r2.f11793v
            if (r0 == r3) goto L15
            sd.g r1 = r3.f8728w
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            ce.l r3 = r3.f8727v
            java.lang.Object r3 = r3.a(r2)
            sd.f r3 = (sd.f) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            sd.d r0 = sd.d.f11796v
            if (r0 != r3) goto L27
        L24:
            sd.i r3 = sd.i.f11797v
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: me.s.l(sd.g):sd.h");
    }

    public abstract void o0(sd.h hVar, Runnable runnable);

    public boolean p0(sd.h hVar) {
        return !(this instanceof n1);
    }

    public s q0(int i) {
        re.a.a(i);
        return new re.g(this, i);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + x.g(this);
    }
}
