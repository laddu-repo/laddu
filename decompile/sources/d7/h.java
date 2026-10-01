package d7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import b7.c0;
import b7.y;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements f, e7.a, l {

    /* renamed from: a, reason: collision with root package name */
    public final Path f3870a;

    /* renamed from: b, reason: collision with root package name */
    public final c7.a f3871b;

    /* renamed from: c, reason: collision with root package name */
    public final j7.a f3872c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3873d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3874e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3875f;

    /* renamed from: g, reason: collision with root package name */
    public final e7.f f3876g;

    /* renamed from: h, reason: collision with root package name */
    public final e7.f f3877h;

    /* renamed from: i, reason: collision with root package name */
    public e7.s f3878i;
    public final y j;

    /* renamed from: k, reason: collision with root package name */
    public e7.e f3879k;

    /* renamed from: l, reason: collision with root package name */
    public float f3880l;

    public h(y yVar, j7.a aVar, i7.l lVar) {
        Path path = new Path();
        this.f3870a = path;
        this.f3871b = new c7.a(1, 0);
        this.f3875f = new ArrayList();
        this.f3872c = aVar;
        String str = lVar.f6680c;
        h7.a aVar2 = lVar.f6682e;
        h7.a aVar3 = lVar.f6681d;
        this.f3873d = str;
        this.f3874e = lVar.f6683f;
        this.j = yVar;
        if (aVar.l() != null) {
            e7.i G0 = ((h7.b) aVar.l().f7747y).G0();
            this.f3879k = G0;
            G0.a(this);
            aVar.f(this.f3879k);
        }
        if (aVar3 != null) {
            path.setFillType(lVar.f6679b);
            e7.e G02 = aVar3.G0();
            this.f3876g = (e7.f) G02;
            G02.a(this);
            aVar.f(G02);
            e7.e G03 = aVar2.G0();
            this.f3877h = (e7.f) G03;
            G03.a(this);
            aVar.f(G03);
            return;
        }
        this.f3876g = null;
        this.f3877h = null;
    }

    @Override // e7.a
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // d7.d
    public final void b(List list, List list2) {
        for (int i6 = 0; i6 < list2.size(); i6++) {
            d dVar = (d) list2.get(i6);
            if (dVar instanceof n) {
                this.f3875f.add((n) dVar);
            }
        }
    }

    @Override // d7.f
    public final void c(Canvas canvas, Matrix matrix, int i6, n7.a aVar) {
        BlurMaskFilter blurMaskFilter;
        if (this.f3874e) {
            return;
        }
        e7.f fVar = this.f3876g;
        float intValue = ((Integer) this.f3877h.e()).intValue() / 100.0f;
        int c10 = (n7.g.c((int) (i6 * intValue)) << 24) | (fVar.l(fVar.f4406c.e(), fVar.c()) & 16777215);
        c7.a aVar2 = this.f3871b;
        aVar2.setColor(c10);
        e7.s sVar = this.f3878i;
        if (sVar != null) {
            aVar2.setColorFilter((ColorFilter) sVar.e());
        }
        e7.e eVar = this.f3879k;
        if (eVar != null) {
            float floatValue = ((Float) eVar.e()).floatValue();
            if (floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                aVar2.setMaskFilter(null);
            } else if (floatValue != this.f3880l) {
                j7.a aVar3 = this.f3872c;
                if (aVar3.A == floatValue) {
                    blurMaskFilter = aVar3.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    aVar3.B = blurMaskFilter2;
                    aVar3.A = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar2.setMaskFilter(blurMaskFilter);
            }
            this.f3880l = floatValue;
        }
        if (aVar != null) {
            aVar.a((int) (intValue * 255.0f), aVar2);
        } else {
            aVar2.clearShadowLayer();
        }
        Path path = this.f3870a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3875f;
            if (i10 < arrayList.size()) {
                path.addPath(((n) arrayList.get(i10)).g(), matrix);
                i10++;
            } else {
                canvas.drawPath(path, aVar2);
                return;
            }
        }
    }

    @Override // g7.f
    public final void d(f0 f0Var, Object obj) {
        PointF pointF = c0.f1490a;
        if (obj == 1) {
            this.f3876g.j(f0Var);
            return;
        }
        if (obj == 4) {
            this.f3877h.j(f0Var);
            return;
        }
        ColorFilter colorFilter = c0.I;
        j7.a aVar = this.f3872c;
        if (obj == colorFilter) {
            e7.s sVar = this.f3878i;
            if (sVar != null) {
                aVar.o(sVar);
            }
            e7.s sVar2 = new e7.s(f0Var, null);
            this.f3878i = sVar2;
            sVar2.a(this);
            aVar.f(this.f3878i);
            return;
        }
        if (obj == c0.f1494e) {
            e7.e eVar = this.f3879k;
            if (eVar != null) {
                eVar.j(f0Var);
                return;
            }
            e7.s sVar3 = new e7.s(f0Var, null);
            this.f3879k = sVar3;
            sVar3.a(this);
            aVar.f(this.f3879k);
        }
    }

    @Override // d7.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f3870a;
        path.reset();
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f3875f;
            if (i6 < arrayList.size()) {
                path.addPath(((n) arrayList.get(i6)).g(), matrix);
                i6++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    @Override // d7.d
    public final String getName() {
        return this.f3873d;
    }

    @Override // g7.f
    public final void h(g7.e eVar, int i6, ArrayList arrayList, g7.e eVar2) {
        n7.g.g(eVar, i6, arrayList, eVar2, this);
    }
}
