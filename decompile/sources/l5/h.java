package l5;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import j5.a0;
import j5.w;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f, m5.a, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f8198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k5.a f8199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r5.a f8200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8202e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m5.f f8203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m5.f f8204h;
    public m5.s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f8205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m5.e f8206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f8207l;

    public h(w wVar, r5.a aVar, q5.l lVar) {
        Path path = new Path();
        this.f8198a = path;
        this.f8199b = new k5.a(1, 0);
        this.f = new ArrayList();
        this.f8200c = aVar;
        String str = lVar.f10858c;
        p5.a aVar2 = lVar.f10860e;
        p5.a aVar3 = lVar.f10859d;
        this.f8201d = str;
        this.f8202e = lVar.f;
        this.f8205j = wVar;
        if (aVar.l() != null) {
            m5.i iVarF = ((p5.b) aVar.l().f7607v).f();
            this.f8206k = iVarF;
            iVarF.a(this);
            aVar.d(this.f8206k);
        }
        if (aVar3 == null) {
            this.f8203g = null;
            this.f8204h = null;
            return;
        }
        path.setFillType(lVar.f10857b);
        m5.e eVarF = aVar3.f();
        this.f8203g = (m5.f) eVarF;
        eVarF.a(this);
        aVar.d(eVarF);
        m5.e eVarF2 = aVar2.f();
        this.f8204h = (m5.f) eVarF2;
        eVarF2.a(this);
        aVar.d(eVarF2);
    }

    @Override // l5.f
    public final void a(RectF rectF, Matrix matrix, boolean z2) {
        Path path = this.f8198a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((n) arrayList.get(i)).f(), matrix);
                i++;
            }
        }
    }

    @Override // m5.a
    public final void b() {
        this.f8205j.invalidateSelf();
    }

    @Override // l5.d
    public final void c(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            d dVar = (d) list2.get(i);
            if (dVar instanceof n) {
                this.f.add((n) dVar);
            }
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
    @Override // l5.f
    public final void e(Canvas canvas, Matrix matrix, int i, v5.a aVar) {
        MaskFilter maskFilter;
        if (this.f8202e) {
            return;
        }
        m5.f fVar = this.f8203g;
        float fIntValue = ((Integer) this.f8204h.e()).intValue() / 100.0f;
        int iC = (v5.g.c((int) (i * fIntValue)) << 24) | (fVar.l(fVar.f8457c.i(), fVar.c()) & 16777215);
        k5.a aVar2 = this.f8199b;
        aVar2.setColor(iC);
        m5.s sVar = this.i;
        if (sVar != null) {
            aVar2.setColorFilter((ColorFilter) sVar.e());
        }
        m5.e eVar = this.f8206k;
        if (eVar != null) {
            float fFloatValue = ((Float) eVar.e()).floatValue();
            if (fFloatValue == 0.0f) {
                aVar2.setMaskFilter(null);
            } else if (fFloatValue != this.f8207l) {
                r5.a aVar3 = this.f8200c;
                if (aVar3.A == fFloatValue) {
                    maskFilter = aVar3.B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    aVar3.B = blurMaskFilter;
                    aVar3.A = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                aVar2.setMaskFilter(maskFilter);
            }
            this.f8207l = fFloatValue;
        }
        if (aVar != null) {
            aVar.a((int) (fIntValue * 255.0f), aVar2);
        } else {
            aVar2.clearShadowLayer();
        }
        Path path = this.f8198a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i10 >= arrayList.size()) {
                canvas.drawPath(path, aVar2);
                return;
            } else {
                path.addPath(((n) arrayList.get(i10)).f(), matrix);
                i10++;
            }
        }
    }

    @Override // o5.f
    public final void g(Object obj, p2.c cVar) {
        PointF pointF = a0.f6788a;
        if (obj == 1) {
            this.f8203g.j(cVar);
            return;
        }
        if (obj == 4) {
            this.f8204h.j(cVar);
            return;
        }
        ColorFilter colorFilter = a0.I;
        r5.a aVar = this.f8200c;
        if (obj == colorFilter) {
            m5.s sVar = this.i;
            if (sVar != null) {
                aVar.o(sVar);
            }
            m5.s sVar2 = new m5.s(null, cVar);
            this.i = sVar2;
            sVar2.a(this);
            aVar.d(this.i);
            return;
        }
        if (obj == a0.f6792e) {
            m5.e eVar = this.f8206k;
            if (eVar != null) {
                eVar.j(cVar);
                return;
            }
            m5.s sVar3 = new m5.s(null, cVar);
            this.f8206k = sVar3;
            sVar3.a(this);
            aVar.d(this.f8206k);
        }
    }

    @Override // l5.d
    public final String getName() {
        return this.f8201d;
    }

    @Override // o5.f
    public final void h(o5.e eVar, int i, ArrayList arrayList, o5.e eVar2) {
        v5.g.g(eVar, i, arrayList, eVar2, this);
    }
}
