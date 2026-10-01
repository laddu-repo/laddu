package o2;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f9509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2.c f9510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k8.z f9511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9513e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f9514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f9515h;
    public boolean i;

    public q(p2.c cVar) {
        this(cVar, new w2.m());
    }

    public static c0 e(Class cls, y1.g gVar) {
        try {
            return (c0) cls.getConstructor(y1.g.class).newInstance(gVar);
        } catch (Exception e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // o2.c0
    public final c0 a(boolean z2) {
        this.i = z2;
        p pVar = this.f9509a;
        pVar.f9502v = z2;
        w2.m mVar = (w2.m) pVar.f9503w;
        synchronized (mVar) {
            mVar.f13842b = z2;
        }
        Iterator it = ((HashMap) pVar.f9505y).values().iterator();
        while (it.hasNext()) {
            ((c0) it.next()).a(z2);
        }
        return this;
    }

    @Override // o2.c0
    public final c0 b() {
        p pVar = this.f9509a;
        pVar.getClass();
        synchronized (((w2.m) pVar.f9503w)) {
        }
        return this;
    }

    @Override // o2.c0
    public final c0 c(k8.z zVar) {
        this.f9511c = zVar;
        p pVar = this.f9509a;
        pVar.A = zVar;
        w2.m mVar = (w2.m) pVar.f9503w;
        synchronized (mVar) {
            mVar.f13843c = zVar;
        }
        Iterator it = ((HashMap) pVar.f9505y).values().iterator();
        while (it.hasNext()) {
            ((c0) it.next()).c(zVar);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o2.c0
    public final a d(t1.z zVar) {
        int i;
        Uri uri;
        String str;
        long j8;
        t1.w wVar;
        t1.z zVar2 = zVar;
        zVar2.f12179b.getClass();
        String scheme = zVar2.f12179b.f12129a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(zVar2.f12179b.f12130b, "application/x-image-uri")) {
            long j9 = zVar2.f12179b.f;
            int i10 = w1.b0.f13686a;
            throw null;
        }
        t1.w wVar2 = zVar2.f12179b;
        int iF = w1.b0.F(wVar2.f12129a, wVar2.f12130b);
        if (zVar2.f12179b.f != -9223372036854775807L) {
            w2.m mVar = (w2.m) this.f9509a.f9503w;
            synchronized (mVar) {
                mVar.f13844d = 1;
            }
        }
        try {
            p pVar = this.f9509a;
            HashMap map = (HashMap) pVar.f9505y;
            c0 c0Var = (c0) map.get(Integer.valueOf(iF));
            if (c0Var == null) {
                c0Var = (c0) pVar.c(iF).get();
                c0Var.c((k8.z) pVar.A);
                c0Var.a(pVar.f9502v);
                c0Var.b();
                map.put(Integer.valueOf(iF), c0Var);
            }
            g2.t tVarA = zVar2.f12180c.a();
            t1.v vVar = zVar2.f12180c;
            if (vVar.f12123a == -9223372036854775807L) {
                tVarA.f5476a = this.f9512d;
            }
            if (vVar.f12126d == -3.4028235E38f) {
                tVarA.f5479d = this.f9514g;
            }
            if (vVar.f12127e == -3.4028235E38f) {
                tVarA.f5480e = this.f9515h;
            }
            if (vVar.f12124b == -9223372036854775807L) {
                tVarA.f5477b = this.f9513e;
            }
            if (vVar.f12125c == -9223372036854775807L) {
                tVarA.f5478c = this.f;
            }
            t1.v vVar2 = new t1.v(tVarA);
            if (vVar2.equals(zVar2.f12180c)) {
                i = 1;
            } else {
                p pVar2 = new p();
                List list = Collections.EMPTY_LIST;
                y9.f0 f0Var = y9.z0.f14637z;
                t1.x xVar = t1.x.f12153a;
                t1.t tVar = zVar2.f12182e;
                t1.r rVar = new t1.r();
                rVar.f12092a = tVar.f12109a;
                String str2 = zVar2.f12178a;
                t1.c0 c0Var2 = zVar2.f12181d;
                zVar2.f12180c.a();
                t1.x xVar2 = zVar2.f;
                t1.w wVar3 = zVar2.f12179b;
                if (wVar3 != null) {
                    String str3 = wVar3.f12130b;
                    Uri uri2 = wVar3.f12129a;
                    list = wVar3.f12132d;
                    f0Var = wVar3.f12133e;
                    t1.u uVar = wVar3.f12131c;
                    p pVarA = uVar != null ? uVar.a() : new p();
                    i = 1;
                    str = str3;
                    j8 = wVar3.f;
                    pVar2 = pVarA;
                    uri = uri2;
                } else {
                    i = 1;
                    uri = null;
                    str = null;
                    j8 = -9223372036854775807L;
                }
                List list2 = list;
                y9.f0 f0Var2 = f0Var;
                g2.t tVarA2 = vVar2.a();
                w1.a.j((((Uri) pVar2.f9504x) == null || ((UUID) pVar2.f9503w) != null) ? i : 0);
                if (uri != null) {
                    wVar = new t1.w(uri, str, ((UUID) pVar2.f9503w) != null ? new t1.u(pVar2) : null, list2, f0Var2, j8);
                } else {
                    wVar = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = str2;
                t1.t tVar2 = new t1.t(rVar);
                t1.v vVar3 = new t1.v(tVarA2);
                if (c0Var2 == null) {
                    c0Var2 = t1.c0.B;
                }
                zVar2 = new t1.z(str4, tVar2, wVar, vVar3, c0Var2, xVar2);
            }
            a aVarD = c0Var.d(zVar2);
            y9.f0 f0Var3 = zVar2.f12179b.f12133e;
            if (!f0Var3.isEmpty()) {
                a[] aVarArr = new a[f0Var3.size() + 1];
                aVarArr[0] = aVarD;
                if (f0Var3.size() > 0) {
                    if (!this.i) {
                        this.f9510b.getClass();
                        t1.y yVar = (t1.y) f0Var3.get(0);
                        int i11 = i;
                        new ArrayList(i11);
                        new HashSet(i11);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        y9.c0 c0Var3 = y9.f0.f14553w;
                        y9.z0 z0Var = y9.z0.f14637z;
                        List list3 = Collections.EMPTY_LIST;
                        y9.z0 z0Var2 = y9.z0.f14637z;
                        t1.x xVar3 = t1.x.f12153a;
                        Uri uri3 = Uri.EMPTY;
                        yVar.getClass();
                        throw null;
                    }
                    t1.n nVar = new t1.n();
                    ((t1.y) f0Var3.get(0)).getClass();
                    ArrayList arrayList = t1.f0.f11993a;
                    nVar.f12036m = null;
                    ((t1.y) f0Var3.get(0)).getClass();
                    nVar.f12029d = null;
                    ((t1.y) f0Var3.get(0)).getClass();
                    nVar.f12030e = 0;
                    ((t1.y) f0Var3.get(0)).getClass();
                    nVar.f = 0;
                    ((t1.y) f0Var3.get(0)).getClass();
                    nVar.f12027b = null;
                    ((t1.y) f0Var3.get(0)).getClass();
                    nVar.f12026a = null;
                    t1.o oVar = new t1.o(nVar);
                    if (this.f9511c.i(oVar)) {
                        t1.n nVarA = oVar.a();
                        nVarA.f12036m = t1.f0.p("application/x-media3-cues");
                        nVarA.f12033j = oVar.f12061n;
                        nVarA.K = this.f9511c.e(oVar);
                        new t1.o(nVarA);
                    }
                    ((t1.y) f0Var3.get(0)).getClass();
                    throw null;
                }
                aVarD = new o0(aVarArr);
            }
            t1.t tVar3 = zVar2.f12182e;
            if (tVar3.f12109a != Long.MIN_VALUE) {
                e eVar = new e(aVarD);
                w1.a.j(!eVar.f9412d);
                long j10 = tVar3.f12109a;
                w1.a.j(!eVar.f9412d);
                eVar.f9410b = j10;
                w1.a.j(!eVar.f9412d);
                eVar.f9411c = true;
                w1.a.j(!eVar.f9412d);
                w1.a.j(!eVar.f9412d);
                w1.a.j(!eVar.f9412d);
                eVar.f9412d = true;
                aVarD = new h(eVar);
            }
            zVar2.f12179b.getClass();
            zVar2.f12179b.getClass();
            return aVarD;
        } catch (ClassNotFoundException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public q(p2.c cVar, w2.m mVar) {
        this.f9510b = cVar;
        k8.z zVar = new k8.z(28);
        this.f9511c = zVar;
        p pVar = new p();
        pVar.f9503w = mVar;
        pVar.A = zVar;
        pVar.f9504x = new HashMap();
        pVar.f9505y = new HashMap();
        pVar.f9502v = true;
        this.f9509a = pVar;
        if (cVar != ((p2.c) pVar.f9506z)) {
            pVar.f9506z = cVar;
            ((HashMap) pVar.f9504x).clear();
            ((HashMap) pVar.f9505y).clear();
        }
        this.f9512d = -9223372036854775807L;
        this.f9513e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.f9514g = -3.4028235E38f;
        this.f9515h = -3.4028235E38f;
        this.i = true;
    }
}
