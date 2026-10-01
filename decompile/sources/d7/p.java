package d7;

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
public final class p implements e7.a, l, n {

    /* renamed from: c, reason: collision with root package name */
    public final String f3932c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3933d;

    /* renamed from: e, reason: collision with root package name */
    public final y f3934e;

    /* renamed from: f, reason: collision with root package name */
    public final e7.e f3935f;

    /* renamed from: g, reason: collision with root package name */
    public final e7.e f3936g;

    /* renamed from: h, reason: collision with root package name */
    public final e7.i f3937h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3939k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f3930a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f3931b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    public final c f3938i = new c();
    public e7.e j = null;

    public p(y yVar, j7.a aVar, i7.i iVar) {
        this.f3932c = iVar.f6669b;
        this.f3933d = iVar.f6671d;
        this.f3934e = yVar;
        e7.e G0 = iVar.f6672e.G0();
        this.f3935f = G0;
        e7.e G02 = ((h7.e) iVar.f6673f).G0();
        this.f3936g = G02;
        e7.i G03 = iVar.f6670c.G0();
        this.f3937h = G03;
        aVar.f(G0);
        aVar.f(G02);
        aVar.f(G03);
        G0.a(this);
        G02.a(this);
        G03.a(this);
    }

    @Override // e7.a
    public final void a() {
        this.f3939k = false;
        this.f3934e.invalidateSelf();
    }

    @Override // d7.d
    public final void b(List list, List list2) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i6 < arrayList.size()) {
                d dVar = (d) arrayList.get(i6);
                if (dVar instanceof u) {
                    u uVar = (u) dVar;
                    if (uVar.f3965c == 1) {
                        this.f3938i.f3850x.add(uVar);
                        uVar.d(this);
                        i6++;
                    }
                }
                if (dVar instanceof r) {
                    this.j = ((r) dVar).f3950b;
                }
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // g7.f
    public final void d(f0 f0Var, Object obj) {
        if (obj == c0.f1496g) {
            this.f3936g.j(f0Var);
        } else if (obj == c0.f1498i) {
            this.f3935f.j(f0Var);
        } else if (obj == c0.f1497h) {
            this.f3937h.j(f0Var);
        }
    }

    @Override // d7.n
    public final Path g() {
        float l10;
        float f3;
        e7.e eVar;
        boolean z10 = this.f3939k;
        Path path = this.f3930a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f3933d) {
            this.f3939k = true;
            return path;
        }
        PointF pointF = (PointF) this.f3936g.e();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        e7.i iVar = this.f3937h;
        if (iVar == null) {
            l10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            l10 = iVar.l();
        }
        if (l10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (eVar = this.j) != null) {
            l10 = Math.min(((Float) eVar.e()).floatValue(), Math.min(f10, f11));
        }
        float min = Math.min(f10, f11);
        if (l10 > min) {
            l10 = min;
        }
        PointF pointF2 = (PointF) this.f3935f.e();
        path.moveTo(pointF2.x + f10, (pointF2.y - f11) + l10);
        path.lineTo(pointF2.x + f10, (pointF2.y + f11) - l10);
        RectF rectF = this.f3931b;
        if (l10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f12 = pointF2.x + f10;
            float f13 = l10 * 2.0f;
            f3 = 2.0f;
            float f14 = pointF2.y + f11;
            rectF.set(f12 - f13, f14 - f13, f12, f14);
            path.arcTo(rectF, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false);
        } else {
            f3 = 2.0f;
        }
        path.lineTo((pointF2.x - f10) + l10, pointF2.y + f11);
        if (l10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f15 = pointF2.x - f10;
            float f16 = pointF2.y + f11;
            float f17 = l10 * f3;
            rectF.set(f15, f16 - f17, f17 + f15, f16);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f10, (pointF2.y - f11) + l10);
        if (l10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f18 = pointF2.x - f10;
            float f19 = pointF2.y - f11;
            float f20 = l10 * f3;
            rectF.set(f18, f19, f18 + f20, f20 + f19);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f10) - l10, pointF2.y - f11);
        if (l10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f21 = pointF2.x + f10;
            float f22 = l10 * f3;
            float f23 = pointF2.y - f11;
            rectF.set(f21 - f22, f23, f21, f22 + f23);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f3938i.a(path);
        this.f3939k = true;
        return path;
    }

    @Override // d7.d
    public final String getName() {
        return this.f3932c;
    }

    @Override // g7.f
    public final void h(g7.e eVar, int i6, ArrayList arrayList, g7.e eVar2) {
        n7.g.g(eVar, i6, arrayList, eVar2, this);
    }
}
