package e7;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4412i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i6, List list) {
        super(list);
        this.f4412i = i6;
    }

    @Override // e7.e
    public final Object f(o7.a aVar, float f3) {
        int i6;
        int i10;
        Integer num;
        Object obj;
        float floatValue;
        g7.b bVar;
        switch (this.f4412i) {
            case 0:
                return Integer.valueOf(l(aVar, f3));
            case 1:
                Object obj2 = aVar.f10013b;
                if (obj2 != null) {
                    Object obj3 = aVar.f10014c;
                    if (obj3 == null) {
                        if (aVar.f10021k == 784923401) {
                            aVar.f10021k = ((Integer) obj2).intValue();
                        }
                        i6 = aVar.f10021k;
                    } else {
                        if (aVar.f10022l == 784923401) {
                            aVar.f10022l = ((Integer) obj3).intValue();
                        }
                        i6 = aVar.f10022l;
                    }
                    int i11 = i6;
                    f0 f0Var = this.f4408e;
                    if (f0Var != null && (num = (Integer) f0Var.U(aVar.f10018g, aVar.f10019h.floatValue(), (Integer) obj2, Integer.valueOf(i11), f3, d(), this.f4407d)) != null) {
                        i10 = num.intValue();
                    } else {
                        if (aVar.f10021k == 784923401) {
                            aVar.f10021k = ((Integer) obj2).intValue();
                        }
                        int i12 = aVar.f10021k;
                        PointF pointF = n7.g.f9099a;
                        i10 = (int) (((i11 - i12) * f3) + i12);
                    }
                    return Integer.valueOf(i10);
                }
                throw new IllegalStateException("Missing values for keyframe.");
            default:
                Object obj4 = aVar.f10013b;
                f0 f0Var2 = this.f4408e;
                if (f0Var2 != null) {
                    float f10 = aVar.f10018g;
                    Float f11 = aVar.f10019h;
                    if (f11 == null) {
                        floatValue = Float.MAX_VALUE;
                    } else {
                        floatValue = f11.floatValue();
                    }
                    g7.b bVar2 = (g7.b) obj4;
                    Object obj5 = aVar.f10014c;
                    if (obj5 == null) {
                        bVar = bVar2;
                    } else {
                        bVar = (g7.b) obj5;
                    }
                    return (g7.b) f0Var2.U(f10, floatValue, bVar2, bVar, f3, c(), this.f4407d);
                }
                if (f3 == 1.0f && (obj = aVar.f10014c) != null) {
                    return (g7.b) obj;
                }
                return (g7.b) obj4;
        }
    }

    public int l(o7.a aVar, float f3) {
        float f10;
        Float f11;
        Object obj = aVar.f10013b;
        Object obj2 = aVar.f10013b;
        if (obj != null && aVar.f10014c != null) {
            f0 f0Var = this.f4408e;
            if (f0Var != null && (f11 = aVar.f10019h) != null) {
                f10 = f3;
                Integer num = (Integer) f0Var.U(aVar.f10018g, f11.floatValue(), (Integer) obj2, (Integer) aVar.f10014c, f10, d(), this.f4407d);
                if (num != null) {
                    return num.intValue();
                }
            } else {
                f10 = f3;
            }
            return a8.g.i(n7.g.b(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), ((Integer) obj2).intValue(), ((Integer) aVar.f10014c).intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
