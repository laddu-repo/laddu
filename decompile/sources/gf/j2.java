package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j2 extends mf.t {
    public final ThreadLocal B;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j2(le.c r3, le.h r4) {
        /*
            r2 = this;
            gf.k2 r0 = gf.k2.f5685x
            le.f r1 = r4.get(r0)
            if (r1 != 0) goto Ld
            le.h r0 = r4.plus(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.B = r0
            le.h r3 = r3.getContext()
            le.d r0 = le.d.f8352x
            le.f r3 = r3.get(r0)
            boolean r3 = r3 instanceof gf.y
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = mf.a.m(r4, r3)
            mf.a.g(r4, r3)
            r2.c0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.j2.<init>(le.c, le.h):void");
    }

    public final boolean Z() {
        boolean z10;
        if (this.threadLocalIsSet && this.B.get() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.B.remove();
        return !z10;
    }

    public final void c0(le.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.B.set(new he.i(hVar, obj));
    }

    @Override // mf.t, gf.t1
    public final void o(Object obj) {
        if (this.threadLocalIsSet) {
            he.i iVar = (he.i) this.B.get();
            if (iVar != null) {
                mf.a.g((le.h) iVar.f6076x, iVar.f6077y);
            }
            this.B.remove();
        }
        Object z10 = f0.z(obj);
        le.c cVar = this.A;
        le.h context = cVar.getContext();
        j2 j2Var = null;
        Object m9 = mf.a.m(context, null);
        if (m9 != mf.a.f8847f) {
            j2Var = f0.I(cVar, context, m9);
        }
        try {
            this.A.resumeWith(z10);
            if (j2Var != null && !j2Var.Z()) {
                return;
            }
            mf.a.g(context, m9);
        } catch (Throwable th) {
            if (j2Var == null || j2Var.Z()) {
                mf.a.g(context, m9);
            }
            throw th;
        }
    }
}
