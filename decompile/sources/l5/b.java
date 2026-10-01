package l5;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import j5.a0;
import j5.w;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements m5.a, l, f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f8170e;
    public final r5.a f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f8172h;
    public final k5.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m5.i f8173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m5.f f8174k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f8175l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m5.i f8176m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m5.s f8177n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m5.e f8178o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f8179p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f8166a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f8167b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f8168c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f8169d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f8171g = new ArrayList();

    public b(w wVar, r5.a aVar, Paint.Cap cap, Paint.Join join, float f, p5.a aVar2, p5.b bVar, ArrayList arrayList, p5.b bVar2) {
        k5.a aVar3 = new k5.a(1, 0);
        this.i = aVar3;
        this.f8179p = 0.0f;
        this.f8170e = wVar;
        this.f = aVar;
        aVar3.setStyle(Paint.Style.STROKE);
        aVar3.setStrokeCap(cap);
        aVar3.setStrokeJoin(join);
        aVar3.setStrokeMiter(f);
        this.f8174k = (m5.f) aVar2.f();
        this.f8173j = bVar.f();
        if (bVar2 == null) {
            this.f8176m = null;
        } else {
            this.f8176m = bVar2.f();
        }
        this.f8175l = new ArrayList(arrayList.size());
        this.f8172h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f8175l.add(((p5.b) arrayList.get(i)).f());
        }
        aVar.d(this.f8174k);
        aVar.d(this.f8173j);
        for (int i10 = 0; i10 < this.f8175l.size(); i10++) {
            aVar.d((m5.e) this.f8175l.get(i10));
        }
        m5.i iVar = this.f8176m;
        if (iVar != null) {
            aVar.d(iVar);
        }
        this.f8174k.a(this);
        this.f8173j.a(this);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((m5.e) this.f8175l.get(i11)).a(this);
        }
        m5.i iVar2 = this.f8176m;
        if (iVar2 != null) {
            iVar2.a(this);
        }
        if (aVar.l() != null) {
            m5.i iVarF = ((p5.b) aVar.l().f7607v).f();
            this.f8178o = iVarF;
            iVarF.a(this);
            aVar.d(this.f8178o);
        }
    }

    @Override // l5.f
    public final void a(RectF rectF, Matrix matrix, boolean z2) {
        Path path = this.f8167b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8171g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.f8169d;
                path.computeBounds(rectF2, false);
                float fL = this.f8173j.l() / 2.0f;
                rectF2.set(rectF2.left - fL, rectF2.top - fL, rectF2.right + fL, rectF2.bottom + fL);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            a aVar = (a) arrayList.get(i);
            for (int i10 = 0; i10 < aVar.f8164a.size(); i10++) {
                path.addPath(((n) aVar.f8164a.get(i10)).f(), matrix);
            }
            i++;
        }
    }

    @Override // m5.a
    public final void b() {
        this.f8170e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    @Override // l5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.util.List r8, java.util.List r9) {
        /*
            r7 = this;
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        La:
            r3 = 2
            if (r0 < 0) goto L21
            java.lang.Object r4 = r8.get(r0)
            l5.d r4 = (l5.d) r4
            boolean r5 = r4 instanceof l5.u
            if (r5 == 0) goto L1e
            l5.u r4 = (l5.u) r4
            int r5 = r4.f8290c
            if (r5 != r3) goto L1e
            r2 = r4
        L1e:
            int r0 = r0 + (-1)
            goto La
        L21:
            if (r2 == 0) goto L26
            r2.d(r7)
        L26:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2c:
            java.util.ArrayList r0 = r7.f8171g
            if (r8 < 0) goto L65
            java.lang.Object r4 = r9.get(r8)
            l5.d r4 = (l5.d) r4
            boolean r5 = r4 instanceof l5.u
            if (r5 == 0) goto L50
            r5 = r4
            l5.u r5 = (l5.u) r5
            int r6 = r5.f8290c
            if (r6 != r3) goto L50
            if (r1 == 0) goto L46
            r0.add(r1)
        L46:
            l5.a r0 = new l5.a
            r0.<init>(r5)
            r5.d(r7)
            r1 = r0
            goto L62
        L50:
            boolean r0 = r4 instanceof l5.n
            if (r0 == 0) goto L62
            if (r1 != 0) goto L5b
            l5.a r1 = new l5.a
            r1.<init>(r2)
        L5b:
            java.util.ArrayList r0 = r1.f8164a
            l5.n r4 = (l5.n) r4
            r0.add(r4)
        L62:
            int r8 = r8 + (-1)
            goto L2c
        L65:
            if (r1 == 0) goto L6a
            r0.add(r1)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.b.c(java.util.List, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01f0  */
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
    @Override // l5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23, v5.a r24) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.b.e(android.graphics.Canvas, android.graphics.Matrix, int, v5.a):void");
    }

    @Override // o5.f
    public void g(Object obj, p2.c cVar) {
        PointF pointF = a0.f6788a;
        if (obj == 4) {
            this.f8174k.j(cVar);
            return;
        }
        if (obj == a0.f6802q) {
            this.f8173j.j(cVar);
            return;
        }
        ColorFilter colorFilter = a0.I;
        r5.a aVar = this.f;
        if (obj == colorFilter) {
            m5.s sVar = this.f8177n;
            if (sVar != null) {
                aVar.o(sVar);
            }
            m5.s sVar2 = new m5.s(null, cVar);
            this.f8177n = sVar2;
            sVar2.a(this);
            aVar.d(this.f8177n);
            return;
        }
        if (obj == a0.f6792e) {
            m5.e eVar = this.f8178o;
            if (eVar != null) {
                eVar.j(cVar);
                return;
            }
            m5.s sVar3 = new m5.s(null, cVar);
            this.f8178o = sVar3;
            sVar3.a(this);
            aVar.d(this.f8178o);
        }
    }

    @Override // o5.f
    public final void h(o5.e eVar, int i, ArrayList arrayList, o5.e eVar2) {
        v5.g.g(eVar, i, arrayList, eVar2, this);
    }
}
