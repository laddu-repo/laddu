package l5;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import j5.a0;
import j5.w;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p implements m5.a, l, n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f8261e;
    public final m5.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m5.e f8262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m5.i f8263h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8265k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f8257a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f8258b = new RectF();
    public final c i = new c(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m5.e f8264j = null;

    public p(w wVar, r5.a aVar, q5.i iVar) {
        this.f8259c = iVar.f10848b;
        this.f8260d = iVar.f10850d;
        this.f8261e = wVar;
        m5.e eVarF = iVar.f10851e.f();
        this.f = eVarF;
        m5.e eVarF2 = ((p5.e) iVar.f).f();
        this.f8262g = eVarF2;
        m5.i iVarF = iVar.f10849c.f();
        this.f8263h = iVarF;
        aVar.d(eVarF);
        aVar.d(eVarF2);
        aVar.d(iVarF);
        eVarF.a(this);
        eVarF2.a(this);
        iVarF.a(this);
    }

    @Override // m5.a
    public final void b() {
        this.f8265k = false;
        this.f8261e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // l5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r6 >= r1) goto L34
            java.lang.Object r0 = r0.get(r6)
            l5.d r0 = (l5.d) r0
            boolean r1 = r0 instanceof l5.u
            if (r1 == 0) goto L27
            r1 = r0
            l5.u r1 = (l5.u) r1
            int r2 = r1.f8290c
            r3 = 1
            if (r2 != r3) goto L27
            l5.c r0 = r4.i
            java.util.ArrayList r0 = r0.f8180a
            r0.add(r1)
            r1.d(r4)
            goto L31
        L27:
            boolean r1 = r0 instanceof l5.r
            if (r1 == 0) goto L31
            l5.r r0 = (l5.r) r0
            m5.e r0 = r0.f8275b
            r4.f8264j = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.p.c(java.util.List, java.util.List):void");
    }

    @Override // l5.n
    public final Path f() {
        float f;
        m5.e eVar;
        boolean z2 = this.f8265k;
        Path path = this.f8257a;
        if (z2) {
            return path;
        }
        path.reset();
        if (this.f8260d) {
            this.f8265k = true;
            return path;
        }
        PointF pointF = (PointF) this.f8262g.e();
        float f4 = pointF.x / 2.0f;
        float f10 = pointF.y / 2.0f;
        m5.i iVar = this.f8263h;
        float fL = iVar == null ? 0.0f : iVar.l();
        if (fL == 0.0f && (eVar = this.f8264j) != null) {
            fL = Math.min(((Float) eVar.e()).floatValue(), Math.min(f4, f10));
        }
        float fMin = Math.min(f4, f10);
        if (fL > fMin) {
            fL = fMin;
        }
        PointF pointF2 = (PointF) this.f.e();
        path.moveTo(pointF2.x + f4, (pointF2.y - f10) + fL);
        path.lineTo(pointF2.x + f4, (pointF2.y + f10) - fL);
        RectF rectF = this.f8258b;
        if (fL > 0.0f) {
            float f11 = pointF2.x + f4;
            float f12 = fL * 2.0f;
            f = 2.0f;
            float f13 = pointF2.y + f10;
            rectF.set(f11 - f12, f13 - f12, f11, f13);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f = 2.0f;
        }
        path.lineTo((pointF2.x - f4) + fL, pointF2.y + f10);
        if (fL > 0.0f) {
            float f14 = pointF2.x - f4;
            float f15 = pointF2.y + f10;
            float f16 = fL * f;
            rectF.set(f14, f15 - f16, f16 + f14, f15);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f4, (pointF2.y - f10) + fL);
        if (fL > 0.0f) {
            float f17 = pointF2.x - f4;
            float f18 = pointF2.y - f10;
            float f19 = fL * f;
            rectF.set(f17, f18, f17 + f19, f19 + f18);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f4) - fL, pointF2.y - f10);
        if (fL > 0.0f) {
            float f20 = pointF2.x + f4;
            float f21 = fL * f;
            float f22 = pointF2.y - f10;
            rectF.set(f20 - f21, f22, f20, f21 + f22);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.a(path);
        this.f8265k = true;
        return path;
    }

    @Override // o5.f
    public final void g(Object obj, p2.c cVar) {
        if (obj == a0.f6793g) {
            this.f8262g.j(cVar);
        } else if (obj == a0.i) {
            this.f.j(cVar);
        } else if (obj == a0.f6794h) {
            this.f8263h.j(cVar);
        }
    }

    @Override // l5.d
    public final String getName() {
        return this.f8259c;
    }

    @Override // o5.f
    public final void h(o5.e eVar, int i, ArrayList arrayList, o5.e eVar2) {
        v5.g.g(eVar, i, arrayList, eVar2, this);
    }
}
