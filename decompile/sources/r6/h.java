package r6;

import a7.j;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import c6.b0;
import c6.l;
import c6.m;
import c6.q;
import c6.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements c, s6.c {
    public static final boolean D = Log.isLoggable("GlideRequest", 2);
    public boolean A;
    public final RuntimeException B;
    public int C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w6.e f11312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f11314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f11315e;
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.g f11316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f11317h;
    public final Class i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f11318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f11319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.bumptech.glide.h f11321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s6.d f11322n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f11323o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t6.a f11324p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Executor f11325q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b0 f11326r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j f11327s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f11328t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile m f11329u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f11330v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f11331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f11332x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11333y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f11334z;

    public h(Context context, com.bumptech.glide.g gVar, Object obj, Object obj2, Class cls, a aVar, int i, int i10, com.bumptech.glide.h hVar, s6.d dVar, f fVar, ArrayList arrayList, d dVar2, m mVar, t6.a aVar2, Executor executor) {
        this.f11311a = D ? String.valueOf(hashCode()) : null;
        this.f11312b = new w6.e();
        this.f11313c = obj;
        this.f = context;
        this.f11316g = gVar;
        this.f11317h = obj2;
        this.i = cls;
        this.f11318j = aVar;
        this.f11319k = i;
        this.f11320l = i10;
        this.f11321m = hVar;
        this.f11322n = dVar;
        this.f11314d = fVar;
        this.f11323o = arrayList;
        this.f11315e = dVar2;
        this.f11329u = mVar;
        this.f11324p = aVar2;
        this.f11325q = executor;
        this.C = 1;
        if (this.B == null && ((Map) gVar.f2359h.f273w).containsKey(com.bumptech.glide.d.class)) {
            this.B = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // r6.c
    public final boolean a() {
        boolean z2;
        synchronized (this.f11313c) {
            z2 = this.C == 4;
        }
        return z2;
    }

    @Override // r6.c
    public final boolean b() {
        boolean z2;
        synchronized (this.f11313c) {
            z2 = this.C == 6;
        }
        return z2;
    }

    public final void c() {
        if (this.A) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f11312b.a();
        this.f11322n.j(this);
        j jVar = this.f11327s;
        if (jVar != null) {
            synchronized (((m) jVar.f204y)) {
                ((q) jVar.f202w).j((h) jVar.f203x);
            }
            this.f11327s = null;
        }
    }

    @Override // r6.c
    public final void clear() {
        synchronized (this.f11313c) {
            try {
                if (this.A) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f11312b.a();
                if (this.C == 6) {
                    return;
                }
                c();
                b0 b0Var = this.f11326r;
                if (b0Var != null) {
                    this.f11326r = null;
                } else {
                    b0Var = null;
                }
                d dVar = this.f11315e;
                if (dVar == null || dVar.e(this)) {
                    this.f11322n.h(d());
                }
                this.C = 6;
                if (b0Var != null) {
                    this.f11329u.getClass();
                    m.g(b0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Drawable d() {
        if (this.f11331w == null) {
            a aVar = this.f11318j;
            aVar.getClass();
            this.f11331w = null;
            int i = aVar.f11299y;
            if (i > 0) {
                aVar.getClass();
                Context context = this.f;
                this.f11331w = android.support.v4.media.session.b.r(context, context, i, context.getTheme());
            }
        }
        return this.f11331w;
    }

    public final void e(String str) {
        Log.v("GlideRequest", str + " this: " + this.f11311a);
    }

    @Override // r6.c
    public final void f() {
        synchronized (this.f11313c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r6.c
    public final void g() {
        synchronized (this.f11313c) {
            try {
                if (this.A) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f11312b.a();
                int i = v6.h.f13224b;
                this.f11328t = SystemClock.elapsedRealtimeNanos();
                if (this.f11317h == null) {
                    if (v6.m.i(this.f11319k, this.f11320l)) {
                        this.f11333y = this.f11319k;
                        this.f11334z = this.f11320l;
                    }
                    if (this.f11332x == null) {
                        this.f11318j.getClass();
                        this.f11332x = null;
                    }
                    i(new w("Received null model"), this.f11332x == null ? 5 : 3);
                    return;
                }
                int i10 = this.C;
                if (i10 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i10 == 4) {
                    k(this.f11326r, 5, false);
                    return;
                }
                List<f> list = this.f11323o;
                if (list != null) {
                    for (f fVar : list) {
                    }
                }
                this.C = 3;
                if (v6.m.i(this.f11319k, this.f11320l)) {
                    m(this.f11319k, this.f11320l);
                } else {
                    this.f11322n.m(this);
                }
                int i11 = this.C;
                if (i11 == 2 || i11 == 3) {
                    d dVar = this.f11315e;
                    if (dVar == null || dVar.k(this)) {
                        this.f11322n.e(d());
                    }
                }
                if (D) {
                    e("finished run method in " + v6.h.a(this.f11328t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r6.c
    public final boolean h(c cVar) {
        int i;
        int i10;
        Object obj;
        Class cls;
        a aVar;
        com.bumptech.glide.h hVar;
        int size;
        int i11;
        int i12;
        Object obj2;
        Class cls2;
        a aVar2;
        com.bumptech.glide.h hVar2;
        int size2;
        if (!(cVar instanceof h)) {
            return false;
        }
        synchronized (this.f11313c) {
            try {
                i = this.f11319k;
                i10 = this.f11320l;
                obj = this.f11317h;
                cls = this.i;
                aVar = this.f11318j;
                hVar = this.f11321m;
                List list = this.f11323o;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        h hVar3 = (h) cVar;
        synchronized (hVar3.f11313c) {
            try {
                i11 = hVar3.f11319k;
                i12 = hVar3.f11320l;
                obj2 = hVar3.f11317h;
                cls2 = hVar3.i;
                aVar2 = hVar3.f11318j;
                hVar2 = hVar3.f11321m;
                List list2 = hVar3.f11323o;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i11 && i10 == i12) {
            char[] cArr = v6.m.f13232a;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((aVar == null ? aVar2 == null : aVar.e(aVar2)) && hVar == hVar2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void i(w wVar, int i) {
        Drawable drawableD;
        this.f11312b.a();
        synchronized (this.f11313c) {
            try {
                wVar.getClass();
                int i10 = this.f11316g.i;
                if (i10 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f11317h + "] with dimensions [" + this.f11333y + "x" + this.f11334z + "]", wVar);
                    if (i10 <= 4) {
                        wVar.d();
                    }
                }
                this.f11327s = null;
                this.C = 5;
                d dVar = this.f11315e;
                if (dVar != null) {
                    dVar.c(this);
                }
                boolean z2 = true;
                this.A = true;
                try {
                    List<f> list = this.f11323o;
                    if (list != null) {
                        for (f fVar : list) {
                            d dVar2 = this.f11315e;
                            if (dVar2 != null) {
                                dVar2.getRoot().a();
                            }
                            fVar.i(wVar);
                        }
                    }
                    f fVar2 = this.f11314d;
                    if (fVar2 != null) {
                        d dVar3 = this.f11315e;
                        if (dVar3 != null) {
                            dVar3.getRoot().a();
                        }
                        fVar2.i(wVar);
                    }
                    d dVar4 = this.f11315e;
                    if (dVar4 != null && !dVar4.k(this)) {
                        z2 = false;
                    }
                    if (z2) {
                        if (this.f11317h == null) {
                            if (this.f11332x == null) {
                                this.f11318j.getClass();
                                this.f11332x = null;
                            }
                            drawableD = this.f11332x;
                        } else {
                            drawableD = null;
                        }
                        if (drawableD == null) {
                            if (this.f11330v == null) {
                                this.f11318j.getClass();
                                this.f11330v = null;
                            }
                            drawableD = this.f11330v;
                        }
                        if (drawableD == null) {
                            drawableD = d();
                        }
                        this.f11322n.b(drawableD);
                    }
                } finally {
                    this.A = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r6.c
    public final boolean isRunning() {
        boolean z2;
        synchronized (this.f11313c) {
            int i = this.C;
            z2 = i == 2 || i == 3;
        }
        return z2;
    }

    @Override // r6.c
    public final boolean j() {
        boolean z2;
        synchronized (this.f11313c) {
            z2 = this.C == 4;
        }
        return z2;
    }

    public final void k(b0 b0Var, int i, boolean z2) {
        this.f11312b.a();
        b0 b0Var2 = null;
        try {
            synchronized (this.f11313c) {
                try {
                    this.f11327s = null;
                    if (b0Var == null) {
                        i(new w("Expected to receive a Resource<R> with an object of " + this.i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = b0Var.get();
                    try {
                        if (obj == null || !this.i.isAssignableFrom(obj.getClass())) {
                            this.f11326r = null;
                            StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                            sb2.append(this.i);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : "");
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(b0Var);
                            sb2.append("}.");
                            sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            i(new w(sb2.toString()), 5);
                        } else {
                            d dVar = this.f11315e;
                            if (dVar == null || dVar.d(this)) {
                                l(b0Var, obj, i);
                                return;
                            } else {
                                this.f11326r = null;
                                this.C = 4;
                            }
                        }
                        this.f11329u.getClass();
                        m.g(b0Var);
                    } catch (Throwable th) {
                        b0Var2 = b0Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (b0Var2 != null) {
                this.f11329u.getClass();
                m.g(b0Var2);
            }
            throw th3;
        }
    }

    public final void l(b0 b0Var, Object obj, int i) {
        boolean zMo0a;
        d dVar = this.f11315e;
        if (dVar != null) {
            dVar.getRoot().a();
        }
        this.C = 4;
        this.f11326r = b0Var;
        if (this.f11316g.i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + j4.a.w(i) + " for " + this.f11317h + " with size [" + this.f11333y + "x" + this.f11334z + "] in " + v6.h.a(this.f11328t) + " ms");
        }
        if (dVar != null) {
            dVar.i(this);
        }
        boolean z2 = true;
        this.A = true;
        try {
            List list = this.f11323o;
            if (list != null) {
                Iterator it = list.iterator();
                zMo0a = false;
                while (it.hasNext()) {
                    zMo0a |= ((f) it.next()).mo0a(obj);
                }
            } else {
                zMo0a = false;
            }
            f fVar = this.f11314d;
            if (fVar == null || !fVar.mo0a(obj)) {
                z2 = false;
            }
            if (!(z2 | zMo0a)) {
                this.f11324p.getClass();
                this.f11322n.a(obj);
            }
            this.A = false;
        } catch (Throwable th) {
            this.A = false;
            throw th;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(int i, int i10) throws Throwable {
        Object obj;
        a6.i iVar;
        boolean z2;
        boolean z10;
        Executor executor;
        Object obj2;
        h hVar = this;
        int iRound = i;
        hVar.f11312b.a();
        Object obj3 = hVar.f11313c;
        synchronized (obj3) {
            try {
                try {
                    boolean z11 = D;
                    if (z11) {
                        hVar.e("Got onSizeReady in " + v6.h.a(hVar.f11328t));
                    }
                    if (hVar.C == 3) {
                        hVar.C = 2;
                        hVar.f11318j.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        hVar.f11333y = iRound;
                        hVar.f11334z = i10 == Integer.MIN_VALUE ? i10 : Math.round(1.0f * i10);
                        if (z11) {
                            hVar.e("finished setup for calling load in " + v6.h.a(hVar.f11328t));
                        }
                        m mVar = hVar.f11329u;
                        com.bumptech.glide.g gVar = hVar.f11316g;
                        Object obj4 = hVar.f11317h;
                        a aVar = hVar.f11318j;
                        a6.f fVar = aVar.C;
                        try {
                            int i11 = hVar.f11333y;
                            int i12 = hVar.f11334z;
                            Class cls = aVar.G;
                            try {
                                Class cls2 = hVar.i;
                                com.bumptech.glide.h hVar2 = hVar.f11321m;
                                l lVar = aVar.f11297w;
                                try {
                                    v6.c cVar = aVar.F;
                                    boolean z12 = aVar.D;
                                    boolean z13 = aVar.J;
                                    try {
                                        iVar = aVar.E;
                                        z2 = aVar.f11300z;
                                        z10 = aVar.K;
                                        executor = hVar.f11325q;
                                        obj2 = obj3;
                                    } catch (Throwable th) {
                                        th = th;
                                        obj = obj3;
                                    }
                                    try {
                                        hVar.f11327s = mVar.a(gVar, obj4, fVar, i11, i12, cls, cls2, hVar2, lVar, cVar, z12, z13, iVar, z2, z10, hVar, executor);
                                        if (hVar.C != 2) {
                                            hVar.f11327s = null;
                                        }
                                        if (z11) {
                                            hVar.e("finished onSizeReady in " + v6.h.a(hVar.f11328t));
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj = obj2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = obj3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj = obj3;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            obj = obj3;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    obj = obj3;
                }
            } catch (Throwable th7) {
                th = th7;
                obj = hVar;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f11313c) {
            obj = this.f11317h;
            cls = this.i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
