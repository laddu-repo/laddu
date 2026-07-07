package o5;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9937a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Class cls, String str, int i6) {
        super(cls, str);
        this.f9937a = i6;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f9937a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(b0.f9938a.j((View) obj));
            case 6:
                return ((View) obj).getClipBounds();
            case 7:
                return Float.valueOf(((SwitchCompat) obj).W);
            case 8:
                return Float.valueOf(((pa.h) obj).f10669h);
            case 9:
                return Float.valueOf(((pa.h) obj).f10670i);
            case 10:
                return Float.valueOf(((pa.j) obj).f10683h);
            case 11:
                return Float.valueOf(((pa.j) obj).f10684i);
            case 12:
                return Float.valueOf(((pa.o) obj).b());
            case 13:
                return Float.valueOf(((pa.u) obj).f10728h);
            default:
                return Float.valueOf(((pa.w) obj).f10740i);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f9937a) {
            case 0:
                e eVar = (e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f9942a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.f9943b = round;
                int i6 = eVar.f9947f + 1;
                eVar.f9947f = i6;
                if (i6 == eVar.f9948g) {
                    b0.a(eVar.f9946e, eVar.f9942a, round, eVar.f9944c, eVar.f9945d);
                    eVar.f9947f = 0;
                    eVar.f9948g = 0;
                    return;
                }
                return;
            case 1:
                e eVar2 = (e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f9944c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                eVar2.f9945d = round2;
                int i10 = eVar2.f9948g + 1;
                eVar2.f9948g = i10;
                if (eVar2.f9947f == i10) {
                    b0.a(eVar2.f9946e, eVar2.f9942a, eVar2.f9943b, eVar2.f9944c, round2);
                    eVar2.f9947f = 0;
                    eVar2.f9948g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                b0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                b0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                b0.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 5:
                b0.f9938a.m((View) obj, ((Float) obj2).floatValue());
                return;
            case 6:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
            case 7:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
            case 8:
                pa.h hVar = (pa.h) obj;
                float floatValue = ((Float) obj2).floatValue();
                hVar.f10669h = floatValue;
                int i11 = (int) (floatValue * 5400.0f);
                l1.a aVar = hVar.f10666e;
                ArrayList arrayList = (ArrayList) hVar.f6269b;
                pa.p pVar = (pa.p) arrayList.get(0);
                float f3 = hVar.f10669h * 1520.0f;
                pVar.f10697a = (-20.0f) + f3;
                pVar.f10698b = f3;
                for (int i12 = 0; i12 < 4; i12++) {
                    pVar.f10698b = (aVar.getInterpolation(i.y.g(i11, pa.h.f10659k[i12], 667)) * 250.0f) + pVar.f10698b;
                    pVar.f10697a = (aVar.getInterpolation(i.y.g(i11, pa.h.f10660l[i12], 667)) * 250.0f) + pVar.f10697a;
                }
                float f10 = pVar.f10697a;
                float f11 = pVar.f10698b;
                pVar.f10697a = (((f11 - f10) * hVar.f10670i) + f10) / 360.0f;
                pVar.f10698b = f11 / 360.0f;
                int i13 = 0;
                while (true) {
                    if (i13 < 4) {
                        float g10 = i.y.g(i11, pa.h.f10661m[i13], 333);
                        if (g10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && g10 < 1.0f) {
                            int i14 = i13 + hVar.f10668g;
                            int[] iArr = hVar.f10667f.f10637e;
                            int length = i14 % iArr.length;
                            int length2 = (length + 1) % iArr.length;
                            int i15 = iArr[length];
                            int i16 = iArr[length2];
                            ((pa.p) arrayList.get(0)).f10699c = u9.b.a(aVar.getInterpolation(g10), Integer.valueOf(i15), Integer.valueOf(i16)).intValue();
                        } else {
                            i13++;
                        }
                    }
                }
                ((pa.s) hVar.f6268a).invalidateSelf();
                return;
            case 9:
                ((pa.h) obj).f10670i = ((Float) obj2).floatValue();
                return;
            case 10:
                pa.j jVar = (pa.j) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                jVar.f10683h = floatValue2;
                int i17 = (int) (floatValue2 * 6000.0f);
                TimeInterpolator timeInterpolator = jVar.f10680e;
                ArrayList arrayList2 = (ArrayList) jVar.f6269b;
                pa.p pVar2 = (pa.p) arrayList2.get(0);
                float f12 = jVar.f10683h * 1080.0f;
                int[] iArr2 = pa.j.f10674l;
                float f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                for (int i18 : iArr2) {
                    f13 += timeInterpolator.getInterpolation(i.y.g(i17, i18, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE)) * 90.0f;
                }
                pVar2.f10703g = f12 + f13;
                float interpolation = timeInterpolator.getInterpolation(i.y.g(i17, 0, 3000)) - timeInterpolator.getInterpolation(i.y.g(i17, 3000, 3000));
                pVar2.f10697a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float[] fArr = pa.j.f10675m;
                float q9 = a8.i.q(fArr[0], fArr[1], interpolation);
                pVar2.f10698b = q9;
                float f14 = jVar.f10684i;
                if (f14 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    pVar2.f10698b = (1.0f - f14) * q9;
                }
                int i19 = 0;
                while (true) {
                    if (i19 < iArr2.length) {
                        float g11 = i.y.g(i17, iArr2[i19], 100);
                        if (g11 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && g11 <= 1.0f) {
                            int i20 = i19 + jVar.f10682g;
                            int[] iArr3 = jVar.f10681f.f10637e;
                            int length3 = i20 % iArr3.length;
                            int length4 = (length3 + 1) % iArr3.length;
                            int i21 = iArr3[length3];
                            int i22 = iArr3[length4];
                            ((pa.p) arrayList2.get(0)).f10699c = u9.b.a(timeInterpolator.getInterpolation(g11), Integer.valueOf(i21), Integer.valueOf(i22)).intValue();
                        } else {
                            i19++;
                        }
                    }
                }
                ((pa.s) jVar.f6268a).invalidateSelf();
                return;
            case 11:
                ((pa.j) obj).f10684i = ((Float) obj2).floatValue();
                return;
            case 12:
                pa.o oVar = (pa.o) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                if (oVar.F != floatValue3) {
                    oVar.F = floatValue3;
                    oVar.invalidateSelf();
                    return;
                }
                return;
            case 13:
                pa.u uVar = (pa.u) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                uVar.f10728h = floatValue4;
                ArrayList arrayList3 = (ArrayList) uVar.f6269b;
                ((pa.p) arrayList3.get(0)).f10697a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float g12 = i.y.g((int) (floatValue4 * 333.0f), 0, 667);
                pa.p pVar3 = (pa.p) arrayList3.get(0);
                pa.p pVar4 = (pa.p) arrayList3.get(1);
                l1.a aVar2 = uVar.f10724d;
                float interpolation2 = aVar2.getInterpolation(g12);
                pVar4.f10697a = interpolation2;
                pVar3.f10698b = interpolation2;
                pa.p pVar5 = (pa.p) arrayList3.get(1);
                pa.p pVar6 = (pa.p) arrayList3.get(2);
                float interpolation3 = aVar2.getInterpolation(g12 + 0.49925038f);
                pVar6.f10697a = interpolation3;
                pVar5.f10698b = interpolation3;
                ((pa.p) arrayList3.get(2)).f10698b = 1.0f;
                if (uVar.f10727g && ((pa.p) arrayList3.get(1)).f10698b < 1.0f) {
                    ((pa.p) arrayList3.get(2)).f10699c = ((pa.p) arrayList3.get(1)).f10699c;
                    ((pa.p) arrayList3.get(1)).f10699c = ((pa.p) arrayList3.get(0)).f10699c;
                    ((pa.p) arrayList3.get(0)).f10699c = uVar.f10725e.f10637e[uVar.f10726f];
                    uVar.f10727g = false;
                }
                ((pa.s) uVar.f6268a).invalidateSelf();
                return;
            default:
                pa.w wVar = (pa.w) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                wVar.f10740i = floatValue5;
                int i23 = (int) (floatValue5 * 1800.0f);
                Interpolator[] interpolatorArr = wVar.f10736e;
                ArrayList arrayList4 = (ArrayList) wVar.f6269b;
                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                    pa.p pVar7 = (pa.p) arrayList4.get(i24);
                    int[] iArr4 = pa.w.f10732l;
                    int i25 = i24 * 2;
                    int i26 = iArr4[i25];
                    int[] iArr5 = pa.w.f10731k;
                    pVar7.f10697a = c9.a.a(interpolatorArr[i25].getInterpolation(i.y.g(i23, i26, iArr5[i25])), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    int i27 = i25 + 1;
                    pVar7.f10698b = c9.a.a(interpolatorArr[i27].getInterpolation(i.y.g(i23, iArr4[i27], iArr5[i27])), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                }
                if (wVar.f10739h) {
                    int size = arrayList4.size();
                    int i28 = 0;
                    while (i28 < size) {
                        Object obj3 = arrayList4.get(i28);
                        i28++;
                        ((pa.p) obj3).f10699c = wVar.f10737f.f10637e[wVar.f10738g];
                    }
                    wVar.f10739h = false;
                }
                ((pa.s) wVar.f6268a).invalidateSelf();
                return;
        }
    }
}
