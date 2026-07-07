package l5;

import android.graphics.Path;
import android.graphics.PointF;
import j5.a0;
import j5.w;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements n, m5.a, l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f8193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m5.j f8194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m5.e f8195e;
    public final q5.a f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8197h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f8191a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f8196g = new c(0);

    public g(w wVar, r5.a aVar, q5.a aVar2) {
        this.f8192b = aVar2.f10807a;
        this.f8193c = wVar;
        m5.e eVarF = aVar2.f10809c.f();
        this.f8194d = (m5.j) eVarF;
        m5.e eVarF2 = aVar2.f10808b.f();
        this.f8195e = eVarF2;
        this.f = aVar2;
        aVar.d(eVarF);
        aVar.d(eVarF2);
        eVarF.a(this);
        eVarF2.a(this);
    }

    @Override // m5.a
    public final void b() {
        this.f8197h = false;
        this.f8193c.invalidateSelf();
    }

    @Override // l5.d
    public final void c(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof u) {
                u uVar = (u) dVar;
                if (uVar.f8290c == 1) {
                    this.f8196g.f8180a.add(uVar);
                    uVar.d(this);
                }
            }
            i++;
        }
    }

    @Override // l5.n
    public final Path f() {
        boolean z2 = this.f8197h;
        Path path = this.f8191a;
        if (z2) {
            return path;
        }
        path.reset();
        q5.a aVar = this.f;
        if (aVar.f10811e) {
            this.f8197h = true;
            return path;
        }
        PointF pointF = (PointF) this.f8194d.e();
        float f = pointF.x / 2.0f;
        float f4 = pointF.y / 2.0f;
        float f10 = f * 0.55228f;
        float f11 = f4 * 0.55228f;
        path.reset();
        if (aVar.f10810d) {
            float f12 = -f4;
            path.moveTo(0.0f, f12);
            float f13 = 0.0f - f10;
            float f14 = -f;
            float f15 = 0.0f - f11;
            path.cubicTo(f13, f12, f14, f15, f14, 0.0f);
            float f16 = f11 + 0.0f;
            path.cubicTo(f14, f16, f13, f4, 0.0f, f4);
            float f17 = f10 + 0.0f;
            path.cubicTo(f17, f4, f, f16, f, 0.0f);
            path.cubicTo(f, f15, f17, f12, 0.0f, f12);
        } else {
            float f18 = -f4;
            path.moveTo(0.0f, f18);
            float f19 = f10 + 0.0f;
            float f20 = 0.0f - f11;
            path.cubicTo(f19, f18, f, f20, f, 0.0f);
            float f21 = f11 + 0.0f;
            path.cubicTo(f, f21, f19, f4, 0.0f, f4);
            float f22 = 0.0f - f10;
            float f23 = -f;
            path.cubicTo(f22, f4, f23, f21, f23, 0.0f);
            path.cubicTo(f23, f20, f22, f18, 0.0f, f18);
        }
        PointF pointF2 = (PointF) this.f8195e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f8196g.a(path);
        this.f8197h = true;
        return path;
    }

    @Override // o5.f
    public final void g(Object obj, p2.c cVar) {
        if (obj == a0.f) {
            this.f8194d.j(cVar);
        } else if (obj == a0.i) {
            this.f8195e.j(cVar);
        }
    }

    @Override // l5.d
    public final String getName() {
        return this.f8192b;
    }

    @Override // o5.f
    public final void h(o5.e eVar, int i, ArrayList arrayList, o5.e eVar2) {
        v5.g.g(eVar, i, arrayList, eVar2, this);
    }
}
