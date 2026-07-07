package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.datastore.preferences.protobuf.z0;
import com.bumptech.glide.manager.t;
import j6.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m extends r6.a {
    public final Context L;
    public final o M;
    public final Class N;
    public final g O;
    public a P;
    public Object Q;
    public ArrayList R;
    public m S;
    public m T;
    public final boolean U = true;
    public boolean V;
    public boolean W;

    static {
    }

    public m(b bVar, o oVar, Class cls, Context context) {
        r6.g gVar;
        this.M = oVar;
        this.N = cls;
        this.L = context;
        v.e eVar = oVar.f2443v.f2344x.f;
        a aVar = (a) eVar.get(cls);
        if (aVar == null) {
            for (Map.Entry entry : (z0) eVar.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.P = aVar == null ? g.f2352k : aVar;
        this.O = bVar.f2344x;
        Iterator it = oVar.D.iterator();
        while (it.hasNext()) {
            r((r6.f) it.next());
        }
        synchronized (oVar) {
            gVar = oVar.E;
        }
        a(gVar);
    }

    @Override // r6.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return super.equals(mVar) && Objects.equals(this.N, mVar.N) && this.P.equals(mVar.P) && Objects.equals(this.Q, mVar.Q) && Objects.equals(this.R, mVar.R) && Objects.equals(this.S, mVar.S) && Objects.equals(this.T, mVar.T) && this.U == mVar.U && this.V == mVar.V;
    }

    @Override // r6.a
    public final int hashCode() {
        return v6.m.g(this.V ? 1 : 0, v6.m.g(this.U ? 1 : 0, v6.m.h(v6.m.h(v6.m.h(v6.m.h(v6.m.h(v6.m.h(v6.m.h(super.hashCode(), this.N), this.P), this.Q), this.R), this.S), this.T), null)));
    }

    public final m r(r6.f fVar) {
        if (this.I) {
            return clone().r(fVar);
        }
        if (fVar != null) {
            if (this.R == null) {
                this.R = new ArrayList();
            }
            this.R.add(fVar);
        }
        k();
        return this;
    }

    @Override // r6.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final m a(r6.a aVar) {
        v6.f.b(aVar);
        return (m) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final r6.c t(Object obj, s6.d dVar, r6.f fVar, r6.d dVar2, a aVar, h hVar, int i, int i10, r6.a aVar2, Executor executor) {
        r6.d dVar3;
        r6.d bVar;
        r6.a aVar3;
        r6.c hVar2;
        h hVar3;
        if (this.T != null) {
            bVar = new r6.b(obj, dVar2);
            dVar3 = bVar;
        } else {
            dVar3 = null;
            bVar = dVar2;
        }
        m mVar = this.S;
        if (mVar == null) {
            Context context = this.L;
            g gVar = this.O;
            aVar3 = aVar2;
            hVar2 = new r6.h(context, gVar, obj, this.Q, this.N, aVar3, i, i10, hVar, dVar, fVar, this.R, bVar, gVar.f2358g, aVar.f2341v, executor);
        } else {
            if (this.W) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            a aVar4 = mVar.U ? aVar : mVar.P;
            if (r6.a.f(mVar.f11296v, 8)) {
                hVar3 = this.S.f11298x;
            } else {
                int iOrdinal = hVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    hVar3 = h.f2361v;
                } else if (iOrdinal == 2) {
                    hVar3 = h.f2362w;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f11298x);
                    }
                    hVar3 = h.f2363x;
                }
            }
            h hVar4 = hVar3;
            m mVar2 = this.S;
            int i11 = mVar2.B;
            int i12 = mVar2.A;
            if (v6.m.i(i, i10)) {
                m mVar3 = this.S;
                if (!v6.m.i(mVar3.B, mVar3.A)) {
                    i11 = aVar2.B;
                    i12 = aVar2.A;
                }
            }
            int i13 = i12;
            int i14 = i11;
            r6.i iVar = new r6.i(obj, bVar);
            Context context2 = this.L;
            g gVar2 = this.O;
            r6.i iVar2 = iVar;
            r6.h hVar5 = new r6.h(context2, gVar2, obj, this.Q, this.N, aVar2, i, i10, hVar, dVar, fVar, this.R, iVar2, gVar2.f2358g, aVar.f2341v, executor);
            this.W = true;
            m mVar4 = this.S;
            r6.c cVarT = mVar4.t(obj, dVar, fVar, iVar2, aVar4, hVar4, i14, i13, mVar4, executor);
            this.W = false;
            iVar2.f11337c = hVar5;
            iVar2.f11338d = cVarT;
            aVar3 = aVar2;
            hVar2 = iVar2;
        }
        if (dVar3 == null) {
            return hVar2;
        }
        m mVar5 = this.T;
        int i15 = mVar5.B;
        int i16 = mVar5.A;
        if (v6.m.i(i, i10)) {
            m mVar6 = this.T;
            if (!v6.m.i(mVar6.B, mVar6.A)) {
                i15 = aVar3.B;
                i16 = aVar3.A;
            }
        }
        int i17 = i16;
        m mVar7 = this.T;
        r6.b bVar2 = dVar3;
        r6.c cVarT2 = mVar7.t(obj, dVar, fVar, bVar2, mVar7.P, mVar7.f11298x, i15, i17, mVar7, executor);
        bVar2.f11303c = hVar2;
        bVar2.f11304d = cVarT2;
        return bVar2;
    }

    @Override // r6.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        m mVar = (m) super.clone();
        mVar.P = mVar.P.clone();
        if (mVar.R != null) {
            mVar.R = new ArrayList(mVar.R);
        }
        m mVar2 = mVar.S;
        if (mVar2 != null) {
            mVar.S = mVar2.clone();
        }
        m mVar3 = mVar.T;
        if (mVar3 != null) {
            mVar.T = mVar3.clone();
        }
        return mVar;
    }

    public final void v(ImageView imageView) {
        r6.a aVarG;
        s6.d bVar;
        v6.m.a();
        v6.f.b(imageView);
        if (!r6.a.f(this.f11296v, 2048) && imageView.getScaleType() != null) {
            switch (l.f2374a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarG = clone().g(j6.n.f6953d, new j6.h());
                    break;
                case 2:
                    aVarG = clone().g(j6.n.f6952c, new j6.i());
                    aVarG.J = true;
                    break;
                case 3:
                case g1.g.LONG_FIELD_NUMBER /* 4 */:
                case g1.g.STRING_FIELD_NUMBER /* 5 */:
                    aVarG = clone().g(j6.n.f6951b, new u());
                    aVarG.J = true;
                    break;
                case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    aVarG = clone().g(j6.n.f6952c, new j6.i());
                    aVarG.J = true;
                    break;
                default:
                    aVarG = this;
                    break;
            }
        } else {
            aVarG = this;
        }
        this.O.f2355c.getClass();
        Class cls = this.N;
        if (Bitmap.class.equals(cls)) {
            bVar = new s6.b(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            bVar = new s6.b(imageView, 1);
        }
        w(bVar, null, aVarG, v6.f.f13221a);
    }

    public final void w(s6.d dVar, r6.e eVar, r6.a aVar, Executor executor) {
        v6.f.b(dVar);
        if (!this.V) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        r6.c cVarT = t(new Object(), dVar, eVar, null, this.P, aVar.f11298x, aVar.B, aVar.A, aVar, executor);
        r6.c cVarG = dVar.g();
        if (cVarT.h(cVarG) && (aVar.f11300z || !cVarG.j())) {
            v6.f.c(cVarG, "Argument must not be null");
            if (cVarG.isRunning()) {
                return;
            }
            cVarG.g();
            return;
        }
        this.M.f(dVar);
        dVar.d(cVarT);
        o oVar = this.M;
        synchronized (oVar) {
            oVar.A.f2440v.add(dVar);
            t tVar = oVar.f2446y;
            ((Set) tVar.f2438x).add(cVarT);
            if (tVar.f2437w) {
                cVarT.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) tVar.f2439y).add(cVarT);
            } else {
                cVarT.g();
            }
        }
    }

    public final m x(qc.i iVar) {
        if (this.I) {
            return clone().x(iVar);
        }
        this.R = null;
        return r(iVar);
    }

    public final m y(Object obj) {
        if (this.I) {
            return clone().y(obj);
        }
        this.Q = obj;
        this.V = true;
        k();
        return this;
    }
}
