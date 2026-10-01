package lf;

import gf.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f extends e {
    public final kf.h A;

    public f(kf.h hVar, le.h hVar2, int i6, jf.a aVar) {
        super(hVar2, i6, aVar);
        this.A = hVar;
    }

    @Override // lf.e
    public final Object a(jf.v vVar, le.c cVar) {
        Object d10 = d(new z(vVar), cVar);
        if (d10 == me.a.f8833x) {
            return d10;
        }
        return he.y.f6101a;
    }

    @Override // lf.e, kf.h
    public final Object collect(kf.i iVar, le.c cVar) {
        le.h m9;
        boolean z10;
        int i6 = this.f8367y;
        me.a aVar = me.a.f8833x;
        if (i6 == -3) {
            le.h context = cVar.getContext();
            Boolean bool = Boolean.FALSE;
            gf.v vVar = gf.v.f5716z;
            le.h hVar = this.f8366x;
            if (!((Boolean) hVar.fold(bool, vVar)).booleanValue()) {
                m9 = context.plus(hVar);
            } else {
                m9 = f0.m(context, hVar, false);
            }
            if (kotlin.jvm.internal.k.a(m9, context)) {
                Object d10 = d(iVar, cVar);
                if (d10 == aVar) {
                    return d10;
                }
            } else {
                le.d dVar = le.d.f8352x;
                if (kotlin.jvm.internal.k.a(m9.get(dVar), context.get(dVar))) {
                    le.h context2 = cVar.getContext();
                    if (iVar instanceof z) {
                        z10 = true;
                    } else {
                        z10 = iVar instanceof t;
                    }
                    if (!z10) {
                        iVar = new kf.z(iVar, context2);
                    }
                    Object b10 = c.b(m9, iVar, mf.a.l(m9), new androidx.lifecycle.c(this, null, 9), cVar);
                    if (b10 == aVar) {
                        return b10;
                    }
                }
            }
            return he.y.f6101a;
        }
        Object collect = super.collect(iVar, cVar);
        if (collect == aVar) {
            return collect;
        }
        return he.y.f6101a;
    }

    public abstract Object d(kf.i iVar, le.c cVar);

    @Override // lf.e
    public final String toString() {
        return this.A + " -> " + super.toString();
    }
}
