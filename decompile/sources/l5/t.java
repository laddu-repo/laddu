package l5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import j5.a0;
import j5.w;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t extends b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r5.a f8283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f8284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f8285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m5.f f8286t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m5.s f8287u;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(w wVar, r5.a aVar, q5.o oVar) {
        int iC = y.e.c(oVar.f10873g);
        Paint.Cap cap = iC != 0 ? iC != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iC2 = y.e.c(oVar.f10874h);
        super(wVar, aVar, cap, iC2 != 0 ? iC2 != 1 ? iC2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, oVar.i, oVar.f10872e, oVar.f, oVar.f10870c, oVar.f10869b);
        this.f8283q = aVar;
        this.f8284r = oVar.f10868a;
        this.f8285s = oVar.f10875j;
        m5.e eVarF = oVar.f10871d.f();
        this.f8286t = (m5.f) eVarF;
        eVarF.a(this);
        aVar.d(eVarF);
    }

    @Override // l5.b, l5.f
    public final void e(Canvas canvas, Matrix matrix, int i, v5.a aVar) {
        if (this.f8285s) {
            return;
        }
        m5.f fVar = this.f8286t;
        int iL = fVar.l(fVar.f8457c.i(), fVar.c());
        k5.a aVar2 = this.i;
        aVar2.setColor(iL);
        m5.s sVar = this.f8287u;
        if (sVar != null) {
            aVar2.setColorFilter((ColorFilter) sVar.e());
        }
        super.e(canvas, matrix, i, aVar);
    }

    @Override // l5.b, o5.f
    public final void g(Object obj, p2.c cVar) {
        super.g(obj, cVar);
        PointF pointF = a0.f6788a;
        m5.f fVar = this.f8286t;
        if (obj == 2) {
            fVar.j(cVar);
            return;
        }
        if (obj == a0.I) {
            m5.s sVar = this.f8287u;
            r5.a aVar = this.f8283q;
            if (sVar != null) {
                aVar.o(sVar);
            }
            m5.s sVar2 = new m5.s(null, cVar);
            this.f8287u = sVar2;
            sVar2.a(this);
            aVar.d(fVar);
        }
    }

    @Override // l5.d
    public final String getName() {
        return this.f8284r;
    }
}
