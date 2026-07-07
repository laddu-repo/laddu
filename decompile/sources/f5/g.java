package f5;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import androidx.media3.decoder.DecoderInputBuffer;
import p4.v;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5238b;

    public g(int i) {
        this.f5237a = i;
        switch (i) {
            case 1:
                this.f5238b = new FloatEvaluator();
                break;
        }
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        switch (this.f5237a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                l0.e[] eVarArr = (l0.e[]) obj;
                l0.e[] eVarArr2 = (l0.e[]) obj2;
                if (!v.g(eVarArr, eVarArr2)) {
                    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                }
                if (!v.g((l0.e[]) this.f5238b, eVarArr)) {
                    this.f5238b = v.w(eVarArr);
                }
                for (int i = 0; i < eVarArr.length; i++) {
                    l0.e eVar = ((l0.e[]) this.f5238b)[i];
                    l0.e eVar2 = eVarArr[i];
                    l0.e eVar3 = eVarArr2[i];
                    eVar.getClass();
                    eVar.f8000a = eVar2.f8000a;
                    int i10 = 0;
                    while (true) {
                        float[] fArr = eVar2.f8001b;
                        if (i10 < fArr.length) {
                            eVar.f8001b[i10] = (eVar3.f8001b[i10] * f) + ((1.0f - f) * fArr[i10]);
                            i10++;
                        }
                    }
                }
                return (l0.e[]) this.f5238b;
            default:
                float fFloatValue = ((FloatEvaluator) this.f5238b).evaluate(f, (Number) obj, (Number) obj2).floatValue();
                if (fFloatValue < 0.1f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue);
        }
    }
}
