package ua;

import a2.e0;
import com.google.android.material.button.MaterialButton;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends c9.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f12994d;

    public h(int i6) {
        this.f12994d = i6;
    }

    @Override // c9.a
    public final float i(Object obj) {
        float[] fArr = ((i) obj).Z;
        if (fArr != null) {
            return fArr[this.f12994d];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // c9.a
    public final void u(Object obj, float f3) {
        i iVar = (i) obj;
        float[] fArr = iVar.Z;
        if (fArr != null) {
            int i6 = this.f12994d;
            if (fArr[i6] != f3) {
                fArr[i6] = f3;
                e0 e0Var = iVar.f12998b0;
                if (e0Var != null) {
                    float i10 = iVar.i();
                    MaterialButton materialButton = (MaterialButton) e0Var.f212y;
                    int i11 = (int) (i10 * 0.11f);
                    if (materialButton.U != i11) {
                        materialButton.U = i11;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                iVar.invalidateSelf();
            }
        }
    }
}
