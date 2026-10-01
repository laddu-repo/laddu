package e7;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4421i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i6, List list) {
        super(list);
        this.f4421i = i6;
        switch (i6) {
            case 1:
                super(list);
                this.j = new PointF();
                return;
            case 2:
                super(list);
                this.j = new o7.c();
                return;
            default:
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i7.c cVar = (i7.c) ((o7.a) list.get(i11)).f10013b;
                    if (cVar != null) {
                        i10 = Math.max(i10, cVar.f6631b.length);
                    }
                }
                this.j = new i7.c(new float[i10], new int[i10]);
                return;
        }
    }

    @Override // e7.e
    public final Object f(o7.a aVar, float f3) {
        Object obj;
        float f10;
        switch (this.f4421i) {
            case 0:
                i7.c cVar = (i7.c) this.j;
                i7.c cVar2 = (i7.c) aVar.f10013b;
                i7.c cVar3 = (i7.c) aVar.f10014c;
                int[] iArr = cVar.f6631b;
                float[] fArr = cVar.f6630a;
                boolean equals = cVar2.equals(cVar3);
                int[] iArr2 = cVar2.f6631b;
                if (equals) {
                    cVar.a(cVar2);
                } else if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    cVar.a(cVar2);
                } else if (f3 >= 1.0f) {
                    cVar.a(cVar3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = cVar3.f6631b;
                    if (length == iArr3.length) {
                        for (int i6 = 0; i6 < iArr2.length; i6++) {
                            fArr[i6] = n7.g.f(cVar2.f6630a[i6], cVar3.f6630a[i6], f3);
                            iArr[i6] = a8.g.i(f3, iArr2[i6], iArr3[i6]);
                        }
                        for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                            fArr[length2] = fArr[iArr2.length - 1];
                            iArr[length2] = iArr[iArr2.length - 1];
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb2.append(iArr2.length);
                        sb2.append(" vs ");
                        throw new IllegalArgumentException(r4.a.l(sb2, iArr3.length, ")"));
                    }
                }
                return cVar;
            case 1:
                return l(aVar, f3, f3, f3);
            default:
                o7.c cVar4 = (o7.c) this.j;
                Object obj2 = aVar.f10013b;
                if (obj2 != null && (obj = aVar.f10014c) != null) {
                    o7.c cVar5 = (o7.c) obj2;
                    o7.c cVar6 = (o7.c) obj;
                    f0 f0Var = this.f4408e;
                    if (f0Var != null) {
                        f10 = f3;
                        o7.c cVar7 = (o7.c) f0Var.U(aVar.f10018g, aVar.f10019h.floatValue(), cVar5, cVar6, f10, d(), this.f4407d);
                        if (cVar7 != null) {
                            return cVar7;
                        }
                    } else {
                        f10 = f3;
                    }
                    float f11 = n7.g.f(cVar5.f10034a, cVar6.f10034a, f10);
                    float f12 = n7.g.f(cVar5.f10035b, cVar6.f10035b, f10);
                    cVar4.f10034a = f11;
                    cVar4.f10035b = f12;
                    return cVar4;
                }
                throw new IllegalStateException("Missing values for keyframe.");
        }
    }

    @Override // e7.e
    public /* bridge */ /* synthetic */ Object g(o7.a aVar, float f3, float f10, float f11) {
        switch (this.f4421i) {
            case 1:
                return l(aVar, f3, f10, f11);
            default:
                return super.g(aVar, f3, f10, f11);
        }
    }

    public PointF l(o7.a aVar, float f3, float f10, float f11) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.j;
        Object obj2 = aVar.f10013b;
        if (obj2 != null && (obj = aVar.f10014c) != null) {
            PointF pointF3 = (PointF) obj2;
            PointF pointF4 = (PointF) obj;
            f0 f0Var = this.f4408e;
            if (f0Var != null && (pointF = (PointF) f0Var.U(aVar.f10018g, aVar.f10019h.floatValue(), pointF3, pointF4, f3, d(), this.f4407d)) != null) {
                return pointF;
            }
            float f12 = pointF3.x;
            float f13 = h8.c.f(pointF4.x, f12, f10, f12);
            float f14 = pointF3.y;
            pointF2.set(f13, h8.c.f(pointF4.y, f14, f11, f14));
            return pointF2;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
