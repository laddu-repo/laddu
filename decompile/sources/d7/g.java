package d7;

import android.graphics.Path;
import android.graphics.PointF;
import b7.c0;
import b7.y;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements n, e7.a, l {

    /* renamed from: b, reason: collision with root package name */
    public final String f3863b;

    /* renamed from: c, reason: collision with root package name */
    public final y f3864c;

    /* renamed from: d, reason: collision with root package name */
    public final e7.j f3865d;

    /* renamed from: e, reason: collision with root package name */
    public final e7.e f3866e;

    /* renamed from: f, reason: collision with root package name */
    public final i7.a f3867f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3869h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f3862a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final c f3868g = new c();

    public g(y yVar, j7.a aVar, i7.a aVar2) {
        this.f3863b = aVar2.f6625a;
        this.f3864c = yVar;
        e7.e G0 = aVar2.f6627c.G0();
        this.f3865d = (e7.j) G0;
        e7.e G02 = aVar2.f6626b.G0();
        this.f3866e = G02;
        this.f3867f = aVar2;
        aVar.f(G0);
        aVar.f(G02);
        G0.a(this);
        G02.a(this);
    }

    @Override // e7.a
    public final void a() {
        this.f3869h = false;
        this.f3864c.invalidateSelf();
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
                        this.f3868g.f3850x.add(uVar);
                        uVar.d(this);
                    }
                }
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // g7.f
    public final void d(f0 f0Var, Object obj) {
        if (obj == c0.f1495f) {
            this.f3865d.j(f0Var);
        } else if (obj == c0.f1498i) {
            this.f3866e.j(f0Var);
        }
    }

    @Override // d7.n
    public final Path g() {
        boolean z10 = this.f3869h;
        Path path = this.f3862a;
        if (z10) {
            return path;
        }
        path.reset();
        i7.a aVar = this.f3867f;
        if (aVar.f6629e) {
            this.f3869h = true;
            return path;
        }
        PointF pointF = (PointF) this.f3865d.e();
        float f3 = pointF.x / 2.0f;
        float f10 = pointF.y / 2.0f;
        float f11 = f3 * 0.55228f;
        float f12 = f10 * 0.55228f;
        path.reset();
        if (aVar.f6628d) {
            float f13 = -f10;
            path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f13);
            float f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f11;
            float f15 = -f3;
            float f16 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f12;
            path.cubicTo(f14, f13, f15, f16, f15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f17 = f12 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path.cubicTo(f15, f17, f14, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10);
            float f18 = f11 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path.cubicTo(f18, f10, f3, f17, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.cubicTo(f3, f16, f18, f13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f13);
        } else {
            float f19 = -f10;
            path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f19);
            float f20 = f11 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f21 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f12;
            path.cubicTo(f20, f19, f3, f21, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f22 = f12 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path.cubicTo(f3, f22, f20, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10);
            float f23 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f11;
            float f24 = -f3;
            path.cubicTo(f23, f10, f24, f22, f24, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.cubicTo(f24, f21, f23, f19, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f19);
        }
        PointF pointF2 = (PointF) this.f3866e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f3868g.a(path);
        this.f3869h = true;
        return path;
    }

    @Override // d7.d
    public final String getName() {
        return this.f3863b;
    }

    @Override // g7.f
    public final void h(g7.e eVar, int i6, ArrayList arrayList, g7.e eVar2) {
        n7.g.g(eVar, i6, arrayList, eVar2, this);
    }
}
