package r5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import j5.a0;
import j5.j;
import j5.w;
import j5.y;
import java.util.HashMap;
import m5.s;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    public final k5.a D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final y H;
    public s I;
    public s J;
    public final m5.h K;
    public v5.h L;
    public c6.i M;

    public c(w wVar, d dVar) {
        super(wVar, dVar);
        this.D = new k5.a(3, 0);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = dVar.f11269g;
        j jVar = wVar.f6908v;
        this.H = jVar == null ? null : (y) ((HashMap) jVar.c()).get(str);
        ad.c cVar = this.f11253p.f11285x;
        if (cVar != null) {
            this.K = new m5.h(this, this, cVar);
        }
    }

    @Override // r5.a, l5.f
    public final void a(RectF rectF, Matrix matrix, boolean z2) {
        Bitmap bitmapS;
        super.a(rectF, matrix, z2);
        y yVar = this.H;
        if (yVar != null) {
            int i = yVar.f6916b;
            int i10 = yVar.f6915a;
            float fC = v5.i.c();
            if (this.f11252o.H || (bitmapS = s()) == null) {
                rectF.set(0.0f, 0.0f, i10 * fC, i * fC);
            } else {
                rectF.set(0.0f, 0.0f, bitmapS.getWidth() * fC, bitmapS.getHeight() * fC);
            }
            this.f11251n.mapRect(rectF);
        }
    }

    @Override // r5.a, o5.f
    public final void g(Object obj, p2.c cVar) {
        super.g(obj, cVar);
        if (obj == a0.I) {
            this.I = new s(null, cVar);
            return;
        }
        if (obj == a0.L) {
            this.J = new s(null, cVar);
            return;
        }
        m5.h hVar = this.K;
        if (obj == 5 && hVar != null) {
            hVar.f8465c.j(cVar);
            return;
        }
        if (obj == a0.E && hVar != null) {
            hVar.c(cVar);
            return;
        }
        if (obj == a0.F && hVar != null) {
            hVar.f8467e.j(cVar);
            return;
        }
        if (obj == a0.G && hVar != null) {
            hVar.f.j(cVar);
        } else {
            if (obj != a0.H || hVar == null) {
                return;
            }
            hVar.f8468g.j(cVar);
        }
    }

    @Override // r5.a
    public final void k(Canvas canvas, Matrix matrix, int i, v5.a aVar) {
        y yVar;
        Bitmap bitmapS = s();
        if (bitmapS == null || bitmapS.isRecycled() || (yVar = this.H) == null) {
            return;
        }
        float fC = v5.i.c();
        k5.a aVar2 = this.D;
        aVar2.setAlpha(i);
        s sVar = this.I;
        if (sVar != null) {
            aVar2.setColorFilter((ColorFilter) sVar.e());
        }
        m5.h hVar = this.K;
        if (hVar != null) {
            aVar = hVar.a(matrix, i);
        }
        int width = bitmapS.getWidth();
        int height = bitmapS.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean z2 = this.f11252o.H;
        Rect rect2 = this.F;
        if (z2) {
            rect2.set(0, 0, (int) (yVar.f6915a * fC), (int) (yVar.f6916b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmapS.getWidth() * fC), (int) (bitmapS.getHeight() * fC));
        }
        boolean z10 = aVar != null;
        if (z10) {
            if (this.L == null) {
                this.L = new v5.h();
            }
            if (this.M == null) {
                this.M = new c6.i(10, (byte) 0);
            }
            c6.i iVar = this.M;
            iVar.f2194w = 255;
            iVar.f2195x = null;
            aVar.getClass();
            v5.a aVar3 = new v5.a(aVar);
            iVar.f2195x = aVar3;
            aVar3.b(i);
            float f = rect2.left;
            float f4 = rect2.top;
            float f10 = rect2.right;
            float f11 = rect2.bottom;
            RectF rectF = this.G;
            rectF.set(f, f4, f10, f11);
            matrix.mapRect(rectF);
            canvas = this.L.e(canvas, rectF, this.M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapS, rect, rect2, aVar2);
        if (z10) {
            this.L.c();
            if (this.L.f13186c == 4) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap s() {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.c.s():android.graphics.Bitmap");
    }
}
