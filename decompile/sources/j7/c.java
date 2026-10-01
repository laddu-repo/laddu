package j7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import b7.a0;
import b7.c0;
import b7.j;
import com.unity3d.services.UnityAdsConstants;
import e7.s;
import j1.f0;
import j2.y;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends a {
    public final c7.a D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final a0 H;
    public s I;
    public s J;
    public final e7.h K;
    public n7.h L;
    public y M;

    public c(b7.y yVar, d dVar) {
        super(yVar, dVar);
        a0 a0Var;
        this.D = new c7.a(3, 0);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = dVar.f7272g;
        j jVar = yVar.f1613x;
        if (jVar == null) {
            a0Var = null;
        } else {
            a0Var = (a0) ((HashMap) jVar.c()).get(str);
        }
        this.H = a0Var;
        b4.h hVar = this.f7256p.f7287x;
        if (hVar != null) {
            this.K = new e7.h(this, this, hVar);
        }
    }

    @Override // j7.a, g7.f
    public final void d(f0 f0Var, Object obj) {
        super.d(f0Var, obj);
        if (obj == c0.I) {
            this.I = new s(f0Var, null);
            return;
        }
        if (obj == c0.L) {
            this.J = new s(f0Var, null);
            return;
        }
        e7.h hVar = this.K;
        if (obj == 5 && hVar != null) {
            hVar.f4415c.j(f0Var);
            return;
        }
        if (obj == c0.E && hVar != null) {
            hVar.c(f0Var);
            return;
        }
        if (obj == c0.F && hVar != null) {
            hVar.f4417e.j(f0Var);
            return;
        }
        if (obj == c0.G && hVar != null) {
            hVar.f4418f.j(f0Var);
        } else if (obj == c0.H && hVar != null) {
            hVar.f4419g.j(f0Var);
        }
    }

    @Override // j7.a, d7.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        a0 a0Var = this.H;
        if (a0Var != null) {
            int i6 = a0Var.f1485b;
            int i10 = a0Var.f1484a;
            float c10 = n7.i.c();
            if (this.f7255o.J) {
                rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i10 * c10, i6 * c10);
            } else {
                if (s() != null) {
                    rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r1.getWidth() * c10, r1.getHeight() * c10);
                } else {
                    rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i10 * c10, i6 * c10);
                }
            }
            this.f7254n.mapRect(rectF);
        }
    }

    @Override // j7.a
    public final void k(Canvas canvas, Matrix matrix, int i6, n7.a aVar) {
        a0 a0Var;
        Bitmap s = s();
        if (s != null && !s.isRecycled() && (a0Var = this.H) != null) {
            float c10 = n7.i.c();
            c7.a aVar2 = this.D;
            aVar2.setAlpha(i6);
            s sVar = this.I;
            if (sVar != null) {
                aVar2.setColorFilter((ColorFilter) sVar.e());
            }
            e7.h hVar = this.K;
            if (hVar != null) {
                aVar = hVar.b(matrix, i6);
            }
            int width = s.getWidth();
            int height = s.getHeight();
            Rect rect = this.E;
            boolean z10 = false;
            rect.set(0, 0, width, height);
            boolean z11 = this.f7255o.J;
            Rect rect2 = this.F;
            if (z11) {
                rect2.set(0, 0, (int) (a0Var.f1484a * c10), (int) (a0Var.f1485b * c10));
            } else {
                rect2.set(0, 0, (int) (s.getWidth() * c10), (int) (s.getHeight() * c10));
            }
            if (aVar != null) {
                z10 = true;
            }
            if (z10) {
                if (this.L == null) {
                    this.L = new n7.h();
                }
                if (this.M == null) {
                    this.M = new y((byte) 0, 2);
                }
                y yVar = this.M;
                yVar.f7144y = 255;
                yVar.f7145z = null;
                aVar.getClass();
                n7.a aVar3 = new n7.a(aVar);
                yVar.f7145z = aVar3;
                aVar3.b(i6);
                float f3 = rect2.left;
                float f10 = rect2.top;
                float f11 = rect2.right;
                float f12 = rect2.bottom;
                RectF rectF = this.G;
                rectF.set(f3, f10, f11, f12);
                matrix.mapRect(rectF);
                canvas = this.L.e(canvas, rectF, this.M);
            }
            canvas.save();
            canvas.concat(matrix);
            canvas.drawBitmap(s, rect, rect2, aVar2);
            if (z10) {
                this.L.c();
                if (this.L.f9102c == 4) {
                    return;
                }
            }
            canvas.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r1.D = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r4 == r2) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap s() {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.c.s():android.graphics.Bitmap");
    }
}
