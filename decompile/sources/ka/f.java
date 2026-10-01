package ka;

import a8.i;
import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7778a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7779b;

    public f(int i6) {
        this.f7778a = i6;
        switch (i6) {
            case 1:
                return;
            default:
                this.f7779b = new FloatEvaluator();
                return;
        }
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f3, Object obj, Object obj2) {
        switch (this.f7778a) {
            case 0:
                float floatValue = ((FloatEvaluator) this.f7779b).evaluate(f3, (Number) obj, (Number) obj2).floatValue();
                if (floatValue < 0.1f) {
                    floatValue = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                return Float.valueOf(floatValue);
            default:
                l0.e[] eVarArr = (l0.e[]) obj;
                l0.e[] eVarArr2 = (l0.e[]) obj2;
                if (i.a(eVarArr, eVarArr2)) {
                    if (!i.a((l0.e[]) this.f7779b, eVarArr)) {
                        this.f7779b = i.g(eVarArr);
                    }
                    for (int i6 = 0; i6 < eVarArr.length; i6++) {
                        l0.e eVar = ((l0.e[]) this.f7779b)[i6];
                        l0.e eVar2 = eVarArr[i6];
                        l0.e eVar3 = eVarArr2[i6];
                        eVar.getClass();
                        eVar.f8067a = eVar2.f8067a;
                        int i10 = 0;
                        while (true) {
                            float[] fArr = eVar2.f8068b;
                            if (i10 < fArr.length) {
                                eVar.f8068b[i10] = (eVar3.f8068b[i10] * f3) + ((1.0f - f3) * fArr[i10]);
                                i10++;
                            }
                        }
                    }
                    return (l0.e[]) this.f7779b;
                }
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }
}
